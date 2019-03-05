LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD;md5=3775480a712fc46a69647678acb234cb"
LICENSE = "BSD"

#DEPENDS = "ecl-mobile-robot"

require ecl-lite.inc

S = "${WORKDIR}/ecl_lite/ecl_time_lite"

INSANE_SKIP_${PN} += "file-rdeps dev-so"

SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=4cbf429eb5ad3792202780bf0f50fc90"

DEPENDS += "ament-cmake-ros ecl-build ecl-config ecl-errors"

require ecl-lite.inc

SRC_URI += "file://0001-remove-HAS_LIBRARY_TARGET-for-ecl_time_lite.patch;patchdir=.."
