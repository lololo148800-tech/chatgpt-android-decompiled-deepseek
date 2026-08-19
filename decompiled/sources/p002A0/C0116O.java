package p002A0;

import mm.C17296C;
import p001A.C0095w0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0116O extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f484Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19723A f485Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0120T f486o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f487p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0116O(C0120T c0120t, InterfaceC18770c interfaceC18770c, C19723A c19723a, boolean z6) {
        super(2, interfaceC18770c);
        this.f485Z = c19723a;
        this.f486o0 = c0120t;
        this.f487p0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        boolean z6 = this.f487p0;
        return new C0116O(this.f486o0, interfaceC18770c, this.f485Z, z6);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0116O) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f484Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C0120T c0120t = this.f486o0;
            C0095w0 c0095w0 = new C0095w0(c0120t, this.f487p0, 1);
            C0112K c0112k = new C0112K(c0120t, 2);
            this.f484Y = 1;
            Object objM9428b = AbstractC8717t4.m9428b(this.f485Z, new C0125b(c0095w0, c0112k, null), this);
            if (objM9428b != enumC19250a) {
                objM9428b = c17296c;
            }
            if (objM9428b == enumC19250a) {
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
