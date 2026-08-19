package p002A0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0104C extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Object f447Y;

    /* JADX INFO: renamed from: Z */
    public int f448Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0120T f449o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f450p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC17406l f451q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0104C(C0120T c0120t, long j10, InterfaceC17406l interfaceC17406l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f449o0 = c0120t;
        this.f450p0 = j10;
        this.f451q0 = interfaceC17406l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0104C(this.f449o0, this.f450p0, this.f451q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0104C) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C0120T c0120t;
        C17409o c17409o;
        C17409o c17409o2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f448Z;
        InterfaceC17406l interfaceC17406l = this.f451q0;
        C0120T c0120t2 = this.f449o0;
        if (i10 != 0) {
            if (i10 == 1) {
                c0120t = (C0120T) this.f447Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c17409o2 = (C17409o) this.f447Y;
                AbstractC9233X.m9807c(obj);
            }
            c0120t2.f519u = c17409o2;
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C17409o c17409o3 = c0120t2.f519u;
        if (c17409o3 != null) {
            C17408n c17408n = new C17408n(c17409o3);
            this.f447Y = c0120t2;
            this.f448Z = 1;
            if (interfaceC17406l.mo7769c(c17408n, this) == enumC19250a) {
                return enumC19250a;
            }
            c0120t = c0120t2;
        }
        c17409o = new C17409o(this.f450p0);
        this.f447Y = c17409o;
        this.f448Z = 2;
        if (interfaceC17406l.mo7769c(c17409o, this) == enumC19250a) {
            return enumC19250a;
        }
        c17409o2 = c17409o;
        c0120t2.f519u = c17409o2;
        return C17296C.f55119a;
        c0120t.f519u = null;
        c17409o = new C17409o(this.f450p0);
        this.f447Y = c17409o;
        this.f448Z = 2;
        if (interfaceC17406l.mo7769c(c17409o, this) == enumC19250a) {
            return enumC19250a;
        }
        c17409o2 = c17409o;
        c0120t2.f519u = c17409o2;
        return C17296C.f55119a;
    }
}
