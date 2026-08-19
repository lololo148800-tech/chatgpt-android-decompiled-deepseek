package p974qo;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC16544l;
import p005A3.C0326m;
import p026Ao.AbstractC0684r;
import p026Ao.C0675i;
import p026Ao.InterfaceC0661J;
import p571X9.AbstractC9306j0;
import p628Zk.GwZB.tpXhEMGxfXFVSh;

/* JADX INFO: renamed from: qo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C18786b extends AbstractC0684r {

    /* JADX INFO: renamed from: Z */
    public final long f59693Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f59694o0;

    /* JADX INFO: renamed from: p0 */
    public long f59695p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f59696q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C0326m f59697r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18786b(C0326m c0326m, InterfaceC0661J delegate, long j10) {
        super(delegate);
        AbstractC16544l.m18094g(delegate, "delegate");
        this.f59697r0 = c0326m;
        this.f59693Z = j10;
    }

    /* JADX INFO: renamed from: a */
    public final IOException m20054a(IOException iOException) {
        if (this.f59694o0) {
            return iOException;
        }
        this.f59694o0 = true;
        return this.f59697r0.m955m(false, true, iOException);
    }

    @Override // p026Ao.AbstractC0684r, p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f59696q0) {
            return;
        }
        this.f59696q0 = true;
        long j10 = this.f59693Z;
        if (j10 != -1 && this.f59695p0 != j10) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            m20054a(null);
        } catch (IOException e10) {
            throw m20054a(e10);
        }
    }

    @Override // p026Ao.AbstractC0684r, p026Ao.InterfaceC0661J, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e10) {
            throw m20054a(e10);
        }
    }

    @Override // p026Ao.AbstractC0684r, p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public final void mo1338n0(C0675i c0675i, long j10) throws IOException {
        AbstractC16544l.m18094g(c0675i, tpXhEMGxfXFVSh.HDOmna);
        if (this.f59696q0) {
            throw new IllegalStateException("closed");
        }
        long j11 = this.f59693Z;
        if (j11 != -1 && this.f59695p0 + j10 > j11) {
            StringBuilder sbM9894m = AbstractC9306j0.m9894m("expected ", j11, " bytes but received ");
            sbM9894m.append(this.f59695p0 + j10);
            throw new ProtocolException(sbM9894m.toString());
        }
        try {
            super.mo1338n0(c0675i, j10);
            this.f59695p0 += j10;
        } catch (IOException e10) {
            throw m20054a(e10);
        }
    }
}
