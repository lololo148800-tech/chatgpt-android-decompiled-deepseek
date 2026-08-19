package p1071w0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p080D0.C1837w0;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C20727P extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65719Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f65720Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC20772r0 f65721o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1837w0 f65722p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20727P(InterfaceC20772r0 interfaceC20772r0, C1837w0 c1837w0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65721o0 = interfaceC20772r0;
        this.f65722p0 = c1837w0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20727P c20727p = new C20727P(this.f65721o0, this.f65722p0, interfaceC18770c);
        c20727p.f65720Z = obj;
        return c20727p;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20727P) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65719Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C20725O c20725o = new C20725O((C19723A) this.f65720Z, this.f65721o0, this.f65722p0, null);
            this.f65719Y = 1;
            if (AbstractC0575H.m1183l(c20725o, this) == enumC19250a) {
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
