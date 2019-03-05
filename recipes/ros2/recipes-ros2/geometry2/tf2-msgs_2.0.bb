SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=6cef6a2a0fb4ff3277953f336436118f"

DEPENDS += "ament-cmake rosidl-default-generators builtin-interfaces ros2-std-msgs ros2-geometry-msgs"

require geometry2.inc

inherit pythonpath-insane
