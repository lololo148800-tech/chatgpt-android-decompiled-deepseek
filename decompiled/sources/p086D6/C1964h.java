package p086D6;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p826j6.C16137F;
import p917o6.C17852e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1964h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f5810Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f5811Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1967k f5812o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17852e f5813p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16137F f5814q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1964h(boolean z6, C1967k c1967k, C17852e c17852e, C16137F c16137f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5811Z = z6;
        this.f5812o0 = c1967k;
        this.f5813p0 = c17852e;
        this.f5814q0 = c16137f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1964h c1964h = new C1964h(this.f5811Z, this.f5812o0, this.f5813p0, this.f5814q0, interfaceC18770c);
        c1964h.f5810Y = obj;
        return c1964h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1964h) create((C17852e) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C17852e c17852e = (C17852e) this.f5810Y;
        if (this.f5811Z) {
            this.f5812o0.getClass();
        }
        return this.f5814q0.m17695n(c17852e);
    }
}
