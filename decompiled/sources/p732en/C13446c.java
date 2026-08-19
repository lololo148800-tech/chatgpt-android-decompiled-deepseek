package p732en;

import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.C16610g;
import kotlin.reflect.jvm.internal.impl.protobuf.C16612i;
import p690cp.C12936v;

/* JADX INFO: renamed from: en.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C13446c extends InputStream {

    /* JADX INFO: renamed from: Y */
    public C12936v f42571Y;

    /* JADX INFO: renamed from: Z */
    public C16610g f42572Z;

    /* JADX INFO: renamed from: o0 */
    public int f42573o0;

    /* JADX INFO: renamed from: p0 */
    public int f42574p0;

    /* JADX INFO: renamed from: q0 */
    public int f42575q0;

    /* JADX INFO: renamed from: r0 */
    public int f42576r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16612i f42577s0;

    public C13446c(C16612i c16612i) {
        this.f42577s0 = c16612i;
        C12936v c12936v = new C12936v(c16612i);
        this.f42571Y = c12936v;
        C16610g c16610gM14599a = c12936v.m14599a();
        this.f42572Z = c16610gM14599a;
        this.f42573o0 = c16610gM14599a.f52768Y.length;
        this.f42574p0 = 0;
        this.f42575q0 = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m14967a() {
        if (this.f42572Z != null) {
            int i10 = this.f42574p0;
            int i11 = this.f42573o0;
            if (i10 == i11) {
                this.f42575q0 += i11;
                this.f42574p0 = 0;
                if (!this.f42571Y.hasNext()) {
                    this.f42572Z = null;
                    this.f42573o0 = 0;
                } else {
                    C16610g c16610gM14599a = this.f42571Y.m14599a();
                    this.f42572Z = c16610gM14599a;
                    this.f42573o0 = c16610gM14599a.f52768Y.length;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f42577s0.f52774Y - (this.f42575q0 + this.f42574p0);
    }

    /* JADX INFO: renamed from: e */
    public final int m14968e(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        while (i12 > 0) {
            m14967a();
            if (this.f42572Z == null) {
                if (i12 != i11) {
                    break;
                }
                return -1;
            }
            int iMin = Math.min(this.f42573o0 - this.f42574p0, i12);
            if (bArr != null) {
                this.f42572Z.copyTo(bArr, this.f42574p0, i10, iMin);
                i10 += iMin;
            }
            this.f42574p0 += iMin;
            i12 -= iMin;
        }
        return i11 - i12;
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f42576r0 = this.f42575q0 + this.f42574p0;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        return m14968e(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        C12936v c12936v = new C12936v(this.f42577s0);
        this.f42571Y = c12936v;
        C16610g c16610gM14599a = c12936v.m14599a();
        this.f42572Z = c16610gM14599a;
        this.f42573o0 = c16610gM14599a.f52768Y.length;
        this.f42574p0 = 0;
        this.f42575q0 = 0;
        m14968e(null, 0, this.f42576r0);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j10 > 2147483647L) {
            j10 = 2147483647L;
        }
        return m14968e(null, 0, (int) j10);
    }

    @Override // java.io.InputStream
    public final int read() {
        m14967a();
        C16610g c16610g = this.f42572Z;
        if (c16610g == null) {
            return -1;
        }
        int i10 = this.f42574p0;
        this.f42574p0 = i10 + 1;
        return c16610g.f52768Y[i10] & 255;
    }
}
