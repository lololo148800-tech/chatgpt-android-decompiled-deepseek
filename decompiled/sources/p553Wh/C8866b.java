package p553Wh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p229J0.C3952M3;
import p229J0.EnumC3898D3;
import p537W0.C8410b;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8866b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f27133Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f27134Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8870f f27135o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC3898D3 f27136p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C8410b f27137q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8866b(boolean z6, C8870f c8870f, EnumC3898D3 enumC3898D3, C8410b c8410b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27134Z = z6;
        this.f27135o0 = c8870f;
        this.f27136p0 = enumC3898D3;
        this.f27137q0 = c8410b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8866b(this.f27134Z, this.f27135o0, this.f27136p0, this.f27137q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8866b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f27133Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            boolean z6 = this.f27134Z;
            C8870f c8870f = this.f27135o0;
            C3952M3 c3952m3 = z6 ? c8870f.f27151d : c8870f.f27150c;
            C8872h c8872h = new C8872h(this.f27136p0, this.f27137q0);
            this.f27133Y = 1;
            if (c3952m3.m4658a(c8872h, this) == enumC19250a) {
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
