package p1097x3;

import java.util.Arrays;
import p1016t3.C19781h;
import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p372P3.C6318J;

/* JADX INFO: renamed from: x3.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21121g {

    /* JADX INFO: renamed from: a */
    public static final byte[] f67114a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f67115b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f67116c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f67117d = new int[10];

    /* JADX INFO: renamed from: a */
    public static void m21584a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m21585b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        AbstractC20800b.m21320h(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            m21584a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            m21584a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            m21584a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b = bArr[i14];
            if ((b & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b == 1) {
                    m21584a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    /* JADX INFO: renamed from: c */
    public static C21118d m21586c(byte[] bArr, int i10, int i11) {
        int i12;
        int iM20742g;
        int i13;
        int i14;
        int i15;
        C6318J c6318j = new C6318J(bArr, i10 + 2, i11);
        int i16 = 4;
        c6318j.m6883t(4);
        int iM6872i = c6318j.m6872i(3);
        c6318j.m6882s();
        int iM6872i2 = c6318j.m6872i(2);
        boolean zM6871h = c6318j.m6871h();
        int iM6872i3 = c6318j.m6872i(5);
        int i17 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (c6318j.m6871h()) {
                i17 |= 1 << i18;
            }
        }
        int[] iArr = new int[6];
        for (int i19 = 0; i19 < 6; i19++) {
            iArr[i19] = c6318j.m6872i(8);
        }
        int iM6872i4 = c6318j.m6872i(8);
        int i20 = 0;
        for (int i21 = 0; i21 < iM6872i; i21++) {
            if (c6318j.m6871h()) {
                i20 += 89;
            }
            if (c6318j.m6871h()) {
                i20 += 8;
            }
        }
        c6318j.m6883t(i20);
        if (iM6872i > 0) {
            c6318j.m6883t((8 - iM6872i) * 2);
        }
        c6318j.m6876m();
        int iM6876m = c6318j.m6876m();
        if (iM6876m == 3) {
            c6318j.m6882s();
        }
        int iM6876m2 = c6318j.m6876m();
        int iM6876m3 = c6318j.m6876m();
        if (c6318j.m6871h()) {
            int iM6876m4 = c6318j.m6876m();
            int iM6876m5 = c6318j.m6876m();
            int iM6876m6 = c6318j.m6876m();
            int iM6876m7 = c6318j.m6876m();
            iM6876m2 -= (iM6876m4 + iM6876m5) * ((iM6876m == 1 || iM6876m == 2) ? 2 : 1);
            iM6876m3 -= (iM6876m6 + iM6876m7) * (iM6876m == 1 ? 2 : 1);
        }
        int i22 = iM6876m3;
        int i23 = iM6876m2;
        int iM6876m8 = c6318j.m6876m();
        int iM6876m9 = c6318j.m6876m();
        int iM6876m10 = c6318j.m6876m();
        int iM20741f = -1;
        int iMax = -1;
        for (int i24 = c6318j.m6871h() ? 0 : iM6872i; i24 <= iM6872i; i24++) {
            c6318j.m6876m();
            iMax = Math.max(c6318j.m6876m(), iMax);
            c6318j.m6876m();
        }
        c6318j.m6876m();
        c6318j.m6876m();
        c6318j.m6876m();
        c6318j.m6876m();
        c6318j.m6876m();
        c6318j.m6876m();
        if (c6318j.m6871h() && c6318j.m6871h()) {
            int i25 = 0;
            while (i25 < i16) {
                int i26 = 0;
                while (i26 < 6) {
                    if (c6318j.m6871h()) {
                        int iMin = Math.min(64, 1 << ((i25 << 1) + i16));
                        if (i25 > 1) {
                            c6318j.m6877n();
                        }
                        for (int i27 = 0; i27 < iMin; i27++) {
                            c6318j.m6877n();
                        }
                    } else {
                        c6318j.m6876m();
                    }
                    i26 += i25 == 3 ? 3 : 1;
                    i16 = 4;
                }
                i25++;
                i16 = 4;
            }
        }
        c6318j.m6883t(2);
        if (c6318j.m6871h()) {
            c6318j.m6883t(8);
            c6318j.m6876m();
            c6318j.m6876m();
            c6318j.m6882s();
        }
        int iM6876m11 = c6318j.m6876m();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i28 = 0;
        int i29 = -1;
        int i30 = -1;
        while (i28 < iM6876m11) {
            if (i28 == 0 || !c6318j.m6871h()) {
                int iM6876m12 = c6318j.m6876m();
                int iM6876m13 = c6318j.m6876m();
                iArr2 = new int[iM6876m12];
                int i31 = 0;
                while (i31 < iM6876m12) {
                    iArr2[i31] = (i31 > 0 ? iArr2[i31 - 1] : 0) - (c6318j.m6876m() + 1);
                    c6318j.m6882s();
                    i31++;
                }
                iArrCopyOf = new int[iM6876m13];
                int i32 = 0;
                while (i32 < iM6876m13) {
                    iArrCopyOf[i32] = c6318j.m6876m() + 1 + (i32 > 0 ? iArrCopyOf[i32 - 1] : 0);
                    c6318j.m6882s();
                    i32++;
                }
                i29 = iM6876m12;
                i15 = iM6876m13;
            } else {
                int i33 = i29 + i30;
                int iM6876m14 = (1 - ((c6318j.m6871h() ? 1 : 0) * 2)) * (c6318j.m6876m() + 1);
                int i34 = i33 + 1;
                boolean[] zArr = new boolean[i34];
                for (int i35 = 0; i35 <= i33; i35++) {
                    if (c6318j.m6871h()) {
                        zArr[i35] = true;
                    } else {
                        zArr[i35] = c6318j.m6871h();
                    }
                }
                int[] iArr3 = new int[i34];
                int[] iArr4 = new int[i34];
                int i36 = 0;
                for (int i37 = i30 - 1; i37 >= 0; i37--) {
                    int i38 = iArrCopyOf[i37] + iM6876m14;
                    if (i38 < 0 && zArr[i29 + i37]) {
                        iArr3[i36] = i38;
                        i36++;
                    }
                }
                if (iM6876m14 < 0 && zArr[i33]) {
                    iArr3[i36] = iM6876m14;
                    i36++;
                }
                int i39 = i36;
                for (int i40 = 0; i40 < i29; i40++) {
                    int i41 = iArr2[i40] + iM6876m14;
                    if (i41 < 0 && zArr[i40]) {
                        iArr3[i39] = i41;
                        i39++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr3, i39);
                int i42 = 0;
                for (int i43 = i29 - 1; i43 >= 0; i43--) {
                    int i44 = iArr2[i43] + iM6876m14;
                    if (i44 > 0 && zArr[i43]) {
                        iArr4[i42] = i44;
                        i42++;
                    }
                }
                if (iM6876m14 > 0 && zArr[i33]) {
                    iArr4[i42] = iM6876m14;
                    i42++;
                }
                i15 = i42;
                for (int i45 = 0; i45 < i30; i45++) {
                    int i46 = iArrCopyOf[i45] + iM6876m14;
                    if (i46 > 0 && zArr[i29 + i45]) {
                        iArr4[i15] = i46;
                        i15++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr4, i15);
                iArr2 = iArrCopyOf2;
                i29 = i39;
            }
            i28++;
            i30 = i15;
            iM6876m11 = iM6876m11;
            iMax = iMax;
            iM6872i4 = iM6872i4;
            iArr = iArr;
            i17 = i17;
            iM6872i3 = iM6872i3;
        }
        int i47 = iM6872i3;
        int i48 = i17;
        int[] iArr5 = iArr;
        int i49 = iM6872i4;
        int i50 = iMax;
        if (c6318j.m6871h()) {
            int iM6876m15 = c6318j.m6876m();
            for (int i51 = 0; i51 < iM6876m15; i51++) {
                c6318j.m6883t(iM6876m10 + 5);
            }
        }
        c6318j.m6883t(2);
        float f10 = 1.0f;
        if (c6318j.m6871h()) {
            if (c6318j.m6871h()) {
                int iM6872i5 = c6318j.m6872i(8);
                if (iM6872i5 == 255) {
                    int iM6872i6 = c6318j.m6872i(16);
                    int iM6872i7 = c6318j.m6872i(16);
                    if (iM6872i6 != 0 && iM6872i7 != 0) {
                        f10 = iM6872i6 / iM6872i7;
                    }
                } else if (iM6872i5 < 17) {
                    f10 = f67115b[iM6872i5];
                } else {
                    AbstractC20734X.m21224A(iM6872i5, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (c6318j.m6871h()) {
                c6318j.m6882s();
            }
            if (c6318j.m6871h()) {
                c6318j.m6883t(3);
                i14 = c6318j.m6871h() ? 1 : 2;
                if (c6318j.m6871h()) {
                    int iM6872i8 = c6318j.m6872i(8);
                    int iM6872i9 = c6318j.m6872i(8);
                    c6318j.m6883t(8);
                    iM20741f = C19781h.m20741f(iM6872i8);
                    iM20742g = C19781h.m20742g(iM6872i9);
                } else {
                    iM20742g = -1;
                }
            } else {
                i14 = -1;
                iM20742g = -1;
            }
            if (c6318j.m6871h()) {
                c6318j.m6876m();
                c6318j.m6876m();
            }
            c6318j.m6882s();
            if (c6318j.m6871h()) {
                i22 *= 2;
            }
            i13 = i14;
            i12 = i22;
        } else {
            i12 = i22;
            iM20742g = -1;
            i13 = -1;
        }
        return new C21118d(iM6872i2, zM6871h, i47, i48, iM6876m8, iM6876m9, iArr5, i49, i23, i12, f10, i50, iM20741f, i13, iM20742g);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:104:0x01af  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:124:0x0208  */
    /* JADX WARN: Code duplicated, block: B:127:0x0213  */
    /* JADX WARN: Code duplicated, block: B:130:0x021c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0223  */
    /* JADX WARN: Code duplicated, block: B:136:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0250  */
    /* JADX WARN: Code duplicated, block: B:138:0x025b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x015b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0183  */
    /* JADX WARN: Code duplicated, block: B:95:0x0189  */
    /* JADX WARN: Code duplicated, block: B:97:0x0193  */
    /* JADX INFO: renamed from: d */
    public static C21120f m21587d(byte[] bArr, int i10, int i11) {
        int iM6876m;
        boolean z6;
        int i12;
        int i13;
        int iM6876m2;
        boolean z10;
        boolean zM6871h;
        int i14;
        int i15;
        int i16;
        int i17;
        float f10;
        int i18;
        float f11;
        int i19;
        int i20;
        int i21;
        int i22;
        int iM20742g;
        int iM20741f;
        int i23;
        boolean zM6871h2;
        boolean zM6871h3;
        int iM6872i;
        int iM6872i2;
        int iM6872i3;
        int i24;
        int i25;
        int i26;
        int i27;
        C6318J c6318j = new C6318J(bArr, i10 + 1, i11);
        int iM6872i4 = c6318j.m6872i(8);
        int iM6872i5 = c6318j.m6872i(8);
        int iM6872i6 = c6318j.m6872i(8);
        int iM6876m3 = c6318j.m6876m();
        if (iM6872i4 == 100 || iM6872i4 == 110 || iM6872i4 == 122 || iM6872i4 == 244 || iM6872i4 == 44 || iM6872i4 == 83 || iM6872i4 == 86 || iM6872i4 == 118 || iM6872i4 == 128 || iM6872i4 == 138) {
            iM6876m = c6318j.m6876m();
            boolean zM6871h4 = iM6876m == 3 ? c6318j.m6871h() : false;
            int iM6876m4 = c6318j.m6876m();
            int iM6876m5 = c6318j.m6876m();
            c6318j.m6882s();
            if (c6318j.m6871h()) {
                int i28 = iM6876m == 3 ? 12 : 8;
                int i29 = 0;
                while (i29 < i28) {
                    if (c6318j.m6871h()) {
                        int i30 = i29 < 6 ? 16 : 64;
                        int iM6877n = 8;
                        int i31 = 8;
                        for (int i32 = 0; i32 < i30; i32++) {
                            if (iM6877n != 0) {
                                iM6877n = ((c6318j.m6877n() + i31) + 256) % 256;
                            }
                            if (iM6877n != 0) {
                                i31 = iM6877n;
                            }
                        }
                    }
                    i29++;
                }
            }
            z6 = zM6871h4;
            i12 = iM6876m4;
            i13 = iM6876m5;
        } else {
            iM6876m = 1;
            i12 = 0;
            i13 = 0;
            z6 = false;
        }
        int iM6876m6 = c6318j.m6876m() + 4;
        int iM6876m7 = c6318j.m6876m();
        if (iM6876m7 != 0) {
            if (iM6876m7 == 1) {
                boolean zM6871h5 = c6318j.m6871h();
                c6318j.m6877n();
                c6318j.m6877n();
                iM6876m7 = iM6876m7;
                long jM6876m = c6318j.m6876m();
                iM6876m = iM6876m;
                for (int i33 = 0; i33 < jM6876m; i33++) {
                    c6318j.m6876m();
                }
                z10 = zM6871h5;
                iM6876m2 = 0;
            } else {
                iM6876m2 = 0;
            }
            c6318j.m6876m();
            c6318j.m6882s();
            int iM6876m8 = c6318j.m6876m() + 1;
            int iM6876m9 = c6318j.m6876m() + 1;
            zM6871h = c6318j.m6871h();
            i14 = 2 - (zM6871h ? 1 : 0);
            int i34 = iM6876m9 * i14;
            if (!zM6871h) {
                c6318j.m6882s();
            }
            c6318j.m6882s();
            i15 = iM6876m8 * 16;
            i16 = i34 * 16;
            if (c6318j.m6871h()) {
                int iM6876m10 = c6318j.m6876m();
                int iM6876m11 = c6318j.m6876m();
                int iM6876m12 = c6318j.m6876m();
                int iM6876m13 = c6318j.m6876m();
                if (iM6876m == 0) {
                    i25 = 1;
                } else {
                    i24 = iM6876m;
                    if (i24 == 3) {
                        i26 = 1;
                        i25 = 1;
                    } else {
                        i25 = 2;
                        i26 = 1;
                    }
                    if (i24 == i26) {
                        i27 = 2;
                    } else {
                        i27 = i26;
                    }
                    i14 *= i27;
                }
                i15 -= (iM6876m10 + iM6876m11) * i25;
                i16 -= (iM6876m12 + iM6876m13) * i14;
            }
            i17 = ((iM6872i4 != 44 || iM6872i4 == 86 || iM6872i4 == 100 || iM6872i4 == 110 || iM6872i4 == 122 || iM6872i4 == 244) && (iM6872i5 & 16) != 0) ? 0 : 16;
            f10 = 1.0f;
            if (c6318j.m6871h()) {
                if (c6318j.m6871h()) {
                    iM6872i = c6318j.m6872i(8);
                    if (iM6872i == 255) {
                        iM6872i2 = c6318j.m6872i(16);
                        iM6872i3 = c6318j.m6872i(16);
                        if (iM6872i2 != 0 && iM6872i3 != 0) {
                            f10 = iM6872i2 / iM6872i3;
                        }
                    } else if (iM6872i < 17) {
                        f10 = f67115b[iM6872i];
                    } else {
                        AbstractC20734X.m21224A(iM6872i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (c6318j.m6871h()) {
                    c6318j.m6882s();
                }
                if (c6318j.m6871h()) {
                    c6318j.m6883t(3);
                    if (c6318j.m6871h()) {
                        i22 = 1;
                    } else {
                        i22 = 2;
                    }
                    if (c6318j.m6871h()) {
                        int iM6872i7 = c6318j.m6872i(8);
                        int iM6872i8 = c6318j.m6872i(8);
                        c6318j.m6883t(8);
                        iM20741f = C19781h.m20741f(iM6872i7);
                        iM20742g = C19781h.m20742g(iM6872i8);
                    }
                    if (c6318j.m6871h()) {
                        c6318j.m6876m();
                        c6318j.m6876m();
                    }
                    i23 = i22;
                    if (c6318j.m6871h()) {
                        c6318j.m6883t(65);
                    }
                    zM6871h2 = c6318j.m6871h();
                    if (zM6871h2) {
                        m21588e(c6318j);
                    }
                    zM6871h3 = c6318j.m6871h();
                    if (zM6871h3) {
                        m21588e(c6318j);
                    }
                    if (zM6871h2 || zM6871h3) {
                        c6318j.m6882s();
                    }
                    c6318j.m6882s();
                    if (c6318j.m6871h()) {
                        c6318j.m6882s();
                        c6318j.m6876m();
                        c6318j.m6876m();
                        c6318j.m6876m();
                        c6318j.m6876m();
                        int iM6876m14 = c6318j.m6876m();
                        c6318j.m6876m();
                        i18 = iM6876m14;
                        i21 = iM20742g;
                        i20 = iM20741f;
                        f11 = f10;
                        i19 = i23;
                    } else {
                        i19 = i23;
                        i21 = iM20742g;
                        i20 = iM20741f;
                        i18 = i17;
                        f11 = f10;
                    }
                } else {
                    i22 = -1;
                }
                iM20742g = -1;
                iM20741f = -1;
                if (c6318j.m6871h()) {
                    c6318j.m6876m();
                    c6318j.m6876m();
                }
                i23 = i22;
                if (c6318j.m6871h()) {
                    c6318j.m6883t(65);
                }
                zM6871h2 = c6318j.m6871h();
                if (zM6871h2) {
                    m21588e(c6318j);
                }
                zM6871h3 = c6318j.m6871h();
                if (zM6871h3) {
                    m21588e(c6318j);
                }
                if (zM6871h2) {
                    c6318j.m6882s();
                } else {
                    c6318j.m6882s();
                }
                c6318j.m6882s();
                if (c6318j.m6871h()) {
                    c6318j.m6882s();
                    c6318j.m6876m();
                    c6318j.m6876m();
                    c6318j.m6876m();
                    c6318j.m6876m();
                    int iM6876m15 = c6318j.m6876m();
                    c6318j.m6876m();
                    i18 = iM6876m15;
                    i21 = iM20742g;
                    i20 = iM20741f;
                    f11 = f10;
                    i19 = i23;
                } else {
                    i19 = i23;
                    i21 = iM20742g;
                    i20 = iM20741f;
                    i18 = i17;
                    f11 = f10;
                }
            } else {
                i18 = i17;
                f11 = 1.0f;
                i19 = -1;
                i20 = -1;
                i21 = -1;
            }
            return new C21120f(iM6872i4, iM6872i5, iM6872i6, iM6876m3, i15, i16, f11, i12, i13, z6, zM6871h, iM6876m6, iM6876m7, iM6876m2, z10, i20, i19, i21, i18);
        }
        iM6876m2 = c6318j.m6876m() + 4;
        z10 = false;
        c6318j.m6876m();
        c6318j.m6882s();
        int iM6876m16 = c6318j.m6876m() + 1;
        int iM6876m17 = c6318j.m6876m() + 1;
        zM6871h = c6318j.m6871h();
        i14 = 2 - (zM6871h ? 1 : 0);
        int i35 = iM6876m17 * i14;
        if (!zM6871h) {
            c6318j.m6882s();
        }
        c6318j.m6882s();
        i15 = iM6876m16 * 16;
        i16 = i35 * 16;
        if (c6318j.m6871h()) {
            int iM6876m18 = c6318j.m6876m();
            int iM6876m19 = c6318j.m6876m();
            int iM6876m110 = c6318j.m6876m();
            int iM6876m111 = c6318j.m6876m();
            if (iM6876m == 0) {
                i25 = 1;
            } else {
                i24 = iM6876m;
                if (i24 == 3) {
                    i26 = 1;
                    i25 = 1;
                } else {
                    i25 = 2;
                    i26 = 1;
                }
                if (i24 == i26) {
                    i27 = 2;
                } else {
                    i27 = i26;
                }
                i14 *= i27;
            }
            i15 -= (iM6876m18 + iM6876m19) * i25;
            i16 -= (iM6876m110 + iM6876m111) * i14;
        }
        if (iM6872i4 != 44) {
        }
        f10 = 1.0f;
        if (c6318j.m6871h()) {
            if (c6318j.m6871h()) {
                iM6872i = c6318j.m6872i(8);
                if (iM6872i == 255) {
                    iM6872i2 = c6318j.m6872i(16);
                    iM6872i3 = c6318j.m6872i(16);
                    if (iM6872i2 != 0) {
                        f10 = iM6872i2 / iM6872i3;
                    }
                } else if (iM6872i < 17) {
                    f10 = f67115b[iM6872i];
                } else {
                    AbstractC20734X.m21224A(iM6872i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (c6318j.m6871h()) {
                c6318j.m6882s();
            }
            if (c6318j.m6871h()) {
                c6318j.m6883t(3);
                if (c6318j.m6871h()) {
                    i22 = 1;
                } else {
                    i22 = 2;
                }
                if (c6318j.m6871h()) {
                    int iM6872i9 = c6318j.m6872i(8);
                    int iM6872i10 = c6318j.m6872i(8);
                    c6318j.m6883t(8);
                    iM20741f = C19781h.m20741f(iM6872i9);
                    iM20742g = C19781h.m20742g(iM6872i10);
                }
                if (c6318j.m6871h()) {
                    c6318j.m6876m();
                    c6318j.m6876m();
                }
                i23 = i22;
                if (c6318j.m6871h()) {
                    c6318j.m6883t(65);
                }
                zM6871h2 = c6318j.m6871h();
                if (zM6871h2) {
                    m21588e(c6318j);
                }
                zM6871h3 = c6318j.m6871h();
                if (zM6871h3) {
                    m21588e(c6318j);
                }
                if (zM6871h2) {
                    c6318j.m6882s();
                } else {
                    c6318j.m6882s();
                }
                c6318j.m6882s();
                if (c6318j.m6871h()) {
                    c6318j.m6882s();
                    c6318j.m6876m();
                    c6318j.m6876m();
                    c6318j.m6876m();
                    c6318j.m6876m();
                    int iM6876m112 = c6318j.m6876m();
                    c6318j.m6876m();
                    i18 = iM6876m112;
                    i21 = iM20742g;
                    i20 = iM20741f;
                    f11 = f10;
                    i19 = i23;
                } else {
                    i19 = i23;
                    i21 = iM20742g;
                    i20 = iM20741f;
                    i18 = i17;
                    f11 = f10;
                }
            } else {
                i22 = -1;
            }
            iM20742g = -1;
            iM20741f = -1;
            if (c6318j.m6871h()) {
                c6318j.m6876m();
                c6318j.m6876m();
            }
            i23 = i22;
            if (c6318j.m6871h()) {
                c6318j.m6883t(65);
            }
            zM6871h2 = c6318j.m6871h();
            if (zM6871h2) {
                m21588e(c6318j);
            }
            zM6871h3 = c6318j.m6871h();
            if (zM6871h3) {
                m21588e(c6318j);
            }
            if (zM6871h2) {
                c6318j.m6882s();
            } else {
                c6318j.m6882s();
            }
            c6318j.m6882s();
            if (c6318j.m6871h()) {
                c6318j.m6882s();
                c6318j.m6876m();
                c6318j.m6876m();
                c6318j.m6876m();
                c6318j.m6876m();
                int iM6876m113 = c6318j.m6876m();
                c6318j.m6876m();
                i18 = iM6876m113;
                i21 = iM20742g;
                i20 = iM20741f;
                f11 = f10;
                i19 = i23;
            } else {
                i19 = i23;
                i21 = iM20742g;
                i20 = iM20741f;
                i18 = i17;
                f11 = f10;
            }
        } else {
            i18 = i17;
            f11 = 1.0f;
            i19 = -1;
            i20 = -1;
            i21 = -1;
        }
        return new C21120f(iM6872i4, iM6872i5, iM6872i6, iM6876m3, i15, i16, f11, i12, i13, z6, zM6871h, iM6876m6, iM6876m7, iM6876m2, z10, i20, i19, i21, i18);
    }

    /* JADX INFO: renamed from: e */
    public static void m21588e(C6318J c6318j) {
        int iM6876m = c6318j.m6876m() + 1;
        c6318j.m6883t(8);
        for (int i10 = 0; i10 < iM6876m; i10++) {
            c6318j.m6876m();
            c6318j.m6876m();
            c6318j.m6882s();
        }
        c6318j.m6883t(20);
    }

    /* JADX INFO: renamed from: f */
    public static int m21589f(int i10, byte[] bArr) {
        int i11;
        synchronized (f67116c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f67117d;
                    if (iArr.length <= i13) {
                        f67117d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f67117d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f67117d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
