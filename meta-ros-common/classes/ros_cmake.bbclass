# Copyright (c) 2019 LG Electronics, Inc.

inherit cmake

EXTRA_OECMAKE:prepend = "\
    -DCMAKE_PREFIX_PATH='${STAGING_DIR_HOST}${ros_prefix};${STAGING_DIR_HOST}${prefix}' \
    -DCMAKE_INSTALL_PREFIX:PATH='${ros_prefix}' \
"

EXTRA_OECMAKE:prepend:class-native = "\
    -DCMAKE_PREFIX_PATH='${STAGING_DIR_NATIVE}${ros_prefix};${STAGING_DIR_NATIVE}${prefix}' \
    -DCMAKE_INSTALL_PREFIX:PATH='${ros_prefix}' \
"
