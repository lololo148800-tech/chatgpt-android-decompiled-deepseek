package p203I0;

import mm.C17296C;
import p005A3.C0326m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p758g0.C13781p0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C3540A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10719Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0326m f10720Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f10721o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13781p0 f10722p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3540A(C0326m c0326m, float f10, C13781p0 c13781p0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10720Z = c0326m;
        this.f10721o0 = f10;
        this.f10722p0 = c13781p0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3540A(this.f10720Z, this.f10721o0, this.f10722p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3540A) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10719Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13756d c13756d = (C13756d) this.f10720Z.f1141c;
            Float f10 = new Float(this.f10721o0);
            this.f10719Y = 1;
            if (C13756d.m15222c(c13756d, f10, this.f10722p0, null, this, 12) == enumC19250a) {
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
