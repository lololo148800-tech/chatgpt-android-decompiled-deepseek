package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C16687K extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53466Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53467Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16696N f53468o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1439n f53469p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16687K(C16696N c16696n, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53468o0 = c16696n;
        this.f53469p0 = interfaceC1439n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16687K c16687k = new C16687K(this.f53468o0, this.f53469p0, interfaceC18770c);
        c16687k.f53467Z = obj;
        return c16687k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16687K) create((InterfaceC16694M0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53466Y;
        C16696N c16696n = this.f53468o0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC16694M0 interfaceC16694M0 = (InterfaceC16694M0) this.f53467Z;
                c16696n.f53502d.setValue(Boolean.TRUE);
                InterfaceC1439n interfaceC1439n = this.f53469p0;
                this.f53466Y = 1;
                if (interfaceC1439n.invoke(interfaceC16694M0, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            c16696n.f53502d.setValue(Boolean.FALSE);
            return C17296C.f55119a;
        } catch (Throwable th2) {
            c16696n.f53502d.setValue(Boolean.FALSE);
            throw th2;
        }
    }
}
