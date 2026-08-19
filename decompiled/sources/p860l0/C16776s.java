package p860l0;

import androidx.compose.foundation.gestures.AbstractC10840a;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C16776s extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f53835Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16782u f53836Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f53837o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f53838p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16776s(C16782u c16782u, Object obj, InterfaceC1441p interfaceC1441p, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f53836Z = c16782u;
        this.f53837o0 = obj;
        this.f53838p0 = (AbstractC19694j) interfaceC1441p;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.p, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C16776s(this.f53836Z, this.f53837o0, this.f53838p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C16776s) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Bm.p, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53835Y;
        Object obj2 = this.f53837o0;
        C16782u c16782u = this.f53836Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            c16782u.f53870l.setValue(obj2);
            C16761n c16761n = new C16761n(c16782u, 1);
            C16773r c16773r = new C16773r(this.f53838p0, c16782u, null);
            this.f53835Y = 1;
            if (AbstractC10840a.m11216b(c16761n, c16773r, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        if (((Boolean) c16782u.f53863e.invoke(obj2)).booleanValue()) {
            c16782u.f53872n.m18544a(c16782u.m18548b().m18495e(obj2), c16782u.f53869k.m6409g());
            c16782u.f53866h.setValue(obj2);
            c16782u.m18551e(obj2);
        }
        return C17296C.f55119a;
    }
}
