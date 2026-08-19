package p1156zj;

import android.content.Context;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p949pj.C18490u;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: zj.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22210z0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f70396Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22107K0 f70397Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22210z0(C22107K0 c22107k0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f70397Z = c22107k0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C22210z0(this.f70397Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C22210z0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f70396Y;
        C22107K0 c22107k0 = this.f70397Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18490u c18490u = C18490u.f58938a;
            Context context = c22107k0.f69875a;
            this.f70396Y = 1;
            if (c18490u.m19883d(context, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        c22107k0.f69887m.getClass();
        return C17296C.f55119a;
    }
}
