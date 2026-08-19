package p949pj;

import mm.C17296C;
import mm.C17312o;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1048uo.AbstractC20405l;
import p178H.C3152j0;
import p468T2.C7224p;
import p544W9.AbstractC8706s;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pj.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C18436I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C3152j0 f58815Y;

    /* JADX INFO: renamed from: Z */
    public int f58816Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3152j0 f58817o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18438K f58818p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18436I(C3152j0 c3152j0, C18438K c18438k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58817o0 = c3152j0;
        this.f58818p0 = c18438k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18436I(this.f58817o0, this.f58818p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18436I) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Dn.v0] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C3152j0 c3152j0;
        Object objM19874h;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r6 = this.f58816Z;
        C17296C c17296c = C17296C.f55119a;
        C18438K c18438k = this.f58818p0;
        try {
            if (r6 != 0) {
                if (r6 == 1) {
                    c3152j0 = this.f58815Y;
                    AbstractC9233X.m9807c(obj);
                    objM19874h = ((C17312o) obj).f55139Y;
                } else {
                    if (r6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
            }
            AbstractC9233X.m9807c(obj);
            c3152j0 = this.f58817o0;
            C7224p c7224pM21073d = AbstractC20405l.m21073d(c3152j0);
            if (c7224pM21073d == null) {
                AbstractC8706s.m9414b(c3152j0, null);
                return c17296c;
            }
            this.f58815Y = c3152j0;
            this.f58816Z = 1;
            objM19874h = C18438K.m19874h(c18438k, c7224pM21073d, this);
            if (objM19874h == enumC19250a) {
                return enumC19250a;
            }
            AbstractC8706s.m9414b(c3152j0, null);
            r6 = c18438k.f58824Y;
            C17312o c17312o = new C17312o(objM19874h);
            this.f58815Y = null;
            this.f58816Z = 2;
            return r6.mo395a(c17312o, this) == enumC19250a ? enumC19250a : c17296c;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC8706s.m9414b(r6, th2);
                throw th3;
            }
        }
    }
}
