inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "ROS2 message, service and action interfaces for the Kobuki."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kobuki_ros_interfaces"
ROS_BPN = "kobuki_ros_interfaces"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    rosidl-default-generators \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    rosidl-default-runtime \
    std-msgs \
"

ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

export PYTHONPATH = "${RECIPE_SYSROOT}${PYTHON_SITEPACKAGES_DIR}"

ROS_BRANCH ?= "branch=release/eloquent/kobuki_ros_interfaces"
SRC_URI = "git://github.com/stonier/kobuki_ros_interfaces-release;${ROS_BRANCH};protocol=https"
SRCREV = "2d347cb4f290ad0d62dcaa2f1c3b0700a58f43b9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
