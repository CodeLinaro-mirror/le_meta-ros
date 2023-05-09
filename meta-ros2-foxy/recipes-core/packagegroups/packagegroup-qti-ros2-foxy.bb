DESCRIPTION = "ros2-foxy package group"
LICENSE = "BSD-3-Clause"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"
PACKAGES = "\
    ${PN} \
    ${PN}-samples \
"

RDEPENDS:${PN} = "\
    ros-base \
    ${PN}-samples \
"

RDEPENDS:${PN}-samples = "\
    rplidar-ros2 \
    realsense2-camera \
    realsense2-description \
    realsense2-camera-msgs \
    demo-nodes-cpp \
    example-interfaces \
    logging-demo \
    composition \
    examples-rclcpp-minimal-action-server \
    action-tutorials-cpp \
    examples-rclcpp-minimal-publisher \
    examples-rclcpp-minimal-subscriber \
"
