SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=5ac099ba7dcb3bca119d375c3fbb8124"

DEPENDS += "ament-cmake-ros ecl-build ecl-config ecl-errors ecl-concepts ecl-exceptions ecl-time ecl-utilities"

require ecl-core.inc

SRC_URI += "file://0001-remove-HAS_LIBRARY_TARGET-for-ecl_threads.patch;patchdir=.."

INSANE_SKIP_${PN} += "file-rdeps dev-so"
