package bg;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9150J;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bg.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C11413m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f34458Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11422v f34459Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11413m(C11422v c11422v, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34459Z = c11422v;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11413m(this.f34459Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11413m) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f34458Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C11412l c11412l = new C11412l(this.f34459Z, null);
            this.f34458Y = 1;
            obj = AbstractC9150J.m9699d(0, 0L, null, null, c11412l, this, 63);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
