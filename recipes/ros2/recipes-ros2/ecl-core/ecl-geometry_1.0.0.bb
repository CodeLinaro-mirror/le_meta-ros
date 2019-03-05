SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d25939bd242aba3a145910b448c43b6d"

DEPENDS += "ament-cmake-ros ecl-build ecl-config ecl-containers ecl-exceptions ecl-formatters ecl-linear-algebra ecl-math ecl-mpl ecl-type-traits"

require ecl-core.inc

SRC_URI += "file://0001-remove-HAS_LIBRARY_TARGET-for-ecl_geometry.patch;patchdir=.."

INSANE_SKIP_${PN} += "dev-so"
