#Recipe copied from https://github.com/bmwcarit/meta-ros, with the following license:

#All metadata is MIT licensed unless otherwise stated. Source code included in tree
#for individual recipes is under the LICENSE stated in each recipe (.bb file) unless
#otherwise stated. The descriptions in the recipes of ROS packages have been extracted
#from the ROS wiki (http://www.ros.org/wiki/) and are licensed under Creative Commons
#Attribution 3.0 (http://creativecommons.org/licenses/by/3.0/) unless otherwise noted.

SUMMARY = "Package containing the Python client."
HOMEPAGE = "https://github.com/ros2/rclpy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"
DEPENDS = " \
        python-cmake-module \
        rcl \
"

SRCREV = "018b9fbf1c66f1c1c488510e0caa299fb0223277"
SRC_URI = "git://github.com/ros2/rclpy.git;protocol=git;"

RDEPENDS_${PN} += "${PYTHON_PN}-multiprocessing"

inherit ament
