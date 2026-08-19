package p571X9;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p178H.InterfaceC3127U;
import p253K.C4497h;
import p253K.C4498i;
import p253K.C4499j;
import p253K.C4500k;
import p253K.C4501l;
import p391Q.C6541a;
import p720e6.C13288c;

/* JADX INFO: renamed from: X9.g0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9288g0 {
    /* JADX INFO: renamed from: a */
    public static void m9864a(String key, StringBuilder sb2) {
        AbstractC16544l.m18094g(key, "key");
        sb2.append('\"');
        int length = key.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = key.charAt(i10);
            if (cCharAt == '\n') {
                sb2.append("%0A");
            } else if (cCharAt == '\r') {
                sb2.append("%0D");
            } else if (cCharAt == '\"') {
                sb2.append("%22");
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append('\"');
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m9865b(InterfaceC3127U interfaceC3127U) {
        int iMo3969t = interfaceC3127U.mo3969t();
        if (iMo3969t == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC3127U.getWidth(), interfaceC3127U.getHeight(), Bitmap.Config.ARGB_8888);
            interfaceC3127U.mo3970v()[0].m14915U().rewind();
            ImageProcessingUtil.m11187f(bitmapCreateBitmap, interfaceC3127U.mo3970v()[0].m14915U(), interfaceC3127U.mo3970v()[0].m14917W());
            return bitmapCreateBitmap;
        }
        if (iMo3969t == 35) {
            return ImageProcessingUtil.m11184c(interfaceC3127U);
        }
        if (iMo3969t != 256 && iMo3969t != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC3127U.mo3969t() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!m9866c(interfaceC3127U.mo3969t())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC3127U.mo3969t());
        }
        ByteBuffer byteBufferM14915U = interfaceC3127U.mo3970v()[0].m14915U();
        int iCapacity = byteBufferM14915U.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferM14915U.rewind();
        byteBufferM14915U.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9866c(int i10) {
        return i10 == 256 || i10 == 4101;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m9867d(InterfaceC3127U interfaceC3127U, Rect rect, int i10, int i11) {
        if (interfaceC3127U.mo3969t() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC3127U.mo3969t());
        }
        C13288c c13288c = interfaceC3127U.mo3970v()[0];
        C13288c c13288c2 = interfaceC3127U.mo3970v()[1];
        C13288c c13288c3 = interfaceC3127U.mo3970v()[2];
        ByteBuffer byteBufferM14915U = c13288c.m14915U();
        ByteBuffer byteBufferM14915U2 = c13288c2.m14915U();
        ByteBuffer byteBufferM14915U3 = c13288c3.m14915U();
        byteBufferM14915U.rewind();
        byteBufferM14915U2.rewind();
        byteBufferM14915U3.rewind();
        int iRemaining = byteBufferM14915U.remaining();
        byte[] bArr = new byte[((interfaceC3127U.getHeight() * interfaceC3127U.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i12 = 0; i12 < interfaceC3127U.getHeight(); i12++) {
            byteBufferM14915U.get(bArr, width, interfaceC3127U.getWidth());
            width += interfaceC3127U.getWidth();
            byteBufferM14915U.position(Math.min(iRemaining, c13288c.m14917W() + (byteBufferM14915U.position() - interfaceC3127U.getWidth())));
        }
        int height = interfaceC3127U.getHeight() / 2;
        int width2 = interfaceC3127U.getWidth() / 2;
        int iM14917W = c13288c3.m14917W();
        int iM14917W2 = c13288c2.m14917W();
        int iM14916V = c13288c3.m14916V();
        int iM14916V2 = c13288c2.m14916V();
        byte[] bArr2 = new byte[iM14917W];
        byte[] bArr3 = new byte[iM14917W2];
        for (int i13 = 0; i13 < height; i13++) {
            byteBufferM14915U3.get(bArr2, 0, Math.min(iM14917W, byteBufferM14915U3.remaining()));
            byteBufferM14915U2.get(bArr3, 0, Math.min(iM14917W2, byteBufferM14915U2.remaining()));
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < width2; i16++) {
                int i17 = width + 1;
                bArr[width] = bArr2[i14];
                width += 2;
                bArr[i17] = bArr3[i15];
                i14 += iM14916V;
                i15 += iM14916V2;
            }
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, interfaceC3127U.getWidth(), interfaceC3127U.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C4501l[] c4501lArr = C4499j.f14676c;
        C4498i c4498i = new C4498i(ByteOrder.BIG_ENDIAN);
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = c4498i.f14674a;
        c4498i.m5235c("Orientation", strValueOf, arrayList);
        c4498i.m5235c("XResolution", "72/1", arrayList);
        c4498i.m5235c("YResolution", "72/1", arrayList);
        c4498i.m5235c("ResolutionUnit", String.valueOf(2), arrayList);
        c4498i.m5235c("YCbCrPositioning", String.valueOf(1), arrayList);
        c4498i.m5235c("Make", Build.MANUFACTURER, arrayList);
        c4498i.m5235c("Model", Build.MODEL, arrayList);
        if (interfaceC3127U.mo3968k0() != null) {
            interfaceC3127U.mo3968k0().mo3965e(c4498i);
        }
        c4498i.m5236d(i11);
        c4498i.m5235c("ImageWidth", String.valueOf(interfaceC3127U.getWidth()), arrayList);
        c4498i.m5235c("ImageLength", String.valueOf(interfaceC3127U.getHeight()), arrayList);
        ArrayList list = Collections.list(new C4497h(c4498i));
        if (!((Map) list.get(1)).isEmpty()) {
            c4498i.m5234b("ExposureProgram", String.valueOf(0), list);
            c4498i.m5234b("ExifVersion", "0230", list);
            c4498i.m5234b("ComponentsConfiguration", "1,2,3,0", list);
            c4498i.m5234b("MeteringMode", String.valueOf(0), list);
            c4498i.m5234b("LightSource", String.valueOf(0), list);
            c4498i.m5234b("FlashpixVersion", "0100", list);
            c4498i.m5234b("FocalPlaneResolutionUnit", String.valueOf(2), list);
            c4498i.m5234b("FileSource", String.valueOf(3), list);
            c4498i.m5234b("SceneType", String.valueOf(1), list);
            c4498i.m5234b("CustomRendered", String.valueOf(0), list);
            c4498i.m5234b("SceneCaptureType", String.valueOf(0), list);
            c4498i.m5234b("Contrast", String.valueOf(0), list);
            c4498i.m5234b("Saturation", String.valueOf(0), list);
            c4498i.m5234b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            c4498i.m5234b("GPSVersionID", "2300", list);
            c4498i.m5234b("GPSSpeedRef", TokenNames.f32013K, list);
            c4498i.m5234b("GPSTrackRef", TokenNames.f32019T, list);
            c4498i.m5234b("GPSImgDirectionRef", TokenNames.f32019T, list);
            c4498i.m5234b("GPSDestBearingRef", TokenNames.f32019T, list);
            c4498i.m5234b("GPSDestDistanceRef", TokenNames.f32013K, list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, interfaceC3127U.getWidth(), interfaceC3127U.getHeight()) : rect, i10, new C4500k(byteArrayOutputStream, new C4499j(c4498i.f14675b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new C6541a("YuvImage failed to encode jpeg.");
    }
}
