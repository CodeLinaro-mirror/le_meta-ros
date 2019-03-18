#Recipe copied from https://github.com/bmwcarit/meta-ros, with the following license:

#All metadata is MIT licensed unless otherwise stated. Source code included in tree
#for individual recipes is under the LICENSE stated in each recipe (.bb file) unless
#otherwise stated. The descriptions in the recipes of ROS packages have been extracted
#from the ROS wiki (http://www.ros.org/wiki/) and are licensed under Creative Commons
#Attribution 3.0 (http://creativecommons.org/licenses/by/3.0/) unless otherwise noted.

SUMMARY = "Implementation of RTPS Standard."
HOMEPAGE = "https://github.com/eProsima/Fast-RTPS"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
DEPENDS = "asio libtinyxml2"

SRCREV = "bfb448e19bff253293e8f28ee8c3d3d78d882be2"
SRC_URI = "git://github.com/eProsima/Fast-RTPS.git;protocol=git; \
    file://0001-don-t-use-INSTALL_INTERFACE.patch \
    file://0001-FindTinyXML2-use-pkg-config-to-find-tinyxml2.patch \
    file://0001-Fix-localhost-267-https-github.com-eProsima-Fast-RTP.patch \
"

S = "${WORKDIR}/git"

inherit cmake

do_install_append() {
    rm -r ${D}/usr/examples
}

FILES_${PN} += " /usr/lib "

SYSROOT_DIRS += " /usr/lib "

INSANE_SKIP_${PN} += "dev-so"
