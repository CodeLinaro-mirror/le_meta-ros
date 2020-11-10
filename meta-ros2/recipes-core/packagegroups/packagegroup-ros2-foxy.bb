DESCRIPTION = "ros2-foxy package group"
LICENSE = "BSD-3-Clause"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
        desktop \
"
