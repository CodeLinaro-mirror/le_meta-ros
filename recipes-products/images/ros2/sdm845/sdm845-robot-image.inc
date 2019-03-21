#Include the robot settings

IMAGE_INSTALL += "${@bb.utils.contains('MULTILIB_VARIANTS', 'lib32', 'lib32-packagegroup-ros2-world', 'packagegroup-ros2-world', d)}"
IMAGE_INSTALL += "${@bb.utils.contains('MULTILIB_VARIANTS', 'lib32', 'lib32-ros2multicast', 'ros2multicast', d)}"
IMAGE_INSTALL += "${@bb.utils.contains('MULTILIB_VARIANTS', 'lib32', 'lib32-ros2-scripts', 'ros2-scripts', d)}"
IMAGE_INSTALL += "${@bb.utils.contains('MULTILIB_VARIANTS', 'lib32', 'lib32-ros1-bridge', 'ros1-bridge', d)}"
