DESCRIPTION = "RRT-based map exploration"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "geometry-msgs roscpp rospy costmap-2d actionlib move-base-msgs visualization-msgs tf"

SRC_URI = "git://github.com/hasauino/rrt_exploration.git;branch=indigo-devel"
SRCREV = "indigo-devel"
SRC_URI[md5sum] = "04d0a7fb7ebe0ba1e371aed05fe92dcb"
SRC_URI[sha256sum] = "7b8392968027b3cd04049ac04ebd7c174209876faceb45e483de235de53ea9b3"
S = "${WORKDIR}/git"

inherit catkin

RRECOMMENDS_${PN} = "costmap-2d actionlib move-base tf"

do_install_append() {
    dest=/opt/ros/indigo
    install -d ${D}${dest}/lib/rrt_exploration
    install -m 755 ${WORKDIR}/build/devel/lib/rrt_exploration/* ${D}/opt/ros/indigo/lib/rrt_exploration
}


FILES_${PN} = "/opt/ros/indigo/*"
INSANE_SKIP_${PN} = "debug-files rpaths"
