package p1071w0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p080D0.C1776J;
import p1014t1.C19723A;
import p1062vd.C20567q;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16750j0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20758k0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65890Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19723A f65891Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC20772r0 f65892o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20758k0(C19723A c19723a, InterfaceC20772r0 interfaceC20772r0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65891Z = c19723a;
        this.f65892o0 = interfaceC20772r0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20758k0(this.f65891Z, this.f65892o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20758k0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65890Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f65890Y = 1;
            InterfaceC20772r0 interfaceC20772r0 = this.f65892o0;
            Object objM18523g = AbstractC16750j0.m18523g(this.f65891Z, new C1776J(interfaceC20772r0, 3), new C20762m0(interfaceC20772r0, 0), new C20762m0(interfaceC20772r0, 1), new C20567q(interfaceC20772r0, 3), this);
            if (objM18523g != enumC19250a) {
                objM18523g = c17296c;
            }
            if (objM18523g == enumC19250a) {
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
