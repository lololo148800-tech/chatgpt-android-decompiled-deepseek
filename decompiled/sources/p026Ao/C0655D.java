package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C0655D implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC0677k f1912Y;

    /* JADX INFO: renamed from: Z */
    public final C0675i f1913Z;

    /* JADX INFO: renamed from: o0 */
    public C0658G f1914o0;

    /* JADX INFO: renamed from: p0 */
    public int f1915p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f1916q0;

    /* JADX INFO: renamed from: r0 */
    public long f1917r0;

    public C0655D(InterfaceC0677k interfaceC0677k) {
        this.f1912Y = interfaceC0677k;
        C0675i c0675iMo1353b = interfaceC0677k.mo1353b();
        this.f1913Z = c0675iMo1353b;
        C0658G c0658g = c0675iMo1353b.f1969Y;
        this.f1914o0 = c0658g;
        this.f1915p0 = c0658g != null ? c0658g.f1925b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f1925b) goto L15;
     */
    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo1325H(C0675i sink, long j10) {
        C0658G c0658g;
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        if (this.f1916q0) {
            throw new IllegalStateException("closed");
        }
        C0658G c0658g2 = this.f1914o0;
        C0675i c0675i = this.f1913Z;
        if (c0658g2 != null) {
            C0658G c0658g3 = c0675i.f1969Y;
            if (c0658g2 == c0658g3) {
                int i10 = this.f1915p0;
                AbstractC16544l.m18091d(c0658g3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f1912Y.mo1359l(this.f1917r0 + 1)) {
            return -1L;
        }
        if (this.f1914o0 == null && (c0658g = c0675i.f1969Y) != null) {
            this.f1914o0 = c0658g;
            this.f1915p0 = c0658g.f1925b;
        }
        long jMin = Math.min(j10, c0675i.f1970Z - this.f1917r0);
        this.f1913Z.m1421S(sink, this.f1917r0, jMin);
        this.f1917r0 += jMin;
        return jMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1916q0 = true;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return this.f1912Y.mo1326h();
    }
}
