package p321Mk;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Mk.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C5471i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f17872Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11238i f17873Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f17874o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5471i(C11238i c11238i, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f17873Z = c11238i;
        this.f17874o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5471i(this.f17873Z, this.f17874o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5471i) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f17872Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f17872Y = 1;
            C11238i c11238i = this.f17873Z;
            c11238i.getClass();
            Object objM1183l = AbstractC0575H.m1183l(new C5481s(c11238i, this.f17874o0, null), this);
            if (objM1183l != enumC19250a) {
                objM1183l = c17296c;
            }
            if (objM1183l == enumC19250a) {
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
