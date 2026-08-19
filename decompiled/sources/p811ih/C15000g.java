package p811ih;

import gd.AbstractC13881O1;
import gd.InterfaceC13849E;
import ni.C17627a;
import p025An.AbstractC0575H;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2133G0;
import p103Dn.C2146N;
import p103Dn.C2207t0;
import p1155zi.EnumC22026l;
import p708dh.C13166t;
import p948pi.C18418a;
import p972qm.C18777j;

/* JADX INFO: renamed from: ih.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C15000g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13849E f46690a;

    /* JADX INFO: renamed from: b */
    public final C2146N f46691b;

    public C15000g(C17627a c17627a, C18418a c18418a, C13166t c13166t, InterfaceC13849E interfaceC13849E) {
        this.f46690a = interfaceC13849E;
        this.f46691b = new C2146N(AbstractC2124C.m3198B(new C14999f(c13166t.f41802f, c18418a, 0), c17627a, C2133G0.f6536a, null), 2);
    }

    /* JADX INFO: renamed from: a */
    public final C2207t0 m16134a(EnumC22026l enumC22026l, AbstractC13881O1 abstractC13881O1) {
        return new C2207t0(new C1970n(this.f46691b, 22, enumC22026l), abstractC13881O1, this, 3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m16135b(EnumC22026l enumC22026l, AbstractC13881O1 abstractC13881O1) {
        return ((Boolean) AbstractC0575H.m1161I(C18777j.f59682Y, new C14996c(this, enumC22026l, abstractC13881O1, null))).booleanValue();
    }
}
