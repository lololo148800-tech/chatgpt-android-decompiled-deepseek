package p094De;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1439n;
import p1130yi.AbstractC21544c;
import p1130yi.EnumC21542a;
import p120Ee.C2413g;
import p120Ee.C2423q;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p313Mc.C5317a;
import p403Qd.C6636i;
import p403Qd.EnumC6603I;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: De.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2023f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C2029l f6204Y;

    /* JADX INFO: renamed from: Z */
    public int f6205Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f6206o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2029l f6207p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2023f(C2029l c2029l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6207p0 = c2029l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2023f c2023f = new C2023f(this.f6207p0, interfaceC18770c);
        c2023f.f6206o0 = obj;
        return c2023f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2023f) create((C6636i) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5317a c5317aM5877a;
        Object objM1168P;
        C2029l c2029l;
        C5317a c5317a;
        Throwable th2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6205Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6636i c6636i = (C6636i) this.f6206o0;
            if ((c6636i != null ? c6636i.f21396r : null) == EnumC6603I.f21318Y) {
                C6636i c6636iM7162a = C6636i.m7162a(c6636i, null, null, null, null, null, null, null, null, null, null, null, EnumC6603I.f21319Z, false, null, null, 1966079);
                C2029l c2029l2 = this.f6207p0;
                C2029l.m3172a(c2029l2, c6636iM7162a);
                c5317aM5877a = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68238q0, null);
                try {
                    c5317aM5877a.m5876b();
                    C2423q c2423q = c2029l2.f6228a;
                    this.f6206o0 = c5317aM5877a;
                    this.f6204Y = c2029l2;
                    this.f6205Z = 1;
                    C3516e c3516e = AbstractC0593T.f1824a;
                    objM1168P = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C2413g(c2423q, c6636i, null), this);
                    if (objM1168P == enumC19250a) {
                        return enumC19250a;
                    }
                    c2029l = c2029l2;
                } catch (Throwable th3) {
                    th2 = th3;
                    c5317a = c5317aM5877a;
                    c5317a.m5875a();
                    throw th2;
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c2029l = this.f6204Y;
        c5317a = (C5317a) this.f6206o0;
        try {
            AbstractC9233X.m9807c(obj);
            c5317aM5877a = c5317a;
            objM1168P = obj;
        } catch (Throwable th4) {
            th2 = th4;
            c5317a.m5875a();
            throw th2;
        }
        C2029l.m3172a(c2029l, (C6636i) objM1168P);
        c5317aM5877a.m5875a();
        return C17296C.f55119a;
    }
}
