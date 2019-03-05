SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=68b329da9893e34099c7d8ad5cb9c940"

DEPENDS += "ament-cmake-ros ecl-build ecl-config ecl-converters ecl-errors ecl-exceptions ecl-formatters ecl-mpl ecl-type-traits ecl-utilities"

require ecl-core.inc

INSANE_SKIP_${PN} += "file-rdeps"
