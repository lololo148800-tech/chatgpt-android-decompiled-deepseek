package p773h0;

import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p129En.C2602m;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C14247B extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44709Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14248C f44710Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14247B(C14248C c14248c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44710Z = c14248c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14247B(this.f44710Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14247B) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44709Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C16558z c16558z = new C16558z();
        C16558z c16558z2 = new C16558z();
        C16558z c16558z3 = new C16558z();
        C14248C c14248c = this.f44710Z;
        C2127D0 c2127d0Mo7768b = c14248c.f44714z0.mo7768b();
        C2602m c2602m = new C2602m(c16558z, c16558z2, c16558z3, c14248c, 5);
        this.f44709Y = 1;
        c2127d0Mo7768b.mo3141d(c2602m, this);
        return enumC19250a;
    }
}
