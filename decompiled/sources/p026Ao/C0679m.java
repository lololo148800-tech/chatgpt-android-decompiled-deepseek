package p026Ao;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p008A6.C0386f;
import p888m8.C17198c;

/* JADX INFO: renamed from: Ao.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C0679m implements InterfaceC0661J {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1975Y;

    /* JADX INFO: renamed from: Z */
    public boolean f1976Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f1977o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f1978p0;

    public /* synthetic */ C0679m(InterfaceC0661J interfaceC0661J, Object obj, int i10) {
        this.f1975Y = i10;
        this.f1977o0 = interfaceC0661J;
        this.f1978p0 = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m1453a(boolean z6) throws IOException {
        C0658G c0658gM1431b1;
        int iDeflate;
        C0656E c0656e = (C0656E) this.f1977o0;
        C0675i c0675i = c0656e.f1919Z;
        while (true) {
            c0658gM1431b1 = c0675i.m1431b1(1);
            Deflater deflater = (Deflater) this.f1978p0;
            byte[] bArr = c0658gM1431b1.f1924a;
            if (z6) {
                try {
                    int i10 = c0658gM1431b1.f1926c;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                int i11 = c0658gM1431b1.f1926c;
                iDeflate = deflater.deflate(bArr, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                c0658gM1431b1.f1926c += iDeflate;
                c0675i.f1970Z += (long) iDeflate;
                c0656e.m1330a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c0658gM1431b1.f1925b == c0658gM1431b1.f1926c) {
            c0675i.f1969Y = c0658gM1431b1.m1364a();
            AbstractC0659H.m1368a(c0658gM1431b1);
        }
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        switch (this.f1975Y) {
            case 0:
                Deflater deflater = (Deflater) this.f1978p0;
                if (this.f1976Z) {
                    return;
                }
                deflater.finish();
                m1453a(false);
                th = null;
                try {
                    deflater.end();
                    break;
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((C0656E) this.f1977o0).close();
                    break;
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.f1976Z = true;
                if (th != null) {
                    throw th;
                }
                return;
            case 1:
                try {
                    ((InterfaceC0661J) this.f1977o0).close();
                    return;
                } catch (IOException e10) {
                    this.f1976Z = true;
                    ((C0386f) this.f1978p0).invoke(e10);
                    return;
                }
            default:
                if (this.f1976Z) {
                    return;
                }
                this.f1976Z = true;
                C17198c c17198c = (C17198c) this.f1978p0;
                c17198c.getClass();
                C0686t c0686t = (C0686t) this.f1977o0;
                C0665N c0665n = c0686t.f1996e;
                c0686t.f1996e = C0665N.f1937d;
                c0665n.mo1390a();
                c0665n.mo1391b();
                c17198c.f54900a = 3;
                return;
        }
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f1975Y) {
            case 0:
                m1453a(true);
                ((C0656E) this.f1977o0).flush();
                break;
            case 1:
                try {
                    ((InterfaceC0661J) this.f1977o0).flush();
                } catch (IOException e10) {
                    this.f1976Z = true;
                    ((C0386f) this.f1978p0).invoke(e10);
                    return;
                }
                break;
            default:
                if (!this.f1976Z) {
                    ((C0656E) ((C17198c) this.f1978p0).f54904e).flush();
                    break;
                }
                break;
        }
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: h */
    public final C0665N mo1335h() {
        switch (this.f1975Y) {
            case 0:
                return ((C0656E) this.f1977o0).f1918Y.mo1335h();
            case 1:
                return ((InterfaceC0661J) this.f1977o0).mo1335h();
            default:
                return (C0686t) this.f1977o0;
        }
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public final void mo1338n0(C0675i source, long j10) throws IOException {
        switch (this.f1975Y) {
            case 0:
                AbstractC16544l.m18094g(source, "source");
                AbstractC0668b.m1405e(source.f1970Z, 0L, j10);
                while (j10 > 0) {
                    C0658G c0658g = source.f1969Y;
                    AbstractC16544l.m18091d(c0658g);
                    int iMin = (int) Math.min(j10, c0658g.f1926c - c0658g.f1925b);
                    ((Deflater) this.f1978p0).setInput(c0658g.f1924a, c0658g.f1925b, iMin);
                    m1453a(false);
                    long j11 = iMin;
                    source.f1970Z -= j11;
                    int i10 = c0658g.f1925b + iMin;
                    c0658g.f1925b = i10;
                    if (i10 == c0658g.f1926c) {
                        source.f1969Y = c0658g.m1364a();
                        AbstractC0659H.m1368a(c0658g);
                    }
                    j10 -= j11;
                }
                return;
            case 1:
                if (this.f1976Z) {
                    source.skip(j10);
                    return;
                }
                try {
                    ((InterfaceC0661J) this.f1977o0).mo1338n0(source, j10);
                    return;
                } catch (IOException e10) {
                    this.f1976Z = true;
                    ((C0386f) this.f1978p0).invoke(e10);
                    return;
                }
            default:
                AbstractC16544l.m18094g(source, "source");
                if (this.f1976Z) {
                    throw new IllegalStateException("closed");
                }
                AbstractC17708b.m19411c(source.f1970Z, 0L, j10);
                ((C0656E) ((C17198c) this.f1978p0).f54904e).mo1338n0(source, j10);
                return;
        }
    }

    public String toString() {
        switch (this.f1975Y) {
            case 0:
                return "DeflaterSink(" + ((C0656E) this.f1977o0) + ')';
            default:
                return super.toString();
        }
    }

    public C0679m(C17198c c17198c) {
        this.f1975Y = 2;
        this.f1978p0 = c17198c;
        this.f1977o0 = new C0686t(((C0656E) c17198c.f54904e).f1918Y.mo1335h());
    }
}
