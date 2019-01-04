SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=10;md5=d41d8cd98f00b204e9800998ecf8427e"

DEPENDS = "roscpp"

SRC_URI = " \
        https://github.com/painterlake/ros-hello-world/archive/master.tar.gz;downloadfilename=ros-hello-world-master.tar.gz; \
        file://0001-install-the-binary-to-filesystem.patch;patchdir=.. \
"

SRC_URI[md5sum] = "c3fd82f42338864d6e58de5ebf32851d"
SRC_URI[sha256sum] = "74317f5ddb387dc4f7aa54f2416f3832ff59d3046ff0b339fe93b10ca4744f5b"

S = "${WORKDIR}/ros-hello-world-master/hello_world"

inherit catkin
