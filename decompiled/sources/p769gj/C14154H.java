package p769gj;

import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11104m;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2149O0;
import p523V9.AbstractC8234y0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: gj.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C14154H extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44514Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC11105n f44515Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC11104m f44516o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC2149O0 f44517p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C14155I f44518q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C14183y f44519r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14154H(AbstractC11105n abstractC11105n, EnumC11104m enumC11104m, InterfaceC2149O0 interfaceC2149O0, C14155I c14155i, C14183y c14183y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44515Z = abstractC11105n;
        this.f44516o0 = enumC11104m;
        this.f44517p0 = interfaceC2149O0;
        this.f44518q0 = c14155i;
        this.f44519r0 = c14183y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14155I c14155i = this.f44518q0;
        C14183y c14183y = this.f44519r0;
        return new C14154H(this.f44515Z, this.f44516o0, this.f44517p0, c14155i, c14183y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14154H) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44514Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C14153G c14153g = new C14153G(this.f44517p0, this.f44518q0, this.f44519r0, null);
            this.f44514Y = 1;
            if (AbstractC8234y0.m8873a(this.f44515Z, this.f44516o0, c14153g, this) == enumC19250a) {
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
