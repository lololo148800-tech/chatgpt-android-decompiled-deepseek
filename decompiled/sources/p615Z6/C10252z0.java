package p615Z6;

import android.R;
import android.content.pm.PackageInfo;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Menu;
import androidx.work.impl.utils.p651oZ.HhJS;
import bb.AbstractC11330w;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import fo.C13711h;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.internal.debugmeta.C15384c;
import java.io.IOException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import mo.C17324A;
import mo.C17327D;
import mo.C17352s;
import mo.C17356w;
import mo.C17358y;
import mo.InterfaceC17337d;
import no.AbstractC17708b;
import p001A.AbstractC0010F;
import p001A.C0072l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p080D0.C1832u;
import p1061vb.C20512c;
import p1061vb.InterfaceC20515f;
import p1104xb.InterfaceC21170a;
import p1113xn.AbstractC21329w;
import p1125yb.C21395a;
import p1125yb.C21397c;
import p1125yb.InterfaceC21398d;
import p117Eb.C2388r;
import p127El.ExecutorC2575a;
import p167Gb.C3031b;
import p257K3.C4535c;
import p437Rn.C6950h;
import p449S9.C7042K;
import p521V6.C7808a;
import p523V9.AbstractC7854B5;
import p523V9.AbstractC7889G0;
import p571X9.AbstractC9282f0;
import p571X9.AbstractC9393x3;
import p593Y8.C9681h;
import p593Y8.C9685l;
import p658b5.C11238i;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p666bl.C11500p;
import p676c7.C11682a;
import p721e7.C13289a;
import p721e7.InterfaceC13290b;
import p722e8.C13298H;
import p746fa.C13606o;
import p791hj.C14522e;
import p832jb.C16187g;
import p887m7.C17175a;
import p887m7.C17184j;
import p887m7.C17185k;
import p887m7.C17186l;
import p887m7.C17187m;
import p887m7.C17188n;
import p887m7.C17189o;
import p887m7.C17190p;
import p887m7.C17191q;
import p887m7.C17192r;
import p887m7.C17193s;
import p887m7.InterfaceC17178d;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p938p2.AbstractC18290d;
import p985r9.C18892b;
import p985r9.C18894d;
import p985r9.C18902l;
import p985r9.C18903m;
import p985r9.ExecutorC18898h;

