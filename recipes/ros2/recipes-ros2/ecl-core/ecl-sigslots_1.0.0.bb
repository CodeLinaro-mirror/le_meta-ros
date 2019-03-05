SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=7c5c782a483f033cbce47659f2bddeec"

DEPENDS += "ament-cmake-ros ecl-build ecl-config ecl-threads"

require ecl-core.inc

INSANE_SKIP_${PN} += "file-rdeps"
