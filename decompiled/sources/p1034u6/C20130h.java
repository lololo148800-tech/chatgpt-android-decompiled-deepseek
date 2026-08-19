package p1034u6;

import mm.C17296C;
import p032B4.C0806a;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
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

/* JADX INFO: renamed from: u6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C20130h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f63763Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f63764Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16137F f63765o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17852e f63766p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20130h(C16137F c16137f, C17852e c17852e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f63765o0 = c16137f;
        this.f63766p0 = c17852e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20130h c20130h = new C20130h(this.f63765o0, this.f63766p0, interfaceC18770c);
        c20130h.f63764Z = obj;
        return c20130h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20130h) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        InterfaceC2184i interfaceC2184iM17695n;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f63763Y;
        C16137F c16137f = this.f63765o0;
        C17852e c17852e = this.f63766p0;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f63764Z;
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                interfaceC2186j = (InterfaceC2186j) this.f63764Z;
                AbstractC9233X.m9807c(obj);
                interfaceC2184iM17695n = c16137f.m17695n(c17852e);
                this.f63764Z = null;
                this.f63763Y = 3;
                if (AbstractC2124C.m3217p(interfaceC2186j, interfaceC2184iM17695n, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC2186j interfaceC2186j2 = (InterfaceC2186j) this.f63764Z;
        C17851d c17851dM19597a = c17852e.m19597a();
        AbstractC20136n.m20961a(c17851dM19597a);
        InterfaceC2184i interfaceC2184iM17695n2 = c16137f.m17695n(c17851dM19597a.m19596a());
        this.f63764Z = interfaceC2186j2;
        this.f63763Y = 1;
        Object objM3197A = AbstractC2124C.m3197A(interfaceC2184iM17695n2, this);
        if (objM3197A == enumC19250a) {
            return enumC19250a;
        }
        interfaceC2186j = interfaceC2186j2;
        obj = objM3197A;
        C0806a c0806aM19598a = ((C17853f) obj).m19598a();
        c0806aM19598a.f2235a = false;
        C17853f c17853fM1843b = c0806aM19598a.m1843b();
        this.f63764Z = interfaceC2186j;
        this.f63763Y = 2;
        if (interfaceC2186j.mo395a(c17853fM1843b, this) == enumC19250a) {
            return enumC19250a;
        }
        interfaceC2184iM17695n = c16137f.m17695n(c17852e);
        this.f63764Z = null;
        this.f63763Y = 3;
        if (AbstractC2124C.m3217p(interfaceC2186j, interfaceC2184iM17695n, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
