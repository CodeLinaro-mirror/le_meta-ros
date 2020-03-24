DESCRIPTION = "Parallelism library for C++ - runtime files \
    TBB is a library that helps you leverage multi-core processor \
    performance without having to be a threading expert. It represents a \
    higher-level, task-based parallelism that abstracts platform details \
    and threading mechanism for performance and scalability."
HOMEPAGE = "http://threadingbuildingblocks.org/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRCREV = "ab775e45cbda7115de05fa5465321f6324b2ac6c"
SRC_URI = "git://github.com/oneapi-src/oneTBB.git;branch=tbb_2019 \
	   file://0001-cross-compile-arm-cores.patch \
           file://tbb.pc"

S = "${WORKDIR}/git/"

SRC_URI[md5sum] = "3a01baa7ab91d0741aafc16406fd3366"
SRC_URI[sha256sum] = "a60055ae7d6d3adfadfef0435e6a999b5b9954d14e0e3202e3fcb19fe2a30cdb"

python do_getpatches() {
    import os
    newdir = d.getVar('THISDIR') + "/tbb"
    bb.utils.mkdirhier(newdir)

    cmd = "cd %s \
    && (wget -c https://raw.githubusercontent.com/painterlake/meta-openembedded-my/master/meta-oe/recipes-support/tbb/tbb/tbb.pc || pwd)" % (newdir)

    os.system(cmd)
}

addtask getpatches before do_fetch

do_compile() {
    oe_runmake compiler=gcc arch=${HOST_ARCH} runtime=cc4
}

do_install() {
    install -d ${D}${includedir} ${D}${libdir}/pkgconfig
    rm ${S}/include/tbb/index.html -f
    cp -R --no-dereference --preserve=mode,links -v ${S}/include/tbb ${D}${includedir}
    install -m 0755 ${B}/build/linux_*_release/lib*.so* ${D}${libdir}
    install -m 0644 ${WORKDIR}/tbb.pc ${D}${libdir}/pkgconfig
}

# fails with thumb enabled:
# | arm-oe-linux-gnueabi-g++  -march=armv7-a -mthumb -mthumb-interwork -mfloat-abi=softfp -mfpu=neon -mtune=cortex-a9 -mcpu=cortex-a9 -D__ARM__ -D__LINUX_ARM_ARCH__=7 -funwind-tables -mvectorize-with-neon-quad -rdynamic --sysroot=/OE/sysroots/m14tv -c -MMD -DTBB_USE_DEBUG  -g -O0 -DUSE_PTHREAD -fPIC -D__TBB_BUILD=1 -Wall -Wno-parentheses -Wno-non-virtual-dtor -O2 -pipe -g -feliminate-unused-debug-types -fpermissive -fvisibility-inlines-hidden   -I../../src -I../../src/rml/include -I../../include ../../src/tbb/concurrent_queue.cpp
# | {standard input}: Assembler messages:
# | {standard input}:250: Error: thumb conditional instruction should be in IT block -- `strexeq r2,r3,[r4]'
# ...
# | make[1]: *** [concurrent_queue.o] Error 1
ARM_INSTRUCTION_SET = "arm"
