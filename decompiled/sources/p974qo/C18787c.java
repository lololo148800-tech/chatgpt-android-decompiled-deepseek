package p974qo;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC16544l;
import p005A3.C0326m;
import p026Ao.AbstractC0685s;
import p026Ao.C0675i;
import p026Ao.InterfaceC0663L;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: qo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C18787c extends AbstractC0685s {

    /* JADX INFO: renamed from: Z */
    public final long f59698Z;

    /* JADX INFO: renamed from: o0 */
    public long f59699o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f59700p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f59701q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f59702r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C0326m f59703s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18787c(C0326m c0326m, InterfaceC0663L delegate, long j10) {
        super(delegate);
        AbstractC16544l.m18094g(delegate, "delegate");
        this.f59703s0 = c0326m;
        this.f59698Z = j10;
        this.f59700p0 = true;
        if (j10 == 0) {
            m20055a(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final IOException m20055a(IOException iOException) {
        if (this.f59701q0) {
            return iOException;
        }
        this.f59701q0 = true;
        C0326m c0326m = this.f59703s0;
        if (iOException == null && this.f59700p0) {
            this.f59700p0 = false;
            c0326m.getClass();
            C18792h call = (C18792h) c0326m.f1140b;
            AbstractC16544l.m18094g(call, "call");
        }
        return c0326m.m955m(true, false, iOException);
    }

    @Override // p026Ao.AbstractC0685s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f59702r0) {
            return;
        }
        this.f59702r0 = true;
        try {
            super.close();
            m20055a(null);
        } catch (IOException e10) {
            throw m20055a(e10);
        }
    }

    @Override // p026Ao.AbstractC0685s, p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) throws IOException {
        AbstractC16544l.m18094g(sink, "sink");
        if (this.f59702r0) {
            throw new IllegalStateException("closed");
        }
        try {
            long jMo1325H = this.f1995Y.mo1325H(sink, j10);
            if (this.f59700p0) {
                this.f59700p0 = false;
                C0326m c0326m = this.f59703s0;
                c0326m.getClass();
                AbstractC16544l.m18094g((C18792h) c0326m.f1140b, sVDIzpC.VwrncdJVTGnhM);
            }
            if (jMo1325H == -1) {
                m20055a(null);
                return -1L;
            }
            long j11 = this.f59699o0 + jMo1325H;
            long j12 = this.f59698Z;
            if (j12 == -1 || j11 <= j12) {
                this.f59699o0 = j11;
                if (j11 == j12) {
                    m20055a(null);
                }
                return jMo1325H;
            }
            throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
        } catch (IOException e10) {
            throw m20055a(e10);
        }
    }
}
