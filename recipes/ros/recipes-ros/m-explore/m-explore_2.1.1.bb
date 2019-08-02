DESCRIPTION = "Lightweight frontier-based exploration"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs roscpp pcl costmap-2d actionlib move-base-msgs visualization-msgs tf"

ROS_SPN = "m-explore"
SRC_URI = "https://github.com/hrnr/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "10acead4a1bcc5545a5ffbe179433b04"
SRC_URI[sha256sum] = "1ac210cf5f88bddef6656b0f879d8c91e4cb25ce22d2a522d818e9ed2cf73ae9"

S = "${WORKDIR}/${ROS_SP}/explore"

inherit catkin

RRECOMMENDS_${PN} = "costmap-2d actionlib move-base tf"

PACKAGES = "${PN}"
FILES_${PN} = "/opt/ros/*"
INSANE_SKIP_${PN} = "debug-files"
