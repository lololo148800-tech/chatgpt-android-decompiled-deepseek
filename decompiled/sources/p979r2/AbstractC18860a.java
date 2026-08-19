package p979r2;

import android.graphics.BlendMode;
import android.graphics.Insets;
import p001A.AbstractC0010F;
import p540W5.C8430a;

/* JADX INFO: renamed from: r2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18860a {
    /* JADX INFO: renamed from: a */
    public static Object m20160a(int i10) {
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case 18:
                return BlendMode.COLOR_DODGE;
            case 19:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Insets m20161b(int i10, int i11, int i12, int i13) {
        return Insets.of(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: c */
    public static void m20162c(C8430a c8430a, Object obj) {
        c8430a.setBlendMode((BlendMode) obj);
    }
}
