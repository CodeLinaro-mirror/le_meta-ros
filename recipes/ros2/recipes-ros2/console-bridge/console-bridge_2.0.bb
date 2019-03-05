SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d25939bd242aba3a145910b448c43b6d"

SRC_URI = "git://github.com/ros/console_bridge;protocol=git;branch=master;"
SRCREV = "f0b423c0c2d02651db1776c96887c0a314908063"

inherit cmake

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD;md5=3775480a712fc46a69647678acb234cb"
LICENSE = "BSD"

S = "${WORKDIR}/git"
