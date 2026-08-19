package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C0689w implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public final C0657F f2007Y;

    /* JADX INFO: renamed from: Z */
    public final Inflater f2008Z;

    /* JADX INFO: renamed from: o0 */
    public int f2009o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f2010p0;

    public C0689w(C0657F c0657f, Inflater inflater) {
        this.f2007Y = c0657f;
        this.f2008Z = inflater;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) throws IOException {
        AbstractC16544l.m18094g(sink, "sink");
        do {
            long jM1469a = m1469a(sink, j10);
            if (jM1469a > 0) {
                return jM1469a;
            }
            Inflater inflater = this.f2008Z;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f2007Y.mo1356g());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX INFO: renamed from: a */
    public final long m1469a(C0675i sink, long j10) throws IOException {
        Inflater inflater = this.f2008Z;
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        if (this.f2010p0) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            C0658G c0658gM1431b1 = sink.m1431b1(1);
            int iMin = (int) Math.min(j10, 8192 - c0658gM1431b1.f1926c);
            boolean zNeedsInput = inflater.needsInput();
            C0657F c0657f = this.f2007Y;
            if (zNeedsInput && !c0657f.mo1356g()) {
                C0658G c0658g = c0657f.f1922Z.f1969Y;
                AbstractC16544l.m18091d(c0658g);
                int i10 = c0658g.f1926c;
                int i11 = c0658g.f1925b;
                int i12 = i10 - i11;
                this.f2009o0 = i12;
                inflater.setInput(c0658g.f1924a, i11, i12);
            }
            int iInflate = inflater.inflate(c0658gM1431b1.f1924a, c0658gM1431b1.f1926c, iMin);
            int i13 = this.f2009o0;
            if (i13 != 0) {
                int remaining = i13 - inflater.getRemaining();
                this.f2009o0 -= remaining;
                c0657f.skip(remaining);
            }
            if (iInflate > 0) {
                c0658gM1431b1.f1926c += iInflate;
                long j11 = iInflate;
                sink.f1970Z += j11;
                return j11;
            }
            if (c0658gM1431b1.f1925b == c0658gM1431b1.f1926c) {
                sink.f1969Y = c0658gM1431b1.m1364a();
                AbstractC0659H.m1368a(c0658gM1431b1);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f2010p0) {
            return;
        }
        this.f2008Z.end();
        this.f2010p0 = true;
        this.f2007Y.close();
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return this.f2007Y.f1921Y.mo1326h();
    }
}
