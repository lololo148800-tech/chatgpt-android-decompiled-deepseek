package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C0680n implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public final C0690x f1979Y;

    /* JADX INFO: renamed from: Z */
    public long f1980Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f1981o0;

    public C0680n(C0690x fileHandle, long j10) {
        AbstractC16544l.m18094g(fileHandle, "fileHandle");
        this.f1979Y = fileHandle;
        this.f1980Z = j10;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) {
        long j11;
        long j12;
        int i10;
        int i11;
        AbstractC16544l.m18094g(sink, "sink");
        if (this.f1981o0) {
            throw new IllegalStateException("closed");
        }
        C0690x c0690x = this.f1979Y;
        long j13 = this.f1980Z;
        c0690x.getClass();
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        long j14 = j10 + j13;
        long j15 = j13;
        while (true) {
            if (j15 < j14) {
                C0658G c0658gM1431b1 = sink.m1431b1(1);
                byte[] array = c0658gM1431b1.f1924a;
                int i12 = c0658gM1431b1.f1926c;
                int iMin = (int) Math.min(j14 - j15, 8192 - i12);
                synchronized (c0690x) {
                    AbstractC16544l.m18094g(array, "array");
                    c0690x.f2014p0.seek(j15);
                    i10 = 0;
                    while (true) {
                        if (i10 < iMin) {
                            int i13 = c0690x.f2014p0.read(array, i12, iMin - i10);
                            if (i13 != -1) {
                                i10 += i13;
                            } else if (i10 == 0) {
                                i11 = -1;
                                i10 = -1;
                            }
                        }
                        i11 = -1;
                    }
                }
                if (i10 == i11) {
                    if (c0658gM1431b1.f1925b == c0658gM1431b1.f1926c) {
                        sink.f1969Y = c0658gM1431b1.m1364a();
                        AbstractC0659H.m1368a(c0658gM1431b1);
                    }
                    if (j13 == j15) {
                        j12 = -1;
                        j11 = -1;
                        break;
                    }
                } else {
                    c0658gM1431b1.f1926c += i10;
                    long j16 = i10;
                    j15 += j16;
                    sink.f1970Z += j16;
                }
            }
            j11 = j15 - j13;
            j12 = -1;
            break;
        }
        if (j11 != j12) {
            this.f1980Z += j11;
        }
        return j11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1981o0) {
            return;
        }
        this.f1981o0 = true;
        C0690x c0690x = this.f1979Y;
        ReentrantLock reentrantLock = c0690x.f2013o0;
        reentrantLock.lock();
        try {
            int i10 = c0690x.f2012Z - 1;
            c0690x.f2012Z = i10;
            if (i10 == 0 && c0690x.f2011Y) {
                reentrantLock.unlock();
                synchronized (c0690x) {
                    c0690x.f2014p0.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return C0665N.f1937d;
    }
}
