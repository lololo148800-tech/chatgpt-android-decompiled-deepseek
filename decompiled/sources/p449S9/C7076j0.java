package p449S9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.javax.sip.C10808o;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: S9.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7076j0 implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final ByteArrayInputStream f22552Y;

    /* JADX INFO: renamed from: Z */
    public C7074i0 f22553Z;

    /* JADX INFO: renamed from: o0 */
    public final byte[] f22554o0 = new byte[8];

    /* JADX INFO: renamed from: p0 */
    public final C10808o f22555p0 = new C10808o(22);

    public C7076j0(ByteArrayInputStream byteArrayInputStream) {
        this.f22552Y = byteArrayInputStream;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m7479E() {
        m7482T((byte) -32);
        if (this.f22553Z.f22550b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iM7480P = (int) m7480P();
        if (iM7480P == 20) {
            return false;
        }
        if (iM7480P == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    /* JADX INFO: renamed from: P */
    public final long m7480P() throws IOException {
        byte b = this.f22553Z.f22550b;
        if (b < 24) {
            long j10 = b;
            this.f22553Z = null;
            return j10;
        }
        if (b == 24) {
            int i10 = this.f22552Y.read();
            if (i10 == -1) {
                throw new EOFException();
            }
            this.f22553Z = null;
            return ((long) i10) & 255;
        }
        byte[] bArr = this.f22554o0;
        if (b == 25) {
            m7483W(2, bArr);
            return (((long) bArr[1]) & 255) | ((bArr[0] & 255) << 8);
        }
        if (b == 26) {
            m7483W(4, bArr);
            long j11 = bArr[0];
            long j12 = bArr[1];
            return (((long) bArr[3]) & 255) | ((j12 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[2] & 255) << 8);
        }
        if (b != 27) {
            C7074i0 c7074i0 = this.f22553Z;
            throw new IOException(AbstractC17792x.m19534q("invalid additional information ", c7074i0.f22550b, (c7074i0.f22549a >> 5) & 7, " for major type "));
        }
        m7483W(8, bArr);
        long j13 = bArr[0];
        long j14 = bArr[1];
        long j15 = bArr[2];
        long j16 = bArr[3];
        return (((long) bArr[7]) & 255) | ((j16 & 255) << 32) | ((j13 & 255) << 56) | ((j14 & 255) << 48) | ((j15 & 255) << 40) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    /* JADX INFO: renamed from: S */
    public final void m7481S() {
        m7488m();
        if (this.f22553Z.f22550b == 31) {
            throw new IllegalStateException(AbstractC10763a.m11048f(this.f22553Z.f22550b, "expected definite length but found "));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m7482T(byte b) {
        m7488m();
        if (this.f22553Z.f22549a != b) {
            throw new IllegalStateException(AbstractC17792x.m19534q("expected major type ", (b >> 5) & 7, (this.f22553Z.f22549a >> 5) & 7, " but found "));
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m7483W(int i10, byte[] bArr) throws IOException {
        int i11 = 0;
        while (i11 != i10) {
            int i12 = this.f22552Y.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        this.f22553Z = null;
    }

    /* JADX INFO: renamed from: a */
    public final long m7484a() {
        m7482T((byte) -128);
        m7481S();
        long jM7480P = m7480P();
        if (jM7480P < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jM7480P > 0) {
            ((ArrayDeque) this.f22555p0.f32040Z).push(Long.valueOf(jM7480P));
        }
        return jM7480P;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f22552Y.close();
        this.f22555p0.m11091z();
    }

    /* JADX INFO: renamed from: e */
    public final long m7485e() {
        boolean z6;
        m7488m();
        byte b = this.f22553Z.f22549a;
        if (b == 0) {
            z6 = true;
        } else {
            if (b != 32) {
                throw new IllegalStateException(AbstractC10763a.m11048f((this.f22553Z.f22549a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z6 = false;
        }
        long jM7480P = m7480P();
        if (jM7480P >= 0) {
            return z6 ? jM7480P : ~jM7480P;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    /* JADX INFO: renamed from: j0 */
    public final byte[] m7486j0() {
        m7481S();
        long jM7480P = m7480P();
        if (jM7480P < 0 || jM7480P > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.f22552Y.available() < jM7480P) {
            throw new EOFException();
        }
        int i10 = (int) jM7480P;
        byte[] bArr = new byte[i10];
        m7483W(i10, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: k */
    public final long m7487k() {
        m7482T((byte) -96);
        m7481S();
        long jM7480P = m7480P();
        if (jM7480P < 0 || jM7480P > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jM7480P > 0) {
            ((ArrayDeque) this.f22555p0.f32040Z).push(Long.valueOf(jM7480P + jM7480P));
        }
        return jM7480P;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7074i0 m7488m() {
        long jM11075B;
        if (this.f22553Z == null) {
            int i10 = this.f22552Y.read();
            C10808o c10808o = this.f22555p0;
            if (i10 == -1) {
                c10808o.m11091z();
                return null;
            }
            C7074i0 c7074i0 = new C7074i0(i10);
            this.f22553Z = c7074i0;
            long j10 = -2;
            byte b = c7074i0.f22549a;
            if (b == -128 || b == -96 || b == -64) {
                jM11075B = c10808o.m11075B();
                if (jM11075B != -1) {
                    j10 = jM11075B;
                }
                throw new IOException(AbstractC10763a.m11049g(j10, "expected non-string scope but found "));
            }
            if (b != -32) {
                if (b != 0 && b != 32) {
                    if (b == 64) {
                        c10808o.m11074A(-1L);
                    } else {
                        if (b != 96) {
                            throw new IllegalStateException(AbstractC10763a.m11048f((this.f22553Z.f22549a >> 5) & 7, "invalid major type: "));
                        }
                        c10808o.m11074A(-2L);
                    }
                }
                long jM11075B2 = c10808o.m11075B();
                ArrayDeque arrayDeque = (ArrayDeque) c10808o.f32040Z;
                if (jM11075B2 == 1) {
                    arrayDeque.pop();
                } else if (jM11075B2 > 1) {
                    arrayDeque.pop();
                    arrayDeque.push(Long.valueOf(jM11075B2 - 1));
                } else if (jM11075B2 == -4) {
                    arrayDeque.pop();
                    arrayDeque.push(-5L);
                } else if (jM11075B2 == -5) {
                    arrayDeque.pop();
                    arrayDeque.push(-4L);
                }
            } else if (c7074i0.f22550b == 31) {
                long jM11075B3 = c10808o.m11075B();
                if (jM11075B3 >= 0) {
                    throw new IOException(AbstractC10763a.m11049g(jM11075B3, "expected indefinite length scope but found "));
                }
                if (jM11075B3 == -5) {
                    throw new IOException("expected a value for dangling key in indefinite-length map");
                }
                ((ArrayDeque) c10808o.f32040Z).pop();
            }
            jM11075B = c10808o.m11075B();
            if (jM11075B != -1) {
                j10 = jM11075B;
            }
            throw new IOException(AbstractC10763a.m11049g(j10, "expected non-string scope but found "));
        }
        return this.f22553Z;
    }
}
