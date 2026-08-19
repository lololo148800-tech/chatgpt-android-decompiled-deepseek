package p204I1;

import p1009s9.C19506i;
import p117Eb.C2392v;
import p303M1.C5276b;
import p328N1.InterfaceC5598n;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8682o;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9388w4;
import p909nm.C17689w;

/* JADX INFO: renamed from: I1.K */
/* JADX INFO: loaded from: classes.dex */
public final class C3580K {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5598n f10902a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7537b f10903b;

    /* JADX INFO: renamed from: c */
    public final EnumC7546k f10904c;

    /* JADX INFO: renamed from: d */
    public final C19506i f10905d;

    public C3580K(InterfaceC5598n interfaceC5598n, InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k, int i10) {
        this.f10902a = interfaceC5598n;
        this.f10903b = interfaceC7537b;
        this.f10904c = enumC7546k;
        this.f10905d = i10 > 0 ? new C19506i(i10) : null;
    }

    /* JADX INFO: renamed from: a */
    public static C3578I m4264a(C3580K c3580k, C3590f c3590f, C3582M c3582m, int i10, boolean z6, int i11, long j10, EnumC7546k enumC7546k, InterfaceC7537b interfaceC7537b, InterfaceC5598n interfaceC5598n, boolean z10, int i12) {
        int i13 = (i12 & 4) != 0 ? 1 : i10;
        C17689w c17689w = C17689w.f56480Y;
        InterfaceC5598n interfaceC5598n2 = (i12 & 512) != 0 ? c3580k.f10902a : interfaceC5598n;
        boolean z11 = (i12 & 1024) != 0 ? false : z10;
        c3580k.getClass();
        int i14 = i13;
        C3577H c3577h = new C3577H(c3590f, c3582m, c17689w, i11, z6, i13, interfaceC7537b, enumC7546k, interfaceC5598n2, j10);
        C3578I c3578i = null;
        C19506i c19506i = c3580k.f10905d;
        if (!z11 && c19506i != null) {
            C3578I c3578i2 = (C3578I) ((C5276b) c19506i.f61960Z).m5785b(new C3593i(c3577h));
            if (c3578i2 != null && !c3578i2.f10893b.f10958a.mo3544a()) {
                c3578i = c3578i2;
            }
        }
        if (c3578i != null) {
            C3599o c3599o = c3578i.f10893b;
            return new C3578I(c3577h, c3599o, AbstractC9388w4.m9962e(j10, AbstractC9113C4.m9643a((int) Math.ceil(c3599o.f10961d), (int) Math.ceil(c3599o.f10962e))));
        }
        C2392v c2392v = new C2392v(c3590f, AbstractC8682o.m9379b(c3582m, enumC7546k), c17689w, interfaceC7537b, interfaceC5598n2);
        int iM7856k = C7536a.m7856k(j10);
        int iM7854i = ((z6 || AbstractC9160K3.m9708a(i14, 2)) && C7536a.m7850e(j10)) ? C7536a.m7854i(j10) : Integer.MAX_VALUE;
        int i15 = (z6 || !AbstractC9160K3.m9708a(i14, 2)) ? i11 : 1;
        if (iM7856k != iM7854i) {
            iM7854i = AbstractC8301I.m8921l((int) Math.ceil(c2392v.mo3548e()), iM7856k, iM7854i);
        }
        int iM7853h = C7536a.m7853h(j10);
        int iMin = Math.min(0, 262142);
        int iMin2 = iM7854i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(iM7854i, 262142);
        int iM9960c = AbstractC9388w4.m9960c(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        C3599o c3599o2 = new C3599o(c2392v, AbstractC9388w4.m9958a(iMin, iMin2, Math.min(iM9960c, 0), iM7853h != Integer.MAX_VALUE ? Math.min(iM9960c, iM7853h) : Integer.MAX_VALUE), i15, AbstractC9160K3.m9708a(i14, 2));
        C3578I c3578i3 = new C3578I(c3577h, c3599o2, AbstractC9388w4.m9962e(j10, AbstractC9113C4.m9643a((int) Math.ceil(c3599o2.f10961d), (int) Math.ceil(c3599o2.f10962e))));
        if (c19506i == null) {
            return c3578i3;
        }
        return c3578i3;
    }
}
