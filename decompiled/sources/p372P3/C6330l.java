package p372P3;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p1016t3.AbstractC19798y;
import p1073w3.AbstractC20817s;
import p1142z3.InterfaceC21740h;

/* JADX INFO: renamed from: P3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6330l implements InterfaceC6334p {

    /* JADX INFO: renamed from: Z */
    public final InterfaceC21740h f20546Z;

    /* JADX INFO: renamed from: o0 */
    public final long f20547o0;

    /* JADX INFO: renamed from: p0 */
    public long f20548p0;

    /* JADX INFO: renamed from: r0 */
    public int f20550r0;

    /* JADX INFO: renamed from: s0 */
    public int f20551s0;

    /* JADX INFO: renamed from: q0 */
    public byte[] f20549q0 = new byte[65536];

    /* JADX INFO: renamed from: Y */
    public final byte[] f20545Y = new byte[4096];

    static {
        AbstractC19798y.m20754a("media3.extractor");
    }

    public C6330l(InterfaceC21740h interfaceC21740h, long j10, long j11) {
        this.f20546Z = interfaceC21740h;
        this.f20548p0 = j10;
        this.f20547o0 = j11;
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: b */
    public final boolean mo3046b(byte[] bArr, int i10, int i11, boolean z6) {
        int iMin;
        int i12 = this.f20551s0;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f20549q0, 0, bArr, i10, iMin);
            m6945o(iMin);
        }
        int iM6944n = iMin;
        while (iM6944n < i11 && iM6944n != -1) {
            iM6944n = m6944n(bArr, i10, i11, iM6944n, z6);
        }
        if (iM6944n != -1) {
            this.f20548p0 += (long) iM6944n;
        }
        return iM6944n != -1;
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: d */
    public final boolean mo3047d(byte[] bArr, int i10, int i11, boolean z6) {
        if (!m6941g(i11, z6)) {
            return false;
        }
        System.arraycopy(this.f20549q0, this.f20550r0 - i11, bArr, i10, i11);
        return true;
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: e */
    public final long mo3048e() {
        return this.f20548p0 + ((long) this.f20550r0);
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: f */
    public final void mo3049f(int i10) throws EOFException, InterruptedIOException {
        m6941g(i10, false);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6941g(int i10, boolean z6) throws EOFException, InterruptedIOException {
        m6942l(i10);
        int iM6944n = this.f20551s0 - this.f20550r0;
        while (iM6944n < i10) {
            iM6944n = m6944n(this.f20549q0, this.f20550r0, i10, iM6944n, z6);
            if (iM6944n == -1) {
                return false;
            }
            this.f20551s0 = this.f20550r0 + iM6944n;
        }
        this.f20550r0 += i10;
        return true;
    }

    @Override // p372P3.InterfaceC6334p
    public final long getLength() {
        return this.f20547o0;
    }

    @Override // p372P3.InterfaceC6334p
    public final long getPosition() {
        return this.f20548p0;
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: i */
    public final void mo3051i() {
        this.f20550r0 = 0;
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: j */
    public final void mo3052j(int i10) {
        int iMin = Math.min(this.f20551s0, i10);
        m6945o(iMin);
        int iM6944n = iMin;
        while (iM6944n < i10 && iM6944n != -1) {
            byte[] bArr = this.f20545Y;
            iM6944n = m6944n(bArr, -iM6944n, Math.min(i10, bArr.length + iM6944n), iM6944n, false);
        }
        if (iM6944n != -1) {
            this.f20548p0 += (long) iM6944n;
        }
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: k */
    public final void mo3053k(byte[] bArr, int i10, int i11) {
        mo3047d(bArr, i10, i11, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m6942l(int i10) {
        int i11 = this.f20550r0 + i10;
        byte[] bArr = this.f20549q0;
        if (i11 > bArr.length) {
            this.f20549q0 = Arrays.copyOf(this.f20549q0, AbstractC20817s.m21408i(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m6943m(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iMin;
        m6942l(i11);
        int i12 = this.f20551s0;
        int i13 = this.f20550r0;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = m6944n(this.f20549q0, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f20551s0 += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f20549q0, this.f20550r0, bArr, i10, iMin);
        this.f20550r0 += iMin;
        return iMin;
    }

    /* JADX INFO: renamed from: n */
    public final int m6944n(byte[] bArr, int i10, int i11, int i12, boolean z6) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f20546Z.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: o */
    public final void m6945o(int i10) {
        int i11 = this.f20551s0 - i10;
        this.f20551s0 = i11;
        this.f20550r0 = 0;
        byte[] bArr = this.f20549q0;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f20549q0 = bArr2;
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int i12 = this.f20551s0;
        int iM6944n = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f20549q0, 0, bArr, i10, iMin);
            m6945o(iMin);
            iM6944n = iMin;
        }
        if (iM6944n == 0) {
            iM6944n = m6944n(bArr, i10, i11, 0, true);
        }
        if (iM6944n != -1) {
            this.f20548p0 += (long) iM6944n;
        }
        return iM6944n;
    }

    @Override // p372P3.InterfaceC6334p
    public final void readFully(byte[] bArr, int i10, int i11) {
        mo3046b(bArr, i10, i11, false);
    }
}
