package p1073w3;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bb.AbstractC11281F;
import java.nio.charset.Charset;
import java.util.Arrays;
import p523V9.AbstractC8020X;
import p644ab.AbstractC10531d;

/* JADX INFO: renamed from: w3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C20811m {

    /* JADX INFO: renamed from: d */
    public static final char[] f66089d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f66090e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final AbstractC11281F f66091f = AbstractC11281F.m12704s(5, AbstractC10531d.f31240a, AbstractC10531d.f31242c, AbstractC10531d.f31245f, AbstractC10531d.f31243d, AbstractC10531d.f31244e);

    /* JADX INFO: renamed from: a */
    public byte[] f66092a;

    /* JADX INFO: renamed from: b */
    public int f66093b;

    /* JADX INFO: renamed from: c */
    public int f66094c;

    public C20811m() {
        this.f66092a = AbstractC20817s.f66111f;
    }

    /* JADX INFO: renamed from: A */
    public final long m21339A() {
        int i10;
        int i11;
        long j10 = this.f66092a[this.f66093b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException(AbstractC10763a.m11049g(j10, "Invalid UTF-8 sequence first byte: "));
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b = this.f66092a[this.f66093b + i10];
            if ((b & 192) != 128) {
                throw new NumberFormatException(AbstractC10763a.m11049g(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | ((long) (b & 63));
        }
        this.f66093b += i11;
        return j10;
    }

    /* JADX INFO: renamed from: B */
    public final Charset m21340B() {
        if (m21346a() >= 3) {
            byte[] bArr = this.f66092a;
            int i10 = this.f66093b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f66093b = i10 + 3;
                return AbstractC10531d.f31242c;
            }
        }
        if (m21346a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f66092a;
        int i11 = this.f66093b;
        byte b = bArr2[i11];
        if (b == -2 && bArr2[i11 + 1] == -1) {
            this.f66093b = i11 + 2;
            return AbstractC10531d.f31243d;
        }
        if (b != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f66093b = i11 + 2;
        return AbstractC10531d.f31244e;
    }

    /* JADX INFO: renamed from: C */
    public final void m21341C(int i10) {
        byte[] bArr = this.f66092a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        m21342D(i10, bArr);
    }

    /* JADX INFO: renamed from: D */
    public final void m21342D(int i10, byte[] bArr) {
        this.f66092a = bArr;
        this.f66094c = i10;
        this.f66093b = 0;
    }

    /* JADX INFO: renamed from: E */
    public final void m21343E(int i10) {
        AbstractC20800b.m21316d(i10 >= 0 && i10 <= this.f66092a.length);
        this.f66094c = i10;
    }

    /* JADX INFO: renamed from: F */
    public final void m21344F(int i10) {
        AbstractC20800b.m21316d(i10 >= 0 && i10 <= this.f66094c);
        this.f66093b = i10;
    }

    /* JADX INFO: renamed from: G */
    public final void m21345G(int i10) {
        m21344F(this.f66093b + i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m21346a() {
        return this.f66094c - this.f66093b;
    }

    /* JADX INFO: renamed from: b */
    public final void m21347b(int i10) {
        byte[] bArr = this.f66092a;
        if (i10 > bArr.length) {
            this.f66092a = Arrays.copyOf(bArr, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final char m21348c(Charset charset) {
        AbstractC20800b.m21315c("Unsupported charset: " + charset, f66091f.contains(charset));
        return (char) (m21349d(charset) >> 16);
    }

    /* JADX INFO: renamed from: d */
    public final int m21349d(Charset charset) {
        byte b;
        int i10;
        byte b10;
        byte b11;
        if ((charset.equals(AbstractC10531d.f31242c) || charset.equals(AbstractC10531d.f31240a)) && m21346a() >= 1) {
            long j10 = this.f66092a[this.f66093b] & 255;
            char c9 = (char) j10;
            AbstractC8020X.m8352b(((long) c9) == j10, "Out of range: %s", j10);
            b = (byte) c9;
            i10 = 1;
        } else {
            i10 = 2;
            if ((charset.equals(AbstractC10531d.f31245f) || charset.equals(AbstractC10531d.f31243d)) && m21346a() >= 2) {
                byte[] bArr = this.f66092a;
                int i11 = this.f66093b;
                b10 = bArr[i11];
                b11 = bArr[i11 + 1];
            } else {
                if (!charset.equals(AbstractC10531d.f31244e) || m21346a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f66092a;
                int i12 = this.f66093b;
                b10 = bArr2[i12 + 1];
                b11 = bArr2[i12];
            }
            b = (byte) ((char) ((b11 & 255) | (b10 << 8)));
        }
        long j11 = b;
        char c10 = (char) j11;
        AbstractC8020X.m8352b(((long) c10) == j11, "Out of range: %s", j11);
        return (c10 << 16) + i10;
    }

    /* JADX INFO: renamed from: e */
    public final void m21350e(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f66092a, this.f66093b, bArr, i10, i11);
        this.f66093b += i11;
    }

    /* JADX INFO: renamed from: f */
    public final char m21351f(Charset charset, char[] cArr) {
        int iM21349d = m21349d(charset);
        if (iM21349d != 0) {
            char c9 = (char) (iM21349d >> 16);
            for (char c10 : cArr) {
                if (c10 == c9) {
                    this.f66093b += iM21349d & 65535;
                    return c9;
                }
            }
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m21352g() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f66093b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f66093b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f66093b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce A[ADDED_TO_REGION, EDGE_INSN: B:66:0x00ce->B:56:0x00ce BREAK  A[LOOP:0: B:26:0x006a->B:54:0x00cb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce A[ADDED_TO_REGION, EDGE_INSN: B:68:0x00ce->B:56:0x00ce BREAK  A[LOOP:0: B:26:0x006a->B:54:0x00cb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final String m21353h(Charset charset) {
        int i10;
        byte[] bArr;
        byte b;
        byte[] bArr2;
        byte b10;
        AbstractC20800b.m21315c("Unsupported charset: " + charset, f66091f.contains(charset));
        if (m21346a() == 0) {
            return null;
        }
        Charset charset2 = AbstractC10531d.f31240a;
        if (!charset.equals(charset2)) {
            m21340B();
        }
        if (charset.equals(AbstractC10531d.f31242c) || charset.equals(charset2)) {
            i10 = 1;
        } else {
            if (!charset.equals(AbstractC10531d.f31245f) && !charset.equals(AbstractC10531d.f31244e) && !charset.equals(AbstractC10531d.f31243d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f66093b;
        while (true) {
            int i12 = this.f66094c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if (charset.equals(AbstractC10531d.f31242c) || charset.equals(AbstractC10531d.f31240a)) {
                byte b11 = this.f66092a[i11];
                int i13 = AbstractC20817s.f66106a;
                if (b11 == 10 || b11 == 13) {
                    break;
                }
                if (!charset.equals(AbstractC10531d.f31245f) || charset.equals(AbstractC10531d.f31243d)) {
                    bArr = this.f66092a;
                    if (bArr[i11] == 0) {
                        b = bArr[i11 + 1];
                        int i14 = AbstractC20817s.f66106a;
                        if (b != 10 || b == 13) {
                            break;
                        }
                        if (charset.equals(AbstractC10531d.f31244e)) {
                            bArr2 = this.f66092a;
                            if (bArr2[i11 + 1] == 0) {
                                b10 = bArr2[i11];
                                int i15 = AbstractC20817s.f66106a;
                                if (b10 != 10 || b10 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i11 += i10;
                    } else {
                        if (charset.equals(AbstractC10531d.f31244e)) {
                            bArr2 = this.f66092a;
                            if (bArr2[i11 + 1] == 0) {
                                b10 = bArr2[i11];
                                int i16 = AbstractC20817s.f66106a;
                                if (b10 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i11 += i10;
                    }
                } else {
                    if (charset.equals(AbstractC10531d.f31244e)) {
                        bArr2 = this.f66092a;
                        if (bArr2[i11 + 1] == 0) {
                            b10 = bArr2[i11];
                            int i17 = AbstractC20817s.f66106a;
                            if (b10 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i11 += i10;
                }
            } else if (charset.equals(AbstractC10531d.f31245f)) {
                bArr = this.f66092a;
                if (bArr[i11] == 0) {
                    b = bArr[i11 + 1];
                    int i18 = AbstractC20817s.f66106a;
                    if (b != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(AbstractC10531d.f31244e)) {
                    bArr2 = this.f66092a;
                    if (bArr2[i11 + 1] == 0) {
                        b10 = bArr2[i11];
                        int i19 = AbstractC20817s.f66106a;
                        if (b10 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i11 += i10;
            } else {
                bArr = this.f66092a;
                if (bArr[i11] == 0) {
                    b = bArr[i11 + 1];
                    int i110 = AbstractC20817s.f66106a;
                    if (b != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(AbstractC10531d.f31244e)) {
                    bArr2 = this.f66092a;
                    if (bArr2[i11 + 1] == 0) {
                        b10 = bArr2[i11];
                        int i111 = AbstractC20817s.f66106a;
                        if (b10 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i11 += i10;
            }
        }
        String strM21363r = m21363r(i11 - this.f66093b, charset);
        if (this.f66093b != this.f66094c && m21351f(charset, f66089d) == '\r') {
            m21351f(charset, f66090e);
        }
        return strM21363r;
    }

    /* JADX INFO: renamed from: i */
    public final int m21354i() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f66093b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f66093b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f66093b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    /* JADX INFO: renamed from: j */
    public final long m21355j() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f66093b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f66093b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f66093b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f66093b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f66093b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f66093b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f66093b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    /* JADX INFO: renamed from: k */
    public final long m21356k() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f66093b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f66093b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f66093b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    /* JADX INFO: renamed from: l */
    public final int m21357l() {
        int iM21354i = m21354i();
        if (iM21354i >= 0) {
            return iM21354i;
        }
        throw new IllegalStateException(AbstractC10763a.m11048f(iM21354i, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: m */
    public final int m21358m() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        int i12 = bArr[i10] & 255;
        this.f66093b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    /* JADX INFO: renamed from: n */
    public final long m21359n() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f66093b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f66093b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f66093b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f66093b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f66093b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f66093b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f66093b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    /* JADX INFO: renamed from: o */
    public final String m21360o() {
        if (m21346a() == 0) {
            return null;
        }
        int i10 = this.f66093b;
        while (i10 < this.f66094c && this.f66092a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f66092a;
        int i11 = this.f66093b;
        int i12 = AbstractC20817s.f66106a;
        String str = new String(bArr, i11, i10 - i11, AbstractC10531d.f31242c);
        this.f66093b = i10;
        if (i10 < this.f66094c) {
            this.f66093b = i10 + 1;
        }
        return str;
    }

    /* JADX INFO: renamed from: p */
    public final String m21361p(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f66093b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f66094c || this.f66092a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f66092a;
        int i14 = AbstractC20817s.f66106a;
        String str = new String(bArr, i11, i13, AbstractC10531d.f31242c);
        this.f66093b += i10;
        return str;
    }

    /* JADX INFO: renamed from: q */
    public final short m21362q() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f66093b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    /* JADX INFO: renamed from: r */
    public final String m21363r(int i10, Charset charset) {
        String str = new String(this.f66092a, this.f66093b, i10, charset);
        this.f66093b += i10;
        return str;
    }

    /* JADX INFO: renamed from: s */
    public final int m21364s() {
        return (m21365t() << 21) | (m21365t() << 14) | (m21365t() << 7) | m21365t();
    }

    /* JADX INFO: renamed from: t */
    public final int m21365t() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        this.f66093b = i10 + 1;
        return bArr[i10] & 255;
    }

    /* JADX INFO: renamed from: u */
    public final int m21366u() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f66093b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f66093b = i10 + 4;
        return i13;
    }

    /* JADX INFO: renamed from: v */
    public final long m21367v() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f66093b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f66093b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f66093b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    /* JADX INFO: renamed from: w */
    public final int m21368w() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f66093b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f66093b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    /* JADX INFO: renamed from: x */
    public final int m21369x() {
        int iM21352g = m21352g();
        if (iM21352g >= 0) {
            return iM21352g;
        }
        throw new IllegalStateException(AbstractC10763a.m11048f(iM21352g, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: y */
    public final long m21370y() {
        long jM21359n = m21359n();
        if (jM21359n >= 0) {
            return jM21359n;
        }
        throw new IllegalStateException(AbstractC10763a.m11049g(jM21359n, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: z */
    public final int m21371z() {
        byte[] bArr = this.f66092a;
        int i10 = this.f66093b;
        int i11 = i10 + 1;
        this.f66093b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f66093b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public C20811m(int i10) {
        this.f66092a = new byte[i10];
        this.f66094c = i10;
    }

    public C20811m(byte[] bArr) {
        this.f66092a = bArr;
        this.f66094c = bArr.length;
    }

    public C20811m(int i10, byte[] bArr) {
        this.f66092a = bArr;
        this.f66094c = i10;
    }
}
