package p977r0;

import mm.C17296C;
import p1139z0.C21585H;
import p156G1.C2955b;
import p349O0.C5996c0;
import p773h0.EnumC14284g0;
import p860l0.EnumC16673F0;
import p953q0.C18575d0;
import p953q0.InterfaceC18569a0;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: r0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C18846r implements InterfaceC18569a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C18852x f60024a;

    public C18846r(C18852x c18852x) {
        this.f60024a = c18852x;
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: a */
    public final int mo19790a() {
        C18852x c18852x = this.f60024a;
        return (int) (c18852x.m20151g().f60004p == EnumC16673F0.f53401Y ? c18852x.m20151g().f59999k & 4294967295L : c18852x.m20151g().f59999k >> 32);
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: b */
    public final float mo19791b() {
        C18852x c18852x = this.f60024a;
        return (((C5996c0) c18852x.f60042a.f2238d).m6412g() * 500) + ((C5996c0) c18852x.f60042a.f2240f).m6412g();
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: c */
    public final Object mo19792c(int i10, C18575d0 c18575d0) {
        C21585H c21585h = C18852x.f60041u;
        C18852x c18852x = this.f60024a;
        c18852x.getClass();
        Object objMo5256b = c18852x.mo5256b(EnumC14284g0.f44821Y, new C18851w(c18852x, i10, 0, null), c18575d0);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        C17296C c17296c = C17296C.f55119a;
        if (objMo5256b != enumC19250a) {
            objMo5256b = c17296c;
        }
        return objMo5256b == enumC19250a ? objMo5256b : c17296c;
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: d */
    public final int mo19793d() {
        C18852x c18852x = this.f60024a;
        return c18852x.m20151g().f60002n + c18852x.m20151g().f60003o;
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: e */
    public final float mo19794e() {
        C18852x c18852x = this.f60024a;
        int iM6412g = ((C5996c0) c18852x.f60042a.f2238d).m6412g();
        int iM6412g2 = ((C5996c0) c18852x.f60042a.f2240f).m6412g();
        return c18852x.mo5258d() ? (iM6412g * 500) + iM6412g2 + 100 : (iM6412g * 500) + iM6412g2;
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: f */
    public final C2955b mo19795f() {
        return new C2955b(-1, -1);
    }
}
