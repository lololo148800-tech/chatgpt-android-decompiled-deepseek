package p283L5;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import io.ktor.utils.p815io.AbstractC15070F;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import mm.C17314q;
import p011A9.C0415f;
import p026Ao.AbstractC0668b;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.C0691y;
import p033B5.AbstractC0833q;
import p049Bm.InterfaceC1439n;
import p1009s9.C19506i;
import p110E4.C2307e;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p111E5.C2332p;
import p111E5.C2335s;
import p111E5.EnumC2324h;
import p135F5.C2666b;
import p135F5.C2669e;
import p135F5.C2670f;
import p135F5.C2671g;
import p135F5.C2672h;
import p160G5.C3003i;
import p160G5.InterfaceC3001g;
import p307M5.C5296a;
import p354O5.C6133c;
import p354O5.C6135e;
import p374P5.C6361n;
import p374P5.EnumC6349b;
import p544W9.AbstractC8466D4;
import p544W9.AbstractC8589Y2;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9759L;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p959q8.C18639a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: L5.q */
/* JADX INFO: loaded from: classes.dex */
public final class C4951q implements InterfaceC3001g {

    /* JADX INFO: renamed from: a */
    public final String f16149a;

    /* JADX INFO: renamed from: b */
    public final C6361n f16150b;

    /* JADX INFO: renamed from: c */
    public final C17314q f16151c;

    /* JADX INFO: renamed from: d */
    public final C17314q f16152d;

    /* JADX INFO: renamed from: e */
    public final C17314q f16153e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4939e f16154f;

