SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/\
${LICENSE};md5=3775480a712fc46a69647678acb234cb"

FILESPATH =+ "${WORKSPACE}/vendor/qcom/opensource/ros:"
SRC_URI = "file://kobuki_msgs"

DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
    rosidl-typesupport-cpp \
"

inherit ament pythonpath-insane

S = "${WORKDIR}/kobuki_msgs"
