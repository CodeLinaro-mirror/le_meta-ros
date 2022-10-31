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
    if [[ "$(cat $BBLAYER_CONF)" =~ $layer ]];  then
        echo "$layer has been added to bblayers.conf"
    else
        echo "Add $layer to $BBLAYER_CONF"
        echo "BBLAYERS += \" \${SDKBASEMETAPATH}/layers/$layer \"" >> $BBLAYER_CONF
    fi
done

for pkg in ${Install_pkgs[@]}; do
    if [[ "$(cat $Image_bb)" =~ $pkg ]];  then
        echo "$pkg has been added to $Image_bb"
    else
        echo "CORE_IMAGE_EXTRA_INSTALL +=  \" $pkg  \"" >> $Image_bb
    fi
done

if [[ "$(cat $Image_bb)" =~ "inherit qti_gen_incremental_pkg" ]];  then
	echo "qti_gen_incremental_pkg class has been added"
else
    echo "inherit qti_gen_incremental_pkg" >> $Image_bb
fi