    public C4951q(String str, C6361n c6361n, C17314q c17314q, C17314q c17314q2, C17314q c17314q3, InterfaceC4939e interfaceC4939e) {
        this.f16149a = str;
        this.f16150b = c6361n;
        this.f16151c = c17314q;
        this.f16152d = c17314q2;
        this.f16153e = c17314q3;
        this.f16154f = interfaceC4939e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m5592b(C4951q c4951q, C6135e c6135e, AbstractC19687c abstractC19687c) {
        C4949o c4949o;
        C0675i c0675i;
        if (abstractC19687c instanceof C4949o) {
            c4949o = (C4949o) abstractC19687c;
            int i10 = c4949o.f16142q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4949o.f16142q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4949o = new C4949o(c4951q, abstractC19687c);
            }
        } else {
            c4949o = new C4949o(c4951q, abstractC19687c);
        }
        Object obj = c4949o.f16140o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4949o.f16142q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c0675i = new C0675i();
            c4949o.f16138Y = c4951q;
            c4949o.f16139Z = c0675i;
            c4949o.f16142q0 = 1;
            Object objM16177e = AbstractC15070F.m16177e(c6135e.f19995Y, c0675i, Long.MAX_VALUE, c4949o);
            Object obj2 = C17296C.f55119a;
            if (objM16177e != enumC19250a) {
                objM16177e = obj2;
            }
            if (objM16177e == enumC19250a) {
                obj2 = objM16177e;
            }
            if (obj2 == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0675i c0675i2 = c4949o.f16139Z;
            C4951q c4951q2 = c4949o.f16138Y;
            AbstractC9233X.m9807c(obj);
            c0675i = c0675i2;
            c4951q = c4951q2;
        }
        return new C2335s(c0675i, c4951q.m5596e(), null);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x020a  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX INFO: renamed from: c */
    public static final Object m5593c(C4951q c4951q, C2671g c2671g, C4955u c4955u, C4955u c4955u2, AbstractC19687c abstractC19687c) {
        C4950p c4950p;
        C4951q c4951q2;
        C2670f c2670f;
        C4955u c4955u3;
        Throwable th2;
        C2307e c2307eM3648e;
        C6135e c6135e;
        C6135e c6135e2;
        C2671g c2671g2 = c2671g;
        C4955u c4955u4 = c4955u2;
        c4951q.getClass();
        if (abstractC19687c instanceof C4950p) {
            c4950p = (C4950p) abstractC19687c;
            int i10 = c4950p.f16148r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4950p.f16148r0 = i10 - Integer.MIN_VALUE;
            } else {
                c4950p = new C4950p(c4951q, abstractC19687c);
            }
        } else {
            c4950p = new C4950p(c4951q, abstractC19687c);
        }
        Object c4936b = c4950p.f16146p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4950p.f16148r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(c4936b);
            if (c4951q.f16150b.f20704h.f20617Z) {
                InterfaceC4937c interfaceC4937c = (InterfaceC4937c) c4951q.f16153e.getValue();
                c4950p.f16143Y = c4951q;
                c4950p.f16144Z = c2671g2;
                c4950p.f16145o0 = c4955u4;
                c4950p.f16148r0 = 1;
                ((C5296a) interfaceC4937c).getClass();
                if (c4955u4.f16161a != 304 || c4955u == null) {
                    c4936b = new C4936b(c4955u4);
                } else {
                    C4953s c4953s = c4955u.f16164d;
                    c4953s.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : c4953s.f16157a.entrySet()) {
                        linkedHashMap.put(entry.getKey(), AbstractC17680n.m19323D0((Collection) entry.getValue()));
                    }
                    for (Map.Entry entry2 : c4955u4.f16164d.f16157a.entrySet()) {
                        String str = (String) entry2.getKey();
                        List list = (List) entry2.getValue();
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
                        linkedHashMap.put(lowerCase, AbstractC17680n.m19323D0(list));
                    }
                    c4936b = new C4936b(new C4955u(c4955u4.f16161a, c4955u4.f16162b, c4955u4.f16163c, new C4953s(AbstractC17659D.m19254p(linkedHashMap)), null, c4955u4.f16166f));
                }
                if (c4936b == enumC19250a) {
                    return enumC19250a;
                }
                c4951q2 = c4951q;
            } else if (c2671g2 != null) {
                try {
                    c2671g.close();
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception unused) {
                }
            }
            return null;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2670f = (C2670f) c4950p.f16145o0;
            c4955u3 = (C4955u) c4950p.f16144Z;
            c4955u4 = (C4955u) c4950p.f16143Y;
            try {
                AbstractC9233X.m9807c(c4936b);
                return c2670f.m3653a();
            } catch (Exception e11) {
                e = e11;
                try {
                    c2670f.f8207a.m3396f(false);
                } catch (Exception unused2) {
                }
                c6135e = c4955u4.f16165e;
                if (c6135e != null) {
                    try {
                        c6135e.close();
                    } catch (RuntimeException e12) {
                        throw e12;
                    } catch (Exception unused3) {
                    }
                }
                c6135e2 = c4955u3.f16165e;
                if (c6135e2 != null) {
                    throw e;
                }
                try {
                    c6135e2.close();
                    throw e;
                } catch (RuntimeException e13) {
                    throw e13;
                } catch (Exception unused4) {
                    throw e;
                }
            }
        }
        C4955u c4955u5 = (C4955u) c4950p.f16145o0;
        c2671g2 = (C2671g) c4950p.f16144Z;
        c4951q2 = (C4951q) c4950p.f16143Y;
        AbstractC9233X.m9807c(c4936b);
        c4955u4 = c4955u5;
        C4955u c4955u6 = ((C4936b) c4936b).f16107a;
        if (c4955u6 != null) {
            if (c2671g2 != null) {
                C2666b c2666b = c2671g2.f8208Y;
                C2669e c2669e = c2666b.f8187o0;
                synchronized (c2669e.f8200t0) {
                    c2666b.close();
                    c2307eM3648e = c2669e.m3648e(c2666b.f8185Y.f8176a);
                }
                if (c2307eM3648e != null) {
                    c2670f = new C2670f(c2307eM3648e);
                } else {
                    c2670f = null;
                }
            } else {
                C2672h c2672h = (C2672h) c4951q2.f16152d.getValue();
                if (c2672h == null) {
                    c2670f = null;
                } else {
                    String str2 = c4951q2.f16150b.f20701e;
                    if (str2 == null) {
                        str2 = c4951q2.f16149a;
                    }
                    C2669e c2669e2 = c2672h.f8210b;
                    C0678l c0678l = C0678l.f1971p0;
                    C2307e c2307eM3648e2 = c2669e2.m3648e(C18639a.m19996n(str2).mo1371c("SHA-256").mo1373e());
                    if (c2307eM3648e2 != null) {
                        c2670f = new C2670f(c2307eM3648e2);
                    } else {
                        c2670f = null;
                    }
                }
            }
            if (c2670f != null) {
                try {
                    C0656E c0656eM1402b = AbstractC0668b.m1402b(c4951q2.m5596e().mo1399i(c2670f.f8207a.m3397h(0), false));
                    try {
                        AbstractC8589Y2.m9253c(c4955u6, c0656eM1402b);
                        try {
                            c0656eM1402b.close();
                            th2 = null;
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            c0656eM1402b.close();
                        } catch (Throwable th5) {
                            AbstractC9221V.m9789a(th2, th5);
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    C6135e c6135e3 = c4955u6.f16165e;
                    if (c6135e3 != null) {
                        AbstractC0682p abstractC0682pM5596e = c4951q2.m5596e();
                        C0654C c0654cM3397h = c2670f.f8207a.m3397h(1);
                        c4950p.f16143Y = c4955u4;
                        c4950p.f16144Z = c4955u6;
                        c4950p.f16145o0 = c2670f;
                        c4950p.f16148r0 = 2;
                        Object objM9095a = AbstractC8466D4.m9095a(c6135e3.f19995Y, abstractC0682pM5596e, c0654cM3397h, c4950p);
                        if (objM9095a != EnumC19250a.f61036Y) {
                            objM9095a = C17296C.f55119a;
                        }
                        if (objM9095a == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    c4955u3 = c4955u6;
                    return c2670f.m3653a();
                } catch (Exception e14) {
                    e = e14;
                    c4955u3 = c4955u6;
                    c2670f.f8207a.m3396f(false);
                    c6135e = c4955u4.f16165e;
                    if (c6135e != null) {
                        c6135e.close();
                    }
                    c6135e2 = c4955u3.f16165e;
                    if (c6135e2 != null) {
                        throw e;
                    }
                    c6135e2.close();
                    throw e;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m5594f(String str, String str2) {
        String strM10363b;
        if ((str2 == null || AbstractC21329w.m21734u(str2, "text/plain", false)) && (strM10363b = AbstractC9759L.m10363b(str)) != null) {
            return strM10363b;
        }
        if (str2 != null) {
            return AbstractC21322p.m21705m0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0175 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0176  */
    /* JADX WARN: Code duplicated, block: B:73:0x017f A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:21:0x0048, B:71:0x017b, B:73:0x017f, B:59:0x0128, B:61:0x012e, B:67:0x0159, B:42:0x00a9, B:44:0x00b0, B:46:0x00be, B:53:0x00f2, B:55:0x00fe, B:49:0x00d4, B:51:0x00de, B:64:0x014f, B:65:0x0156), top: B:88:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0194 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlin.jvm.internal.B] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.internal.B] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // p160G5.InterfaceC3001g
    /* JADX INFO: renamed from: a */
    public final Object mo3829a(AbstractC19687c abstractC19687c) throws Exception {
        C4946l c4946l;
        ?? r6;
        C2671g c2671g;
        C16525B c16525b;
        C2671g c2671g2;
        C16525B c16525b2;
        C4951q c4951q;
        C4951q c4951q2;
        C16525B c16525b3;
        C2672h c2672h;
        Object objM5595d;
        C4951q c4951q3;
        C3003i c3003i;
        if (abstractC19687c instanceof C4946l) {
            c4946l = (C4946l) abstractC19687c;
            int i10 = c4946l.f16127r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4946l.f16127r0 = i10 - Integer.MIN_VALUE;
            } else {
                c4946l = new C4946l(this, abstractC19687c);
            }
        } else {
            c4946l = new C4946l(this, abstractC19687c);
        }
        Object objM5595d2 = c4946l.f16125p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r10 = c4946l.f16127r0;
        try {
            if (r10 == 0) {
                AbstractC9233X.m9807c(objM5595d2);
                c16525b = new C16525B();
                C6361n c6361n = this.f16150b;
                boolean z6 = c6361n.f20704h.f20616Y;
                String str = this.f16149a;
                if (!z6 || (c2672h = (C2672h) this.f16152d.getValue()) == null) {
                    c2671g2 = null;
                } else {
                    String str2 = c6361n.f20701e;
                    if (str2 == null) {
                        str2 = str;
                    }
                    C0678l c0678l = C0678l.f1971p0;
                    C2666b c2666bM3650k = c2672h.f8210b.m3650k(C18639a.m19996n(str2).mo1371c("SHA-256").mo1373e());
                    if (c2666bM3650k != null) {
                        c2671g2 = new C2671g(c2666bM3650k);
                    } else {
                        c2671g2 = null;
                    }
                }
                c16525b.f51262Y = c2671g2;
                C16525B c16525b4 = new C16525B();
                if (c2671g2 != null) {
                    AbstractC0682p abstractC0682pM5596e = m5596e();
                    C2666b c2666b = ((C2671g) c16525b.f51262Y).f8208Y;
                    if (c2666b.f8186Z) {
                        throw new IllegalStateException("snapshot is closed");
                    }
                    Long l4 = (Long) abstractC0682pM5596e.m1464f((C0654C) c2666b.f8185Y.f8178c.get(0)).f1986e;
                    if (l4 != null && l4.longValue() == 0) {
                        return new C3003i(m5598h((C2671g) c16525b.f51262Y), m5594f(str, null), EnumC2324h.f7226o0);
                    }
                    C4955u c4955uM5599i = m5599i((C2671g) c16525b.f51262Y);
                    c16525b4.f51262Y = c4955uM5599i;
                    if (c4955uM5599i != null) {
                        InterfaceC4937c interfaceC4937c = (InterfaceC4937c) this.f16153e.getValue();
                        C4955u c4955u = (C4955u) c16525b4.f51262Y;
                        m5597g();
                        c4946l.f16122Y = this;
                        c4946l.f16123Z = c16525b;
                        c4946l.f16124o0 = c16525b4;
                        c4946l.f16127r0 = 1;
                        ((C5296a) interfaceC4937c).getClass();
                        C4935a c4935a = new C4935a(c4955u);
                        if (c4935a == enumC19250a) {
                            return enumC19250a;
                        }
                        c4951q2 = this;
                        c16525b3 = c16525b4;
                        objM5595d2 = c4935a;
                    }
                    C4954t c4954tM5597g = c4951q.m5597g();
                    C4948n c4948n = new C4948n(c16525b, c4951q, c16525b2, c4954tM5597g, null);
                    c4946l.f16122Y = c4951q;
                    c4946l.f16123Z = c16525b;
                    c4946l.f16124o0 = null;
                    c4946l.f16127r0 = 2;
                    objM5595d = c4951q.m5595d(c4954tM5597g, c4948n, c4946l);
                    if (objM5595d == enumC19250a) {
                        return enumC19250a;
                    }
                    c4951q3 = c4951q;
                    objM5595d2 = objM5595d;
                    c3003i = (C3003i) objM5595d2;
                    if (c3003i == null) {
                        return c3003i;
                    }
                    C4954t c4954tM5597g2 = c4951q3.m5597g();
                    C4947m c4947m = new C4947m(c4951q3, null);
                    c4946l.f16122Y = c16525b;
                    c4946l.f16123Z = null;
                    c4946l.f16127r0 = 3;
                    objM5595d2 = c4951q3.m5595d(c4954tM5597g2, c4947m, c4946l);
                    if (objM5595d2 == enumC19250a) {
                        return enumC19250a;
                    }
                    r6 = c16525b;
                    return (C3003i) objM5595d2;
                }
                c16525b2 = c16525b4;
                c4951q = this;
                C4954t c4954tM5597g3 = c4951q.m5597g();
                C4948n c4948n2 = new C4948n(c16525b, c4951q, c16525b2, c4954tM5597g3, null);
                c4946l.f16122Y = c4951q;
                c4946l.f16123Z = c16525b;
                c4946l.f16124o0 = null;
                c4946l.f16127r0 = 2;
                objM5595d = c4951q.m5595d(c4954tM5597g3, c4948n2, c4946l);
                if (objM5595d == enumC19250a) {
                    return enumC19250a;
                }
                c4951q3 = c4951q;
                objM5595d2 = objM5595d;
                c3003i = (C3003i) objM5595d2;
                if (c3003i == null) {
                    return c3003i;
                }
                C4954t c4954tM5597g4 = c4951q3.m5597g();
                C4947m c4947m2 = new C4947m(c4951q3, null);
                c4946l.f16122Y = c16525b;
                c4946l.f16123Z = null;
                c4946l.f16127r0 = 3;
                objM5595d2 = c4951q3.m5595d(c4954tM5597g4, c4947m2, c4946l);
                if (objM5595d2 == enumC19250a) {
                    return enumC19250a;
                }
                r6 = c16525b;
                return (C3003i) objM5595d2;
            }
            if (r10 != 1) {
                if (r10 != 2) {
                    if (r10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r6 = (C16525B) c4946l.f16122Y;
                    try {
                        AbstractC9233X.m9807c(objM5595d2);
                        r6 = r6;
                        return (C3003i) objM5595d2;
                    } catch (Exception e10) {
                        e = e10;
                        c2671g = (C2671g) r6.f51262Y;
                        if (c2671g != null) {
                            try {
                                c2671g.close();
                            } catch (RuntimeException e11) {
                                throw e11;
                            } catch (Exception unused) {
                            }
                        }
                        throw e;
                    }
                }
                c16525b = c4946l.f16123Z;
                c4951q3 = (C4951q) c4946l.f16122Y;
                AbstractC9233X.m9807c(objM5595d2);
                c3003i = (C3003i) objM5595d2;
                if (c3003i == null) {
                    return c3003i;
                }
                C4954t c4954tM5597g5 = c4951q3.m5597g();
                C4947m c4947m3 = new C4947m(c4951q3, null);
                c4946l.f16122Y = c16525b;
                c4946l.f16123Z = null;
                c4946l.f16127r0 = 3;
                objM5595d2 = c4951q3.m5595d(c4954tM5597g5, c4947m3, c4946l);
                if (objM5595d2 == enumC19250a) {
                    return enumC19250a;
                }
                r6 = c16525b;
                return (C3003i) objM5595d2;
            }
            C16525B c16525b5 = c4946l.f16124o0;
            C16525B c16525b6 = c4946l.f16123Z;
            c4951q2 = (C4951q) c4946l.f16122Y;
            try {
                AbstractC9233X.m9807c(objM5595d2);
                c16525b3 = c16525b5;
                c16525b = c16525b6;
            } catch (Exception e12) {
                e = e12;
                r6 = c16525b6;
                c2671g = (C2671g) r6.f51262Y;
                if (c2671g != null) {
                    c2671g.close();
                }
                throw e;
            }
            C4935a c4935a2 = (C4935a) objM5595d2;
            if (c4935a2.f16106a != null) {
                return new C3003i(c4951q2.m5598h((C2671g) c16525b.f51262Y), m5594f(c4951q2.f16149a, c4935a2.f16106a.f16164d.m5601a()), EnumC2324h.f7226o0);
            }
            c16525b2 = c16525b3;
            c4951q = c4951q2;
            C4954t c4954tM5597g6 = c4951q.m5597g();
            C4948n c4948n3 = new C4948n(c16525b, c4951q, c16525b2, c4954tM5597g6, null);
            c4946l.f16122Y = c4951q;
            c4946l.f16123Z = c16525b;
            c4946l.f16124o0 = null;
            c4946l.f16127r0 = 2;
            objM5595d = c4951q.m5595d(c4954tM5597g6, c4948n3, c4946l);
            if (objM5595d == enumC19250a) {
                return enumC19250a;
            }
            c4951q3 = c4951q;
            objM5595d2 = objM5595d;
            c3003i = (C3003i) objM5595d2;
            if (c3003i == null) {
                return c3003i;
            }
            C4954t c4954tM5597g7 = c4951q3.m5597g();
            C4947m c4947m4 = new C4947m(c4951q3, null);
            c4946l.f16122Y = c16525b;
            c4946l.f16123Z = null;
            c4946l.f16127r0 = 3;
            objM5595d2 = c4951q3.m5595d(c4954tM5597g7, c4947m4, c4946l);
            if (objM5595d2 == enumC19250a) {
                return enumC19250a;
            }
            r6 = c16525b;
            return (C3003i) objM5595d2;
        } catch (Exception e13) {
            e = e13;
            r6 = r10;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m5595d(C4954t c4954t, InterfaceC1439n interfaceC1439n, C4946l c4946l) {
        if (this.f16150b.f20705i.f20616Y && AbstractC16544l.m18089b(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        C6133c c6133c = (C6133c) this.f16151c.getValue();
        return C6133c.m6675a(c6133c.f19994a, c4954t, new C4945k(interfaceC1439n, null), c4946l);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0682p m5596e() {
        C0691y c0691y;
        C2672h c2672h = (C2672h) this.f16152d.getValue();
        return (c2672h == null || (c0691y = c2672h.f8209a) == null) ? this.f16150b.f20702f : c0691y;
    }

    /* JADX INFO: renamed from: g */
    public final C4954t m5597g() {
        C19506i c19506i = AbstractC4942h.f16113b;
        C6361n c6361n = this.f16150b;
        C4953s c4953s = (C4953s) AbstractC0833q.m1892e(c6361n, c19506i);
        c4953s.getClass();
        C4952r c4952r = new C4952r(c4953s);
        EnumC6349b enumC6349b = c6361n.f20704h;
        boolean z6 = enumC6349b.f20616Y;
        boolean z10 = c6361n.f20705i.f20616Y && this.f16154f.mo5548a();
        if (!z10 && z6) {
            c4952r.m5600a("only-if-cached, max-stale=2147483647");
        } else if (!z10 || z6) {
            if (!z10 && !z6) {
                c4952r.m5600a("no-cache, only-if-cached");
            }
        } else if (enumC6349b.f20617Z) {
            c4952r.m5600a("no-cache");
        } else {
            c4952r.m5600a("no-cache, no-store");
        }
        String str = (String) AbstractC0833q.m1892e(c6361n, AbstractC4942h.f16112a);
        C4953s c4953s2 = new C4953s(AbstractC17659D.m19254p(c4952r.f16155a));
        if (AbstractC0833q.m1892e(c6361n, AbstractC4942h.f16114c) == null) {
            return new C4954t(this.f16149a, str, c4953s2);
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: h */
    public final C2332p m5598h(C2671g c2671g) {
        C2666b c2666b = c2671g.f8208Y;
        if (c2666b.f8186Z) {
            throw new IllegalStateException("snapshot is closed");
        }
        C0654C c0654c = (C0654C) c2666b.f8185Y.f8178c.get(1);
        AbstractC0682p abstractC0682pM5596e = m5596e();
        String str = this.f16150b.f20701e;
        if (str == null) {
            str = this.f16149a;
        }
        return C0415f.m1026b(c0654c, abstractC0682pM5596e, str, c2671g, 16);
    }

    /* JADX INFO: renamed from: i */
    public final C4955u m5599i(C2671g c2671g) throws Throwable {
        Throwable th2;
        C4955u c4955uM9251a;
        try {
            AbstractC0682p abstractC0682pM5596e = m5596e();
            C2666b c2666b = c2671g.f8208Y;
            if (c2666b.f8186Z) {
                throw new IllegalStateException(VjclRfeKsMflo.EbqWeFg);
            }
            C0657F c0657fM1403c = AbstractC0668b.m1403c(abstractC0682pM5596e.mo1400j((C0654C) c2666b.f8185Y.f8178c.get(0)));
            try {
                c4955uM9251a = AbstractC8589Y2.m9251a(c0657fM1403c);
                try {
                    c0657fM1403c.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    c0657fM1403c.close();
                } catch (Throwable th5) {
                    AbstractC9221V.m9789a(th4, th5);
                }
                th2 = th4;
                c4955uM9251a = null;
            }
            if (th2 == null) {
                return c4955uM9251a;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }
}
