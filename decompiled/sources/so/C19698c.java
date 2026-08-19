package so;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import mo.C17348o;
import mo.C17349p;
import mo.C17356w;
import no.AbstractC17708b;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p084D4.C1918i;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7966P5;
import p888m8.C17198c;
import p974qo.C18795k;
import ro.AbstractC19260d;

/* JADX INFO: renamed from: so.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C19698c extends AbstractC19696a {

    /* JADX INFO: renamed from: p0 */
    public final C17349p f62392p0;

    /* JADX INFO: renamed from: q0 */
    public long f62393q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f62394r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C17198c f62395s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19698c(C17198c c17198c, C17349p url) {
        super(c17198c);
        AbstractC16544l.m18094g(url, "url");
        this.f62395s0 = c17198c;
        this.f62392p0 = url;
        this.f62393q0 = -1L;
        this.f62394r0 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f62387Z) {
            return;
        }
        if (this.f62394r0 && !AbstractC17708b.m19417i(this, TimeUnit.MILLISECONDS)) {
            ((C18795k) this.f62395s0.f54902c).m20080l();
            m20660a();
        }
        this.f62387Z = true;
    }

    @Override // so.AbstractC19696a, p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) throws IOException {
        C0675i c0675i;
        long j11;
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        if (this.f62387Z) {
            throw new IllegalStateException("closed");
        }
        if (!this.f62394r0) {
            return -1L;
        }
        long j12 = this.f62393q0;
        C17198c c17198c = this.f62395s0;
        if (j12 == 0 || j12 == -1) {
            if (j12 != -1) {
                ((C0657F) c17198c.f54903d).mo1363t0();
            }
            try {
                C0657F c0657f = (C0657F) c17198c.f54903d;
                c0657f.mo1362s(1L);
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    boolean zMo1359l = c0657f.mo1359l(i11);
                    c0675i = c0657f.f1922Z;
                    if (!zMo1359l) {
                        break;
                    }
                    byte bM1422T = c0675i.m1422T(i10);
                    if ((bM1422T >= 48 && bM1422T <= 57) || ((bM1422T >= 97 && bM1422T <= 102) || (bM1422T >= 65 && bM1422T <= 70))) {
                        i10 = i11;
                    }
                    if (i10 != 0) {
                        break;
                    }
                    AbstractC7966P5.m8254b(16);
                    String string = Integer.toString(bM1422T, 16);
                    AbstractC16544l.m18093f(string, "toString(...)");
                    throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
                }
                this.f62393q0 = c0675i.m1419J0();
                String string2 = AbstractC21322p.m21711s0(((C0657F) c17198c.f54903d).m1350W(Long.MAX_VALUE)).toString();
                if (this.f62393q0 < 0 || (string2.length() > 0 && !AbstractC21329w.m21734u(string2, Separators.SEMICOLON, false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f62393q0 + string2 + '\"');
                }
                if (this.f62393q0 == 0) {
                    this.f62394r0 = false;
                    c17198c.f54906g = ((C1918i) c17198c.f54905f).m3060r();
                    C17356w c17356w = (C17356w) c17198c.f54901b;
                    AbstractC16544l.m18091d(c17356w);
                    C17348o c17348o = (C17348o) c17198c.f54906g;
                    AbstractC16544l.m18091d(c17348o);
                    AbstractC19260d.m20333b(c17356w.f55366v0, this.f62392p0, c17348o);
                    m20660a();
                }
                if (!this.f62394r0) {
                    return -1L;
                }
                j11 = -1;
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        } else {
            j11 = -1;
        }
        long jMo1325H = super.mo1325H(sink, Math.min(j10, this.f62393q0));
        if (jMo1325H != j11) {
            this.f62393q0 -= jMo1325H;
            return jMo1325H;
        }
        ((C18795k) c17198c.f54902c).m20080l();
        ProtocolException protocolException = new ProtocolException(HJrCuD.Kmzuic);
        m20660a();
        throw protocolException;
    }
}
