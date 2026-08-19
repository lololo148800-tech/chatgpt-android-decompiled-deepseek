package to;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p026Ao.C0657F;
import p026Ao.C0665N;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.InterfaceC0663L;

/* JADX INFO: renamed from: to.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C20025p implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public final C0657F f63407Y;

    /* JADX INFO: renamed from: Z */
    public int f63408Z;

    /* JADX INFO: renamed from: o0 */
    public int f63409o0;

    /* JADX INFO: renamed from: p0 */
    public int f63410p0;

    /* JADX INFO: renamed from: q0 */
    public int f63411q0;

    /* JADX INFO: renamed from: r0 */
    public int f63412r0;

    public C20025p(C0657F source) {
        AbstractC16544l.m18094g(source, "source");
        this.f63407Y = source;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) throws IOException {
        int i10;
        int iM1358k;
        AbstractC16544l.m18094g(sink, "sink");
        do {
            int i11 = this.f63411q0;
            C0657F c0657f = this.f63407Y;
            if (i11 != 0) {
                long jMo1325H = c0657f.mo1325H(sink, Math.min(j10, i11));
                if (jMo1325H == -1) {
                    return -1L;
                }
                this.f63411q0 -= (int) jMo1325H;
                return jMo1325H;
            }
            c0657f.skip(this.f63412r0);
            this.f63412r0 = 0;
            if ((this.f63409o0 & 4) != 0) {
                return -1L;
            }
            i10 = this.f63410p0;
            int iM19429u = AbstractC17708b.m19429u(c0657f);
            this.f63411q0 = iM19429u;
            this.f63408Z = iM19429u;
            int i12 = c0657f.readByte() & 255;
            this.f63409o0 = c0657f.readByte() & 255;
            Logger logger = C20026q.f63413p0;
            if (logger.isLoggable(Level.FINE)) {
                C0678l c0678l = AbstractC20014e.f63350a;
                logger.fine(AbstractC20014e.m20813a(true, this.f63410p0, this.f63408Z, i12, this.f63409o0));
            }
            iM1358k = c0657f.m1358k() & Integer.MAX_VALUE;
            this.f63410p0 = iM1358k;
            if (i12 != 9) {
                throw new IOException(i12 + " != TYPE_CONTINUATION");
            }
        } while (iM1358k == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return this.f63407Y.f1921Y.mo1326h();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
