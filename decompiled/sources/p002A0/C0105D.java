package p002A0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p860l0.C16685J0;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.C17410p;
import p894n0.InterfaceC17405k;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0105D extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f452Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f453Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16685J0 f454o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0120T f455p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f456q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC17406l f457r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0105D(C16685J0 c16685j0, C0120T c0120t, long j10, InterfaceC17406l interfaceC17406l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f454o0 = c16685j0;
        this.f455p0 = c0120t;
        this.f456q0 = j10;
        this.f457r0 = interfaceC17406l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C0105D c0105d = new C0105D(this.f454o0, this.f455p0, this.f456q0, this.f457r0, interfaceC18770c);
        c0105d.f453Z = obj;
        return c0105d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0105D) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f452Y;
        C0120T c0120t = this.f455p0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            c0120t.f519u = null;
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        AbstractC0575H.m1156D((InterfaceC0571F) this.f453Z, null, null, new C0104C(this.f455p0, this.f456q0, this.f457r0, null), 3);
        this.f452Y = 1;
        obj = this.f454o0.m18503c(this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C17409o c17409o = c0120t.f519u;
        if (c17409o != null) {
            InterfaceC17405k c17410p = zBooleanValue ? new C17410p(c17409o) : new C17408n(c17409o);
            this.f452Y = 2;
            if (this.f457r0.mo7769c(c17410p, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        c0120t.f519u = null;
        return C17296C.f55119a;
    }
}
