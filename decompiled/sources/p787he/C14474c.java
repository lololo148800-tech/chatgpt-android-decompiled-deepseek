package p787he;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p216Id.C3699g;
import p403Qd.C6636i;
import p523V9.AbstractC8040Z5;
import p571X9.AbstractC9233X;
import p925oe.C18077B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14474c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45594Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45595Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14459O f45596o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14474c(C14459O c14459o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45596o0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14474c c14474c = new C14474c(this.f45596o0, interfaceC18770c);
        c14474c.f45595Z = obj;
        return c14474c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14474c) create((C6636i) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45594Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6636i c6636i = (C6636i) this.f45595Z;
            C14459O c14459o = this.f45596o0;
            C2153Q0 c2153q0 = c14459o.f45522u;
            C3699g c3699g = new C3699g(null, true, 1);
            c2153q0.getClass();
            c2153q0.m3251l(null, c3699g);
            C18077B c18077b = c14459o.f45503b;
            this.f45594Y = 1;
            obj = AbstractC8040Z5.m8405a(c18077b, c6636i, true, this);
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
