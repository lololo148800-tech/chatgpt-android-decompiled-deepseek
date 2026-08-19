package p787he;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p216Id.C3699g;
import p216Id.InterfaceC3702j;
import p403Qd.C6636i;
import p427Rc.C6861r;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C14495x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45678Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45679Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f45680o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14459O f45681p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14495x(boolean z6, C14459O c14459o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45680o0 = z6;
        this.f45681p0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14495x c14495x = new C14495x(this.f45680o0, this.f45681p0, interfaceC18770c);
        c14495x.f45679Z = obj;
        return c14495x;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14495x) create((C6636i) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45678Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6636i c6636i = (C6636i) this.f45679Z;
            C14459O c14459o = this.f45681p0;
            if (this.f45680o0) {
                C2153Q0 c2153q0 = c14459o.f45522u;
                C3699g c3699g = new C3699g((InterfaceC3702j) c2153q0.getValue(), false, 2);
                c2153q0.getClass();
                c2153q0.m3251l(null, c3699g);
            }
            C6861r c6861r = c14459o.f45525x;
            C14494w c14494w = new C14494w(c14459o, c6636i, null);
            this.f45678Y = 1;
            obj = c6861r.m7283b(c14494w, this);
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
