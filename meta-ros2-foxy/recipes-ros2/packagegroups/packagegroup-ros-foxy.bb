DESCRIPTION = "ros2 foxy package group"
LICENSE = "BSD-3-Clause"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
	rclcpp \
	rcutils \
	yaml-cpp \
	rcl \
	rcl-interfaces \
	rcl-yaml-param-parser \
	rosgraph-msgs \
	nav-msgs \
	std-msgs \
	message-filters \
	ament-index-cpp \
	image-transport \
	class-loader   \
	rmw \
	rmw-implementation \
	rosidl-generator-c \
	rosidl-typesupport-introspection-c \
	rosidl-typesupport-introspection-cpp \
	console-bridge \
	sensor-msgs \
	builtin-interfaces \
	cv-bridge \
	"
