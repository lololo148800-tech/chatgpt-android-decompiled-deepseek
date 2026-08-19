package p033B5;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p374P5.C6354g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: B5.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0836t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f2321Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0840x f2322Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6354g f2323o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0836t(C0840x c0840x, C6354g c6354g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f2322Z = c0840x;
        this.f2323o0 = c6354g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0836t(this.f2322Z, this.f2323o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0836t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f2321Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f2321Y = 1;
            int i11 = C0840x.f2342e;
            obj = this.f2322Z.m1897a(this.f2323o0, 1, this);
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
