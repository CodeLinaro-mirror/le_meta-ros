#Include the robot settings

IMAGE_INSTALL += "${@bb.utils.contains('MULTILIB_VARIANTS', 'lib32', 'lib32-packagegroup-ros-qti', 'packagegroup-ros-qti', d)}"
IMAGE_INSTALL += "${@bb.utils.contains('MULTILIB_VARIANTS', 'lib32', 'lib32-packagegroup-movebase', 'packagegroup-movebase', d)}"
