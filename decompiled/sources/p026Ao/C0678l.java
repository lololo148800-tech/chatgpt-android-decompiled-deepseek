package p026Ao;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.protobuf.AbstractC12107L1;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p051Bo.AbstractC1456b;
import p1113xn.AbstractC21329w;
import p1113xn.C21307a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Ao.l */
/* JADX INFO: loaded from: classes2.dex */
public class C0678l implements Serializable, Comparable {

    /* JADX INFO: renamed from: p0 */
    public static final C0678l f1971p0 = new C0678l(new byte[0]);

    /* JADX INFO: renamed from: Y */
    public final byte[] f1972Y;

    /* JADX INFO: renamed from: Z */
    public transient int f1973Z;

    /* JADX INFO: renamed from: o0 */
    public transient String f1974o0;

    public C0678l(byte[] data) {
        AbstractC16544l.m18094g(data, "data");
        this.f1972Y = data;
    }

    /* JADX INFO: renamed from: g */
    public static int m1448g(C0678l c0678l, C0678l other) {
        c0678l.getClass();
        AbstractC16544l.m18094g(other, "other");
        return c0678l.mo1374f(0, other.f1972Y);
    }

    /* JADX INFO: renamed from: k */
    public static int m1449k(C0678l c0678l, C0678l other) {
        c0678l.getClass();
        AbstractC16544l.m18094g(other, "other");
        return c0678l.mo1377j(-1234567890, other.f1972Y);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C0678l m1450o(C0678l c0678l, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = -1234567890;
        }
        return c0678l.mo1380n(i10, i11);
    }

