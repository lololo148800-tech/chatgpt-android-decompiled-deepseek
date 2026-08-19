package p026Ao;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C0656E implements InterfaceC0676j {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC0661J f1918Y;

    /* JADX INFO: renamed from: Z */
    public final C0675i f1919Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f1920o0;

    public C0656E(InterfaceC0661J sink) {
        AbstractC16544l.m18094g(sink, "sink");
        this.f1918Y = sink;
        this.f1919Z = new C0675i();
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: A0 */
    public final InterfaceC0676j mo1327A0(byte[] source) {
        AbstractC16544l.m18094g(source, "source");
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        this.f1919Z.m1433d1(source);
        m1330a();
        return this;
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: M */
    public final InterfaceC0676j mo1328M(int i10) {
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        this.f1919Z.m1436f1(i10);
        m1330a();
        return this;
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: Q0 */
    public final InterfaceC0676j mo1329Q0(long j10) {
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        this.f1919Z.m1437g1(j10);
        m1330a();
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0676j m1330a() {
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        C0675i c0675i = this.f1919Z;
        long jM1442k = c0675i.m1442k();
        if (jM1442k > 0) {
            this.f1918Y.mo1338n0(c0675i, jM1442k);
        }
        return this;
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: b */
    public final C0675i mo1331b() {
        return this.f1919Z;
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC0676j mo1332b0(C0678l byteString) {
        AbstractC16544l.m18094g(byteString, "byteString");
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        this.f1919Z.m1432c1(byteString);
        m1330a();
        return this;
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: c0 */
    public final InterfaceC0676j mo1333c0(String string) {
        AbstractC16544l.m18094g(string, "string");
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        this.f1919Z.m1444l1(string);
        m1330a();
        return this;
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        InterfaceC0661J interfaceC0661J = this.f1918Y;
        if (this.f1920o0) {
            return;
        }
        C0675i c0675i = this.f1919Z;
        long j10 = c0675i.f1970Z;
        if (j10 > 0) {
            interfaceC0661J.mo1338n0(c0675i, j10);
        }
        th = null;
        try {
            interfaceC0661J.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f1920o0 = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0676j m1334e(int i10) {
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        this.f1919Z.m1439i1(i10);
        m1330a();
        return this;
    }

    @Override // p026Ao.InterfaceC0676j, p026Ao.InterfaceC0661J, java.io.Flushable
    public final void flush() {
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        C0675i c0675i = this.f1919Z;
        long j10 = c0675i.f1970Z;
        InterfaceC0661J interfaceC0661J = this.f1918Y;
        if (j10 > 0) {
            interfaceC0661J.mo1338n0(c0675i, j10);
        }
        interfaceC0661J.flush();
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: h */
    public final C0665N mo1335h() {
        return this.f1918Y.mo1335h();
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: h0 */
    public final InterfaceC0676j mo1336h0(byte[] bArr, int i10, int i11) {
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        this.f1919Z.m1435e1(bArr, i10, i11);
        m1330a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1920o0;
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: l0 */
    public final InterfaceC0676j mo1337l0(int i10, int i11, String string) {
        AbstractC16544l.m18094g(string, "string");
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        this.f1919Z.m1443k1(i10, i11, string);
        m1330a();
        return this;
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public final void mo1338n0(C0675i source, long j10) {
        AbstractC16544l.m18094g(source, "source");
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        this.f1919Z.mo1338n0(source, j10);
        m1330a();
    }

    public final String toString() {
        return "buffer(" + this.f1918Y + ')';
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: u */
    public final long mo1339u(InterfaceC0663L interfaceC0663L) {
        long j10 = 0;
        while (true) {
            long jMo1325H = ((C0671e) interfaceC0663L).mo1325H(this.f1919Z, 8192L);
            if (jMo1325H == -1) {
                return j10;
            }
            j10 += jMo1325H;
            m1330a();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC16544l.m18094g(source, "source");
        if (this.f1920o0) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f1919Z.write(source);
        m1330a();
        return iWrite;
    }
}
