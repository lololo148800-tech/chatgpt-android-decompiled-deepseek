package bg;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bg.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C11416p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f34469Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11422v f34470Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11416p(C11422v c11422v, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34470Z = c11422v;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11416p(this.f34470Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11416p) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f34469Y;
        C11422v c11422v = this.f34470Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        C0564B0 c0564b0 = c11422v.f34497i;
        this.f34469Y = 1;
        if (c0564b0.mo1272P(this) == enumC19250a) {
            return enumC19250a;
        }
        this.f34469Y = 2;
        c11422v.getClass();
        obj = AbstractC0575H.m1183l(new C11414n(c11422v, null), this);
        return obj == enumC19250a ? enumC19250a : obj;
    }
}
