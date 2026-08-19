package p002A0;

import io.ktor.client.plugins.auth.C15058c;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2219z0;
import p349O0.C5997d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0109H extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f470Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0120T f471Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0109H(C0120T c0120t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f471Z = c0120t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0109H(this.f471Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0109H) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f470Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f470Y = 1;
            C0120T c0120t = this.f471Z;
            c0120t.getClass();
            C2219z0 c2219z0M6441a0 = C5997d.m6441a0(new C0112K(c0120t, 0));
            C0113L c0113l = C0113L.f478Y;
            C15058c c15058c = AbstractC2124C.f6494a;
            AbstractC16529F.m18081e(2, c0113l);
            Object objMo3141d = AbstractC2124C.m3216o(c2219z0M6441a0, c15058c, c0113l).mo3141d(new C0132i(new C16558z(), 4, new C0114M(c0120t, 0)), this);
            if (objMo3141d != EnumC19250a.f61036Y) {
                objMo3141d = c17296c;
            }
            if (objMo3141d != enumC19250a) {
                objMo3141d = c17296c;
            }
            if (objMo3141d == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
