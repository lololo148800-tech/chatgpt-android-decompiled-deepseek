package p769gj;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2149O0;
import p571X9.AbstractC9233X;
import p729ej.C13435z;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: gj.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C14153G extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44510Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2149O0 f44511Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14155I f44512o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14183y f44513p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14153G(InterfaceC2149O0 interfaceC2149O0, C14155I c14155i, C14183y c14183y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44511Z = interfaceC2149O0;
        this.f44512o0 = c14155i;
        this.f44513p0 = c14183y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14153G(this.f44511Z, this.f44512o0, this.f44513p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14153G) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44510Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13435z c13435z = new C13435z(this.f44512o0, 1, this.f44513p0);
            this.f44510Y = 1;
            if (this.f44511Z.mo3141d(c13435z, this) == enumC19250a) {
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
