package to;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p298Lm.C5150L;
import p615Z6.C10252z0;
import p775h2.AbstractC14376f;
import p950po.C18529c;
import p950po.C18530d;

/* JADX INFO: renamed from: to.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C20022m implements Closeable {

    /* JADX INFO: renamed from: L0 */
    public static final C20034y f63373L0;

    /* JADX INFO: renamed from: A0 */
    public long f63374A0;

    /* JADX INFO: renamed from: B0 */
    public final C20034y f63375B0;

    /* JADX INFO: renamed from: C0 */
    public C20034y f63376C0;

    /* JADX INFO: renamed from: D0 */
    public long f63377D0;

    /* JADX INFO: renamed from: E0 */
    public long f63378E0;

    /* JADX INFO: renamed from: F0 */
    public long f63379F0;

    /* JADX INFO: renamed from: G0 */
    public long f63380G0;

    /* JADX INFO: renamed from: H0 */
    public final Socket f63381H0;

    /* JADX INFO: renamed from: I0 */
    public final C20031v f63382I0;

    /* JADX INFO: renamed from: J0 */
    public final C5150L f63383J0;

    /* JADX INFO: renamed from: K0 */
    public final LinkedHashSet f63384K0;

    /* JADX INFO: renamed from: Y */
    public final AbstractC20016g f63385Y;

    /* JADX INFO: renamed from: Z */
    public final LinkedHashMap f63386Z = new LinkedHashMap();

    /* JADX INFO: renamed from: o0 */
    public final String f63387o0;

    /* JADX INFO: renamed from: p0 */
    public int f63388p0;

    /* JADX INFO: renamed from: q0 */
    public int f63389q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f63390r0;

    /* JADX INFO: renamed from: s0 */
    public final C18530d f63391s0;

    /* JADX INFO: renamed from: t0 */
    public final C18529c f63392t0;

    /* JADX INFO: renamed from: u0 */
    public final C18529c f63393u0;

    /* JADX INFO: renamed from: v0 */
    public final C18529c f63394v0;

    /* JADX INFO: renamed from: w0 */
    public final C20033x f63395w0;

    /* JADX INFO: renamed from: x0 */
    public long f63396x0;

    /* JADX INFO: renamed from: y0 */
    public long f63397y0;

    /* JADX INFO: renamed from: z0 */
    public long f63398z0;

    static {
        C20034y c20034y = new C20034y();
        c20034y.m20857c(7, 65535);
        c20034y.m20857c(5, 16384);
        f63373L0 = c20034y;
    }

    public C20022m(C10252z0 c10252z0) {
        this.f63385Y = (AbstractC20016g) c10252z0.f30459r0;
        String str = (String) c10252z0.f30456o0;
        if (str == null) {
            AbstractC16544l.m18103p("connectionName");
            throw null;
        }
        this.f63387o0 = str;
        this.f63389q0 = 3;
        C18530d c18530d = (C18530d) c10252z0.f30454Y;
        this.f63391s0 = c18530d;
        this.f63392t0 = c18530d.m19897e();
        this.f63393u0 = c18530d.m19897e();
        this.f63394v0 = c18530d.m19897e();
        this.f63395w0 = C20033x.f63451a;
        C20034y c20034y = new C20034y();
        c20034y.m20857c(7, 16777216);
        this.f63375B0 = c20034y;
        C20034y c20034y2 = f63373L0;
        this.f63376C0 = c20034y2;
        this.f63380G0 = c20034y2.m20855a();
        Socket socket = (Socket) c10252z0.f30455Z;
        if (socket == null) {
            AbstractC16544l.m18103p("socket");
            throw null;
        }
        this.f63381H0 = socket;
        C0656E c0656e = (C0656E) c10252z0.f30458q0;
        if (c0656e == null) {
            AbstractC16544l.m18103p("sink");
            throw null;
        }
        this.f63382I0 = new C20031v(c0656e);
        C0657F c0657f = (C0657F) c10252z0.f30457p0;
        if (c0657f == null) {
            AbstractC16544l.m18103p("source");
            throw null;
        }
        this.f63383J0 = new C5150L(this, new C20026q(c0657f), false, 20);
        this.f63384K0 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: E */
    public final void m20815E(int i10) {
        AbstractC14376f.m15825D(i10, "statusCode");
        synchronized (this.f63382I0) {
            synchronized (this) {
                if (this.f63390r0) {
                    return;
                }
                this.f63390r0 = true;
                this.f63382I0.m20854m(AbstractC17708b.f56536a, this.f63388p0, i10);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final synchronized void m20816P(long j10) {
        long j11 = this.f63377D0 + j10;
        this.f63377D0 = j11;
        long j12 = j11 - this.f63378E0;
        if (j12 >= this.f63375B0.m20855a() / 2) {
            m20819W(0, j12);
            this.f63378E0 += j12;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m20817S(int i10, boolean z6, C0675i c0675i, long j10) {
        long j11;
        long j12;
        int iMin;
        long j13;
        if (j10 == 0) {
            this.f63382I0.m20852e(z6, i10, c0675i, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j11 = this.f63379F0;
                            j12 = this.f63380G0;
                            if (j11 >= j12) {
                                if (!this.f63386Z.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                iMin = Math.min((int) Math.min(j10, j12 - j11), this.f63382I0.f63445o0);
                j13 = iMin;
                this.f63379F0 += j13;
            }
            j10 -= j13;
            this.f63382I0.m20852e(z6 && j10 == 0, i10, c0675i, iMin);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m20818T(int i10, int i11) {
        AbstractC14376f.m15825D(i11, "errorCode");
        this.f63392t0.m19890c(new C20018i(this.f63387o0 + '[' + i10 + "] writeSynReset", this, i10, i11, 2), 0L);
    }

    /* JADX INFO: renamed from: W */
    public final void m20819W(int i10, long j10) {
        this.f63392t0.m19890c(new C20021l(this.f63387o0 + '[' + i10 + "] windowUpdate", this, i10, j10), 0L);
    }

    /* JADX INFO: renamed from: a */
    public final void m20820a(int i10, int i11, IOException iOException) {
        int i12;
        Object[] array;
        AbstractC14376f.m15825D(i10, "connectionCode");
        AbstractC14376f.m15825D(i11, "streamCode");
        byte[] bArr = AbstractC17708b.f56536a;
        try {
            m20815E(i10);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f63386Z.isEmpty()) {
                array = null;
            } else {
                array = this.f63386Z.values().toArray(new C20030u[0]);
                this.f63386Z.clear();
            }
        }
        C20030u[] c20030uArr = (C20030u[]) array;
        if (c20030uArr != null) {
            for (C20030u c20030u : c20030uArr) {
                try {
                    c20030u.m20836c(i11, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f63382I0.close();
        } catch (IOException unused3) {
        }
        try {
            this.f63381H0.close();
        } catch (IOException unused4) {
        }
        this.f63392t0.m19892e();
        this.f63393u0.m19892e();
        this.f63394v0.m19892e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m20820a(1, 9, null);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized C20030u m20821e(int i10) {
        return (C20030u) this.f63386Z.get(Integer.valueOf(i10));
    }

    public final void flush() {
        this.f63382I0.flush();
    }

    /* JADX INFO: renamed from: k */
    public final synchronized boolean m20822k(long j10) {
        if (this.f63390r0) {
            return false;
        }
        return this.f63398z0 >= this.f63397y0 || j10 < this.f63374A0;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized C20030u m20823m(int i10) {
        C20030u c20030u;
        c20030u = (C20030u) this.f63386Z.remove(Integer.valueOf(i10));
        notifyAll();
        return c20030u;
    }
}
