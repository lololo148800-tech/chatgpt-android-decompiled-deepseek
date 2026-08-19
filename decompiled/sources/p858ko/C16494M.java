package p858ko;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21690f;
import p492U1.C7550o;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ko.M */
/* JADX INFO: loaded from: classes2.dex */
public final class C16494M extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f51166Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16495N f51167Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f51168o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16494M(C16495N c16495n, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f51167Z = c16495n;
        this.f51168o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16494M(this.f51167Z, this.f51168o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16494M) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f51166Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16495N c16495n = this.f51167Z;
            if (!c16495n.f51169B0.m18058k()) {
                C16484C c16484c = c16495n.f51169B0;
                InterfaceC7537b interfaceC7537b = AbstractC21690f.m22217v(c16495n).f68633D0;
                this.f51166Y = 2;
                c16484c.getClass();
                long j10 = this.f51168o0;
                float fM7902c = C7550o.m7902c(j10);
                if (!Float.isInfinite(fM7902c) && !Float.isNaN(fM7902c)) {
                    float fM7903d = C7550o.m7903d(j10);
                    if (!Float.isInfinite(fM7903d) && !Float.isNaN(fM7903d)) {
                        C16501d c16501dM18049b = c16484c.m18049b();
                        if (c16501dM18049b == null) {
                            throw new IllegalStateException(("called too early? " + (!c16484c.m18057j())).toString());
                        }
                        Object objM12542I0 = c16484c.f51149p.m12542I0(EnumC14284g0.f44821Y, new C16519v(c16501dM18049b, j10, interfaceC7537b, c16484c, null), this);
                        if (objM12542I0 != enumC19250a) {
                            objM12542I0 = c17296c;
                        }
                        if (objM12542I0 == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
                throw new IllegalStateException(AbstractC9306j0.m9889h("Invalid velocity = ", C7550o.m7907h(j10)).toString());
            }
            c16495n.f51171D0.m16689b();
            C16484C c16484c2 = c16495n.f51169B0;
            this.f51166Y = 1;
            if (c16484c2.m18048a(this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
