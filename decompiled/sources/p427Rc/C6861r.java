package p427Rc;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0583L;
import p025An.InterfaceC0581K;
import p049Bm.InterfaceC1436k;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p571X9.AbstractC9233X;
import p787he.C14494w;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rc.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C6861r {

    /* JADX INFO: renamed from: a */
    public C0583L f22028a;

    /* JADX INFO: renamed from: b */
    public final C4816c f22029b = AbstractC4817d.m5451a();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7282a(AbstractC19687c abstractC19687c) {
        C6857n c6857n;
        C6861r c6861r;
        C4816c c4816c;
        if (abstractC19687c instanceof C6857n) {
            c6857n = (C6857n) abstractC19687c;
            int i10 = c6857n.f22015q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6857n.f22015q0 = i10 - Integer.MIN_VALUE;
            } else {
                c6857n = new C6857n(this, abstractC19687c);
            }
        } else {
            c6857n = new C6857n(this, abstractC19687c);
        }
        Object obj = c6857n.f22013o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6857n.f22015q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c6857n.f22011Y = this;
            C4816c c4816c2 = this.f22029b;
            c6857n.f22012Z = c4816c2;
            c6857n.f22015q0 = 1;
            if (c4816c2.m5448e(null, c6857n) == enumC19250a) {
                return enumC19250a;
            }
            c6861r = this;
            c4816c = c4816c2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4816c = c6857n.f22012Z;
            c6861r = c6857n.f22011Y;
            AbstractC9233X.m9807c(obj);
        }
        try {
            C0583L c0583l = c6861r.f22028a;
            if (c0583l != null) {
                c0583l.mo1275e(null);
            }
            c6861r.f22028a = null;
            return C17296C.f55119a;
        } finally {
            c4816c.m5450g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r10 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [Bm.k] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Bm.k, he.w] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7283b(C14494w c14494w, AbstractC19687c abstractC19687c) {
        C6860q c6860q;
        C6861r c6861r;
        ?? r6;
        if (abstractC19687c instanceof C6860q) {
            c6860q = (C6860q) abstractC19687c;
            int i10 = c6860q.f22027r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6860q.f22027r0 = i10 - Integer.MIN_VALUE;
            } else {
                c6860q = new C6860q(this, abstractC19687c);
            }
        } else {
            c6860q = new C6860q(this, abstractC19687c);
        }
        Object objM1183l = c6860q.f22025p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6860q.f22027r0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    C4816c c4816c = c6860q.f22024o0;
                    InterfaceC1436k interfaceC1436k = c6860q.f22023Z;
                    c6861r = (C6861r) c6860q.f22022Y;
                    AbstractC9233X.m9807c(objM1183l);
                    r6 = interfaceC1436k;
                    c14494w = c4816c;
                } else if (i11 == 2) {
                    InterfaceC4814a interfaceC4814a = (InterfaceC4814a) c6860q.f22022Y;
                    AbstractC9233X.m9807c(objM1183l);
                    c14494w = interfaceC4814a;
                    interfaceC0581K = (InterfaceC0581K) objM1183l;
                    ((C4816c) c14494w).m5450g(null);
                    c6860q.f22022Y = null;
                    c6860q.f22023Z = null;
                    c6860q.f22024o0 = null;
                    c6860q.f22027r0 = 3;
                    objM1183l = interfaceC0581K.mo1204J0(c6860q);
                    if (objM1183l == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(objM1183l);
                }
                return objM1183l;
            }
            AbstractC9233X.m9807c(objM1183l);
            c6860q.f22022Y = this;
            c6860q.f22023Z = c14494w;
            C4816c c4816c2 = this.f22029b;
            c6860q.f22024o0 = c4816c2;
            c6860q.f22027r0 = 1;
            if (c4816c2.m5448e(null, c6860q) == enumC19250a) {
                return enumC19250a;
            }
            c6861r = this;
            r6 = c14494w;
            c14494w = c4816c2;
            InterfaceC0581K interfaceC0581K = c6861r.f22028a;
            if (interfaceC0581K != null) {
                if (!interfaceC0581K.mo1274a()) {
                    interfaceC0581K = null;
                }
            }
            c6860q.f22022Y = c14494w;
            c6860q.f22023Z = null;
            c6860q.f22024o0 = null;
            c6860q.f22027r0 = 2;
            objM1183l = AbstractC0575H.m1183l(new C6859p(r6, c6861r, null), c6860q);
            c14494w = c14494w;
            if (objM1183l == enumC19250a) {
                return enumC19250a;
            }
            interfaceC0581K = (InterfaceC0581K) objM1183l;
            ((C4816c) c14494w).m5450g(null);
            c6860q.f22022Y = null;
            c6860q.f22023Z = null;
            c6860q.f22024o0 = null;
            c6860q.f22027r0 = 3;
            objM1183l = interfaceC0581K.mo1204J0(c6860q);
            if (objM1183l == enumC19250a) {
                return enumC19250a;
            }
            return objM1183l;
        } catch (Throwable th2) {
            ((C4816c) c14494w).m5450g(null);
            throw th2;
        }
    }
}
