package p1034u6;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p002A0.C0132i;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2142L;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p826j6.C16137F;
import p917o6.C17851d;
import p917o6.C17852e;
import p917o6.C17853f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: u6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C20135m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f63778Y;

    /* JADX INFO: renamed from: Z */
    public int f63779Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f63780o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16137F f63781p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17852e f63782q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20135m(C16137F c16137f, C17852e c17852e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f63781p0 = c16137f;
        this.f63782q0 = c17852e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20135m c20135m = new C20135m(this.f63781p0, this.f63782q0, interfaceC18770c);
        c20135m.f63780o0 = obj;
        return c20135m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20135m) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2186j interfaceC2186j;
        C16525B c16525b;
        InterfaceC2186j interfaceC2186j2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f63779Z;
        C16137F c16137f = this.f63781p0;
        C17296C c17296c = C17296C.f55119a;
        C17852e c17852e = this.f63782q0;
        if (i10 != 0) {
            if (i10 == 1) {
                c16525b = this.f63778Y;
                InterfaceC2186j interfaceC2186j3 = (InterfaceC2186j) this.f63780o0;
                AbstractC9233X.m9807c(obj);
                interfaceC2186j = interfaceC2186j3;
            } else if (i10 == 2) {
                interfaceC2186j2 = (InterfaceC2186j) this.f63780o0;
                AbstractC9233X.m9807c(obj);
                this.f63780o0 = null;
                this.f63779Z = 3;
                if (interfaceC2186j2.mo395a((C17853f) obj, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f63780o0;
        c16525b = new C16525B();
        InterfaceC2184i interfaceC2184iM17695n = c16137f.m17695n(c17852e);
        C20134l c20134l = new C20134l(c16525b, null);
        this.f63780o0 = interfaceC2186j;
        this.f63778Y = c16525b;
        this.f63779Z = 1;
        AbstractC2124C.m3219r(interfaceC2186j);
        Object objMo3141d = interfaceC2184iM17695n.mo3141d(new C0132i(new C2142L(interfaceC2186j, c16525b, 2), 6, c20134l), this);
        if (objMo3141d != enumC19250a) {
            objMo3141d = c17296c;
        }
        if (objMo3141d != enumC19250a) {
            objMo3141d = c17296c;
        }
        if (objMo3141d != enumC19250a) {
            objMo3141d = c17296c;
        }
        if (objMo3141d == enumC19250a) {
            return enumC19250a;
        }
        if (c16525b.f51262Y == null) {
            return c17296c;
        }
        C17851d c17851dM19597a = c17852e.m19597a();
        AbstractC20136n.m20961a(c17851dM19597a);
        InterfaceC2184i interfaceC2184iM17695n2 = c16137f.m17695n(c17851dM19597a.m19596a());
        this.f63780o0 = interfaceC2186j;
        this.f63778Y = null;
        this.f63779Z = 2;
        Object objM3197A = AbstractC2124C.m3197A(interfaceC2184iM17695n2, this);
        if (objM3197A == enumC19250a) {
            return enumC19250a;
        }
        interfaceC2186j2 = interfaceC2186j;
        obj = objM3197A;
        this.f63780o0 = null;
        this.f63779Z = 3;
        if (interfaceC2186j2.mo395a((C17853f) obj, this) == enumC19250a) {
            return enumC19250a;
        }
        return c17296c;
    }
}
