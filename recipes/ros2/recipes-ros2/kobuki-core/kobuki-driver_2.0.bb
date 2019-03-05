SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d2be5b8c9313321b6f9fe0ca9a8332d9"

DEPENDS += "ament-cmake-ros ecl-build ecl-command-line ecl-converters ecl-devices ecl-geometry ecl-mobile-robot ecl-sigslots ecl-time"

require kobuki-core.inc

SRC_URI += "file://0001-add-header-files.patch;patchdir=.."

INSANE_SKIP_${PN} += "file-rdeps dev-so"
