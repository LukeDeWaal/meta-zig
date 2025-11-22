include zig-common.inc

# Zig 0.13 is the highest supported by llvm 18
# This requires meta-clang scarthgap branch

PV = "0.13.0"
SRCREV = "cf90dfd3098bef5b3c22d5ab026173b3c357f2dd"

SRC_URI = "git://github.com/ziglang/zig.git;branch=master;protocol=https"

LIC_FILES_CHKSUM = "file://LICENSE;md5=d934d7758eb646c9c6a2162d88427689 \
                    file://lib/libc/glibc/LICENSES;md5=f77e878d320e99e94ae9a4aea7f491d1 \
                    file://lib/libc/mingw/COPYING;md5=bb936f0e04d8f1e19ad545100cee9654 \
                    file://lib/libc/musl/COPYRIGHT;md5=b03f1cc25363d094011f8f4fd8bcfb68 \
                    file://lib/libc/wasi/LICENSE;md5=234aa41af73fce9d38421795d4641dfc \
                    file://lib/libc/wasi/LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
                    file://lib/libc/wasi/LICENSE-APACHE-LLVM;md5=a1ba2b4c4f909ac0b517d8a37d2ac70f \
                    file://lib/libc/wasi/LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
                    file://lib/libc/wasi/libc-bottom-half/cloudlibc/LICENSE;md5=dfa4a358398d1a4cec792f994c787415 \
                    file://lib/libc/wasi/libc-top-half/musl/COPYRIGHT;md5=b03f1cc25363d094011f8f4fd8bcfb68 \
                    file://lib/libcxx/LICENSE.TXT;md5=55d89dd7eec8d3b4204b680e27da3953 \
                    file://lib/libcxxabi/LICENSE.TXT;md5=7b9334635b542c56868400a46b272b1e \
                    file://lib/libunwind/LICENSE.TXT;md5=f66970035d12f196030658b11725e1a1"
