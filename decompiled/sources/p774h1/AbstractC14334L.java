package p774h1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.hints.C15370i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p025An.C0644w;
import p492U1.C7544i;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p594Y9.AbstractC9930m3;
import p759g1.AbstractC13799a;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13802d;
import p797i1.AbstractC14900b;
import p797i1.AbstractC14901c;
import p797i1.C14902d;
import p797i1.C14910l;
import p797i1.C14911m;
import p797i1.C14915q;
import p821j1.C16042g;
import p821j1.InterfaceC16039d;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p985r9.C18903m;

/* JADX INFO: renamed from: h1.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14334L {

    /* JADX INFO: renamed from: a */
    public static final C15370i f44973a = new C15370i(26);

    /* JADX INFO: renamed from: b */
    public static Method f44974b;

    /* JADX INFO: renamed from: c */
    public static Method f44975c;

    /* JADX INFO: renamed from: d */
    public static boolean f44976d;

    /* JADX INFO: renamed from: A */
    public static final void m15612A(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    /* JADX INFO: renamed from: B */
    public static final BlendMode m15613B(int i10) {
        if (m15639q(i10, 0)) {
            return BlendMode.CLEAR;
        }
        if (m15639q(i10, 1)) {
            return BlendMode.SRC;
        }
        if (m15639q(i10, 2)) {
            return BlendMode.DST;
        }
        if (m15639q(i10, 3)) {
            return BlendMode.SRC_OVER;
        }
        if (m15639q(i10, 4)) {
            return BlendMode.DST_OVER;
        }
        if (m15639q(i10, 5)) {
            return BlendMode.SRC_IN;
        }
        if (m15639q(i10, 6)) {
            return BlendMode.DST_IN;
        }
        if (m15639q(i10, 7)) {
            return BlendMode.SRC_OUT;
        }
        if (m15639q(i10, 8)) {
            return BlendMode.DST_OUT;
        }
        if (m15639q(i10, 9)) {
            return BlendMode.SRC_ATOP;
        }
        if (m15639q(i10, 10)) {
            return BlendMode.DST_ATOP;
        }
        if (m15639q(i10, 11)) {
            return BlendMode.XOR;
        }
        if (m15639q(i10, 12)) {
            return BlendMode.PLUS;
        }
        if (m15639q(i10, 13)) {
            return BlendMode.MODULATE;
        }
        if (m15639q(i10, 14)) {
            return BlendMode.SCREEN;
        }
        if (m15639q(i10, 15)) {
            return BlendMode.OVERLAY;
        }
        if (m15639q(i10, 16)) {
            return BlendMode.DARKEN;
        }
        if (m15639q(i10, 17)) {
            return BlendMode.LIGHTEN;
        }
        if (m15639q(i10, 18)) {
            return BlendMode.COLOR_DODGE;
        }
        if (m15639q(i10, 19)) {
            return BlendMode.COLOR_BURN;
        }
        if (m15639q(i10, 20)) {
            return BlendMode.HARD_LIGHT;
        }
        if (m15639q(i10, 21)) {
            return BlendMode.SOFT_LIGHT;
        }
        if (m15639q(i10, 22)) {
            return BlendMode.DIFFERENCE;
        }
        if (m15639q(i10, 23)) {
            return BlendMode.EXCLUSION;
        }
        if (m15639q(i10, 24)) {
            return BlendMode.MULTIPLY;
        }
        if (m15639q(i10, 25)) {
            return BlendMode.HUE;
        }
        if (m15639q(i10, 26)) {
            return BlendMode.SATURATION;
        }
        if (m15639q(i10, 27)) {
            return BlendMode.COLOR;
        }
        return m15639q(i10, 28) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: C */
    public static final Rect m15614C(C7544i c7544i) {
        return new Rect(c7544i.f23899a, c7544i.f23900b, c7544i.f23901c, c7544i.f23902d);
    }

    /* JADX INFO: renamed from: D */
    public static final Rect m15615D(C13801c c13801c) {
        return new Rect((int) c13801c.f43586a, (int) c13801c.f43587b, (int) c13801c.f43588c, (int) c13801c.f43589d);
    }

    /* JADX INFO: renamed from: E */
    public static final RectF m15616E(C13801c c13801c) {
        return new RectF(c13801c.f43586a, c13801c.f43587b, c13801c.f43588c, c13801c.f43589d);
    }

    /* JADX INFO: renamed from: F */
    public static final int m15617F(long j10) {
        float[] fArr = C14902d.f46405a;
        return (int) (C14365u.m15773a(j10, C14902d.f46407c) >>> 32);
    }

    /* JADX INFO: renamed from: G */
    public static final Bitmap.Config m15618G(int i10) {
        if (C14326D.m15601a(i10, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if (C14326D.m15601a(i10, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if (C14326D.m15601a(i10, 2)) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26 || !C14326D.m15601a(i10, 3)) {
            return (i11 < 26 || !C14326D.m15601a(i10, 4)) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    /* JADX INFO: renamed from: H */
    public static final C13801c m15619H(Rect rect) {
        return new C13801c(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: I */
    public static final C13801c m15620I(RectF rectF) {
        return new C13801c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: J */
    public static final PorterDuff.Mode m15621J(int i10) {
        if (m15639q(i10, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        if (m15639q(i10, 1)) {
            return PorterDuff.Mode.SRC;
        }
        if (m15639q(i10, 2)) {
            return PorterDuff.Mode.DST;
        }
        if (m15639q(i10, 3)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (m15639q(i10, 4)) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (m15639q(i10, 5)) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (m15639q(i10, 6)) {
            return PorterDuff.Mode.DST_IN;
        }
        if (m15639q(i10, 7)) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (m15639q(i10, 8)) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (m15639q(i10, 9)) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (m15639q(i10, 10)) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (m15639q(i10, 11)) {
            return PorterDuff.Mode.XOR;
        }
        if (m15639q(i10, 12)) {
            return PorterDuff.Mode.ADD;
        }
        if (m15639q(i10, 14)) {
            return PorterDuff.Mode.SCREEN;
        }
        if (m15639q(i10, 15)) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (m15639q(i10, 16)) {
            return PorterDuff.Mode.DARKEN;
        }
        if (m15639q(i10, 17)) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return m15639q(i10, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d A[PHI: r0
      0x000d: PHI (r0v2 float) = (r0v1 float), (r0v0 float) binds: [B:11:0x001c, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: K */
    public static final int m15622K(float f10, int i10, float[] fArr) {
        float f11 = 0.0f;
        if (f10 >= 0.0f) {
            f11 = 1.0f;
            if (f10 > 1.0f) {
                if (f10 <= 1.0000008f) {
                    f10 = f11;
                } else {
                    f10 = Float.NaN;
                }
            }
        } else if (f10 >= -8.34465E-7f) {
            f10 = f11;
        } else {
            f10 = Float.NaN;
        }
        fArr[i10] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static final C14347c m15623a(C14351g c14351g) {
        Canvas canvas = AbstractC14348d.f45031a;
        C14347c c14347c = new C14347c();
        c14347c.f45028a = new Canvas(m15635m(c14351g));
        return c14347c;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x014b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0161  */
    /* JADX WARN: Code duplicated, block: B:113:0x0164  */
    /* JADX WARN: Code duplicated, block: B:115:0x0168  */
    /* JADX WARN: Code duplicated, block: B:116:0x016a A[PHI: r2
      0x016a: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v0 int) binds: [B:123:0x017f, B:115:0x0168, B:111:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x0178  */
    /* JADX WARN: Code duplicated, block: B:123:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0181  */
    /* JADX WARN: Code duplicated, block: B:126:0x0187  */
    /* JADX WARN: Code duplicated, block: B:128:0x0190  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x0107  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134  */
    /* JADX INFO: renamed from: b */
    public static final long m15624b(float f10, float f11, float f12, float f13, AbstractC14901c abstractC14901c) {
        int i10;
        int i11;
        int i12;
        float fMo16070b;
        float fMo16069a;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float fMo16070b2;
        float fMo16069a2;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float f14;
        int i28 = 31;
        if (abstractC14901c.mo16071c()) {
            float f15 = f13 < 0.0f ? 0.0f : f13;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i29 = ((int) ((f15 * 255.0f) + 0.5f)) << 24;
            float f16 = f10 < 0.0f ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i30 = i29 | (((int) ((f16 * 255.0f) + 0.5f)) << 16);
            float f17 = f11 < 0.0f ? 0.0f : f11;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            int i31 = i30 | (((int) ((f17 * 255.0f) + 0.5f)) << 8);
            f14 = f12 >= 0.0f ? f12 : 0.0f;
            long j10 = ((long) (i31 | ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i32 = C14365u.f45061k;
            return j10;
        }
        int i33 = AbstractC14900b.f46401e;
        if (((int) (abstractC14901c.f46403b >> 32)) != 3) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int i34 = abstractC14901c.f46404c;
        if (i34 == -1) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float fMo16070b3 = abstractC14901c.mo16070b(0);
        float fMo16069a3 = abstractC14901c.mo16069a(0);
        if (f10 >= fMo16070b3) {
            fMo16070b3 = f10;
        }
        if (fMo16070b3 <= fMo16069a3) {
            fMo16069a3 = fMo16070b3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo16069a3);
        int i35 = iFloatToRawIntBits3 >>> 31;
        int i36 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i37 = iFloatToRawIntBits3 & 8388607;
        if (i36 == 255) {
            i11 = i37 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i36 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else {
                if (i10 > 0) {
                    int i38 = i37 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i38) + 1) | (i35 << 15);
                    } else {
                        i11 = i38;
                    }
                    short s10 = (short) i12;
                    fMo16070b = abstractC14901c.mo16070b(1);
                    fMo16069a = abstractC14901c.mo16069a(1);
                    if (f11 >= fMo16070b) {
                        fMo16070b = f11;
                    }
                    if (fMo16070b <= fMo16069a) {
                        fMo16069a = fMo16070b;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fMo16069a);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i16 = 49;
                            i18 = 0;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s11 = (short) i19;
                                fMo16070b2 = abstractC14901c.mo16070b(2);
                                fMo16069a2 = abstractC14901c.mo16069a(2);
                                if (f12 >= fMo16070b2) {
                                    fMo16070b2 = f12;
                                }
                                if (fMo16070b2 <= fMo16069a2) {
                                    fMo16069a2 = fMo16070b2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo16069a2);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    if (i23 != 0) {
                                        i25 = 512;
                                    } else {
                                        i25 = 0;
                                    }
                                    i26 = (i21 << 15) | (i28 << 10) | i25;
                                } else {
                                    i24 = i22 - 112;
                                    if (i24 >= 31) {
                                        i28 = 49;
                                    } else {
                                        if (i24 <= 0) {
                                            i25 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                            } else {
                                                i28 = i24;
                                            }
                                        } else if (i24 >= -10) {
                                            i27 = (i23 | 8388608) >> (1 - i24);
                                            if ((i27 & 4096) != 0) {
                                                i27 += 8192;
                                            }
                                            i25 = i27 >> 13;
                                            i28 = 0;
                                        } else {
                                            i28 = 0;
                                        }
                                        i26 = (i21 << 15) | (i28 << 10) | i25;
                                    }
                                    i25 = 0;
                                    i26 = (i21 << 15) | (i28 << 10) | i25;
                                }
                                short s12 = (short) i26;
                                f14 = f13 >= 0.0f ? f13 : 0.0f;
                                long j11 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) s12) & 65535) << 16) | (((long) i34) & 63);
                                int i39 = C14365u.f45061k;
                                return j11;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                            i16 = 0;
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s13 = (short) i19;
                    fMo16070b2 = abstractC14901c.mo16070b(2);
                    fMo16069a2 = abstractC14901c.mo16069a(2);
                    if (f12 >= fMo16070b2) {
                        fMo16070b2 = f12;
                    }
                    if (fMo16070b2 <= fMo16069a2) {
                        fMo16069a2 = fMo16070b2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo16069a2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        if (i23 != 0) {
                            i25 = 512;
                        } else {
                            i25 = 0;
                        }
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i28 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i28 = i24;
                                }
                            } else if (i24 >= -10) {
                                i27 = (i23 | 8388608) >> (1 - i24);
                                if ((i27 & 4096) != 0) {
                                    i27 += 8192;
                                }
                                i25 = i27 >> 13;
                                i28 = 0;
                            } else {
                                i28 = 0;
                            }
                            i26 = (i21 << 15) | (i28 << 10) | i25;
                        }
                        i25 = 0;
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    }
                    short s14 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j12 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s10) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((((long) s14) & 65535) << 16) | (((long) i34) & 63);
                    int i310 = C14365u.f45061k;
                    return j12;
                }
                if (i10 >= -10) {
                    int i40 = (i37 | 8388608) >> (1 - i10);
                    if ((i40 & 4096) != 0) {
                        i40 += 8192;
                    }
                    i11 = i40 >> 13;
                } else {
                    i11 = 0;
                }
                i10 = 0;
            }
        }
        i12 = i11 | (i35 << 15) | (i10 << 10);
        short s15 = (short) i12;
        fMo16070b = abstractC14901c.mo16070b(1);
        fMo16069a = abstractC14901c.mo16069a(1);
        if (f11 >= fMo16070b) {
            fMo16070b = f11;
        }
        if (fMo16070b <= fMo16069a) {
            fMo16069a = fMo16070b;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fMo16069a);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i16 = 49;
                i18 = 0;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s16 = (short) i19;
                    fMo16070b2 = abstractC14901c.mo16070b(2);
                    fMo16069a2 = abstractC14901c.mo16069a(2);
                    if (f12 >= fMo16070b2) {
                        fMo16070b2 = f12;
                    }
                    if (fMo16070b2 <= fMo16069a2) {
                        fMo16069a2 = fMo16070b2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo16069a2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        if (i23 != 0) {
                            i25 = 512;
                        } else {
                            i25 = 0;
                        }
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i28 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i28 = i24;
                                }
                            } else if (i24 >= -10) {
                                i27 = (i23 | 8388608) >> (1 - i24);
                                if ((i27 & 4096) != 0) {
                                    i27 += 8192;
                                }
                                i25 = i27 >> 13;
                                i28 = 0;
                            } else {
                                i28 = 0;
                            }
                            i26 = (i21 << 15) | (i28 << 10) | i25;
                        }
                        i25 = 0;
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    }
                    short s17 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j13 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s15) & 65535) << 48) | ((((long) s16) & 65535) << 32) | ((((long) s17) & 65535) << 16) | (((long) i34) & 63);
                    int i311 = C14365u.f45061k;
                    return j13;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
                i16 = 0;
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s18 = (short) i19;
        fMo16070b2 = abstractC14901c.mo16070b(2);
        fMo16069a2 = abstractC14901c.mo16069a(2);
        if (f12 >= fMo16070b2) {
            fMo16070b2 = f12;
        }
        if (fMo16070b2 <= fMo16069a2) {
            fMo16069a2 = fMo16070b2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo16069a2);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            if (i23 != 0) {
                i25 = 512;
            } else {
                i25 = 0;
            }
            i26 = (i21 << 15) | (i28 << 10) | i25;
        } else {
            i24 = i22 - 112;
            if (i24 >= 31) {
                i28 = 49;
            } else {
                if (i24 <= 0) {
                    i25 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                    } else {
                        i28 = i24;
                    }
                } else if (i24 >= -10) {
                    i27 = (i23 | 8388608) >> (1 - i24);
                    if ((i27 & 4096) != 0) {
                        i27 += 8192;
                    }
                    i25 = i27 >> 13;
                    i28 = 0;
                } else {
                    i28 = 0;
                }
                i26 = (i21 << 15) | (i28 << 10) | i25;
            }
            i25 = 0;
            i26 = (i21 << 15) | (i28 << 10) | i25;
        }
        short s19 = (short) i26;
        if (f13 >= 0.0f) {
        }
        long j14 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s15) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((((long) s19) & 65535) << 16) | (((long) i34) & 63);
        int i312 = C14365u.f45061k;
        return j14;
    }

    /* JADX INFO: renamed from: c */
    public static final long m15625c(int i10) {
        long j10 = ((long) i10) << 32;
        int i11 = C14365u.f45061k;
        return j10;
    }

    /* JADX INFO: renamed from: d */
    public static final long m15626d(long j10) {
        long j11 = j10 << 32;
        int i10 = C14365u.f45061k;
        return j11;
    }

    /* JADX INFO: renamed from: e */
    public static long m15627e(int i10, int i11, int i12) {
        return m15625c(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    /* JADX INFO: renamed from: f */
    public static C14351g m15628f(int i10, int i11, int i12) {
        Bitmap bitmapCreateBitmap;
        C14915q c14915q = C14902d.f46407c;
        Bitmap.Config configM15618G = m15618G(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = AbstractC14355k.m15738b(i10, i11, i12, true, c14915q);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configM15618G);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new C14351g(bitmapCreateBitmap);
    }

    /* JADX INFO: renamed from: g */
    public static final LinearGradient m15629g(long j10, long j11, List list, List list2, int i10) {
        int i11;
        int[] iArr;
        float[] fArrM19320A0;
        Shader.TileMode tileModeM15666b;
        List list3 = list;
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i11 = 0;
        } else {
            int iM19381j = AbstractC17681o.m19381j(list);
            i11 = 0;
            for (int i12 = 1; i12 < iM19381j; i12++) {
                if (C14365u.m15776d(((C14365u) list3.get(i12)).f45062a) == 0.0f) {
                    i11++;
                }
            }
        }
        float fM15306g = C13800b.m15306g(j10);
        float fM15307h = C13800b.m15307h(j10);
        float fM15306g2 = C13800b.m15306g(j11);
        float fM15307h2 = C13800b.m15307h(j11);
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            iArr = new int[size];
            int i13 = 0;
            while (i13 < size) {
                iArr[i13] = m15617F(((C14365u) list3.get(i13)).f45062a);
                i13++;
                size = size;
            }
        } else {
            int[] iArr2 = new int[list.size() + i11];
            int iM19381j2 = AbstractC17681o.m19381j(list);
            int size2 = list.size();
            int i14 = 0;
            int i15 = 0;
            while (i14 < size2) {
                int i16 = iM19381j2;
                long j12 = ((C14365u) list3.get(i14)).f45062a;
                int i17 = size2;
                if (C14365u.m15776d(j12) != 0.0f) {
                    iArr2[i15] = m15617F(j12);
                    i15++;
                } else if (i14 == 0) {
                    iArr2[i15] = m15617F(C14365u.m15774b(0.0f, ((C14365u) list3.get(1)).f45062a));
                    i15++;
                } else if (i14 == i16) {
                    iArr2[i15] = m15617F(C14365u.m15774b(0.0f, ((C14365u) list3.get(i14 - 1)).f45062a));
                    i15++;
                    i16 = i16;
                } else {
                    int i18 = i15 + 1;
                    i16 = i16;
                    iArr2[i15] = m15617F(C14365u.m15774b(0.0f, ((C14365u) list3.get(i14 - 1)).f45062a));
                    i15 += 2;
                    iArr2[i18] = m15617F(C14365u.m15774b(0.0f, ((C14365u) list3.get(i14 + 1)).f45062a));
                }
                i14++;
                iM19381j2 = i16;
                size2 = i17;
            }
            iArr = iArr2;
        }
        if (i11 == 0) {
            fArrM19320A0 = list2 != null ? AbstractC17680n.m19320A0(list2) : null;
        } else {
            float[] fArr = new float[list.size() + i11];
            fArr[0] = list2 != null ? ((Number) list2.get(0)).floatValue() : 0.0f;
            int iM19381j3 = AbstractC17681o.m19381j(list);
            int i19 = 1;
            int i20 = 1;
            while (i19 < iM19381j3) {
                long j13 = ((C14365u) list3.get(i19)).f45062a;
                float fFloatValue = list2 != null ? ((Number) list2.get(i19)).floatValue() : i19 / AbstractC17681o.m19381j(list);
                int i21 = i20 + 1;
                fArr[i20] = fFloatValue;
                if (C14365u.m15776d(j13) == 0.0f) {
                    i20 += 2;
                    fArr[i21] = fFloatValue;
                } else {
                    i20 = i21;
                }
                i19++;
                list3 = list;
            }
            fArr[i20] = list2 != null ? ((Number) list2.get(AbstractC17681o.m19381j(list))).floatValue() : 1.0f;
            fArrM19320A0 = fArr;
        }
        if (m15644v(i10, 0)) {
            tileModeM15666b = Shader.TileMode.CLAMP;
        } else if (m15644v(i10, 1)) {
            tileModeM15666b = Shader.TileMode.REPEAT;
        } else if (m15644v(i10, 2)) {
            tileModeM15666b = Shader.TileMode.MIRROR;
        } else {
            tileModeM15666b = (!m15644v(i10, 3) || Build.VERSION.SDK_INT < 31) ? Shader.TileMode.CLAMP : C14342U.f45022a.m15666b();
        }
        return new LinearGradient(fM15306g, fM15307h, fM15306g2, fM15307h2, iArr, fArrM19320A0, tileModeM15666b);
    }

    /* JADX INFO: renamed from: h */
    public static final C18903m m15630h() {
        return new C18903m(new Paint(7));
    }

    /* JADX INFO: renamed from: i */
    public static final C14353i m15631i() {
        return new C14353i(new Path());
    }

    /* JADX INFO: renamed from: j */
    public static final long m15632j(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = C14343V.f45024c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX INFO: renamed from: k */
    public static final long m15633k(float f10, float f11, float f12, float f13, AbstractC14901c abstractC14901c) {
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = 31;
        if (abstractC14901c.mo16071c()) {
            long j10 = ((long) ((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f)))) << 32;
            int i28 = C14365u.f45061k;
            return j10;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f10);
        int i29 = iFloatToRawIntBits3 >>> 31;
        int i30 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i31 = iFloatToRawIntBits3 & 8388607;
        int i32 = 0;
        if (i30 == 255) {
            i11 = i31 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i30 - 112;
            if (i10 >= 31) {
                i11 = 0;
                i10 = 49;
            } else {
                if (i10 > 0) {
                    int i33 = i31 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i33) + 1) | (i29 << 15);
                    } else {
                        i11 = i33;
                    }
                    short s10 = (short) i12;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f11);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i16 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s11 = (short) i19;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i32 = i23 == 0 ? 0 : 512;
                                } else {
                                    i24 = i22 - 112;
                                    if (i24 >= 31) {
                                        i27 = 49;
                                    } else {
                                        if (i24 <= 0) {
                                            i32 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                            } else {
                                                i27 = i24;
                                            }
                                            long jMax = ((((long) s11) & 65535) << 32) | ((((long) s10) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC14901c.f46404c) & 63);
                                            int i34 = C14365u.f45061k;
                                            return jMax;
                                        }
                                        if (i24 >= -10) {
                                            i26 = (i23 | 8388608) >> (1 - i24);
                                            if ((i26 & 4096) != 0) {
                                                i26 += 8192;
                                            }
                                            i32 = i26 >> 13;
                                            i27 = 0;
                                        } else {
                                            i27 = 0;
                                        }
                                    }
                                }
                                i25 = (i27 << 10) | (i21 << 15) | i32;
                                long jMax2 = ((((long) s11) & 65535) << 32) | ((((long) s10) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC14901c.f46404c) & 63);
                                int i35 = C14365u.f45061k;
                                return jMax2;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s12 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i32 = i23 == 0 ? 0 : 512;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i27 = 49;
                        } else {
                            if (i24 <= 0) {
                                i32 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                } else {
                                    i27 = i24;
                                }
                                long jMax3 = ((((long) s12) & 65535) << 32) | ((((long) s10) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC14901c.f46404c) & 63);
                                int i36 = C14365u.f45061k;
                                return jMax3;
                            }
                            if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i32 = i26 >> 13;
                                i27 = 0;
                            } else {
                                i27 = 0;
                            }
                        }
                    }
                    i25 = (i27 << 10) | (i21 << 15) | i32;
                    long jMax4 = ((((long) s12) & 65535) << 32) | ((((long) s10) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC14901c.f46404c) & 63);
                    int i37 = C14365u.f45061k;
                    return jMax4;
                }
                if (i10 >= -10) {
                    int i38 = (i31 | 8388608) >> (1 - i10);
                    if ((i38 & 4096) != 0) {
                        i38 += 8192;
                    }
                    i11 = i38 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i29 << 15) | (i10 << 10);
        short s13 = (short) i12;
        iFloatToRawIntBits = Float.floatToRawIntBits(f11);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i16 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s14 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i32 = i23 == 0 ? 0 : 512;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i27 = 49;
                        } else {
                            if (i24 <= 0) {
                                i32 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                } else {
                                    i27 = i24;
                                }
                                long jMax5 = ((((long) s14) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC14901c.f46404c) & 63);
                                int i39 = C14365u.f45061k;
                                return jMax5;
                            }
                            if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i32 = i26 >> 13;
                                i27 = 0;
                            } else {
                                i27 = 0;
                            }
                        }
                    }
                    i25 = (i27 << 10) | (i21 << 15) | i32;
                    long jMax6 = ((((long) s14) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC14901c.f46404c) & 63);
                    int i310 = C14365u.f45061k;
                    return jMax6;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s15 = (short) i19;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i32 = i23 == 0 ? 0 : 512;
        } else {
            i24 = i22 - 112;
            if (i24 >= 31) {
                i27 = 49;
            } else {
                if (i24 <= 0) {
                    i32 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                    } else {
                        i27 = i24;
                    }
                    long jMax7 = ((((long) s15) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC14901c.f46404c) & 63);
                    int i311 = C14365u.f45061k;
                    return jMax7;
                }
                if (i24 >= -10) {
                    i26 = (i23 | 8388608) >> (1 - i24);
                    if ((i26 & 4096) != 0) {
                        i26 += 8192;
                    }
                    i32 = i26 >> 13;
                    i27 = 0;
                } else {
                    i27 = 0;
                }
            }
        }
        i25 = (i27 << 10) | (i21 << 15) | i32;
        long jMax8 = ((((long) s15) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC14901c.f46404c) & 63);
        int i312 = C14365u.f45061k;
        return jMax8;
    }

    /* JADX INFO: renamed from: l */
    public static final float m15634l(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    /* JADX INFO: renamed from: m */
    public static final Bitmap m15635m(C14351g c14351g) {
        if (c14351g instanceof C14351g) {
            return c14351g.f45036a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: n */
    public static final long m15636n(long j10, long j11) {
        float f10;
        float f11;
        long jM15773a = C14365u.m15773a(j10, C14365u.m15778f(j11));
        float fM15776d = C14365u.m15776d(j11);
        float fM15776d2 = C14365u.m15776d(jM15773a);
        float f12 = 1.0f - fM15776d2;
        float f13 = (fM15776d * f12) + fM15776d2;
        float fM15780h = C14365u.m15780h(jM15773a);
        float fM15780h2 = C14365u.m15780h(j11);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fM15780h2 * fM15776d) * f12) + (fM15780h * fM15776d2)) / f13;
        }
        float fM15779g = C14365u.m15779g(jM15773a);
        float fM15779g2 = C14365u.m15779g(j11);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fM15779g2 * fM15776d) * f12) + (fM15779g * fM15776d2)) / f13;
        }
        float fM15777e = C14365u.m15777e(jM15773a);
        float fM15777e2 = C14365u.m15777e(j11);
        if (f13 != 0.0f) {
            f14 = (((fM15777e2 * fM15776d) * f12) + (fM15777e * fM15776d2)) / f13;
        }
        return m15633k(f10, f11, f14, f13, C14365u.m15778f(j11));
    }

    /* JADX INFO: renamed from: o */
    public static void m15637o(InterfaceC16039d interfaceC16039d, AbstractC14332J abstractC14332J, long j10) {
        C14353i c14353i;
        C16042g c16042g = C16042g.f49483a;
        if (abstractC14332J instanceof C14330H) {
            C13801c c13801c = ((C14330H) abstractC14332J).f44970a;
            interfaceC16039d.mo17597c0(j10, AbstractC8088f6.m8536b(c13801c.f43586a, c13801c.f43587b), AbstractC8112i6.m8603a(c13801c.m15321h(), c13801c.m15318e()), 1.0f, c16042g, null, 3);
            return;
        }
        if (abstractC14332J instanceof C14331I) {
            C14331I c14331i = (C14331I) abstractC14332J;
            c14353i = c14331i.f44972b;
            if (c14353i == null) {
                C13802d c13802d = c14331i.f44971a;
                float fM15297b = AbstractC13799a.m15297b(c13802d.f43597h);
                interfaceC16039d.mo17593Y(j10, AbstractC8088f6.m8536b(c13802d.f43590a, c13802d.f43591b), AbstractC8112i6.m8603a(c13802d.m15328b(), c13802d.m15327a()), AbstractC8072d6.m8484a(fM15297b, fM15297b), c16042g, 1.0f, null, 3);
                return;
            }
        } else {
            if (!(abstractC14332J instanceof C14329G)) {
                throw new C0644w();
            }
            c14353i = ((C14329G) abstractC14332J).f44969a;
        }
        interfaceC16039d.mo17605r(c14353i, j10, 1.0f, c16042g, null, 3);
    }

    /* JADX INFO: renamed from: p */
    public static void m15638p(Canvas canvas, boolean z6) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            C14364t.f45051a.m15772a(canvas, z6);
            return;
        }
        if (!f44976d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f44974b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f44975c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f44974b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f44975c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f44974b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f44975c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f44976d = true;
        }
        if (z6) {
            try {
                Method method4 = f44974b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z6 || (method = f44975c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m15639q(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m15640r(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m15641s(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m15642t(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m15643u(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m15644v(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: w */
    public static long m15645w() {
        return C14365u.f45052b;
    }

    /* JADX INFO: renamed from: x */
    public static final long m15646x(float f10, long j10, long j11) {
        C14910l c14910l = C14902d.f46424t;
        long jM15773a = C14365u.m15773a(j10, c14910l);
        long jM15773a2 = C14365u.m15773a(j11, c14910l);
        float fM15776d = C14365u.m15776d(jM15773a);
        float fM15780h = C14365u.m15780h(jM15773a);
        float fM15779g = C14365u.m15779g(jM15773a);
        float fM15777e = C14365u.m15777e(jM15773a);
        float fM15776d2 = C14365u.m15776d(jM15773a2);
        float fM15780h2 = C14365u.m15780h(jM15773a2);
        float fM15779g2 = C14365u.m15779g(jM15773a2);
        float fM15777e2 = C14365u.m15777e(jM15773a2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return C14365u.m15773a(m15633k(AbstractC9930m3.m10589c(fM15780h, fM15780h2, f10), AbstractC9930m3.m10589c(fM15779g, fM15779g2, f10), AbstractC9930m3.m10589c(fM15777e, fM15777e2, f10), AbstractC9930m3.m10589c(fM15776d, fM15776d2, f10), c14910l), C14365u.m15778f(j11));
    }

    /* JADX INFO: renamed from: y */
    public static final float m15647y(long j10) {
        AbstractC14901c abstractC14901cM15778f = C14365u.m15778f(j10);
        if (!AbstractC14900b.m16067a(abstractC14901cM15778f.f46403b, AbstractC14900b.f46397a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC14900b.m16068b(abstractC14901cM15778f.f46403b)));
        }
        double dM15780h = C14365u.m15780h(j10);
        C14911m c14911m = ((C14915q) abstractC14901cM15778f).f46465p;
        double dMo9580b = c14911m.mo9580b(dM15780h);
        float fMo9580b = (float) ((c14911m.mo9580b(C14365u.m15777e(j10)) * 0.0722d) + (c14911m.mo9580b(C14365u.m15779g(j10)) * 0.7152d) + (dMo9580b * 0.2126d));
        if (fMo9580b < 0.0f) {
            fMo9580b = 0.0f;
        }
        if (fMo9580b > 1.0f) {
            return 1.0f;
        }
        return fMo9580b;
    }

    /* JADX INFO: renamed from: z */
    public static final void m15648z(Matrix matrix, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }
}
