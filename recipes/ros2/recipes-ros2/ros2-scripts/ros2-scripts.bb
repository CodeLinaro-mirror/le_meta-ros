DESCRIPTION = "ROS scripts"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

PR = "r0"
PV = "1.0"

SRC_URI = "file://ros2-env.sh"

PACKAGES = "${PN}"
FILES_${PN} = "/usr/bin/*"

do_install() {
    dest=/usr/bin
    install -d ${D}${dest}
    install -m 755 ${WORKDIR}/ros2-env.sh ${D}${dest}
}
