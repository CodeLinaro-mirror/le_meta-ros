SRC_URI = "https://github.com/stonier/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3e30ffae1e37cf05bcb12e2638740e96"
SRC_URI[sha256sum] = "b91ae7d2bd62879fcc9fed1b212e4aed672c11e8b46ed52b9f837672e3b51387"

inherit ament
ROS_SPN = "ecl_tools"
S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

