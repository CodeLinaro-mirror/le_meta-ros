#Include the drone settings

IMAGE_INSTALL += "${@base_contains('DISTRO_FEATURES', 'ROS', 'packagegroup-ros-qti', '', d)}"
