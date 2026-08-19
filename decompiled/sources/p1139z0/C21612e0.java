package p1139z0;

import mm.C17309l;
import p002A0.AbstractC0128e;
import p002A0.C0120T;
import p002A0.C0124a;
import p002A0.C0134k;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.EnumC0573G;
import p080D0.AbstractC1770D0;
import p080D0.C1768C0;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1116y0.C21353b;
import p1116y0.C21359h;
import p1140z1.AbstractC21668N;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21660F;
import p1140z1.InterfaceC21701k0;
import p1140z1.InterfaceC21702l;
import p1140z1.InterfaceC21708o;
import p1140z1.InterfaceC21710p;
import p1140z1.InterfaceC21718w;
import p156G1.C2963j;
import p200Hm.C3508g;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3581L;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8664l;
import p759g1.C13801c;
import p773h0.AbstractC14282f0;
import p773h0.C14322z0;
import p774h1.AbstractC14360p;
import p774h1.C14341T;
import p774h1.C14353i;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p821j1.C16037b;
import p860l0.EnumC16673F0;
import p909nm.C17690x;

/* JADX INFO: renamed from: z0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21612e0 extends AbstractC21706n implements InterfaceC21718w, InterfaceC21708o, InterfaceC21702l, InterfaceC21710p, InterfaceC21701k0 {

    /* JADX INFO: renamed from: B0 */
    public boolean f68456B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f68457C0;

    /* JADX INFO: renamed from: D0 */
    public C21574A0 f68458D0;

    /* JADX INFO: renamed from: E0 */
    public C21582E0 f68459E0;

    /* JADX INFO: renamed from: F0 */
    public C0120T f68460F0;

    /* JADX INFO: renamed from: G0 */
    public AbstractC14360p f68461G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f68462H0;

    /* JADX INFO: renamed from: I0 */
    public C14322z0 f68463I0;

    /* JADX INFO: renamed from: J0 */
    public EnumC16673F0 f68464J0;

    /* JADX INFO: renamed from: L0 */
    public C0564B0 f68466L0;

    /* JADX INFO: renamed from: M0 */
    public C3581L f68467M0;

    /* JADX INFO: renamed from: O0 */
    public int f68469O0;

    /* JADX INFO: renamed from: P0 */
    public final AbstractC0128e f68470P0;

    /* JADX INFO: renamed from: K0 */
    public final C21575B f68465K0 = new C21575B();

    /* JADX INFO: renamed from: N0 */
    public C13801c f68468N0 = new C13801c(-1.0f, -1.0f, -1.0f, -1.0f);

    public C21612e0(boolean z6, boolean z10, C21574A0 c21574a0, C21582E0 c21582e0, C0120T c0120t, AbstractC14360p abstractC14360p, boolean z11, C14322z0 c14322z0, EnumC16673F0 enumC16673F0) {
        this.f68456B0 = z6;
        this.f68457C0 = z10;
        this.f68458D0 = c21574a0;
        this.f68459E0 = c21582e0;
        this.f68460F0 = c0120t;
        this.f68461G0 = abstractC14360p;
        this.f68462H0 = z11;
        this.f68463I0 = c14322z0;
        this.f68464J0 = enumC16673F0;
        AbstractC0128e c0134k = AbstractC14282f0.m15571a() ? new C0134k(this.f68459E0, this.f68460F0, this.f68458D0, this.f68456B0 || this.f68457C0) : new C0124a();
        m22223K0(c0134k);
        this.f68470P0 = c0134k;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX INFO: renamed from: N0 */
    public static final void m21951N0(C21612e0 c21612e0, InterfaceC7537b interfaceC7537b, int i10, int i11, long j10, EnumC7546k enumC7546k) {
        int iIntValue;
        C3578I c3578iM21849b;
        c21612e0.f68463I0.m15600f(i11 - i10);
        C3581L c3581l = c21612e0.f68467M0;
        if (c3581l != null) {
            int i12 = C3581L.f10907c;
            int i13 = (int) (j10 & 4294967295L);
            long j11 = c3581l.f10908a;
            if (i13 == ((int) (j11 & 4294967295L))) {
                iIntValue = (int) (j10 >> 32);
                if (iIntValue == ((int) (j11 >> 32)) && i11 == c21612e0.f68469O0) {
                    iIntValue = -1;
                }
            } else {
                int i14 = C3581L.f10907c;
                iIntValue = (int) (j10 & 4294967295L);
            }
        } else {
            int i15 = C3581L.f10907c;
            iIntValue = (int) (j10 & 4294967295L);
        }
        if (iIntValue < 0 || !c21612e0.m21952O0() || (c3578iM21849b = c21612e0.f68458D0.m21849b()) == null) {
            return;
        }
        C3508g c3508g = new C3508g(0, c3578iM21849b.f10892a.f10882a.f10934Y.length(), 1);
        if (c3508g.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c3508g + '.');
        }
        Integer num = 0;
        if (iIntValue < num.intValue()) {
            Integer num2 = 0;
            iIntValue = num2.intValue();
        } else {
            int i16 = c3508g.f10592Z;
            if (iIntValue > Integer.valueOf(i16).intValue()) {
                iIntValue = Integer.valueOf(i16).intValue();
            }
        }
        C13801c c13801cM4253c = c3578iM21849b.m4253c(iIntValue);
        boolean z6 = enumC7546k == EnumC7546k.f23905Z;
        int iMo7866k0 = interfaceC7537b.mo7866k0(AbstractC21602Z.f68417a);
        float f10 = c13801cM4253c.f43586a;
        float f11 = c13801cM4253c.f43588c;
        float f12 = z6 ? i11 - f11 : f10;
        float f13 = z6 ? (i11 - f11) + iMo7866k0 : f10 + iMo7866k0;
        float f14 = 0.0f;
        C13801c c13801cM15314b = C13801c.m15314b(c13801cM4253c, f12, f13, 0.0f, 10);
        C13801c c13801c = c21612e0.f68468N0;
        float f15 = c13801c.f43586a;
        float f16 = c13801cM15314b.f43586a;
        float f17 = c13801cM15314b.f43587b;
        if (f16 == f15 && f17 == c13801c.f43587b && i11 == c21612e0.f68469O0) {
            return;
        }
        boolean z10 = c21612e0.f68464J0 == EnumC16673F0.f53401Y;
        if (z10) {
            f16 = f17;
        }
        float f18 = z10 ? c13801cM15314b.f43589d : c13801cM15314b.f43588c;
        int iM6412g = c21612e0.f68463I0.f44952a.m6412g();
        float f19 = iM6412g + i10;
        if (f18 > f19) {
            f14 = f18 - f19;
        } else {
            float f20 = iM6412g;
            if (f16 < f20 && f18 - f16 > i10) {
                f14 = f18 - f19;
            } else if (f16 < f20 && f18 - f16 <= i10) {
                f14 = f16 - f20;
            }
        }
        c21612e0.f68467M0 = new C3581L(j10);
        c21612e0.f68468N0 = c13801cM15314b;
        c21612e0.f68469O0 = i11;
        AbstractC0575H.m1156D(c21612e0.m10935y0(), null, EnumC0573G.f1793p0, new C21610d0(c21612e0, f14, c13801cM4253c, null), 1);
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        this.f68470P0.mo424B(c2963j);
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        if (this.f68456B0 && m21952O0()) {
            this.f68466L0 = AbstractC0575H.m1156D(m10935y0(), null, null, new C21608c0(this, null), 3);
        }
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean mo425E() {
        return false;
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m21952O0() {
        if (this.f68462H0 && (this.f68456B0 || this.f68457C0)) {
            AbstractC14360p abstractC14360p = this.f68461G0;
            float f10 = AbstractC21602Z.f68417a;
            if (!(abstractC14360p instanceof C14341T) || ((C14341T) abstractC14360p).f45021a != 16) {
                return true;
            }
        }
        return false;
    }

    @Override // p1140z1.InterfaceC21710p
    /* JADX INFO: renamed from: c */
    public final void mo2143c(AbstractC21678Y abstractC21678Y) {
        this.f68458D0.f68317e.setValue(abstractC21678Y);
        this.f68470P0.mo429c(abstractC21678Y);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21238i(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        int iM4270f;
        int iM4269e;
        c21660f.m22080a();
        C21353b c21353bM21881c = this.f68459E0.m21881c();
        C3578I c3578iM21849b = this.f68458D0.m21849b();
        if (c3578iM21849b == null) {
            return;
        }
        C17309l c17309l = c21353bM21881c.f67820p0;
        if (c17309l != null) {
            int i10 = ((C21359h) c17309l.f55136Y).f67832a;
            long j10 = ((C3581L) c17309l.f55137Z).f10908a;
            if (!C3581L.m4267c(j10)) {
                C14353i c14353iM4262l = c3578iM21849b.m4262l(C3581L.m4270f(j10), C3581L.m4269e(j10));
                if (i10 == 1) {
                    C3577H c3577h = c3578iM21849b.f10892a;
                    AbstractC14360p abstractC14360pMo7591e = c3577h.f10883b.f10910a.f10859a.mo7591e();
                    if (abstractC14360pMo7591e != null) {
                        AbstractC14376f.m15847m(c21660f, c14353iM4262l, abstractC14360pMo7591e, 0.2f, null, 56);
                    } else {
                        long jM4277d = c3577h.f10883b.m4277d();
                        if (jM4277d == 16) {
                            jM4277d = C14365u.f45052b;
                        }
                        AbstractC14376f.m15848n(c21660f, c14353iM4262l, C14365u.m15774b(C14365u.m15776d(jM4277d) * 0.2f, jM4277d), 0.0f, null, 60);
                    }
                } else {
                    AbstractC14376f.m15848n(c21660f, c14353iM4262l, ((C1768C0) AbstractC21690f.m22204i(this, AbstractC1770D0.f5051a)).f5046b, 0.0f, null, 60);
                }
            }
        }
        long j11 = c21353bM21881c.f67818Z;
        boolean zM4267c = C3581L.m4267c(j11);
        C16037b c16037b = c21660f.f68674Y;
        C17309l c17309l2 = c21353bM21881c.f67820p0;
        if (zM4267c) {
            AbstractC8664l.m9361b(c16037b.f49479Z.m15196m(), c3578iM21849b);
            if (c17309l2 == null) {
                float fM6409g = this.f68465K0.f68322b.m6409g();
                if (fM6409g != 0.0f && m21952O0()) {
                    C13801c c13801cM407l = this.f68460F0.m407l();
                    c21660f.mo17594a0(this.f68461G0, AbstractC8088f6.m8536b((c13801cM407l.m15321h() / 2.0f) + c13801cM407l.f43586a, c13801cM407l.f43587b), c13801cM407l.m15316c(), c13801cM407l.m15321h(), (432 & 16) != 0 ? 0 : 0, (432 & 64) != 0 ? 1.0f : fM6409g, null, 3);
                }
            }
        } else {
            if (c17309l2 == null && (iM4270f = C3581L.m4270f(j11)) != (iM4269e = C3581L.m4269e(j11))) {
                AbstractC14376f.m15848n(c21660f, c3578iM21849b.m4262l(iM4270f, iM4269e), ((C1768C0) AbstractC21690f.m22204i(this, AbstractC1770D0.f5051a)).f5046b, 0.0f, null, 60);
            }
            AbstractC8664l.m9361b(c16037b.f49479Z.m15196m(), c3578iM21849b);
        }
        this.f68470P0.mo430e(c21660f);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        EnumC16673F0 enumC16673F0 = this.f68464J0;
        EnumC16673F0 enumC16673F1 = EnumC16673F0.f53401Y;
        C17690x c17690x = C17690x.f56481Y;
        if (enumC16673F0 == enumC16673F1) {
            AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(C7536a.m7847b(j10, 0, 0, 0, Integer.MAX_VALUE, 7));
            int iMin = Math.min(abstractC21069XMo21533p.f66982Z, C7536a.m7853h(j10));
            return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, iMin, c17690x, new C21604a0(this, interfaceC21059M, iMin, abstractC21069XMo21533p, 1));
        }
        AbstractC21069X abstractC21069XMo21533p2 = interfaceC21056J.mo21533p(C7536a.m7847b(j10, 0, Integer.MAX_VALUE, 0, 0, 13));
        int iMin2 = Math.min(abstractC21069XMo21533p2.f66981Y, C7536a.m7854i(j10));
        return interfaceC21059M.mo19936R(iMin2, abstractC21069XMo21533p2.f66982Z, c17690x, new C21604a0(this, interfaceC21059M, iMin2, abstractC21069XMo21533p2, 0));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21234e(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21242m(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21246q(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean mo432u0() {
        return false;
    }
}
