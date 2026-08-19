package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p051Bo.AbstractC1456b;
import p909nm.AbstractC17678l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Ao.I */
/* JADX INFO: loaded from: classes2.dex */
public final class C0660I extends C0678l {

    /* JADX INFO: renamed from: q0 */
    public final transient byte[][] f1934q0;

    /* JADX INFO: renamed from: r0 */
    public final transient int[] f1935r0;

    public C0660I(byte[][] bArr, int[] iArr) {
        super(C0678l.f1971p0.f1972Y);
        this.f1934q0 = bArr;
        this.f1935r0 = iArr;
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: a */
    public final String mo1370a() {
        throw null;
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: c */
    public final C0678l mo1371c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f1934q0;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f1935r0;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC16544l.m18091d(bArrDigest);
        return new C0678l(bArrDigest);
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: d */
    public final int mo1372d() {
        return this.f1935r0[this.f1934q0.length - 1];
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: e */
    public final String mo1373e() {
        return m1384t().mo1373e();
    }

    @Override // p026Ao.C0678l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0678l) {
            C0678l c0678l = (C0678l) obj;
            if (c0678l.mo1372d() == mo1372d() && mo1379m(0, c0678l, mo1372d())) {
                return true;
            }
        }
        return false;
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: f */
    public final int mo1374f(int i10, byte[] other) {
        AbstractC16544l.m18094g(other, "other");
        return m1384t().mo1374f(i10, other);
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: h */
    public final byte[] mo1375h() {
        return mo1382q();
    }

    @Override // p026Ao.C0678l
    public final int hashCode() {
        int i10 = this.f1973Z;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f1934q0;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f1935r0;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f1973Z = i12;
        return i12;
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: i */
    public final byte mo1376i(int i10) {
        byte[][] bArr = this.f1934q0;
        int length = bArr.length - 1;
        int[] iArr = this.f1935r0;
        AbstractC0668b.m1405e(iArr[length], i10, 1L);
        int iM2069i = AbstractC1456b.m2069i(this, i10);
        return bArr[iM2069i][(i10 - (iM2069i == 0 ? 0 : iArr[iM2069i - 1])) + iArr[bArr.length + iM2069i]];
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: j */
    public final int mo1377j(int i10, byte[] other) {
        AbstractC16544l.m18094g(other, "other");
        return m1384t().mo1377j(i10, other);
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: l */
    public final boolean mo1378l(int i10, int i11, int i12, byte[] other) {
        AbstractC16544l.m18094g(other, "other");
        if (i10 < 0 || i10 > mo1372d() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iM2069i = AbstractC1456b.m2069i(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f1935r0;
            int i14 = iM2069i == 0 ? 0 : iArr[iM2069i - 1];
            int i15 = iArr[iM2069i] - i14;
            byte[][] bArr = this.f1934q0;
            int i16 = iArr[bArr.length + iM2069i];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC0668b.m1401a(bArr[iM2069i], (i10 - i14) + i16, other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iM2069i++;
        }
        return true;
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: m */
    public final boolean mo1379m(int i10, C0678l other, int i11) {
        AbstractC16544l.m18094g(other, "other");
        if (i10 < 0 || i10 > mo1372d() - i11) {
            return false;
        }
        int i12 = i11 + i10;
        int iM2069i = AbstractC1456b.m2069i(this, i10);
        int i13 = 0;
        while (i10 < i12) {
            int[] iArr = this.f1935r0;
            int i14 = iM2069i == 0 ? 0 : iArr[iM2069i - 1];
            int i15 = iArr[iM2069i] - i14;
            byte[][] bArr = this.f1934q0;
            int i16 = iArr[bArr.length + iM2069i];
            int iMin = Math.min(i12, i15 + i14) - i10;
            if (!other.mo1378l(i13, (i10 - i14) + i16, iMin, bArr[iM2069i])) {
                return false;
            }
            i13 += iMin;
            i10 += iMin;
            iM2069i++;
        }
        return true;
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: n */
    public final C0678l mo1380n(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = mo1372d();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "beginIndex=", " < 0").toString());
        }
        if (i11 > mo1372d()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i11, "endIndex=", " > length(");
            sbM11057o.append(mo1372d());
            sbM11057o.append(')');
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("endIndex=", i11, i10, " < beginIndex=").toString());
        }
        if (i10 == 0 && i11 == mo1372d()) {
            return this;
        }
        if (i10 == i11) {
            return C0678l.f1971p0;
        }
        int iM2069i = AbstractC1456b.m2069i(this, i10);
        int iM2069i2 = AbstractC1456b.m2069i(this, i11 - 1);
        byte[][] bArr = this.f1934q0;
        byte[][] bArr2 = (byte[][]) AbstractC17678l.m19310q(bArr, iM2069i, iM2069i2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f1935r0;
        if (iM2069i <= iM2069i2) {
            int i13 = iM2069i;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(iArr2[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                if (i13 == iM2069i2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iM2069i != 0 ? iArr2[iM2069i - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new C0660I(bArr2, iArr);
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: p */
    public final C0678l mo1381p() {
        return m1384t().mo1381p();
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: q */
    public final byte[] mo1382q() {
        byte[] bArr = new byte[mo1372d()];
        byte[][] bArr2 = this.f1934q0;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f1935r0;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            AbstractC17678l.m19305l(bArr2[i10], i12, bArr, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // p026Ao.C0678l
    /* JADX INFO: renamed from: s */
    public final void mo1383s(C0675i buffer, int i10) {
        AbstractC16544l.m18094g(buffer, "buffer");
        int iM2069i = AbstractC1456b.m2069i(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f1935r0;
            int i12 = iM2069i == 0 ? 0 : iArr[iM2069i - 1];
            int i13 = iArr[iM2069i] - i12;
            byte[][] bArr = this.f1934q0;
            int i14 = iArr[bArr.length + iM2069i];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            C0658G c0658g = new C0658G(bArr[iM2069i], i15, i15 + iMin, true, false);
            C0658G c0658g2 = buffer.f1969Y;
            if (c0658g2 == null) {
                c0658g.f1930g = c0658g;
                c0658g.f1929f = c0658g;
                buffer.f1969Y = c0658g;
            } else {
                C0658G c0658g3 = c0658g2.f1930g;
                AbstractC16544l.m18091d(c0658g3);
                c0658g3.m1365b(c0658g);
            }
            i11 += iMin;
            iM2069i++;
        }
        buffer.f1970Z += (long) i10;
    }

    /* JADX INFO: renamed from: t */
    public final C0678l m1384t() {
        return new C0678l(mo1382q());
    }

    @Override // p026Ao.C0678l
    public final String toString() {
        return m1384t().toString();
    }
}
