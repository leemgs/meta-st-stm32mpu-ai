require recipes-st/images/st-image-weston.bb

SUMMARY = "OpenSTLinux Artificial Inteligence for Computer Vision image based on weston image"

IMAGE_AI_PART = "   \
    opencv \
    python3-pip \
    python3-runpy \
    tensorflow-lite-python3 \
    tensorflow-lite-examples \
    libcxx \
"

#
# INSTALL addons
#
CORE_IMAGE_EXTRA_INSTALL += " \
    ${IMAGE_AI_PART}          \
"

CORE_IMAGE_EXTRA_INSTALL_append_stm32mp1-av96 = " av96-root-files "
