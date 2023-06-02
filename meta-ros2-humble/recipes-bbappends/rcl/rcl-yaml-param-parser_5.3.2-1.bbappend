# Copyright (c) 2020-2021 LG Electronics, Inc.

inherit pkgconfig

DEPENDS += "libyaml"

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-CMakeLists.txt-fix-libyaml-not-found.patch"
