DESCRIPTION = "ros2-foxy package group"
LICENSE = "BSD-3-Clause"

inherit packagegroup
PACKAGE_ARCH = "${MACHINE_ARCH}"

PACKAGES = "\
        ${PN} \
        ${PN}-samples \
        ${PN}-navigation \
        ${PN}-turtlebot3 \
"

RDEPENDS:${PN} = "\
        ros-base \
        rplidar-ros \
        ${PN}-samples \
	graphviz \
        ${PN}-navigation \
        ${PN}-turtlebot3 \
"

RDEPENDS:${PN}-navigation = "\
        rplidar-ros \
        navigation2 \
        nav2-bringup \
        rcl-logging-noop \
        cartographer \
        cartographer-ros \
        cartographer-ros-msgs \
"

RDEPENDS:${PN}-samples = "\
        demo-nodes-cpp \
        example-interfaces \
        logging-demo \
        composition \
        examples-rclcpp-minimal-action-server \
"

RDEPENDS:${PN}-turtlebot3 = "\
        turtlebot3 \
        turtlebot3-bringup \
        turtlebot3-cartographer \
        turtlebot3-description \
        turtlebot3-example \
        turtlebot3-navigation2 \
        turtlebot3-node \
        turtlebot3-teleop \
        python3-terminal \
"
