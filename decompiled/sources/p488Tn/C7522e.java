package p488Tn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: Tn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C7522e implements InterfaceC7526i {

    /* JADX INFO: renamed from: Y */
    public final C7520c f23849Y;

    /* JADX INFO: renamed from: Z */
    public boolean f23850Z;

    /* JADX INFO: renamed from: o0 */
    public final C7518a f23851o0 = new C7518a();

    public C7522e(C7520c c7520c) {
        this.f23849Y = c7520c;
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: N */
    public final int mo7814N(byte[] sink, int i10, int i11) {
        AbstractC16544l.m18094g(sink, "sink");
        AbstractC7527j.m7835a(sink.length, i10, i11);
        C7518a c7518a = this.f23851o0;
        if (c7518a.f23841o0 == 0 && this.f23849Y.mo7817U0(c7518a, 8192L) == -1) {
            return -1;
        }
        return c7518a.mo7814N(sink, i10, ((int) Math.min(i11 - i10, c7518a.f23841o0)) + i10);
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: U */
    public final void mo7816U(C7518a sink, long j10) throws EOFException {
        C7518a c7518a = this.f23851o0;
        AbstractC16544l.m18094g(sink, "sink");
        try {
            mo7825s(j10);
            c7518a.mo7816U(sink, j10);
        } catch (EOFException e10) {
            sink.m7813E(c7518a, c7518a.f23841o0);
            throw e10;
        }
    }

    @Override // p488Tn.InterfaceC7521d
    /* JADX INFO: renamed from: U0 */
    public final long mo7817U0(C7518a sink, long j10) {
        AbstractC16544l.m18094g(sink, "sink");
        if (this.f23850Z) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount: ").toString());
        }
        C7518a c7518a = this.f23851o0;
        if (c7518a.f23841o0 == 0 && this.f23849Y.mo7817U0(c7518a, 8192L) == -1) {
            return -1L;
        }
        return c7518a.mo7817U0(sink, Math.min(j10, c7518a.f23841o0));
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: b */
    public final C7518a mo7819b() {
        return this.f23851o0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws EOFException {
        if (this.f23850Z) {
            return;
        }
        this.f23850Z = true;
        this.f23849Y.f23847q0 = true;
        C7518a c7518a = this.f23851o0;
        c7518a.skip(c7518a.f23841o0);
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: g */
    public final boolean mo7821g() {
        if (this.f23850Z) {
            throw new IllegalStateException("Source is closed.");
        }
        C7518a c7518a = this.f23851o0;
        return c7518a.mo7821g() && this.f23849Y.mo7817U0(c7518a, 8192L) == -1;
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: l */
    public final boolean mo7823l(long j10) {
        C7518a c7518a;
        if (this.f23850Z) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount: ").toString());
        }
        do {
            c7518a = this.f23851o0;
            if (c7518a.f23841o0 >= j10) {
                return true;
            }
        } while (this.f23849Y.mo7817U0(c7518a, 8192L) != -1);
        return false;
    }

    @Override // p488Tn.InterfaceC7526i
    public final C7522e peek() {
        if (this.f23850Z) {
            throw new IllegalStateException("Source is closed.");
        }
        return new C7522e(new C7520c(this));
    }

    @Override // p488Tn.InterfaceC7526i
    public final byte readByte() throws EOFException {
        mo7825s(1L);
        return this.f23851o0.readByte();
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: s */
    public final void mo7825s(long j10) throws EOFException {
        if (!mo7823l(j10)) {
            throw new EOFException(AbstractC0168G.m533v("Source doesn't contain required number of bytes (", j10, ")."));
        }
    }

    public final String toString() {
        return "buffered(" + this.f23849Y + ')';
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: z */
    public final long mo7826z(C7518a sink) {
        C7518a c7518a;
        AbstractC16544l.m18094g(sink, "sink");
        long j10 = 0;
        while (true) {
            C7520c c7520c = this.f23849Y;
            c7518a = this.f23851o0;
            if (c7520c.mo7817U0(c7518a, 8192L) == -1) {
                break;
            }
            long j11 = c7518a.f23841o0;
            if (j11 == 0) {
                j11 = 0;
            } else {
                C7524g c7524g = c7518a.f23840Z;
                AbstractC16544l.m18091d(c7524g);
                int i10 = c7524g.f23856c;
                if (i10 < 8192 && c7524g.f23858e) {
                    j11 -= (long) (i10 - c7524g.f23855b);
                }
            }
            if (j11 > 0) {
                j10 += j11;
                sink.m7813E(c7518a, j11);
            }
        }
        long j12 = c7518a.f23841o0;
        if (j12 <= 0) {
            return j10;
        }
        long j13 = j10 + j12;
        sink.m7813E(c7518a, j12);
        return j13;
    }
}
