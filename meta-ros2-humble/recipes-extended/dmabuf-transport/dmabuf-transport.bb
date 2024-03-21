inherit ros_distro_humble
inherit ros_component

DESCRIPTION = "Linux DMA Buf Type Adaption for ROS"
AUTHOR = "Peng Wang <quic_penwang@quicinc.com>"
ROS_AUTHOR = "Peng Wang"
SECTION = "devel"
LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=52ca38c4529ed91857909f376825b021"

ROS_CN = "dmabuf_transport"
ROS_BPN = "dmabuf_transport"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI  +=  "git://git.codelinaro.org/clo/le/platform/vendor/qcom-opensource/ros.git;protocol=https;rev=ffc7b84ae7309994d6622a551646abfaed36448d;branch=ros.qclinux.1.0.r1-rel"
S         =  "${WORKDIR}/git/dmabuf_transport"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

RM_WORK_EXCLUDE += "${PN}"
