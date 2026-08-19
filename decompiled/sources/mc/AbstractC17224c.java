package mc;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import lc.C16842b;
import p666bl.C11500p;
import p785hc.C14443b;
import p808ic.C14957a;

/* JADX INFO: renamed from: mc.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17224c {

    /* JADX INFO: renamed from: a */
    public static final int[][] f54964a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b */
    public static final int[][] f54965b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c */
    public static final int[][] f54966c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d */
    public static final int[][] f54967d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: renamed from: a */
    public static int m18957a(C11500p c11500p, boolean z6) {
        int i10 = c11500p.f34808Z;
        int i11 = c11500p.f34809o0;
        int i12 = z6 ? i11 : i10;
        if (!z6) {
            i10 = i11;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte b = -1;
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                byte[][] bArr = (byte[][]) c11500p.f34810p0;
                byte b10 = z6 ? bArr[i14][i16] : bArr[i16][i14];
                if (b10 == b) {
                    i15++;
                } else {
                    if (i15 >= 5) {
                        i13 += i15 - 2;
                    }
                    i15 = 1;
                    b = b10;
                }
            }
            if (i15 >= 5) {
                i13 = (i15 - 2) + i13;
            }
        }
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0255  */
    /* JADX WARN: Code duplicated, block: B:117:0x0258  */
    /* JADX WARN: Code duplicated, block: B:119:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m18958b(C14957a c14957a, int i10, C16842b c16842b, int i11, C11500p c11500p) {
        int i12;
        int i13;
        int i14;
        boolean z6;
        int i15;
        boolean z10;
        int i16;
        int i17;
        byte[][] bArr = (byte[][]) c11500p.f34810p0;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = f54964a[0].length;
        m18961e(0, 0, c11500p);
        int i18 = c11500p.f34808Z;
        int i19 = i18 - length;
        m18961e(i19, 0, c11500p);
        m18961e(0, i19, c11500p);
        m18960d(0, 7, c11500p);
        int i20 = i18 - 8;
        m18960d(i20, 7, c11500p);
        m18960d(0, i20, c11500p);
        m18962f(7, 0, c11500p);
        int i21 = c11500p.f34809o0;
        int i22 = i21 - 8;
        m18962f(i22, 0, c11500p);
        int i23 = i21 - 7;
        m18962f(7, i23, c11500p);
        if (c11500p.m12897f(8, i22) == 0) {
            throw new C14443b();
        }
        c11500p.m12898g(8, i22, 1);
        int i24 = c16842b.f54021a;
        if (i24 >= 2) {
            int[] iArr = f54966c[i24 - 1];
            int length2 = iArr.length;
            int i25 = 0;
            while (i25 < length2) {
                int i26 = iArr[i25];
                if (i26 >= 0) {
                    int length3 = iArr.length;
                    int i27 = 0;
                    while (i27 < length3) {
                        int i28 = length2;
                        int i29 = iArr[i27];
                        if (i29 >= 0 && m18963g(c11500p.m12897f(i29, i26))) {
                            int i30 = i29 - 2;
                            int i31 = i26 - 2;
                            int i32 = 5;
                            int i33 = 0;
                            while (i33 < i32) {
                                int[] iArr2 = f54965b[i33];
                                int i34 = length3;
                                int i35 = 0;
                                while (i35 < i32) {
                                    c11500p.m12898g(i30 + i35, i31 + i33, iArr2[i35]);
                                    i35++;
                                    i32 = 5;
                                    i30 = i30;
                                }
                                i33++;
                                i32 = 5;
                                length3 = i34;
                            }
                        }
                        i27++;
                        length2 = i28;
                        i26 = i26;
                        iArr = iArr;
                        length3 = length3;
                    }
                }
                i25++;
                length2 = length2;
                iArr = iArr;
            }
        }
        int i36 = 8;
        while (true) {
            i12 = 6;
            if (i36 >= i20) {
                break;
            }
            int i37 = i36 + 1;
            int i38 = i37 % 2;
            if (m18963g(c11500p.m12897f(i36, 6))) {
                c11500p.m12898g(i36, 6, i38);
            }
            if (m18963g(c11500p.m12897f(6, i36))) {
                c11500p.m12898g(6, i36, i38);
            }
            i36 = i37;
        }
        C14957a c14957a2 = new C14957a();
        if (i11 < 0 || i11 >= 8) {
            throw new C14443b("Invalid mask pattern");
        }
        int i39 = 1;
        if (i10 != 1) {
            i39 = 2;
            if (i10 == 2) {
                i39 = 0;
            } else if (i10 == 3) {
                i39 = 3;
            } else if (i10 != 4) {
                throw null;
            }
        }
        int i40 = (i39 << 3) | i11;
        c14957a2.m16123b(i40, 5);
        c14957a2.m16123b(m18959c(i40, 1335), 10);
        C14957a c14957a3 = new C14957a();
        c14957a3.m16123b(21522, 15);
        if (c14957a2.f46586Z != c14957a3.f46586Z) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i41 = 0;
        while (true) {
            int[] iArr3 = c14957a2.f46585Y;
            if (i41 >= iArr3.length) {
                break;
            }
            iArr3[i41] = iArr3[i41] ^ c14957a3.f46585Y[i41];
            i41++;
        }
        if (c14957a2.f46586Z != 15) {
            throw new C14443b("should not happen but we got: " + c14957a2.f46586Z);
        }
        int i42 = 0;
        while (true) {
            int i43 = c14957a2.f46586Z;
            if (i42 >= i43) {
                break;
            }
            boolean zM16125d = c14957a2.m16125d((i43 - 1) - i42);
            int[] iArr4 = f54967d[i42];
            int i44 = iArr4[0];
            byte[] bArr3 = bArr[iArr4[1]];
            byte b = zM16125d ? (byte) 1 : (byte) 0;
            bArr3[i44] = b;
            if (i42 < 8) {
                i17 = (i18 - i42) - 1;
                i16 = 8;
            } else {
                i16 = (i42 - 8) + i23;
                i17 = 8;
            }
            bArr[i16][i17] = b;
            i42++;
        }
        if (i24 >= 7) {
            C14957a c14957a4 = new C14957a();
            c14957a4.m16123b(i24, 6);
            c14957a4.m16123b(m18959c(i24, 7973), 12);
            if (c14957a4.f46586Z != 18) {
                throw new C14443b("should not happen but we got: " + c14957a4.f46586Z);
            }
            int i45 = 17;
            for (int i46 = 0; i46 < 6; i46++) {
                for (int i47 = 0; i47 < 3; i47++) {
                    boolean zM16125d2 = c14957a4.m16125d(i45);
                    i45--;
                    int i48 = (i21 - 11) + i47;
                    byte[] bArr4 = bArr[i48];
                    byte b10 = zM16125d2 ? (byte) 1 : (byte) 0;
                    bArr4[i46] = b10;
                    bArr[i46][i48] = b10;
                }
            }
        }
        int i49 = i18 - 1;
        int i50 = i21 - 1;
        int i51 = 0;
        int i52 = -1;
        while (i49 > 0) {
            if (i49 == i12) {
                i49--;
            }
            while (i50 >= 0 && i50 < i21) {
                for (int i53 = 0; i53 < 2; i53++) {
                    int i54 = i49 - i53;
                    if (m18963g(c11500p.m12897f(i54, i50))) {
                        if (i51 < c14957a.f46586Z) {
                            boolean zM16125d3 = c14957a.m16125d(i51);
                            i51++;
                            i13 = zM16125d3;
                        } else {
                            i13 = 0;
                        }
                        if (i11 != -1) {
                            switch (i11) {
                                case 0:
                                    i14 = i50 + i54;
                                    z6 = true;
                                    i15 = i14 & 1;
                                    if (i15 == 0) {
                                        z10 = z6;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i13 = ~i13;
                                    }
                                    break;
                                case 1:
                                    i15 = i50 & 1;
                                    z6 = true;
                                    if (i15 == 0) {
                                        z10 = z6;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i13 = ~i13;
                                    }
                                    break;
                                case 2:
                                    i15 = i54 % 3;
                                    z6 = true;
                                    if (i15 == 0) {
                                        z10 = z6;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i13 = ~i13;
                                    }
                                    break;
                                case 3:
                                    i15 = (i50 + i54) % 3;
                                    z6 = true;
                                    if (i15 == 0) {
                                        z10 = z6;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i13 = ~i13;
                                    }
                                    break;
                                case 4:
                                    z6 = true;
                                    i15 = ((i54 / 3) + (i50 / 2)) & 1;
                                    if (i15 == 0) {
                                        z10 = z6;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i13 = ~i13;
                                    }
                                    break;
                                case 5:
                                    int i55 = i50 * i54;
                                    i15 = (i55 % 3) + (i55 & 1);
                                    z6 = true;
                                    if (i15 == 0) {
                                        z10 = z6;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i13 = ~i13;
                                    }
                                    break;
                                case 6:
                                    int i56 = i50 * i54;
                                    i15 = ((i56 % 3) + (i56 & 1)) & 1;
                                    z6 = true;
                                    if (i15 == 0) {
                                        z10 = z6;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i13 = ~i13;
                                    }
                                    break;
                                case 7:
                                    z6 = true;
                                    i14 = ((i50 * i54) % 3) + ((i50 + i54) & 1);
                                    i15 = i14 & 1;
                                    if (i15 == 0) {
                                        z10 = z6;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i13 = ~i13;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "Invalid mask pattern: "));
                            }
                        }
                        bArr[i50][i54] = (byte) i13;
                    }
                }
                i50 += i52;
            }
            i52 = -i52;
            i50 += i52;
            i49 -= 2;
            i12 = 6;
        }
        if (i51 == c14957a.f46586Z) {
            return;
        }
        throw new C14443b("Not all bits consumed: " + i51 + '/' + c14957a.f46586Z);
    }

    /* JADX INFO: renamed from: c */
    public static int m18959c(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
        int i12 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i10 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i12) {
            iNumberOfLeadingZeros2 ^= i11 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i12);
        }
        return iNumberOfLeadingZeros2;
    }

    /* JADX INFO: renamed from: d */
    public static void m18960d(int i10, int i11, C11500p c11500p) throws C14443b {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!m18963g(c11500p.m12897f(i13, i11))) {
                throw new C14443b();
            }
            c11500p.m12898g(i13, i11, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m18961e(int i10, int i11, C11500p c11500p) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f54964a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                c11500p.m12898g(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m18962f(int i10, int i11, C11500p c11500p) throws C14443b {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!m18963g(c11500p.m12897f(i10, i13))) {
                throw new C14443b();
            }
            c11500p.m12898g(i10, i13, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18963g(int i10) {
        return i10 == -1;
    }
}
