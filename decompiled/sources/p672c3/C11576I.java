package p672c3;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8038Z3;
import p571X9.AbstractC9233X;
import p823j3.C16095q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.I */
/* JADX INFO: loaded from: classes.dex */
public final class C11576I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35004Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35005Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11597c f35006o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11576I(C11597c c11597c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35006o0 = c11597c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11576I c11576i = new C11576I(this.f35006o0, interfaceC18770c);
        c11576i.f35005Z = obj;
        return c11576i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11576I) create((C16095q) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35004Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16095q c16095q = (C16095q) this.f35005Z;
            String strM8392a = AbstractC8038Z3.m8392a(this.f35006o0.f35088a);
            this.f35004Y = 1;
            C11617m c11617m = (C11617m) c16095q.f49858a.remove(strM8392a);
            if (c11617m != null) {
                c11617m.f35168c.mo2522l(null);
                c11617m.f35167b.set(false);
                c11617m.f35178m.mo1275e(null);
            }
            if (c17296c == enumC19250a) {
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
