SUMMARY = "ziglang"
DESCRIPTION = "General-purpose programming language and toolchain for maintaining robust, optimal, and reusable software."

LICENSE = "MIT & Apache-2.0 & ZPL-2.1"

S = "${WORKDIR}/git"
B = "${S}/build"

TOOLCHAIN = "clang"
DEPENDS = "clang-native"

inherit cmake
EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release"
OECMAKE_GENERATOR = "Unix Makefiles"

BBCLASSEXTEND = "native"

do_compile() {
    make install
}
