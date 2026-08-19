package p229J0;

import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p002A0.C0132i;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.u4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4142u4 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f13418Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4148v4 f13419Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4142u4(C4148v4 c4148v4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f13419Z = c4148v4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4142u4(this.f13419Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4142u4) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f13418Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C16558z c16558z = new C16558z();
        C4148v4 c4148v4 = this.f13419Z;
        C2127D0 c2127d0Mo7768b = c4148v4.f13440z0.mo7768b();
        C0132i c0132i = new C0132i(c16558z, 15, c4148v4);
        this.f13418Y = 1;
        c2127d0Mo7768b.mo3141d(c0132i, this);
        return enumC19250a;
    }
}
