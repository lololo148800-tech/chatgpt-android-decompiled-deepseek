package p092Dc;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import ni.C17627a;
import ni.C17641o;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p948pi.C18418a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1984a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C1996m f5861Y;

    /* JADX INFO: renamed from: Z */
    public int f5862Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f5863o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1988e f5864p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17641o f5865q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1984a(C1988e c1988e, C17641o c17641o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5864p0 = c1988e;
        this.f5865q0 = c17641o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1984a c1984a = new C1984a(this.f5864p0, this.f5865q0, interfaceC18770c);
        c1984a.f5863o0 = obj;
        return c1984a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1984a) create((C18418a) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C18418a c18418a;
        C1996m c1996m;
        C1996m c1996m2;
        C18418a c18418a2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5862Z;
        C1988e c1988e = this.f5864p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            c18418a = (C18418a) this.f5863o0;
            c1996m = (C1996m) c1988e.f5878d.f6797Y.getValue();
            if (!AbstractC16544l.m18089b((c1996m == null || (c18418a2 = c1996m.f5936a) == null) ? null : c18418a2.f58775c, c18418a.f58775c) || c1996m.f5936a.f58774b.m22327f() != c18418a.f58774b.m22327f()) {
                if (c1996m != null) {
                    this.f5863o0 = c18418a;
                    this.f5861Y = c1996m;
                    this.f5862Z = 1;
                    if (C1988e.m3157a(c1988e, c1996m, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    c1996m2 = c1996m;
                }
                AbstractC8160o6.m8726a(c1988e.f5876b, "Creating new AccountUserComponent for " + c18418a, null, 6);
                C17641o parentScope = this.f5865q0;
                AbstractC16544l.m18094g(parentScope, "parentScope");
                C1996m c1996mM3163a = c1988e.f5875a.m3163a(c18418a, new C17627a(parentScope));
                c1988e.m3158b(c1996m, c1996mM3163a);
                C2153Q0 c2153q0 = c1988e.f5877c;
                c2153q0.getClass();
                c2153q0.m3251l(null, c1996mM3163a);
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c1996m2 = this.f5861Y;
        c18418a = (C18418a) this.f5863o0;
        AbstractC9233X.m9807c(obj);
        c1996m = c1996m2;
        AbstractC8160o6.m8726a(c1988e.f5876b, "Creating new AccountUserComponent for " + c18418a, null, 6);
        C17641o parentScope2 = this.f5865q0;
        AbstractC16544l.m18094g(parentScope2, "parentScope");
        C1996m c1996mM3163a2 = c1988e.f5875a.m3163a(c18418a, new C17627a(parentScope2));
        c1988e.m3158b(c1996m, c1996mM3163a2);
        C2153Q0 c2153q1 = c1988e.f5877c;
        c2153q1.getClass();
        c2153q1.m3251l(null, c1996mM3163a2);
        return C17296C.f55119a;
    }
}
