package to;

import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p026Ao.C0665N;
import p026Ao.C0675i;
import p026Ao.InterfaceC0661J;

/* JADX INFO: renamed from: to.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C20027r implements InterfaceC0661J {

    /* JADX INFO: renamed from: Y */
    public final boolean f63417Y;

    /* JADX INFO: renamed from: Z */
    public final C0675i f63418Z = new C0675i();

    /* JADX INFO: renamed from: o0 */
    public boolean f63419o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20030u f63420p0;

    public C20027r(C20030u c20030u, boolean z6) {
        this.f63420p0 = c20030u;
        this.f63417Y = z6;
    }

    /* JADX INFO: renamed from: a */
    public final void m20832a(boolean z6) {
        long jMin;
        boolean z10;
        C20030u c20030u = this.f63420p0;
        synchronized (c20030u) {
            c20030u.f63439l.m1413i();
            while (c20030u.f63432e >= c20030u.f63433f && !this.f63417Y && !this.f63419o0 && c20030u.m20839f() == 0) {
                try {
                    c20030u.m20845l();
                } catch (Throwable th2) {
                    c20030u.f63439l.m20833l();
                    throw th2;
                }
            }
            c20030u.f63439l.m20833l();
            c20030u.m20835b();
            jMin = Math.min(c20030u.f63433f - c20030u.f63432e, this.f63418Z.f1970Z);
            c20030u.f63432e += jMin;
            z10 = z6 && jMin == this.f63418Z.f1970Z;
        }
        this.f63420p0.f63439l.m1413i();
        try {
            C20030u c20030u2 = this.f63420p0;
            c20030u2.f63429b.m20817S(c20030u2.f63428a, z10, this.f63418Z, jMin);
        } finally {
            this.f63420p0.f63439l.m20833l();
        }
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        C20030u c20030u = this.f63420p0;
        byte[] bArr = AbstractC17708b.f56536a;
        synchronized (c20030u) {
            if (this.f63419o0) {
                return;
            }
            boolean z6 = c20030u.m20839f() == 0;
            C20030u c20030u2 = this.f63420p0;
            if (!c20030u2.f63437j.f63417Y) {
                if (this.f63418Z.f1970Z > 0) {
                    while (this.f63418Z.f1970Z > 0) {
                        m20832a(true);
                    }
                } else if (z6) {
                    c20030u2.f63429b.m20817S(c20030u2.f63428a, true, null, 0L);
                }
            }
            synchronized (this.f63420p0) {
                this.f63419o0 = true;
            }
            this.f63420p0.f63429b.flush();
            this.f63420p0.m20834a();
        }
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Flushable
    public final void flush() {
        C20030u c20030u = this.f63420p0;
        byte[] bArr = AbstractC17708b.f56536a;
        synchronized (c20030u) {
            c20030u.m20835b();
        }
        while (this.f63418Z.f1970Z > 0) {
            m20832a(false);
            this.f63420p0.f63429b.flush();
        }
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: h */
    public final C0665N mo1335h() {
        return this.f63420p0.f63439l;
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public final void mo1338n0(C0675i source, long j10) {
        AbstractC16544l.m18094g(source, "source");
        byte[] bArr = AbstractC17708b.f56536a;
        C0675i c0675i = this.f63418Z;
        c0675i.mo1338n0(source, j10);
        while (c0675i.f1970Z >= 16384) {
            m20832a(false);
        }
    }
}
