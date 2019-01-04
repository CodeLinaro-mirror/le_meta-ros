#Recipe copied from https://github.com/bmwcarit/meta-ros, with the following license:

#All metadata is MIT licensed unless otherwise stated. Source code included in tree
#for individual recipes is under the LICENSE stated in each recipe (.bb file) unless
#otherwise stated. The descriptions in the recipes of ROS packages have been extracted
#from the ROS wiki (http://www.ros.org/wiki/) and are licensed under Creative Commons
#Attribution 3.0 (http://creativecommons.org/licenses/by/3.0/) unless otherwise noted.

DESCRIPTION = "ros2-world package group"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
    ros2-demo-nodes-cpp \
    ros2run \
    ros2topic \
    ros2cli \
    ros2msg \
    ros2run \
    ros2topic \
    ros2pkg \
    ros2node \
    ros2srv \
    ros2service \
    ros2-launch \
    ros2-actionlib-msgs \
    ros2-diagnostic-msgs \
    ros2-nav-msgs \
    ros2-std-srvs \
    ros2-stereo-msgs \
    ros2-trajectory-msgs \
    ros2-visualization-msgs \
    rosidl-generator-py \
"
