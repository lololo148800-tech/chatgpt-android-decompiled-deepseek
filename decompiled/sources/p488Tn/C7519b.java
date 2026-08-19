package p488Tn;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: Tn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7519b implements InterfaceC7521d {

    /* JADX INFO: renamed from: Y */
    public final InputStream f23842Y;

    public C7519b(InputStream input) {
        AbstractC16544l.m18094g(input, "input");
        this.f23842Y = input;
    }

    @Override // p488Tn.InterfaceC7521d
    /* JADX INFO: renamed from: U0 */
    public final long mo7817U0(C7518a sink, long j10) {
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC0168G.m533v("byteCount (", j10, ") < 0").toString());
        }
        boolean z6 = false;
        try {
            C7524g c7524gM7824m = sink.m7824m(1);
            byte[] bArr = c7524gM7824m.f23854a;
            int i10 = c7524gM7824m.f23856c;
            long j11 = this.f23842Y.read(bArr, i10, (int) Math.min(j10, bArr.length - i10));
            int i11 = j11 == -1 ? 0 : (int) j11;
            if (i11 == 1) {
                c7524gM7824m.f23856c += i11;
                sink.f23841o0 += (long) i11;
            } else {
                if (i11 < 0 || i11 > c7524gM7824m.m7827a()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + i11 + ". Should be in 0.." + c7524gM7824m.m7827a()).toString());
                }
                if (i11 != 0) {
                    c7524gM7824m.f23856c += i11;
                    sink.f23841o0 += (long) i11;
                } else if (AbstractC7527j.m7839e(c7524gM7824m)) {
                    sink.m7820e();
                }
            }
            return j11;
        } catch (AssertionError e10) {
            if (e10.getCause() != null) {
                String message = e10.getMessage();
                if (message != null ? AbstractC21322p.m21667A(message, "getsockname failed", false) : false) {
                    z6 = true;
                }
            }
            if (z6) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f23842Y.close();
    }

    public final String toString() {
        return "RawSource(" + this.f23842Y + ')';
    }
}
