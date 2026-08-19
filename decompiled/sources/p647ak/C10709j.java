package p647ak;

import java.io.File;
import mm.C17296C;
import mm.C17311n;
import mm.C17312o;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8170q0;
import p571X9.AbstractC9233X;
import p949pj.C18444Q;
import p949pj.InterfaceC18483p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ak.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C10709j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f31821Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10713l f31822Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC8170q0 f31823o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10652K0 f31824p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10709j(C10713l c10713l, AbstractC8170q0 abstractC8170q0, C10652K0 c10652k0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31822Z = c10713l;
        this.f31823o0 = abstractC8170q0;
        this.f31824p0 = c10652k0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10709j(this.f31822Z, this.f31823o0, this.f31824p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10709j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objMo224r;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f31821Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC18483p interfaceC18483p = this.f31822Z.f31834b;
            this.f31821Y = 1;
            objMo224r = interfaceC18483p.mo224r(this);
            if (objMo224r == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            objMo224r = ((C17312o) obj).f55139Y;
        }
        if (!(objMo224r instanceof C17311n)) {
            ((C10636C0) this.f31823o0).f31556a.invoke((File) objMo224r);
        }
        Throwable thM18979a = C17312o.m18979a(objMo224r);
        if (thM18979a != null && !(thM18979a instanceof C18444Q)) {
            this.f31824p0.f31620k.invoke(thM18979a);
        }
        return C17296C.f55119a;
    }
}
