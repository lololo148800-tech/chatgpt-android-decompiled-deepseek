package p523V9;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p007A5.AbstractC0371f;
import p102Dm.AbstractC2119a;
import p1096x2.C21113h;
import p1098x5.C21129h;
import p1098x5.EnumC21128g;
import p315Me.Myis.CxcULo;
import p470T4.AbstractC7255t;
import p571X9.AbstractC9189P2;
import p817j$.util.concurrent.ConcurrentHashMap;
import p955q2.C18613e;

/* JADX INFO: renamed from: V9.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8020X {
    public AbstractC8020X() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static String m8351a(int i10, int i11, String str) {
        if (i10 < 0) {
            return AbstractC8027Y.m8374e("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return AbstractC8027Y.m8374e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
    }

    /* JADX INFO: renamed from: b */
    public static void m8352b(boolean z6, String str, long j10) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC8027Y.m8374e(str, Long.valueOf(j10)));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8353c(int i10, int i11) {
        String strM8374e;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM8374e = AbstractC8027Y.m8374e(CxcULo.nSLQ, "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
                }
                strM8374e = AbstractC8027Y.m8374e("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM8374e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8354d(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m8351a(i10, i11, "index"));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8355e(int i10, int i11, int i12) {
        String strM8351a;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM8351a = m8351a(i10, i12, "start index");
            } else {
                strM8351a = (i11 < 0 || i11 > i12) ? m8351a(i11, i12, "end index") : AbstractC8027Y.m8374e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM8351a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p571X9.AbstractC9189P2.m9749a(r9, r1, kotlin.jvm.internal.AbstractC16544l.m18089b(r7, r2) ? r0.getWidth() : p007A5.AbstractC0371f.m1005e(r7.f67132a, r8), kotlin.jvm.internal.AbstractC16544l.m18089b(r7, r2) ? r0.getHeight() : p007A5.AbstractC0371f.m1005e(r7.f67133b, r8), r8) == 1.0d) goto L24;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m8356f(Drawable drawable, Bitmap.Config config, C21129h c21129h, EnumC21128g enumC21128g, boolean z6) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || AbstractC7255t.m7696d(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z6) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    C21129h c21129h2 = C21129h.f67131c;
                }
                return bitmap3;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        Bitmap.Config config2 = AbstractC0371f.f1262a;
        boolean z10 = drawableMutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z10 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? drawableMutate.getIntrinsicWidth() : bitmap2.getWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z10 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? drawableMutate.getIntrinsicHeight() : bitmap.getHeight();
        int i10 = intrinsicHeight > 0 ? intrinsicHeight : 512;
        C21129h c21129h3 = C21129h.f67131c;
        double dM9749a = AbstractC9189P2.m9749a(intrinsicWidth, i10, AbstractC16544l.m18089b(c21129h, c21129h3) ? intrinsicWidth : AbstractC0371f.m1005e(c21129h.f67132a, enumC21128g), AbstractC16544l.m18089b(c21129h, c21129h3) ? i10 : AbstractC0371f.m1005e(c21129h.f67133b, enumC21128g), enumC21128g);
        int iM3194h = AbstractC2119a.m3194h(((double) intrinsicWidth) * dM9749a);
        int iM3194h2 = AbstractC2119a.m3194h(dM9749a * ((double) i10));
        if (config == null || AbstractC7255t.m7696d(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM3194h, iM3194h2, config);
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iM3194h, iM3194h2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: g */
    public abstract Typeface mo8357g(Context context, C18613e c18613e, Resources resources, int i10);

    /* JADX INFO: renamed from: h */
    public abstract Typeface mo8358h(Context context, C21113h[] c21113hArr, int i10);

    /* JADX INFO: renamed from: i */
    public Typeface mo8359i(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: j */
    public Typeface mo8360j(Context context, InputStream inputStream) {
        File fileM8373d = AbstractC8027Y.m8373d(context);
        if (fileM8373d == null) {
            return null;
        }
        try {
            if (AbstractC8027Y.m8372c(fileM8373d, inputStream)) {
                return Typeface.createFromFile(fileM8373d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM8373d.delete();
        }
    }

    /* JADX INFO: renamed from: k */
    public Typeface mo8361k(Context context, Resources resources, int i10, String str, int i11) {
        File fileM8373d = AbstractC8027Y.m8373d(context);
        if (fileM8373d == null) {
            return null;
        }
        try {
            if (AbstractC8027Y.m8371b(fileM8373d, resources, i10)) {
                return Typeface.createFromFile(fileM8373d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM8373d.delete();
        }
    }

    /* JADX INFO: renamed from: l */
    public C21113h mo8362l(C21113h[] c21113hArr, int i10) {
        int i11 = (i10 & 1) == 0 ? RCHTTPStatusCodes.BAD_REQUEST : 700;
        boolean z6 = (i10 & 2) != 0;
        C21113h c21113h = null;
        int i12 = Integer.MAX_VALUE;
        for (C21113h c21113h2 : c21113hArr) {
            int iAbs = (Math.abs(c21113h2.f67065c - i11) * 2) + (c21113h2.f67066d == z6 ? 0 : 1);
            if (c21113h == null || i12 > iAbs) {
                c21113h = c21113h2;
                i12 = iAbs;
            }
        }
        return c21113h;
    }
}
