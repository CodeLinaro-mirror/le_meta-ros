inherit ros_distro_foxy
inherit ros_component

DESCRIPTION = "RealSense Camera package allowing access to Intel SR300, D400 and L500 3D cameras"
AUTHOR = "Doron Hirshberg <doron.hirshberg@intel.com>"
ROS_AUTHOR = "Sergey Dorodnicov <sergey.dorodnicov@intel.com>"
HOMEPAGE = "http://www.ros.org/wiki/RealSense"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "realsense2_camera"
ROS_BPN = "realsense2_camera"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    cv-bridge \
    geometry-msgs \
    image-transport \
    libeigen \
    librealsense2 \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    realsense2-camera-msgs \
    ros-environment \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
    rosidl-adapter \
    diagnostic-updater \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    cv-bridge \
    geometry-msgs \
    image-transport \
    libeigen \
    librealsense2 \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    realsense2-camera-msgs \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
    rosidl-adapter \
    diagnostic-updater \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    cv-bridge \
    geometry-msgs \
    image-transport \
    launch-ros \
    libeigen \
    librealsense2 \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    realsense2-camera-msgs \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
    rosidl-adapter \
    diagnostic-updater \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    opencv \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/IntelRealSense/realsense-ros-release/archive/release/foxy/realsense2_camera/3.2.2-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/realsense2_camera"
SRC_URI = "git://github.com/IntelRealSense/realsense-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "1df3e57265c2c1da76fc8770adfd29a09c734b05"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
