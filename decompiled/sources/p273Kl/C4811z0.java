package p273Kl;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9233X;
import p867l8.C16831c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4811z0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15691Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4727J0 f15692Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4811z0(C4727J0 c4727j0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15692Z = c4727j0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4811z0(this.f15692Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4811z0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15691Y;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C4801u0 c4801u0 = this.f15692Z.f15373F;
                if (c4801u0 != null) {
                    this.f15691Y = 1;
                    obj = c4801u0.m5436a(this);
                    if (obj == enumC19250a) {
                        return enumC19250a;
                    }
                }
                return C17296C.f55119a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        } catch (Exception unused) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18571j(new Object[0]);
            }
        }
        return C17296C.f55119a;
    }
}
