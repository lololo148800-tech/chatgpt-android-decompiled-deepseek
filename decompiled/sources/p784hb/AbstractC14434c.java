package p784hb;

import fo.C13711h;
import java.util.Arrays;
import p658b5.C11234e;
import p658b5.C11241l;

/* JADX INFO: renamed from: hb.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14434c {

    /* JADX INFO: renamed from: a */
    public static final C11241l f45398a = new C11241l(new C13711h(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 21), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: b */
    public static final byte[] f45399b = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: renamed from: c */
    public static final int[] f45400c = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: d */
    public static final int[] f45401d = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: e */
    public static final int[] f45402e = {67108863, 33554431};

    /* JADX INFO: renamed from: f */
    public static final int[] f45403f = {26, 25};

    /* JADX INFO: renamed from: a */
    public static boolean m15936a(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        m15944i(jArr2);
        byte[] bArrM15938c = m15938c(jArr2);
        for (int i10 = 0; i10 < 32; i10++) {
            if (bArrM15938c[i10] != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m15937b(C11241l c11241l, C11234e c11234e, C14432a c14432a) {
        long[] jArr = new long[10];
        C13711h c13711h = (C13711h) c11241l.f34016Y;
        long[] jArr2 = (long[]) c13711h.f43259Z;
        C13711h c13711h2 = (C13711h) c11234e.f34001Z;
        m15949n(jArr2, (long[]) c13711h2.f43260o0, (long[]) c13711h2.f43259Z);
        m15948m((long[]) c13711h.f43260o0, (long[]) c13711h2.f43260o0, (long[]) c13711h2.f43259Z);
        long[] jArr3 = c14432a.f45395b;
        long[] jArr4 = (long[]) c13711h.f43260o0;
        m15942g(jArr4, jArr4, jArr3);
        long[] jArr5 = c14432a.f45394a;
        long[] jArr6 = (long[]) c13711h.f43261p0;
        long[] jArr7 = (long[]) c13711h.f43259Z;
        m15942g(jArr6, jArr7, jArr5);
        long[] jArr8 = c14432a.f45396c;
        long[] jArr9 = (long[]) c11241l.f34017Z;
        m15942g(jArr9, (long[]) c11234e.f34002o0, jArr8);
        c14432a.mo15935a(jArr7, (long[]) c13711h2.f43261p0);
        m15949n(jArr, jArr7, jArr7);
        m15948m(jArr7, jArr6, jArr4);
        m15949n(jArr4, jArr6, jArr4);
        m15949n(jArr6, jArr, jArr9);
        m15948m(jArr9, jArr, jArr9);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m15938c(long[] jArr) {
        int[] iArr;
        int i10;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        while (true) {
            iArr = f45403f;
            i10 = 2;
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j10 = jArrCopyOf[i12];
                int i13 = iArr[i12 & 1];
                int i14 = -((int) (((j10 >> 31) & j10) >> i13));
                jArrCopyOf[i12] = j10 + ((long) (i14 << i13));
                i12++;
                jArrCopyOf[i12] = jArrCopyOf[i12] - ((long) i14);
            }
            long j11 = jArrCopyOf[9];
            int i15 = -((int) (((j11 >> 31) & j11) >> 25));
            jArrCopyOf[9] = j11 + ((long) (i15 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - ((long) (i15 * 19));
            i11++;
        }
        long j12 = jArrCopyOf[0];
        int i16 = -((int) (((j12 >> 31) & j12) >> 26));
        jArrCopyOf[0] = j12 + ((long) (i16 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i16);
        int i17 = 0;
        while (true) {
            iArr2 = f45402e;
            if (i17 >= i10) {
                break;
            }
            int i18 = 0;
            while (i18 < 9) {
                long j13 = jArrCopyOf[i18];
                int i19 = i18 & 1;
                int i20 = (int) (j13 >> iArr[i19]);
                jArrCopyOf[i18] = j13 & ((long) iArr2[i19]);
                i18++;
                jArrCopyOf[i18] = jArrCopyOf[i18] + ((long) i20);
            }
            i17++;
            i10 = 2;
        }
        long j14 = jArrCopyOf[9];
        jArrCopyOf[9] = j14 & 33554431;
        long j15 = jArrCopyOf[0] + ((long) (((int) (j14 >> 25)) * 19));
        jArrCopyOf[0] = j15;
        int i21 = ~((((int) j15) - 67108845) >> 31);
        for (int i22 = 1; i22 < 10; i22++) {
            int i23 = ~(((int) jArrCopyOf[i22]) ^ iArr2[i22 & 1]);
            int i24 = i23 & (i23 << 16);
            int i25 = i24 & (i24 << 8);
            int i26 = i25 & (i25 << 4);
            int i27 = i26 & (i26 << 2);
            i21 &= (i27 & (i27 << 1)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) (67108845 & i21));
        long j16 = 33554431 & i21;
        jArrCopyOf[1] = jArrCopyOf[1] - j16;
        for (int i28 = 2; i28 < 10; i28 += 2) {
            jArrCopyOf[i28] = jArrCopyOf[i28] - ((long) (67108863 & i21));
            int i29 = i28 + 1;
            jArrCopyOf[i29] = jArrCopyOf[i29] - j16;
        }
        for (int i30 = 0; i30 < 10; i30++) {
            jArrCopyOf[i30] = jArrCopyOf[i30] << f45401d[i30];
        }
        byte[] bArr = new byte[32];
        for (int i31 = 0; i31 < 10; i31++) {
            int i32 = f45400c[i31];
            long j17 = bArr[i32];
            long j18 = jArrCopyOf[i31];
            bArr[i32] = (byte) (j17 | (j18 & 255));
            int i33 = i32 + 1;
            bArr[i33] = (byte) (((long) bArr[i33]) | ((j18 >> 8) & 255));
            int i34 = i32 + 2;
            bArr[i34] = (byte) (((long) bArr[i34]) | ((j18 >> 16) & 255));
            int i35 = i32 + 3;
            bArr[i35] = (byte) (((long) bArr[i35]) | ((j18 >> 24) & 255));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    public static long[] m15939d(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = f45400c[i10];
            jArr[i10] = ((((((long) (bArr[i11] & 255)) | (((long) (bArr[i11 + 1] & 255)) << 8)) | (((long) (bArr[i11 + 2] & 255)) << 16)) | (((long) (bArr[i11 + 3] & 255)) << 24)) >> f45401d[i10]) & ((long) f45402e[i10 & 1]);
        }
        return jArr;
    }

    /* JADX INFO: renamed from: e */
    public static long m15940e(int i10, byte[] bArr) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (((long) bArr[i10]) & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    /* JADX INFO: renamed from: f */
    public static long m15941f(int i10, byte[] bArr) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | m15940e(i10, bArr);
    }

    /* JADX INFO: renamed from: g */
    public static void m15942g(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr2[0];
        long j11 = jArr3[0];
        long j12 = j10 * j11;
        long j13 = jArr3[1];
        long j14 = jArr2[1];
        long j15 = (j14 * j11) + (j10 * j13);
        long j16 = jArr3[2];
        long j17 = jArr2[2];
        long j18 = (j17 * j11) + (j10 * j16) + (j14 * 2 * j13);
        long j19 = jArr3[3];
        long j20 = jArr2[3];
        long j21 = (j20 * j11) + (j10 * j19) + (j17 * j13) + (j14 * j16);
        long j22 = jArr3[4];
        long j23 = jArr2[4];
        long j24 = (j23 * j11) + (j10 * j22) + (((j20 * j13) + (j14 * j19)) * 2) + (j17 * j16);
        long j25 = jArr3[5];
        long j26 = (j10 * j25) + (j23 * j13) + (j14 * j22) + (j20 * j16) + (j17 * j19);
        long j27 = jArr2[5];
        long j28 = (j27 * j11) + j26;
        long j29 = jArr3[6];
        long j30 = (j10 * j29) + (j23 * j16) + (j17 * j22) + (((j27 * j13) + (j14 * j25) + (j20 * j19)) * 2);
        long j31 = jArr2[6];
        long j32 = (j31 * j11) + j30;
        long j33 = jArr3[7];
        long j34 = (j10 * j33) + (j31 * j13) + (j14 * j29) + (j27 * j16) + (j17 * j25) + (j23 * j19) + (j20 * j22);
        long j35 = jArr2[7];
        long j36 = (j35 * j11) + j34;
        long j37 = jArr3[8];
        long j38 = jArr2[8];
        long j39 = (j38 * j11) + (j10 * j37) + (j31 * j16) + (j17 * j29) + (((j35 * j13) + (j14 * j33) + (j27 * j19) + (j20 * j25)) * 2) + (j23 * j22);
        long j40 = jArr3[9];
        long j41 = (j10 * j40) + (j38 * j13) + (j14 * j37) + (j35 * j16) + (j17 * j33) + (j31 * j19) + (j20 * j29) + (j27 * j22) + (j23 * j25);
        long j42 = jArr2[9];
        long j43 = j13 * j42;
        long j44 = (j38 * j16) + (j17 * j37) + (j31 * j22) + (j23 * j29) + ((j43 + (j14 * j40) + (j35 * j19) + (j20 * j33) + (j27 * j25)) * 2);
        long j45 = j16 * j42;
        long j46 = j45 + (j17 * j40) + (j38 * j19) + (j20 * j37) + (j35 * j22) + (j23 * j33) + (j31 * j25) + (j27 * j29);
        long j47 = j19 * j42;
        long j48 = j38 * j22;
        long j49 = j22 * j42;
        long j50 = j38 * j29;
        long j51 = j29 * j42;
        m15943h(new long[]{j12, j15, j18, j21, j24, j28, j32, j36, j39, (j11 * j42) + j41, j44, j46, j48 + (j23 * j37) + ((j47 + (j20 * j40) + (j35 * j25) + (j27 * j33)) * 2) + (j31 * j29), j49 + (j23 * j40) + (j38 * j25) + (j27 * j37) + (j35 * j29) + (j31 * j33), j50 + (j31 * j37) + (((j25 * j42) + (j27 * j40) + (j35 * j33)) * 2), j51 + (j31 * j40) + (j38 * j33) + (j35 * j37), (((j33 * j42) + (j35 * j40)) * 2) + (j38 * j37), (j37 * j42) + (j38 * j40), j42 * 2 * j40}, jArr);
    }

    /* JADX INFO: renamed from: h */
    public static void m15943h(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j20 + (j19 << 1);
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j32 + (j31 << 1);
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j36 + (j35 << 1);
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j40 + (j39 << 1);
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j44 + (j43 << 1);
        jArr[0] = j45;
        jArr[0] = j45 + j43;
        m15944i(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* JADX INFO: renamed from: i */
    public static void m15944i(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m15945j(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b = bArr2[i10];
                    if (b != 0) {
                        byte b10 = bArr2[i12];
                        if ((b << i13) + b10 > 15) {
                            if (b10 - (b << i13) < -15) {
                                break;
                            }
                            bArr2[i12] = (byte) (b10 - (b << i13));
                            while (i10 < 256) {
                                if (bArr2[i10] == 0) {
                                    bArr2[i10] = 1;
                                    break;
                                }
                                bArr2[i10] = 0;
                                i10++;
                            }
                        } else {
                            bArr2[i12] = (byte) (b10 + (b << i13));
                            bArr2[i10] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: k */
    public static void m15946k(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = j10 * 2;
        long j12 = jArr2[1];
        long j13 = jArr2[2];
        long j14 = jArr2[3];
        long j15 = jArr2[4];
        long j16 = jArr2[5];
        long j17 = jArr2[6];
        long j18 = jArr2[7];
        long j19 = jArr2[8];
        long j20 = jArr2[9];
        m15943h(new long[]{j10 * j10, j11 * j12, ((j10 * j13) + (j12 * j12)) * 2, ((j10 * j14) + (j12 * j13)) * 2, (j11 * j15) + (j12 * 4 * j14) + (j13 * j13), ((j10 * j16) + (j12 * j15) + (j13 * j14)) * 2, ((j12 * 2 * j16) + (j10 * j17) + (j13 * j15) + (j14 * j14)) * 2, ((j10 * j18) + (j12 * j17) + (j13 * j16) + (j14 * j15)) * 2, (((((j14 * j16) + (j12 * j18)) * 2) + (j10 * j19) + (j13 * j17)) * 2) + (j15 * j15), ((j10 * j20) + (j12 * j19) + (j13 * j18) + (j14 * j17) + (j15 * j16)) * 2, ((((j12 * j20) + (j14 * j18)) * 2) + (j13 * j19) + (j15 * j17) + (j16 * j16)) * 2, ((j13 * j20) + (j14 * j19) + (j15 * j18) + (j16 * j17)) * 2, (((((j14 * j20) + (j16 * j18)) * 2) + (j15 * j19)) * 2) + (j17 * j17), ((j15 * j20) + (j16 * j19) + (j17 * j18)) * 2, ((j16 * 2 * j20) + (j17 * j19) + (j18 * j18)) * 2, ((j17 * j20) + (j18 * j19)) * 2, (j18 * 4 * j20) + (j19 * j19), j19 * 2 * j20, 2 * j20 * j20}, jArr);
    }

    /* JADX INFO: renamed from: l */
    public static void m15947l(C11241l c11241l, C11234e c11234e, C14432a c14432a) {
        long[] jArr = new long[10];
        C13711h c13711h = (C13711h) c11241l.f34016Y;
        long[] jArr2 = (long[]) c13711h.f43259Z;
        C13711h c13711h2 = (C13711h) c11234e.f34001Z;
        m15949n(jArr2, (long[]) c13711h2.f43260o0, (long[]) c13711h2.f43259Z);
        m15948m((long[]) c13711h.f43260o0, (long[]) c13711h2.f43260o0, (long[]) c13711h2.f43259Z);
        long[] jArr3 = c14432a.f45394a;
        long[] jArr4 = (long[]) c13711h.f43260o0;
        m15942g(jArr4, jArr4, jArr3);
        long[] jArr5 = c14432a.f45395b;
        long[] jArr6 = (long[]) c13711h.f43261p0;
        long[] jArr7 = (long[]) c13711h.f43259Z;
        m15942g(jArr6, jArr7, jArr5);
        long[] jArr8 = c14432a.f45396c;
        long[] jArr9 = (long[]) c11241l.f34017Z;
        m15942g(jArr9, (long[]) c11234e.f34002o0, jArr8);
        c14432a.mo15935a(jArr7, (long[]) c13711h2.f43261p0);
        m15949n(jArr, jArr7, jArr7);
        m15948m(jArr7, jArr6, jArr4);
        m15949n(jArr4, jArr6, jArr4);
        m15948m(jArr6, jArr, jArr9);
        m15949n(jArr9, jArr, jArr9);
    }

    /* JADX INFO: renamed from: m */
    public static void m15948m(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m15949n(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }
}
