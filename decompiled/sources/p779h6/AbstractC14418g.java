package p779h6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;
import p003A1.C0284r0;

/* JADX INFO: renamed from: h6.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14418g {

    /* JADX INFO: renamed from: a */
    public static final C0284r0 f45308a = new C0284r0(8);

    /* JADX INFO: renamed from: b */
    public static final C0284r0 f45309b = new C0284r0(9);

    /* JADX INFO: renamed from: c */
    public static final C0284r0 f45310c = new C0284r0(10);

    /* JADX INFO: renamed from: d */
    public static final C0284r0 f45311d = new C0284r0(11);

    /* JADX INFO: renamed from: e */
    public static final float f45312e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: a */
    public static void m15930a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = (PathMeasure) f45308a.get();
        Path path2 = (Path) f45309b.get();
        Path path3 = (Path) f45310c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f10 == 1.0f && f11 == 0.0f) && length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float fMin = Math.min(f13, f14) + f15;
            float fMax = Math.max(f13, f14) + f15;
            if (fMin >= length && fMax >= length) {
                fMin = AbstractC14417f.m15926c(fMin, length);
                fMax = AbstractC14417f.m15926c(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = AbstractC14417f.m15926c(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = AbstractC14417f.m15926c(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15931b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m15932c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m15933d(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
