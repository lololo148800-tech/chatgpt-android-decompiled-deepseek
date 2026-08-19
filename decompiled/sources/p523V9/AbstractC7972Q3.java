package p523V9;

import ac.C10539a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.TypedValue;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.android.core.AbstractC15256t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p1008s8.C19485n;
import p1060v9.AbstractC20502t;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p401Qb.C6584a;

/* JADX INFO: renamed from: V9.Q3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7972Q3 {
    /* JADX INFO: renamed from: a */
    public static ByteBuffer m8260a(C10539a c10539a) {
        int i10 = c10539a.f31260g;
        int i11 = 0;
        if (i10 != -1) {
            if (i10 == 17) {
                ByteBuffer byteBuffer = c10539a.f31255b;
                AbstractC20502t.m21157h(byteBuffer);
                return byteBuffer;
            }
            if (i10 == 35) {
                Image.Plane[] planeArrM10980a = c10539a.m10980a();
                AbstractC20502t.m21157h(planeArrM10980a);
                return m8266g(planeArrM10980a, c10539a.f31257d, c10539a.f31258e);
            }
            if (i10 != 842094169) {
                throw new C6584a("Unsupported image format", 13);
            }
            ByteBuffer byteBuffer2 = c10539a.f31255b;
            AbstractC20502t.m21157h(byteBuffer2);
            return m8267h(byteBuffer2, false);
        }
        Bitmap bitmapCopy = c10539a.f31254a;
        AbstractC20502t.m21157h(bitmapCopy);
        if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = width * height;
        int[] iArr = new int[i12];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i12);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            int i16 = i11;
            while (i16 < width) {
                int i17 = iArr[i15];
                int i18 = i17 >> 16;
                int i19 = i17 >> 8;
                int i20 = i17 & 255;
                int i21 = i14 + 1;
                int i22 = i18 & 255;
                int i23 = i19 & 255;
                byteBufferAllocateDirect.put(i14, (byte) Math.min(255, ((((i20 * 25) + ((i23 * 129) + (i22 * 66))) + 128) >> 8) + 16));
                if (i13 % 2 == 0 && i15 % 2 == 0) {
                    int i24 = ((((i22 * 112) - (i23 * 94)) - (i20 * 18)) + 128) >> 8;
                    int i25 = (((((i22 * (-38)) - (i23 * 74)) + (i20 * 112)) + 128) >> 8) + 128;
                    int i26 = i12 + 1;
                    byteBufferAllocateDirect.put(i12, (byte) Math.min(255, i24 + 128));
                    i12 += 2;
                    byteBufferAllocateDirect.put(i26, (byte) Math.min(255, i25));
                }
                i15++;
                i16++;
                i14 = i21;
            }
            i13++;
            i11 = 0;
        }
        return byteBufferAllocateDirect;
    }

    /* JADX INFO: renamed from: b */
    public static C19485n m8261b(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("build");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("version");
            return new C19485n(strMo4384r, strMo4384r2, abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Os", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Os", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Os", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m8262c(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        byte[] bArrArray;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            bArrArray = byteBuffer.array();
        } else {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit();
            byte[] bArr = new byte[iLimit];
            byteBuffer.get(bArr, 0, iLimit);
            bArrArray = bArr;
        }
        byte[] bArrM8269j = m8269j(bArrArray, i10, i11);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM8269j, 0, bArrM8269j.length);
        return m8268i(bitmapDecodeByteArray, i12, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    /* JADX INFO: renamed from: d */
    public static TypedValue m8263d(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m8264e(Context context, int i10, boolean z6) {
        TypedValue typedValueM8263d = m8263d(context, i10);
        if (typedValueM8263d == null || typedValueM8263d.type != 18) {
            return z6;
        }
        return typedValueM8263d.data != 0;
    }

    /* JADX INFO: renamed from: f */
    public static TypedValue m8265f(int i10, Context context, String str) {
        TypedValue typedValueM8263d = m8263d(context, i10);
        if (typedValueM8263d != null) {
            return typedValueM8263d;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    /* JADX INFO: renamed from: g */
    public static ByteBuffer m8266g(Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        byte[] bArr = new byte[i13 + i13 + i12];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i14 = (i12 + i12) / 4;
        boolean z6 = buffer2.remaining() == i14 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z6) {
            planeArr[0].getBuffer().get(bArr, 0, i12);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i12, 1);
            buffer3.get(bArr, i12 + 1, i14 - 1);
        } else {
            m8270k(planeArr[0], i10, i11, bArr, 0, 1);
            m8270k(planeArr[1], i10, i11, bArr, i12 + 1, 2);
            m8270k(planeArr[2], i10, i11, bArr, i12, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: h */
    public static ByteBuffer m8267h(ByteBuffer byteBuffer, boolean z6) {
        int i10;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z6 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i12 = 0;
        while (true) {
            i10 = i11 * 4;
            if (i12 >= i10) {
                break;
            }
            byteBufferAllocate.put(i12, byteBuffer.get(i12));
            i12++;
        }
        for (int i13 = 0; i13 < i11 + i11; i13++) {
            byteBufferAllocate.put(i10 + i13, byteBuffer.get((i13 / 2) + ((i13 % 2) * i11) + i10));
        }
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: i */
    public static Bitmap m8268i(Bitmap bitmap, int i10, int i11, int i12) {
        if (i10 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m8269j(byte[] bArr, int i10, int i11) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i10, i11, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i10, i11), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            AbstractC15256t.m16482t("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new C6584a(13, e10, "Image conversion error from NV21 format");
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m8270k(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i14 = i10 / (i11 / rowStride);
        int rowStride2 = 0;
        for (int i15 = 0; i15 < rowStride; i15++) {
            int pixelStride = rowStride2;
            for (int i16 = 0; i16 < i14; i16++) {
                bArr[i12] = buffer.get(pixelStride);
                i12 += i13;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }
}
