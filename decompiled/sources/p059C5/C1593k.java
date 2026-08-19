package p059C5;

import coil3.compose.AsyncImagePainter;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p129En.C2604o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: C5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1593k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4468Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AsyncImagePainter f4469Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593k(AsyncImagePainter asyncImagePainter, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4469Z = asyncImagePainter;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1593k(this.f4469Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1593k) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4468Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AsyncImagePainter asyncImagePainter = this.f4469Z;
            C2604o c2604oM3227z = AbstractC2124C.m3227z(new C1590h(asyncImagePainter, null), AbstractC2124C.m3201E(asyncImagePainter.f35908s0, new C1592j((InterfaceC18770c) null, asyncImagePainter, 0)));
            C1591i c1591i = new C1591i(asyncImagePainter, 0);
            this.f4468Y = 1;
            if (c2604oM3227z.mo3141d(c1591i, this) == enumC19250a) {
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
