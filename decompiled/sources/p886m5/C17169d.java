package p886m5;

import coil.compose.AsyncImagePainter;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p033B5.C0819c;
import p049Bm.InterfaceC1439n;
import p059C5.C1591i;
import p103Dn.AbstractC2124C;
import p129En.C2604o;
import p349O0.C5997d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: m5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17169d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54851Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AsyncImagePainter f54852Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17169d(AsyncImagePainter asyncImagePainter, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54852Z = asyncImagePainter;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17169d(this.f54852Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17169d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54851Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AsyncImagePainter asyncImagePainter = this.f54852Z;
            C2604o c2604oM3227z = AbstractC2124C.m3227z(new C17168c(asyncImagePainter, null), C5997d.m6441a0(new C0819c(asyncImagePainter, 16)));
            C1591i c1591i = new C1591i(asyncImagePainter, 1);
            this.f54851Y = 1;
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
