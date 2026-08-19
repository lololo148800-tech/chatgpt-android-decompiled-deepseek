package p033B5;

import al.C10746d;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import ao.AbstractC11153a0;
import coil.compose.AsyncImagePainter;
import fo.C13711h;
import io.ktor.utils.p815io.InterfaceC15088n;
import io.sentry.internal.debugmeta.C15384c;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ml.AbstractC17286d;
import ml.AbstractC17288f;
import mm.C17296C;
import mm.C17309l;
import mo.C17356w;
import mo.InterfaceC17337d;
import p007A5.AbstractC0371f;
import p008A6.C0386f;
import p023Al.C0556b;
import p025An.C0631p0;
import p025An.C0644w;
import p026Ao.AbstractC0668b;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p026Ao.InterfaceC0677k;
import p049Bm.InterfaceC1426a;
import p1009s9.C19506i;
import p102Dm.AbstractC2119a;
import p1057v6.C20467g;
import p1075w5.C20831i;
import p1075w5.C20835m;
import p1076w6.C20848f;
import p1098x5.C21129h;
import p1098x5.EnumC21128g;
import p111E5.AbstractC2331o;
import p111E5.C2318b;
import p111E5.C2321e;
import p111E5.C2325i;
import p111E5.C2328l;
import p111E5.C2329m;
import p1139z0.C21585H;
import p135F5.C2672h;
import p185H6.C3258n;
import p225Im.InterfaceC3756d;
import p228J.AbstractC3794B0;
import p228J.AbstractC3812N;
import p259K5.C4541c;
import p259K5.C4544f;
import p354O5.C6133c;
import p355O7.C6141c;
import p374P5.AbstractC6355h;
import p374P5.AbstractC6356i;
import p374P5.C6361n;
import p397Q5.C6579h;
import p397Q5.EnumC6575d;
import p397Q5.EnumC6578g;
import p409Qk.C6752c;
import p420R5.AbstractC6811b;
import p420R5.C6812c;
import p420R5.C6813d;
import p420R5.C6814e;
import p449S9.C7042K;
import p470T4.AbstractC7255t;
import p477Tb.C7296c;
import p488Tn.C7518a;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8198t4;
import p538W2.C8422g;
import p544W9.AbstractC8682o;
import p559Wn.C8972d;
import p571X9.AbstractC9131F4;
import p571X9.AbstractC9195Q2;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9393x3;
import p606Yn.C10101b;
import p606Yn.C10102c;
import p606Yn.C10106g;
import p615Z6.C10194T;
import p615Z6.C10205c;
import p615Z6.C10235r;
import p654b1.AbstractC11212f;
import p658b5.C11238i;
import p658b5.C11248s;
import p664bc.AbstractC11336c;
import p899n5.AbstractC17494k;
import p899n5.AbstractC17495l;
import p899n5.AbstractC17497n;
import p899n5.C17487d;
import p899n5.C17489f;
import p899n5.C17492i;
import p899n5.C17499p;
import p942p6.C18297a;
import p942p6.C18302f;

