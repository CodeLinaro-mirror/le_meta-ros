# Copyright (c) 2020 LG Electronics, Inc.

# Without the target dependencies, ament finds the native packages and then fails to link (error: incompatible target).
ROS_BUILD_DEPENDS += " \
    rosidl-default-runtime \
    std-msgs \
"

ROS_BUILD_DEPENDS += " \
    fastcdr \
    fastrtps \
    builtin-interfaces \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
    rosidl-typesupport-fastrtps-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
"

ROS_BUILDTOOL_DEPENDS += " \
    rosidl-parser-native \
    rosidl-adapter-native \
    python3-numpy-native \
    python3-lark-parser-native \
"

ROS_EXEC_DEPENDS += " \
    std-msgs \
"

export PYTHONPATH = "${RECIPE_SYSROOT}${PYTHON_SITEPACKAGES_DIR}"
