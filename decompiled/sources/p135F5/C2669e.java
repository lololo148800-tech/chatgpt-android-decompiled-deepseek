package p135F5;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0386f;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0561A;
import p025An.C0566C0;
import p026Ao.AbstractC0668b;
import p026Ao.C0654C;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p026Ao.C0679m;
import p026Ao.C0691y;
import p110E4.C2307e;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21319m;
import p153Fn.C2925c;
import p201Hn.ExecutorC3515d;
import p334Na.AbstractC5695b;
import p571X9.AbstractC9185O4;
import p571X9.AbstractC9221V;

/* JADX INFO: renamed from: F5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2669e implements AutoCloseable {

    /* JADX INFO: renamed from: D0 */
    public static final C21319m f8189D0 = new C21319m("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: A0 */
    public boolean f8190A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f8191B0;

    /* JADX INFO: renamed from: C0 */
    public final C2667c f8192C0;

    /* JADX INFO: renamed from: Y */
    public final C0654C f8193Y;

    /* JADX INFO: renamed from: Z */
    public final long f8194Z;

    /* JADX INFO: renamed from: o0 */
    public final C0654C f8195o0;

    /* JADX INFO: renamed from: p0 */
    public final C0654C f8196p0;

    /* JADX INFO: renamed from: q0 */
    public final C0654C f8197q0;

    /* JADX INFO: renamed from: r0 */
    public final LinkedHashMap f8198r0;

    /* JADX INFO: renamed from: s0 */
    public final C2925c f8199s0;

    /* JADX INFO: renamed from: t0 */
    public final Object f8200t0;

    /* JADX INFO: renamed from: u0 */
    public long f8201u0;

    /* JADX INFO: renamed from: v0 */
    public int f8202v0;

    /* JADX INFO: renamed from: w0 */
    public C0656E f8203w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f8204x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f8205y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f8206z0;

    public C2669e(long j10, C0691y c0691y, C0654C c0654c, ExecutorC3515d executorC3515d) {
        this.f8193Y = c0654c;
        this.f8194Z = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f8195o0 = c0654c.m1321e("journal");
        this.f8196p0 = c0654c.m1321e("journal.tmp");
        this.f8197q0 = c0654c.m1321e("journal.bkp");
        this.f8198r0 = new LinkedHashMap(0, 0.75f, true);
        C0566C0 c0566c0M1176e = AbstractC0575H.m1176e();
        C0561A c0561a = AbstractC0563B.f1782Y;
        this.f8199s0 = AbstractC0575H.m1174c(AbstractC5695b.m6138e(c0566c0M1176e, executorC3515d.mo1144Y0(1, null)));
        this.f8200t0 = new Object();
        this.f8192C0 = new C2667c(c0691y);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0114 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0041, B:26:0x0059, B:28:0x006c, B:30:0x007c, B:32:0x0083, B:27:0x005f, B:36:0x00a3, B:38:0x00aa, B:41:0x00af, B:43:0x00c0, B:46:0x00c5, B:51:0x0100, B:53:0x010b, B:57:0x0114, B:47:0x00dd, B:49:0x00f2, B:50:0x00fd, B:35:0x0093, B:60:0x0119, B:61:0x0120), top: B:64:0x0003 }] */
    /* JADX INFO: renamed from: a */
    public static final void m3641a(C2669e c2669e, C2307e c2307e, boolean z6) {
        synchronized (c2669e.f8200t0) {
            C2665a c2665a = (C2665a) c2307e.f7159o0;
            if (!AbstractC16544l.m18089b(c2665a.f8182g, c2307e)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z6 || c2665a.f8181f) {
                for (int i10 = 0; i10 < 2; i10++) {
                    c2669e.f8192C0.m1462c((C0654C) c2665a.f8179d.get(i10));
                }
            } else {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (((boolean[]) c2307e.f7160p0)[i11] && !c2669e.f8192C0.m1463d((C0654C) c2665a.f8179d.get(i11))) {
                        c2307e.m3396f(false);
                        return;
                    }
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    C0654C c0654c = (C0654C) c2665a.f8179d.get(i12);
                    C0654C c0654c2 = (C0654C) c2665a.f8178c.get(i12);
                    if (c2669e.f8192C0.m1463d(c0654c)) {
                        c2669e.f8192C0.m1466l(c0654c, c0654c2);
                    } else {
                        AbstractC9185O4.m9742a(c2669e.f8192C0, (C0654C) c2665a.f8178c.get(i12));
                    }
                    long j10 = c2665a.f8177b[i12];
                    Long l4 = (Long) c2669e.f8192C0.m1464f(c0654c2).f1986e;
                    long jLongValue = l4 != null ? l4.longValue() : 0L;
                    c2665a.f8177b[i12] = jLongValue;
                    c2669e.f8201u0 = (c2669e.f8201u0 - j10) + jLongValue;
                }
            }
            c2665a.f8182g = null;
            if (c2665a.f8181f) {
                c2669e.m3647W(c2665a);
                return;
            }
            c2669e.f8202v0++;
            C0656E c0656e = c2669e.f8203w0;
            AbstractC16544l.m18091d(c0656e);
            if (z6 || c2665a.f8180e) {
                c2665a.f8180e = true;
                c0656e.mo1333c0("CLEAN");
                c0656e.mo1328M(32);
                c0656e.mo1333c0(c2665a.f8176a);
                for (long j11 : c2665a.f8177b) {
                    c0656e.mo1328M(32);
                    c0656e.mo1329Q0(j11);
                }
                c0656e.mo1328M(10);
            } else {
                c2669e.f8198r0.remove(c2665a.f8176a);
                c0656e.mo1333c0("REMOVE");
                c0656e.mo1328M(32);
                c0656e.mo1333c0(c2665a.f8176a);
                c0656e.mo1328M(10);
            }
            c0656e.flush();
            if (c2669e.f8201u0 > c2669e.f8194Z) {
                c2669e.m3643E();
            } else if (c2669e.f8202v0 >= 2000) {
                c2669e.m3643E();
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m3642r0(String str) {
        if (!f8189D0.m21664d(str)) {
            throw new IllegalArgumentException(AbstractC10763a.m11047e('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m3643E() {
        AbstractC0575H.m1156D(this.f8199s0, null, null, new C2668d(this, null), 3);
    }

    /* JADX INFO: renamed from: P */
    public final void m3644P() {
        Iterator it = this.f8198r0.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C2665a c2665a = (C2665a) it.next();
            int i10 = 0;
            if (c2665a.f8182g == null) {
                while (i10 < 2) {
                    j10 += c2665a.f8177b[i10];
                    i10++;
                }
            } else {
                c2665a.f8182g = null;
                while (i10 < 2) {
                    C0654C c0654c = (C0654C) c2665a.f8178c.get(i10);
                    C2667c c2667c = this.f8192C0;
                    c2667c.m1462c(c0654c);
                    c2667c.m1462c((C0654C) c2665a.f8179d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f8201u0 = j10;
    }

    /* JADX INFO: renamed from: S */
    public final void m3645S() throws Throwable {
        C2667c c2667c = this.f8192C0;
        C0654C file = this.f8195o0;
        C0657F c0657fM1403c = AbstractC0668b.m1403c(c2667c.mo1400j(file));
        try {
            String strM1350W = c0657fM1403c.m1350W(Long.MAX_VALUE);
            String strM1350W2 = c0657fM1403c.m1350W(Long.MAX_VALUE);
            String strM1350W3 = c0657fM1403c.m1350W(Long.MAX_VALUE);
            String strM1350W4 = c0657fM1403c.m1350W(Long.MAX_VALUE);
            String strM1350W5 = c0657fM1403c.m1350W(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strM1350W) || !"1".equals(strM1350W2) || !AbstractC16544l.m18089b(String.valueOf(3), strM1350W3) || !AbstractC16544l.m18089b(String.valueOf(2), strM1350W4) || strM1350W5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strM1350W + ", " + strM1350W2 + ", " + strM1350W3 + ", " + strM1350W4 + ", " + strM1350W5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    m3646T(c0657fM1403c.m1350W(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.f8202v0 = i10 - this.f8198r0.size();
                    if (c0657fM1403c.mo1356g()) {
                        c2667c.getClass();
                        AbstractC16544l.m18094g(file, "file");
                        this.f8203w0 = AbstractC0668b.m1402b(new C0679m(c2667c.m1465k(file), new C0386f(this, 4), 1));
                    } else {
                        m3652v0();
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
    public final void m3646T(String str) throws IOException {
        String strSubstring;
        int iM21678L = AbstractC21322p.m21678L(str, ' ', 0, false, 6);
        if (iM21678L == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iM21678L + 1;
        int iM21678L2 = AbstractC21322p.m21678L(str, ' ', i10, false, 4);
        LinkedHashMap linkedHashMap = this.f8198r0;
        if (iM21678L2 == -1) {
            strSubstring = str.substring(i10);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            if (iM21678L == 6 && AbstractC21329w.m21734u(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iM21678L2);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
        }
        Object c2665a = linkedHashMap.get(strSubstring);
        if (c2665a == null) {
            c2665a = new C2665a(this, strSubstring);
            linkedHashMap.put(strSubstring, c2665a);
        }
        C2665a c2665a2 = (C2665a) c2665a;
        if (iM21678L2 == -1 || iM21678L != 5 || !AbstractC21329w.m21734u(str, "CLEAN", false)) {
            if (iM21678L2 == -1 && iM21678L == 5 && AbstractC21329w.m21734u(str, "DIRTY", false)) {
                c2665a2.f8182g = new C2307e(this, c2665a2);
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
        c2665a2.f8180e = true;
        c2665a2.f8182g = null;
        int size = listM21696d0.size();
        c2665a2.f8184i.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listM21696d0);
        }
        try {
            int size2 = listM21696d0.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c2665a2.f8177b[i11] = Long.parseLong((String) listM21696d0.get(i11));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listM21696d0);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m3647W(C2665a c2665a) {
        C0656E c0656e;
        int i10 = c2665a.f8183h;
        String str = c2665a.f8176a;
        if (i10 > 0 && (c0656e = this.f8203w0) != null) {
            c0656e.mo1333c0("DIRTY");
            c0656e.mo1328M(32);
            c0656e.mo1333c0(str);
            c0656e.mo1328M(10);
            c0656e.flush();
        }
        if (c2665a.f8183h > 0 || c2665a.f8182g != null) {
            c2665a.f8181f = true;
            return;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            this.f8192C0.m1462c((C0654C) c2665a.f8178c.get(i11));
            long j10 = this.f8201u0;
            long[] jArr = c2665a.f8177b;
            this.f8201u0 = j10 - jArr[i11];
            jArr[i11] = 0;
        }
        this.f8202v0++;
        C0656E c0656e2 = this.f8203w0;
        if (c0656e2 != null) {
            c0656e2.mo1333c0("REMOVE");
            c0656e2.mo1328M(32);
            c0656e2.mo1333c0(str);
            c0656e2.mo1328M(10);
            c0656e2.flush();
        }
        this.f8198r0.remove(str);
        if (this.f8202v0 >= 2000) {
            m3643E();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f8200t0) {
            try {
                if (this.f8205y0 && !this.f8206z0) {
                    for (C2665a c2665a : (C2665a[]) this.f8198r0.values().toArray(new C2665a[0])) {
                        C2307e c2307e = c2665a.f8182g;
                        if (c2307e != null) {
                            C2665a c2665a2 = (C2665a) c2307e.f7159o0;
                            if (AbstractC16544l.m18089b(c2665a2.f8182g, c2307e)) {
                                c2665a2.f8181f = true;
                            }
                        }
                    }
                    m3649j0();
                    AbstractC0575H.m1180i(this.f8199s0, null);
                    C0656E c0656e = this.f8203w0;
                    AbstractC16544l.m18091d(c0656e);
                    c0656e.close();
                    this.f8203w0 = null;
                    this.f8206z0 = true;
                    return;
                }
                this.f8206z0 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final C2307e m3648e(String str) {
        synchronized (this.f8200t0) {
            try {
                if (this.f8206z0) {
                    throw new IllegalStateException("cache is closed");
                }
                m3642r0(str);
                m3651m();
                C2665a c2665a = (C2665a) this.f8198r0.get(str);
                if ((c2665a != null ? c2665a.f8182g : null) != null) {
                    return null;
                }
                if (c2665a != null && c2665a.f8183h != 0) {
                    return null;
                }
                if (!this.f8190A0 && !this.f8191B0) {
                    C0656E c0656e = this.f8203w0;
                    AbstractC16544l.m18091d(c0656e);
                    c0656e.mo1333c0("DIRTY");
                    c0656e.mo1328M(32);
                    c0656e.mo1333c0(str);
                    c0656e.mo1328M(10);
                    c0656e.flush();
                    if (this.f8204x0) {
                        return null;
                    }
                    if (c2665a == null) {
                        c2665a = new C2665a(this, str);
                        this.f8198r0.put(str, c2665a);
                    }
                    C2307e c2307e = new C2307e(this, c2665a);
                    c2665a.f8182g = c2307e;
                    return c2307e;
                }
                m3643E();
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3649j0() {
        while (this.f8201u0 > this.f8194Z) {
            for (C2665a c2665a : this.f8198r0.values()) {
                if (!c2665a.f8181f) {
                    m3647W(c2665a);
                }
            }
            return;
        }
        this.f8190A0 = false;
    }

    /* JADX INFO: renamed from: k */
    public final C2666b m3650k(String str) {
        C2666b c2666bM3640a;
        synchronized (this.f8200t0) {
            if (this.f8206z0) {
                throw new IllegalStateException("cache is closed");
            }
            m3642r0(str);
            m3651m();
            C2665a c2665a = (C2665a) this.f8198r0.get(str);
            if (c2665a != null && (c2666bM3640a = c2665a.m3640a()) != null) {
                boolean z6 = true;
                this.f8202v0++;
                C0656E c0656e = this.f8203w0;
                AbstractC16544l.m18091d(c0656e);
                c0656e.mo1333c0("READ");
                c0656e.mo1328M(32);
                c0656e.mo1333c0(str);
                c0656e.mo1328M(10);
                c0656e.flush();
                if (this.f8202v0 < 2000) {
                    z6 = false;
                }
                if (z6) {
                    m3643E();
                }
                return c2666bM3640a;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3651m() {
        synchronized (this.f8200t0) {
            try {
                if (this.f8205y0) {
                    return;
                }
                this.f8192C0.m1462c(this.f8196p0);
                if (this.f8192C0.m1463d(this.f8197q0)) {
                    if (this.f8192C0.m1463d(this.f8195o0)) {
                        this.f8192C0.m1462c(this.f8197q0);
                    } else {
                        this.f8192C0.m1466l(this.f8197q0, this.f8195o0);
                    }
                }
                if (this.f8192C0.m1463d(this.f8195o0)) {
                    try {
                        m3645S();
                        m3644P();
                        this.f8205y0 = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            AbstractC9185O4.m9743b(this.f8192C0, this.f8193Y);
                            this.f8206z0 = false;
                            m3652v0();
                            this.f8205y0 = true;
                        } catch (Throwable th2) {
                            this.f8206z0 = false;
                            throw th2;
                        }
                    }
                }
                m3652v0();
                this.f8205y0 = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m3652v0() {
        Throwable th2;
        synchronized (this.f8200t0) {
            try {
                C0656E c0656e = this.f8203w0;
                if (c0656e != null) {
                    c0656e.close();
                }
                C0656E c0656eM1402b = AbstractC0668b.m1402b(this.f8192C0.mo1399i(this.f8196p0, false));
                try {
                    c0656eM1402b.mo1333c0("libcore.io.DiskLruCache");
                    c0656eM1402b.mo1328M(10);
                    c0656eM1402b.mo1333c0("1");
                    c0656eM1402b.mo1328M(10);
                    c0656eM1402b.mo1329Q0(3);
                    c0656eM1402b.mo1328M(10);
                    c0656eM1402b.mo1329Q0(2);
                    c0656eM1402b.mo1328M(10);
                    c0656eM1402b.mo1328M(10);
                    for (C2665a c2665a : this.f8198r0.values()) {
                        if (c2665a.f8182g != null) {
                            c0656eM1402b.mo1333c0("DIRTY");
                            c0656eM1402b.mo1328M(32);
                            c0656eM1402b.mo1333c0(c2665a.f8176a);
                            c0656eM1402b.mo1328M(10);
                        } else {
                            c0656eM1402b.mo1333c0("CLEAN");
                            c0656eM1402b.mo1328M(32);
                            c0656eM1402b.mo1333c0(c2665a.f8176a);
                            for (long j10 : c2665a.f8177b) {
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
                if (this.f8192C0.m1463d(this.f8195o0)) {
                    this.f8192C0.m1466l(this.f8195o0, this.f8197q0);
                    this.f8192C0.m1466l(this.f8196p0, this.f8195o0);
                    this.f8192C0.m1462c(this.f8197q0);
                } else {
                    this.f8192C0.m1466l(this.f8196p0, this.f8195o0);
                }
                C2667c c2667c = this.f8192C0;
                c2667c.getClass();
                C0654C file = this.f8195o0;
                AbstractC16544l.m18094g(file, "file");
                this.f8203w0 = AbstractC0668b.m1402b(new C0679m(c2667c.m1465k(file), new C0386f(this, 4), 1));
                this.f8202v0 = 0;
                this.f8204x0 = false;
                this.f8191B0 = false;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }
}
