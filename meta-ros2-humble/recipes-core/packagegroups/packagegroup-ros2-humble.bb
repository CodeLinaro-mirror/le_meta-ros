DESCRIPTION = "ros2-humble package group"
LICENSE = "BSD-3-Clause"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"
PACKAGES = "\
    ${PN} \
    ${PN}-samples \
"

RDEPENDS:${PN} = "\
    ros-base \
    rplidar-ros \
    ${PN}-samples \
"

RDEPENDS:${PN}-samples = "\
    demo-nodes-cpp \
    example-interfaces \
    logging-demo \
    composition \
    examples-rclcpp-minimal-action-server \
    action-tutorials-cpp \
"
