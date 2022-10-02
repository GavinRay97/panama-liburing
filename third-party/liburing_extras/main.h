#include <liburing.h>

struct file_info {
    long int file_sz;
    struct iovec iovecs[];
};
