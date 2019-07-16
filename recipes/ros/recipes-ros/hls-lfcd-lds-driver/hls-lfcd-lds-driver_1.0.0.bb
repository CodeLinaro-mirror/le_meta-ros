DESCRIPTION = "ROS package for LDS(HLS-LFCD2)."
SECTION = "devel"
LICENSE = "BSD"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD;md5=3775480a712fc46a69647678acb234cb"
DEPENDS = "roscpp std-msgs sensor-msgs boost"

SRC_URI = "https://github.com/ROBOTIS-GIT/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
S = "${WORKDIR}/${ROS_SP}"

SRC_URI[md5sum] = "34045e023f5723e8533a0d1589cd93bb"
SRC_URI[sha256sum] = "e1756c1362572e7c162f53924a3cc1f1f53e294451b12f7b922b74d79bfc705b"

inherit catkin

