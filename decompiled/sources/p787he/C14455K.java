package p787he;

import mm.C17296C;
import p016Ae.C0439a;
import p049Bm.InterfaceC1439n;
import p1155zi.C21941M1;
import p1155zi.C21984a1;
import p174Gk.uSfJ.HpucjswO;
import p381Pe.C6394e;
import p381Pe.C6397h;
import p403Qd.C6636i;
import p479Td.C7351f0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C14455K extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45482Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45483Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7351f0 f45484o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14459O f45485p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14455K(C7351f0 c7351f0, C14459O c14459o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45484o0 = c7351f0;
        this.f45485p0 = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14455K c14455k = new C14455K(this.f45484o0, this.f45485p0, interfaceC18770c);
        c14455k.f45483Z = obj;
        return c14455k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14455K) create((C6636i) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45482Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6636i c6636i = (C6636i) this.f45483Z;
            C6394e c6394e = c6636i.f21399u;
            C7351f0 c7351f0 = this.f45484o0;
            C6397h c6397hM7031g = c6394e.m7031g(new C21984a1(c7351f0.f23286a));
            C14459O c14459o = this.f45485p0;
            if (c6397hM7031g == null) {
                C0439a c0439a = new C0439a(6);
                C21941M1 c21941m1 = new C21941M1(c0439a);
                AbstractC8160o6.m8731f(c14459o.f45519r, "withConversation exception", c0439a, null, 4);
                return c21941m1;
            }
            C6636i c6636iM7163b = c6636i.m7163b(c7351f0, c6636i.f21380b);
            this.f45482Y = 1;
            obj = c14459o.m15989r(c6636iM7163b, true, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException(HpucjswO.wMHWqtustvkFRbB);
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
