package p906nh;

import mh.C17272t;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: nh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17619a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f56380Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17625g f56381Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17619a(C17625g c17625g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56381Z = c17625g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17619a(this.f56381Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17619a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56380Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2153Q0 c2153q0 = this.f56381Z.f56406r0;
            C17272t c17272t = C17272t.f55079c;
            this.f56380Y = 1;
            c2153q0.getClass();
            c2153q0.m3251l(null, c17272t);
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
