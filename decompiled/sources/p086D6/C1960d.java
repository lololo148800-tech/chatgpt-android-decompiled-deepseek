package p086D6;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p826j6.C16137F;
import p917o6.C17852e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1960d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f5800Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f5801Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16137F f5802o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17852e f5803p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C1961e f5804q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean f5805r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1960d(C16137F c16137f, C17852e c17852e, C1961e c1961e, boolean z6, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5802o0 = c16137f;
        this.f5803p0 = c17852e;
        this.f5804q0 = c1961e;
        this.f5805r0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1960d c1960d = new C1960d(this.f5802o0, this.f5803p0, this.f5804q0, this.f5805r0, interfaceC18770c);
        c1960d.f5801Z = obj;
        return c1960d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1960d) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5800Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f5801Z;
            C16137F c16137f = this.f5802o0;
            C17852e c17852e = this.f5803p0;
            InterfaceC2184i interfaceC2184iM17695n = c16137f.m17695n(c17852e);
            C1959c c1959c = new C1959c(this.f5804q0, c17852e, this.f5805r0, interfaceC2186j, c16137f);
            this.f5800Y = 1;
            if (interfaceC2184iM17695n.mo3141d(c1959c, this) == enumC19250a) {
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
