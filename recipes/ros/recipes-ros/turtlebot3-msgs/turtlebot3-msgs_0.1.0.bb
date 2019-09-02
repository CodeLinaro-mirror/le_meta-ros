LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/\
${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"
SRCREV = "036a68972d967c813dad84a4dfcee52f425e7f40"
SRC_URI = "git://github.com/ROBOTIS-GIT/turtlebot3_msgs;protocol=git;"

S = "${WORKDIR}/git"


DEPENDS = "std-msgs message-generation message-runtime"

inherit catkin

