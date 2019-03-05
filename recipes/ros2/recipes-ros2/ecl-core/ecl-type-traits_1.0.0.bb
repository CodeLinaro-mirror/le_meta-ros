SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS += "ament-cmake-ros ecl-build ecl-config ecl-mpl"

require ecl-core.inc

SRC_URI += "file://0001-remove-HAS_LIBRARY_TARGET-for-ecl_type_traits.patch;patchdir=.."

INSANE_SKIP_${PN} += "dev-so"