    /* JADX INFO: renamed from: a */
    public String mo1370a() {
        byte[] map = AbstractC0667a.f1945a;
        byte[] bArr = this.f1972Y;
        AbstractC16544l.m18094g(bArr, "<this>");
        AbstractC16544l.m18094g(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b = bArr[i10];
            int i12 = i10 + 2;
            byte b10 = bArr[i10 + 1];
            i10 += 3;
            byte b11 = bArr[i12];
            bArr2[i11] = map[(b & 255) >> 2];
            bArr2[i11 + 1] = map[((b & 3) << 4) | ((b10 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i11 += 4;
            bArr2[i13] = map[b11 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b12 = bArr[i10];
            bArr2[i11] = map[(b12 & 255) >> 2];
            bArr2[i11 + 1] = map[(b12 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b13 = bArr[i10];
            byte b14 = bArr[i14];
            bArr2[i11] = map[(b13 & 255) >> 2];
            bArr2[i11 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr2[i11 + 2] = map[(b14 & 15) << 2];
            bArr2[i11 + 3] = 61;
        }
        return new String(bArr2, C21307a.f67720a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(C0678l other) {
        AbstractC16544l.m18094g(other, "other");
        int iMo1372d = mo1372d();
        int iMo1372d2 = other.mo1372d();
        int iMin = Math.min(iMo1372d, iMo1372d2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iMo1376i = mo1376i(i10) & 255;
            int iMo1376i2 = other.mo1376i(i10) & 255;
            if (iMo1376i == iMo1376i2) {
            }
        }
        if (iMo1372d == iMo1372d2) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public C0678l mo1371c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f1972Y, 0, mo1372d());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC16544l.m18091d(bArrDigest);
        return new C0678l(bArrDigest);
    }

    /* JADX INFO: renamed from: d */
    public int mo1372d() {
        return this.f1972Y.length;
    }

    /* JADX INFO: renamed from: e */
    public String mo1373e() {
        byte[] bArr = this.f1972Y;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = AbstractC1456b.f3826a;
            cArr[i10] = cArr2[(b >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0678l) {
            C0678l c0678l = (C0678l) obj;
            int iMo1372d = c0678l.mo1372d();
            byte[] bArr = this.f1972Y;
            if (iMo1372d == bArr.length && c0678l.mo1378l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int mo1374f(int i10, byte[] other) {
        AbstractC16544l.m18094g(other, "other");
        byte[] bArr = this.f1972Y;
        int length = bArr.length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax <= length) {
            while (!AbstractC0668b.m1401a(bArr, iMax, other, 0, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public byte[] mo1375h() {
        return this.f1972Y;
    }

    public int hashCode() {
        int i10 = this.f1973Z;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f1972Y);
        this.f1973Z = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public byte mo1376i(int i10) {
        return this.f1972Y[i10];
    }

    /* JADX INFO: renamed from: j */
    public int mo1377j(int i10, byte[] other) {
        AbstractC16544l.m18094g(other, "other");
        if (i10 == -1234567890) {
            i10 = mo1372d();
        }
        byte[] bArr = this.f1972Y;
        for (int iMin = Math.min(i10, bArr.length - other.length); -1 < iMin; iMin--) {
            if (AbstractC0668b.m1401a(bArr, iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo1378l(int i10, int i11, int i12, byte[] other) {
        AbstractC16544l.m18094g(other, "other");
        if (i10 >= 0) {
            byte[] bArr = this.f1972Y;
            if (i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC0668b.m1401a(bArr, i10, other, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo1379m(int i10, C0678l other, int i11) {
        AbstractC16544l.m18094g(other, "other");
        return other.mo1378l(0, i10, i11, this.f1972Y);
    }

    /* JADX INFO: renamed from: n */
    public C0678l mo1380n(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = mo1372d();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f1972Y;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException(AbstractC12107L1.m13826q(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i11 - i10 >= 0) {
            return (i10 == 0 && i11 == bArr.length) ? this : new C0678l(AbstractC17678l.m19309p(bArr, i10, i11));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    /* JADX INFO: renamed from: p */
    public C0678l mo1381p() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f1972Y;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b = bArr[i10];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC16544l.m18093f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b10 = bArrCopyOf[i11];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i11] = (byte) (b10 + 32);
                    }
                }
                return new C0678l(bArrCopyOf);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: q */
    public byte[] mo1382q() {
        byte[] bArr = this.f1972Y;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC16544l.m18093f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: r */
    public final String m1452r() {
        String str = this.f1974o0;
        if (str != null) {
            return str;
        }
        byte[] bArrMo1375h = mo1375h();
        AbstractC16544l.m18094g(bArrMo1375h, "<this>");
        String str2 = new String(bArrMo1375h, C21307a.f67720a);
        this.f1974o0 = str2;
        return str2;
    }

    /* JADX INFO: renamed from: s */
    public void mo1383s(C0675i buffer, int i10) {
        AbstractC16544l.m18094g(buffer, "buffer");
        buffer.m1435e1(this.f1972Y, 0, i10);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c A[EDGE_INSN: B:22:0x003c->B:180:0x01a6 BREAK  A[LOOP:0: B:6:0x000f->B:238:0x000f]] */
    public String toString() {
        byte b;
        int i10;
        byte[] bArr = this.f1972Y;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i11 < length) {
            byte b10 = bArr[i11];
            if (b10 < 0) {
                if ((b10 >> 5) != -2) {
                    if ((b10 >> 4) != -2) {
                        if ((b10 >> 3) != -2) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i14 = i11 + 3;
                        if (length > i14) {
                            byte b11 = bArr[i11 + 1];
                            if ((b11 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b12 = bArr[i11 + 2];
                            if ((b12 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b13 = bArr[i14];
                            if ((b13 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
                            if (i15 <= 1114111) {
                                if (55296 <= i15 && i15 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                if (i15 >= 65536) {
                                    i10 = i13 + 1;
                                    if (i13 == 64) {
                                        break;
                                    }
                                    if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                        i12 = -1;
                                        break;
                                    }
                                    i12 += i15 < 65536 ? 1 : 2;
                                    i11 += 4;
                                    i13 = i10;
                                } else {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        int i16 = i11 + 2;
                        if (length > i16) {
                            byte b14 = bArr[i11 + 1];
                            if ((b14 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b15 = bArr[i16];
                            if ((b15 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i17 = ((b15 ^ (-123008)) ^ (b14 << 6)) ^ (b10 << 12);
                            if (i17 >= 2048) {
                                if (55296 <= i17 && i17 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    i12 = -1;
                                    break;
                                }
                                i12 += i17 < 65536 ? 1 : 2;
                                i11 += 3;
                                i13 = i10;
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    }
                } else {
                    int i18 = i11 + 1;
                    if (length > i18) {
                        byte b16 = bArr[i18];
                        if ((b16 & 192) != 128) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i19 = (b16 ^ 3968) ^ (b10 << 6);
                        if (i19 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                i12 = -1;
                                break;
                            }
                            i12 += i19 < 65536 ? 1 : 2;
                            i11 += 2;
                            i13 = i10;
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        if (i13 == 64) {
                            break;
                        }
                        i12 = -1;
                        break;
                    }
                }
            } else {
                int i20 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b10 == 10 || b10 == 13 || ((b10 < 0 || b10 >= 32) && (127 > b10 || b10 >= 160))) && b10 != 65533) {
                    i12 += b10 < 65536 ? 1 : 2;
                    i11++;
                    while (true) {
                        i13 = i20;
                        if (i11 < length && (b = bArr[i11]) >= 0) {
                            i11++;
                            i20 = i13 + 1;
                            if (i13 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i12 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            String strM1452r = m1452r();
            String strSubstring = strM1452r.substring(0, i12);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            String strM21731r = AbstractC21329w.m21731r(AbstractC21329w.m21731r(AbstractC21329w.m21731r(strSubstring, "\\", "\\\\"), Separators.RETURN, "\\n"), "\r", "\\r");
            if (i12 >= strM1452r.length()) {
                return AbstractC10763a.m11047e(']', "[text=", strM21731r);
            }
            return "[size=" + bArr.length + " text=" + strM21731r + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo1373e() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(AbstractC12107L1.m13826q(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb2.append((64 == bArr.length ? this : new C0678l(AbstractC17678l.m19309p(bArr, 0, 64))).mo1373e());
        sb2.append("…]");
        return sb2.toString();
    }
}
