SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=dea2a60709005c1252ec6e29705781fa"

DEPENDS += "ament-cmake-ros ecl-build ecl-config ecl-errors ecl-exceptions ecl-time-lite"

require ecl-core.inc

SRC_URI += "file://0001-remove-HAS_LIBRARY_TARGET-for-ecl_time.patch;patchdir=.."

INSANE_SKIP_${PN} += "file-rdeps dev-so"
