package p432Rh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p103Dn.AbstractC2124C;
import p1045ul.AbstractC20384a;
import p1045ul.C20387d;
import p1113xn.AbstractC21322p;
import p221Ii.C3726e;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p364Oh.C6244r;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9248Z2;
import p628Zk.InterfaceC10407f;
import p857kl.C16452T;
import p857kl.C16464l;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rh.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C6906s implements InterfaceC10407f {

    /* JADX INFO: renamed from: Y */
    public final C6907t f22143Y;

    /* JADX INFO: renamed from: Z */
    public final AtomicLong f22144Z = new AtomicLong(0);

    /* JADX INFO: renamed from: o0 */
    public final C4816c f22145o0 = AbstractC4817d.m5451a();

    public C6906s(C6907t c6907t) {
        this.f22143Y = c6907t;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:36:0x009a, B:37:0x00a9, B:39:0x00af, B:41:0x00bc, B:21:0x004b, B:32:0x0086), top: B:50:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [kl.T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kl.T] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p628Zk.InterfaceC10407f
    /* JADX INFO: renamed from: A */
    public final Serializable mo7290A(C16452T c16452t, AbstractC19687c abstractC19687c) throws Throwable {
        C6904q c6904q;
        C6906s c6906s;
        InterfaceC4814a interfaceC4814a;
        ?? r10;
        ?? r6;
        InterfaceC4814a interfaceC4814a2;
        C6906s c6906s2;
        ?? r11;
        ArrayList arrayList;
        if (abstractC19687c instanceof C6904q) {
            c6904q = (C6904q) abstractC19687c;
            int i10 = c6904q.f22136r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6904q.f22136r0 = i10 - Integer.MIN_VALUE;
            } else {
                c6904q = new C6904q(this, abstractC19687c);
            }
        } else {
            c6904q = new C6904q(this, abstractC19687c);
        }
        Object objM3221t = c6904q.f22134p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6904q.f22136r0;
        try {
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        InterfaceC4814a interfaceC4814a3 = c6904q.f22133o0;
                        C16452T c16452t2 = (C16452T) c6904q.f22132Z;
                        c6906s = (C6906s) c6904q.f22131Y;
                        AbstractC9233X.m9807c(objM3221t);
                        interfaceC4814a = interfaceC4814a3;
                        r10 = c16452t2;
                    } else if (i11 == 2) {
                        InterfaceC4814a interfaceC4814a4 = c6904q.f22133o0;
                        C16452T c16452t3 = (C16452T) c6904q.f22132Z;
                        c6906s2 = (C6906s) c6904q.f22131Y;
                        AbstractC9233X.m9807c(objM3221t);
                        r6 = c16452t3;
                        interfaceC4814a2 = interfaceC4814a4;
                        C6907t c6907t = c6906s2.f22143Y;
                        c6904q.f22131Y = r6;
                        c6904q.f22132Z = interfaceC4814a2;
                        c6904q.f22133o0 = null;
                        c6904q.f22136r0 = 3;
                        objM3221t = AbstractC2124C.m3221t(c6907t.f64176f, c6904q);
                        if (objM3221t == enumC19250a) {
                            return enumC19250a;
                        }
                        r11 = r6;
                        c16452t = interfaceC4814a2;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC4814a interfaceC4814a5 = (InterfaceC4814a) c6904q.f22132Z;
                        C16452T c16452t4 = (C16452T) c6904q.f22131Y;
                        AbstractC9233X.m9807c(objM3221t);
                        r11 = c16452t4;
                        c16452t = interfaceC4814a5;
                    }
                    ArrayList arrayListM9822b = AbstractC9248Z2.m9822b((C6244r) objM3221t);
                    arrayList = new ArrayList();
                    for (Object obj : arrayListM9822b) {
                        if (AbstractC9248Z2.m9823c((C16464l) obj, r11)) {
                            arrayList.add(obj);
                        }
                    }
                    ((C4816c) c16452t).m5450g(null);
                    return arrayList;
                }
                AbstractC9233X.m9807c(objM3221t);
                c6904q.f22131Y = this;
                c6904q.f22132Z = c16452t;
                C4816c c4816c = this.f22145o0;
                c6904q.f22133o0 = c4816c;
                c6904q.f22136r0 = 1;
                if (c4816c.m5448e(null, c6904q) == enumC19250a) {
                    return enumC19250a;
                }
                c6906s = this;
                r10 = c16452t;
                interfaceC4814a = c4816c;
                c6904q.f22131Y = c6906s;
                c6904q.f22132Z = r10;
                c6904q.f22133o0 = interfaceC4814a;
                c6904q.f22136r0 = 2;
                if (c6906s.m7292a(c6904q) == enumC19250a) {
                    return enumC19250a;
                }
                r6 = r10;
                interfaceC4814a2 = interfaceC4814a;
                c6906s2 = c6906s;
                C6907t c6907t2 = c6906s2.f22143Y;
                c6904q.f22131Y = r6;
                c6904q.f22132Z = interfaceC4814a2;
                c6904q.f22133o0 = null;
                c6904q.f22136r0 = 3;
                objM3221t = AbstractC2124C.m3221t(c6907t2.f64176f, c6904q);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                r11 = r6;
                c16452t = interfaceC4814a2;
                ArrayList arrayListM9822b2 = AbstractC9248Z2.m9822b((C6244r) objM3221t);
                arrayList = new ArrayList();
                while (r10.hasNext()) {
                    if (AbstractC9248Z2.m9823c((C16464l) obj, r11)) {
                        arrayList.add(obj);
                    }
                }
                ((C4816c) c16452t).m5450g(null);
                return arrayList;
            } catch (Throwable th2) {
                InterfaceC4814a interfaceC4814a6 = interfaceC4814a;
                th = th2;
                c16452t = interfaceC4814a6;
                ((C4816c) c16452t).m5450g(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:30:0x008b, B:32:0x008f, B:34:0x009b, B:35:0x00a0, B:24:0x0069, B:26:0x0071), top: B:40:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:30:0x008b, B:32:0x008f, B:34:0x009b, B:35:0x00a0, B:24:0x0069, B:26:0x0071), top: B:40:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kl.T] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kl.T] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // p628Zk.InterfaceC10407f
    /* JADX INFO: renamed from: K0 */
    public final Object mo7291K0(C16452T c16452t, C16464l c16464l, AbstractC19687c abstractC19687c) {
        C6902o c6902o;
        C6906s c6906s;
        ?? r6;
        C4816c c4816c;
        C6906s c6906s2;
        InterfaceC4814a interfaceC4814a;
        C20387d c20387d;
        long j10;
        if (abstractC19687c instanceof C6902o) {
            c6902o = (C6902o) abstractC19687c;
            int i10 = c6902o.f22127s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6902o.f22127s0 = i10 - Integer.MIN_VALUE;
            } else {
                c6902o = new C6902o(this, abstractC19687c);
            }
        } else {
            c6902o = new C6902o(this, abstractC19687c);
        }
        Object obj = c6902o.f22125q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6902o.f22127s0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    C4816c c4816c2 = c6902o.f22124p0;
                    c16464l = (C16464l) c6902o.f22123o0;
                    C16452T c16452t2 = (C16452T) c6902o.f22122Z;
                    c6906s = c6902o.f22121Y;
                    AbstractC9233X.m9807c(obj);
                    r6 = c16452t2;
                    c4816c = c4816c2;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC4814a interfaceC4814a2 = (InterfaceC4814a) c6902o.f22123o0;
                    c16464l = (C16464l) c6902o.f22122Z;
                    c6906s2 = c6902o.f22121Y;
                    AbstractC9233X.m9807c(obj);
                    interfaceC4814a = interfaceC4814a2;
                }
                c20387d = c16464l.f51074e;
                c16452t = interfaceC4814a;
                if (c20387d != null) {
                    j10 = c20387d.f64480u0;
                    if (c6906s2.f22144Z.get() > j10) {
                        c16452t = interfaceC4814a;
                        c6906s2.f22144Z.set(j10);
                        c16452t = interfaceC4814a;
                    }
                }
                c16452t = interfaceC4814a;
                C17296C c17296c = C17296C.f55119a;
                ((C4816c) c16452t).m5450g(null);
                return c17296c;
            }
            AbstractC9233X.m9807c(obj);
            c6902o.f22121Y = this;
            c6902o.f22122Z = c16452t;
            c6902o.f22123o0 = c16464l;
            C4816c c4816c3 = this.f22145o0;
            c6902o.f22124p0 = c4816c3;
            c6902o.f22127s0 = 1;
            if (c4816c3.m5448e(null, c6902o) == enumC19250a) {
                return enumC19250a;
            }
            c6906s = this;
            r6 = c16452t;
            c4816c = c4816c3;
            c16452t = c4816c;
            if (!AbstractC21322p.m21681O(c16464l.f51070a)) {
                C6907t c6907t = c6906s.f22143Y;
                C6903p c6903p = new C6903p(c16464l, r6, 1);
                c6902o.f22121Y = c6906s;
                c6902o.f22122Z = c16464l;
                c6902o.f22123o0 = c4816c;
                c6902o.f22124p0 = null;
                c6902o.f22127s0 = 2;
                if (c6907t.m21029b(c6903p, c6902o) == enumC19250a) {
                    return enumC19250a;
                }
                c6906s2 = c6906s;
                interfaceC4814a = c4816c;
                c20387d = c16464l.f51074e;
                c16452t = interfaceC4814a;
                if (c20387d != null) {
                    j10 = c20387d.f64480u0;
                    if (c6906s2.f22144Z.get() > j10) {
                        c16452t = interfaceC4814a;
                        c6906s2.f22144Z.set(j10);
                        c16452t = interfaceC4814a;
                    }
                }
            }
            c16452t = interfaceC4814a;
            C17296C c17296c2 = C17296C.f55119a;
            ((C4816c) c16452t).m5450g(null);
            return c17296c2;
        } catch (Throwable th2) {
            ((C4816c) c16452t).m5450g(null);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m7292a(AbstractC19687c abstractC19687c) {
        C20387d c20387dM21048b = AbstractC20384a.m21048b();
        long j10 = this.f22144Z.get();
        long j11 = c20387dM21048b.f64480u0;
        C17296C c17296c = C17296C.f55119a;
        if (j11 >= j10) {
            Object objM21029b = this.f22143Y.m21029b(new C3726e(this, j11, 1), abstractC19687c);
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            if (objM21029b != enumC19250a) {
                objM21029b = c17296c;
            }
            if (objM21029b == enumC19250a) {
                return objM21029b;
            }
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:36:0x009a, B:37:0x00a4, B:39:0x00aa, B:43:0x00bb, B:21:0x004b, B:32:0x0086), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: e */
    public final Object m7293e(String str, AbstractC19687c abstractC19687c) throws Throwable {
        C6905r c6905r;
        C6906s c6906s;
        InterfaceC4814a interfaceC4814a;
        ?? r10;
        ?? r6;
        InterfaceC4814a interfaceC4814a2;
        C6906s c6906s2;
        ?? r11;
        Iterator it;
        Object next;
        if (abstractC19687c instanceof C6905r) {
            c6905r = (C6905r) abstractC19687c;
            int i10 = c6905r.f22142r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6905r.f22142r0 = i10 - Integer.MIN_VALUE;
            } else {
                c6905r = new C6905r(this, abstractC19687c);
            }
        } else {
            c6905r = new C6905r(this, abstractC19687c);
        }
        Object objM3221t = c6905r.f22140p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6905r.f22142r0;
        try {
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        InterfaceC4814a interfaceC4814a3 = c6905r.f22139o0;
                        String str2 = (String) c6905r.f22138Z;
                        c6906s = (C6906s) c6905r.f22137Y;
                        AbstractC9233X.m9807c(objM3221t);
                        interfaceC4814a = interfaceC4814a3;
                        r10 = str2;
                    } else if (i11 == 2) {
                        InterfaceC4814a interfaceC4814a4 = c6905r.f22139o0;
                        String str3 = (String) c6905r.f22138Z;
                        c6906s2 = (C6906s) c6905r.f22137Y;
                        AbstractC9233X.m9807c(objM3221t);
                        r6 = str3;
                        interfaceC4814a2 = interfaceC4814a4;
                        C6907t c6907t = c6906s2.f22143Y;
                        c6905r.f22137Y = r6;
                        c6905r.f22138Z = interfaceC4814a2;
                        c6905r.f22139o0 = null;
                        c6905r.f22142r0 = 3;
                        objM3221t = AbstractC2124C.m3221t(c6907t.f64176f, c6905r);
                        if (objM3221t == enumC19250a) {
                            return enumC19250a;
                        }
                        r11 = r6;
                        str = interfaceC4814a2;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC4814a interfaceC4814a5 = (InterfaceC4814a) c6905r.f22138Z;
                        String str4 = (String) c6905r.f22137Y;
                        AbstractC9233X.m9807c(objM3221t);
                        r11 = str4;
                        str = interfaceC4814a5;
                    }
                    it = AbstractC9248Z2.m9822b((C6244r) objM3221t).iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC16544l.m18089b(((C16464l) next).f51070a, r11));
                    C16464l c16464l = (C16464l) next;
                    ((C4816c) str).m5450g(null);
                    return c16464l;
                }
                AbstractC9233X.m9807c(objM3221t);
                c6905r.f22137Y = this;
                c6905r.f22138Z = str;
                C4816c c4816c = this.f22145o0;
                c6905r.f22139o0 = c4816c;
                c6905r.f22142r0 = 1;
                if (c4816c.m5448e(null, c6905r) == enumC19250a) {
                    return enumC19250a;
                }
                c6906s = this;
                r10 = str;
                interfaceC4814a = c4816c;
                c6905r.f22137Y = c6906s;
                c6905r.f22138Z = r10;
                c6905r.f22139o0 = interfaceC4814a;
                c6905r.f22142r0 = 2;
                if (c6906s.m7292a(c6905r) == enumC19250a) {
                    return enumC19250a;
                }
                r6 = r10;
                interfaceC4814a2 = interfaceC4814a;
                c6906s2 = c6906s;
                C6907t c6907t2 = c6906s2.f22143Y;
                c6905r.f22137Y = r6;
                c6905r.f22138Z = interfaceC4814a2;
                c6905r.f22139o0 = null;
                c6905r.f22142r0 = 3;
                objM3221t = AbstractC2124C.m3221t(c6907t2.f64176f, c6905r);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                r11 = r6;
                str = interfaceC4814a2;
                it = AbstractC9248Z2.m9822b((C6244r) objM3221t).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC16544l.m18089b(((C16464l) next).f51070a, r11));
                C16464l c16464l2 = (C16464l) next;
                ((C4816c) str).m5450g(null);
                return c16464l2;
            } catch (Throwable th2) {
                InterfaceC4814a interfaceC4814a6 = interfaceC4814a;
                th = th2;
                str = interfaceC4814a6;
                ((C4816c) str).m5450g(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
