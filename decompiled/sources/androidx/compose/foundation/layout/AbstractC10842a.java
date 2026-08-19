package androidx.compose.foundation.layout;

import ge.C14089m0;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21076c;
import p229J0.AbstractC3996V3;
import p492U1.C7540e;
import p492U1.EnumC7546k;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.C17767k0;
import p911o0.C17776p;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10842a {
    /* JADX INFO: renamed from: a */
    public static C17767k0 m11223a(float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return new C17767k0(f10, f11, f10, f11);
    }

    /* JADX INFO: renamed from: b */
    public static final C17767k0 m11224b(float f10, float f11, float f12, float f13) {
        return new C17767k0(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: c */
    public static C17767k0 m11225c(float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return new C17767k0(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC10459q m11226d(InterfaceC10459q interfaceC10459q, float f10) {
        return interfaceC10459q.mo428M(new AspectRatioElement(f10, false));
    }

    /* JADX INFO: renamed from: e */
    public static final float m11227e(InterfaceC17763i0 interfaceC17763i0, EnumC7546k enumC7546k) {
        return enumC7546k == EnumC7546k.f23904Y ? interfaceC17763i0.mo19472a(enumC7546k) : interfaceC17763i0.mo19474c(enumC7546k);
    }

    /* JADX INFO: renamed from: f */
    public static final float m11228f(InterfaceC17763i0 interfaceC17763i0, EnumC7546k enumC7546k) {
        return enumC7546k == EnumC7546k.f23904Y ? interfaceC17763i0.mo19474c(enumC7546k) : interfaceC17763i0.mo19472a(enumC7546k);
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC10459q m11229g(InterfaceC10459q interfaceC10459q, int i10) {
        return interfaceC10459q.mo428M(new IntrinsicHeightElement(i10));
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC10459q m11230h(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k) {
        return interfaceC10459q.mo428M(new OffsetPxElement(interfaceC1436k, new C14089m0(9, interfaceC1436k)));
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC10459q m11231i(InterfaceC10459q interfaceC10459q, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return interfaceC10459q.mo428M(new OffsetElement(f10, f11, new C17776p(1, 5)));
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC10459q m11232j(InterfaceC10459q interfaceC10459q, InterfaceC17763i0 interfaceC17763i0) {
        return interfaceC10459q.mo428M(new PaddingValuesElement(interfaceC17763i0, new C17776p(1, 9)));
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC10459q m11233k(InterfaceC10459q interfaceC10459q, float f10) {
        return interfaceC10459q.mo428M(new PaddingElement(f10, f10, f10, f10, new C17776p(1, 8)));
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC10459q m11234l(InterfaceC10459q interfaceC10459q, float f10, float f11) {
        return interfaceC10459q.mo428M(new PaddingElement(f10, f11, f10, f11, new C17776p(1, 7)));
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC10459q m11235m(InterfaceC10459q interfaceC10459q, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return m11234l(interfaceC10459q, f10, f11);
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC10459q m11236n(InterfaceC10459q interfaceC10459q, float f10, float f11, float f12, float f13) {
        return interfaceC10459q.mo428M(new PaddingElement(f10, f11, f12, f13, new C17776p(1, 6)));
    }

    /* JADX INFO: renamed from: o */
    public static InterfaceC10459q m11237o(InterfaceC10459q interfaceC10459q, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return m11236n(interfaceC10459q, f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC10459q m11238p() {
        float f10 = AbstractC3996V3.f12538b;
        float f11 = AbstractC3996V3.f12544h;
        boolean zM7873a = C7540e.m7873a(f10, Float.NaN);
        InterfaceC10459q alignmentLineOffsetDpElement = C10456n.f30959Y;
        InterfaceC10459q alignmentLineOffsetDpElement2 = !zM7873a ? new AlignmentLineOffsetDpElement(AbstractC21076c.f66994a, f10, Float.NaN) : alignmentLineOffsetDpElement;
        if (!C7540e.m7873a(f11, Float.NaN)) {
            alignmentLineOffsetDpElement = new AlignmentLineOffsetDpElement(AbstractC21076c.f66995b, Float.NaN, f11);
        }
        return alignmentLineOffsetDpElement2.mo428M(alignmentLineOffsetDpElement);
    }

    /* JADX INFO: renamed from: q */
    public static final InterfaceC10459q m11239q(InterfaceC10459q interfaceC10459q, int i10) {
        return interfaceC10459q.mo428M(new IntrinsicWidthElement(i10));
    }
}
