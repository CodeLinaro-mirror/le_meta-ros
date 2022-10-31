DESCRIPTION = "ros2-foxy package group"
LICENSE = "BSD-3-Clause"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
		ros-base \
		kobuki-core \
		kobuki-firmware \
		kobuki-ros \
		kobuki-ros-interfaces \
		rplidar-ros \
		navigation2 \
"
