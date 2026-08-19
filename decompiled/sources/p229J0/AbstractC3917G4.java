package p229J0;

import fo.C13711h;
import java.util.WeakHashMap;
import p117Eb.C2392v;
import p302M0.AbstractC5240G;
import p302M0.AbstractC5241H;
import p302M0.AbstractC5243J;
import p349O0.C6021p;
import p736f0.AbstractC13481T;
import p758g0.AbstractC13758e;
import p911o0.AbstractC17758g;
import p911o0.C17718B0;
import p911o0.C17755e0;
import p911o0.C17756f;

/* JADX INFO: renamed from: J0.G4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3917G4 {

    /* JADX INFO: renamed from: a */
    public static final float f12036a;

    /* JADX INFO: renamed from: b */
    public static final float f12037b;

    /* JADX INFO: renamed from: c */
    public static final float f12038c;

    static {
        float f10 = AbstractC5243J.f17027a;
        f12036a = f10;
        int i10 = AbstractC5241H.f17022a;
        f12037b = f10;
        f12038c = AbstractC5240G.f17017a;
    }

    /* JADX INFO: renamed from: a */
    public static C2392v m4615a(C6021p c6021p) {
        return new C2392v(AbstractC3918H.m4626h(c6021p), AbstractC13758e.m15254s(0.0f, 400.0f, null, 5), AbstractC13481T.m15000a(c6021p), C3954N0.f12271z0);
    }

    /* JADX INFO: renamed from: b */
    public static C3911F4 m4616b(C3949M0 c3949m0) {
        C3911F4 c3911f4 = c3949m0.f12206T;
        if (c3911f4 != null) {
            return c3911f4;
        }
        float f10 = AbstractC5243J.f17027a;
        C3911F4 c3911f5 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5243J.f17031e), AbstractC3959O0.m4661c(c3949m0, AbstractC5243J.f17030d), AbstractC3959O0.m4661c(c3949m0, AbstractC5243J.f17028b), AbstractC3959O0.m4661c(c3949m0, AbstractC5243J.f17032f));
        c3949m0.f12206T = c3911f5;
        return c3911f5;
    }

    /* JADX INFO: renamed from: c */
    public static C17755e0 m4617c(C6021p c6021p) {
        WeakHashMap weakHashMap = C17718B0.f56555v;
        C17718B0 c17718b0M19480f = C17756f.m19480f(c6021p);
        return new C17755e0(c17718b0M19480f.f56562g, AbstractC17758g.f56704g | 16);
    }

    /* JADX INFO: renamed from: d */
    public static C13711h m4618d(C6021p c6021p) {
        return new C13711h(AbstractC3918H.m4626h(c6021p), C3954N0.f12257A0);
    }
}
