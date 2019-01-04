HOMEPAGE = "https://github.com/ros2/ros2cli"
SUMMARY = "The multicast command for ROS 2 command line tools"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

SRCREV = "451bb5268daabc77a2808e12898192a48c07ef07"
SRC_URI = " \
	git://github.com/ros2/ros2cli.git;protocol=git; \
	file://0001-remove-extra-parameter.patch;patchdir=.. \
"

ROS_BPN ?= "${@d.getVar('PN', True).replace('lib32-', '')}"
S = "${WORKDIR}/git/${ROS_BPN}"

inherit setuptools3