/* JADX INFO: renamed from: Z6.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10252z0 implements InterfaceC17178d {

    /* JADX INFO: renamed from: s0 */
    public static HashSet f30453s0;

    /* JADX INFO: renamed from: Y */
    public Object f30454Y;

    /* JADX INFO: renamed from: Z */
    public Object f30455Z;

    /* JADX INFO: renamed from: o0 */
    public Object f30456o0;

    /* JADX INFO: renamed from: p0 */
    public Object f30457p0;

    /* JADX INFO: renamed from: q0 */
    public Object f30458q0;

    /* JADX INFO: renamed from: r0 */
    public Object f30459r0;

    public C10252z0(String issuer, C7808a c7808a) {
        AbstractC16544l.m18094g(issuer, "issuer");
        this.f30454Y = issuer;
        this.f30455Z = c7808a;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m10802E(C10193S c10193s, long j10) {
        return (c10193s.f30280Y & j10) != 0;
    }

    /* JADX INFO: renamed from: H */
    public static Path m10803H(C10188M c10188m) {
        Path path = new Path();
        float[] fArr = c10188m.f30248o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = c10188m.f30248o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (c10188m instanceof C10189N) {
            path.close();
        }
        if (c10188m.f30304h == null) {
            c10188m.f30304h = m10808h(path);
        }
        return path;
    }

    /* JADX INFO: renamed from: V */
    public static void m10804V(C10248x0 c10248x0, boolean z6, AbstractC10204b0 abstractC10204b0) {
        int i10;
        C10193S c10193s = c10248x0.f30432a;
        float fFloatValue = (z6 ? c10193s.f30283o0 : c10193s.f30285q0).floatValue();
        if (abstractC10204b0 instanceof C10241u) {
            i10 = ((C10241u) abstractC10204b0).f30416Y;
        } else if (!(abstractC10204b0 instanceof C10243v)) {
            return;
        } else {
            i10 = c10248x0.f30432a.f30291w0.f30416Y;
        }
        int iM10811n = m10811n(i10, fFloatValue);
        if (z6) {
            c10248x0.f30435d.setColor(iM10811n);
        } else {
            c10248x0.f30436e.setColor(iM10811n);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10805a(float f10, float f11, float f12, float f13, float f14, boolean z6, boolean z10, float f15, float f16, InterfaceC10186K interfaceC10186K) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            interfaceC10186K.mo5086e(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(((double) f14) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = ((double) (f10 - f15)) / 2.0d;
        double d11 = ((double) (f11 - f16)) / 2.0d;
        double d12 = (dSin * d11) + (dCos * d10);
        double d13 = (d11 * dCos) + ((-dSin) * d10);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d17 / d15) + (d16 / d14);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z6 == z10 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d23) * d19;
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        float f17 = fAbs;
        float f18 = fAbs2;
        double d27 = dSqrt2 * (-((d25 * d12) / d24));
        double d28 = ((dCos * d26) - (dSin * d27)) + (((double) (f10 + f15)) / 2.0d);
        double d29 = (dCos * d27) + (dSin * d26) + (((double) (f11 + f16)) / 2.0d);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d31 * d31) + (d30 * d30);
        double dAcos = Math.acos(d30 / Math.sqrt(d34)) * (d31 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d33 * d33) + (d32 * d32)) * d34);
        double d35 = (d31 * d33) + (d30 * d32);
        double d36 = d35 / dSqrt3;
        double dAcos2 = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * (d36 < -1.0d ? 3.141592653589793d : d36 > 1.0d ? 0.0d : Math.acos(d36));
        if (!z10 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z10 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d37 = dAcos2 % 6.283185307179586d;
        double d38 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d37) * 2.0d) / 3.141592653589793d);
        double d39 = d37 / ((double) iCeil);
        double d40 = d39 / 2.0d;
        double dSin2 = (Math.sin(d40) * 1.3333333333333333d) / (Math.cos(d40) + 1.0d);
        int i10 = iCeil * 6;
        float[] fArr = new float[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < iCeil) {
            double d41 = (((double) i11) * d39) + d38;
            double dCos2 = Math.cos(d41);
            double dSin3 = Math.sin(d41);
            fArr[i12] = (float) (dCos2 - (dSin2 * dSin3));
            int i13 = iCeil;
            fArr[i12 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d42 = d41 + d39;
            double dCos3 = Math.cos(d42);
            double dSin4 = Math.sin(d42);
            fArr[i12 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i12 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            int i14 = i12 + 5;
            fArr[i12 + 4] = (float) dCos3;
            i12 += 6;
            fArr[i14] = (float) dSin4;
            i11++;
            d29 = d29;
            i10 = i10;
            d38 = d38;
            iCeil = i13;
            d39 = d39;
        }
        int i15 = i10;
        Matrix matrix = new Matrix();
        matrix.postScale(f17, f18);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArr);
        fArr[i15 - 2] = f15;
        fArr[i15 - 1] = f16;
        for (int i16 = 0; i16 < i15; i16 += 6) {
            interfaceC10186K.mo5084c(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3], fArr[i16 + 4], fArr[i16 + 5]);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10806c(int i10, Menu menu) {
        int i11;
        int iM24h = AbstractC0010F.m24h(i10);
        int iM24h2 = AbstractC0010F.m24h(i10);
        if (iM24h2 == 0) {
            i11 = R.string.copy;
        } else if (iM24h2 == 1) {
            i11 = R.string.paste;
        } else if (iM24h2 == 2) {
            i11 = R.string.cut;
        } else {
            if (iM24h2 != 3) {
                throw new C0644w();
            }
            i11 = R.string.selectAll;
        }
        menu.add(0, iM24h, AbstractC0010F.m24h(i10), i11).setShowAsAction(1);
    }

    /* JADX INFO: renamed from: e */
    public static void m10807e(Menu menu, int i10, InterfaceC1426a interfaceC1426a) {
        if (interfaceC1426a != null && menu.findItem(AbstractC0010F.m24h(i10)) == null) {
            m10806c(i10, menu);
        } else {
            if (interfaceC1426a != null || menu.findItem(AbstractC0010F.m24h(i10)) == null) {
                return;
            }
            menu.removeItem(AbstractC0010F.m24h(i10));
        }
    }

    /* JADX INFO: renamed from: h */
    public static C10235r m10808h(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C10235r(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix m10809j(C10235r c10235r, C10235r c10235r2, C10233q c10233q) {
        EnumC10231p enumC10231p;
        float f10;
        float f11;
        Matrix matrix = new Matrix();
        if (c10233q != null && (enumC10231p = c10233q.f30387a) != null) {
            float f12 = c10235r.f30392d / c10235r2.f30392d;
            float f13 = c10235r.f30393e / c10235r2.f30393e;
            float f14 = -c10235r2.f30390b;
            float f15 = -c10235r2.f30391c;
            if (c10233q.equals(C10233q.f30385c)) {
                matrix.preTranslate(c10235r.f30390b, c10235r.f30391c);
                matrix.preScale(f12, f13);
                matrix.preTranslate(f14, f15);
                return matrix;
            }
            float fMax = c10233q.f30388b == 2 ? Math.max(f12, f13) : Math.min(f12, f13);
            float f16 = c10235r.f30392d / fMax;
            float f17 = c10235r.f30393e / fMax;
            int iOrdinal = enumC10231p.ordinal();
            if (iOrdinal == 2) {
                f10 = (c10235r2.f30392d - f16) / 2.0f;
                f14 -= f10;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                            }
                        }
                    }
                    f10 = (c10235r2.f30392d - f16) / 2.0f;
                    f14 -= f10;
                }
                f10 = c10235r2.f30392d - f16;
                f14 -= f10;
            }
            switch (enumC10231p.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f11 = (c10235r2.f30393e - f17) / 2.0f;
                    break;
                case 7:
                case 8:
                case 9:
                    f11 = c10235r2.f30393e - f17;
                    break;
                default:
                    matrix.preTranslate(c10235r.f30390b, c10235r.f30391c);
                    matrix.preScale(fMax, fMax);
                    matrix.preTranslate(f14, f15);
                    break;
            }
            f15 -= f11;
            matrix.preTranslate(c10235r.f30390b, c10235r.f30391c);
            matrix.preScale(fMax, fMax);
            matrix.preTranslate(f14, f15);
        }
        return matrix;
    }

    /* JADX INFO: renamed from: m */
    public static Typeface m10810m(String str, int i10, Integer num) {
        int i11;
        boolean z6 = i10 == 2;
        if (num.intValue() > 500) {
            i11 = z6 ? 3 : 1;
        } else {
            i11 = z6 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i11);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case "serif":
                return Typeface.create(Typeface.SERIF, i11);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m10811n(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    /* JADX INFO: renamed from: t */
    public static void m10812t(String str, Object... objArr) {
        AbstractC15256t.m16465c("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX INFO: renamed from: x */
    public static void m10813x(AbstractC10249y abstractC10249y, String str) {
        AbstractC10199Y abstractC10199YM15182C = abstractC10249y.f30314a.m15182C(str);
        if (abstractC10199YM15182C == null) {
            AbstractC15256t.m16482t("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(abstractC10199YM15182C instanceof AbstractC10249y)) {
            m10812t("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (abstractC10199YM15182C == abstractC10249y) {
            m10812t("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        AbstractC10249y abstractC10249y2 = (AbstractC10249y) abstractC10199YM15182C;
        if (abstractC10249y.f30441i == null) {
            abstractC10249y.f30441i = abstractC10249y2.f30441i;
        }
        if (abstractC10249y.f30442j == null) {
            abstractC10249y.f30442j = abstractC10249y2.f30442j;
        }
        if (abstractC10249y.f30443k == 0) {
            abstractC10249y.f30443k = abstractC10249y2.f30443k;
        }
        if (abstractC10249y.f30440h.isEmpty()) {
            abstractC10249y.f30440h = abstractC10249y2.f30440h;
        }
        try {
            if (abstractC10249y instanceof C10200Z) {
                C10200Z c10200z = (C10200Z) abstractC10249y;
                C10200Z c10200z2 = (C10200Z) abstractC10199YM15182C;
                if (c10200z.f30310m == null) {
                    c10200z.f30310m = c10200z2.f30310m;
                }
                if (c10200z.f30311n == null) {
                    c10200z.f30311n = c10200z2.f30311n;
                }
                if (c10200z.f30312o == null) {
                    c10200z.f30312o = c10200z2.f30312o;
                }
                if (c10200z.f30313p == null) {
                    c10200z.f30313p = c10200z2.f30313p;
                }
            } else {
                m10814y((C10208d0) abstractC10249y, (C10208d0) abstractC10199YM15182C);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC10249y2.f30444l;
        if (str2 != null) {
            m10813x(abstractC10249y, str2);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m10814y(C10208d0 c10208d0, C10208d0 c10208d1) {
        if (c10208d0.f30323m == null) {
            c10208d0.f30323m = c10208d1.f30323m;
        }
        if (c10208d0.f30324n == null) {
            c10208d0.f30324n = c10208d1.f30324n;
        }
        if (c10208d0.f30325o == null) {
            c10208d0.f30325o = c10208d1.f30325o;
        }
        if (c10208d0.f30326p == null) {
            c10208d0.f30326p = c10208d1.f30326p;
        }
        if (c10208d0.f30327q == null) {
            c10208d0.f30327q = c10208d1.f30327q;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m10815z(C10187L c10187l, String str) {
        AbstractC10199Y abstractC10199YM15182C = c10187l.f30314a.m15182C(str);
        if (abstractC10199YM15182C == null) {
            AbstractC15256t.m16482t("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(abstractC10199YM15182C instanceof C10187L)) {
            m10812t("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (abstractC10199YM15182C == c10187l) {
            m10812t("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C10187L c10187l2 = (C10187L) abstractC10199YM15182C;
        if (c10187l.f30240p == null) {
            c10187l.f30240p = c10187l2.f30240p;
        }
        if (c10187l.f30241q == null) {
            c10187l.f30241q = c10187l2.f30241q;
        }
        if (c10187l.f30242r == null) {
            c10187l.f30242r = c10187l2.f30242r;
        }
        if (c10187l.f30243s == null) {
            c10187l.f30243s = c10187l2.f30243s;
        }
        if (c10187l.f30244t == null) {
            c10187l.f30244t = c10187l2.f30244t;
        }
        if (c10187l.f30245u == null) {
            c10187l.f30245u = c10187l2.f30245u;
        }
        if (c10187l.f30246v == null) {
            c10187l.f30246v = c10187l2.f30246v;
        }
        if (c10187l.f30299i.isEmpty()) {
            c10187l.f30299i = c10187l2.f30299i;
        }
        if (c10187l.f30328o == null) {
            c10187l.f30328o = c10187l2.f30328o;
        }
        if (c10187l.f30319n == null) {
            c10187l.f30319n = c10187l2.f30319n;
        }
        String str2 = c10187l2.f30247w;
        if (str2 != null) {
            m10815z(c10187l, str2);
        }
    }

    /* JADX INFO: renamed from: A */
    public C10248x0 m10816A(AbstractC10199Y abstractC10199Y) {
        C10248x0 c10248x0 = new C10248x0();
        m10841b0(c10248x0, C10193S.m10774a());
        m10817B(abstractC10199Y, c10248x0);
        return c10248x0;
    }

    /* JADX INFO: renamed from: B */
    public void m10817B(AbstractC10199Y abstractC10199Y, C10248x0 c10248x0) {
        ArrayList arrayList = new ArrayList();
        AbstractC10202a0 abstractC10202a0 = abstractC10199Y;
        while (true) {
            if (abstractC10202a0 instanceof AbstractC10199Y) {
                arrayList.add(0, (AbstractC10199Y) abstractC10202a0);
            }
            Object obj = abstractC10202a0.f30315b;
            if (obj == null) {
                break;
            } else {
                abstractC10202a0 = (AbstractC10202a0) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m10842c0((AbstractC10199Y) it.next(), c10248x0);
        }
        C10248x0 c10248x1 = (C10248x0) this.f30456o0;
        c10248x0.f30438g = c10248x1.f30438g;
        c10248x0.f30437f = c10248x1.f30437f;
    }

    /* JADX INFO: renamed from: C */
    public int m10818C() {
        int i10;
        C10193S c10193s = ((C10248x0) this.f30456o0).f30432a;
        if (c10193s.f30276U0 == 1 || (i10 = c10193s.f30277V0) == 2) {
            return c10193s.f30277V0;
        }
        return i10 == 1 ? 3 : 1;
    }

    /* JADX INFO: renamed from: D */
    public Path.FillType m10819D() {
        int i10 = ((C10248x0) this.f30456o0).f30432a.f30278W0;
        return (i10 == 0 || i10 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* JADX INFO: renamed from: F */
    public Path m10820F(C10237s c10237s) {
        C10173D c10173d = c10237s.f30402o;
        float fM10768d = c10173d != null ? c10173d.m10768d(this) : 0.0f;
        C10173D c10173d2 = c10237s.f30403p;
        float fM10769e = c10173d2 != null ? c10173d2.m10769e(this) : 0.0f;
        float fM10765a = c10237s.f30404q.m10765a(this);
        float f10 = fM10768d - fM10765a;
        float f11 = fM10769e - fM10765a;
        float f12 = fM10768d + fM10765a;
        float f13 = fM10769e + fM10765a;
        if (c10237s.f30304h == null) {
            float f14 = 2.0f * fM10765a;
            c10237s.f30304h = new C10235r(f10, f11, f14, f14);
        }
        float f15 = 0.5522848f * fM10765a;
        Path path = new Path();
        path.moveTo(fM10768d, f11);
        float f16 = fM10768d + f15;
        float f17 = fM10769e - f15;
        path.cubicTo(f16, f11, f12, f17, f12, fM10769e);
        float f18 = fM10769e + f15;
        path.cubicTo(f12, f18, f16, f13, fM10768d, f13);
        float f19 = fM10768d - f15;
        path.cubicTo(f19, f13, f10, f18, f10, fM10769e);
        path.cubicTo(f10, f17, f19, f11, fM10768d, f11);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: G */
    public Path m10821G(C10247x c10247x) {
        C10173D c10173d = c10247x.f30428o;
        float fM10768d = c10173d != null ? c10173d.m10768d(this) : 0.0f;
        C10173D c10173d2 = c10247x.f30429p;
        float fM10769e = c10173d2 != null ? c10173d2.m10769e(this) : 0.0f;
        float fM10768d2 = c10247x.f30430q.m10768d(this);
        float fM10769e2 = c10247x.f30431r.m10769e(this);
        float f10 = fM10768d - fM10768d2;
        float f11 = fM10769e - fM10769e2;
        float f12 = fM10768d + fM10768d2;
        float f13 = fM10769e + fM10769e2;
        if (c10247x.f30304h == null) {
            c10247x.f30304h = new C10235r(f10, f11, fM10768d2 * 2.0f, 2.0f * fM10769e2);
        }
        float f14 = fM10768d2 * 0.5522848f;
        float f15 = 0.5522848f * fM10769e2;
        Path path = new Path();
        path.moveTo(fM10768d, f11);
        float f16 = fM10768d + f14;
        float f17 = fM10769e - f15;
        path.cubicTo(f16, f11, f12, f17, f12, fM10769e);
        float f18 = f15 + fM10769e;
        path.cubicTo(f12, f18, f16, f13, fM10768d, f13);
        float f19 = fM10768d - f14;
        path.cubicTo(f19, f13, f10, f18, f10, fM10769e);
        path.cubicTo(f10, f17, f19, f11, fM10768d, f11);
        path.close();
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX INFO: renamed from: I */
    public Path m10822I(C10190O c10190o) {
        float fM10768d;
        float fM10769e;
        float fMin;
        C10173D c10173d;
        float fM10768d2;
        C10173D c10173d2;
        float fM10769e2;
        float fM10768d3;
        float fM10769e3;
        float f10;
        float f11;
        Path path;
        Path path2;
        C10173D c10173d3 = c10190o.f30253s;
        if (c10173d3 == null && c10190o.f30254t == null) {
            fM10768d = 0.0f;
        } else {
            if (c10173d3 != null) {
                if (c10190o.f30254t == null) {
                    fM10768d = c10173d3.m10768d(this);
                } else {
                    fM10768d = c10173d3.m10768d(this);
                    fM10769e = c10190o.f30254t.m10769e(this);
                }
                fMin = Math.min(fM10768d, c10190o.f30251q.m10768d(this) / 2.0f);
                float fMin2 = Math.min(fM10769e, c10190o.f30252r.m10769e(this) / 2.0f);
                c10173d = c10190o.f30249o;
                if (c10173d != null) {
                    fM10768d2 = c10173d.m10768d(this);
                } else {
                    fM10768d2 = 0.0f;
                }
                c10173d2 = c10190o.f30250p;
                if (c10173d2 != null) {
                    fM10769e2 = c10173d2.m10769e(this);
                } else {
                    fM10769e2 = 0.0f;
                }
                fM10768d3 = c10190o.f30251q.m10768d(this);
                fM10769e3 = c10190o.f30252r.m10769e(this);
                if (c10190o.f30304h == null) {
                    c10190o.f30304h = new C10235r(fM10768d2, fM10769e2, fM10768d3, fM10769e3);
                }
                f10 = fM10768d2 + fM10768d3;
                f11 = fM10769e2 + fM10769e3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path2 = path;
                    path2.moveTo(fM10768d2, fM10769e2);
                    path2.lineTo(f10, fM10769e2);
                    path2.lineTo(f10, f11);
                    path2.lineTo(fM10768d2, f11);
                    path2.lineTo(fM10768d2, fM10769e2);
                } else {
                    float f12 = fMin * 0.5522848f;
                    float f13 = 0.5522848f * fMin2;
                    float f14 = fM10769e2 + fMin2;
                    path.moveTo(fM10768d2, f14);
                    float f15 = f14 - f13;
                    float f16 = fM10768d2 + fMin;
                    float f17 = f16 - f12;
                    path.cubicTo(fM10768d2, f15, f17, fM10769e2, f16, fM10769e2);
                    float f18 = f10 - fMin;
                    path.lineTo(f18, fM10769e2);
                    float f19 = f18 + f12;
                    path.cubicTo(f19, fM10769e2, f10, f15, f10, f14);
                    float f20 = f11 - fMin2;
                    path.lineTo(f10, f20);
                    float f21 = f20 + f13;
                    path2 = path;
                    path.cubicTo(f10, f21, f19, f11, f18, f11);
                    path2.lineTo(f16, f11);
                    path2.cubicTo(f17, f11, fM10768d2, f21, fM10768d2, f20);
                    path2.lineTo(fM10768d2, f14);
                }
                path2.close();
                return path2;
            }
            fM10768d = c10190o.f30254t.m10769e(this);
        }
        fM10769e = fM10768d;
        fMin = Math.min(fM10768d, c10190o.f30251q.m10768d(this) / 2.0f);
        float fMin3 = Math.min(fM10769e, c10190o.f30252r.m10769e(this) / 2.0f);
        c10173d = c10190o.f30249o;
        if (c10173d != null) {
            fM10768d2 = c10173d.m10768d(this);
        } else {
            fM10768d2 = 0.0f;
        }
        c10173d2 = c10190o.f30250p;
        if (c10173d2 != null) {
            fM10769e2 = c10173d2.m10769e(this);
        } else {
            fM10769e2 = 0.0f;
        }
        fM10768d3 = c10190o.f30251q.m10768d(this);
        fM10769e3 = c10190o.f30252r.m10769e(this);
        if (c10190o.f30304h == null) {
            c10190o.f30304h = new C10235r(fM10768d2, fM10769e2, fM10768d3, fM10769e3);
        }
        f10 = fM10768d2 + fM10768d3;
        f11 = fM10769e2 + fM10769e3;
        path = new Path();
        if (fMin != 0.0f) {
            path2 = path;
            path2.moveTo(fM10768d2, fM10769e2);
            path2.lineTo(f10, fM10769e2);
            path2.lineTo(f10, f11);
            path2.lineTo(fM10768d2, f11);
            path2.lineTo(fM10768d2, fM10769e2);
        } else {
            path2 = path;
            path2.moveTo(fM10768d2, fM10769e2);
            path2.lineTo(f10, fM10769e2);
            path2.lineTo(f10, f11);
            path2.lineTo(fM10768d2, f11);
            path2.lineTo(fM10768d2, fM10769e2);
        }
        path2.close();
        return path2;
    }

    /* JADX INFO: renamed from: J */
    public C10235r m10823J(C10173D c10173d, C10173D c10173d2, C10173D c10173d3, C10173D c10173d4) {
        float fM10768d = c10173d != null ? c10173d.m10768d(this) : 0.0f;
        float fM10769e = c10173d2 != null ? c10173d2.m10769e(this) : 0.0f;
        C10248x0 c10248x0 = (C10248x0) this.f30456o0;
        C10235r c10235r = c10248x0.f30438g;
        if (c10235r == null) {
            c10235r = c10248x0.f30437f;
        }
        return new C10235r(fM10768d, fM10769e, c10173d3 != null ? c10173d3.m10768d(this) : c10235r.f30392d, c10173d4 != null ? c10173d4.m10769e(this) : c10235r.f30393e);
    }

    /* JADX INFO: renamed from: K */
    public Path m10824K(AbstractC10198X abstractC10198X, boolean z6) {
        Path path;
        Path pathM10847g;
        ((Stack) this.f30457p0).push((C10248x0) this.f30456o0);
        C10248x0 c10248x0 = new C10248x0((C10248x0) this.f30456o0);
        this.f30456o0 = c10248x0;
        m10842c0(abstractC10198X, c10248x0);
        if (!m10852p() || !m10845e0()) {
            this.f30456o0 = (C10248x0) ((Stack) this.f30457p0).pop();
            return null;
        }
        if (abstractC10198X instanceof C10232p0) {
            if (!z6) {
                m10812t("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C10232p0 c10232p0 = (C10232p0) abstractC10198X;
            AbstractC10199Y abstractC10199YM15182C = abstractC10198X.f30314a.m15182C(c10232p0.f30380o);
            if (abstractC10199YM15182C == null) {
                m10812t("Use reference '%s' not found", c10232p0.f30380o);
                this.f30456o0 = (C10248x0) ((Stack) this.f30457p0).pop();
                return null;
            }
            if (!(abstractC10199YM15182C instanceof AbstractC10198X)) {
                this.f30456o0 = (C10248x0) ((Stack) this.f30457p0).pop();
                return null;
            }
            path = m10824K((AbstractC10198X) abstractC10199YM15182C, false);
            if (path == null) {
                return null;
            }
            if (c10232p0.f30304h == null) {
                c10232p0.f30304h = m10808h(path);
            }
            Matrix matrix = c10232p0.f30108n;
            if (matrix != null) {
                path.transform(matrix);
            }
        } else if (abstractC10198X instanceof AbstractC10251z) {
            AbstractC10251z abstractC10251z = (AbstractC10251z) abstractC10198X;
            if (abstractC10198X instanceof C10185J) {
                path = new C10240t0(((C10185J) abstractC10198X).f30239o).f30411a;
                if (abstractC10198X.f30304h == null) {
                    abstractC10198X.f30304h = m10808h(path);
                }
            } else if (abstractC10198X instanceof C10190O) {
                path = m10822I((C10190O) abstractC10198X);
            } else if (abstractC10198X instanceof C10237s) {
                path = m10820F((C10237s) abstractC10198X);
            } else if (abstractC10198X instanceof C10247x) {
                path = m10821G((C10247x) abstractC10198X);
            } else {
                path = abstractC10198X instanceof C10188M ? m10803H((C10188M) abstractC10198X) : null;
            }
            if (path == null) {
                return null;
            }
            if (abstractC10251z.f30304h == null) {
                abstractC10251z.f30304h = m10808h(path);
            }
            Matrix matrix2 = abstractC10251z.f30452n;
            if (matrix2 != null) {
                path.transform(matrix2);
            }
            path.setFillType(m10819D());
        } else {
            if (!(abstractC10198X instanceof C10220j0)) {
                m10812t("Invalid %s element found in clipPath definition", abstractC10198X.mo10764n());
                return null;
            }
            C10220j0 c10220j0 = (C10220j0) abstractC10198X;
            ArrayList arrayList = c10220j0.f30361n;
            float fM10769e = 0.0f;
            float fM10768d = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C10173D) c10220j0.f30361n.get(0)).m10768d(this);
            ArrayList arrayList2 = c10220j0.f30362o;
            float fM10769e2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C10173D) c10220j0.f30362o.get(0)).m10769e(this);
            ArrayList arrayList3 = c10220j0.f30363p;
            float fM10768d2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C10173D) c10220j0.f30363p.get(0)).m10768d(this);
            ArrayList arrayList4 = c10220j0.f30364q;
            if (arrayList4 != null && arrayList4.size() != 0) {
                fM10769e = ((C10173D) c10220j0.f30364q.get(0)).m10769e(this);
            }
            if (((C10248x0) this.f30456o0).f30432a.f30277V0 != 1) {
                float fM10848i = m10848i(c10220j0);
                if (((C10248x0) this.f30456o0).f30432a.f30277V0 == 2) {
                    fM10848i /= 2.0f;
                }
                fM10768d -= fM10848i;
            }
            if (c10220j0.f30304h == null) {
                C10246w0 c10246w0 = new C10246w0(this, fM10768d, fM10769e2);
                Object obj = c10246w0.f30427g;
                m10855s(c10220j0, c10246w0);
                RectF rectF = (RectF) obj;
                c10220j0.f30304h = new C10235r(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height());
            }
            path = new Path();
            m10855s(c10220j0, new C10246w0(this, fM10768d + fM10768d2, fM10769e2 + fM10769e, path));
            Matrix matrix3 = c10220j0.f30346r;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            path.setFillType(m10819D());
        }
        if (((C10248x0) this.f30456o0).f30432a.f30265J0 != null && (pathM10847g = m10847g(abstractC10198X, abstractC10198X.f30304h)) != null) {
            path.op(pathM10847g, Path.Op.INTERSECT);
        }
        this.f30456o0 = (C10248x0) ((Stack) this.f30457p0).pop();
        return path;
    }

    /* JADX INFO: renamed from: L */
    public void m10825L(C10235r c10235r) {
        if (((C10248x0) this.f30456o0).f30432a.f30266K0 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = (Canvas) this.f30454Y;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            C10179G c10179g = (C10179G) ((C13711h) this.f30455Z).m15182C(((C10248x0) this.f30456o0).f30432a.f30266K0);
            m10832S(c10179g, c10235r);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            m10832S(c10179g, c10235r);
            canvas.restore();
            canvas.restore();
        }
        m10836X();
    }

    /* JADX INFO: renamed from: M */
    public boolean m10826M() {
        AbstractC10199Y abstractC10199YM15182C;
        if (((C10248x0) this.f30456o0).f30432a.f30290v0.floatValue() >= 1.0f && ((C10248x0) this.f30456o0).f30432a.f30266K0 == null) {
            return false;
        }
        int iFloatValue = (int) (((C10248x0) this.f30456o0).f30432a.f30290v0.floatValue() * 256.0f);
        if (iFloatValue < 0) {
            iFloatValue = 0;
        } else if (iFloatValue > 255) {
            iFloatValue = 255;
        }
        ((Canvas) this.f30454Y).saveLayerAlpha(null, iFloatValue, 31);
        ((Stack) this.f30457p0).push((C10248x0) this.f30456o0);
        C10248x0 c10248x0 = new C10248x0((C10248x0) this.f30456o0);
        this.f30456o0 = c10248x0;
        String str = c10248x0.f30432a.f30266K0;
        if (str != null && ((abstractC10199YM15182C = ((C13711h) this.f30455Z).m15182C(str)) == null || !(abstractC10199YM15182C instanceof C10179G))) {
            m10812t("Mask reference '%s' not found", ((C10248x0) this.f30456o0).f30432a.f30266K0);
            ((C10248x0) this.f30456o0).f30432a.f30266K0 = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    public void m10827N(C10194T c10194t, C10235r c10235r, C10235r c10235r2, C10233q c10233q) {
        if (c10235r.f30392d == 0.0f || c10235r.f30393e == 0.0f) {
            return;
        }
        if (c10233q == null && (c10233q = c10194t.f30319n) == null) {
            c10233q = C10233q.f30386d;
        }
        m10842c0(c10194t, (C10248x0) this.f30456o0);
        if (m10852p()) {
            C10248x0 c10248x0 = (C10248x0) this.f30456o0;
            c10248x0.f30437f = c10235r;
            if (!c10248x0.f30432a.f30256A0.booleanValue()) {
                C10235r c10235r3 = ((C10248x0) this.f30456o0).f30437f;
                m10833T(c10235r3.f30390b, c10235r3.f30391c, c10235r3.f30392d, c10235r3.f30393e);
            }
            m10849k(c10194t, ((C10248x0) this.f30456o0).f30437f);
            Canvas canvas = (Canvas) this.f30454Y;
            if (c10235r2 != null) {
                canvas.concat(m10809j(((C10248x0) this.f30456o0).f30437f, c10235r2, c10233q));
                ((C10248x0) this.f30456o0).f30438g = c10194t.f30328o;
            } else {
                C10235r c10235r4 = ((C10248x0) this.f30456o0).f30437f;
                canvas.translate(c10235r4.f30390b, c10235r4.f30391c);
            }
            boolean zM10826M = m10826M();
            m10844d0();
            m10829P(c10194t, true);
            if (zM10826M) {
                m10825L(c10194t.f30304h);
            }
            m10839a0(c10194t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public void m10828O(AbstractC10202a0 abstractC10202a0) {
        C10173D c10173d;
        String str;
        int iIndexOf;
        Set setMo10775a;
        C10173D c10173d2;
        Boolean bool;
        if (abstractC10202a0 instanceof InterfaceC10181H) {
            return;
        }
        m10837Y();
        if ((abstractC10202a0 instanceof AbstractC10199Y) && (bool = ((AbstractC10199Y) abstractC10202a0).f30306d) != null) {
            ((C10248x0) this.f30456o0).f30439h = bool.booleanValue();
        }
        if (abstractC10202a0 instanceof C10194T) {
            C10194T c10194t = (C10194T) abstractC10202a0;
            m10827N(c10194t, m10823J(c10194t.f30295p, c10194t.f30296q, c10194t.f30297r, c10194t.f30298s), c10194t.f30328o, c10194t.f30319n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fM10769e = 0.0f;
            if (abstractC10202a0 instanceof C10232p0) {
                C10232p0 c10232p0 = (C10232p0) abstractC10202a0;
                C10173D c10173d3 = c10232p0.f30383r;
                if ((c10173d3 == null || !c10173d3.m10771g()) && ((c10173d2 = c10232p0.f30384s) == null || !c10173d2.m10771g())) {
                    m10842c0(c10232p0, (C10248x0) this.f30456o0);
                    if (m10852p()) {
                        AbstractC10202a0 abstractC10202a0M15182C = c10232p0.f30314a.m15182C(c10232p0.f30380o);
                        if (abstractC10202a0M15182C == null) {
                            m10812t("Use reference '%s' not found", c10232p0.f30380o);
                        } else {
                            Matrix matrix = c10232p0.f30108n;
                            Canvas canvas = (Canvas) this.f30454Y;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            C10173D c10173d4 = c10232p0.f30381p;
                            float fM10768d = c10173d4 != null ? c10173d4.m10768d(this) : 0.0f;
                            C10173D c10173d5 = c10232p0.f30382q;
                            canvas.translate(fM10768d, c10173d5 != null ? c10173d5.m10769e(this) : 0.0f);
                            m10849k(c10232p0, c10232p0.f30304h);
                            boolean zM10826M = m10826M();
                            ((Stack) this.f30458q0).push(c10232p0);
                            ((Stack) this.f30459r0).push(((Canvas) this.f30454Y).getMatrix());
                            if (abstractC10202a0M15182C instanceof C10194T) {
                                C10194T c10194t2 = (C10194T) abstractC10202a0M15182C;
                                C10235r c10235rM10823J = m10823J(null, null, c10232p0.f30383r, c10232p0.f30384s);
                                m10837Y();
                                m10827N(c10194t2, c10235rM10823J, c10194t2.f30328o, c10194t2.f30319n);
                                m10836X();
                            } else if (abstractC10202a0M15182C instanceof C10214g0) {
                                C10173D c10173d6 = c10232p0.f30383r;
                                if (c10173d6 == null) {
                                    c10173d6 = new C10173D(9, 100.0f);
                                }
                                C10173D c10173d7 = c10232p0.f30384s;
                                if (c10173d7 == null) {
                                    c10173d7 = new C10173D(9, 100.0f);
                                }
                                C10235r c10235rM10823J2 = m10823J(null, null, c10173d6, c10173d7);
                                m10837Y();
                                C10214g0 c10214g0 = (C10214g0) abstractC10202a0M15182C;
                                if (c10235rM10823J2.f30392d != 0.0f && c10235rM10823J2.f30393e != 0.0f) {
                                    C10233q c10233q = c10214g0.f30319n;
                                    if (c10233q == null) {
                                        c10233q = C10233q.f30386d;
                                    }
                                    m10842c0(c10214g0, (C10248x0) this.f30456o0);
                                    C10248x0 c10248x0 = (C10248x0) this.f30456o0;
                                    c10248x0.f30437f = c10235rM10823J2;
                                    if (!c10248x0.f30432a.f30256A0.booleanValue()) {
                                        C10235r c10235r = ((C10248x0) this.f30456o0).f30437f;
                                        m10833T(c10235r.f30390b, c10235r.f30391c, c10235r.f30392d, c10235r.f30393e);
                                    }
                                    C10235r c10235r2 = c10214g0.f30328o;
                                    if (c10235r2 != null) {
                                        canvas.concat(m10809j(((C10248x0) this.f30456o0).f30437f, c10235r2, c10233q));
                                        ((C10248x0) this.f30456o0).f30438g = c10214g0.f30328o;
                                    } else {
                                        C10235r c10235r3 = ((C10248x0) this.f30456o0).f30437f;
                                        canvas.translate(c10235r3.f30390b, c10235r3.f30391c);
                                    }
                                    boolean zM10826M2 = m10826M();
                                    m10829P(c10214g0, true);
                                    if (zM10826M2) {
                                        m10825L(c10214g0.f30304h);
                                    }
                                    m10839a0(c10214g0);
                                }
                                m10836X();
                            } else {
                                m10828O(abstractC10202a0M15182C);
                            }
                            ((Stack) this.f30458q0).pop();
                            ((Stack) this.f30459r0).pop();
                            if (zM10826M) {
                                m10825L(c10232p0.f30304h);
                            }
                            m10839a0(c10232p0);
                        }
                    }
                }
            } else if (abstractC10202a0 instanceof C10212f0) {
                C10212f0 c10212f0 = (C10212f0) abstractC10202a0;
                m10842c0(c10212f0, (C10248x0) this.f30456o0);
                if (m10852p()) {
                    Matrix matrix2 = c10212f0.f30108n;
                    if (matrix2 != null) {
                        ((Canvas) this.f30454Y).concat(matrix2);
                    }
                    m10849k(c10212f0, c10212f0.f30304h);
                    boolean zM10826M3 = m10826M();
                    String language = Locale.getDefault().getLanguage();
                    for (AbstractC10202a0 abstractC10202a1 : c10212f0.f30299i) {
                        if (abstractC10202a1 instanceof InterfaceC10195U) {
                            InterfaceC10195U interfaceC10195U = (InterfaceC10195U) abstractC10202a1;
                            if (interfaceC10195U.mo10776b() == null && ((setMo10775a = interfaceC10195U.mo10775a()) == null || (!setMo10775a.isEmpty() && setMo10775a.contains(language)))) {
                                Set setMo10778e = interfaceC10195U.mo10778e();
                                if (setMo10778e != null) {
                                    if (f30453s0 == null) {
                                        synchronized (C10252z0.class) {
                                            HashSet hashSet = new HashSet();
                                            f30453s0 = hashSet;
                                            hashSet.add(HhJS.VbiVUzzKTa);
                                            f30453s0.add("BasicStructure");
                                            f30453s0.add("ConditionalProcessing");
                                            f30453s0.add("Image");
                                            f30453s0.add("Style");
                                            f30453s0.add("ViewportAttribute");
                                            f30453s0.add("Shape");
                                            f30453s0.add("BasicText");
                                            f30453s0.add("PaintAttribute");
                                            f30453s0.add("BasicPaintAttribute");
                                            f30453s0.add("OpacityAttribute");
                                            f30453s0.add("BasicGraphicsAttribute");
                                            f30453s0.add("Marker");
                                            f30453s0.add("Gradient");
                                            f30453s0.add("Pattern");
                                            f30453s0.add("Clip");
                                            f30453s0.add("BasicClip");
                                            f30453s0.add("Mask");
                                            f30453s0.add("View");
                                        }
                                    }
                                    if (setMo10778e.isEmpty() || !f30453s0.containsAll(setMo10778e)) {
                                    }
                                }
                                Set setMo10783l = interfaceC10195U.mo10783l();
                                if (setMo10783l == null) {
                                    Set setMo10784m = interfaceC10195U.mo10784m();
                                    if (setMo10784m == null) {
                                        m10828O(abstractC10202a1);
                                        break;
                                    }
                                    setMo10784m.isEmpty();
                                } else {
                                    setMo10783l.isEmpty();
                                }
                            }
                        }
                    }
                    if (zM10826M3) {
                        m10825L(c10212f0.f30304h);
                    }
                    m10839a0(c10212f0);
                }
            } else if (abstractC10202a0 instanceof C10167A) {
                C10167A c10167a = (C10167A) abstractC10202a0;
                m10842c0(c10167a, (C10248x0) this.f30456o0);
                if (m10852p()) {
                    Matrix matrix3 = c10167a.f30108n;
                    if (matrix3 != null) {
                        ((Canvas) this.f30454Y).concat(matrix3);
                    }
                    m10849k(c10167a, c10167a.f30304h);
                    boolean zM10826M4 = m10826M();
                    m10829P(c10167a, true);
                    if (zM10826M4) {
                        m10825L(c10167a.f30304h);
                    }
                    m10839a0(c10167a);
                }
            } else if (abstractC10202a0 instanceof C10171C) {
                C10171C c10171c = (C10171C) abstractC10202a0;
                C10173D c10173d8 = c10171c.f30113r;
                if (c10173d8 != null && !c10173d8.m10771g() && (c10173d = c10171c.f30114s) != null && !c10173d.m10771g() && (str = c10171c.f30110o) != null) {
                    C10233q c10233q2 = c10171c.f30319n;
                    if (c10233q2 == null) {
                        c10233q2 = C10233q.f30386d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception e10) {
                            AbstractC15256t.m16466d("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        C10235r c10235r4 = new C10235r(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        m10842c0(c10171c, (C10248x0) this.f30456o0);
                        if (m10852p() && m10845e0()) {
                            Matrix matrix4 = c10171c.f30115t;
                            Canvas canvas2 = (Canvas) this.f30454Y;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            C10173D c10173d9 = c10171c.f30111p;
                            float fM10768d2 = c10173d9 != null ? c10173d9.m10768d(this) : 0.0f;
                            C10173D c10173d10 = c10171c.f30112q;
                            float fM10769e2 = c10173d10 != null ? c10173d10.m10769e(this) : 0.0f;
                            float fM10768d3 = c10171c.f30113r.m10768d(this);
                            float fM10768d4 = c10171c.f30114s.m10768d(this);
                            C10248x0 c10248x1 = (C10248x0) this.f30456o0;
                            c10248x1.f30437f = new C10235r(fM10768d2, fM10769e2, fM10768d3, fM10768d4);
                            if (!c10248x1.f30432a.f30256A0.booleanValue()) {
                                C10235r c10235r5 = ((C10248x0) this.f30456o0).f30437f;
                                m10833T(c10235r5.f30390b, c10235r5.f30391c, c10235r5.f30392d, c10235r5.f30393e);
                            }
                            c10171c.f30304h = ((C10248x0) this.f30456o0).f30437f;
                            m10839a0(c10171c);
                            m10849k(c10171c, c10171c.f30304h);
                            boolean zM10826M5 = m10826M();
                            m10844d0();
                            canvas2.save();
                            canvas2.concat(m10809j(((C10248x0) this.f30456o0).f30437f, c10235r4, c10233q2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((C10248x0) this.f30456o0).f30432a.f30281Y0 != 3 ? 2 : 0));
                            canvas2.restore();
                            if (zM10826M5) {
                                m10825L(c10171c.f30304h);
                            }
                        }
                    }
                }
            } else if (abstractC10202a0 instanceof C10185J) {
                C10185J c10185j = (C10185J) abstractC10202a0;
                if (c10185j.f30239o != null) {
                    m10842c0(c10185j, (C10248x0) this.f30456o0);
                    if (m10852p() && m10845e0()) {
                        C10248x0 c10248x2 = (C10248x0) this.f30456o0;
                        if (c10248x2.f30434c || c10248x2.f30433b) {
                            Matrix matrix5 = c10185j.f30452n;
                            if (matrix5 != null) {
                                ((Canvas) this.f30454Y).concat(matrix5);
                            }
                            Path path = new C10240t0(c10185j.f30239o).f30411a;
                            if (c10185j.f30304h == null) {
                                c10185j.f30304h = m10808h(path);
                            }
                            m10839a0(c10185j);
                            m10850l(c10185j);
                            m10849k(c10185j, c10185j.f30304h);
                            boolean zM10826M6 = m10826M();
                            C10248x0 c10248x3 = (C10248x0) this.f30456o0;
                            if (c10248x3.f30433b) {
                                int i10 = c10248x3.f30432a.f30271P0;
                                path.setFillType((i10 == 0 || i10 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                m10853q(c10185j, path);
                            }
                            if (((C10248x0) this.f30456o0).f30434c) {
                                m10854r(path);
                            }
                            m10831R(c10185j);
                            if (zM10826M6) {
                                m10825L(c10185j.f30304h);
                            }
                        }
                    }
                }
            } else if (abstractC10202a0 instanceof C10190O) {
                C10190O c10190o = (C10190O) abstractC10202a0;
                C10173D c10173d11 = c10190o.f30251q;
                if (c10173d11 != null && c10190o.f30252r != null && !c10173d11.m10771g() && !c10190o.f30252r.m10771g()) {
                    m10842c0(c10190o, (C10248x0) this.f30456o0);
                    if (m10852p() && m10845e0()) {
                        Matrix matrix6 = c10190o.f30452n;
                        if (matrix6 != null) {
                            ((Canvas) this.f30454Y).concat(matrix6);
                        }
                        Path pathM10822I = m10822I(c10190o);
                        m10839a0(c10190o);
                        m10850l(c10190o);
                        m10849k(c10190o, c10190o.f30304h);
                        boolean zM10826M7 = m10826M();
                        if (((C10248x0) this.f30456o0).f30433b) {
                            m10853q(c10190o, pathM10822I);
                        }
                        if (((C10248x0) this.f30456o0).f30434c) {
                            m10854r(pathM10822I);
                        }
                        if (zM10826M7) {
                            m10825L(c10190o.f30304h);
                        }
                    }
                }
            } else if (abstractC10202a0 instanceof C10237s) {
                C10237s c10237s = (C10237s) abstractC10202a0;
                C10173D c10173d12 = c10237s.f30404q;
                if (c10173d12 != null && !c10173d12.m10771g()) {
                    m10842c0(c10237s, (C10248x0) this.f30456o0);
                    if (m10852p() && m10845e0()) {
                        Matrix matrix7 = c10237s.f30452n;
                        if (matrix7 != null) {
                            ((Canvas) this.f30454Y).concat(matrix7);
                        }
                        Path pathM10820F = m10820F(c10237s);
                        m10839a0(c10237s);
                        m10850l(c10237s);
                        m10849k(c10237s, c10237s.f30304h);
                        boolean zM10826M8 = m10826M();
                        if (((C10248x0) this.f30456o0).f30433b) {
                            m10853q(c10237s, pathM10820F);
                        }
                        if (((C10248x0) this.f30456o0).f30434c) {
                            m10854r(pathM10820F);
                        }
                        if (zM10826M8) {
                            m10825L(c10237s.f30304h);
                        }
                    }
                }
            } else if (abstractC10202a0 instanceof C10247x) {
                C10247x c10247x = (C10247x) abstractC10202a0;
                C10173D c10173d13 = c10247x.f30430q;
                if (c10173d13 != null && c10247x.f30431r != null && !c10173d13.m10771g() && !c10247x.f30431r.m10771g()) {
                    m10842c0(c10247x, (C10248x0) this.f30456o0);
                    if (m10852p() && m10845e0()) {
                        Matrix matrix8 = c10247x.f30452n;
                        if (matrix8 != null) {
                            ((Canvas) this.f30454Y).concat(matrix8);
                        }
                        Path pathM10821G = m10821G(c10247x);
                        m10839a0(c10247x);
                        m10850l(c10247x);
                        m10849k(c10247x, c10247x.f30304h);
                        boolean zM10826M9 = m10826M();
                        if (((C10248x0) this.f30456o0).f30433b) {
                            m10853q(c10247x, pathM10821G);
                        }
                        if (((C10248x0) this.f30456o0).f30434c) {
                            m10854r(pathM10821G);
                        }
                        if (zM10826M9) {
                            m10825L(c10247x.f30304h);
                        }
                    }
                }
            } else if (abstractC10202a0 instanceof C10175E) {
                C10175E c10175e = (C10175E) abstractC10202a0;
                m10842c0(c10175e, (C10248x0) this.f30456o0);
                if (m10852p() && m10845e0() && ((C10248x0) this.f30456o0).f30434c) {
                    Matrix matrix9 = c10175e.f30452n;
                    if (matrix9 != null) {
                        ((Canvas) this.f30454Y).concat(matrix9);
                    }
                    C10173D c10173d14 = c10175e.f30120o;
                    float fM10768d5 = c10173d14 == null ? 0.0f : c10173d14.m10768d(this);
                    C10173D c10173d15 = c10175e.f30121p;
                    float fM10769e3 = c10173d15 == null ? 0.0f : c10173d15.m10769e(this);
                    C10173D c10173d16 = c10175e.f30122q;
                    float fM10768d6 = c10173d16 == null ? 0.0f : c10173d16.m10768d(this);
                    C10173D c10173d17 = c10175e.f30123r;
                    fM10769e = c10173d17 != null ? c10173d17.m10769e(this) : 0.0f;
                    if (c10175e.f30304h == null) {
                        c10175e.f30304h = new C10235r(Math.min(fM10768d5, fM10768d6), Math.min(fM10769e3, fM10769e), Math.abs(fM10768d6 - fM10768d5), Math.abs(fM10769e - fM10769e3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fM10768d5, fM10769e3);
                    path2.lineTo(fM10768d6, fM10769e);
                    m10839a0(c10175e);
                    m10850l(c10175e);
                    m10849k(c10175e, c10175e.f30304h);
                    boolean zM10826M10 = m10826M();
                    m10854r(path2);
                    m10831R(c10175e);
                    if (zM10826M10) {
                        m10825L(c10175e.f30304h);
                    }
                }
            } else if (abstractC10202a0 instanceof C10189N) {
                C10189N c10189n = (C10189N) abstractC10202a0;
                m10842c0(c10189n, (C10248x0) this.f30456o0);
                if (m10852p() && m10845e0()) {
                    C10248x0 c10248x4 = (C10248x0) this.f30456o0;
                    if (c10248x4.f30434c || c10248x4.f30433b) {
                        Matrix matrix10 = c10189n.f30452n;
                        if (matrix10 != null) {
                            ((Canvas) this.f30454Y).concat(matrix10);
                        }
                        if (c10189n.f30248o.length >= 2) {
                            Path pathM10803H = m10803H(c10189n);
                            m10839a0(c10189n);
                            m10850l(c10189n);
                            m10849k(c10189n, c10189n.f30304h);
                            boolean zM10826M11 = m10826M();
                            if (((C10248x0) this.f30456o0).f30433b) {
                                m10853q(c10189n, pathM10803H);
                            }
                            if (((C10248x0) this.f30456o0).f30434c) {
                                m10854r(pathM10803H);
                            }
                            m10831R(c10189n);
                            if (zM10826M11) {
                                m10825L(c10189n.f30304h);
                            }
                        }
                    }
                }
            } else if (abstractC10202a0 instanceof C10188M) {
                C10188M c10188m = (C10188M) abstractC10202a0;
                m10842c0(c10188m, (C10248x0) this.f30456o0);
                if (m10852p() && m10845e0()) {
                    C10248x0 c10248x5 = (C10248x0) this.f30456o0;
                    if (c10248x5.f30434c || c10248x5.f30433b) {
                        Matrix matrix11 = c10188m.f30452n;
                        if (matrix11 != null) {
                            ((Canvas) this.f30454Y).concat(matrix11);
                        }
                        if (c10188m.f30248o.length >= 2) {
                            Path pathM10803H2 = m10803H(c10188m);
                            m10839a0(c10188m);
                            int i11 = ((C10248x0) this.f30456o0).f30432a.f30271P0;
                            pathM10803H2.setFillType((i11 == 0 || i11 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            m10850l(c10188m);
                            m10849k(c10188m, c10188m.f30304h);
                            boolean zM10826M12 = m10826M();
                            if (((C10248x0) this.f30456o0).f30433b) {
                                m10853q(c10188m, pathM10803H2);
                            }
                            if (((C10248x0) this.f30456o0).f30434c) {
                                m10854r(pathM10803H2);
                            }
                            m10831R(c10188m);
                            if (zM10826M12) {
                                m10825L(c10188m.f30304h);
                            }
                        }
                    }
                }
            } else if (abstractC10202a0 instanceof C10220j0) {
                C10220j0 c10220j0 = (C10220j0) abstractC10202a0;
                m10842c0(c10220j0, (C10248x0) this.f30456o0);
                if (m10852p()) {
                    Matrix matrix12 = c10220j0.f30346r;
                    if (matrix12 != null) {
                        ((Canvas) this.f30454Y).concat(matrix12);
                    }
                    ArrayList arrayList = c10220j0.f30361n;
                    float fM10768d7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C10173D) c10220j0.f30361n.get(0)).m10768d(this);
                    ArrayList arrayList2 = c10220j0.f30362o;
                    float fM10769e4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C10173D) c10220j0.f30362o.get(0)).m10769e(this);
                    ArrayList arrayList3 = c10220j0.f30363p;
                    float fM10768d8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C10173D) c10220j0.f30363p.get(0)).m10768d(this);
                    ArrayList arrayList4 = c10220j0.f30364q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fM10769e = ((C10173D) c10220j0.f30364q.get(0)).m10769e(this);
                    }
                    int iM10818C = m10818C();
                    if (iM10818C != 1) {
                        float fM10848i = m10848i(c10220j0);
                        if (iM10818C == 2) {
                            fM10848i /= 2.0f;
                        }
                        fM10768d7 -= fM10848i;
                    }
                    if (c10220j0.f30304h == null) {
                        C10246w0 c10246w0 = new C10246w0(this, fM10768d7, fM10769e4);
                        m10855s(c10220j0, c10246w0);
                        RectF rectF = (RectF) c10246w0.f30427g;
                        c10220j0.f30304h = new C10235r(rectF.left, rectF.top, rectF.width(), ((RectF) c10246w0.f30427g).height());
                    }
                    m10839a0(c10220j0);
                    m10850l(c10220j0);
                    m10849k(c10220j0, c10220j0.f30304h);
                    boolean zM10826M13 = m10826M();
                    m10855s(c10220j0, new C10244v0(this, fM10768d7 + fM10768d8, fM10769e4 + fM10769e));
                    if (zM10826M13) {
                        m10825L(c10220j0.f30304h);
                    }
                }
            }
        }
        m10836X();
    }

    /* JADX INFO: renamed from: P */
    public void m10829P(AbstractC10196V abstractC10196V, boolean z6) {
        if (z6) {
            ((Stack) this.f30458q0).push(abstractC10196V);
            ((Stack) this.f30459r0).push(((Canvas) this.f30454Y).getMatrix());
        }
        Iterator it = abstractC10196V.f30299i.iterator();
        while (it.hasNext()) {
            m10828O((AbstractC10202a0) it.next());
        }
        if (z6) {
            ((Stack) this.f30458q0).pop();
            ((Stack) this.f30459r0).pop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX INFO: renamed from: Q */
    public void m10830Q(C10177F c10177f, C10238s0 c10238s0) {
        float fFloatValue;
        float f10;
        float f11;
        float f12;
        m10837Y();
        Float f13 = c10177f.f30130u;
        float f14 = 0.0f;
        if (f13 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f13.floatValue())) {
            float f15 = c10238s0.f30407c;
            if (f15 == 0.0f && c10238s0.f30408d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(c10238s0.f30408d, f15));
            }
        } else {
            fFloatValue = c10177f.f30130u.floatValue();
        }
        float fM10767c = c10177f.f30125p ? 1.0f : ((C10248x0) this.f30456o0).f30432a.f30286r0.m10767c();
        this.f30456o0 = m10816A(c10177f);
        Matrix matrix = new Matrix();
        matrix.preTranslate(c10238s0.f30405a, c10238s0.f30406b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fM10767c, fM10767c);
        C10173D c10173d = c10177f.f30126q;
        float fM10768d = c10173d != null ? c10173d.m10768d(this) : 0.0f;
        C10173D c10173d2 = c10177f.f30127r;
        float fM10769e = c10173d2 != null ? c10173d2.m10769e(this) : 0.0f;
        C10173D c10173d3 = c10177f.f30128s;
        float fM10768d2 = c10173d3 != null ? c10173d3.m10768d(this) : 3.0f;
        C10173D c10173d4 = c10177f.f30129t;
        float fM10769e2 = c10173d4 != null ? c10173d4.m10769e(this) : 3.0f;
        C10235r c10235r = c10177f.f30328o;
        Canvas canvas = (Canvas) this.f30454Y;
        if (c10235r != null) {
            float fMax = fM10768d2 / c10235r.f30392d;
            float f16 = fM10769e2 / c10235r.f30393e;
            C10233q c10233q = c10177f.f30319n;
            if (c10233q == null) {
                c10233q = C10233q.f30386d;
            }
            if (!c10233q.equals(C10233q.f30385c)) {
                fMax = c10233q.f30388b == 2 ? Math.max(fMax, f16) : Math.min(fMax, f16);
                f16 = fMax;
            }
            matrix.preTranslate((-fM10768d) * fMax, (-fM10769e) * f16);
            canvas.concat(matrix);
            C10235r c10235r2 = c10177f.f30328o;
            float f17 = c10235r2.f30392d * fMax;
            float f18 = c10235r2.f30393e * f16;
            EnumC10231p enumC10231p = c10233q.f30387a;
            int iOrdinal = enumC10231p.ordinal();
            if (iOrdinal == 2) {
                f10 = (fM10768d2 - f17) / 2.0f;
                f11 = 0.0f - f10;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f11 = 0.0f;
                                }
                            }
                        }
                    }
                    f10 = (fM10768d2 - f17) / 2.0f;
                    f11 = 0.0f - f10;
                }
                f10 = fM10768d2 - f17;
                f11 = 0.0f - f10;
            }
            switch (enumC10231p.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f12 = (fM10769e2 - f18) / 2.0f;
                    f14 = 0.0f - f12;
                    if (!((C10248x0) this.f30456o0).f30432a.f30256A0.booleanValue()) {
                        m10833T(f11, f14, fM10768d2, fM10769e2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f16);
                    canvas.concat(matrix);
                    break;
                case 7:
                case 8:
                case 9:
                    f12 = fM10769e2 - f18;
                    f14 = 0.0f - f12;
                    if (!((C10248x0) this.f30456o0).f30432a.f30256A0.booleanValue()) {
                        m10833T(f11, f14, fM10768d2, fM10769e2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f16);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!((C10248x0) this.f30456o0).f30432a.f30256A0.booleanValue()) {
                        m10833T(f11, f14, fM10768d2, fM10769e2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f16);
                    canvas.concat(matrix);
                    break;
            }
        } else {
            matrix.preTranslate(-fM10768d, -fM10769e);
            canvas.concat(matrix);
            if (!((C10248x0) this.f30456o0).f30432a.f30256A0.booleanValue()) {
                m10833T(0.0f, 0.0f, fM10768d2, fM10769e2);
            }
        }
        boolean zM10826M = m10826M();
        m10829P(c10177f, false);
        if (zM10826M) {
            m10825L(c10177f.f30304h);
        }
        m10836X();
    }

    /* JADX INFO: renamed from: R */
    public void m10831R(AbstractC10251z abstractC10251z) {
        C10177F c10177f;
        C10177F c10177f2;
        C10177F c10177f3;
        float f10;
        float f11;
        ArrayList arrayList;
        int size;
        C10193S c10193s = ((C10248x0) this.f30456o0).f30432a;
        String str = c10193s.f30258C0;
        if (str == null && c10193s.f30259D0 == null && c10193s.f30260E0 == null) {
            return;
        }
        if (str == null) {
            c10177f = null;
        } else {
            AbstractC10199Y abstractC10199YM15182C = abstractC10251z.f30314a.m15182C(str);
            if (abstractC10199YM15182C != null) {
                c10177f = (C10177F) abstractC10199YM15182C;
            } else {
                m10812t("Marker reference '%s' not found", ((C10248x0) this.f30456o0).f30432a.f30258C0);
                c10177f = null;
            }
        }
        String str2 = ((C10248x0) this.f30456o0).f30432a.f30259D0;
        if (str2 == null) {
            c10177f2 = null;
        } else {
            AbstractC10199Y abstractC10199YM15182C2 = abstractC10251z.f30314a.m15182C(str2);
            if (abstractC10199YM15182C2 != null) {
                c10177f2 = (C10177F) abstractC10199YM15182C2;
            } else {
                m10812t("Marker reference '%s' not found", ((C10248x0) this.f30456o0).f30432a.f30259D0);
                c10177f2 = null;
            }
        }
        String str3 = ((C10248x0) this.f30456o0).f30432a.f30260E0;
        if (str3 == null) {
            c10177f3 = null;
        } else {
            AbstractC10199Y abstractC10199YM15182C3 = abstractC10251z.f30314a.m15182C(str3);
            if (abstractC10199YM15182C3 != null) {
                c10177f3 = (C10177F) abstractC10199YM15182C3;
            } else {
                m10812t("Marker reference '%s' not found", ((C10248x0) this.f30456o0).f30432a.f30260E0);
                c10177f3 = null;
            }
        }
        if (abstractC10251z instanceof C10185J) {
            arrayList = new C10236r0(this, ((C10185J) abstractC10251z).f30239o).f30394a;
        } else if (abstractC10251z instanceof C10175E) {
            C10175E c10175e = (C10175E) abstractC10251z;
            C10173D c10173d = c10175e.f30120o;
            float fM10768d = c10173d != null ? c10173d.m10768d(this) : 0.0f;
            C10173D c10173d2 = c10175e.f30121p;
            float fM10769e = c10173d2 != null ? c10173d2.m10769e(this) : 0.0f;
            C10173D c10173d3 = c10175e.f30122q;
            float fM10768d2 = c10173d3 != null ? c10173d3.m10768d(this) : 0.0f;
            C10173D c10173d4 = c10175e.f30123r;
            float fM10769e2 = c10173d4 != null ? c10173d4.m10769e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f12 = fM10768d2 - fM10768d;
            float f13 = fM10769e2 - fM10769e;
            arrayList2.add(new C10238s0(fM10768d, fM10769e, f12, f13));
            arrayList2.add(new C10238s0(fM10768d2, fM10769e2, f12, f13));
            arrayList = arrayList2;
        } else {
            C10188M c10188m = (C10188M) abstractC10251z;
            int length = c10188m.f30248o.length;
            if (length < 2) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = c10188m.f30248o;
                C10238s0 c10238s0 = new C10238s0(fArr[0], fArr[1], 0.0f, 0.0f);
                int i10 = 2;
                float f14 = 0.0f;
                float f15 = 0.0f;
                while (true) {
                    f10 = c10238s0.f30406b;
                    f11 = c10238s0.f30405a;
                    if (i10 >= length) {
                        break;
                    }
                    float[] fArr2 = c10188m.f30248o;
                    float f16 = fArr2[i10];
                    float f17 = fArr2[i10 + 1];
                    c10238s0.m10798a(f16, f17);
                    arrayList3.add(c10238s0);
                    c10238s0 = new C10238s0(f16, f17, f16 - f11, f17 - f10);
                    i10 += 2;
                    f15 = f17;
                    f14 = f16;
                }
                if (c10188m instanceof C10189N) {
                    float[] fArr3 = c10188m.f30248o;
                    float f18 = fArr3[0];
                    if (f14 != f18) {
                        float f19 = fArr3[1];
                        if (f15 != f19) {
                            c10238s0.m10798a(f18, f19);
                            arrayList3.add(c10238s0);
                            C10238s0 c10238s1 = new C10238s0(f18, f19, f18 - f11, f19 - f10);
                            c10238s1.m10799b((C10238s0) arrayList3.get(0));
                            arrayList3.add(c10238s1);
                            arrayList3.set(0, c10238s1);
                        }
                    }
                } else {
                    arrayList3.add(c10238s0);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        C10193S c10193s2 = ((C10248x0) this.f30456o0).f30432a;
        c10193s2.f30260E0 = null;
        c10193s2.f30259D0 = null;
        c10193s2.f30258C0 = null;
        if (c10177f != null) {
            m10830Q(c10177f, (C10238s0) arrayList.get(0));
        }
        if (c10177f2 != null && arrayList.size() > 2) {
            int i11 = 1;
            C10238s0 c10238s2 = (C10238s0) arrayList.get(0);
            C10238s0 c10238s3 = (C10238s0) arrayList.get(1);
            while (i11 < size - 1) {
                i11++;
                C10238s0 c10238s4 = (C10238s0) arrayList.get(i11);
                if (c10238s3.f30409e) {
                    float f20 = c10238s3.f30407c;
                    float f21 = c10238s3.f30408d;
                    float f22 = c10238s2.f30405a;
                    float f23 = c10238s3.f30405a;
                    float f24 = c10238s3.f30406b;
                    float f25 = ((f24 - c10238s2.f30406b) * f21) + ((f23 - f22) * f20);
                    if (f25 == 0.0f) {
                        f25 = ((c10238s4.f30405a - f23) * f20) + ((c10238s4.f30406b - f24) * f21);
                    }
                    if (f25 <= 0.0f && (f25 != 0.0f || (f20 <= 0.0f && f21 < 0.0f))) {
                        c10238s3.f30407c = -f20;
                        c10238s3.f30408d = -f21;
                    }
                }
                m10830Q(c10177f2, c10238s3);
                c10238s2 = c10238s3;
                c10238s3 = c10238s4;
            }
        }
        if (c10177f3 != null) {
            m10830Q(c10177f3, (C10238s0) arrayList.get(size - 1));
        }
    }

    /* JADX INFO: renamed from: S */
    public void m10832S(C10179G c10179g, C10235r c10235r) {
        float fM10768d;
        float fM10769e;
        Boolean bool = c10179g.f30132n;
        if (bool == null || !bool.booleanValue()) {
            C10173D c10173d = c10179g.f30134p;
            float fM10766b = c10173d != null ? c10173d.m10766b(this, 1.0f) : 1.2f;
            C10173D c10173d2 = c10179g.f30135q;
            float fM10766b2 = c10173d2 != null ? c10173d2.m10766b(this, 1.0f) : 1.2f;
            fM10768d = fM10766b * c10235r.f30392d;
            fM10769e = fM10766b2 * c10235r.f30393e;
        } else {
            C10173D c10173d3 = c10179g.f30134p;
            fM10768d = c10173d3 != null ? c10173d3.m10768d(this) : c10235r.f30392d;
            C10173D c10173d4 = c10179g.f30135q;
            fM10769e = c10173d4 != null ? c10173d4.m10769e(this) : c10235r.f30393e;
        }
        if (fM10768d == 0.0f || fM10769e == 0.0f) {
            return;
        }
        m10837Y();
        C10248x0 c10248x0M10816A = m10816A(c10179g);
        this.f30456o0 = c10248x0M10816A;
        c10248x0M10816A.f30432a.f30290v0 = Float.valueOf(1.0f);
        boolean zM10826M = m10826M();
        Canvas canvas = (Canvas) this.f30454Y;
        canvas.save();
        Boolean bool2 = c10179g.f30133o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c10235r.f30390b, c10235r.f30391c);
            canvas.scale(c10235r.f30392d, c10235r.f30393e);
        }
        m10829P(c10179g, false);
        canvas.restore();
        if (zM10826M) {
            m10825L(c10235r);
        }
        m10836X();
    }

    /* JADX INFO: renamed from: T */
    public void m10833T(float f10, float f11, float f12, float f13) {
        float fM10768d = f12 + f10;
        float fM10769e = f13 + f11;
        C11238i c11238i = ((C10248x0) this.f30456o0).f30432a.f30257B0;
        if (c11238i != null) {
            f10 += ((C10173D) c11238i.f34011p0).m10768d(this);
            f11 += ((C10173D) ((C10248x0) this.f30456o0).f30432a.f30257B0.f34008Y).m10769e(this);
            fM10768d -= ((C10173D) ((C10248x0) this.f30456o0).f30432a.f30257B0.f34009Z).m10768d(this);
            fM10769e -= ((C10173D) ((C10248x0) this.f30456o0).f30432a.f30257B0.f34010o0).m10769e(this);
        }
        ((Canvas) this.f30454Y).clipRect(f10, f11, fM10768d, fM10769e);
    }

    /* JADX INFO: renamed from: W */
    public C13606o m10835W(String str, String str2, Bundle bundle) {
        int i10;
        try {
            m10834U(str, str2, bundle);
            C18892b c18892b = (C18892b) this.f30456o0;
            C11500p c11500p = c18892b.f60233c;
            int iM12899h = c11500p.m12899h();
            ExecutorC18898h executorC18898h = ExecutorC18898h.f60246o0;
            if (iM12899h < 12000000) {
                return c11500p.m12900i() != 0 ? c18892b.m20206a(bundle).m15128g(executorC18898h, new C15384c(c18892b, 29, bundle)) : AbstractC7854B5.m8116d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            C18903m c18903mM20216n = C18903m.m20216n(c18892b.f60232b);
            synchronized (c18903mM20216n) {
                i10 = c18903mM20216n.f60267a;
                c18903mM20216n.f60267a = i10 + 1;
            }
            return c18903mM20216n.m20230o(new C18902l(i10, 1, bundle, 1)).m15127f(executorC18898h, C18894d.f60239Z);
        } catch (InterruptedException | ExecutionException e10) {
            return AbstractC7854B5.m8116d(e10);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m10836X() {
        ((Canvas) this.f30454Y).restore();
        this.f30456o0 = (C10248x0) ((Stack) this.f30457p0).pop();
    }

    /* JADX INFO: renamed from: Y */
    public void m10837Y() {
        ((Canvas) this.f30454Y).save();
        ((Stack) this.f30457p0).push((C10248x0) this.f30456o0);
        this.f30456o0 = new C10248x0((C10248x0) this.f30456o0);
    }

    /* JADX INFO: renamed from: Z */
    public String m10838Z(String str, boolean z6, boolean z10) {
        if (((C10248x0) this.f30456o0).f30439h) {
            return str.replaceAll("[\\n\\t]", Separators.f31991SP);
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", Separators.f31991SP);
        if (z6) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", Separators.f31991SP);
    }

    /* JADX INFO: renamed from: a0 */
    public void m10839a0(AbstractC10198X abstractC10198X) {
        if (abstractC10198X.f30315b == null || abstractC10198X.f30304h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f30459r0).peek()).invert(matrix)) {
            C10235r c10235r = abstractC10198X.f30304h;
            float f10 = c10235r.f30390b;
            float f11 = c10235r.f30391c;
            float fM10796c = c10235r.m10796c();
            C10235r c10235r2 = abstractC10198X.f30304h;
            float f12 = c10235r2.f30391c;
            float fM10796c2 = c10235r2.m10796c();
            float fM10797d = abstractC10198X.f30304h.m10797d();
            C10235r c10235r3 = abstractC10198X.f30304h;
            float[] fArr = {f10, f11, fM10796c, f12, fM10796c2, fM10797d, c10235r3.f30390b, c10235r3.m10797d()};
            matrix.preConcat(((Canvas) this.f30454Y).getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            AbstractC10198X abstractC10198X2 = (AbstractC10198X) ((Stack) this.f30458q0).peek();
            C10235r c10235r4 = abstractC10198X2.f30304h;
            if (c10235r4 == null) {
                float f17 = rectF.left;
                float f18 = rectF.top;
                abstractC10198X2.f30304h = new C10235r(f17, f18, rectF.right - f17, rectF.bottom - f18);
                return;
            }
            float f19 = rectF.left;
            float f20 = rectF.top;
            float f21 = rectF.right - f19;
            float f22 = rectF.bottom - f20;
            if (f19 < c10235r4.f30390b) {
                c10235r4.f30390b = f19;
            }
            if (f20 < c10235r4.f30391c) {
                c10235r4.f30391c = f20;
            }
            if (f19 + f21 > c10235r4.m10796c()) {
                c10235r4.f30392d = (f19 + f21) - c10235r4.f30390b;
            }
            if (f20 + f22 > c10235r4.m10797d()) {
                c10235r4.f30393e = (f20 + f22) - c10235r4.f30391c;
            }
        }
    }

    @Override // p887m7.InterfaceC17178d
    /* JADX INFO: renamed from: b */
    public AbstractC11330w mo10840b(C11682a context, List batch, byte[] bArr) {
        AbstractC11330w c17192r;
        int i10;
        List listM9974d;
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34098Y;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(batch, "batch");
        int i11 = 5;
        try {
            C13289a c13289aMo6986a = ((InterfaceC13290b) this.f30454Y).mo6986a(context, batch);
            try {
                c17192r = m10856u(c13289aMo6986a);
            } catch (UnknownHostException e10) {
                AbstractC7889G0.m8184b((InterfaceC11256c) this.f30455Z, 5, enumC11255b2, new C13298H(context, 29), e10, false, 48);
                c17192r = new C17184j(true, 0, e10, 2);
            } catch (IOException e11) {
                AbstractC7889G0.m8184b((InterfaceC11256c) this.f30455Z, 5, enumC11255b2, C17175a.f54861p0, e11, false, 48);
                c17192r = new C17189o(true, 0, e11, 2);
            } catch (Throwable th2) {
                AbstractC7889G0.m8184b((InterfaceC11256c) this.f30455Z, 5, enumC11255b2, C17175a.f54862q0, th2, false, 48);
                c17192r = new C17192r(true, 0, th2, 2);
            }
            String str = c13289aMo6986a.f42003b;
            int length = c13289aMo6986a.f42006e.length;
            String str2 = c13289aMo6986a.f42002a;
            InterfaceC11256c logger = (InterfaceC11256c) this.f30455Z;
            AbstractC16544l.m18094g(logger, "logger");
            boolean z6 = c17192r instanceof C17185k;
            if (z6 ? true : c17192r instanceof C17187m ? true : c17192r instanceof C17188n ? true : c17192r instanceof C17190p ? true : c17192r instanceof C17192r ? true : c17192r instanceof C17193s) {
                i10 = i11;
            } else {
                if (c17192r instanceof C17184j ? true : c17192r instanceof C17186l ? true : c17192r instanceof C17189o) {
                    i11 = 4;
                } else if (c17192r instanceof C17191q) {
                    i11 = 3;
                } else {
                    i10 = 1;
                }
                i10 = i11;
            }
            if (z6 ? true : c17192r instanceof C17186l) {
                listM9974d = AbstractC17681o.m19382k(enumC11255b2, enumC11255b);
            } else {
                listM9974d = c17192r instanceof C17184j ? true : c17192r instanceof C17187m ? true : c17192r instanceof C17188n ? true : c17192r instanceof C17189o ? true : c17192r instanceof C17190p ? true : c17192r instanceof C17191q ? true : c17192r instanceof C17192r ? true : c17192r instanceof C17193s ? AbstractC9393x3.m9974d(enumC11255b2) : C17689w.f56480Y;
            }
            AbstractC7889G0.m8185c(logger, i10, listM9974d, new C6950h(c17192r, str2, length, str, 2), null, 56);
            return c17192r;
        } catch (Exception e12) {
            AbstractC7889G0.m8185c((InterfaceC11256c) this.f30455Z, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), C17175a.f54860o0, e12, 48);
            return new C17190p(false, 0, e12, 2);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m10841b0(C10248x0 c10248x0, C10193S c10193s) {
        C10193S c10193s2;
        if (m10802E(c10193s, 4096L)) {
            c10248x0.f30432a.f30291w0 = c10193s.f30291w0;
        }
        if (m10802E(c10193s, 2048L)) {
            c10248x0.f30432a.f30290v0 = c10193s.f30290v0;
        }
        boolean zM10802E = m10802E(c10193s, 1L);
        C10241u c10241u = C10241u.f30415o0;
        if (zM10802E) {
            c10248x0.f30432a.f30282Z = c10193s.f30282Z;
            AbstractC10204b0 abstractC10204b0 = c10193s.f30282Z;
            c10248x0.f30433b = (abstractC10204b0 == null || abstractC10204b0 == c10241u) ? false : true;
        }
        if (m10802E(c10193s, 4L)) {
            c10248x0.f30432a.f30283o0 = c10193s.f30283o0;
        }
        if (m10802E(c10193s, 6149L)) {
            m10804V(c10248x0, true, c10248x0.f30432a.f30282Z);
        }
        if (m10802E(c10193s, 2L)) {
            c10248x0.f30432a.f30271P0 = c10193s.f30271P0;
        }
        if (m10802E(c10193s, 8L)) {
            c10248x0.f30432a.f30284p0 = c10193s.f30284p0;
            AbstractC10204b0 abstractC10204b1 = c10193s.f30284p0;
            c10248x0.f30434c = (abstractC10204b1 == null || abstractC10204b1 == c10241u) ? false : true;
        }
        if (m10802E(c10193s, 16L)) {
            c10248x0.f30432a.f30285q0 = c10193s.f30285q0;
        }
        if (m10802E(c10193s, 6168L)) {
            m10804V(c10248x0, false, c10248x0.f30432a.f30284p0);
        }
        if (m10802E(c10193s, 34359738368L)) {
            c10248x0.f30432a.f30279X0 = c10193s.f30279X0;
        }
        if (m10802E(c10193s, 32L)) {
            C10193S c10193s3 = c10248x0.f30432a;
            C10173D c10173d = c10193s.f30286r0;
            c10193s3.f30286r0 = c10173d;
            c10248x0.f30436e.setStrokeWidth(c10173d.m10765a(this));
        }
        if (m10802E(c10193s, 64L)) {
            c10248x0.f30432a.f30272Q0 = c10193s.f30272Q0;
            int iM24h = AbstractC0010F.m24h(c10193s.f30272Q0);
            Paint paint = c10248x0.f30436e;
            if (iM24h == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iM24h == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iM24h == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m10802E(c10193s, 128L)) {
            c10248x0.f30432a.f30273R0 = c10193s.f30273R0;
            int iM24h2 = AbstractC0010F.m24h(c10193s.f30273R0);
            Paint paint2 = c10248x0.f30436e;
            if (iM24h2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iM24h2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iM24h2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m10802E(c10193s, 256L)) {
            c10248x0.f30432a.f30287s0 = c10193s.f30287s0;
            c10248x0.f30436e.setStrokeMiter(c10193s.f30287s0.floatValue());
        }
        if (m10802E(c10193s, 512L)) {
            c10248x0.f30432a.f30288t0 = c10193s.f30288t0;
        }
        if (m10802E(c10193s, 1024L)) {
            c10248x0.f30432a.f30289u0 = c10193s.f30289u0;
        }
        Typeface typefaceM10810m = null;
        if (m10802E(c10193s, 1536L)) {
            C10173D[] c10173dArr = c10248x0.f30432a.f30288t0;
            Paint paint3 = c10248x0.f30436e;
            if (c10173dArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c10173dArr.length;
                int i10 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i10];
                int i11 = 0;
                float f10 = 0.0f;
                while (true) {
                    c10193s2 = c10248x0.f30432a;
                    if (i11 >= i10) {
                        break;
                    }
                    float fM10765a = c10193s2.f30288t0[i11 % length].m10765a(this);
                    fArr[i11] = fM10765a;
                    f10 += fM10765a;
                    i11++;
                }
                if (f10 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fM10765a2 = c10193s2.f30289u0.m10765a(this);
                    if (fM10765a2 < 0.0f) {
                        fM10765a2 = (fM10765a2 % f10) + f10;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fM10765a2));
                }
            }
        }
        if (m10802E(c10193s, 16384L)) {
            float textSize = ((C10248x0) this.f30456o0).f30435d.getTextSize();
            c10248x0.f30432a.f30293y0 = c10193s.f30293y0;
            c10248x0.f30435d.setTextSize(c10193s.f30293y0.m10766b(this, textSize));
            c10248x0.f30436e.setTextSize(c10193s.f30293y0.m10766b(this, textSize));
        }
        if (m10802E(c10193s, 8192L)) {
            c10248x0.f30432a.f30292x0 = c10193s.f30292x0;
        }
        if (m10802E(c10193s, 32768L)) {
            if (c10193s.f30294z0.intValue() == -1 && c10248x0.f30432a.f30294z0.intValue() > 100) {
                C10193S c10193s4 = c10248x0.f30432a;
                c10193s4.f30294z0 = Integer.valueOf(c10193s4.f30294z0.intValue() - 100);
            } else if (c10193s.f30294z0.intValue() != 1 || c10248x0.f30432a.f30294z0.intValue() >= 900) {
                c10248x0.f30432a.f30294z0 = c10193s.f30294z0;
            } else {
                C10193S c10193s5 = c10248x0.f30432a;
                c10193s5.f30294z0 = Integer.valueOf(c10193s5.f30294z0.intValue() + 100);
            }
        }
        if (m10802E(c10193s, 65536L)) {
            c10248x0.f30432a.f30274S0 = c10193s.f30274S0;
        }
        if (m10802E(c10193s, 106496L)) {
            C10193S c10193s6 = c10248x0.f30432a;
            ArrayList arrayList = c10193s6.f30292x0;
            if (arrayList != null && ((C13711h) this.f30455Z) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typefaceM10810m = m10810m((String) it.next(), c10193s6.f30274S0, c10193s6.f30294z0);
                    if (typefaceM10810m != null) {
                        break;
                    }
                }
            }
            if (typefaceM10810m == null) {
                typefaceM10810m = m10810m("serif", c10193s6.f30274S0, c10193s6.f30294z0);
            }
            c10248x0.f30435d.setTypeface(typefaceM10810m);
            c10248x0.f30436e.setTypeface(typefaceM10810m);
        }
        if (m10802E(c10193s, 131072L)) {
            c10248x0.f30432a.f30275T0 = c10193s.f30275T0;
            boolean z6 = c10193s.f30275T0 == 4;
            Paint paint4 = c10248x0.f30435d;
            paint4.setStrikeThruText(z6);
            paint4.setUnderlineText(c10193s.f30275T0 == 2);
            boolean z10 = c10193s.f30275T0 == 4;
            Paint paint5 = c10248x0.f30436e;
            paint5.setStrikeThruText(z10);
            paint5.setUnderlineText(c10193s.f30275T0 == 2);
        }
        if (m10802E(c10193s, 68719476736L)) {
            c10248x0.f30432a.f30276U0 = c10193s.f30276U0;
        }
        if (m10802E(c10193s, 262144L)) {
            c10248x0.f30432a.f30277V0 = c10193s.f30277V0;
        }
        if (m10802E(c10193s, 524288L)) {
            c10248x0.f30432a.f30256A0 = c10193s.f30256A0;
        }
        if (m10802E(c10193s, 2097152L)) {
            c10248x0.f30432a.f30258C0 = c10193s.f30258C0;
        }
        if (m10802E(c10193s, 4194304L)) {
            c10248x0.f30432a.f30259D0 = c10193s.f30259D0;
        }
        if (m10802E(c10193s, 8388608L)) {
            c10248x0.f30432a.f30260E0 = c10193s.f30260E0;
        }
        if (m10802E(c10193s, 16777216L)) {
            c10248x0.f30432a.f30261F0 = c10193s.f30261F0;
        }
        if (m10802E(c10193s, 33554432L)) {
            c10248x0.f30432a.f30262G0 = c10193s.f30262G0;
        }
        if (m10802E(c10193s, 1048576L)) {
            c10248x0.f30432a.f30257B0 = c10193s.f30257B0;
        }
        if (m10802E(c10193s, 268435456L)) {
            c10248x0.f30432a.f30265J0 = c10193s.f30265J0;
        }
        if (m10802E(c10193s, 536870912L)) {
            c10248x0.f30432a.f30278W0 = c10193s.f30278W0;
        }
        if (m10802E(c10193s, 1073741824L)) {
            c10248x0.f30432a.f30266K0 = c10193s.f30266K0;
        }
        if (m10802E(c10193s, 67108864L)) {
            c10248x0.f30432a.f30263H0 = c10193s.f30263H0;
        }
        if (m10802E(c10193s, 134217728L)) {
            c10248x0.f30432a.f30264I0 = c10193s.f30264I0;
        }
        if (m10802E(c10193s, 8589934592L)) {
            c10248x0.f30432a.f30269N0 = c10193s.f30269N0;
        }
        if (m10802E(c10193s, 17179869184L)) {
            c10248x0.f30432a.f30270O0 = c10193s.f30270O0;
        }
        if (m10802E(c10193s, 137438953472L)) {
            c10248x0.f30432a.f30281Y0 = c10193s.f30281Y0;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m10842c0(AbstractC10199Y abstractC10199Y, C10248x0 c10248x0) {
        boolean z6 = abstractC10199Y.f30315b == null;
        C10193S c10193s = c10248x0.f30432a;
        Boolean bool = Boolean.TRUE;
        c10193s.f30261F0 = bool;
        if (!z6) {
            bool = Boolean.FALSE;
        }
        c10193s.f30256A0 = bool;
        c10193s.f30257B0 = null;
        c10193s.f30265J0 = null;
        c10193s.f30290v0 = Float.valueOf(1.0f);
        c10193s.f30263H0 = C10241u.f30414Z;
        c10193s.f30264I0 = Float.valueOf(1.0f);
        c10193s.f30266K0 = null;
        c10193s.f30267L0 = null;
        c10193s.f30268M0 = Float.valueOf(1.0f);
        c10193s.f30269N0 = null;
        c10193s.f30270O0 = Float.valueOf(1.0f);
        c10193s.f30279X0 = 1;
        C10193S c10193s2 = abstractC10199Y.f30307e;
        if (c10193s2 != null) {
            m10841b0(c10248x0, c10193s2);
        }
        ArrayList arrayList = ((C4535c) ((C13711h) this.f30455Z).f43260o0).f14813Z;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (C10223l c10223l : ((C4535c) ((C13711h) this.f30455Z).f43260o0).f14813Z) {
                if (C7042K.m7433j(c10223l.f30349a, abstractC10199Y)) {
                    m10841b0(c10248x0, c10223l.f30350b);
                }
            }
        }
        C10193S c10193s3 = abstractC10199Y.f30308f;
        if (c10193s3 != null) {
            m10841b0(c10248x0, c10193s3);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m10843d(String str, String str2) {
        HashMap map = (HashMap) this.f30459r0;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: d0 */
    public void m10844d0() {
        int iM10811n;
        C10193S c10193s = ((C10248x0) this.f30456o0).f30432a;
        AbstractC10204b0 abstractC10204b0 = c10193s.f30269N0;
        if (abstractC10204b0 instanceof C10241u) {
            iM10811n = ((C10241u) abstractC10204b0).f30416Y;
        } else if (!(abstractC10204b0 instanceof C10243v)) {
            return;
        } else {
            iM10811n = c10193s.f30291w0.f30416Y;
        }
        Float f10 = c10193s.f30270O0;
        if (f10 != null) {
            iM10811n = m10811n(iM10811n, f10.floatValue());
        }
        ((Canvas) this.f30454Y).drawColor(iM10811n);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m10845e0() {
        Boolean bool = ((C10248x0) this.f30456o0).f30432a.f30262G0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public C9681h m10846f() {
        String strM11052j = ((String) this.f30454Y) == null ? " transportName" : "";
        if (((C9685l) this.f30456o0) == null) {
            strM11052j = strM11052j.concat(" encodedPayload");
        }
        if (((Long) this.f30457p0) == null) {
            strM11052j = AbstractC10763a.m11052j(strM11052j, " eventMillis");
        }
        if (((Long) this.f30458q0) == null) {
            strM11052j = AbstractC10763a.m11052j(strM11052j, " uptimeMillis");
        }
        if (((HashMap) this.f30459r0) == null) {
            strM11052j = AbstractC10763a.m11052j(strM11052j, " autoMetadata");
        }
        if (strM11052j.isEmpty()) {
            return new C9681h((String) this.f30454Y, (Integer) this.f30455Z, (C9685l) this.f30456o0, ((Long) this.f30457p0).longValue(), ((Long) this.f30458q0).longValue(), (HashMap) this.f30459r0);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM11052j));
    }

    /* JADX INFO: renamed from: g */
    public Path m10847g(AbstractC10198X abstractC10198X, C10235r c10235r) {
        Path pathM10824K;
        AbstractC10199Y abstractC10199YM15182C = abstractC10198X.f30314a.m15182C(((C10248x0) this.f30456o0).f30432a.f30265J0);
        if (abstractC10199YM15182C == null) {
            m10812t("ClipPath reference '%s' not found", ((C10248x0) this.f30456o0).f30432a.f30265J0);
            return null;
        }
        C10239t c10239t = (C10239t) abstractC10199YM15182C;
        ((Stack) this.f30457p0).push((C10248x0) this.f30456o0);
        this.f30456o0 = m10816A(c10239t);
        Boolean bool = c10239t.f30410o;
        boolean z6 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z6) {
            matrix.preTranslate(c10235r.f30390b, c10235r.f30391c);
            matrix.preScale(c10235r.f30392d, c10235r.f30393e);
        }
        Matrix matrix2 = c10239t.f30108n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (AbstractC10202a0 abstractC10202a0 : c10239t.f30299i) {
            if ((abstractC10202a0 instanceof AbstractC10198X) && (pathM10824K = m10824K((AbstractC10198X) abstractC10202a0, true)) != null) {
                path.op(pathM10824K, Path.Op.UNION);
            }
        }
        if (((C10248x0) this.f30456o0).f30432a.f30265J0 != null) {
            if (c10239t.f30304h == null) {
                c10239t.f30304h = m10808h(path);
            }
            Path pathM10847g = m10847g(c10239t, c10239t.f30304h);
            if (pathM10847g != null) {
                path.op(pathM10847g, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f30456o0 = (C10248x0) ((Stack) this.f30457p0).pop();
        return path;
    }

    /* JADX INFO: renamed from: i */
    public float m10848i(AbstractC10224l0 abstractC10224l0) {
        C10250y0 c10250y0 = new C10250y0(this);
        m10855s(abstractC10224l0, c10250y0);
        return c10250y0.f30445c;
    }

    /* JADX INFO: renamed from: k */
    public void m10849k(AbstractC10198X abstractC10198X, C10235r c10235r) {
        Path pathM10847g;
        if (((C10248x0) this.f30456o0).f30432a.f30265J0 == null || (pathM10847g = m10847g(abstractC10198X, c10235r)) == null) {
            return;
        }
        ((Canvas) this.f30454Y).clipPath(pathM10847g);
    }

    /* JADX INFO: renamed from: l */
    public void m10850l(AbstractC10198X abstractC10198X) {
        AbstractC10204b0 abstractC10204b0 = ((C10248x0) this.f30456o0).f30432a.f30282Z;
        if (abstractC10204b0 instanceof C10183I) {
            m10851o(true, abstractC10198X.f30304h, (C10183I) abstractC10204b0);
        }
        AbstractC10204b0 abstractC10204b1 = ((C10248x0) this.f30456o0).f30432a.f30284p0;
        if (abstractC10204b1 instanceof C10183I) {
            m10851o(false, abstractC10198X.f30304h, (C10183I) abstractC10204b1);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m10851o(boolean z6, C10235r c10235r, C10183I c10183i) {
        float fM10766b;
        float f10;
        float fM10766b2;
        float fM10766b3;
        float f11;
        float fM10766b4;
        float f12;
        int i10;
        AbstractC10199Y abstractC10199YM15182C = ((C13711h) this.f30455Z).m15182C(c10183i.f30236Y);
        if (abstractC10199YM15182C == null) {
            m10812t("%s reference '%s' not found", z6 ? "Fill" : "Stroke", c10183i.f30236Y);
            AbstractC10204b0 abstractC10204b0 = c10183i.f30237Z;
            if (abstractC10204b0 != null) {
                m10804V((C10248x0) this.f30456o0, z6, abstractC10204b0);
                return;
            } else if (z6) {
                ((C10248x0) this.f30456o0).f30433b = false;
                return;
            } else {
                ((C10248x0) this.f30456o0).f30434c = false;
                return;
            }
        }
        boolean z10 = abstractC10199YM15182C instanceof C10200Z;
        C10241u c10241u = C10241u.f30414Z;
        if (z10) {
            C10200Z c10200z = (C10200Z) abstractC10199YM15182C;
            String str = c10200z.f30444l;
            if (str != null) {
                m10813x(c10200z, str);
            }
            Boolean bool = c10200z.f30441i;
            boolean z11 = bool != null && bool.booleanValue();
            C10248x0 c10248x0 = (C10248x0) this.f30456o0;
            Paint paint = z6 ? c10248x0.f30435d : c10248x0.f30436e;
            if (z11) {
                C10248x0 c10248x1 = (C10248x0) this.f30456o0;
                C10235r c10235r2 = c10248x1.f30438g;
                if (c10235r2 == null) {
                    c10235r2 = c10248x1.f30437f;
                }
                C10173D c10173d = c10200z.f30310m;
                float fM10768d = c10173d != null ? c10173d.m10768d(this) : 0.0f;
                C10173D c10173d2 = c10200z.f30311n;
                fM10766b3 = c10173d2 != null ? c10173d2.m10769e(this) : 0.0f;
                C10173D c10173d3 = c10200z.f30312o;
                float fM10768d2 = c10173d3 != null ? c10173d3.m10768d(this) : c10235r2.f30392d;
                C10173D c10173d4 = c10200z.f30313p;
                f12 = fM10768d2;
                fM10766b4 = c10173d4 != null ? c10173d4.m10769e(this) : 0.0f;
                f11 = fM10768d;
            } else {
                C10173D c10173d5 = c10200z.f30310m;
                float fM10766b5 = c10173d5 != null ? c10173d5.m10766b(this, 1.0f) : 0.0f;
                C10173D c10173d6 = c10200z.f30311n;
                fM10766b3 = c10173d6 != null ? c10173d6.m10766b(this, 1.0f) : 0.0f;
                C10173D c10173d7 = c10200z.f30312o;
                float fM10766b6 = c10173d7 != null ? c10173d7.m10766b(this, 1.0f) : 1.0f;
                C10173D c10173d8 = c10200z.f30313p;
                f11 = fM10766b5;
                fM10766b4 = c10173d8 != null ? c10173d8.m10766b(this, 1.0f) : 0.0f;
                f12 = fM10766b6;
            }
            float f13 = fM10766b3;
            m10837Y();
            this.f30456o0 = m10816A(c10200z);
            Matrix matrix = new Matrix();
            if (!z11) {
                matrix.preTranslate(c10235r.f30390b, c10235r.f30391c);
                matrix.preScale(c10235r.f30392d, c10235r.f30393e);
            }
            Matrix matrix2 = c10200z.f30442j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c10200z.f30440h.size();
            if (size == 0) {
                m10836X();
                if (z6) {
                    ((C10248x0) this.f30456o0).f30433b = false;
                    return;
                } else {
                    ((C10248x0) this.f30456o0).f30434c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = c10200z.f30440h.iterator();
            int i11 = 0;
            float f14 = -1.0f;
            while (it.hasNext()) {
                C10192Q c10192q = (C10192Q) ((AbstractC10202a0) it.next());
                Float f15 = c10192q.f30255h;
                float fFloatValue = f15 != null ? f15.floatValue() : 0.0f;
                if (i11 == 0 || fFloatValue >= f14) {
                    fArr[i11] = fFloatValue;
                    f14 = fFloatValue;
                } else {
                    fArr[i11] = f14;
                }
                m10837Y();
                m10842c0(c10192q, (C10248x0) this.f30456o0);
                C10193S c10193s = ((C10248x0) this.f30456o0).f30432a;
                C10241u c10241u2 = (C10241u) c10193s.f30263H0;
                if (c10241u2 == null) {
                    c10241u2 = c10241u;
                }
                iArr[i11] = m10811n(c10241u2.f30416Y, c10193s.f30264I0.floatValue());
                i11++;
                m10836X();
            }
            if ((f11 == f12 && f13 == fM10766b4) || size == 1) {
                m10836X();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i12 = c10200z.f30443k;
            if (i12 != 0) {
                if (i12 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i12 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            m10836X();
            LinearGradient linearGradient = new LinearGradient(f11, f13, f12, fM10766b4, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((C10248x0) this.f30456o0).f30432a.f30283o0.floatValue() * 256.0f);
            if (iFloatValue < 0) {
                i10 = 0;
            } else {
                i10 = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i10);
            return;
        }
        if (!(abstractC10199YM15182C instanceof C10208d0)) {
            if (abstractC10199YM15182C instanceof C10191P) {
                C10191P c10191p = (C10191P) abstractC10199YM15182C;
                if (z6) {
                    if (m10802E(c10191p.f30307e, 2147483648L)) {
                        C10248x0 c10248x2 = (C10248x0) this.f30456o0;
                        C10193S c10193s2 = c10248x2.f30432a;
                        AbstractC10204b0 abstractC10204b1 = c10191p.f30307e.f30267L0;
                        c10193s2.f30282Z = abstractC10204b1;
                        c10248x2.f30433b = abstractC10204b1 != null;
                    }
                    if (m10802E(c10191p.f30307e, 4294967296L)) {
                        ((C10248x0) this.f30456o0).f30432a.f30283o0 = c10191p.f30307e.f30268M0;
                    }
                    if (m10802E(c10191p.f30307e, 6442450944L)) {
                        C10248x0 c10248x3 = (C10248x0) this.f30456o0;
                        m10804V(c10248x3, z6, c10248x3.f30432a.f30282Z);
                        return;
                    }
                    return;
                }
                if (m10802E(c10191p.f30307e, 2147483648L)) {
                    C10248x0 c10248x4 = (C10248x0) this.f30456o0;
                    C10193S c10193s3 = c10248x4.f30432a;
                    AbstractC10204b0 abstractC10204b2 = c10191p.f30307e.f30267L0;
                    c10193s3.f30284p0 = abstractC10204b2;
                    c10248x4.f30434c = abstractC10204b2 != null;
                }
                if (m10802E(c10191p.f30307e, 4294967296L)) {
                    ((C10248x0) this.f30456o0).f30432a.f30285q0 = c10191p.f30307e.f30268M0;
                }
                if (m10802E(c10191p.f30307e, 6442450944L)) {
                    C10248x0 c10248x5 = (C10248x0) this.f30456o0;
                    m10804V(c10248x5, z6, c10248x5.f30432a.f30284p0);
                    return;
                }
                return;
            }
            return;
        }
        C10208d0 c10208d0 = (C10208d0) abstractC10199YM15182C;
        String str2 = c10208d0.f30444l;
        if (str2 != null) {
            m10813x(c10208d0, str2);
        }
        Boolean bool2 = c10208d0.f30441i;
        boolean z12 = bool2 != null && bool2.booleanValue();
        C10248x0 c10248x6 = (C10248x0) this.f30456o0;
        Paint paint2 = z6 ? c10248x6.f30435d : c10248x6.f30436e;
        if (z12) {
            C10173D c10173d9 = new C10173D(9, 50.0f);
            C10173D c10173d10 = c10208d0.f30323m;
            float fM10768d3 = c10173d10 != null ? c10173d10.m10768d(this) : c10173d9.m10768d(this);
            C10173D c10173d11 = c10208d0.f30324n;
            fM10766b = c10173d11 != null ? c10173d11.m10769e(this) : c10173d9.m10769e(this);
            C10173D c10173d12 = c10208d0.f30325o;
            fM10766b2 = c10173d12 != null ? c10173d12.m10765a(this) : c10173d9.m10765a(this);
            f10 = fM10768d3;
        } else {
            C10173D c10173d13 = c10208d0.f30323m;
            float fM10766b7 = c10173d13 != null ? c10173d13.m10766b(this, 1.0f) : 0.5f;
            C10173D c10173d14 = c10208d0.f30324n;
            fM10766b = c10173d14 != null ? c10173d14.m10766b(this, 1.0f) : 0.5f;
            C10173D c10173d15 = c10208d0.f30325o;
            f10 = fM10766b7;
            fM10766b2 = c10173d15 != null ? c10173d15.m10766b(this, 1.0f) : 0.5f;
        }
        float f16 = fM10766b;
        m10837Y();
        this.f30456o0 = m10816A(c10208d0);
        Matrix matrix3 = new Matrix();
        if (!z12) {
            matrix3.preTranslate(c10235r.f30390b, c10235r.f30391c);
            matrix3.preScale(c10235r.f30392d, c10235r.f30393e);
        }
        Matrix matrix4 = c10208d0.f30442j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = c10208d0.f30440h.size();
        if (size2 == 0) {
            m10836X();
            if (z6) {
                ((C10248x0) this.f30456o0).f30433b = false;
                return;
            } else {
                ((C10248x0) this.f30456o0).f30434c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = c10208d0.f30440h.iterator();
        int i13 = 0;
        float f17 = -1.0f;
        while (it2.hasNext()) {
            C10192Q c10192q2 = (C10192Q) ((AbstractC10202a0) it2.next());
            Float f18 = c10192q2.f30255h;
            float fFloatValue2 = f18 != null ? f18.floatValue() : 0.0f;
            if (i13 == 0 || fFloatValue2 >= f17) {
                fArr2[i13] = fFloatValue2;
                f17 = fFloatValue2;
            } else {
                fArr2[i13] = f17;
            }
            m10837Y();
            m10842c0(c10192q2, (C10248x0) this.f30456o0);
            C10193S c10193s4 = ((C10248x0) this.f30456o0).f30432a;
            C10241u c10241u3 = (C10241u) c10193s4.f30263H0;
            if (c10241u3 == null) {
                c10241u3 = c10241u;
            }
            iArr2[i13] = m10811n(c10241u3.f30416Y, c10193s4.f30264I0.floatValue());
            i13++;
            m10836X();
        }
        if (fM10766b2 == 0.0f || size2 == 1) {
            m10836X();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i14 = c10208d0.f30443k;
        if (i14 != 0) {
            if (i14 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i14 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        m10836X();
        RadialGradient radialGradient = new RadialGradient(f10, f16, fM10766b2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((C10248x0) this.f30456o0).f30432a.f30283o0.floatValue() * 256.0f);
        if (iFloatValue2 < 0) {
            iFloatValue2 = 0;
        } else if (iFloatValue2 > 255) {
            iFloatValue2 = 255;
        }
        paint2.setAlpha(iFloatValue2);
    }

    /* JADX INFO: renamed from: p */
    public boolean m10852p() {
        Boolean bool = ((C10248x0) this.f30456o0).f30432a.f30261F0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0212 A[LOOP:3: B:104:0x020c->B:106:0x0212, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0177  */
    /* JADX INFO: renamed from: q */
    public void m10853q(AbstractC10198X abstractC10198X, Path path) {
        float fM10768d;
        float fM10769e;
        float fM10769e2;
        float fM10768d2;
        boolean z6;
        boolean z10;
        Canvas canvas;
        C10233q c10233q;
        Iterator it;
        AbstractC10204b0 abstractC10204b0 = ((C10248x0) this.f30456o0).f30432a.f30282Z;
        boolean z11 = abstractC10204b0 instanceof C10183I;
        Canvas canvas2 = (Canvas) this.f30454Y;
        if (z11) {
            AbstractC10199Y abstractC10199YM15182C = ((C13711h) this.f30455Z).m15182C(((C10183I) abstractC10204b0).f30236Y);
            if (abstractC10199YM15182C instanceof C10187L) {
                C10187L c10187l = (C10187L) abstractC10199YM15182C;
                Boolean bool = c10187l.f30240p;
                boolean z12 = bool != null && bool.booleanValue();
                String str = c10187l.f30247w;
                if (str != null) {
                    m10815z(c10187l, str);
                }
                if (z12) {
                    C10173D c10173d = c10187l.f30243s;
                    fM10768d = c10173d != null ? c10173d.m10768d(this) : 0.0f;
                    C10173D c10173d2 = c10187l.f30244t;
                    fM10769e2 = c10173d2 != null ? c10173d2.m10769e(this) : 0.0f;
                    C10173D c10173d3 = c10187l.f30245u;
                    fM10768d2 = c10173d3 != null ? c10173d3.m10768d(this) : 0.0f;
                    C10173D c10173d4 = c10187l.f30246v;
                    fM10769e = c10173d4 != null ? c10173d4.m10769e(this) : 0.0f;
                } else {
                    C10173D c10173d5 = c10187l.f30243s;
                    float fM10766b = c10173d5 != null ? c10173d5.m10766b(this, 1.0f) : 0.0f;
                    C10173D c10173d6 = c10187l.f30244t;
                    float fM10766b2 = c10173d6 != null ? c10173d6.m10766b(this, 1.0f) : 0.0f;
                    C10173D c10173d7 = c10187l.f30245u;
                    float fM10766b3 = c10173d7 != null ? c10173d7.m10766b(this, 1.0f) : 0.0f;
                    C10173D c10173d8 = c10187l.f30246v;
                    float fM10766b4 = c10173d8 != null ? c10173d8.m10766b(this, 1.0f) : 0.0f;
                    C10235r c10235r = abstractC10198X.f30304h;
                    float f10 = c10235r.f30390b;
                    float f11 = c10235r.f30392d;
                    fM10768d = (fM10766b * f11) + f10;
                    float f12 = c10235r.f30391c;
                    float f13 = c10235r.f30393e;
                    float f14 = f11 * fM10766b3;
                    fM10769e = fM10766b4 * f13;
                    fM10769e2 = (fM10766b2 * f13) + f12;
                    fM10768d2 = f14;
                }
                if (fM10768d2 == 0.0f || fM10769e == 0.0f) {
                    return;
                }
                C10233q c10233q2 = c10187l.f30319n;
                if (c10233q2 == null) {
                    c10233q2 = C10233q.f30386d;
                }
                m10837Y();
                canvas2.clipPath(path);
                C10248x0 c10248x0 = new C10248x0();
                m10841b0(c10248x0, C10193S.m10774a());
                c10248x0.f30432a.f30256A0 = Boolean.FALSE;
                m10817B(c10187l, c10248x0);
                this.f30456o0 = c10248x0;
                C10235r c10235r2 = abstractC10198X.f30304h;
                Matrix matrix = c10187l.f30242r;
                if (matrix != null) {
                    canvas2.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (c10187l.f30242r.invert(matrix2)) {
                        C10235r c10235r3 = abstractC10198X.f30304h;
                        float f15 = c10235r3.f30390b;
                        float f16 = c10235r3.f30391c;
                        float fM10796c = c10235r3.m10796c();
                        C10235r c10235r4 = abstractC10198X.f30304h;
                        float f17 = c10235r4.f30391c;
                        float fM10796c2 = c10235r4.m10796c();
                        float fM10797d = abstractC10198X.f30304h.m10797d();
                        C10235r c10235r5 = abstractC10198X.f30304h;
                        float[] fArr = {f15, f16, fM10796c, f17, fM10796c2, fM10797d, c10235r5.f30390b, c10235r5.m10797d()};
                        matrix2.mapPoints(fArr);
                        z10 = false;
                        float f18 = fArr[0];
                        float f19 = fArr[1];
                        RectF rectF = new RectF(f18, f19, f18, f19);
                        for (int i10 = 2; i10 <= 6; i10 += 2) {
                            float f20 = fArr[i10];
                            if (f20 < rectF.left) {
                                rectF.left = f20;
                            }
                            if (f20 > rectF.right) {
                                rectF.right = f20;
                            }
                            float f21 = fArr[i10 + 1];
                            if (f21 < rectF.top) {
                                rectF.top = f21;
                            }
                            if (f21 > rectF.bottom) {
                                rectF.bottom = f21;
                            }
                        }
                        z6 = true;
                        float f22 = rectF.left;
                        float f23 = rectF.top;
                        c10235r2 = new C10235r(f22, f23, rectF.right - f22, rectF.bottom - f23);
                    } else {
                        z6 = true;
                        z10 = false;
                    }
                } else {
                    z6 = true;
                    z10 = false;
                }
                float fFloor = (((float) Math.floor((c10235r2.f30390b - fM10768d) / fM10768d2)) * fM10768d2) + fM10768d;
                float fFloor2 = (((float) Math.floor((c10235r2.f30391c - fM10769e2) / fM10769e)) * fM10769e) + fM10769e2;
                float fM10796c3 = c10235r2.m10796c();
                float fM10797d2 = c10235r2.m10797d();
                C10235r c10235r6 = new C10235r(0.0f, 0.0f, fM10768d2, fM10769e);
                boolean zM10826M = m10826M();
                while (fFloor2 < fM10797d2) {
                    float f24 = fFloor;
                    while (f24 < fM10796c3) {
                        c10235r6.f30390b = f24;
                        c10235r6.f30391c = fFloor2;
                        m10837Y();
                        if (!((C10248x0) this.f30456o0).f30432a.f30256A0.booleanValue()) {
                            m10833T(c10235r6.f30390b, c10235r6.f30391c, c10235r6.f30392d, c10235r6.f30393e);
                        }
                        C10235r c10235r7 = c10187l.f30328o;
                        if (c10235r7 != null) {
                            c10233q = c10233q2;
                            canvas = canvas2;
                            canvas.concat(m10809j(c10235r6, c10235r7, c10233q));
                        } else {
                            canvas = canvas2;
                            c10233q = c10233q2;
                            Boolean bool2 = c10187l.f30241q;
                            boolean z13 = (bool2 == null || bool2.booleanValue()) ? z6 : z10;
                            canvas.translate(f24, fFloor2);
                            if (!z13) {
                                C10235r c10235r8 = abstractC10198X.f30304h;
                                canvas.scale(c10235r8.f30392d, c10235r8.f30393e);
                            }
                            it = c10187l.f30299i.iterator();
                            while (it.hasNext()) {
                                m10828O((AbstractC10202a0) it.next());
                            }
                            m10836X();
                            f24 += fM10768d2;
                            c10233q2 = c10233q;
                            canvas2 = canvas;
                            z6 = true;
                        }
                        it = c10187l.f30299i.iterator();
                        while (it.hasNext()) {
                            m10828O((AbstractC10202a0) it.next());
                        }
                        m10836X();
                        f24 += fM10768d2;
                        c10233q2 = c10233q;
                        canvas2 = canvas;
                        z6 = true;
                    }
                    fFloor2 += fM10769e;
                    z6 = true;
                }
                if (zM10826M) {
                    m10825L(c10187l.f30304h);
                }
                m10836X();
                return;
            }
        }
        canvas2.drawPath(path, ((C10248x0) this.f30456o0).f30435d);
    }

    /* JADX INFO: renamed from: r */
    public void m10854r(Path path) {
        C10248x0 c10248x0 = (C10248x0) this.f30456o0;
        int i10 = c10248x0.f30432a.f30279X0;
        Canvas canvas = (Canvas) this.f30454Y;
        if (i10 != 2) {
            canvas.drawPath(path, c10248x0.f30436e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((C10248x0) this.f30456o0).f30436e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((C10248x0) this.f30456o0).f30436e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m10855s(AbstractC10224l0 abstractC10224l0, AbstractC18290d abstractC18290d) {
        float f10;
        float fM10769e;
        float fM10768d;
        int iM10818C;
        if (m10852p()) {
            Iterator it = abstractC10224l0.f30299i.iterator();
            boolean z6 = true;
            while (it.hasNext()) {
                AbstractC10202a0 abstractC10202a0 = (AbstractC10202a0) it.next();
                if (abstractC10202a0 instanceof C10230o0) {
                    abstractC18290d.mo10800e(m10838Z(((C10230o0) abstractC10202a0).f30368c, z6, !it.hasNext()));
                } else if (abstractC18290d.mo10801b((AbstractC10224l0) abstractC10202a0)) {
                    float fM10769e2 = 0.0f;
                    if (abstractC10202a0 instanceof C10226m0) {
                        m10837Y();
                        C10226m0 c10226m0 = (C10226m0) abstractC10202a0;
                        m10842c0(c10226m0, (C10248x0) this.f30456o0);
                        if (m10852p() && m10845e0()) {
                            AbstractC10199Y abstractC10199YM15182C = c10226m0.f30314a.m15182C(c10226m0.f30354n);
                            if (abstractC10199YM15182C == null) {
                                m10812t("TextPath reference '%s' not found", c10226m0.f30354n);
                            } else {
                                C10185J c10185j = (C10185J) abstractC10199YM15182C;
                                Path path = new C10240t0(c10185j.f30239o).f30411a;
                                Matrix matrix = c10185j.f30452n;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                C10173D c10173d = c10226m0.f30355o;
                                fM10769e2 = c10173d != null ? c10173d.m10766b(this, pathMeasure.getLength()) : 0.0f;
                                int iM10818C2 = m10818C();
                                if (iM10818C2 != 1) {
                                    float fM10848i = m10848i(c10226m0);
                                    if (iM10818C2 == 2) {
                                        fM10848i /= 2.0f;
                                    }
                                    fM10769e2 -= fM10848i;
                                }
                                m10850l(c10226m0.f30356p);
                                boolean zM10826M = m10826M();
                                m10855s(c10226m0, new C10242u0(this, path, fM10769e2));
                                if (zM10826M) {
                                    m10825L(c10226m0.f30304h);
                                }
                            }
                        }
                        m10836X();
                    } else if (abstractC10202a0 instanceof C10218i0) {
                        m10837Y();
                        C10218i0 c10218i0 = (C10218i0) abstractC10202a0;
                        m10842c0(c10218i0, (C10248x0) this.f30456o0);
                        if (m10852p()) {
                            ArrayList arrayList = c10218i0.f30361n;
                            boolean z10 = arrayList != null && arrayList.size() > 0;
                            boolean z11 = abstractC18290d instanceof C10244v0;
                            if (z11) {
                                float fM10768d2 = !z10 ? ((C10244v0) abstractC18290d).f30420c : ((C10173D) c10218i0.f30361n.get(0)).m10768d(this);
                                ArrayList arrayList2 = c10218i0.f30362o;
                                fM10769e = (arrayList2 == null || arrayList2.size() == 0) ? ((C10244v0) abstractC18290d).f30421d : ((C10173D) c10218i0.f30362o.get(0)).m10769e(this);
                                ArrayList arrayList3 = c10218i0.f30363p;
                                fM10768d = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C10173D) c10218i0.f30363p.get(0)).m10768d(this);
                                ArrayList arrayList4 = c10218i0.f30364q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fM10769e2 = ((C10173D) c10218i0.f30364q.get(0)).m10769e(this);
                                }
                                float f11 = fM10768d2;
                                f10 = fM10769e2;
                                fM10769e2 = f11;
                            } else {
                                f10 = 0.0f;
                                fM10769e = 0.0f;
                                fM10768d = 0.0f;
                            }
                            if (z10 && (iM10818C = m10818C()) != 1) {
                                float fM10848i2 = m10848i(c10218i0);
                                if (iM10818C == 2) {
                                    fM10848i2 /= 2.0f;
                                }
                                fM10769e2 -= fM10848i2;
                            }
                            m10850l(c10218i0.f30344r);
                            if (z11) {
                                C10244v0 c10244v0 = (C10244v0) abstractC18290d;
                                c10244v0.f30420c = fM10769e2 + fM10768d;
                                c10244v0.f30421d = fM10769e + f10;
                            }
                            boolean zM10826M2 = m10826M();
                            m10855s(c10218i0, abstractC18290d);
                            if (zM10826M2) {
                                m10825L(c10218i0.f30304h);
                            }
                        }
                        m10836X();
                    } else if (abstractC10202a0 instanceof C10216h0) {
                        m10837Y();
                        C10216h0 c10216h0 = (C10216h0) abstractC10202a0;
                        m10842c0(c10216h0, (C10248x0) this.f30456o0);
                        if (m10852p()) {
                            m10850l(c10216h0.f30342o);
                            AbstractC10199Y abstractC10199YM15182C2 = abstractC10202a0.f30314a.m15182C(c10216h0.f30341n);
                            if (abstractC10199YM15182C2 == null || !(abstractC10199YM15182C2 instanceof AbstractC10224l0)) {
                                m10812t("Tref reference '%s' not found", c10216h0.f30341n);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                m10857v((AbstractC10224l0) abstractC10199YM15182C2, sb2);
                                if (sb2.length() > 0) {
                                    abstractC18290d.mo10800e(sb2.toString());
                                }
                            }
                        }
                        m10836X();
                    }
                }
                z6 = false;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: u */
    public AbstractC11330w m10856u(C13289a c13289a) {
        Object next;
        EnumC11255b enumC11255b;
        int i10 = 2;
        ?? r6 = c13289a.f42005d;
        Iterator it = r6.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC21329w.m21726m((String) ((Map.Entry) next).getKey(), "DD-API-KEY"));
        Map.Entry entry = (Map.Entry) next;
        String str = entry != null ? (String) entry.getValue() : null;
        if (str != null) {
            if (str.length() != 0) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt == '\t' || (' ' <= cCharAt && cCharAt < 127)) {
                    }
                }
            }
            return new C17188n(0);
        }
        String str2 = c13289a.f42007f;
        Pattern pattern = C17352s.f55296e;
        C17352s c17352sM9858d = AbstractC9282f0.m9858d(str2);
        C14522e c14522e = new C14522e(3);
        c14522e.m16010B(c13289a.f42004c);
        byte[] bArr = c13289a.f42006e;
        int length = bArr.length;
        AbstractC17708b.m19411c(bArr.length, 0, length);
        c14522e.m16028v("POST", new C17324A(c17352sM9858d, length, bArr, 0));
        Iterator it2 = r6.entrySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            enumC11255b = EnumC11255b.f34099Z;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str3 = (String) entry2.getKey();
            String str4 = (String) entry2.getValue();
            Locale locale = Locale.US;
            if (AbstractC0168G.m534w(locale, "US", str3, locale, "toLowerCase(...)").equals("user-agent")) {
                AbstractC7889G0.m8184b((InterfaceC11256c) this.f30455Z, 4, enumC11255b, C17175a.f54859Z, null, false, 56);
            } else {
                c14522e.m16012b(str3, str4);
            }
        }
        c14522e.m16012b(SIPHeaderNames.USER_AGENT, (String) ((C17314q) this.f30459r0).getValue());
        C17358y c17358yM16017i = c14522e.m16017i();
        TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        C17327D c17327dM20063e = ((C17356w) ((InterfaceC17337d) this.f30456o0)).m19035b(c17358yM16017i).m20063e();
        c17327dM20063e.close();
        int i12 = c17327dM20063e.f55176p0;
        if (i12 == 202) {
            return new C17191q(false, i12, null, 4);
        }
        if (i12 != 403) {
            if (i12 != 408) {
                if (i12 != 413) {
                    if (i12 != 429) {
                        if (i12 != 500 && i12 != 507) {
                            if (i12 != 400) {
                                if (i12 != 401) {
                                    switch (i12) {
                                        case HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            AbstractC7889G0.m8185c((InterfaceC11256c) this.f30455Z, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C1832u(i12, c13289a, i10), null, 56);
                                            return new C17193s(false, i12, null, 4);
                                    }
                                }
                            }
                        }
                        return new C17187m(true, i12, null, 4);
                    }
                }
                return new C17185k(false, i12, null, 4);
            }
            return new C17186l(true, i12, null, 4);
        }
        return new C17188n(i12);
    }

    /* JADX INFO: renamed from: v */
    public void m10857v(AbstractC10224l0 abstractC10224l0, StringBuilder sb2) {
        Iterator it = abstractC10224l0.f30299i.iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            AbstractC10202a0 abstractC10202a0 = (AbstractC10202a0) it.next();
            if (abstractC10202a0 instanceof AbstractC10224l0) {
                m10857v((AbstractC10224l0) abstractC10202a0, sb2);
            } else if (abstractC10202a0 instanceof C10230o0) {
                sb2.append(m10838Z(((C10230o0) abstractC10202a0).f30368c, z6, !it.hasNext()));
            }
            z6 = false;
        }
    }

    /* JADX INFO: renamed from: w */
    public C13606o m10858w(C13606o c13606o) {
        return c13606o.m15127f(new ExecutorC2575a(1), new C0072l(this, 21));
    }

    /* JADX INFO: renamed from: U */
    public void m10834U(String str, String str2, Bundle bundle) {
        int i10;
        String strEncodeToString;
        int iM21164a;
        PackageInfo packageInfoM3496e;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C16187g c16187g = (C16187g) this.f30454Y;
        c16187g.m17794a();
        bundle.putString("gmp_app_id", c16187g.f50237c.f50250b);
        C2388r c2388r = (C2388r) this.f30455Z;
        synchronized (c2388r) {
            try {
                if (c2388r.f7419a == 0 && (packageInfoM3496e = c2388r.m3496e("com.google.android.gms")) != null) {
                    c2388r.f7419a = packageInfoM3496e.versionCode;
                }
                i10 = c2388r.f7419a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C2388r) this.f30455Z).m3494b());
        bundle.putString("app_ver_name", ((C2388r) this.f30455Z).m3495c());
        C16187g c16187g2 = (C16187g) this.f30454Y;
        c16187g2.m17794a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(c16187g2.f50236b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = MMVKXkcLpuHFDi.VAInos;
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((C21395a) AbstractC7854B5.m8113a(((C21397c) ((InterfaceC21398d) this.f30459r0)).m21781e())).f67922a;
            if (TextUtils.isEmpty(str3)) {
                AbstractC15256t.m16482t("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException e10) {
            e = e10;
            AbstractC15256t.m16466d("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e11) {
            e = e11;
            AbstractC15256t.m16466d("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) AbstractC7854B5.m8113a(((C21397c) ((InterfaceC21398d) this.f30459r0)).m21780d()));
        bundle.putString("cliv", "fcm-24.1.0");
        InterfaceC20515f interfaceC20515f = (InterfaceC20515f) ((InterfaceC21170a) this.f30458q0).get();
        C3031b c3031b = (C3031b) ((InterfaceC21170a) this.f30457p0).get();
        if (interfaceC20515f == null || c3031b == null || (iM21164a = ((C20512c) interfaceC20515f).m21164a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC0010F.m24h(iM21164a)));
        bundle.putString("Firebase-Client", c3031b.m3908a());
    }
}
