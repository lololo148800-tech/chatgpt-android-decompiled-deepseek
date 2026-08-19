package p1071w0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1013t0.C19715c;
import p204I1.C3578I;
import p204I1.C3581L;
import p350O1.C6045C;
import p350O1.InterfaceC6073v;
import p571X9.AbstractC9233X;
import p759g1.C13801c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C20711H extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65653Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19715c f65654Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6045C f65655o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20750g0 f65656p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C20710G0 f65657q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC6073v f65658r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20711H(C19715c c19715c, C6045C c6045c, C20750g0 c20750g0, C20710G0 c20710g0, InterfaceC6073v interfaceC6073v, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65654Z = c19715c;
        this.f65655o0 = c6045c;
        this.f65656p0 = c20750g0;
        this.f65657q0 = c20710g0;
        this.f65658r0 = interfaceC6073v;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20711H(this.f65654Z, this.f65655o0, this.f65656p0, this.f65657q0, this.f65658r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20711H) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C13801c c13801c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65653Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C20770q0 c20770q0 = this.f65656p0.f65810a;
            C3578I c3578i = this.f65657q0.f65650a;
            this.f65653Y = 1;
            int iMo1766b = this.f65658r0.mo1766b(C3581L.m4269e(this.f65655o0.f19683b));
            if (iMo1766b < c3578i.f10892a.f10882a.f10934Y.length()) {
                c13801c = c3578i.m4252b(iMo1766b);
            } else if (iMo1766b != 0) {
                c13801c = c3578i.m4252b(iMo1766b - 1);
            } else {
                c13801c = new C13801c(0.0f, 0.0f, 1.0f, (int) (AbstractC20778u0.m21304a(c20770q0.f65944b, c20770q0.f65949g, c20770q0.f65950h, AbstractC20778u0.f65985a, 1) & 4294967295L));
            }
            Object objM20665a = this.f65654Z.m20665a(c13801c, this);
            if (objM20665a != enumC19250a) {
                objM20665a = c17296c;
            }
            if (objM20665a == enumC19250a) {
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
