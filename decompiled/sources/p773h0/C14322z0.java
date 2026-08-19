package p773h0;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1139z0.C21585H;
import p293Lh.C5077w;
import p349O0.C5944C;
import p349O0.C5996c0;
import p349O0.C5997d;
import p562X0.AbstractC9020o;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p749fd.C13628m;
import p860l0.C16696N;
import p860l0.InterfaceC16736e1;
import p894n0.C17407m;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: h0.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14322z0 implements InterfaceC16736e1 {

    /* JADX INFO: renamed from: i */
    public static final C21585H f44951i;

    /* JADX INFO: renamed from: a */
    public final C5996c0 f44952a;

    /* JADX INFO: renamed from: e */
    public float f44956e;

    /* JADX INFO: renamed from: b */
    public final C5996c0 f44953b = C5997d.m6429P(0);

    /* JADX INFO: renamed from: c */
    public final C17407m f44954c = new C17407m();

    /* JADX INFO: renamed from: d */
    public final C5996c0 f44955d = C5997d.m6429P(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f */
    public final C16696N f44957f = new C16696N(new C13628m(this, 12));

    /* JADX INFO: renamed from: g */
    public final C5944C f44958g = C5997d.m6421H(new C5077w(this, 2));

    /* JADX INFO: renamed from: h */
    public final C5944C f44959h = C5997d.m6421H(new C5077w(this, 1));

    static {
        C14320y0 c14320y0 = C14320y0.f44948Y;
        C14305r c14305r = C14305r.f44911r0;
        C21585H c21585h = AbstractC9020o.f27518a;
        f44951i = new C21585H(c14320y0, 10, c14305r);
    }

    public C14322z0(int i10) {
        this.f44952a = C5997d.m6429P(i10);
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: a */
    public final boolean mo5255a() {
        return this.f44957f.mo5255a();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: b */
    public final Object mo5256b(EnumC14284g0 enumC14284g0, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        Object objMo5256b = this.f44957f.mo5256b(enumC14284g0, interfaceC1439n, abstractC19687c);
        return objMo5256b == EnumC19250a.f61036Y ? objMo5256b : C17296C.f55119a;
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: c */
    public final boolean mo5257c() {
        return ((Boolean) this.f44959h.getValue()).booleanValue();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: d */
    public final boolean mo5258d() {
        return ((Boolean) this.f44958g.getValue()).booleanValue();
    }

    @Override // p860l0.InterfaceC16736e1
    /* JADX INFO: renamed from: e */
    public final float mo5259e(float f10) {
        return this.f44957f.mo5259e(f10);
    }

    /* JADX INFO: renamed from: f */
    public final void m15600f(int i10) {
        C5996c0 c5996c0 = this.f44952a;
        this.f44955d.m6413h(i10);
        AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
        InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
        AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
        try {
            if (c5996c0.m6412g() > i10) {
                c5996c0.m6413h(i10);
            }
        } finally {
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
        }
    }
}
