SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3aaf85addbebd6d91229a981c49afb8b"

DEPENDS += "ament-cmake-ros ecl-build ecl-config"

require ecl-lite.inc

SRC_URI += "file://0001-remove-HAS_LIBRARY_TARGET-for-ecl_errors.patch;patchdir=.."

INSANE_SKIP_${PN} += "file-rdeps dev-so"
