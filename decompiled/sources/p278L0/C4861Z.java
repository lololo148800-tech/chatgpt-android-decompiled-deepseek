package p278L0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p204I1.AbstractC3575F;
import p204I1.AbstractC3605u;
import p204I1.C3573D;
import p204I1.C3582M;
import p204I1.C3594j;
import p204I1.C3604t;
import p204I1.C3607w;
import p204I1.C3608x;
import p328N1.AbstractC5599o;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p349O0.C6021p;
import p371P1.C6306b;
import p467T1.C7191a;
import p467T1.C7192b;
import p467T1.C7193c;
import p467T1.C7194d;
import p467T1.C7195e;
import p467T1.C7197g;
import p467T1.C7199i;
import p467T1.C7200j;
import p467T1.C7201k;
import p467T1.C7202l;
import p467T1.C7205o;
import p467T1.C7206p;
import p467T1.C7207q;
import p467T1.InterfaceC7204n;
import p523V9.AbstractC8088f6;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9154J3;
import p594Y9.AbstractC9930m3;
import p758g0.C13767i0;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14337O;
import p774h1.AbstractC14360p;
import p774h1.C14338P;
import p774h1.C14341T;
import p774h1.C14365u;
import p821j1.AbstractC16040e;

/* JADX INFO: renamed from: L0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C4861Z extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C3582M f15823Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3582M f15824Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f15825o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13767i0 f15826p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1439n f15827q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean f15828r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C13767i0 f15829s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4861Z(C3582M c3582m, C3582M c3582m2, float f10, C13767i0 c13767i0, InterfaceC1439n interfaceC1439n, boolean z6, C13767i0 c13767i1) {
        super(2);
        this.f15823Y = c3582m;
        this.f15824Z = c3582m2;
        this.f15825o0 = f10;
        this.f15826p0 = c13767i0;
        this.f15827q0 = interfaceC1439n;
        this.f15828r0 = z6;
        this.f15829s0 = c13767i1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        float f10;
        C3608x c3608x;
        C3607w c3607w;
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C3582M c3582m = this.f15823Y;
            C3582M c3582m2 = this.f15824Z;
            InterfaceC7204n interfaceC7204n = AbstractC3575F.f10879d;
            C3573D c3573d = c3582m.f10910a;
            InterfaceC7204n interfaceC7204n2 = c3573d.f10859a;
            C3573D c3573d2 = c3582m2.f10910a;
            InterfaceC7204n interfaceC7204n3 = c3573d2.f10859a;
            boolean z6 = interfaceC7204n2 instanceof C7192b;
            InterfaceC7204n c7192b = C7202l.f22868a;
            float f11 = this.f15825o0;
            if (!z6 && !(interfaceC7204n3 instanceof C7192b)) {
                long jM15646x = AbstractC14334L.m15646x(f11, interfaceC7204n2.mo7588b(), interfaceC7204n3.mo7588b());
                if (jM15646x != 16) {
                    c7192b = new C7193c(jM15646x);
                }
            } else if (z6 && (interfaceC7204n3 instanceof C7192b)) {
                AbstractC14360p abstractC14360p = (AbstractC14360p) AbstractC3575F.m4249b(f11, ((C7192b) interfaceC7204n2).f22847a, ((C7192b) interfaceC7204n3).f22847a);
                float fM10589c = AbstractC9930m3.m10589c(((C7192b) interfaceC7204n2).f22848b, ((C7192b) interfaceC7204n3).f22848b, f11);
                if (abstractC14360p != null) {
                    if (abstractC14360p instanceof C14341T) {
                        long jM9702a = AbstractC9154J3.m9702a(fM10589c, ((C14341T) abstractC14360p).f45021a);
                        if (jM9702a != 16) {
                            c7192b = new C7193c(jM9702a);
                        }
                    } else {
                        if (!(abstractC14360p instanceof AbstractC14337O)) {
                            throw new C0644w();
                        }
                        c7192b = new C7192b((AbstractC14337O) abstractC14360p, fM10589c);
                    }
                }
            } else {
                c7192b = (InterfaceC7204n) AbstractC3575F.m4249b(f11, interfaceC7204n2, interfaceC7204n3);
            }
            InterfaceC7204n interfaceC7204n4 = c7192b;
            AbstractC5599o abstractC5599o = (AbstractC5599o) AbstractC3575F.m4249b(f11, c3573d.f10864f, c3573d2.f10864f);
            long jM4250c = AbstractC3575F.m4250c(f11, c3573d.f10860b, c3573d2.f10860b);
            C5609y c5609y = c3573d.f10861c;
            if (c5609y == null) {
                c5609y = C5609y.f18155r0;
            }
            C5609y c5609y2 = c3573d2.f10861c;
            if (c5609y2 == null) {
                c5609y2 = C5609y.f18155r0;
            }
            C5609y c5609y3 = new C5609y(AbstractC8301I.m8921l(AbstractC9930m3.m10590d(f11, c5609y.f18160Y, c5609y2.f18160Y), 1, 1000));
            C5605u c5605u = (C5605u) AbstractC3575F.m4249b(f11, c3573d.f10862d, c3573d2.f10862d);
            C5606v c5606v = (C5606v) AbstractC3575F.m4249b(f11, c3573d.f10863e, c3573d2.f10863e);
            String str = (String) AbstractC3575F.m4249b(f11, c3573d.f10865g, c3573d2.f10865g);
            long jM4250c2 = AbstractC3575F.m4250c(f11, c3573d.f10866h, c3573d2.f10866h);
            C7191a c7191a = c3573d.f10867i;
            float f12 = c7191a != null ? c7191a.f22846a : 0.0f;
            C7191a c7191a2 = c3573d2.f10867i;
            float fM10589c2 = AbstractC9930m3.m10589c(f12, c7191a2 != null ? c7191a2.f22846a : 0.0f, f11);
            C7205o c7205o = C7205o.f22871c;
            C7205o c7205o2 = c3573d.f10868j;
            if (c7205o2 == null) {
                c7205o2 = c7205o;
            }
            C7205o c7205o3 = c3573d2.f10868j;
            if (c7205o3 != null) {
                c7205o = c7205o3;
            }
            C7205o c7205o4 = new C7205o(AbstractC9930m3.m10589c(c7205o2.f22872a, c7205o.f22872a, f11), AbstractC9930m3.m10589c(c7205o2.f22873b, c7205o.f22873b, f11));
            C6306b c6306b = (C6306b) AbstractC3575F.m4249b(f11, c3573d.f10869k, c3573d2.f10869k);
            long jM15646x2 = AbstractC14334L.m15646x(f11, c3573d.f10870l, c3573d2.f10870l);
            C7200j c7200j = (C7200j) AbstractC3575F.m4249b(f11, c3573d.f10871m, c3573d2.f10871m);
            C14338P c14338p = c3573d.f10872n;
            if (c14338p == null) {
                f10 = 0.0f;
                c14338p = new C14338P(0.0f, 7, 0L);
            } else {
                f10 = 0.0f;
            }
            C14338P c14338p2 = c3573d2.f10872n;
            if (c14338p2 == null) {
                c14338p2 = new C14338P(f10, 7, 0L);
            }
            C14338P c14338p3 = new C14338P(AbstractC9930m3.m10589c(c14338p.f45003c, c14338p2.f45003c, f11), AbstractC14334L.m15646x(f11, c14338p.f45001a, c14338p2.f45001a), AbstractC8088f6.m8540f(f11, c14338p.f45002b, c14338p2.f45002b));
            C3608x c3608x2 = c3573d.f10873o;
            if (c3608x2 == null && c3573d2.f10873o == null) {
                c3608x = null;
            } else {
                if (c3608x2 == null) {
                    c3608x2 = C3608x.f10994a;
                }
                c3608x = c3608x2;
            }
            C3573D c3573d3 = new C3573D(interfaceC7204n4, jM4250c, c5609y3, c5605u, c5606v, abstractC5599o, str, jM4250c2, new C7191a(fM10589c2), c7205o4, c6306b, jM15646x2, c7200j, c14338p3, c3608x, (AbstractC16040e) AbstractC3575F.m4249b(f11, c3573d.f10874p, c3573d2.f10874p));
            int i10 = AbstractC3605u.f10988b;
            C3604t c3604t = c3582m.f10911b;
            C7199i c7199i = new C7199i(c3604t.f10978a);
            C3604t c3604t2 = c3582m2.f10911b;
            int i11 = ((C7199i) AbstractC3575F.m4249b(f11, c7199i, new C7199i(c3604t2.f10978a))).f22862a;
            int i12 = ((C7201k) AbstractC3575F.m4249b(f11, new C7201k(c3604t.f10979b), new C7201k(c3604t2.f10979b))).f22867a;
            long jM4250c3 = AbstractC3575F.m4250c(f11, c3604t.f10980c, c3604t2.f10980c);
            C7206p c7206p = c3604t.f10981d;
            if (c7206p == null) {
                c7206p = C7206p.f22874c;
            }
            C7206p c7206p2 = c3604t2.f10981d;
            if (c7206p2 == null) {
                c7206p2 = C7206p.f22874c;
            }
            C7206p c7206p3 = new C7206p(AbstractC3575F.m4250c(f11, c7206p.f22875a, c7206p2.f22875a), AbstractC3575F.m4250c(f11, c7206p.f22876b, c7206p2.f22876b));
            C3607w c3607w2 = c3604t.f10982e;
            C3607w c3607w3 = c3604t2.f10982e;
            if (c3607w2 == null && c3607w3 == null) {
                c3607w = null;
            } else {
                C3607w c3607w4 = C3607w.f10992b;
                if (c3607w2 == null) {
                    c3607w2 = c3607w4;
                }
                if (c3607w3 == null) {
                    c3607w3 = c3607w4;
                }
                boolean z10 = c3607w2.f10993a;
                boolean z11 = c3607w3.f10993a;
                if (z10 != z11) {
                    ((C3594j) AbstractC3575F.m4249b(f11, new C3594j(), new C3594j())).getClass();
                    c3607w2 = new C3607w(((Boolean) AbstractC3575F.m4249b(f11, Boolean.valueOf(z10), Boolean.valueOf(z11))).booleanValue());
                }
                c3607w = c3607w2;
            }
            C3582M c3582m3 = new C3582M(c3573d3, new C3604t(i11, i12, jM4250c3, c7206p3, c3607w, (C7197g) AbstractC3575F.m4249b(f11, c3604t.f10983f, c3604t2.f10983f), ((C7195e) AbstractC3575F.m4249b(f11, new C7195e(c3604t.f10984g), new C7195e(c3604t2.f10984g))).f22852a, ((C7194d) AbstractC3575F.m4249b(f11, new C7194d(c3604t.f10985h), new C7194d(c3604t2.f10985h))).f22850a, (C7207q) AbstractC3575F.m4249b(f11, c3604t.f10986i, c3604t2.f10986i)));
            if (this.f15828r0) {
                c3582m3 = C3582M.m4274b(c3582m3, ((C14365u) this.f15829s0.f43468t0.getValue()).f45062a, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 16777214);
            }
            AbstractC4879i0.m5510b(((C14365u) this.f15826p0.f43468t0.getValue()).f45062a, c3582m3, this.f15827q0, c6021p, 0);
        }
        return C17296C.f55119a;
    }
}
