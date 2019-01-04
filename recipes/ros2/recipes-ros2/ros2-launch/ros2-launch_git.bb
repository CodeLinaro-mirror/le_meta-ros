#Recipe copied from https://github.com/bmwcarit/meta-ros, with the following license:

#All metadata is MIT licensed unless otherwise stated. Source code included in tree
#for individual recipes is under the LICENSE stated in each recipe (.bb file) unless
#otherwise stated. The descriptions in the recipes of ROS packages have been extracted
#from the ROS wiki (http://www.ros.org/wiki/) and are licensed under Creative Commons
#Attribution 3.0 (http://creativecommons.org/licenses/by/3.0/) unless otherwise noted.

SUMMARY = "The ROS launch tool."
HOMEPAGE = "https://github.com/ros2/launch"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

SRCREV = "90181d102362028eb88f225f2b3377f51dc74526"
SRC_URI = "git://github.com/ros2/launch.git;protocol=git;"

S = "${WORKDIR}/git/launch"

RDEPENDS_${PN} += "${PYTHON_PN}-asyncio"

inherit setuptools3
