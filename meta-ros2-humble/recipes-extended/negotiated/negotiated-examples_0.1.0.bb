inherit ros_distro_humble
inherit ros_component

DESCRIPTION = "Examples for negotiated publishers/subscriptions"
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "https://github.com/osrf/negotiated"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "negotiated_examples"
ROS_BPN = "negotiated_examples"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    negotiated \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    negotiated \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    launch \
    launch-ros \
"

ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "git://github.com/osrf/negotiated;branch=master;protocol=https"
SRCREV = "eac198b55dcd052af5988f0f174902913c5f20e7"
S = "${WORKDIR}/git/negotiated_examples"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
