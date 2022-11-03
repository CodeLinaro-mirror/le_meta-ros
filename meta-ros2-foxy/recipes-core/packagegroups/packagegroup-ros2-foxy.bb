DESCRIPTION = "ros2-foxy package group"
LICENSE = "BSD-3-Clause"

inherit packagegroup

PACKAGES = "\
	${PN} \
	${PN}-kobuki \
	${PN}-navigation \
	${PN}-samples \
"

RDEPENDS_${PN} = "\
	ros-base \
	${PN}-kobuki \
	${PN}-navigation \
	${PN}-samples \
"
RDEPENDS_${PN}-kobuki = "\
	kobuki-core \
	kobuki-firmware \
	kobuki-ros \
	kobuki-ros-interfaces \
"
RDEPENDS_${PN}-navigation = "\
	rplidar-ros \
	navigation2 \
"
RDEPENDS_${PN}-samples = "\
	demo-nodes-cpp \
	example-interfaces \
	logging-demo \
	composition \
	examples-rclcpp-minimal-action-server \
"
