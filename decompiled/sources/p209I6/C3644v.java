package p209I6;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I6.v */
/* JADX INFO: loaded from: classes.dex */
public final class C3644v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f11113Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3645w f11114Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f11115o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f11116p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16525B f11117q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3644v(C3645w c3645w, C16525B c16525b, C16525B c16525b2, C16525B c16525b3, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11114Z = c3645w;
        this.f11115o0 = c16525b;
        this.f11116p0 = c16525b2;
        this.f11117q0 = c16525b3;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3644v(this.f11114Z, this.f11115o0, this.f11116p0, this.f11117q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3644v) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11113Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            long j10 = this.f11114Z.f11121d;
            this.f11113Y = 1;
            if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C3645w.m4355c(this.f11115o0, this.f11116p0, this.f11117q0);
        return C17296C.f55119a;
    }
}
