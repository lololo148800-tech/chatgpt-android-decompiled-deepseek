package p708dh;

import java.util.Map;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p1155zi.C22038o;
import p1155zi.C22050r;
import p1155zi.C22062u;
import p482Tg.C7448e;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: dh.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C13161o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f41782Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f41783Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13166t f41784o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13161o(C13166t c13166t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41784o0 = c13166t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13161o c13161o = new C13161o(this.f41784o0, interfaceC18770c);
        c13161o.f41783Z = obj;
        return c13161o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13161o) create((C17309l) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41782Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17309l c17309l = (C17309l) this.f41783Z;
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) c17309l.f55136Y;
            AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) c17309l.f55137Z;
            boolean z6 = abstractC21955Q1 instanceof C21952P1;
            C13166t c13166t = this.f41784o0;
            if (z6 && (abstractC21955Q2 instanceof C21952P1)) {
                C22062u c22062u = (C22062u) ((C21952P1) abstractC21955Q2).f69511a;
                c22062u.getClass();
                C22050r.Companion.getClass();
                C22050r c22050r = new C22050r("default");
                Map map = c22062u.f69762a;
                C22038o c22038o = (C22038o) map.get(c22050r);
                if (c22038o == null) {
                    c22038o = (C22038o) map.get(AbstractC17680n.m19341Q(c22062u.f69763b));
                }
                if (c22038o == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C2153Q0 c2153q0 = c13166t.f41804h;
                String str = c22038o.f69711a;
                C22050r c22050r2 = new C22050r(str);
                c2153q0.getClass();
                c2153q0.m3251l(null, c22050r2);
                C13167u c13167u = c13166t.f41797a;
                C7448e c7448e = new C7448e(abstractC21955Q1, abstractC21955Q2, str, 17);
                this.f41782Y = 1;
                if (c13167u.m21029b(c7448e, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                C2153Q0 c2153q1 = c13166t.f41803g;
                this.f41782Y = 2;
                c2153q1.setValue(abstractC21955Q1);
                if (c17296c == enumC19250a) {
                    return enumC19250a;
                }
            } else if (abstractC21955Q2 instanceof AbstractC21933K1) {
                C2153Q0 c2153q2 = c13166t.f41803g;
                this.f41782Y = 3;
                c2153q2.setValue(abstractC21955Q2);
                if (c17296c == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
