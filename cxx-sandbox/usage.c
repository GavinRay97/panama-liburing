#include "liburing.h"
#include <linux/io_uring.h>
#include <stdio.h>
#include <string.h>

struct MyStruct {
    int a;
    int b;
};

int main(int argc, char* argv[])
{
    struct io_uring ring;
    int ret;

    ret = io_uring_queue_init(8, &ring, 0);
    if (ret < 0) {
        printf("queue_init:  %s (%d)", strerror(-ret), ret);
        return 1;
    }

    struct io_uring_sqe* sqe = io_uring_get_sqe(&ring);
    if (!sqe) {
        printf("get_sqe failed");
        return 1;
    }

    io_uring_prep_nop(sqe);

    struct MyStruct myStruct = {
        .a = 1, .b = 2
    };
    io_uring_sqe_set_data(sqe, &myStruct);

    ret = io_uring_submit(&ring);
    if (ret < 0) {
        printf("submit:  %s (%d)", strerror(-ret), ret);
        return 1;
    }

    struct io_uring_cqe* cqes[1];
    ret = io_uring_wait_cqe(&ring, cqes);
    if (ret < 0) {
        printf("wait_cqe:  %s (%d)", strerror(-ret), ret);
        return 1;
    }

    printf("cqe->user_data: %d %d; expected: %d %d",
        ((struct MyStruct*)cqes[0]->user_data)->a,
        ((struct MyStruct*)cqes[0]->user_data)->b,
        myStruct.a, myStruct.b);

    io_uring_cqe_seen(&ring, cqes[0]);

    io_uring_queue_exit(&ring);
    return 0;
}
