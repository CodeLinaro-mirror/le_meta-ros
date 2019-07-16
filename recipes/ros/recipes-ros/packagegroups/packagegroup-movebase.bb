DESCRIPTION = "movebase package group"

inherit packagegroup

LICENSE = "BSD"

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
    base-local-planner \
    carrot-planner \
    clear-costmap-recovery \
    rotate-recovery \
    costmap-2d \
    dwa-local-planner \
    fake-localization \
    global-planner \
    map-server \
    libsdl-image \
    move-base-msgs \
    move-base \
    move-slow-and-clear \
    nav-core \
    navfn \
    robot-pose-ekf \
    voxel-grid \
    cppunit \
    image-geometry \
    amcl \
    depthimage-to-laserscan \
    gmapping \
    hls-lfcd-lds-driver \
    rplidar-ros \
    ydlidar-ros \
  "
