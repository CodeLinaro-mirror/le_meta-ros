SRC_URI = "https://github.com/stonier/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "185a3d483638a9b4aec8c69a68bc8156"
SRC_URI[sha256sum] = "7f0ce02984557107bb7b8017553b533b76e613862d369208a2001f5d9b592cf9"

inherit ament
ROS_SPN = "ecl_core"
S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"
