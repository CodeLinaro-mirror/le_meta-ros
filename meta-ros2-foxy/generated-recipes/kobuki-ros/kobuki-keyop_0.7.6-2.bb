inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = " Keyboard teleoperation for Kobuki: relays commands from a keyboard to Kobuki."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kobuki_ros"
ROS_BPN = "kobuki_keyop"

ROS_BUILD_DEPENDS = " \
  ecl-build \
  geometry-msgs \
  rclcpp \
  rclcpp-components \
  kobuki-ros-interfaces \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-libraries \
    ament-cmake-export-definitions \
    ament-cmake \
    ament-cmake-ros \
    ament-cmake-core \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-cmake-test \
    ament-cmake-export-dependencies \
    ament-cmake-export-include-directories \
    ament-cmake-export-interfaces \
    ament-cmake-export-libraries \
    ament-cmake-export-link-flags \
    ament-cmake-export-targets \
    ament-cmake-python \
    ament-cmake-target-dependencies \
    ament-cmake-version \
    ament-cmake-include-directories \
    ament-package \
    python3-catkin-pkg \
    python3-pyparsing \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
  geometry-msgs \
  rclcpp \
  rclcpp-components \
  rcl-interfaces \
  kobuki-ros-interfaces \
"
ROS_TEST_DEPENDS = ""

export PYTHONPATH = "${RECIPE_SYSROOT}${PYTHON_SITEPACKAGES_DIR}"
DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH ?= "branch=devel"
SRC_URI = "git://github.com/kobuki-base/kobuki_ros;${ROS_BRANCH};protocol=https"
SRC_URI += "file://0001-Kobuki_keyop-Update-publisher-name.patch"
SRCREV = "7d0b5bd2fa16cb05673d7ed16318da5e50b1e4d1"
S = "${WORKDIR}/git/kobuki_keyop"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
