SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/\
${LICENSE};md5=3775480a712fc46a69647678acb234cb"

FILESPATH =+ "${WORKSPACE}/vendor/qcom/opensource/ros:"
SRC_URI = "file://kobuki_ros"

DEPENDS += " \
    ament-cmake \
    rclcpp \
    kobuki-driver \
    kobuki-msgs \
    ros2-std-msgs \
    ros2-geometry-msgs \
    ros2-nav-msgs tf2-ros \
    ros2-sensor-msgs \
    builtin-interfaces \
    tf2 \
"

inherit ament

S = "${WORKDIR}/kobuki_ros"

