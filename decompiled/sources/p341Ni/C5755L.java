package p341Ni;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17314q;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1081wc.C20862H;
import p1130yi.AbstractC21544c;
import p1130yi.EnumC21542a;
import p1155zi.EnumC22033m2;
import p172Gi.C3074g;
import p172Gi.C3092y;
import p313Mc.C5317a;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p365Oi.C6256d;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5755L extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Object f18724Y;

    /* JADX INFO: renamed from: Z */
    public Object f18725Z;

    /* JADX INFO: renamed from: o0 */
    public C5317a f18726o0;

    /* JADX INFO: renamed from: p0 */
    public C5317a f18727p0;

    /* JADX INFO: renamed from: q0 */
    public int f18728q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C5317a f18729r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C5784h0 f18730s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C5792l0 f18731t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ String f18732u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ String f18733v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5755L(C5317a c5317a, C5784h0 c5784h0, C5792l0 c5792l0, String str, String str2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18729r0 = c5317a;
        this.f18730s0 = c5784h0;
        this.f18731t0 = c5792l0;
        this.f18732u0 = str;
        this.f18733v0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5755L(this.f18729r0, this.f18730s0, this.f18731t0, this.f18732u0, this.f18733v0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5755L) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x0059, B:27:0x0094, B:29:0x009a, B:32:0x00c0, B:33:0x00c5, B:37:0x00d7, B:41:0x00e4, B:40:0x00dc, B:55:0x0127, B:57:0x012b, B:59:0x0135, B:60:0x013c, B:62:0x014c, B:82:0x01bd, B:83:0x01c2), top: B:89:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x0059, B:27:0x0094, B:29:0x009a, B:32:0x00c0, B:33:0x00c5, B:37:0x00d7, B:41:0x00e4, B:40:0x00dc, B:55:0x0127, B:57:0x012b, B:59:0x0135, B:60:0x013c, B:62:0x014c, B:82:0x01bd, B:83:0x01c2), top: B:89:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x0059, B:27:0x0094, B:29:0x009a, B:32:0x00c0, B:33:0x00c5, B:37:0x00d7, B:41:0x00e4, B:40:0x00dc, B:55:0x0127, B:57:0x012b, B:59:0x0135, B:60:0x013c, B:62:0x014c, B:82:0x01bd, B:83:0x01c2), top: B:89:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x0059, B:27:0x0094, B:29:0x009a, B:32:0x00c0, B:33:0x00c5, B:37:0x00d7, B:41:0x00e4, B:40:0x00dc, B:55:0x0127, B:57:0x012b, B:59:0x0135, B:60:0x013c, B:62:0x014c, B:82:0x01bd, B:83:0x01c2), top: B:89:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x0059, B:27:0x0094, B:29:0x009a, B:32:0x00c0, B:33:0x00c5, B:37:0x00d7, B:41:0x00e4, B:40:0x00dc, B:55:0x0127, B:57:0x012b, B:59:0x0135, B:60:0x013c, B:62:0x014c, B:82:0x01bd, B:83:0x01c2), top: B:89:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0135 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x0059, B:27:0x0094, B:29:0x009a, B:32:0x00c0, B:33:0x00c5, B:37:0x00d7, B:41:0x00e4, B:40:0x00dc, B:55:0x0127, B:57:0x012b, B:59:0x0135, B:60:0x013c, B:62:0x014c, B:82:0x01bd, B:83:0x01c2), top: B:89:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x014c A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x0059, B:27:0x0094, B:29:0x009a, B:32:0x00c0, B:33:0x00c5, B:37:0x00d7, B:41:0x00e4, B:40:0x00dc, B:55:0x0127, B:57:0x012b, B:59:0x0135, B:60:0x013c, B:62:0x014c, B:82:0x01bd, B:83:0x01c2), top: B:89:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x016c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x018f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01bd A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x0059, B:27:0x0094, B:29:0x009a, B:32:0x00c0, B:33:0x00c5, B:37:0x00d7, B:41:0x00e4, B:40:0x00dc, B:55:0x0127, B:57:0x012b, B:59:0x0135, B:60:0x013c, B:62:0x014c, B:82:0x01bd, B:83:0x01c2), top: B:89:0x0059 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x009a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [Mc.a] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [Mc.a] */
    /* JADX WARN: Type inference failed for: r3v22, types: [Mc.a] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v26 */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r6;
        Object objM6168b;
        C5317a c5317a;
        C5784h0 c5784h0;
        ?? r10;
        C5317a c5317a2;
        AbstractC6224C abstractC6224C;
        C5317a c5317a3;
        C5788j0 c5788j0;
        C5788j0 c5788j1;
        C3092y c3092y;
        C6256d c6256d;
        boolean z6;
        C5317a c5317aM5877a;
        C5317a c5317a4;
        String str;
        String str2;
        String str3;
        ?? r11;
        ?? r12;
        Object objM3222u;
        int i10;
        Object objM6187a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f18728q0;
        C17296C c17296c = C17296C.f55119a;
        C5784h0 c5784h1 = this.f18730s0;
        C5317a c5317a5 = this.f18729r0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                C5317a c5317aM5877a2 = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68243v0, c5317a5);
                EnumC21542a enumC21542a = EnumC21542a.f68241t0;
                C5792l0 c5792l0 = this.f18731t0;
                C5317a c5317aM5877a3 = AbstractC21544c.m21827a().m5877a(enumC21542a, c5317a5);
                try {
                    c5317aM5877a3.m5876b();
                    this.f18724Y = c5317aM5877a2;
                    this.f18725Z = c5784h1;
                    this.f18726o0 = c5317a5;
                    this.f18727p0 = c5317aM5877a3;
                    this.f18728q0 = 1;
                    objM6168b = C5784h0.m6168b(c5784h1, c5792l0, this);
                    if (objM6168b == enumC19250a) {
                        return enumC19250a;
                    }
                    c5317a = c5317aM5877a2;
                    c5784h0 = c5784h1;
                    r10 = c5317aM5877a3;
                    c5317a2 = c5317a5;
                    abstractC6224C = (AbstractC6224C) objM6168b;
                    if (abstractC6224C instanceof C6223B) {
                        C3074g c3074g = (C3074g) ((C6223B) abstractC6224C).f20258a;
                        AbstractC8160o6.m8726a(c5784h0.f18872x, "Received token " + c3074g.f9276d, null, 6);
                        c5788j1 = (C5788j0) c5784h0.f18862n.getValue();
                        c3092y = c3074g.f9276d;
                        if (c5788j1 != null) {
                            c5788j1.m6188a(c3092y.f9303a);
                        }
                        AbstractC8160o6.m8726a(c5784h0.f18872x, "Connecting to room", null, 6);
                        c6256d = c5784h0.f18840N;
                        if (c3092y.f9303a == EnumC22033m2.Advanced) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (c6256d.f20332c == z6) {
                            c6256d.f20332c = z6;
                            c6256d.f20331b = c6256d.m6745d(z6);
                        }
                        c5317aM5877a = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68242u0, c5317a2);
                        c5317aM5877a.m5876b();
                        str = c3074g.f9273a;
                        str2 = c3074g.f9274b;
                        str3 = c3074g.f9275c;
                        this.f18724Y = c5317a;
                        this.f18725Z = r10;
                        this.f18726o0 = c5317aM5877a;
                        this.f18727p0 = null;
                        this.f18728q0 = 2;
                        if (C5784h0.m6167a(c5784h0, str, str2, str3, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        c5317a3 = c5317a;
                        r11 = r10;
                        c5317a4 = c5317aM5877a;
                        c5317a4.m5875a();
                        c5317a3.m5876b();
                        r12 = r11;
                    } else {
                        if (abstractC6224C instanceof AbstractC6249w) {
                            c5788j0 = (C5788j0) c5784h0.f18862n.getValue();
                            if (c5788j0 != null) {
                                c5788j0.m6189b(C20862H.f66400h, C17690x.f56481Y);
                            }
                            C2153Q0 c2153q0 = c5784h0.f18832F;
                            C5795o c5795o = new C5795o(true);
                            c2153q0.getClass();
                            c2153q0.m3251l(null, c5795o);
                        } else if (!(abstractC6224C instanceof C6248v)) {
                            throw new C0644w();
                        }
                        c5317a3 = c5317a;
                        r12 = r10;
                    }
                    r12.m5875a();
                    C5754K c5754k = new C5754K(2, null);
                    this.f18724Y = c5317a3;
                    this.f18725Z = null;
                    this.f18726o0 = null;
                    this.f18727p0 = null;
                    this.f18728q0 = 3;
                    objM3222u = AbstractC2124C.m3222u(c5784h1.f18827A, c5754k, this);
                    if (objM3222u == enumC19250a) {
                        return enumC19250a;
                    }
                    c5317a3.m5875a();
                    c5317a5.m5875a();
                    C17314q c17314q = c5784h1.f18873y;
                    C5785i c5785i = (C5785i) c17314q.getValue();
                    if (AbstractC16544l.m18089b(this.f18732u0, "straw")) {
                        i10 = R.raw.listening_start_0db;
                    } else {
                        i10 = R.raw.listening_start_0db;
                    }
                    c5785i.getClass();
                    AbstractC0575H.m1156D(c5785i.f18875a, null, null, new C5779f(c5785i, i10, null), 3);
                    C5785i c5785i2 = (C5785i) c17314q.getValue();
                    this.f18724Y = c5784h1;
                    this.f18728q0 = 4;
                    objM6187a = c5785i2.m6187a(3, this);
                    if (objM6187a != enumC19250a) {
                        objM6187a = c17296c;
                    }
                    if (objM6187a == enumC19250a) {
                        return enumC19250a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r6 = c5317aM5877a3;
                    r6.m5875a();
                    throw th;
                }
            } else if (i11 == 1) {
                r6 = this.f18727p0;
                c5317a2 = this.f18726o0;
                C5784h0 c5784h2 = (C5784h0) this.f18725Z;
                c5317a = (C5317a) this.f18724Y;
                try {
                    AbstractC9233X.m9807c(obj);
                    c5784h0 = c5784h2;
                    objM6168b = obj;
                    r10 = r6;
                    abstractC6224C = (AbstractC6224C) objM6168b;
                    if (abstractC6224C instanceof C6223B) {
                        C3074g c3074g2 = (C3074g) ((C6223B) abstractC6224C).f20258a;
                        AbstractC8160o6.m8726a(c5784h0.f18872x, "Received token " + c3074g2.f9276d, null, 6);
                        c5788j1 = (C5788j0) c5784h0.f18862n.getValue();
                        c3092y = c3074g2.f9276d;
                        if (c5788j1 != null) {
                            c5788j1.m6188a(c3092y.f9303a);
                        }
                        AbstractC8160o6.m8726a(c5784h0.f18872x, "Connecting to room", null, 6);
                        c6256d = c5784h0.f18840N;
                        if (c3092y.f9303a == EnumC22033m2.Advanced) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (c6256d.f20332c == z6) {
                            c6256d.f20332c = z6;
                            c6256d.f20331b = c6256d.m6745d(z6);
                        }
                        c5317aM5877a = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68242u0, c5317a2);
                        try {
                            c5317aM5877a.m5876b();
                            str = c3074g2.f9273a;
                            str2 = c3074g2.f9274b;
                            str3 = c3074g2.f9275c;
                            this.f18724Y = c5317a;
                            this.f18725Z = r10;
                            this.f18726o0 = c5317aM5877a;
                            this.f18727p0 = null;
                            this.f18728q0 = 2;
                            if (C5784h0.m6167a(c5784h0, str, str2, str3, this) == enumC19250a) {
                                return enumC19250a;
                            }
                            c5317a3 = c5317a;
                            r11 = r10;
                            c5317a4 = c5317aM5877a;
                            c5317a4.m5875a();
                            c5317a3.m5876b();
                            r12 = r11;
                        } catch (Throwable th3) {
                            th = th3;
                            c5317a4 = c5317aM5877a;
                            c5317a4.m5875a();
                            throw th;
                        }
                    } else {
                        if (abstractC6224C instanceof AbstractC6249w) {
                            c5788j0 = (C5788j0) c5784h0.f18862n.getValue();
                            if (c5788j0 != null) {
                                c5788j0.m6189b(C20862H.f66400h, C17690x.f56481Y);
                            }
                            C2153Q0 c2153q1 = c5784h0.f18832F;
                            C5795o c5795o2 = new C5795o(true);
                            c2153q1.getClass();
                            c2153q1.m3251l(null, c5795o2);
                        } else if (!(abstractC6224C instanceof C6248v)) {
                            throw new C0644w();
                        }
                        c5317a3 = c5317a;
                        r12 = r10;
                    }
                    r12.m5875a();
                    C5754K c5754k2 = new C5754K(2, null);
                    this.f18724Y = c5317a3;
                    this.f18725Z = null;
                    this.f18726o0 = null;
                    this.f18727p0 = null;
                    this.f18728q0 = 3;
                    objM3222u = AbstractC2124C.m3222u(c5784h1.f18827A, c5754k2, this);
                    if (objM3222u == enumC19250a) {
                        return enumC19250a;
                    }
                    c5317a3.m5875a();
                    c5317a5.m5875a();
                    C17314q c17314q2 = c5784h1.f18873y;
                    C5785i c5785i3 = (C5785i) c17314q2.getValue();
                    if (AbstractC16544l.m18089b(this.f18732u0, "straw")) {
                        i10 = R.raw.listening_start_0db;
                    } else {
                        i10 = R.raw.listening_start_0db;
                    }
                    c5785i3.getClass();
                    AbstractC0575H.m1156D(c5785i3.f18875a, null, null, new C5779f(c5785i3, i10, null), 3);
                    C5785i c5785i4 = (C5785i) c17314q2.getValue();
                    this.f18724Y = c5784h1;
                    this.f18728q0 = 4;
                    objM6187a = c5785i4.m6187a(3, this);
                    if (objM6187a != enumC19250a) {
                        objM6187a = c17296c;
                    }
                    if (objM6187a == enumC19250a) {
                        return enumC19250a;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r6.m5875a();
                    throw th;
                }
            } else if (i11 == 2) {
                c5317a4 = this.f18726o0;
                C5317a c5317a6 = (C5317a) this.f18725Z;
                c5317a3 = (C5317a) this.f18724Y;
                try {
                    AbstractC9233X.m9807c(obj);
                    r11 = c5317a6;
                    c5317a4.m5875a();
                    c5317a3.m5876b();
                    r12 = r11;
                    r12.m5875a();
                    C5754K c5754k3 = new C5754K(2, null);
                    this.f18724Y = c5317a3;
                    this.f18725Z = null;
                    this.f18726o0 = null;
                    this.f18727p0 = null;
                    this.f18728q0 = 3;
                    objM3222u = AbstractC2124C.m3222u(c5784h1.f18827A, c5754k3, this);
                    if (objM3222u == enumC19250a) {
                        return enumC19250a;
                    }
                    c5317a3.m5875a();
                    c5317a5.m5875a();
                    C17314q c17314q3 = c5784h1.f18873y;
                    C5785i c5785i5 = (C5785i) c17314q3.getValue();
                    if (AbstractC16544l.m18089b(this.f18732u0, "straw")) {
                        i10 = R.raw.listening_start_0db;
                    } else {
                        i10 = R.raw.listening_start_0db;
                    }
                    c5785i5.getClass();
                    AbstractC0575H.m1156D(c5785i5.f18875a, null, null, new C5779f(c5785i5, i10, null), 3);
                    C5785i c5785i6 = (C5785i) c17314q3.getValue();
                    this.f18724Y = c5784h1;
                    this.f18728q0 = 4;
                    objM6187a = c5785i6.m6187a(3, this);
                    if (objM6187a != enumC19250a) {
                        objM6187a = c17296c;
                    }
                    if (objM6187a == enumC19250a) {
                        return enumC19250a;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c5317a4.m5875a();
                    throw th;
                }
            } else if (i11 == 3) {
                c5317a3 = (C5317a) this.f18724Y;
                AbstractC9233X.m9807c(obj);
                objM3222u = obj;
                c5317a3.m5875a();
                c5317a5.m5875a();
                C17314q c17314q4 = c5784h1.f18873y;
                C5785i c5785i7 = (C5785i) c17314q4.getValue();
                if (AbstractC16544l.m18089b(this.f18732u0, "straw") || this.f18733v0 != null) {
                    i10 = R.raw.listening_start_0db;
                } else {
                    i10 = R.raw.listening_start_straw;
                }
                c5785i7.getClass();
                AbstractC0575H.m1156D(c5785i7.f18875a, null, null, new C5779f(c5785i7, i10, null), 3);
                C5785i c5785i8 = (C5785i) c17314q4.getValue();
                this.f18724Y = c5784h1;
                this.f18728q0 = 4;
                objM6187a = c5785i8.m6187a(3, this);
                if (objM6187a != enumC19250a) {
                    objM6187a = c17296c;
                }
                if (objM6187a == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5784h1 = (C5784h0) this.f18724Y;
                AbstractC9233X.m9807c(obj);
            }
            c5784h1.f18859k.mo10874d(0);
            return c17296c;
        } catch (Throwable th6) {
            th = th6;
            r6 = 1;
        }
    }
}
