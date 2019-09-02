LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/\
${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"
SRCREV = "d3cdcc6647812ae9a83f05e626cdae322923ac84"
SRC_URI = "git://github.com/ROBOTIS-GIT/turtlebot3;protocol=git;"

S = "${WORKDIR}/git/turtlebot3_bringup"


DEPENDS = "roscpp std-msgs diagnostic-msgs sensor-msgs turtlebot3-msgs"

inherit catkin

INSANE_SKIP_${PN} += "file-rdeps"
