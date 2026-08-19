package p120Ee;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p403Qd.C6636i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ee.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2413g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7492Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2423q f7493Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6636i f7494o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2413g(C2423q c2423q, C6636i c6636i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7493Z = c2423q;
        this.f7494o0 = c6636i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2413g(this.f7493Z, this.f7494o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2413g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7492Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f7492Y = 1;
            obj = C2423q.m3576a(this.f7493Z, this.f7494o0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
