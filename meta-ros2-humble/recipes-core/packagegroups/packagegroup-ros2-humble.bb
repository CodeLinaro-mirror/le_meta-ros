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
    ${PN}-samples \
    graphviz \
    rosidl-default-generators \
    nav2-msgs \
    ament-lint-auto \
    ament-lint-common \
    ament-cmake-auto \
    ament-cmake-ros \
    rcl-logging-noop \
    image-transport \
    negotiated \
    negotiated-interfaces \
    cv-bridge \
    cartographer \
    domain-bridge \
"

RDEPENDS:${PN}-samples = "\
    demo-nodes-cpp \
    example-interfaces \
    logging-demo \
    composition \
    examples-rclcpp-minimal-action-server \
    action-tutorials-cpp \
    examples-rclcpp-minimal-publisher \
    examples-rclcpp-minimal-subscriber \
    negotiated-examples \
    examples-rclpy-minimal-subscriber \
    examples-rclpy-minimal-publisher \
    examples-rclpy-minimal-action-server \
    examples-rclpy-minimal-action-client \
    demo-nodes-py \
    action-tutorials-py \
"
