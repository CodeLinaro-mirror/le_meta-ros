# Copyright (c) 2022 Qualcomm Innovation Center, Inc. All rights reserved.
# SPDX-License-Identifier: BSD-3-Clause-Clear

## Script to do pre-configurations specific to current layer

ROS_LAYERS=(poky/meta-ros/meta-ros-common
            poky/meta-ros/meta-ros2
            poky/meta-ros/meta-ros2-foxy
            poky/meta-ros/meta-ros-backports-gatesgarth)

#$BUILDDIR is exported by ESDK enviroment
BBLAYER_CONF=$BUILDDIR/conf/bblayers.conf
Image_bb=$BUILDDIR/layers/poky/meta-qti-bsp/recipes-products/images/qti-robotics-image.bb
Install_pkgs="packagegroup-ros2-foxy"

#Add layers to bblayers.conf
for layer in ${ROS_LAYERS[@]}; do
    exit_layer=$(grep -c $layer $BBLAYER_CONF)
    if [ $exit_layer -eq 0 ];  then
        echo "$layer is added to bblayers.conf"
        echo "BBLAYERS += \" \${SDKBASEMETAPATH}/layers/$layer \"" >> $BBLAYER_CONF
    fi
done

for pkg in ${Install_pkgs[@]}; do
    exit_pkg=$(grep -c $pkg $Image_bb)
    if [[ $exit_pkg -eq 0 ]];  then
        echo "CORE_IMAGE_EXTRA_INSTALL +=  \" $pkg  \"" >> $Image_bb
    fi
done

