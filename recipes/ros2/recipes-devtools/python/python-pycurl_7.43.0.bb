#Recipe copied from https://github.com/bmwcarit/meta-ros, with the following license:

#All metadata is MIT licensed unless otherwise stated. Source code included in tree
#for individual recipes is under the LICENSE stated in each recipe (.bb file) unless
#otherwise stated. The descriptions in the recipes of ROS packages have been extracted
#from the ROS wiki (http://www.ros.org/wiki/) and are licensed under Creative Commons
#Attribution 3.0 (http://creativecommons.org/licenses/by/3.0/) unless otherwise noted.

DESCRIPTION = "A Python Interface To The cURL library"
SECTION = "devel/python"
LICENSE = "LGPL-2.1 | MIT"
LIC_FILES_CHKSUM = "file://COPYING-LGPL;md5=4fbd65380cdd255951079008b364516c \
                    file://COPYING-MIT;md5=b7e434aeb228ed731c00bcf177e79b19"
SRCNAME = "pycurl"

DEPENDS = "curl"

SRC_URI = "https://pypi.python.org/packages/source/p/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "c94bdba01da6004fa38325e9bd6b9760"
SRC_URI[sha256sum] = "aa975c19b79b6aa6c0518c0cc2ae33528900478f0b500531dbcdbf05beec584c"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils
