package p000;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p006A4.C0349j;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p204I1.C3582M;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4048f0;
import p229J0.C3904E3;
import p229J0.C3934J3;
import p229J0.C3941K4;
import p229J0.C3991U3;
import p229J0.C4042e0;
import p278L0.AbstractC4846J;
import p278L0.AbstractC4879i0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p492U1.C7542g;
import p537W0.AbstractC8411c;
import p637a3.C10485b;
import p672c3.C11612j0;
import p672c3.C11638w0;
import p672c3.InterfaceC11563A0;
import p882m1.AbstractC17140a;
import p911o0.C17767k0;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: classes.dex */
public final class C10440a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30923Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f30924Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f30925o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f30926p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10440a(long j10, Object obj, Object obj2, int i10) {
        super(2);
        this.f30923Y = i10;
        this.f30924Z = j10;
        this.f30925o0 = obj;
        this.f30926p0 = obj2;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = 1;
        int i11 = 0;
        long j10 = this.f30924Z;
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f30925o0;
        Object obj4 = this.f30926p0;
        switch (this.f30923Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3878A1.m4596a((AbstractC17140a) obj3, (String) obj4, null, this.f30924Z, c6021p, 0, 4);
                }
                return c17296c;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4846J.m5493b(this.f30924Z, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12157m, AbstractC8411c.m8969c(1327513942, c6021p2, new C0349j((InterfaceC17763i0) obj3, 15, (InterfaceC1440o) obj4)), c6021p2, 384);
                }
                return c17296c;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C17767k0 c17767k0 = AbstractC4048f0.f12769a;
                    C4042e0 c4042e0M4737f = AbstractC4048f0.m4737f(j10, c6021p3);
                    C3934J3 c3934j3 = (C3934J3) obj3;
                    boolean zM6542f = c6021p3.m6542f(c3934j3);
                    Object objM6514H = c6021p3.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C3904E3(c3934j3, i10);
                        c6021p3.m6537c0(objM6514H);
                    }
                    AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H, null, false, null, c4042e0M4737f, null, null, null, null, AbstractC8411c.m8969c(521110564, c6021p3, new C3991U3((String) obj4, i11)), c6021p3, 805306368, 494);
                }
                return c17296c;
            case 3:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC4879i0.m5510b(this.f30924Z, (C3582M) obj3, (InterfaceC1439n) obj4, c6021p4, 0);
                }
                return c17296c;
            default:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    C11638w0 c11638w0 = C11638w0.f35264Y;
                    c6021p5.m6525T(578571862);
                    c6021p5.m6525T(-548224868);
                    if (!(c6021p5.f19565a instanceof C10485b)) {
                        C5997d.m6425L();
                        throw null;
                    }
                    c6021p5.m6522Q();
                    if (c6021p5.f19563O) {
                        c6021p5.m6549l(c11638w0);
                    } else {
                        c6021p5.m6543f0();
                    }
                    C5997d.m6439Z(C11612j0.f35133F0, c6021p5, new C7542g(j10));
                    C5997d.m6439Z(C11612j0.f35134G0, c6021p5, (InterfaceC11563A0) obj4);
                    ((InterfaceC1439n) obj3).invoke(c6021p5, 0);
                    c6021p5.m6553p(true);
                    c6021p5.m6553p(false);
                    c6021p5.m6553p(false);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10440a(InterfaceC1439n interfaceC1439n, long j10, InterfaceC11563A0 interfaceC11563A0) {
        super(2);
        this.f30923Y = 4;
        this.f30925o0 = interfaceC1439n;
        this.f30924Z = j10;
        this.f30926p0 = interfaceC11563A0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10440a(AbstractC17140a abstractC17140a, String str, long j10) {
        super(2);
        this.f30923Y = 0;
        this.f30925o0 = abstractC17140a;
        this.f30926p0 = str;
        this.f30924Z = j10;
    }
}
