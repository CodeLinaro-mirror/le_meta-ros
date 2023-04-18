inherit ros_distro_humble
inherit ros_component

DESCRIPTION = "A package containing a negotiating publisher and subscription."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "https://github.com/osrf/negotiated"
SECTION = "devel"
LICENSE = "Apache-2.0 & Boost"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=9;md5=5133e6757f315cf18880f5d3eb829a40"

ROS_CN = "negotiated"
ROS_BPN = "negotiated"

ROS_BUILD_DEPENDS = " \
    negotiated-interfaces \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    negotiated-interfaces \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    negotiated-interfaces \
    rclcpp \
"

ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    ament-cmake-gtest \
    std-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "git://github.com/osrf/negotiated;branch=master;protocol=https"
SRCREV = "eac198b55dcd052af5988f0f174902913c5f20e7"
S = "${WORKDIR}/git/negotiated"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
