LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = " \
        https://github.com/ros2/ros1_bridge/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz \
"
SRC_URI[md5sum] = "bd2f196d2975fd5098d7f279de4b4549"
SRC_URI[sha256sum] = "88431573721fcf08244f668bc313a9a39f620d824e95f31f9884c45233b2a2a3"

DEPENDS += " \
    rmw \
    rclcpp \
    ros2-std-msgs \
    roscpp \
    ament-index-python \
    genmsg python3-pyyaml \
    python3-catkin-pkg \
    python3-rospkg rosmsg \
    catkin \
    catkin-runtime \
    roslib \
    rosbag \
    rospy \
    rosgraph \
    genmsg \
    rosgraph \
    genpy \
    rosbuild \
    rospack \
    rosmake \
    rosboost-cfg \
    rosbash \
    roslib \
    roscreate \
    mk \
    rosclean \
    rosunit \
    roslang \
    roscpp \
    rosout \
    roscpp-serialization \
    roscpp-traits \
    topic-tools \
    rostest \
    rostopic \
    message-generation \
    cpp-common \
    genlisp \
    message-filters \
    rosservice \
    rospy \
    rosgraph-msgs \
    rosnode \
    std-srvs \
    xmlrpcpp \
    roslaunch \
    rosmaster \
    roswtf \
    rosbag-storage \
    rosbag \
    rosmsg \
    std-msgs \
    message-runtime \
    rostime \
    gencpp \
    roslz4 \
    actionlib \
    dynamic-reconfigure \
    tf \
    tf2 \
    nodelet \
    actionlib-tutorials \
    control-msgs \
    diagnostic-msgs \
    map-msgs \
    rospy-tutorials \
    sensor-msgs \
    shape-msgs \
    smach-msgs \
    stereo-msgs \
    tf2-msgs \
    trajectory-msgs \
    visualization-msgs \
    roscpp-tutorials \
"


inherit ament

S = "${WORKDIR}/ros1_bridge-${PV}"

PKG_CONFIG_PATH .= ":${PKG_CONFIG_DIR}:${STAGING_DIR_HOST}${base_prefix}/opt/ros/indigo/${baselib}/pkgconfig:${STAGING_DATADIR}/pkgconfig"

PYTHON_SITEPACKAGES_DIR_ROS2_35 = "/usr/lib/python3.5/site-packages"
PYTHON_SITEPACKAGES_DIR_ROS2_27 = "/usr/lib/python2.7/site-packages"
PYTHON_SITEPACKAGES_DIR_ROS = "/opt/ros/indigo/lib/python2.7/site-packages"
PYTHONPATH_class-native = "${PYTHON_SITEPACKAGES_DIR_ROS2}"
export PYTHONPATH = "${STAGING_DIR_HOST}${PYTHON_SITEPACKAGES_DIR_ROS}:${STAGING_DIR_HOST}${PYTHON_SITEPACKAGES_DIR_ROS2_35}:${STAGING_DIR_HOST}${PYTHON_SITEPACKAGES_DIR_ROS2_27}:/opt/ros/indigo/lib/python2.7/dist-packages"

export ROS_ROOT="${STAGING_DIR_HOST}/opt/ros/indigo/share/ros"
export ROS_PACKAGE_PATH="${STAGING_DIR_HOST}/opt/ros/indigo/share:${STAGING_DIR_HOST}/opt/ros/indigo/stacks"
export CPATH="${STAGING_DIR_HOST}/opt/ros/indigo/include"
export PATH .= ":${STAGING_DIR_HOST}/opt/ros/indigo/bin"
export ROS_DISTRO="indigo"
export ROS_ETC_DIR="${STAGING_DIR_HOST}/opt/ros/indigo/etc/ros"
export CMAKE_PREFIX_PATH="${AMENT_PREFIX_PATH}:${STAGING_DIR_HOST}/opt/ros/indigo"
