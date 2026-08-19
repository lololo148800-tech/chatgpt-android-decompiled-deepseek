package p823j3;

import android.content.Context;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16085g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49812Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f49813Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f49814o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16103y f49815p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16099u f49816q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16085g(Context context, C16103y c16103y, C16099u c16099u, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49814o0 = context;
        this.f49815p0 = c16103y;
        this.f49816q0 = c16099u;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16085g c16085g = new C16085g(this.f49814o0, this.f49815p0, this.f49816q0, interfaceC18770c);
        c16085g.f49813Z = obj;
        return c16085g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16085g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C16082d c16082d;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49812Y;
        Context context = this.f49814o0;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16082d = (C16082d) this.f49813Z;
            try {
                AbstractC9233X.m9807c(obj);
                context.unregisterReceiver(c16082d);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                context.unregisterReceiver(c16082d);
                throw th;
            }
        }
        AbstractC9233X.m9807c(obj);
        C16082d c16082d2 = new C16082d(new C16084f((InterfaceC0571F) this.f49813Z, 0, this.f49816q0));
        context.registerReceiver(c16082d2, C16082d.f49805c);
        try {
            c16082d2.m17647a(context);
            C16103y c16103y = this.f49815p0;
            this.f49813Z = c16082d2;
            this.f49812Y = 1;
            obj = c16103y.invoke(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            c16082d = c16082d2;
            context.unregisterReceiver(c16082d);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            c16082d = c16082d2;
            context.unregisterReceiver(c16082d);
            throw th;
        }
    }
}
