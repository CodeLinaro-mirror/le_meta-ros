FILES_${PN} += "${libdir}/console_bridge/*"
INSANE_SKIP_${PN} += "dev-so"
INSANE_SKIP += "pkgconfig"

do_install_append (){
	rm -rf ${D}/${includedir}/console_bridge_export.h
	rm -rf ${D}/${includedir}/console_bridge/console.h
}
