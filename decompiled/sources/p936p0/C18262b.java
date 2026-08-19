package p936p0;

import mm.C17296C;
import p1000s0.AbstractC19397F;
import p1000s0.AbstractC19402K;
import p1000s0.C19408d;
import p102Dm.AbstractC2119a;
import p1095x1.InterfaceC21058L;
import p156G1.C2955b;
import p349O0.C5994b0;
import p349O0.C5996c0;
import p571X9.AbstractC9113C4;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16736e1;
import p953q0.C18575d0;
import p953q0.InterfaceC18569a0;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: p0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18262b implements InterfaceC18569a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58221a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f58222b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC16736e1 f58223c;

    public /* synthetic */ C18262b(InterfaceC16736e1 interfaceC16736e1, boolean z6, int i10) {
        this.f58221a = i10;
        this.f58223c = interfaceC16736e1;
        this.f58222b = z6;
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: a */
    public final int mo19790a() {
        long jM9643a;
        switch (this.f58221a) {
            case 0:
                C18280t c18280t = (C18280t) this.f58223c;
                if (c18280t.m19824g().f58300n == EnumC16673F0.f53401Y) {
                    InterfaceC21058L interfaceC21058L = c18280t.m19824g().f58303q;
                    jM9643a = AbstractC9113C4.m9643a(interfaceC21058L.getWidth(), interfaceC21058L.getHeight()) & 4294967295L;
                } else {
                    InterfaceC21058L interfaceC21058L2 = c18280t.m19824g().f58303q;
                    jM9643a = AbstractC9113C4.m9643a(interfaceC21058L2.getWidth(), interfaceC21058L2.getHeight()) >> 32;
                }
                return (int) jM9643a;
            default:
                C19408d c19408d = (C19408d) this.f58223c;
                return (int) (c19408d.m20499k().f61601e == EnumC16673F0.f53401Y ? c19408d.m20499k().m20511d() & 4294967295L : c19408d.m20499k().m20511d() >> 32);
        }
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: b */
    public final float mo19791b() {
        switch (this.f58221a) {
            case 0:
                C18280t c18280t = (C18280t) this.f58223c;
                return (((C5996c0) c18280t.f58348d.f1140b).m6412g() * 500) + ((C5996c0) c18280t.f58348d.f1141c).m6412g();
            default:
                C19408d c19408d = (C19408d) this.f58223c;
                return AbstractC2119a.m3196j(((C5994b0) c19408d.f61440c.f207p0).m6409g() * c19408d.m20502n()) + (((long) c19408d.m20498j()) * ((long) c19408d.m20502n()));
        }
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: c */
    public final Object mo19792c(int i10, C18575d0 c18575d0) {
        switch (this.f58221a) {
            case 0:
                Object objM19822i = C18280t.m19822i((C18280t) this.f58223c, i10, c18575d0);
                return objM19822i == EnumC19250a.f61036Y ? objM19822i : C17296C.f55119a;
            default:
                Object objM20494s = AbstractC19397F.m20494s((C19408d) this.f58223c, i10, c18575d0);
                return objM20494s == EnumC19250a.f61036Y ? objM20494s : C17296C.f55119a;
        }
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: d */
    public final int mo19793d() {
        switch (this.f58221a) {
            case 0:
                C18280t c18280t = (C18280t) this.f58223c;
                return (-c18280t.m19824g().f58297k) + c18280t.m19824g().f58301o;
            default:
                C19408d c19408d = (C19408d) this.f58223c;
                return (-c19408d.m20499k().f61602f) + c19408d.m20499k().f61600d;
        }
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: e */
    public final float mo19794e() {
        switch (this.f58221a) {
            case 0:
                C18280t c18280t = (C18280t) this.f58223c;
                int iM6412g = ((C5996c0) c18280t.f58348d.f1140b).m6412g();
                int iM6412g2 = ((C5996c0) c18280t.f58348d.f1141c).m6412g();
                return c18280t.mo5258d() ? (iM6412g * 500) + iM6412g2 + 100 : (iM6412g * 500) + iM6412g2;
            default:
                C19408d c19408d = (C19408d) this.f58223c;
                return AbstractC19402K.m20507a(c19408d.m20499k(), c19408d.mo20500l());
        }
    }

    @Override // p953q0.InterfaceC18569a0
    /* JADX INFO: renamed from: f */
    public final C2955b mo19795f() {
        switch (this.f58221a) {
            case 0:
                return this.f58222b ? new C2955b(-1, 1) : new C2955b(1, -1);
            default:
                boolean z6 = this.f58222b;
                C19408d c19408d = (C19408d) this.f58223c;
                return z6 ? new C2955b(c19408d.mo20500l(), 1) : new C2955b(1, c19408d.mo20500l());
        }
    }
}
