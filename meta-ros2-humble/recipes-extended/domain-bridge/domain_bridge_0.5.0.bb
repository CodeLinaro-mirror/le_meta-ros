inherit ros_distro_humble
inherit ros_component

DESCRIPTION = "A package containing a domain bridge."
HOMEPAGE = "https://github.com/ros2/domain_bridge"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5133e6757f315cf18880f5d3eb829a40"

ROS_CN = "domain-bridge"
ROS_BPN = "domain-bridge"

ROS_BUILD_DEPENDS = " \
    rclcpp_components \
    rclcpp \
    rcutils \
    rosbag2_cpp \
    rosidl_typesupport_cpp \
    yaml-cpp \
    zstd_vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl_default_generators \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp_components \
    rclcpp \
    rcutils \
    rosbag2_cpp \
    rosidl_typesupport_cpp \
    yaml-cpp \
    zstd_vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl_default_runtime \
    rclcpp \
"

ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-cmake-gmock \
    ament-lint-common \
    example-interfaces \
    launch \
    launch-testing \
    launch-testing-ament-cmake \
    rmw-implementation-cmake \
    test-msgs \
    rosgraph-msgs \
    rmw-fastrtps-cpp \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "git://github.com/ros2/domain_bridge;branch=humble;protocol=https"
SRCREV = "f4311f668a1da12545db3e1e37a593ca847d0110"
S = "${WORKDIR}/git/"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
