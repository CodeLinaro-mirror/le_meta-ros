DESCRIPTION = "ROS package for YDLIDAR."
SECTION = "devel"
LICENSE = "BSD-2-Clause"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD;md5=3775480a712fc46a69647678acb234cb"
DEPENDS = "roscpp rosconsole sensor-msgs"

SRC_URI = "https://github.com/YDLIDAR/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
S = "${WORKDIR}/${ROS_SP}"

INSANE_SKIP_${PN} += "file-rdeps" 

SRC_URI[md5sum] = "72fc730f02a6163b213d4ad42a53f679"
SRC_URI[sha256sum] = "5a58fcdd049641b971e0f8fd30b2eb24f1ebf3ef6a3ac9d0f60db3003c36db52"

inherit catkin

