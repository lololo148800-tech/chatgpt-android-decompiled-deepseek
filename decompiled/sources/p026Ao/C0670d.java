package p026Ao;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0670d implements InterfaceC0661J {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1948Y;

    /* JADX INFO: renamed from: Z */
    public final Object f1949Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f1950o0;

    public /* synthetic */ C0670d(Object obj, int i10, Object obj2) {
        this.f1948Y = i10;
        this.f1949Z = obj;
        this.f1950o0 = obj2;
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        switch (this.f1948Y) {
            case 0:
                C0670d c0670d = (C0670d) this.f1950o0;
                C0662K c0662k = (C0662K) this.f1949Z;
                c0662k.m1413i();
                try {
                    try {
                        c0670d.close();
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
                ((OutputStream) this.f1949Z).close();
                return;
        }
    }

    @Override // p026Ao.InterfaceC0661J, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f1948Y) {
            case 0:
                C0670d c0670d = (C0670d) this.f1950o0;
                C0662K c0662k = (C0662K) this.f1949Z;
                c0662k.m1413i();
                try {
                    try {
                        c0670d.flush();
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
                ((OutputStream) this.f1949Z).flush();
                return;
        }
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: h */
    public final C0665N mo1335h() {
        switch (this.f1948Y) {
            case 0:
                return (C0662K) this.f1949Z;
            default:
                return (C0665N) this.f1950o0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009b A[LOOP:1: B:12:0x0062->B:25:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d A[SYNTHETIC] */
    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public final void mo1338n0(C0675i source, long j10) throws IOException {
        C0662K c0662k;
        switch (this.f1948Y) {
            case 0:
                AbstractC16544l.m18094g(source, "source");
                AbstractC0668b.m1405e(source.f1970Z, 0L, j10);
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    C0658G c0658g = source.f1969Y;
                    AbstractC16544l.m18091d(c0658g);
                    try {
                        try {
                            while (j11 < 65536) {
                                j11 += (long) (c0658g.f1926c - c0658g.f1925b);
                                if (j11 >= j10) {
                                    j11 = j10;
                                    C0670d c0670d = (C0670d) this.f1950o0;
                                    c0662k = (C0662K) this.f1949Z;
                                    c0662k.m1413i();
                                    c0670d.mo1338n0(source, j11);
                                    if (!c0662k.m1414j()) {
                                        throw c0662k.m1386l(null);
                                    }
                                    j10 -= j11;
                                } else {
                                    c0658g = c0658g.f1929f;
                                    AbstractC16544l.m18091d(c0658g);
                                }
                            }
                            c0670d.mo1338n0(source, j11);
                            if (!c0662k.m1414j()) {
                                throw c0662k.m1386l(null);
                            }
                            j10 -= j11;
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
                    C0670d c0670d2 = (C0670d) this.f1950o0;
                    c0662k = (C0662K) this.f1949Z;
                    c0662k.m1413i();
                }
                break;
            default:
                AbstractC16544l.m18094g(source, "source");
                AbstractC0668b.m1405e(source.f1970Z, 0L, j10);
                while (j10 > 0) {
                    ((C0665N) this.f1950o0).mo1388f();
                    C0658G c0658g2 = source.f1969Y;
                    AbstractC16544l.m18091d(c0658g2);
                    int iMin = (int) Math.min(j10, c0658g2.f1926c - c0658g2.f1925b);
                    ((OutputStream) this.f1949Z).write(c0658g2.f1924a, c0658g2.f1925b, iMin);
                    int i10 = c0658g2.f1925b + iMin;
                    c0658g2.f1925b = i10;
                    long j12 = iMin;
                    j10 -= j12;
                    source.f1970Z -= j12;
                    if (i10 == c0658g2.f1926c) {
                        source.f1969Y = c0658g2.m1364a();
                        AbstractC0659H.m1368a(c0658g2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f1948Y) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0670d) this.f1950o0) + ')';
            default:
                return "sink(" + ((OutputStream) this.f1949Z) + ')';
        }
    }
}
