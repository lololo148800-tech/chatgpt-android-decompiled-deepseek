package p109E3;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.ByteBuffer;
import p1031u3.AbstractC20103f;
import p1031u3.C20099b;
import p1031u3.C20100c;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: E3.N */
/* JADX INFO: loaded from: classes.dex */
public final class C2273N extends AbstractC20103f {

    /* JADX INFO: renamed from: n */
    public int f7029n;

    /* JADX INFO: renamed from: o */
    public boolean f7030o;

    /* JADX INFO: renamed from: p */
    public int f7031p;

    /* JADX INFO: renamed from: q */
    public long f7032q;

    /* JADX INFO: renamed from: s */
    public byte[] f7034s;

    /* JADX INFO: renamed from: v */
    public byte[] f7037v;

    /* JADX INFO: renamed from: r */
    public int f7033r = 0;

    /* JADX INFO: renamed from: t */
    public int f7035t = 0;

    /* JADX INFO: renamed from: u */
    public int f7036u = 0;

    /* JADX INFO: renamed from: l */
    public final long f7027l = 100000;

    /* JADX INFO: renamed from: i */
    public final float f7024i = 0.2f;

    /* JADX INFO: renamed from: m */
    public final long f7028m = 2000000;

    /* JADX INFO: renamed from: k */
    public final int f7026k = 10;

    /* JADX INFO: renamed from: j */
    public final short f7025j = 1024;

    public C2273N() {
        byte[] bArr = AbstractC20817s.f66111f;
        this.f7034s = bArr;
        this.f7037v = bArr;
    }

    @Override // p1031u3.AbstractC20103f, p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: a */
    public final boolean mo3352a() {
        return super.mo3352a() && this.f7030o;
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: e */
    public final void mo3353e(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f63652g.hasRemaining()) {
            int i10 = this.f7031p;
            short s10 = this.f7025j;
            if (i10 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f7034s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s10) {
                        int i11 = this.f7029n;
                        iPosition = AbstractC10763a.m11068z(iLimit3, i11, i11, i11);
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f7031p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m20939l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                AbstractC20800b.m21320h(this.f7035t < this.f7034s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s10) {
                        int i12 = this.f7029n;
                        iLimit = (iPosition2 / i12) * i12;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f7035t;
                int i13 = this.f7036u;
                int length2 = length + i13;
                byte[] bArr = this.f7034s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i13 - (bArr.length - length);
                }
                int i14 = length - length2;
                boolean z6 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i14);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f7034s, length2, iMin);
                int i15 = this.f7036u + iMin;
                this.f7036u = i15;
                AbstractC20800b.m21320h(i15 <= this.f7034s.length);
                boolean z10 = z6 && iPosition3 < i14;
                m3359n(z10);
                if (z10) {
                    this.f7031p = 0;
                    this.f7033r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: h */
    public final C20099b mo3354h(C20099b c20099b) throws C20100c {
        if (c20099b.f63644c == 2) {
            return c20099b.f63642a == -1 ? C20099b.f63641e : c20099b;
        }
        throw new C20100c(c20099b);
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: i */
    public final void mo3355i() {
        if (mo3352a()) {
            C20099b c20099b = this.f63647b;
            int i10 = c20099b.f63643b * 2;
            this.f7029n = i10;
            int i11 = ((((int) ((this.f7027l * ((long) c20099b.f63642a)) / 1000000)) / 2) / i10) * i10 * 2;
            if (this.f7034s.length != i11) {
                this.f7034s = new byte[i11];
                this.f7037v = new byte[i11];
            }
        }
        this.f7031p = 0;
        this.f7032q = 0L;
        this.f7033r = 0;
        this.f7035t = 0;
        this.f7036u = 0;
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: j */
    public final void mo3356j() {
        if (this.f7036u > 0) {
            m3359n(true);
            this.f7033r = 0;
        }
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: k */
    public final void mo3357k() {
        this.f7030o = false;
        byte[] bArr = AbstractC20817s.f66111f;
        this.f7034s = bArr;
        this.f7037v = bArr;
    }

    /* JADX INFO: renamed from: m */
    public final int m3358m(int i10) {
        int length = ((((int) ((this.f7028m * ((long) this.f63647b.f63642a)) / 1000000)) - this.f7033r) * this.f7029n) - (this.f7034s.length / 2);
        AbstractC20800b.m21320h(length >= 0);
        int iMin = (int) Math.min((i10 * this.f7024i) + 0.5f, length);
        int i11 = this.f7029n;
        return (iMin / i11) * i11;
    }

    /* JADX INFO: renamed from: n */
    public final void m3359n(boolean z6) {
        int length;
        int iM3358m;
        int i10 = this.f7036u;
        byte[] bArr = this.f7034s;
        if (i10 == bArr.length || z6) {
            if (this.f7033r == 0) {
                if (z6) {
                    m3360o(i10, 3);
                    length = i10;
                } else {
                    AbstractC20800b.m21320h(i10 >= bArr.length / 2);
                    length = this.f7034s.length / 2;
                    m3360o(length, 0);
                }
                iM3358m = length;
            } else if (z6) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM3358m2 = m3358m(length2) + (this.f7034s.length / 2);
                m3360o(iM3358m2, 2);
                iM3358m = iM3358m2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iM3358m = m3358m(length);
                m3360o(iM3358m, 1);
            }
            AbstractC20800b.m21319g("bytesConsumed is not aligned to frame size: %s" + length, length % this.f7029n == 0);
            AbstractC20800b.m21320h(i10 >= iM3358m);
            this.f7036u -= length;
            int i11 = this.f7035t + length;
            this.f7035t = i11;
            this.f7035t = i11 % this.f7034s.length;
            int i12 = this.f7033r;
            int i13 = this.f7029n;
            this.f7033r = (iM3358m / i13) + i12;
            this.f7032q += (long) ((length - iM3358m) / i13);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3360o(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        AbstractC20800b.m21316d(this.f7036u >= i10);
        if (i11 == 2) {
            int i12 = this.f7035t;
            int i13 = this.f7036u;
            int i14 = i12 + i13;
            byte[] bArr = this.f7034s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.f7037v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f7037v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f7037v, 0, i15);
                    System.arraycopy(this.f7034s, 0, this.f7037v, i15, length);
                }
            }
        } else {
            int i16 = this.f7035t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f7034s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f7037v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f7037v, 0, length2);
                System.arraycopy(this.f7034s, 0, this.f7037v, length2, i10 - length2);
            }
        }
        AbstractC20800b.m21315c("sizeToOutput is not aligned to frame size: " + i10, i10 % this.f7029n == 0);
        AbstractC20800b.m21320h(this.f7035t < this.f7034s.length);
        byte[] bArr3 = this.f7037v;
        AbstractC20800b.m21315c("byteOutput size is not aligned to frame size " + i10, i10 % this.f7029n == 0);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                int i21 = this.f7026k;
                if (i11 == 0) {
                    i21 = ((((i18 * 1000) / (i10 - 1)) * (i21 - 100)) / 1000) + 100;
                } else if (i11 == 2) {
                    i21 += (((i18 * 1000) * (100 - i21)) / (i10 - 1)) / 1000;
                }
                int i22 = (i20 * i21) / 100;
                if (i22 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = 127;
                } else if (i22 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = -128;
                } else {
                    bArr3[i18] = (byte) (i22 & 255);
                    bArr3[i19] = (byte) (i22 >> 8);
                }
            }
        }
        m20939l(i10).put(bArr3, 0, i10).flip();
    }
}
