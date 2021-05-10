#Add extra packages for ROS related development
ROS_EXEC_DEPENDS += " \
    image-transport \
    cv-bridge \
    rcl-logging-noop \
    turtlebot3 \
    kobuki-core \
    kobuki-ros \
    kobuki-ros-interfaces \
    kobuki-node \
    kobuki-keyop \
    explore-ros2 \
"

#Remove unavailable packages
ROS_EXEC_DEPENDS_remove = " \
    image-tools \
    joy \
    rqt-common-plugins \
    rviz-default-plugins \
    rviz2 \
    teleop-twist-joy \
    turtlesim \
"
