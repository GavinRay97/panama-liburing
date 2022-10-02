cmake_minimum_required(VERSION 3.23)
project(panama_liburing)

set(CMAKE_VERBOSE_MAKEFILE ON)

set(CMAKE_C_STANDARD 23)
set(CMAKE_CXX_STANDARD 23)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

include(ExternalProject)

#######################
# liburing (io_uring)
MESSAGE("Downloading io_uring")
ExternalProject_Add(
        liburing_git
        GIT_REPOSITORY http://github.com/axboe/liburing.git
        GIT_TAG liburing-2.2
        BUILD_IN_SOURCE 1
        BUILD_BYPRODUCTS "<SOURCE_DIR>/src/liburing.a"
        BUILD_COMMAND make "CC=${CMAKE_C_COMPILER}" "CXX=${CMAKE_CXX_COMPILER}" "AR=${CMAKE_AR}" "RANLIB=${CMAKE_RANLIB}"
        CONFIGURE_COMMAND ""
        INSTALL_COMMAND ""
        TEST_COMMAND ""
        LOG_BUILD ON
)
ExternalProject_Get_Property(liburing_git SOURCE_DIR)
add_library(liburing INTERFACE)
add_dependencies(liburing liburing_git)
target_include_directories(liburing INTERFACE ${SOURCE_DIR}/src/include)
target_link_libraries(liburing INTERFACE ${SOURCE_DIR}/src/liburing.a)
#######################

#######################
# liburing_extras (the static inline functions from liburing)
add_library(liburing_extras SHARED liburing_extras/main.c)
target_link_libraries(liburing_extras liburing)
# "-DLIBURING_INTERNAL" prevents a duplicate definition of "io_get_sqe" from being included
target_compile_definitions(liburing_extras PRIVATE -DLIBURING_INTERNAL)
add_dependencies(liburing_extras liburing)
# Get rid of the duplicated "lib" prefix
SET_TARGET_PROPERTIES(liburing_extras PROPERTIES PREFIX "")
#######################

