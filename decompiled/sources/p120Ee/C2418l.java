package p120Ee;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p402Qc.C6590f;
import p403Qd.C6636i;
import p571X9.AbstractC9233X;
import p763g5.C13820e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ee.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C2418l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7514Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2423q f7515Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6636i f7516o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2418l(C2423q c2423q, C6636i c6636i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7515Z = c2423q;
        this.f7516o0 = c6636i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2418l(this.f7515Z, this.f7516o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2418l) create((C13820e) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7514Y;
        C6636i c6636i = this.f7516o0;
        C2423q c2423q = this.f7515Z;
        String str = c6636i.f21379a;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                this.f7514Y = 3;
                if (C2423q.m3577b(c2423q, c6636i, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        this.f7514Y = 1;
        if (c2423q.f7536c.m7156T(str, this) == enumC19250a) {
            return enumC19250a;
        }
        C6590f c6590f = new C6590f(c6636i, str);
        this.f7514Y = 2;
        if (c2423q.f7535b.m7157U(c6590f, this) == enumC19250a) {
            return enumC19250a;
        }
        this.f7514Y = 3;
        if (C2423q.m3577b(c2423q, c6636i, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
