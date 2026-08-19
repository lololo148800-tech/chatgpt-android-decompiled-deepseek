package p1034u6;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1439n;
import p066Cc.C1625b;
import p103Dn.AbstractC2124C;
import p103Dn.C2142L;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p658b5.C11241l;
import p900n6.C17506c;
import p900n6.C17507d;
import p917o6.C17851d;
import p917o6.C17853f;
import p917o6.InterfaceC17845M;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: u6.r */
/* JADX INFO: loaded from: classes.dex */
public final class C20140r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f63796Y;

    /* JADX INFO: renamed from: Z */
    public C16525B f63797Z;

    /* JADX INFO: renamed from: o0 */
    public int f63798o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f63799p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C11241l f63800q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20140r(C11241l c11241l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f63800q0 = c11241l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20140r c20140r = new C20140r(this.f63800q0, interfaceC18770c);
        c20140r.f63799p0 = obj;
        return c20140r;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20140r) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        C16525B c16525b;
        C16525B c16525b2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f63798o0;
        C11241l c11241l = this.f63800q0;
        if (i10 != 0) {
            if (i10 == 1) {
                c16525b = this.f63797Z;
                c16525b2 = this.f63796Y;
                interfaceC2186j = (InterfaceC2186j) this.f63799p0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f63799p0;
        C16525B c16525b3 = new C16525B();
        c16525b = new C16525B();
        InterfaceC2184i interfaceC2184iM12593N = c11241l.m12593N();
        C1625b c1625b = new C1625b(c16525b, c16525b3, interfaceC2186j, 13);
        this.f63799p0 = interfaceC2186j;
        this.f63796Y = c16525b3;
        this.f63797Z = c16525b;
        this.f63798o0 = 1;
        if (interfaceC2184iM12593N.mo3141d(c1625b, this) == enumC19250a) {
            return enumC19250a;
        }
        c16525b2 = c16525b3;
        C17851d c17851d = (C17851d) c11241l.f34017Z;
        C17851d c17851dM19597a = c17851d.m19596a().m19597a();
        C17507d apolloClient = (C17507d) c11241l.f34016Y;
        AbstractC16544l.m18094g(apolloClient, "apolloClient");
        if (c17851d.f56913c.mo4141d(AbstractC20125c.f63755d) != null) {
            throw new ClassCastException();
        }
        c17851dM19597a.f56913c = c17851dM19597a.f56913c.mo4139b(new C20129g(AbstractC20136n.f63783a));
        C17853f c17853f = (C17853f) c16525b.f51262Y;
        InterfaceC17845M interfaceC17845M = c17853f != null ? (InterfaceC17845M) c17853f.f56933c : null;
        C17851d c17851dM19597a2 = c17851dM19597a.m19596a().m19597a();
        c17851dM19597a2.f56913c = c17851dM19597a2.f56913c.mo4139b(new C20141s(interfaceC17845M));
        InterfaceC2184i interfaceC2184iM3208g = AbstractC2124C.m3208g(AbstractC2124C.m3224w(AbstractC2124C.m3210i(new C17506c(apolloClient, c17851dM19597a2.m19596a(), null)), AbstractC0593T.f1825b), Integer.MAX_VALUE);
        C2142L c2142l = new C2142L(c16525b2, interfaceC2186j);
        this.f63799p0 = null;
        this.f63796Y = null;
        this.f63797Z = null;
        this.f63798o0 = 2;
        if (interfaceC2184iM3208g.mo3141d(c2142l, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
