package to;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p026Ao.C0665N;
import p026Ao.C0675i;
import p026Ao.InterfaceC0663L;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: to.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C20028s implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public final long f63421Y;

    /* JADX INFO: renamed from: Z */
    public boolean f63422Z;

    /* JADX INFO: renamed from: o0 */
    public final C0675i f63423o0 = new C0675i();

    /* JADX INFO: renamed from: p0 */
    public final C0675i f63424p0 = new C0675i();

    /* JADX INFO: renamed from: q0 */
    public boolean f63425q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C20030u f63426r0;

    public C20028s(C20030u c20030u, long j10, boolean z6) {
        this.f63426r0 = c20030u;
        this.f63421Y = j10;
        this.f63422Z = z6;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) throws Throwable {
        Throwable c20035z;
        boolean z6;
        long jMo1325H;
        AbstractC16544l.m18094g(sink, "sink");
        long j11 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        while (true) {
            C20030u c20030u = this.f63426r0;
            synchronized (c20030u) {
                c20030u.f63438k.m1413i();
                try {
                    if (c20030u.m20839f() == 0 || this.f63422Z) {
                        c20035z = null;
                    } else {
                        c20035z = c20030u.f63441n;
                        if (c20035z == null) {
                            int iM20839f = c20030u.m20839f();
                            AbstractC14376f.m15824C(iM20839f);
                            c20035z = new C20035z(iM20839f);
                        }
                    }
                    if (this.f63425q0) {
                        throw new IOException("stream closed");
                    }
                    C0675i c0675i = this.f63424p0;
                    long j12 = c0675i.f1970Z;
                    z6 = false;
                    if (j12 > j11) {
                        jMo1325H = c0675i.mo1325H(sink, Math.min(j10, j12));
                        long j13 = c20030u.f63430c + jMo1325H;
                        c20030u.f63430c = j13;
                        long j14 = j13 - c20030u.f63431d;
                        if (c20035z == null && j14 >= c20030u.f63429b.f63375B0.m20855a() / 2) {
                            c20030u.f63429b.m20819W(c20030u.f63428a, j14);
                            c20030u.f63431d = c20030u.f63430c;
                        }
                    } else {
                        if (!this.f63422Z && c20035z == null) {
                            c20030u.m20845l();
                            z6 = true;
                        }
                        jMo1325H = -1;
                    }
                    c20030u.f63438k.m20833l();
                } catch (Throwable th2) {
                    c20030u.f63438k.m20833l();
                    throw th2;
                }
            }
            if (!z6) {
                if (jMo1325H != -1) {
                    return jMo1325H;
                }
                if (c20035z == null) {
                    return -1L;
                }
                throw c20035z;
            }
            j11 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j10;
        C20030u c20030u = this.f63426r0;
        synchronized (c20030u) {
            this.f63425q0 = true;
            C0675i c0675i = this.f63424p0;
            j10 = c0675i.f1970Z;
            c0675i.m1429a();
            c20030u.notifyAll();
        }
        if (j10 > 0) {
            byte[] bArr = AbstractC17708b.f56536a;
            this.f63426r0.f63429b.m20816P(j10);
        }
        this.f63426r0.m20834a();
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return this.f63426r0.f63438k;
    }
}
