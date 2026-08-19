package p283L5;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p026Ao.C0675i;
import p049Bm.InterfaceC1439n;
import p111E5.C2332p;
import p111E5.C2335s;
import p111E5.EnumC2324h;
import p135F5.C2671g;
import p160G5.C3003i;
import p354O5.C6135e;
import p544W9.AbstractC8453B3;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C4948n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f16131Y;

    /* JADX INFO: renamed from: Z */
    public int f16132Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f16133o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f16134p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4951q f16135q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16525B f16136r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C4954t f16137s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4948n(C16525B c16525b, C4951q c4951q, C16525B c16525b2, C4954t c4954t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f16134p0 = c16525b;
        this.f16135q0 = c4951q;
        this.f16136r0 = c16525b2;
        this.f16137s0 = c4954t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4948n c4948n = new C4948n(this.f16134p0, this.f16135q0, this.f16136r0, this.f16137s0, interfaceC18770c);
        c4948n.f16133o0 = obj;
        return c4948n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4948n) create((C4955u) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C4955u c4955u;
        C16525B c16525b;
        C4955u c4955u2;
        C4953s c4953s;
        C0675i c0675i;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f16132Z;
        C4951q c4951q = this.f16135q0;
        String strM5601a = null;
        C16525B c16525b2 = this.f16136r0;
        C16525B c16525b3 = this.f16134p0;
        if (i10 != 0) {
            if (i10 == 1) {
                c16525b = this.f16131Y;
                c4955u = (C4955u) this.f16133o0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4955u2 = (C4955u) this.f16133o0;
                AbstractC9233X.m9807c(obj);
            }
            c0675i = (C0675i) obj;
            if (c0675i.f1970Z > 0) {
                return new C3003i(new C2335s(c0675i, c4951q.m5596e(), null), C4951q.m5594f(c4951q.f16149a, c4955u2.f16164d.m5601a()), EnumC2324h.f7227p0);
            }
            return null;
        }
        AbstractC9233X.m9807c(obj);
        C4955u c4955u3 = (C4955u) this.f16133o0;
        C2671g c2671g = (C2671g) c16525b3.f51262Y;
        C4955u c4955u4 = (C4955u) c16525b2.f51262Y;
        this.f16133o0 = c4955u3;
        this.f16131Y = c16525b3;
        this.f16132Z = 1;
        Object objM5593c = C4951q.m5593c(c4951q, c2671g, c4955u4, c4955u3, this);
        if (objM5593c == enumC19250a) {
            return enumC19250a;
        }
        c4955u = c4955u3;
        obj = objM5593c;
        c16525b = c16525b3;
        c16525b.f51262Y = obj;
        Object obj2 = c16525b3.f51262Y;
        if (obj2 != null) {
            c16525b2.f51262Y = c4951q.m5599i((C2671g) obj2);
            Object obj3 = c16525b3.f51262Y;
            AbstractC16544l.m18091d(obj3);
            C2332p c2332pM5598h = c4951q.m5598h((C2671g) obj3);
            String str = c4951q.f16149a;
            C4955u c4955u5 = (C4955u) c16525b2.f51262Y;
            if (c4955u5 != null && (c4953s = c4955u5.f16164d) != null) {
                strM5601a = c4953s.m5601a();
            }
            return new C3003i(c2332pM5598h, C4951q.m5594f(str, strM5601a), EnumC2324h.f7227p0);
        }
        C6135e c6135e = c4955u.f16165e;
        if (c6135e == null) {
            throw new IllegalStateException("body == null");
        }
        this.f16133o0 = c4955u;
        this.f16131Y = null;
        this.f16132Z = 2;
        obj = AbstractC8453B3.m9065b(c6135e, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        c4955u2 = c4955u;
        c0675i = (C0675i) obj;
        if (c0675i.f1970Z > 0) {
            return new C3003i(new C2335s(c0675i, c4951q.m5596e(), null), C4951q.m5594f(c4951q.f16149a, c4955u2.f16164d.m5601a()), EnumC2324h.f7227p0);
        }
        return null;
    }
}
