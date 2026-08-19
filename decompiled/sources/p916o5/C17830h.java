package p916o5;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p007A5.AbstractC0371f;
import p025An.AbstractC0575H;
import p025An.C0566C0;
import p026Ao.AbstractC0668b;
import p026Ao.C0654C;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p026Ao.C0691y;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p110E4.C2307e;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21319m;
import p153Fn.C2925c;
import p201Hn.C3523l;
import p201Hn.ExecutorC3515d;
import p334Na.AbstractC5695b;
import p477Tb.AbstractC7294a;
import p571X9.AbstractC9221V;

/* JADX INFO: renamed from: o5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17830h implements Closeable, Flushable {

    /* JADX INFO: renamed from: C0 */
    public static final C21319m f56877C0 = new C21319m("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: A0 */
    public boolean f56878A0;

    /* JADX INFO: renamed from: B0 */
    public final C17828f f56879B0;

    /* JADX INFO: renamed from: Y */
    public final C0654C f56880Y;

    /* JADX INFO: renamed from: Z */
    public final long f56881Z;

    /* JADX INFO: renamed from: o0 */
    public final C0654C f56882o0;

    /* JADX INFO: renamed from: p0 */
    public final C0654C f56883p0;

    /* JADX INFO: renamed from: q0 */
    public final C0654C f56884q0;

    /* JADX INFO: renamed from: r0 */
    public final LinkedHashMap f56885r0;

    /* JADX INFO: renamed from: s0 */
    public final C2925c f56886s0;

    /* JADX INFO: renamed from: t0 */
    public long f56887t0;

    /* JADX INFO: renamed from: u0 */
    public int f56888u0;

    /* JADX INFO: renamed from: v0 */
    public C0656E f56889v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f56890w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f56891x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f56892y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f56893z0;

    public C17830h(long j10, C0691y c0691y, C0654C c0654c, ExecutorC3515d executorC3515d) {
        this.f56880Y = c0654c;
        this.f56881Z = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f56882o0 = c0654c.m1321e("journal");
        this.f56883p0 = c0654c.m1321e("journal.tmp");
        this.f56884q0 = c0654c.m1321e("journal.bkp");
        this.f56885r0 = new LinkedHashMap(0, 0.75f, true);
        C0566C0 c0566c0M1176e = AbstractC0575H.m1176e();
        executorC3515d.getClass();
        this.f56886s0 = AbstractC0575H.m1174c(AbstractC5695b.m6138e(c0566c0M1176e, C3523l.f10647Z.mo1144Y0(1, null)));
        this.f56879B0 = new C17828f(c0691y);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x011c A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003f, B:25:0x0057, B:29:0x0074, B:31:0x0084, B:33:0x008b, B:26:0x005d, B:28:0x006d, B:37:0x00ab, B:39:0x00b2, B:42:0x00b7, B:44:0x00c8, B:47:0x00cd, B:52:0x0108, B:54:0x0113, B:58:0x011c, B:48:0x00e5, B:50:0x00fa, B:51:0x0105, B:36:0x009b, B:61:0x0121, B:62:0x0128), top: B:65:0x0001 }] */
    /* JADX INFO: renamed from: a */
    public static final void m19576a(C17830h c17830h, C2307e c2307e, boolean z6) {
        synchronized (c17830h) {
            C17826d c17826d = (C17826d) c2307e.f7159o0;
            if (!AbstractC16544l.m18089b(c17826d.f56870g, c2307e)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z6 || c17826d.f56869f) {
                for (int i10 = 0; i10 < 2; i10++) {
                    c17830h.f56879B0.m1462c((C0654C) c17826d.f56867d.get(i10));
                }
            } else {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (((boolean[]) c2307e.f7160p0)[i11] && !c17830h.f56879B0.m1463d((C0654C) c17826d.f56867d.get(i11))) {
                        c2307e.m3396f(false);
                        return;
                    }
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    C0654C c0654c = (C0654C) c17826d.f56867d.get(i12);
                    C0654C c0654c2 = (C0654C) c17826d.f56866c.get(i12);
                    if (c17830h.f56879B0.m1463d(c0654c)) {
                        c17830h.f56879B0.m1466l(c0654c, c0654c2);
                    } else {
                        C17828f c17828f = c17830h.f56879B0;
                        C0654C c0654c3 = (C0654C) c17826d.f56866c.get(i12);
                        if (!c17828f.m1463d(c0654c3)) {
                            AbstractC0371f.m1001a(c17828f.mo1399i(c0654c3, false));
                        }
                    }
                    long j10 = c17826d.f56865b[i12];
                    Long l4 = (Long) c17830h.f56879B0.m1464f(c0654c2).f1986e;
                    long jLongValue = l4 != null ? l4.longValue() : 0L;
                    c17826d.f56865b[i12] = jLongValue;
                    c17830h.f56887t0 = (c17830h.f56887t0 - j10) + jLongValue;
                }
            }
            c17826d.f56870g = null;
            if (c17826d.f56869f) {
                c17830h.m19582W(c17826d);
                return;
            }
            c17830h.f56888u0++;
            C0656E c0656e = c17830h.f56889v0;
            AbstractC16544l.m18091d(c0656e);
            if (z6 || c17826d.f56868e) {
                c17826d.f56868e = true;
                c0656e.mo1333c0("CLEAN");
                c0656e.mo1328M(32);
                c0656e.mo1333c0(c17826d.f56864a);
                for (long j11 : c17826d.f56865b) {
                    c0656e.mo1328M(32);
                    c0656e.mo1329Q0(j11);
                }
                c0656e.mo1328M(10);
            } else {
                c17830h.f56885r0.remove(c17826d.f56864a);
                c0656e.mo1333c0("REMOVE");
                c0656e.mo1328M(32);
                c0656e.mo1333c0(c17826d.f56864a);
                c0656e.mo1328M(10);
            }
            c0656e.flush();
            if (c17830h.f56887t0 > c17830h.f56881Z) {
                c17830h.m19578E();
            } else if (c17830h.f56888u0 >= 2000) {
                c17830h.m19578E();
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m19577r0(String str) {
        if (!f56877C0.m21664d(str)) {
            throw new IllegalArgumentException(AbstractC10763a.m11047e('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m19578E() {
        AbstractC0575H.m1156D(this.f56886s0, null, null, new C17829g(this, null), 3);
    }

    /* JADX INFO: renamed from: P */
    public final void m19579P() {
        Iterator it = this.f56885r0.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C17826d c17826d = (C17826d) it.next();
            int i10 = 0;
            if (c17826d.f56870g == null) {
                while (i10 < 2) {
                    j10 += c17826d.f56865b[i10];
                    i10++;
                }
            } else {
                c17826d.f56870g = null;
                while (i10 < 2) {
                    C0654C c0654c = (C0654C) c17826d.f56866c.get(i10);
                    C17828f c17828f = this.f56879B0;
                    c17828f.m1462c(c0654c);
                    c17828f.m1462c((C0654C) c17826d.f56867d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f56887t0 = j10;
    }

    /* JADX INFO: renamed from: S */
    public final void m19580S() throws Throwable {
        C17828f c17828f = this.f56879B0;
        C0654C file = this.f56882o0;
        C0657F c0657fM1403c = AbstractC0668b.m1403c(c17828f.mo1400j(file));
        try {
            String strM1350W = c0657fM1403c.m1350W(Long.MAX_VALUE);
            String strM1350W2 = c0657fM1403c.m1350W(Long.MAX_VALUE);
            String strM1350W3 = c0657fM1403c.m1350W(Long.MAX_VALUE);
            String strM1350W4 = c0657fM1403c.m1350W(Long.MAX_VALUE);
            String strM1350W5 = c0657fM1403c.m1350W(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strM1350W) || !"1".equals(strM1350W2) || !AbstractC16544l.m18089b(String.valueOf(1), strM1350W3) || !AbstractC16544l.m18089b(String.valueOf(2), strM1350W4) || strM1350W5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strM1350W + ", " + strM1350W2 + ", " + strM1350W3 + ", " + strM1350W4 + ", " + strM1350W5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    m19581T(c0657fM1403c.m1350W(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.f56888u0 = i10 - this.f56885r0.size();
                    if (c0657fM1403c.mo1356g()) {
                        c17828f.getClass();
                        AbstractC16544l.m18094g(file, "file");
                        this.f56889v0 = AbstractC0668b.m1402b(new C17831i(c17828f.m1465k(file), new C17825c(this, 0)));
                    } else {
                        m19587v0();
                    }
                    try {
                        c0657fM1403c.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                c0657fM1403c.close();
            } catch (Throwable th4) {
                AbstractC9221V.m9789a(th, th4);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m19581T(String str) throws IOException {
        String strSubstring;
        int iM21678L = AbstractC21322p.m21678L(str, ' ', 0, false, 6);
        if (iM21678L == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iM21678L + 1;
        int iM21678L2 = AbstractC21322p.m21678L(str, ' ', i10, false, 4);
        LinkedHashMap linkedHashMap = this.f56885r0;
        if (iM21678L2 == -1) {
            strSubstring = str.substring(i10);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            if (iM21678L == 6 && AbstractC21329w.m21734u(str, QzvfuIgrngtl.FHVCdwygZiYjsBU, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iM21678L2);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
        }
        Object c17826d = linkedHashMap.get(strSubstring);
        if (c17826d == null) {
            c17826d = new C17826d(this, strSubstring);
            linkedHashMap.put(strSubstring, c17826d);
        }
        C17826d c17826d2 = (C17826d) c17826d;
        if (iM21678L2 == -1 || iM21678L != 5 || !AbstractC21329w.m21734u(str, "CLEAN", false)) {
            if (iM21678L2 == -1 && iM21678L == 5 && AbstractC21329w.m21734u(str, "DIRTY", false)) {
                c17826d2.f56870g = new C2307e(this, c17826d2);
                return;
            } else {
                if (iM21678L2 != -1 || iM21678L != 4 || !AbstractC21329w.m21734u(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iM21678L2 + 1);
        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
        List listM21696d0 = AbstractC21322p.m21696d0(strSubstring2, new char[]{' '}, 6);
        c17826d2.f56868e = true;
        c17826d2.f56870g = null;
        int size = listM21696d0.size();
        c17826d2.f56872i.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listM21696d0);
        }
        try {
            int size2 = listM21696d0.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c17826d2.f56865b[i11] = Long.parseLong((String) listM21696d0.get(i11));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listM21696d0);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m19582W(C17826d c17826d) {
        C0656E c0656e;
        int i10 = c17826d.f56871h;
        String str = c17826d.f56864a;
        if (i10 > 0 && (c0656e = this.f56889v0) != null) {
            c0656e.mo1333c0("DIRTY");
            c0656e.mo1328M(32);
            c0656e.mo1333c0(str);
            c0656e.mo1328M(10);
            c0656e.flush();
        }
        if (c17826d.f56871h > 0 || c17826d.f56870g != null) {
            c17826d.f56869f = true;
            return;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            this.f56879B0.m1462c((C0654C) c17826d.f56866c.get(i11));
            long j10 = this.f56887t0;
            long[] jArr = c17826d.f56865b;
            this.f56887t0 = j10 - jArr[i11];
            jArr[i11] = 0;
        }
        this.f56888u0++;
        C0656E c0656e2 = this.f56889v0;
        if (c0656e2 != null) {
            c0656e2.mo1333c0("REMOVE");
            c0656e2.mo1328M(32);
            c0656e2.mo1333c0(str);
            c0656e2.mo1328M(10);
        }
        this.f56885r0.remove(str);
        if (this.f56888u0 >= 2000) {
            m19578E();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f56891x0 && !this.f56892y0) {
                for (C17826d c17826d : (C17826d[]) this.f56885r0.values().toArray(new C17826d[0])) {
                    C2307e c2307e = c17826d.f56870g;
                    if (c2307e != null) {
                        C17826d c17826d2 = (C17826d) c2307e.f7159o0;
                        if (AbstractC16544l.m18089b(c17826d2.f56870g, c2307e)) {
                            c17826d2.f56869f = true;
                        }
                    }
                }
                m19584j0();
                AbstractC0575H.m1180i(this.f56886s0, null);
                C0656E c0656e = this.f56889v0;
                AbstractC16544l.m18091d(c0656e);
                c0656e.close();
                this.f56889v0 = null;
                this.f56892y0 = true;
                return;
            }
            this.f56892y0 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized C2307e m19583e(String str) {
        try {
            if (this.f56892y0) {
                throw new IllegalStateException("cache is closed");
            }
            m19577r0(str);
            m19586m();
            C17826d c17826d = (C17826d) this.f56885r0.get(str);
            if ((c17826d != null ? c17826d.f56870g : null) != null) {
                return null;
            }
            if (c17826d != null && c17826d.f56871h != 0) {
                return null;
            }
            if (!this.f56893z0 && !this.f56878A0) {
                C0656E c0656e = this.f56889v0;
                AbstractC16544l.m18091d(c0656e);
                c0656e.mo1333c0("DIRTY");
                c0656e.mo1328M(32);
                c0656e.mo1333c0(str);
                c0656e.mo1328M(10);
                c0656e.flush();
                if (this.f56890w0) {
                    return null;
                }
                if (c17826d == null) {
                    c17826d = new C17826d(this, str);
                    this.f56885r0.put(str, c17826d);
                }
                C2307e c2307e = new C2307e(this, c17826d);
                c17826d.f56870g = c2307e;
                return c2307e;
            }
            m19578E();
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f56891x0) {
            if (this.f56892y0) {
                throw new IllegalStateException("cache is closed");
            }
            m19584j0();
            C0656E c0656e = this.f56889v0;
            AbstractC16544l.m18091d(c0656e);
            c0656e.flush();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m19584j0() {
        while (this.f56887t0 > this.f56881Z) {
            for (C17826d c17826d : this.f56885r0.values()) {
                if (!c17826d.f56869f) {
                    m19582W(c17826d);
                }
            }
            return;
        }
        this.f56893z0 = false;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized C17827e m19585k(String str) {
        C17827e c17827eM19575a;
        if (this.f56892y0) {
            throw new IllegalStateException("cache is closed");
        }
        m19577r0(str);
        m19586m();
        C17826d c17826d = (C17826d) this.f56885r0.get(str);
        if (c17826d != null && (c17827eM19575a = c17826d.m19575a()) != null) {
            boolean z6 = true;
            this.f56888u0++;
            C0656E c0656e = this.f56889v0;
            AbstractC16544l.m18091d(c0656e);
            c0656e.mo1333c0("READ");
            c0656e.mo1328M(32);
            c0656e.mo1333c0(str);
            c0656e.mo1328M(10);
            if (this.f56888u0 < 2000) {
                z6 = false;
            }
            if (z6) {
                m19578E();
            }
            return c17827eM19575a;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m19586m() {
        try {
            if (this.f56891x0) {
                return;
            }
            this.f56879B0.m1462c(this.f56883p0);
            if (this.f56879B0.m1463d(this.f56884q0)) {
                if (this.f56879B0.m1463d(this.f56882o0)) {
                    this.f56879B0.m1462c(this.f56884q0);
                } else {
                    this.f56879B0.m1466l(this.f56884q0, this.f56882o0);
                }
            }
            if (this.f56879B0.m1463d(this.f56882o0)) {
                try {
                    m19580S();
                    m19579P();
                    this.f56891x0 = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        AbstractC7294a.m7745b(this.f56879B0, this.f56880Y);
                        this.f56892y0 = false;
                        m19587v0();
                        this.f56891x0 = true;
                    } catch (Throwable th2) {
                        this.f56892y0 = false;
                        throw th2;
                    }
                }
            }
            m19587v0();
            this.f56891x0 = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final synchronized void m19587v0() {
        Throwable th2;
        try {
            C0656E c0656e = this.f56889v0;
            if (c0656e != null) {
                c0656e.close();
            }
            C0656E c0656eM1402b = AbstractC0668b.m1402b(this.f56879B0.mo1399i(this.f56883p0, false));
            try {
                c0656eM1402b.mo1333c0("libcore.io.DiskLruCache");
                c0656eM1402b.mo1328M(10);
                c0656eM1402b.mo1333c0("1");
                c0656eM1402b.mo1328M(10);
                c0656eM1402b.mo1329Q0(1);
                c0656eM1402b.mo1328M(10);
                c0656eM1402b.mo1329Q0(2);
                c0656eM1402b.mo1328M(10);
                c0656eM1402b.mo1328M(10);
                for (C17826d c17826d : this.f56885r0.values()) {
                    if (c17826d.f56870g != null) {
                        c0656eM1402b.mo1333c0("DIRTY");
                        c0656eM1402b.mo1328M(32);
                        c0656eM1402b.mo1333c0(c17826d.f56864a);
                        c0656eM1402b.mo1328M(10);
                    } else {
                        c0656eM1402b.mo1333c0("CLEAN");
                        c0656eM1402b.mo1328M(32);
                        c0656eM1402b.mo1333c0(c17826d.f56864a);
                        for (long j10 : c17826d.f56865b) {
                            c0656eM1402b.mo1328M(32);
                            c0656eM1402b.mo1329Q0(j10);
                        }
                        c0656eM1402b.mo1328M(10);
                    }
                }
                try {
                    c0656eM1402b.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    c0656eM1402b.close();
                } catch (Throwable th5) {
                    AbstractC9221V.m9789a(th4, th5);
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.f56879B0.m1463d(this.f56882o0)) {
                this.f56879B0.m1466l(this.f56882o0, this.f56884q0);
                this.f56879B0.m1466l(this.f56883p0, this.f56882o0);
                this.f56879B0.m1462c(this.f56884q0);
            } else {
                this.f56879B0.m1466l(this.f56883p0, this.f56882o0);
            }
            C17828f c17828f = this.f56879B0;
            c17828f.getClass();
            C0654C file = this.f56882o0;
            AbstractC16544l.m18094g(file, "file");
            this.f56889v0 = AbstractC0668b.m1402b(new C17831i(c17828f.m1465k(file), new C17825c(this, 0)));
            this.f56888u0 = 0;
            this.f56890w0 = false;
            this.f56878A0 = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }
}
