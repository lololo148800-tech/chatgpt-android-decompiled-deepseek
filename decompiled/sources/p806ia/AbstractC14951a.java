package p806ia;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.protobuf.AbstractC12107L1;
import p897n3.C17474a;

/* JADX INFO: renamed from: ia.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14951a {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f46571a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C17474a f46572b = new C17474a(1);

    /* JADX INFO: renamed from: c */
    public static final C17474a f46573c = new C17474a(0);

    /* JADX INFO: renamed from: d */
    public static final C17474a f46574d = new C17474a(C17474a.f55848e);

    static {
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: a */
    public static float m16113a(float f10, float f11, float f12) {
        return AbstractC12107L1.m13818i(f11, f10, f12, f10);
    }

    /* JADX INFO: renamed from: b */
    public static float m16114b(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        return f14 >= f13 ? f11 : m16113a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    /* JADX INFO: renamed from: c */
    public static int m16115c(float f10, int i10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
