DESCRIPTION = "ROS package for LDS(HLS-LFCD2)."
SECTION = "devel"
LICENSE = "BSD"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD;md5=3775480a712fc46a69647678acb234cb"
DEPENDS = "roscpp rosconsole sensor-msgs std-srvs"

SRC_URI = "https://github.com/robopeak/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
S = "${WORKDIR}/${ROS_SP}"

SRC_URI[md5sum] = "752b85bd59986dc477b5684b819335cc"
SRC_URI[sha256sum] = "fbcaa51a56039f7dea61f80181ad7b6f6d85a0cb080b54f131068479cb791320"

inherit catkin

