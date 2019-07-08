DESCRIPTION = "ROS package for YDLIDAR."
SECTION = "devel"
LICENSE = "BSD-2-Clause"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD;md5=3775480a712fc46a69647678acb234cb"
DEPENDS = "roscpp rosconsole sensor-msgs"

SRC_URI = "https://github.com/YDLIDAR/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
S = "${WORKDIR}/${ROS_SP}"

INSANE_SKIP_${PN} += "file-rdeps" 

SRC_URI[md5sum] = "981ea5494f0bbfe2ce6673d8ddd3d9fd"
SRC_URI[sha256sum] = "c72fd508dbffe3e0764af6d425a9bc7e5f04cc3a51003a07b52e22f6a92aca76"

inherit catkin

