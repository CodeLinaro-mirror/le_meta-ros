DESCRIPTION = "ros2-foxy package group"
LICENSE = "BSD-3-Clause"

inherit packagegroup

PACKAGES = "\
        ${PN} \
        ${PN}-samples \
"

RDEPENDS:${PN} = "\
        ros-base \
        rplidar-ros \
        ${PN}-samples \
        graphviz \
"

RDEPENDS:${PN}-samples = "\
        demo-nodes-cpp \
        example-interfaces \
        logging-demo \
        composition \
        examples-rclcpp-minimal-action-server \
        action-tutorials-cpp \
"
