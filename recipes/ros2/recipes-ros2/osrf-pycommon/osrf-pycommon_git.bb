#Recipe copied from https://github.com/bmwcarit/meta-ros, with the following license:

#All metadata is MIT licensed unless otherwise stated. Source code included in tree
#for individual recipes is under the LICENSE stated in each recipe (.bb file) unless
#otherwise stated. The descriptions in the recipes of ROS packages have been extracted
#from the ROS wiki (http://www.ros.org/wiki/) and are licensed under Creative Commons
#Attribution 3.0 (http://creativecommons.org/licenses/by/3.0/) unless otherwise noted.

SUMMARY = "Commonly needed Python modules, used by Python software developed at OSRF."
HOMEPAGE = "https://github.com/osrf/osrf_pycommon"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c4db32a2fa8717faffa1d4f10136f47"

SRCREV = "e32de70e8b42dcd96bb66d29ddfb62e7fd8b795e"
SRC_URI = "git://github.com/osrf/osrf_pycommon.git;protocol=git;"

S = "${WORKDIR}/git"

inherit setuptools3

BBCLASSEXTEND += "native"
