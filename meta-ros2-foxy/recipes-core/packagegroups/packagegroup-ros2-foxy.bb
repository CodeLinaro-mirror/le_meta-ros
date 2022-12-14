DESCRIPTION = "ros2-foxy package group"
LICENSE = "BSD-3-Clause"

inherit packagegroup

PACKAGES = "\
	${PN} \
	${PN}-kobuki \
	${PN}-navigation \
	${PN}-samples \
	${PN}-turtlebot3 \
"

RDEPENDS_${PN} = "\
	ros-base \
	${PN}-kobuki \
	${PN}-navigation \
	${PN}-samples \
	${PN}-turtlebot3 \
"
RDEPENDS_${PN}-kobuki = "\
	kobuki-core \
	kobuki-firmware \
	kobuki-ros \
	kobuki-ros-interfaces \
	kobuki-keyop \
	kobuki-node \
"
RDEPENDS_${PN}-navigation = "\
	rplidar-ros \
	navigation2 \
	nav2-bringup \
	rcl-logging-noop \
	console-bridge \
	cv-bridge \
	libtinyxml2-dev \
	libyaml-dev \
	cartographer \
	cartographer-ros \
	cartographer-ros-msgs \
	depthimage-to-laserscan \
"
RDEPENDS_${PN}-samples = "\
	demo-nodes-cpp \
	example-interfaces \
	logging-demo \
	composition \
	examples-rclcpp-minimal-action-server \
"
RDEPENDS_${PN}-turtlebot3 = "\
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
