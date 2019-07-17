DESCRIPTION = "Fast Library for Approximate Nearest Neighbors"
AUTHOR = "Marius Muja and David G. Lowe"
HOMEPAGE = "http://www.cs.ubc.ca/~mariusm/index.php/FLANN/FLANN"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=395adad2339bd9ce5fef13d564a9681c"

#SRC_URI = "https://github.com/mariusmuja/flann/archive/${PV}.tar.gz"
SRC_URI = "https://github.com/victorvianna/flann/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "736999f55ee8866cabdd8e1374d12324"
SRC_URI[sha256sum] = "dac7561f1818613f7af2331183096c58dbc61a93e74a9a840b94a8eb5ea263d7"

S = "${WORKDIR}/flann-${PV}"

inherit cmake
