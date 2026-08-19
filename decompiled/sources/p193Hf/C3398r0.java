package p193Hf;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0636s;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21098s;
import p571X9.AbstractC9224V2;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p759g1.C13801c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3398r0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10356Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10357Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3418y0 f10358o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13801c f10359p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC21098s f10360q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3398r0(C3418y0 c3418y0, C13801c c13801c, InterfaceC21098s interfaceC21098s, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10358o0 = c3418y0;
        this.f10359p0 = c13801c;
        this.f10360q0 = interfaceC21098s;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3398r0 c3398r0 = new C3398r0(this.f10358o0, this.f10359p0, this.f10360q0, interfaceC18770c);
        c3398r0.f10357Z = obj;
        return c3398r0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3398r0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00dc  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0571F interfaceC0571F;
        C13756d c13756d;
        Float f10;
        C13756d c13756d2;
        Float f11;
        C13756d c13756d3;
        Float f12;
        C13756d c13756d4;
        Float f13;
        C0636s c0636s;
        InterfaceC0571F interfaceC0571F2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10356Y;
        C13801c c13801c = this.f10359p0;
        C3418y0 c3418y0 = this.f10358o0;
        switch (i10) {
            case 0:
                AbstractC9233X.m9807c(obj);
                InterfaceC0571F interfaceC0571F3 = (InterfaceC0571F) this.f10357Z;
                C13756d c13756d5 = c3418y0.f10409b;
                Float f14 = new Float(c13801c.f43586a);
                this.f10357Z = interfaceC0571F3;
                this.f10356Y = 1;
                if (c13756d5.m15226g(f14, this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC0571F = interfaceC0571F3;
                c13756d = c3418y0.f10410c;
                f10 = new Float(c13801c.f43587b);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 2;
                if (c13756d.m15226g(f10, this) == enumC19250a) {
                    return enumC19250a;
                }
                c13756d2 = c3418y0.f10411d;
                f11 = new Float(c13801c.m15321h());
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 3;
                if (c13756d2.m15226g(f11, this) == enumC19250a) {
                    return enumC19250a;
                }
                c13756d3 = c3418y0.f10412e;
                f12 = new Float(c13801c.m15318e());
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 4;
                if (c13756d3.m15226g(f12, this) == enumC19250a) {
                    return enumC19250a;
                }
                c13756d4 = c3418y0.f10413f;
                f13 = new Float(1.0f);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 5;
                if (c13756d4.m15226g(f13, this) == enumC19250a) {
                    return enumC19250a;
                }
                InterfaceC0627n0 interfaceC0627n0M9793c = AbstractC9224V2.m9793c(interfaceC0571F);
                c0636s = new C0636s(true);
                c0636s.m1294K(interfaceC0627n0M9793c);
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C3380l0(c3418y0, c0636s, null), 3);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 6;
                if (c0636s.m1309u(this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC0571F2 = interfaceC0571F;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3383m0(c3418y0, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3386n0(c3418y0, null), 3);
                InterfaceC21098s interfaceC21098s = this.f10360q0;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3389o0(c3418y0, interfaceC21098s, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3392p0(c3418y0, interfaceC21098s, null), 3);
                return AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3395q0(c3418y0, null), 3);
            case 1:
                interfaceC0571F = (InterfaceC0571F) this.f10357Z;
                AbstractC9233X.m9807c(obj);
                c13756d = c3418y0.f10410c;
                f10 = new Float(c13801c.f43587b);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 2;
                if (c13756d.m15226g(f10, this) == enumC19250a) {
                    return enumC19250a;
                }
                c13756d2 = c3418y0.f10411d;
                f11 = new Float(c13801c.m15321h());
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 3;
                if (c13756d2.m15226g(f11, this) == enumC19250a) {
                    return enumC19250a;
                }
                c13756d3 = c3418y0.f10412e;
                f12 = new Float(c13801c.m15318e());
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 4;
                if (c13756d3.m15226g(f12, this) == enumC19250a) {
                    return enumC19250a;
                }
                c13756d4 = c3418y0.f10413f;
                f13 = new Float(1.0f);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 5;
                if (c13756d4.m15226g(f13, this) == enumC19250a) {
                    return enumC19250a;
                }
                InterfaceC0627n0 interfaceC0627n0M9793c2 = AbstractC9224V2.m9793c(interfaceC0571F);
                c0636s = new C0636s(true);
                c0636s.m1294K(interfaceC0627n0M9793c2);
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C3380l0(c3418y0, c0636s, null), 3);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 6;
                if (c0636s.m1309u(this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC0571F2 = interfaceC0571F;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3383m0(c3418y0, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3386n0(c3418y0, null), 3);
                InterfaceC21098s interfaceC21098s2 = this.f10360q0;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3389o0(c3418y0, interfaceC21098s2, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3392p0(c3418y0, interfaceC21098s2, null), 3);
                return AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3395q0(c3418y0, null), 3);
            case 2:
                interfaceC0571F = (InterfaceC0571F) this.f10357Z;
                AbstractC9233X.m9807c(obj);
                c13756d2 = c3418y0.f10411d;
                f11 = new Float(c13801c.m15321h());
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 3;
                if (c13756d2.m15226g(f11, this) == enumC19250a) {
                    return enumC19250a;
                }
                c13756d3 = c3418y0.f10412e;
                f12 = new Float(c13801c.m15318e());
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 4;
                if (c13756d3.m15226g(f12, this) == enumC19250a) {
                    return enumC19250a;
                }
                c13756d4 = c3418y0.f10413f;
                f13 = new Float(1.0f);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 5;
                if (c13756d4.m15226g(f13, this) == enumC19250a) {
                    return enumC19250a;
                }
                InterfaceC0627n0 interfaceC0627n0M9793c3 = AbstractC9224V2.m9793c(interfaceC0571F);
                c0636s = new C0636s(true);
                c0636s.m1294K(interfaceC0627n0M9793c3);
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C3380l0(c3418y0, c0636s, null), 3);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 6;
                if (c0636s.m1309u(this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC0571F2 = interfaceC0571F;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3383m0(c3418y0, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3386n0(c3418y0, null), 3);
                InterfaceC21098s interfaceC21098s3 = this.f10360q0;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3389o0(c3418y0, interfaceC21098s3, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3392p0(c3418y0, interfaceC21098s3, null), 3);
                return AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3395q0(c3418y0, null), 3);
            case 3:
                interfaceC0571F = (InterfaceC0571F) this.f10357Z;
                AbstractC9233X.m9807c(obj);
                c13756d3 = c3418y0.f10412e;
                f12 = new Float(c13801c.m15318e());
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 4;
                if (c13756d3.m15226g(f12, this) == enumC19250a) {
                    return enumC19250a;
                }
                c13756d4 = c3418y0.f10413f;
                f13 = new Float(1.0f);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 5;
                if (c13756d4.m15226g(f13, this) == enumC19250a) {
                    return enumC19250a;
                }
                InterfaceC0627n0 interfaceC0627n0M9793c4 = AbstractC9224V2.m9793c(interfaceC0571F);
                c0636s = new C0636s(true);
                c0636s.m1294K(interfaceC0627n0M9793c4);
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C3380l0(c3418y0, c0636s, null), 3);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 6;
                if (c0636s.m1309u(this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC0571F2 = interfaceC0571F;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3383m0(c3418y0, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3386n0(c3418y0, null), 3);
                InterfaceC21098s interfaceC21098s4 = this.f10360q0;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3389o0(c3418y0, interfaceC21098s4, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3392p0(c3418y0, interfaceC21098s4, null), 3);
                return AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3395q0(c3418y0, null), 3);
            case 4:
                interfaceC0571F = (InterfaceC0571F) this.f10357Z;
                AbstractC9233X.m9807c(obj);
                c13756d4 = c3418y0.f10413f;
                f13 = new Float(1.0f);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 5;
                if (c13756d4.m15226g(f13, this) == enumC19250a) {
                    return enumC19250a;
                }
                InterfaceC0627n0 interfaceC0627n0M9793c5 = AbstractC9224V2.m9793c(interfaceC0571F);
                c0636s = new C0636s(true);
                c0636s.m1294K(interfaceC0627n0M9793c5);
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C3380l0(c3418y0, c0636s, null), 3);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 6;
                if (c0636s.m1309u(this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC0571F2 = interfaceC0571F;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3383m0(c3418y0, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3386n0(c3418y0, null), 3);
                InterfaceC21098s interfaceC21098s5 = this.f10360q0;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3389o0(c3418y0, interfaceC21098s5, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3392p0(c3418y0, interfaceC21098s5, null), 3);
                return AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3395q0(c3418y0, null), 3);
            case 5:
                interfaceC0571F = (InterfaceC0571F) this.f10357Z;
                AbstractC9233X.m9807c(obj);
                InterfaceC0627n0 interfaceC0627n0M9793c6 = AbstractC9224V2.m9793c(interfaceC0571F);
                c0636s = new C0636s(true);
                c0636s.m1294K(interfaceC0627n0M9793c6);
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C3380l0(c3418y0, c0636s, null), 3);
                this.f10357Z = interfaceC0571F;
                this.f10356Y = 6;
                if (c0636s.m1309u(this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC0571F2 = interfaceC0571F;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3383m0(c3418y0, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3386n0(c3418y0, null), 3);
                InterfaceC21098s interfaceC21098s6 = this.f10360q0;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3389o0(c3418y0, interfaceC21098s6, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3392p0(c3418y0, interfaceC21098s6, null), 3);
                return AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3395q0(c3418y0, null), 3);
            case 6:
                interfaceC0571F2 = (InterfaceC0571F) this.f10357Z;
                AbstractC9233X.m9807c(obj);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3383m0(c3418y0, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3386n0(c3418y0, null), 3);
                InterfaceC21098s interfaceC21098s7 = this.f10360q0;
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3389o0(c3418y0, interfaceC21098s7, null), 3);
                AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3392p0(c3418y0, interfaceC21098s7, null), 3);
                return AbstractC0575H.m1156D(interfaceC0571F2, null, null, new C3395q0(c3418y0, null), 3);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
