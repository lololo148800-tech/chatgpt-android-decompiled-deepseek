package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC16544l;
import p482Tg.C7443a0;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10450h;
import p635a1.C10451i;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10844c {

    /* JADX INFO: renamed from: a */
    public static final FillElement f32510a = new FillElement(2, 1.0f);

    /* JADX INFO: renamed from: b */
    public static final FillElement f32511b = new FillElement(1, 1.0f);

    /* JADX INFO: renamed from: c */
    public static final FillElement f32512c = new FillElement(3, 1.0f);

    /* JADX INFO: renamed from: d */
    public static final WrapContentElement f32513d;

    /* JADX INFO: renamed from: e */
    public static final WrapContentElement f32514e;

    /* JADX INFO: renamed from: f */
    public static final WrapContentElement f32515f;

    /* JADX INFO: renamed from: g */
    public static final WrapContentElement f32516g;

    /* JADX INFO: renamed from: h */
    public static final WrapContentElement f32517h;

    /* JADX INFO: renamed from: i */
    public static final WrapContentElement f32518i;

    static {
        C10449g c10449g = C10444b.f30947z0;
        f32513d = new WrapContentElement(2, false, new C7443a0(c10449g, 22), c10449g);
        C10449g c10449g2 = C10444b.f30946y0;
        f32514e = new WrapContentElement(2, false, new C7443a0(c10449g2, 22), c10449g2);
        C10450h c10450h = C10444b.f30944w0;
        f32515f = new WrapContentElement(1, false, new C7443a0(c10450h, 20), c10450h);
        C10450h c10450h2 = C10444b.f30943v0;
        f32516g = new WrapContentElement(1, false, new C7443a0(c10450h2, 20), c10450h2);
        C10451i c10451i = C10444b.f30938q0;
        f32517h = new WrapContentElement(3, false, new C7443a0(c10451i, 21), c10451i);
        C10451i c10451i2 = C10444b.f30934Y;
        f32518i = new WrapContentElement(3, false, new C7443a0(c10451i2, 21), c10451i2);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m11241a(InterfaceC10459q interfaceC10459q, float f10, float f11) {
        return interfaceC10459q.mo428M(new UnspecifiedConstraintsElement(f10, f11));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC10459q m11242b(InterfaceC10459q interfaceC10459q, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return m11241a(interfaceC10459q, f10, f11);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10459q m11243c(InterfaceC10459q interfaceC10459q, float f10) {
        return interfaceC10459q.mo428M(f10 == 1.0f ? f32511b : new FillElement(1, f10));
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC10459q m11244d(InterfaceC10459q interfaceC10459q, float f10) {
        return interfaceC10459q.mo428M(f10 == 1.0f ? f32510a : new FillElement(2, f10));
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC10459q m11245e(InterfaceC10459q interfaceC10459q, float f10) {
        return interfaceC10459q.mo428M(new SizeElement(0.0f, f10, 0.0f, f10, true, 5));
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC10459q m11246f(InterfaceC10459q interfaceC10459q, float f10, float f11) {
        return interfaceC10459q.mo428M(new SizeElement(0.0f, f10, 0.0f, f11, true, 5));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC10459q m11247g(InterfaceC10459q interfaceC10459q, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return m11246f(interfaceC10459q, f10, f11);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC10459q m11248h(InterfaceC10459q interfaceC10459q, float f10) {
        return interfaceC10459q.mo428M(new SizeElement(0.0f, f10, 0.0f, Float.NaN, false, 5));
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC10459q m11249i(InterfaceC10459q interfaceC10459q, float f10) {
        return interfaceC10459q.mo428M(new SizeElement(f10, f10, f10, f10, false));
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC10459q m11250j(InterfaceC10459q interfaceC10459q, float f10, float f11) {
        return interfaceC10459q.mo428M(new SizeElement(f10, f11, f10, f11, false));
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC10459q m11251k(InterfaceC10459q interfaceC10459q, float f10, float f11, float f12, float f13, int i10) {
        return interfaceC10459q.mo428M(new SizeElement(f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, false));
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC10459q m11252l(InterfaceC10459q interfaceC10459q, float f10) {
        return interfaceC10459q.mo428M(new SizeElement(f10, f10, f10, f10, true));
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC10459q m11253m(InterfaceC10459q interfaceC10459q, float f10, float f11) {
        return interfaceC10459q.mo428M(new SizeElement(f10, f11, f10, f11, true));
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC10459q m11254n(InterfaceC10459q interfaceC10459q, float f10, float f11, float f12, float f13) {
        return interfaceC10459q.mo428M(new SizeElement(f10, f11, f12, f13, true));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ InterfaceC10459q m11255o(InterfaceC10459q interfaceC10459q, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            f12 = Float.NaN;
        }
        if ((i10 & 8) != 0) {
            f13 = Float.NaN;
        }
        return m11254n(interfaceC10459q, f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC10459q m11256p(InterfaceC10459q interfaceC10459q, float f10) {
        return interfaceC10459q.mo428M(new SizeElement(f10, 0.0f, f10, 0.0f, true, 10));
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC10459q m11257q(InterfaceC10459q interfaceC10459q, float f10, float f11, int i10) {
        return interfaceC10459q.mo428M(new SizeElement((i10 & 1) != 0 ? Float.NaN : f10, 0.0f, (i10 & 2) != 0 ? Float.NaN : f11, 0.0f, true, 10));
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC10459q m11258r(InterfaceC10459q interfaceC10459q, C10450h c10450h, int i10) {
        WrapContentElement wrapContentElement;
        int i11 = i10 & 1;
        C10450h c10450h2 = C10444b.f30944w0;
        if (i11 != 0) {
            c10450h = c10450h2;
        }
        if (AbstractC16544l.m18089b(c10450h, c10450h2)) {
            wrapContentElement = f32515f;
        } else {
            wrapContentElement = AbstractC16544l.m18089b(c10450h, C10444b.f30943v0) ? f32516g : new WrapContentElement(1, false, new C7443a0(c10450h, 20), c10450h);
        }
        return interfaceC10459q.mo428M(wrapContentElement);
    }

    /* JADX INFO: renamed from: s */
    public static InterfaceC10459q m11259s(InterfaceC10459q interfaceC10459q, C10451i c10451i) {
        WrapContentElement wrapContentElement;
        if (c10451i.equals(C10444b.f30938q0)) {
            wrapContentElement = f32517h;
        } else {
            wrapContentElement = c10451i.equals(C10444b.f30934Y) ? f32518i : new WrapContentElement(3, false, new C7443a0(c10451i, 21), c10451i);
        }
        return interfaceC10459q.mo428M(wrapContentElement);
    }

    /* JADX INFO: renamed from: t */
    public static InterfaceC10459q m11260t(InterfaceC10459q interfaceC10459q, C10449g c10449g, int i10) {
        WrapContentElement wrapContentElement;
        int i11 = i10 & 1;
        C10449g c10449g2 = C10444b.f30947z0;
        if (i11 != 0) {
            c10449g = c10449g2;
        }
        if (AbstractC16544l.m18089b(c10449g, c10449g2)) {
            wrapContentElement = f32513d;
        } else {
            wrapContentElement = AbstractC16544l.m18089b(c10449g, C10444b.f30946y0) ? f32514e : new WrapContentElement(2, false, new C7443a0(c10449g, 22), c10449g);
        }
        return interfaceC10459q.mo428M(wrapContentElement);
    }
}
