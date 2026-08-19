package p823j3;

import android.content.Context;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p672c3.C11617m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.H */
/* JADX INFO: loaded from: classes.dex */
public final class C16069H extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49759Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11617m f49760Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f49761o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Throwable f49762p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16075N f49763q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16069H(C11617m c11617m, Context context, Throwable th2, C16075N c16075n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49760Z = c11617m;
        this.f49761o0 = context;
        this.f49762p0 = th2;
        this.f49763q0 = c16075n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16069H(this.f49760Z, this.f49761o0, this.f49762p0, this.f49763q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16069H) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49759Y;
        C17296C c17296c = C17296C.f55119a;
        Throwable th2 = this.f49762p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f49759Y = 1;
            this.f49760Z.m12990a(this.f49761o0, th2);
            if (c17296c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC0575H.m1180i(this.f49763q0, AbstractC0575H.m1172a("Error in composition effect coroutine", th2));
        return c17296c;
    }
}
