inherit ros_distro_humble
inherit ros_component

DESCRIPTION = "Linux DMA Buf Type Adaption for ROS"
AUTHOR = "Peng Wang <quic_penwang@quicinc.com>"
ROS_AUTHOR = "Peng Wang"
SECTION = "devel"
LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

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

FILESPATH =+ "${WORKSPACE}/robotics/ros:"
SRC_URI   =  "file://dmabuf_transport"
S         =  "${WORKDIR}/dmabuf_transport"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

RM_WORK_EXCLUDE += "${PN}"
