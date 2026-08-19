package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C0687u implements InterfaceC0661J {

    /* JADX INFO: renamed from: Y */
    public final C0656E f1997Y;

    /* JADX INFO: renamed from: Z */
    public final Deflater f1998Z;

    /* JADX INFO: renamed from: o0 */
    public final C0679m f1999o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f2000p0;

    /* JADX INFO: renamed from: q0 */
    public final CRC32 f2001q0;

    public C0687u(InterfaceC0676j interfaceC0676j) {
        C0656E c0656e = new C0656E(interfaceC0676j);
        this.f1997Y = c0656e;
        Deflater deflater = new Deflater(-1, true);
        this.f1998Z = deflater;
        this.f1999o0 = new C0679m(c0656e, deflater, 0);
        this.f2001q0 = new CRC32();
        C0675i c0675i = c0656e.f1919Z;
        c0675i.m1441j1(8075);
        c0675i.m1436f1(8);
        c0675i.m1436f1(0);
        c0675i.m1439i1(0);
        c0675i.m1436f1(0);
        c0675i.m1436f1(0);
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        Deflater deflater = this.f1998Z;
        C0656E c0656e = this.f1997Y;
        if (this.f2000p0) {
            return;
        }
        try {
            C0679m c0679m = this.f1999o0;
            ((Deflater) c0679m.f1978p0).finish();
            c0679m.m1453a(false);
            int value = (int) this.f2001q0.getValue();
            if (c0656e.f1920o0) {
                throw new IllegalStateException("closed");
            }
            int iM1408h = AbstractC0668b.m1408h(value);
            C0675i c0675i = c0656e.f1919Z;
            c0675i.m1439i1(iM1408h);
            c0656e.m1330a();
            int bytesRead = (int) deflater.getBytesRead();
            if (c0656e.f1920o0) {
                throw new IllegalStateException("closed");
            }
            c0675i.m1439i1(AbstractC0668b.m1408h(bytesRead));
            c0656e.m1330a();
            th = null;
            try {
                deflater.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                c0656e.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f2000p0 = true;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Flushable
    public final void flush() throws IOException {
        this.f1999o0.flush();
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: h */
    public final C0665N mo1335h() {
        return this.f1997Y.f1918Y.mo1335h();
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public final void mo1338n0(C0675i source, long j10) throws IOException {
        AbstractC16544l.m18094g(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        if (j10 == 0) {
            return;
        }
        C0658G c0658g = source.f1969Y;
        AbstractC16544l.m18091d(c0658g);
        long j11 = j10;
        while (j11 > 0) {
            int iMin = (int) Math.min(j11, c0658g.f1926c - c0658g.f1925b);
            this.f2001q0.update(c0658g.f1924a, c0658g.f1925b, iMin);
            j11 -= (long) iMin;
            c0658g = c0658g.f1929f;
            AbstractC16544l.m18091d(c0658g);
        }
        this.f1999o0.mo1338n0(source, j10);
    }
}
