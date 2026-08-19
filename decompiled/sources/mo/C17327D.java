package mo;

import java.io.Closeable;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC16544l;
import p005A3.C0326m;
import p026Ao.C0657F;
import p026Ao.C0675i;

/* JADX INFO: renamed from: mo.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C17327D implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final C17358y f55173Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC17357x f55174Z;

    /* JADX INFO: renamed from: o0 */
    public final String f55175o0;

    /* JADX INFO: renamed from: p0 */
    public final int f55176p0;

    /* JADX INFO: renamed from: q0 */
    public final C17347n f55177q0;

    /* JADX INFO: renamed from: r0 */
    public final C17348o f55178r0;

    /* JADX INFO: renamed from: s0 */
    public final AbstractC17329F f55179s0;

    /* JADX INFO: renamed from: t0 */
    public final C17327D f55180t0;

    /* JADX INFO: renamed from: u0 */
    public final C17327D f55181u0;

    /* JADX INFO: renamed from: v0 */
    public final C17327D f55182v0;

    /* JADX INFO: renamed from: w0 */
    public final long f55183w0;

    /* JADX INFO: renamed from: x0 */
    public final long f55184x0;

    /* JADX INFO: renamed from: y0 */
    public final C0326m f55185y0;

    /* JADX INFO: renamed from: z0 */
    public C17336c f55186z0;

    public C17327D(C17358y request, EnumC17357x protocol, String message, int i10, C17347n c17347n, C17348o c17348o, AbstractC17329F abstractC17329F, C17327D c17327d, C17327D c17327d2, C17327D c17327d3, long j10, long j11, C0326m c0326m) {
        AbstractC16544l.m18094g(request, "request");
        AbstractC16544l.m18094g(protocol, "protocol");
        AbstractC16544l.m18094g(message, "message");
        this.f55173Y = request;
        this.f55174Z = protocol;
        this.f55175o0 = message;
        this.f55176p0 = i10;
        this.f55177q0 = c17347n;
        this.f55178r0 = c17348o;
        this.f55179s0 = abstractC17329F;
        this.f55180t0 = c17327d;
        this.f55181u0 = c17327d2;
        this.f55182v0 = c17327d3;
        this.f55183w0 = j10;
        this.f55184x0 = j11;
        this.f55185y0 = c0326m;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18985a() {
        int i10 = this.f55176p0;
        return 200 <= i10 && i10 < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC17329F abstractC17329F = this.f55179s0;
        if (abstractC17329F == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC17329F.close();
    }

    /* JADX INFO: renamed from: e */
    public final C17326C m18986e() {
        C17326C c17326c = new C17326C();
        c17326c.f55160a = this.f55173Y;
        c17326c.f55161b = this.f55174Z;
        c17326c.f55162c = this.f55176p0;
        c17326c.f55163d = this.f55175o0;
        c17326c.f55164e = this.f55177q0;
        c17326c.f55165f = this.f55178r0.m19016q();
        c17326c.f55166g = this.f55179s0;
        c17326c.f55167h = this.f55180t0;
        c17326c.f55168i = this.f55181u0;
        c17326c.f55169j = this.f55182v0;
        c17326c.f55170k = this.f55183w0;
        c17326c.f55171l = this.f55184x0;
        c17326c.f55172m = this.f55185y0;
        return c17326c;
    }

    /* JADX INFO: renamed from: k */
    public final C17328E m18987k() throws EOFException {
        AbstractC17329F abstractC17329F = this.f55179s0;
        AbstractC16544l.m18091d(abstractC17329F);
        C0657F c0657fPeek = abstractC17329F.mo18988O0().peek();
        C0675i c0675i = new C0675i();
        c0657fPeek.mo1359l(33554432L);
        long jMin = Math.min(33554432L, c0657fPeek.f1922Z.f1970Z);
        while (jMin > 0) {
            long jMo1325H = c0657fPeek.mo1325H(c0675i, jMin);
            if (jMo1325H == -1) {
                throw new EOFException();
            }
            jMin -= jMo1325H;
        }
        return new C17328E(abstractC17329F.mo18990e(), c0675i.f1970Z, c0675i, 0);
    }

    public final String toString() {
        return "Response{protocol=" + this.f55174Z + ", code=" + this.f55176p0 + ", message=" + this.f55175o0 + ", url=" + this.f55173Y.f55379a + '}';
    }
}
