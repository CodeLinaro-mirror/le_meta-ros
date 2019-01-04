#Recipe copied from https://github.com/bmwcarit/meta-ros, with the following license:

#All metadata is MIT licensed unless otherwise stated. Source code included in tree
#for individual recipes is under the LICENSE stated in each recipe (.bb file) unless
#otherwise stated. The descriptions in the recipes of ROS packages have been extracted
#from the ROS wiki (http://www.ros.org/wiki/) and are licensed under Creative Commons
#Attribution 3.0 (http://creativecommons.org/licenses/by/3.0/) unless otherwise noted.

SUMMARY = "The decision which ROS middleware implementation should be used for C++."
HOMEPAGE = "https://github.com/ros2/example_interfaces"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " \
    rcutils \
    rmw \
    rmw-implementation-cmake \
    rmw-fastrtps-cpp \
    poco \
"

SRCREV = "856611439680209e46d0f4fc4c79d62e7c29867d"
SRC_URI = "git://github.com/ros2/rmw_implementation.git;protocol=git; \
           file://0001-get-rid-of-poco-vendor-dependency.patch;patchdir=.. \
           "

inherit ament
