package p823j3;

import androidx.glance.session.SessionWorker;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p672c3.C11617m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.w */
/* JADX INFO: loaded from: classes.dex */
public final class C16101w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49871Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SessionWorker f49872Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11617m f49873o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16101w(SessionWorker sessionWorker, C11617m c11617m, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49872Z = sessionWorker;
        this.f49873o0 = c11617m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16101w(this.f49872Z, this.f49873o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16101w) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49871Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC16091m interfaceC16091m = this.f49872Z.f33346u0;
            C16100v c16100v = new C16100v(this.f49873o0, null);
            this.f49871Y = 1;
            if (((C16096r) interfaceC16091m).m17652a(c16100v, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
