package so;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p026Ao.C0675i;
import p888m8.C17198c;
import p974qo.C18795k;

/* JADX INFO: renamed from: so.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C19699d extends AbstractC19696a {

    /* JADX INFO: renamed from: p0 */
    public long f62396p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17198c f62397q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19699d(C17198c c17198c, long j10) {
        super(c17198c);
        this.f62397q0 = c17198c;
        this.f62396p0 = j10;
        if (j10 == 0) {
            m20660a();
        }
    }

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
        long j11 = this.f62396p0;
        if (j11 == 0) {
            return -1L;
        }
        long jMo1325H = super.mo1325H(sink, Math.min(j11, j10));
        if (jMo1325H == -1) {
            ((C18795k) this.f62397q0.f54902c).m20080l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m20660a();
            throw protocolException;
        }
        long j12 = this.f62396p0 - jMo1325H;
        this.f62396p0 = j12;
        if (j12 == 0) {
            m20660a();
        }
        return jMo1325H;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f62387Z) {
            return;
        }
        if (this.f62396p0 != 0 && !AbstractC17708b.m19417i(this, TimeUnit.MILLISECONDS)) {
            ((C18795k) this.f62397q0.f54902c).m20080l();
            m20660a();
        }
        this.f62387Z = true;
    }
}