/* JADX INFO: renamed from: B5.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0819c implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2285Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f2286Z;

    public /* synthetic */ C0819c(Object obj, int i10) {
        this.f2285Y = i10;
        this.f2286Z = obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int largeMemoryClass;
        boolean z6;
        C2328l c2328l;
        int i10;
        Bitmap bitmapCreateBitmap;
        int i11;
        int i12;
        int iMin;
        double dMax;
        Throwable th2;
        C15384c c15384c;
        char c9;
        float[] fArr;
        float f10;
        float f11;
        float f12;
        float fMax;
        C17492i c17492i;
        int i13;
        int i14;
        int iMin2;
        double dMax2;
        Bitmap bitmapCreateBitmap2;
        ColorSpace colorSpace;
        String str = HJrCuD.exDBCpLVQvEQd;
        int i15 = 2;
        int i16 = 1;
        Object obj = this.f2286Z;
        switch (this.f2285Y) {
            case 0:
                return AbstractC9393x3.m9974d((C17309l) obj);
            case 1:
                Context context = (Context) ((C11238i) obj).f34008Y;
                double d10 = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    AbstractC16544l.m18091d(systemService);
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d10 = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d10 || d10 > 1.0d) {
                    throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
                }
                C4544f c4544f = new C4544f(0);
                try {
                    Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                    AbstractC16544l.m18091d(systemService2);
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                long j10 = (long) (d10 * ((long) largeMemoryClass) * 1048576);
                return new C4541c(j10 > 0 ? new C11248s(j10, c4544f) : new C7296c(c4544f, 16), c4544f);
            case 2:
                BitmapFactory.Options options = new BitmapFactory.Options();
                C2321e c2321e = (C2321e) obj;
                C2318b c2318b = new C2318b(c2321e.f7218a.mo3429O0(), 0);
                C0657F c0657fM1403c = AbstractC0668b.m1403c(c2318b);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new C0556b(c0657fM1403c.peek(), 2), null, options);
                Exception exc = (Exception) c2318b.f7210o0;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = AbstractC2331o.f7240a;
                String str2 = options.outMimeType;
                switch (c2321e.f7221d.f7239a) {
                    case 0:
                        if (str2 == null || (!str2.equals("image/jpeg") && !str2.equals("image/webp") && !str2.equals("image/heic") && !str2.equals("image/heif"))) {
                            z6 = false;
                            break;
                        }
                    default:
                        z6 = true;
                        break;
                }
                if (z6) {
                    C8422g c8422g = new C8422g(new C2329m(new C0556b(c0657fM1403c.peek(), 2), 0));
                    int iM9002d = c8422g.m9002d(1, "Orientation");
                    c2328l = new C2328l(iM9002d == 2 || iM9002d == 7 || iM9002d == 4 || iM9002d == 5, c8422g.m9011m());
                } else {
                    c2328l = C2328l.f7231c;
                }
                Exception exc2 = (Exception) c2318b.f7210o0;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                int i17 = Build.VERSION.SDK_INT;
                C6361n c6361n = c2321e.f7219b;
                if (i17 >= 26) {
                    C19506i c19506i = AbstractC6356i.f20687d;
                    if (AbstractC11212f.m12421k(AbstractC0833q.m1892e(c6361n, c19506i)) != null) {
                        options.inPreferredColorSpace = AbstractC11212f.m12421k(AbstractC0833q.m1892e(c6361n, c19506i));
                    }
                }
                options.inPremultiplied = ((Boolean) AbstractC0833q.m1892e(c6361n, AbstractC6356i.f20688e)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) AbstractC0833q.m1892e(c6361n, AbstractC6356i.f20686c);
                int i18 = c2328l.f7233b;
                boolean z10 = c2328l.f7232a;
                if ((z10 || i18 > 0) && (config == null || AbstractC9131F4.m9673b(config))) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) AbstractC0833q.m1892e(c6361n, AbstractC6356i.f20692i)).booleanValue() && config == Bitmap.Config.ARGB_8888 && AbstractC16544l.m18089b(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                if (i17 >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && config != Bitmap.Config.HARDWARE) {
                    config = Bitmap.Config.RGBA_F16;
                }
                options.inPreferredConfig = config;
                int i19 = options.outWidth;
                if (i19 <= 0 || (i11 = options.outHeight) <= 0) {
                    i10 = i18;
                    options.inSampleSize = 1;
                    options.inScaled = false;
                } else {
                    int i20 = (i18 == 90 || i18 == 270) ? i11 : i19;
                    if (i18 != 90 && i18 != 270) {
                        i19 = i11;
                    }
                    C6579h c6579h = (C6579h) AbstractC0833q.m1892e(c6361n, AbstractC6355h.f20682a);
                    C6579h c6579h2 = c6361n.f20698b;
                    EnumC6578g enumC6578g = c6361n.f20699c;
                    long jM8799b = AbstractC8198t4.m8799b(i20, i19, c6579h2, enumC6578g, c6579h);
                    int i21 = (int) (jM8799b >> 32);
                    int i22 = (int) (jM8799b & 4294967295L);
                    int iHighestOneBit = Integer.highestOneBit(i20 / i21);
                    int iHighestOneBit2 = Integer.highestOneBit(i19 / i22);
                    int iOrdinal = enumC6578g.ordinal();
                    if (iOrdinal != 0) {
                        i12 = 1;
                        if (iOrdinal != 1) {
                            throw new C0644w();
                        }
                        iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                    } else {
                        i12 = 1;
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                    }
                    if (iMin < i12) {
                        iMin = 1;
                    }
                    options.inSampleSize = iMin;
                    double d11 = i20;
                    double d12 = iMin;
                    double d13 = ((double) i19) / d12;
                    i10 = i18;
                    double d14 = ((double) i21) / (d11 / d12);
                    double d15 = ((double) i22) / d13;
                    int iOrdinal2 = enumC6578g.ordinal();
                    if (iOrdinal2 == 0) {
                        dMax = Math.max(d14, d15);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new C0644w();
                        }
                        dMax = Math.min(d14, d15);
                    }
                    if (c6361n.f20700d == EnumC6575d.f21259Z && dMax > 1.0d) {
                        dMax = 1.0d;
                    }
                    boolean z11 = dMax == 1.0d;
                    options.inScaled = !z11;
                    if (!z11) {
                        if (dMax > 1.0d) {
                            options.inDensity = AbstractC2119a.m3194h(((double) Integer.MAX_VALUE) / dMax);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = AbstractC2119a.m3194h(((double) Integer.MAX_VALUE) * dMax);
                        }
                    }
                }
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new C0556b(c0657fM1403c, 2), null, options);
                    AbstractC7942M5.m8232a(c0657fM1403c, null);
                    Exception exc3 = (Exception) c2318b.f7210o0;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                    }
                    Context context2 = c6361n.f20697a;
                    bitmapDecodeStream.setDensity(context2.getResources().getDisplayMetrics().densityDpi);
                    if (z10 || i10 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z10) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i10 > 0) {
                            matrix.postRotate(i10, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f13 = rectF.left;
                        if (f13 != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f13, -rectF.top);
                        }
                        if (i10 == 90 || i10 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config2 = bitmapDecodeStream.getConfig();
                            if (config2 == null) {
                                config2 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config2);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config3 = bitmapDecodeStream.getConfig();
                            if (config3 == null) {
                                config3 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config3);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC2331o.f7240a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    InterfaceC0829m interfaceC0829mM1890c = AbstractC0833q.m1890c(new BitmapDrawable(context2.getResources(), bitmapDecodeStream));
                    boolean z12 = true;
                    if (options.inSampleSize <= 1 && !options.inScaled) {
                        z12 = false;
                    }
                    return new C2325i(interfaceC0829mM1890c, z12);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC7942M5.m8232a(c0657fM1403c, th3);
                        throw th4;
                    }
                }
            case 3:
                return (C17356w) obj;
            case 4:
                C3258n c3258n = (C3258n) obj;
                AbstractC16544l.m18094g(c3258n, str);
                return (InterfaceC17337d) c3258n.f9920Y.invoke();
            case 5:
                return (C2672h) ((C0840x) obj).f2343a.f2319d.getValue();
            case 6:
                return new C6133c((C6752c) obj);
            case 7:
                C6813d c6813d = (C6813d) obj;
                InterfaceC0677k interfaceC0677kMo3429O0 = c6813d.f21857a.mo3429O0();
                try {
                    c15384c = new C15384c(C13711h.m15180u(interfaceC0677kMo3429O0.mo1349T0()), 13);
                    try {
                        interfaceC0677kMo3429O0.close();
                        th2 = null;
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                } catch (Throwable th6) {
                    try {
                        interfaceC0677kMo3429O0.close();
                    } catch (Throwable th7) {
                        AbstractC9221V.m9789a(th6, th7);
                    }
                    th2 = th6;
                    c15384c = null;
                    break;
                }
                if (th2 != null) {
                    throw th2;
                }
                RectF rectFM15199q = ((C13711h) c15384c.f47967Z).m15199q();
                if (rectFM15199q != null) {
                    c9 = 2;
                    fArr = new float[]{rectFM15199q.left, rectFM15199q.top, rectFM15199q.right, rectFM15199q.bottom};
                } else {
                    c9 = 2;
                    fArr = null;
                }
                boolean z13 = c6813d.f21859c;
                C13711h c13711h = (C13711h) c15384c.f47967Z;
                if (z13 && fArr != null) {
                    f10 = fArr[c9] - fArr[0];
                    f11 = fArr[3] - fArr[1];
                } else {
                    if (((C10194T) c13711h.f43259Z) == null) {
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    f10 = c13711h.m15198o().f30392d;
                    if (((C10194T) c13711h.f43259Z) == null) {
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    f11 = c13711h.m15198o().f30393e;
                }
                boolean z14 = c6813d.f21861e;
                C6361n c6361n2 = c6813d.f21858b;
                if (z14 && AbstractC16544l.m18089b(c6361n2.f20698b, C6579h.f21264c)) {
                    float f14 = c6361n2.f20697a.getResources().getDisplayMetrics().density;
                    f12 = 0.0f;
                    if (f10 > 0.0f) {
                        f10 *= f14;
                    }
                    if (f11 > 0.0f) {
                        f11 *= f14;
                    }
                } else {
                    f12 = 0.0f;
                }
                int iM3195i = f10 > f12 ? AbstractC2119a.m3195i(f10) : 512;
                int iM3195i2 = f11 > f12 ? AbstractC2119a.m3195i(f11) : 512;
                C6579h c6579h3 = c6361n2.f20698b;
                C6579h c6579h4 = (C6579h) AbstractC0833q.m1892e(c6361n2, AbstractC6355h.f20682a);
                EnumC6578g enumC6578g2 = c6361n2.f20699c;
                long jM8799b2 = AbstractC8198t4.m8799b(iM3195i, iM3195i2, c6579h3, enumC6578g2, c6579h4);
                int i23 = (int) (jM8799b2 >> 32);
                int i24 = (int) (jM8799b2 & 4294967295L);
                if (f10 > f12 && f11 > f12) {
                    float f15 = i23 / f10;
                    float f16 = i24 / f11;
                    int iOrdinal3 = enumC6578g2.ordinal();
                    if (iOrdinal3 == 0) {
                        fMax = Math.max(f15, f16);
                    } else {
                        if (iOrdinal3 != 1) {
                            throw new C0644w();
                        }
                        fMax = Math.min(f15, f16);
                    }
                    i23 = (int) (fMax * f10);
                    i24 = (int) (fMax * f11);
                    if (fArr == null) {
                        float[] fArr2 = {0.0f, 0.0f, f10, f11};
                        float f17 = fArr2[0];
                        float f18 = fArr2[1];
                        float f19 = fArr2[2] - f17;
                        float f20 = fArr2[3] - f18;
                        C10194T c10194t = (C10194T) c13711h.f43259Z;
                        if (c10194t == null) {
                            throw new IllegalArgumentException("SVG document is empty");
                        }
                        c10194t.f30328o = new C10235r(f17, f18, f19, f20);
                    }
                }
                C10194T c10194t2 = (C10194T) c13711h.f43259Z;
                if (c10194t2 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                c10194t2.f30297r = C6141c.m6695t("100%");
                C10194T c10194t3 = (C10194T) c13711h.f43259Z;
                if (c10194t3 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                c10194t3.f30298s = C6141c.m6695t("100%");
                String str3 = (String) AbstractC0833q.m1892e(c6361n2, AbstractC6811b.f21853a);
                if (str3 != null) {
                    C21585H c21585h = new C21585H(11, (byte) 0);
                    C7042K c7042k = new C7042K(2);
                    C10205c c10205c = new C10205c(str3);
                    c10205c.m5081M();
                    c21585h.f68344Z = c7042k.m7438h(c10205c);
                    c15384c.f47968o0 = c21585h;
                }
                InterfaceC0829m c6814e = new C6814e(c13711h, (C21585H) c15384c.f47968o0, i23, i24);
                boolean z15 = c6813d.f21860d;
                if (z15) {
                    Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i23, i24, Bitmap.Config.ARGB_8888);
                    c6814e.mo1878d(new Canvas(bitmapCreateBitmap3));
                    c6814e = new C0817a(bitmapCreateBitmap3, true);
                }
                return new C2325i(c6814e, z15);
            case 8:
                return AbstractC9393x3.m9974d((C6812c) obj);
            case 9:
                return ((AbstractC17286d) ((AbstractC17288f) obj)).mo7533e();
            case 10:
                ((C0631p0) obj).m1279g0();
                return C17296C.f55119a;
            case 11:
                return ((C10746d) obj).m11037a();
            case 12:
                C8972d c8972d = (C8972d) obj;
                C10106g c10106gM12774d = AbstractC11336c.m12774d("kotlinx.serialization.Polymorphic", C10102c.f29908b, new SerialDescriptor[0], new C0386f(c8972d, 18));
                InterfaceC3756d context3 = c8972d.f27406a;
                AbstractC16544l.m18094g(context3, "context");
                return new C10101b(c10106gM12774d, context3);
            case 13:
                C10106g c10106g = (C10106g) obj;
                return Integer.valueOf(AbstractC11153a0.m12384g(c10106g, c10106g.f29929k));
            case 14:
                return (InterfaceC15088n) obj;
            case 15:
                C7518a c7518a = new C7518a();
                AbstractC8682o.m9381d(c7518a, (byte[]) obj);
                return c7518a;
            case 16:
                return (C20831i) ((AsyncImagePainter) obj).f35876E0.getValue();
            case 17:
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                C17487d c17487d = (C17487d) obj;
                AbstractC17497n abstractC17497n = c17487d.f55947a;
                C2318b c2318b2 = new C2318b(abstractC17497n.mo19197O0(), i16);
                C0657F c0657fM1403c2 = AbstractC0668b.m1403c(c2318b2);
                options2.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new C0556b(c0657fM1403c2.peek(), i15), null, options2);
                Exception exc4 = (Exception) c2318b2.f7210o0;
                if (exc4 != null) {
                    throw exc4;
                }
                options2.inJustDecodeBounds = false;
                Paint paint2 = AbstractC17494k.f55963a;
                String str4 = options2.outMimeType;
                Set set = AbstractC17495l.f55964a;
                int iOrdinal4 = c17487d.f55950d.ordinal();
                if (iOrdinal4 == 0) {
                    c17492i = C17492i.f55958c;
                } else {
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            throw new C0644w();
                        }
                    } else if (str4 == null || !AbstractC17495l.f55964a.contains(str4)) {
                        c17492i = C17492i.f55958c;
                    }
                    C8422g c8422g2 = new C8422g(new C2329m(new C0556b(c0657fM1403c2.peek(), i15), 1));
                    int iM9002d2 = c8422g2.m9002d(1, "Orientation");
                    c17492i = new C17492i(iM9002d2 == 2 || iM9002d2 == 7 || iM9002d2 == 4 || iM9002d2 == 5, c8422g2.m9011m());
                }
                Exception exc5 = (Exception) c2318b2.f7210o0;
                if (exc5 != null) {
                    throw exc5;
                }
                options2.inMutable = false;
                int i25 = Build.VERSION.SDK_INT;
                C20835m c20835m = c17487d.f55948b;
                if (i25 >= 26 && (colorSpace = c20835m.f66240c) != null) {
                    options2.inPreferredColorSpace = colorSpace;
                }
                options2.inPremultiplied = c20835m.f66245h;
                int i26 = c17492i.f55960b;
                Bitmap.Config config4 = c20835m.f66239b;
                boolean z16 = c17492i.f55959a;
                if ((z16 || i26 > 0) && (config4 == null || AbstractC7255t.m7696d(config4))) {
                    config4 = Bitmap.Config.ARGB_8888;
                }
                if (c20835m.f66244g && config4 == Bitmap.Config.ARGB_8888 && AbstractC16544l.m18089b(options2.outMimeType, "image/jpeg")) {
                    config4 = Bitmap.Config.RGB_565;
                }
                if (i25 >= 26 && options2.outConfig == Bitmap.Config.RGBA_F16 && config4 != Bitmap.Config.HARDWARE) {
                    config4 = Bitmap.Config.RGBA_F16;
                }
                options2.inPreferredConfig = config4;
                AbstractC9195Q2 abstractC9195Q2Mo19198a = abstractC17497n.mo19198a();
                boolean z17 = abstractC9195Q2Mo19198a instanceof C17499p;
                Context context4 = c20835m.f66238a;
                C21129h c21129h = c20835m.f66241d;
                if (z17 && AbstractC16544l.m18089b(c21129h, C21129h.f67131c)) {
                    options2.inSampleSize = 1;
                    options2.inScaled = true;
                    options2.inDensity = ((C17499p) abstractC9195Q2Mo19198a).f55973a;
                    options2.inTargetDensity = context4.getResources().getDisplayMetrics().densityDpi;
                    z16 = z16;
                    i26 = i26;
                } else {
                    int i27 = options2.outWidth;
                    if (i27 <= 0 || (i13 = options2.outHeight) <= 0) {
                        options2.inSampleSize = 1;
                        options2.inScaled = false;
                    } else {
                        int i28 = (i26 == 90 || i26 == 270) ? i13 : i27;
                        if (i26 != 90 && i26 != 270) {
                            i27 = i13;
                        }
                        C21129h c21129h2 = C21129h.f67131c;
                        boolean zM18089b = AbstractC16544l.m18089b(c21129h, c21129h2);
                        EnumC21128g enumC21128g = c20835m.f66242e;
                        int iM1005e = zM18089b ? i28 : AbstractC0371f.m1005e(c21129h.f67132a, enumC21128g);
                        int iM1005e2 = AbstractC16544l.m18089b(c21129h, c21129h2) ? i27 : AbstractC0371f.m1005e(c21129h.f67133b, enumC21128g);
                        int iHighestOneBit3 = Integer.highestOneBit(i28 / iM1005e);
                        int iHighestOneBit4 = Integer.highestOneBit(i27 / iM1005e2);
                        int iOrdinal5 = enumC21128g.ordinal();
                        if (iOrdinal5 != 0) {
                            i14 = 1;
                            if (iOrdinal5 != 1) {
                                throw new C0644w();
                            }
                            iMin2 = Math.max(iHighestOneBit3, iHighestOneBit4);
                        } else {
                            i14 = 1;
                            iMin2 = Math.min(iHighestOneBit3, iHighestOneBit4);
                        }
                        if (iMin2 < i14) {
                            iMin2 = 1;
                        }
                        options2.inSampleSize = iMin2;
                        double d16 = iMin2;
                        double d17 = ((double) i28) / d16;
                        i26 = i26;
                        double d18 = ((double) i27) / d16;
                        double d19 = iM1005e;
                        z16 = z16;
                        double d20 = d19 / d17;
                        double d21 = ((double) iM1005e2) / d18;
                        int iOrdinal6 = enumC21128g.ordinal();
                        if (iOrdinal6 == 0) {
                            dMax2 = Math.max(d20, d21);
                        } else {
                            if (iOrdinal6 != 1) {
                                throw new C0644w();
                            }
                            dMax2 = Math.min(d20, d21);
                        }
                        if (c20835m.f66243f && dMax2 > 1.0d) {
                            dMax2 = 1.0d;
                        }
                        boolean z18 = dMax2 == 1.0d;
                        options2.inScaled = !z18;
                        if (!z18) {
                            if (dMax2 > 1.0d) {
                                options2.inDensity = AbstractC2119a.m3194h(((double) Integer.MAX_VALUE) / dMax2);
                                options2.inTargetDensity = Integer.MAX_VALUE;
                            } else {
                                options2.inDensity = Integer.MAX_VALUE;
                                options2.inTargetDensity = AbstractC2119a.m3194h(((double) Integer.MAX_VALUE) * dMax2);
                            }
                        }
                    }
                }
                try {
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(new C0556b(c0657fM1403c2, 2), null, options2);
                    AbstractC7942M5.m8232a(c0657fM1403c2, null);
                    Exception exc6 = (Exception) c2318b2.f7210o0;
                    if (exc6 != null) {
                        throw exc6;
                    }
                    if (bitmapDecodeStream2 == null) {
                        throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                    }
                    bitmapDecodeStream2.setDensity(context4.getResources().getDisplayMetrics().densityDpi);
                    if (z16 || i26 > 0) {
                        Matrix matrix2 = new Matrix();
                        float width4 = bitmapDecodeStream2.getWidth() / 2.0f;
                        float height4 = bitmapDecodeStream2.getHeight() / 2.0f;
                        if (z16) {
                            matrix2.postScale(-1.0f, 1.0f, width4, height4);
                        }
                        if (i26 > 0) {
                            matrix2.postRotate(i26, width4, height4);
                        }
                        RectF rectF2 = new RectF(0.0f, 0.0f, bitmapDecodeStream2.getWidth(), bitmapDecodeStream2.getHeight());
                        matrix2.mapRect(rectF2);
                        float f21 = rectF2.left;
                        if (f21 != 0.0f || rectF2.top != 0.0f) {
                            matrix2.postTranslate(-f21, -rectF2.top);
                        }
                        if (i26 == 90 || i26 == 270) {
                            int height5 = bitmapDecodeStream2.getHeight();
                            int width5 = bitmapDecodeStream2.getWidth();
                            Bitmap.Config config5 = bitmapDecodeStream2.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap2 = Bitmap.createBitmap(height5, width5, config5);
                        } else {
                            int width6 = bitmapDecodeStream2.getWidth();
                            int height6 = bitmapDecodeStream2.getHeight();
                            Bitmap.Config config6 = bitmapDecodeStream2.getConfig();
                            if (config6 == null) {
                                config6 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap2 = Bitmap.createBitmap(width6, height6, config6);
                        }
                        new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapDecodeStream2, matrix2, AbstractC17494k.f55963a);
                        bitmapDecodeStream2.recycle();
                        bitmapDecodeStream2 = bitmapCreateBitmap2;
                    }
                    return new C17489f(new BitmapDrawable(context4.getResources(), bitmapDecodeStream2), options2.inSampleSize > 1 || options2.inScaled);
                } catch (Throwable th8) {
                    try {
                        throw th8;
                    } catch (Throwable th9) {
                        AbstractC7942M5.m8232a(c0657fM1403c2, th8);
                        throw th9;
                    }
                }
            case 18:
                return AbstractC16544l.m18098k((Object[]) obj);
            case 19:
                return ((Iterable) obj).iterator();
            case 20:
                C18302f c18302f = (C18302f) obj;
                AbstractC16544l.m18094g(c18302f, str);
                C18297a c18297a = new C18297a();
                C0656E c0656eM1402b = AbstractC0668b.m1402b(c18297a);
                c18302f.m19840a(c0656eM1402b);
                c0656eM1402b.flush();
                long j11 = c18297a.f58410Y;
                Iterator it = c18302f.f58419Y.values().iterator();
                if (it.hasNext()) {
                    throw AbstractC3794B0.m4497v(it);
                }
                return Long.valueOf(j11);
            case 21:
                return obj;
            default:
                C20848f c20848f = new C20848f();
                AbstractC3812N abstractC3812NM4536t = ((C20467g) obj).m4536t();
                AbstractC3812N abstractC3812N = c20848f;
                while (true) {
                    AbstractC3812N abstractC3812N2 = (AbstractC3812N) abstractC3812N.f11539Z;
                    if (abstractC3812N2 == null) {
                        abstractC3812N.f11539Z = abstractC3812NM4536t;
                        return c20848f;
                    }
                    abstractC3812N = abstractC3812N2;
                }
                break;
        }
    }
}
