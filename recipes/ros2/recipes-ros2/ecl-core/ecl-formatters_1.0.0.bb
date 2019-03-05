SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=76a6cb36a88f0bd16d0304a7e8a97bb2"

DEPENDS += "ament-cmake-ros ecl-build ecl-config ecl-converters ecl-exceptions"

require ecl-core.inc

SRC_URI += "file://0001-remove-HAS_LIBRARY_TARGET-for-ecl_formatters.patch;patchdir=.."

INSANE_SKIP_${PN} += "file-rdeps dev-so"
