DESCRIPTION = "explore package group"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
    m-explore \
    rrt-exploration \
    frontier-exploration \
"
