package p860l0;

import androidx.compose.foundation.gestures.AbstractC10840a;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p059C5.C1592j;
import p349O0.C5994b0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C16767p extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f53802Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16782u f53803Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1592j f53804o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16767p(C1592j c1592j, C16782u c16782u, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f53803Z = c16782u;
        this.f53804o0 = c1592j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C16767p(this.f53804o0, this.f53803Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C16767p) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53802Y;
        C16782u c16782u = this.f53803Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16761n c16761n = new C16761n(c16782u, 0);
            C16764o c16764o = new C16764o(this.f53804o0, c16782u, null);
            this.f53802Y = 1;
            if (AbstractC10840a.m11216b(c16761n, c16764o, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C16670E0 c16670e0M18548b = c16782u.m18548b();
        C5994b0 c5994b0 = c16782u.f53868j;
        Object objM18491a = c16670e0M18548b.m18491a(c5994b0.m6409g());
        if (objM18491a != null) {
            if (Math.abs(c5994b0.m6409g() - c16782u.m18548b().m18495e(objM18491a)) < 0.5f && ((Boolean) c16782u.f53863e.invoke(objM18491a)).booleanValue()) {
                c16782u.f53866h.setValue(objM18491a);
                c16782u.m18551e(objM18491a);
            }
        }
        return C17296C.f55119a;
    }
}
