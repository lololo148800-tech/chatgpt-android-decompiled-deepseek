package p958q5;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import mo.AbstractC17329F;
import mo.C17326C;
import mo.C17327D;
import mo.C17336c;
import mo.C17352s;
import mo.C17356w;
import mo.C17358y;
import mo.InterfaceC17337d;
import p007A5.AbstractC0371f;
import p007A5.C0372g;
import p025An.C0624m;
import p025An.C0644w;
import p026Ao.AbstractC0668b;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p026Ao.C0678l;
import p1056v5.C20457b;
import p1056v5.C20458c;
import p1056v5.C20459d;
import p1075w5.C20835m;
import p1075w5.EnumC20824b;
import p110E4.C2307e;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p112E6.C2350i;
import p523V9.AbstractC8039Z4;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9252a0;
import p588Y2.C9642z;
import p791hj.C14522e;
import p899n5.C17496m;
import p899n5.C17498o;
import p899n5.C17500q;
import p899n5.EnumC17488e;
import p916o5.C17827e;
import p916o5.C17830h;
import p916o5.C17832j;
import p916o5.InterfaceC17824b;
import p959q8.C18639a;
import p972qm.InterfaceC18770c;
import p974qo.C18792h;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: q5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C18637l implements InterfaceC18632g {

    /* JADX INFO: renamed from: f */
    public static final C17336c f59369f = new C17336c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: g */
    public static final C17336c f59370g = new C17336c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: a */
    public final String f59371a;

    /* JADX INFO: renamed from: b */
    public final C20835m f59372b;

    /* JADX INFO: renamed from: c */
    public final C17314q f59373c;

    /* JADX INFO: renamed from: d */
    public final C17314q f59374d;

    /* JADX INFO: renamed from: e */
    public final boolean f59375e;

    public C18637l(String str, C20835m c20835m, C17314q c17314q, C17314q c17314q2, boolean z6) {
        this.f59371a = str;
        this.f59372b = c20835m;
        this.f59373c = c17314q;
        this.f59374d = c17314q2;
        this.f59375e = z6;
    }

    /* JADX INFO: renamed from: d */
    public static String m19986d(String str, C17352s c17352s) {
        String strM1002b;
        String str2 = c17352s != null ? c17352s.f55298a : null;
        if ((str2 == null || AbstractC21329w.m21734u(str2, "text/plain", false)) && (strM1002b = AbstractC0371f.m1002b(MimeTypeMap.getSingleton(), str)) != null) {
            return strM1002b;
        }
        if (str2 != null) {
            return AbstractC21322p.m21705m0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x021b A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:94:0x01e4, B:96:0x01ea, B:98:0x020f, B:100:0x0214, B:99:0x0212, B:104:0x021b, B:105:0x0220), top: B:116:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0230  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:94:0x01e4, B:96:0x01ea, B:98:0x020f, B:100:0x0214, B:99:0x0212, B:104:0x021b, B:105:0x0220), top: B:116:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x020f A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:94:0x01e4, B:96:0x01ea, B:98:0x020f, B:100:0x0214, B:99:0x0212, B:104:0x021b, B:105:0x0220), top: B:116:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0212 A[Catch: Exception -> 0x0218, TryCatch #1 {Exception -> 0x0218, blocks: (B:94:0x01e4, B:96:0x01ea, B:98:0x020f, B:100:0x0214, B:99:0x0212, B:104:0x021b, B:105:0x0220), top: B:116:0x01e4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [q5.l] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, q5.l] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [E6.i] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11, types: [E6.i] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14, types: [E6.i] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v13, types: [q5.l] */
    /* JADX WARN: Type inference failed for: r8v17 */
    @Override // p958q5.InterfaceC18632g
    /* JADX INFO: renamed from: a */
    public final Object mo19985a(InterfaceC18770c interfaceC18770c) throws Exception {
        C18636k c18636k;
        ?? r10;
        C2350i c2350i;
        C20459d c20459dM21109a;
        ?? r11;
        C20459d c20459d;
        C20457b c20457b;
        InterfaceC17824b interfaceC17824b;
        C2350i c2350i2;
        ?? r6;
        C17327D c17327d;
        ?? r12;
        ?? r13;
        C17327D c17327d2;
        AbstractC17329F abstractC17329F;
        EnumC17488e enumC17488e;
        if (interfaceC18770c instanceof C18636k) {
            c18636k = (C18636k) interfaceC18770c;
            int i10 = c18636k.f59368r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18636k.f59368r0 = i10 - Integer.MIN_VALUE;
            } else {
                c18636k = new C18636k(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c18636k = new C18636k(this, (AbstractC19687c) interfaceC18770c);
        }
        Object obj = c18636k.f59366p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r14 = c18636k.f59368r0;
        try {
            if (r14 == 0) {
                AbstractC9233X.m9807c(obj);
                C20835m c20835m = this.f59372b;
                boolean z6 = c20835m.f66251n.f66159Y;
                String str = this.f59371a;
                if (!z6 || (interfaceC17824b = (InterfaceC17824b) this.f59374d.getValue()) == null) {
                    c2350i = null;
                } else {
                    String str2 = c20835m.f66246i;
                    if (str2 == null) {
                        str2 = str;
                    }
                    C0678l c0678l = C0678l.f1971p0;
                    C17827e c17827eM19585k = ((C17832j) interfaceC17824b).f56897b.m19585k(C18639a.m19996n(str2).mo1371c("SHA-256").mo1373e());
                    if (c17827eM19585k != null) {
                        c2350i2 = new C2350i(c17827eM19585k, 2);
                    } else {
                        c2350i = null;
                    }
                }
                if (c2350i != null) {
                    AbstractC0682p abstractC0682pM19988c = m19988c();
                    C17827e c17827e = (C17827e) c2350i.f7297Z;
                    if (c17827e.f56874Z) {
                        c2350i = c2350i2;
                        throw new IllegalStateException("snapshot is closed");
                    }
                    Long l4 = (Long) abstractC0682pM19988c.m1464f((C0654C) c17827e.f56873Y.f56866c.get(0)).f1986e;
                    if (l4 == null) {
                        c2350i = c2350i2;
                    } else if (l4.longValue() == 0) {
                        c2350i = c2350i2;
                        return new C18638m(m19991g(c2350i), m19986d(str, null), EnumC17488e.f55953o0);
                    }
                    c2350i = c2350i2;
                    if (!this.f59375e) {
                        C17496m c17496mM19991g = m19991g(c2350i);
                        C20457b c20457bM19990f = m19990f(c2350i);
                        return new C18638m(c17496mM19991g, m19986d(str, c20457bM19990f != null ? (C17352s) c20457bM19990f.f64934b.getValue() : null), EnumC17488e.f55953o0);
                    }
                    c20459dM21109a = new C20458c(m19989e(), m19990f(c2350i)).m21109a();
                    if (c20459dM21109a.f64950a == null && (c20457b = c20459dM21109a.f64951b) != null) {
                        return new C18638m(m19991g(c2350i), m19986d(str, (C17352s) c20457b.f64934b.getValue()), EnumC17488e.f55953o0);
                    }
                } else {
                    c2350i = c2350i2;
                    c20459dM21109a = new C20458c(m19989e(), null).m21109a();
                }
                C17358y c17358y = c20459dM21109a.f64950a;
                AbstractC16544l.m18091d(c17358y);
                c18636k.f59363Y = this;
                c18636k.f59364Z = c2350i;
                c18636k.f59365o0 = c20459dM21109a;
                c18636k.f59368r0 = 1;
                Object objM19987b = m19987b(c17358y, c18636k);
                if (objM19987b == enumC19250a) {
                    return enumC19250a;
                }
                r11 = this;
                c20459d = c20459dM21109a;
                obj = objM19987b;
                r6 = c2350i;
            } else {
                if (r14 != 1) {
                    if (r14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c17327d2 = (C17327D) c18636k.f59365o0;
                    r12 = c18636k.f59364Z;
                    C18637l c18637l = c18636k.f59363Y;
                    try {
                        AbstractC9233X.m9807c(obj);
                        r13 = c18637l;
                        r12 = r12;
                        c17327d = (C17327D) obj;
                        try {
                            Bitmap.Config config = AbstractC0371f.f1262a;
                            abstractC17329F = c17327d.f55179s0;
                            if (abstractC17329F != null) {
                                throw new IllegalStateException("response body == null");
                            }
                            r13.getClass();
                            C17500q c17500q = new C17500q(abstractC17329F.mo18988O0(), new C17498o(r13.f59372b.f66238a, 1), null);
                            String strM19986d = m19986d(r13.f59371a, abstractC17329F.mo18990e());
                            if (c17327d.f55180t0 != null) {
                                enumC17488e = EnumC17488e.f55954p0;
                            } else {
                                enumC17488e = EnumC17488e.f55953o0;
                            }
                            return new C18638m(c17500q, strM19986d, enumC17488e);
                        } catch (Exception e10) {
                            e = e10;
                            r12 = r12;
                            Exception exc = e;
                            c17327d2 = c17327d;
                            e = exc;
                            try {
                                AbstractC0371f.m1001a(c17327d2);
                                throw e;
                            } catch (Exception e11) {
                                e = e11;
                                r10 = r12;
                                if (r10 != 0) {
                                    AbstractC0371f.m1001a(r10);
                                }
                                throw e;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        AbstractC0371f.m1001a(c17327d2);
                        throw e;
                    }
                }
                C20459d c20459d2 = (C20459d) c18636k.f59365o0;
                r10 = c18636k.f59364Z;
                C18637l c18637l2 = c18636k.f59363Y;
                try {
                    AbstractC9233X.m9807c(obj);
                    c20459d = c20459d2;
                    r6 = r10;
                    r11 = c18637l2;
                } catch (Exception e13) {
                    e = e13;
                    if (r10 != 0) {
                        AbstractC0371f.m1001a(r10);
                    }
                    throw e;
                }
            }
            c17327d = (C17327D) obj;
            Bitmap.Config config2 = AbstractC0371f.f1262a;
            AbstractC17329F abstractC17329F2 = c17327d.f55179s0;
            if (abstractC17329F2 == null) {
                throw new IllegalStateException("response body == null");
            }
            try {
                C2350i c2350iM19992h = r11.m19992h(r6, c20459d.f64950a, c17327d, c20459d.f64951b);
                String str3 = r11.f59371a;
                if (c2350iM19992h != null) {
                    C17496m c17496mM19991g2 = r11.m19991g(c2350iM19992h);
                    C20457b c20457bM19990f2 = r11.m19990f(c2350iM19992h);
                    return new C18638m(c17496mM19991g2, m19986d(str3, c20457bM19990f2 != null ? (C17352s) c20457bM19990f2.f64934b.getValue() : null), EnumC17488e.f55954p0);
                }
                if (abstractC17329F2.mo18988O0().mo1359l(1L)) {
                    return new C18638m(new C17500q(abstractC17329F2.mo18988O0(), new C17498o(r11.f59372b.f66238a, 1), null), m19986d(str3, abstractC17329F2.mo18990e()), c17327d.f55180t0 != null ? EnumC17488e.f55954p0 : EnumC17488e.f55953o0);
                }
                AbstractC0371f.m1001a(c17327d);
                C17358y c17358yM19989e = r11.m19989e();
                c18636k.f59363Y = r11;
                c18636k.f59364Z = c2350iM19992h;
                c18636k.f59365o0 = c17327d;
                c18636k.f59368r0 = 2;
                Object objM19987b2 = r11.m19987b(c17358yM19989e, c18636k);
                if (objM19987b2 == enumC19250a) {
                    return enumC19250a;
                }
                r12 = c2350iM19992h;
                r13 = r11;
                c17327d2 = c17327d;
                obj = objM19987b2;
                c17327d = (C17327D) obj;
                Bitmap.Config config3 = AbstractC0371f.f1262a;
                abstractC17329F = c17327d.f55179s0;
                if (abstractC17329F != null) {
                    throw new IllegalStateException("response body == null");
                }
                r13.getClass();
                C17500q c17500q2 = new C17500q(abstractC17329F.mo18988O0(), new C17498o(r13.f59372b.f66238a, 1), null);
                String strM19986d2 = m19986d(r13.f59371a, abstractC17329F.mo18990e());
                if (c17327d.f55180t0 != null) {
                    enumC17488e = EnumC17488e.f55954p0;
                } else {
                    enumC17488e = EnumC17488e.f55953o0;
                }
                return new C18638m(c17500q2, strM19986d2, enumC17488e);
            } catch (Exception e14) {
                e = e14;
                r12 = r6;
                Exception exc2 = e;
                c17327d2 = c17327d;
                e = exc2;
                AbstractC0371f.m1001a(c17327d2);
                throw e;
            }
        } catch (Exception e15) {
            e = e15;
            r10 = r14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m19987b(C17358y c17358y, AbstractC19687c abstractC19687c) {
        C18635j c18635j;
        C17327D c17327dM20063e;
        int i10;
        if (abstractC19687c instanceof C18635j) {
            c18635j = (C18635j) abstractC19687c;
            int i11 = c18635j.f59362o0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c18635j.f59362o0 = i11 - Integer.MIN_VALUE;
            } else {
                c18635j = new C18635j(this, abstractC19687c);
            }
        } else {
            c18635j = new C18635j(this, abstractC19687c);
        }
        Object objM1261q = c18635j.f59360Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c18635j.f59362o0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(objM1261q);
            Bitmap.Config config = AbstractC0371f.f1262a;
            boolean zM18089b = AbstractC16544l.m18089b(Looper.myLooper(), Looper.getMainLooper());
            C17314q c17314q = this.f59373c;
            if (!zM18089b) {
                C18792h c18792hM19035b = ((C17356w) ((InterfaceC17337d) c17314q.getValue())).m19035b(c17358y);
                c18635j.f59362o0 = 1;
                C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c18635j));
                c0624m.m1262r();
                C0372g c0372g = new C0372g(c18792hM19035b, 0, c0624m);
                c18792hM19035b.m20062d(c0372g);
                c0624m.m1264u(c0372g);
                objM1261q = c0624m.m1261q();
                if (objM1261q == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (this.f59372b.f66252o.f66159Y) {
                    throw new NetworkOnMainThreadException();
                }
                c17327dM20063e = ((C17356w) ((InterfaceC17337d) c17314q.getValue())).m19035b(c17358y).m20063e();
            }
            if (!c17327dM20063e.m18985a() || (i10 = c17327dM20063e.f55176p0) == 304) {
                return c17327dM20063e;
            }
            AbstractC17329F abstractC17329F = c17327dM20063e.f55179s0;
            if (abstractC17329F != null) {
                AbstractC0371f.m1001a(abstractC17329F);
            }
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "HTTP ", ": ");
            sbM11057o.append(c17327dM20063e.f55175o0);
            throw new C0644w(sbM11057o.toString());
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(objM1261q);
        c17327dM20063e = (C17327D) objM1261q;
        if (c17327dM20063e.m18985a()) {
        }
        return c17327dM20063e;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0682p m19988c() {
        Object value = this.f59374d.getValue();
        AbstractC16544l.m18091d(value);
        return ((C17832j) ((InterfaceC17824b) value)).f56896a;
    }

    /* JADX INFO: renamed from: e */
    public final C17358y m19989e() {
        C14522e c14522e = new C14522e(3);
        c14522e.m16010B(this.f59371a);
        C20835m c20835m = this.f59372b;
        c14522e.m16025s(c20835m.f66247j);
        for (Map.Entry entry : c20835m.f66248k.f66263a.entrySet()) {
            Object key = entry.getKey();
            AbstractC16544l.m18092e(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            c14522e.m16032z((Class) key, entry.getValue());
        }
        EnumC20824b enumC20824b = c20835m.f66251n;
        boolean z6 = enumC20824b.f66159Y;
        boolean z10 = c20835m.f66252o.f66159Y;
        if (!z10 && z6) {
            c14522e.m16018j(C17336c.f55215o);
        } else if (!z10 || z6) {
            if (!z10 && !z6) {
                c14522e.m16018j(f59370g);
            }
        } else if (enumC20824b.f66160Z) {
            c14522e.m16018j(C17336c.f55214n);
        } else {
            c14522e.m16018j(f59369f);
        }
        return c14522e.m16017i();
    }

    /* JADX INFO: renamed from: f */
    public final C20457b m19990f(C2350i c2350i) throws Throwable {
        Throwable th2;
        C20457b c20457b;
        try {
            AbstractC0682p abstractC0682pM19988c = m19988c();
            C17827e c17827e = (C17827e) c2350i.f7297Z;
            if (c17827e.f56874Z) {
                throw new IllegalStateException("snapshot is closed");
            }
            C0657F c0657fM1403c = AbstractC0668b.m1403c(abstractC0682pM19988c.mo1400j((C0654C) c17827e.f56873Y.f56866c.get(0)));
            try {
                c20457b = new C20457b(c0657fM1403c);
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
                c20457b = null;
            }
            if (th2 == null) {
                return c20457b;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final C17496m m19991g(C2350i c2350i) {
        C17827e c17827e = (C17827e) c2350i.f7297Z;
        if (c17827e.f56874Z) {
            throw new IllegalStateException("snapshot is closed");
        }
        C0654C c0654c = (C0654C) c17827e.f56873Y.f56866c.get(1);
        AbstractC0682p abstractC0682pM19988c = m19988c();
        String str = this.f59372b.f66246i;
        if (str == null) {
            str = this.f59371a;
        }
        return new C17496m(c0654c, abstractC0682pM19988c, str, c2350i);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (kotlin.jvm.internal.AbstractC16544l.m18089b(r6.f55178r0.m19012f("Vary"), android.gov.nist.core.Separators.STAR) == false) goto L15;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2350i m19992h(C2350i c2350i, C17358y c17358y, C17327D c17327d, C20457b c20457b) {
        C9642z c9642z;
        Throwable th2;
        C2307e c2307eM19583e;
        int i10 = 17;
        Throwable th3 = null;
        if (this.f59372b.f66251n.f66160Z) {
            if (this.f59375e) {
                if (!c17358y.m19037a().f55217b) {
                    C17336c c17336cM9827b = c17327d.f55186z0;
                    if (c17336cM9827b == null) {
                        C17336c c17336c = C17336c.f55214n;
                        c17336cM9827b = AbstractC9252a0.m9827b(c17327d.f55178r0);
                        c17327d.f55186z0 = c17336cM9827b;
                    }
                    if (!c17336cM9827b.f55217b) {
                    }
                }
            }
            if (c2350i != null) {
                C17827e c17827e = (C17827e) c2350i.f7297Z;
                C17830h c17830h = c17827e.f56875o0;
                synchronized (c17830h) {
                    c17827e.close();
                    c2307eM19583e = c17830h.m19583e(c17827e.f56873Y.f56864a);
                }
                if (c2307eM19583e != null) {
                    c9642z = new C9642z(c2307eM19583e, i10);
                } else {
                    c9642z = null;
                }
            } else {
                InterfaceC17824b interfaceC17824b = (InterfaceC17824b) this.f59374d.getValue();
                if (interfaceC17824b == null) {
                    c9642z = null;
                } else {
                    String str = this.f59372b.f66246i;
                    if (str == null) {
                        str = this.f59371a;
                    }
                    C17830h c17830h2 = ((C17832j) interfaceC17824b).f56897b;
                    C0678l c0678l = C0678l.f1971p0;
                    C2307e c2307eM19583e2 = c17830h2.m19583e(C18639a.m19996n(str).mo1371c("SHA-256").mo1373e());
                    if (c2307eM19583e2 != null) {
                        c9642z = new C9642z(c2307eM19583e2, i10);
                    } else {
                        c9642z = null;
                    }
                }
            }
            if (c9642z == null) {
                return null;
            }
            try {
                try {
                    if (c17327d.f55176p0 != 304 || c20457b == null) {
                        C0656E c0656eM1402b = AbstractC0668b.m1402b(m19988c().mo1399i(((C2307e) c9642z.f29064Z).m3397h(0), false));
                        try {
                            new C20457b(c17327d).m21108a(c0656eM1402b);
                            try {
                                c0656eM1402b.close();
                                th2 = null;
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                        } catch (Throwable th5) {
                            try {
                                c0656eM1402b.close();
                            } catch (Throwable th6) {
                                AbstractC9221V.m9789a(th5, th6);
                            }
                            th2 = th5;
                        }
                        if (th2 != null) {
                            throw th2;
                        }
                        C0656E c0656eM1402b2 = AbstractC0668b.m1402b(m19988c().mo1399i(((C2307e) c9642z.f29064Z).m3397h(1), false));
                        try {
                            AbstractC17329F abstractC17329F = c17327d.f55179s0;
                            AbstractC16544l.m18091d(abstractC17329F);
                            abstractC17329F.mo18988O0().mo1341F0(c0656eM1402b2);
                            try {
                                c0656eM1402b2.close();
                            } catch (Throwable th7) {
                                th3 = th7;
                            }
                        } catch (Throwable th8) {
                            th3 = th8;
                            try {
                                c0656eM1402b2.close();
                            } catch (Throwable th9) {
                                AbstractC9221V.m9789a(th3, th9);
                            }
                        }
                        if (th3 != null) {
                            throw th3;
                        }
                    } else {
                        C17326C c17326cM18986e = c17327d.m18986e();
                        c17326cM18986e.f55165f = AbstractC8039Z4.m8402d(c20457b.f64938f, c17327d.f55178r0).m19016q();
                        C17327D c17327dM18984a = c17326cM18986e.m18984a();
                        C0656E c0656eM1402b3 = AbstractC0668b.m1402b(m19988c().mo1399i(((C2307e) c9642z.f29064Z).m3397h(0), false));
                        try {
                            new C20457b(c17327dM18984a).m21108a(c0656eM1402b3);
                            try {
                                c0656eM1402b3.close();
                            } catch (Throwable th10) {
                                th3 = th10;
                            }
                        } catch (Throwable th11) {
                            th3 = th11;
                            try {
                                c0656eM1402b3.close();
                            } catch (Throwable th12) {
                                AbstractC9221V.m9789a(th3, th12);
                            }
                        }
                        if (th3 != null) {
                            throw th3;
                        }
                    }
                    C2350i c2350iM10205R = c9642z.m10205R();
                    AbstractC0371f.m1001a(c17327d);
                    return c2350iM10205R;
                } catch (Throwable th13) {
                    AbstractC0371f.m1001a(c17327d);
                    throw th13;
                }
            } catch (Exception e10) {
                Bitmap.Config config = AbstractC0371f.f1262a;
                try {
                    ((C2307e) c9642z.f29064Z).m3396f(false);
                } catch (Exception unused) {
                }
                throw e10;
            }
        }
        if (c2350i != null) {
            AbstractC0371f.m1001a(c2350i);
        }
        return null;
    }
}
