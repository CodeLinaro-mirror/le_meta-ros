FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

FILES:${PN}:prepend = "${datadir}/rplidar_ros2"
FILES:${PN} += "${libdir}/*"
