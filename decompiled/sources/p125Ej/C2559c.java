package p125Ej;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p086D6.C1971o;
import p103Dn.AbstractC2124C;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ej.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2559c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7985Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7986Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2219z0 f7987o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2559c(C2219z0 c2219z0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7987o0 = c2219z0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2559c c2559c = new C2559c(this.f7987o0, interfaceC18770c);
        c2559c.f7986Z = obj;
        return c2559c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2559c) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7985Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f7986Z;
            InterfaceC2184i interfaceC2184iM3208g = AbstractC2124C.m3208g(this.f7987o0, -1);
            C1971o c1971o = new C1971o(interfaceC2186j, 6);
            this.f7985Y = 1;
            if (interfaceC2184iM3208g.mo3141d(c1971o, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
