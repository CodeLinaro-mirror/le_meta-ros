SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1d8e2cb23e62533905f8468f68021c11"

SRC_URI = " \
    https://github.com/stonier/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz \
    file://0001-remove-CTest.patch; \
"

SRC_URI[md5sum] = "71a53235fc83fbb7535afceb5ad7f48b"
SRC_URI[sha256sum] = "950ee5bc8b1c867f7a02fc5fdf2e9498ba5bfb1e3df46da1277663fc14af4dd6"

inherit ament
ROS_SPN = "sophus"
S = "${WORKDIR}/${ROS_SP}/"

DEPENDS += "libeigen"

