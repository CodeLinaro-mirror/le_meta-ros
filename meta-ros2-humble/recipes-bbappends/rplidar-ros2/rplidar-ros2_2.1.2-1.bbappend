FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

FILES:${PN}:prepend = "${datadir}/rplidar_ros"
FILES:${PN} += "${libdir}/*"
