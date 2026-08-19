package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;
import p178H.C3118K;
import p178H.C3126T;
import p178H.C3150i0;
import p178H.InterfaceC3127U;
import p228J.InterfaceC3820W;
import p283L5.AbstractC4941g;
import p523V9.AbstractC8072d6;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* JADX INFO: renamed from: a */
    public static int f32340a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* JADX INFO: renamed from: a */
    public static void m11182a(InterfaceC3127U interfaceC3127U) {
        if (!m11188g(interfaceC3127U)) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = interfaceC3127U.getWidth();
        int height = interfaceC3127U.getHeight();
        int iM14917W = interfaceC3127U.mo3970v()[0].m14917W();
        int iM14917W2 = interfaceC3127U.mo3970v()[1].m14917W();
        int iM14917W3 = interfaceC3127U.mo3970v()[2].m14917W();
        int iM14916V = interfaceC3127U.mo3970v()[0].m14916V();
        int iM14916V2 = interfaceC3127U.mo3970v()[1].m14916V();
        if (nativeShiftPixel(interfaceC3127U.mo3970v()[0].m14915U(), iM14917W, interfaceC3127U.mo3970v()[1].m14915U(), iM14917W2, interfaceC3127U.mo3970v()[2].m14915U(), iM14917W3, iM14916V, iM14916V2, width, height, iM14916V, iM14916V2, iM14916V2) != 0) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC3127U m11183b(C3150i0 c3150i0, byte[] bArr) {
        AbstractC4941g.m5555N(c3150i0.mo343j() == 256);
        bArr.getClass();
        Surface surface = c3150i0.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        InterfaceC3127U interfaceC3127UMo342i = c3150i0.mo342i();
        if (interfaceC3127UMo342i == null) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return interfaceC3127UMo342i;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m11184c(InterfaceC3127U interfaceC3127U) {
        if (interfaceC3127U.mo3969t() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = interfaceC3127U.getWidth();
        int height = interfaceC3127U.getHeight();
        int iM14917W = interfaceC3127U.mo3970v()[0].m14917W();
        int iM14917W2 = interfaceC3127U.mo3970v()[1].m14917W();
        int iM14917W3 = interfaceC3127U.mo3970v()[2].m14917W();
        int iM14916V = interfaceC3127U.mo3970v()[0].m14916V();
        int iM14916V2 = interfaceC3127U.mo3970v()[1].m14916V();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC3127U.getWidth(), interfaceC3127U.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(interfaceC3127U.mo3970v()[0].m14915U(), iM14917W, interfaceC3127U.mo3970v()[1].m14915U(), iM14917W2, interfaceC3127U.mo3970v()[2].m14915U(), iM14917W3, iM14916V, iM14916V2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    /* JADX INFO: renamed from: d */
    public static C3118K m11185d(InterfaceC3127U interfaceC3127U, InterfaceC3820W interfaceC3820W, ByteBuffer byteBuffer, int i10, boolean z6) {
        if (!m11188g(interfaceC3127U)) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = interfaceC3820W.getSurface();
        int width = interfaceC3127U.getWidth();
        int height = interfaceC3127U.getHeight();
        int iM14917W = interfaceC3127U.mo3970v()[0].m14917W();
        int iM14917W2 = interfaceC3127U.mo3970v()[1].m14917W();
        int iM14917W3 = interfaceC3127U.mo3970v()[2].m14917W();
        int iM14916V = interfaceC3127U.mo3970v()[0].m14916V();
        int iM14916V2 = interfaceC3127U.mo3970v()[1].m14916V();
        if (nativeConvertAndroid420ToABGR(interfaceC3127U.mo3970v()[0].m14915U(), iM14917W, interfaceC3127U.mo3970v()[1].m14915U(), iM14917W2, interfaceC3127U.mo3970v()[2].m14915U(), iM14917W3, iM14916V, iM14916V2, surface, byteBuffer, width, height, z6 ? iM14916V : 0, z6 ? iM14916V2 : 0, z6 ? iM14916V2 : 0, i10) != 0) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            AbstractC8072d6.m8486c("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + "], image count: " + f32340a);
            f32340a = f32340a + 1;
        }
        InterfaceC3127U interfaceC3127UMo342i = interfaceC3820W.mo342i();
        if (interfaceC3127UMo342i == null) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        C3118K c3118k = new C3118K(interfaceC3127UMo342i);
        c3118k.m4027a(new C3126T(interfaceC3127UMo342i, interfaceC3127U, 0));
        return c3118k;
    }

    /* JADX INFO: renamed from: e */
    public static void m11186e(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i10, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    /* JADX INFO: renamed from: f */
    public static void m11187f(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i10, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m11188g(InterfaceC3127U interfaceC3127U) {
        return interfaceC3127U.mo3969t() == 35 && interfaceC3127U.mo3970v().length == 3;
    }

    /* JADX INFO: renamed from: h */
    public static C3118K m11189h(InterfaceC3127U interfaceC3127U, InterfaceC3820W interfaceC3820W, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        String str;
        if (!m11188g(interfaceC3127U)) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i10 > 0) {
            int width = interfaceC3127U.getWidth();
            int height = interfaceC3127U.getHeight();
            int iM14917W = interfaceC3127U.mo3970v()[0].m14917W();
            int iM14917W2 = interfaceC3127U.mo3970v()[1].m14917W();
            int iM14917W3 = interfaceC3127U.mo3970v()[2].m14917W();
            int iM14916V = interfaceC3127U.mo3970v()[1].m14916V();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage != null && nativeRotateYUV(interfaceC3127U.mo3970v()[0].m14915U(), iM14917W, interfaceC3127U.mo3970v()[1].m14915U(), iM14917W2, interfaceC3127U.mo3970v()[2].m14915U(), iM14917W3, iM14916V, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i10) == 0) {
                imageWriter.queueInputImage(imageDequeueInputImage);
                InterfaceC3127U interfaceC3127UMo342i = interfaceC3820W.mo342i();
                if (interfaceC3127UMo342i == null) {
                    AbstractC8072d6.m8487d("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                    return null;
                }
                C3118K c3118k = new C3118K(interfaceC3127UMo342i);
                c3118k.m4027a(new C3126T(interfaceC3127UMo342i, interfaceC3127U, 1));
                return c3118k;
            }
            str = "ImageProcessingUtil";
        } else {
            str = "ImageProcessingUtil";
        }
        AbstractC8072d6.m8487d(str, "rotate YUV failure");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static void m11190i(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            AbstractC8072d6.m8487d("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Bitmap bitmap, int i15, int i16, int i17);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z6);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
