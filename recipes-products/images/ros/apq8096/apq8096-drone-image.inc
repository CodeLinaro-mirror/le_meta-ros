#Include the drone settings

IMAGE_INSTALL += "${@bb.utils.contains('DISTRO_FEATURES', 'ROS', 'packagegroup-ros-qti', '', d)}"
