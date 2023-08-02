# Copyright (c) 2018-2019 LG Electronics, Inc.

inherit setuptools3

do_install:append() {
    mkdir -p ${D}${ros_datadir}/ament_index/resource_index/packages
    touch ${D}${ros_datadir}/ament_index/resource_index/packages/${ROS_BPN}
    if test -e ${D}${ros_libdir}/${ROS_BPN}; then
        for i in ${D}${ros_libdir}/${ROS_BPN}/* ; do
            sed -i '1c#!/usr/bin/python3' $i
        done
    fi

    # similar to what distutil3.bbclass does here:
    for i in ${D}${ros_bindir}/* ${D}${ros_sbindir}/*; do
        if [ -f "$i" ]; then
            sed -i -e s:${PYTHON}:${USRBINPATH}/env\ ${DISTUTILS_PYTHON}:g $i
            sed -i -e s:${STAGING_BINDIR_NATIVE}:${bindir}:g $i
        fi
    done

    # FIXME: Bandaid against wrong datadir computation
    #
    #if [ -e ${D}${ros_datadir}/share ]; then
    #    mv -f ${D}${ros_datadir}/share/* ${D}${ros_datadir}/
    #    rmdir ${D}${ros_datadir}/share
    #fi
}

FILES:${PN}:prepend = " \
    ${ros_datadir}/ament_index \
"

PYTHON_SITEPACKAGES_DIR = "${ros_libdir}/${PYTHON_DIR}/site-packages"

DISTUTILS_INSTALL_ARGS = "--root=${D} \
    --prefix=${ros_prefix} \
    --install-lib=${PYTHON_SITEPACKAGES_DIR} \
    --install-data=${ros_datadir}"
