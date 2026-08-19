package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0671e implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1951Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Object f1952Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f1953o0;

    public C0671e(InputStream input, C0665N c0665n) {
        AbstractC16544l.m18094g(input, "input");
        this.f1952Z = input;
        this.f1953o0 = c0665n;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) {
        switch (this.f1951Y) {
            case 0:
                AbstractC16544l.m18094g(sink, "sink");
                C0671e c0671e = (C0671e) this.f1953o0;
                C0662K c0662k = (C0662K) this.f1952Z;
                c0662k.m1413i();
                try {
                    try {
                        long jMo1325H = c0671e.mo1325H(sink, j10);
                        if (c0662k.m1414j()) {
                            throw c0662k.m1386l(null);
                        }
                        return jMo1325H;
                    } catch (IOException e10) {
                        if (c0662k.m1414j()) {
                            throw c0662k.m1386l(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th2) {
                    c0662k.m1414j();
                    throw th2;
                }
            default:
                AbstractC16544l.m18094g(sink, "sink");
                if (j10 == 0) {
                    return 0L;
                }
                if (j10 < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
                }
                try {
                    ((C0665N) this.f1953o0).mo1388f();
                    C0658G c0658gM1431b1 = sink.m1431b1(1);
                    int i10 = ((InputStream) this.f1952Z).read(c0658gM1431b1.f1924a, c0658gM1431b1.f1926c, (int) Math.min(j10, 8192 - c0658gM1431b1.f1926c));
                    if (i10 == -1) {
                        if (c0658gM1431b1.f1925b == c0658gM1431b1.f1926c) {
                            sink.f1969Y = c0658gM1431b1.m1364a();
                            AbstractC0659H.m1368a(c0658gM1431b1);
                        }
                        return -1L;
                    }
                    c0658gM1431b1.f1926c += i10;
                    long j11 = i10;
                    sink.f1970Z += j11;
                    return j11;
                } catch (AssertionError e11) {
                    if (AbstractC0668b.m1406f(e11)) {
                        throw new IOException(e11);
                    }
                    throw e11;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f1951Y) {
            case 0:
                C0671e c0671e = (C0671e) this.f1953o0;
                C0662K c0662k = (C0662K) this.f1952Z;
                c0662k.m1413i();
                try {
                    try {
                        c0671e.close();
                        if (c0662k.m1414j()) {
                            throw c0662k.m1386l(null);
                        }
                        return;
                    } catch (IOException e10) {
                        if (!c0662k.m1414j()) {
                            throw e10;
                        }
                        throw c0662k.m1386l(e10);
                    }
                } catch (Throwable th2) {
                    c0662k.m1414j();
                    throw th2;
                }
            default:
                ((InputStream) this.f1952Z).close();
                return;
        }
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        switch (this.f1951Y) {
            case 0:
                return (C0662K) this.f1952Z;
            default:
                return (C0665N) this.f1953o0;
        }
    }

    public final String toString() {
        switch (this.f1951Y) {
            case 0:
                return "AsyncTimeout.source(" + ((C0671e) this.f1953o0) + ')';
            default:
                return "source(" + ((InputStream) this.f1952Z) + ')';
        }
    }

    public C0671e(C0662K c0662k, C0671e c0671e) {
        this.f1952Z = c0662k;
        this.f1953o0 = c0671e;
    }
}
