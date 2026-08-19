package so;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0675i;

/* JADX INFO: renamed from: so.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C19700e extends AbstractC19696a {

    /* JADX INFO: renamed from: p0 */
    public boolean f62398p0;

    @Override // so.AbstractC19696a, p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) throws IOException {
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        if (this.f62387Z) {
            throw new IllegalStateException("closed");
        }
        if (this.f62398p0) {
            return -1L;
        }
        long jMo1325H = super.mo1325H(sink, j10);
        if (jMo1325H != -1) {
            return jMo1325H;
        }
        this.f62398p0 = true;
        m20660a();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f62387Z) {
            return;
        }
        if (!this.f62398p0) {
            m20660a();
        }
        this.f62387Z = true;
    }
}
