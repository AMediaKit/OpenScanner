package net.rabbitknight.open.scanner.core

object C {
    const val CODE_SUCCESS = 0
    const val CODE_FAIL = -1

    /**
     *
     * Android Y8 format.
     *
     *
     * Y8 is a YUV planar format comprised of a WxH Y plane only, with each pixel
     * being represented by 8 bits. It is equivalent to just the Y plane from [.YV12]
     * format.
     *
     *
     * This format assumes
     *
     *  * an even width
     *  * an even height
     *  * a horizontal stride multiple of 16 pixels
     *
     *
     *
     * <pre> size = stride * height </pre>
     *
     *
     * For example, the [android.media.Image] object can provide data
     * in this format from a [android.hardware.camera2.CameraDevice] (if
     * supported) through a [android.media.ImageReader] object. The
     * [Image#getPlanes()][android.media.Image.getPlanes] will return a
     * single plane containing the pixel data. The pixel stride is always 1 in
     * [android.media.Image.Plane.getPixelStride], and the
     * [android.media.Image.Plane.getRowStride] describes the vertical
     * neighboring pixel distance (in bytes) between adjacent rows.
     *
     * @see android.media.Image
     *
     * @see android.media.ImageReader
     *
     * @see android.hardware.camera2.CameraDevice
     */
    const val Y8 = 0x20203859

    /**
     * @see [i420](https://www.fourcc.org/pixel-format/yuv-i420/)
     */
    const val I420 = 0x30323449

    /**
     * 调度频率 每16ms执行一次检测
     */
    const val SCHEDULE_PERIOD_MILS = 16L

    /**
     * 默认输入缓存大小
     */
    const val DEFAULT_INPUT_CAPACITY = 3

    /**
     * 默认晃动检测
     */
    const val DEFAULT_SHAKE_DETECTOR_ENABLE = false
}