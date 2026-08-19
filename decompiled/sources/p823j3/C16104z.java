package p823j3;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.z */
/* JADX INFO: loaded from: classes.dex */
public final class C16104z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49880Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f49881Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SessionWorker f49882o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16104z(SessionWorker sessionWorker, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49882o0 = sessionWorker;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16104z c16104z = new C16104z(this.f49882o0, interfaceC18770c);
        c16104z.f49881Z = obj;
        return c16104z;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16104z) create((C16075N) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49880Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16075N c16075n = (C16075N) this.f49881Z;
            SessionWorker sessionWorker = this.f49882o0;
            Context context = sessionWorker.f22416Y;
            C16099u c16099u = new C16099u(sessionWorker, c16075n, null);
            C16103y c16103y = new C16103y(sessionWorker, c16075n, null);
            this.f49880Y = 1;
            obj = AbstractC0575H.m1183l(new C16085g(context, c16103y, c16099u, null), this);
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
