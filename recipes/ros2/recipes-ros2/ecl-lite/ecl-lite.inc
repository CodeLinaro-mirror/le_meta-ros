SRC_URI = "https://github.com/stonier/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "516d432d2d21461d38521afd811e9a66"
SRC_URI[sha256sum] = "9dbe414271a22d5744a2169ef337a72e40b44efec7e3a9c043a039e16ea625b6"

inherit ament
ROS_SPN = "ecl_lite"
S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

