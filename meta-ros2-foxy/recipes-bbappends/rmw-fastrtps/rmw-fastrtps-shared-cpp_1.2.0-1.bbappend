# Copyright (c) 2019 LG Electronics, Inc.

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://0001-Resolve-unorderset-issue-on-rmw-fastrtps-shared-cpp.patch"

ROS_BUILD_DEPENDS += " \
    rosidl-cmake \
    rosidl-default-runtime \
"
