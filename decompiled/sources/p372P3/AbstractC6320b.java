package p372P3;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Base64;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.statsig.androidsdk.ErrorBoundaryKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p1016t3.C19753C;
import p1016t3.C19755E;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p165G9.C3018d;
import p167Gb.C3032c;
import p644ab.AbstractC10531d;
import p657b4.C11228a;
import p658b5.C11234e;
import p762g4.C13815a;

/* JADX INFO: renamed from: P3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6320b {

    /* JADX INFO: renamed from: a */
    public static final int[] f20472a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f20473b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f20474c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d */
    public static final int[] f20475d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e */
    public static final int[] f20476e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f */
    public static final int[] f20477f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g */
    public static final int[] f20478g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h */
    public static final int[] f20479h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i */
    public static final int[] f20480i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, RCHTTPStatusCodes.BAD_REQUEST, RCHTTPStatusCodes.BAD_REQUEST, 2048};

    /* JADX INFO: renamed from: j */
    public static final int[] f20481j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k */
    public static final int[] f20482k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l */
    public static final int[] f20483l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m */
    public static final int[] f20484m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: n */
    public static final int[] f20485n = {5, 8, 10, 12};

    /* JADX INFO: renamed from: o */
    public static final int[] f20486o = {6, 9, 12, 15};

    /* JADX INFO: renamed from: p */
    public static final int[] f20487p = {2, 4, 6, 8};

    /* JADX INFO: renamed from: q */
    public static final int[] f20488q = {9, 11, 13, 16};

    /* JADX INFO: renamed from: r */
    public static final int[] f20489r = {5, 8, 10, 12};

    /* JADX INFO: renamed from: s */
    public static final String[] f20490s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: t */
    public static final int[] f20491t = {44100, 48000, 32000};

    /* JADX INFO: renamed from: u */
    public static final int[] f20492u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: v */
    public static final int[] f20493v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: w */
    public static final int[] f20494w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: x */
    public static final int[] f20495x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: y */
    public static final int[] f20496y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: a */
    public static ArrayList m6885a(byte[] bArr) {
        long j10 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5 A[LOOP:0: B:53:0x00b3->B:54:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static boolean m6886b(C20811m c20811m, C6339u c6339u, int i10, C6337s c6337s) {
        int iM21365t;
        byte[] bArr;
        int i11;
        int i12;
        long jM21367v = c20811m.m21367v();
        long j10 = jM21367v >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z6 = (j10 & 1) == 1;
        int i13 = (int) ((jM21367v >> 12) & 15);
        int i14 = (int) ((jM21367v >> 8) & 15);
        int i15 = (int) ((jM21367v >> 4) & 15);
        int i16 = (int) ((jM21367v >> 1) & 7);
        boolean z10 = (jM21367v & 1) == 1;
        if (i15 > 7 ? !(i15 > 10 || c6339u.f20571g != 2) : i15 == c6339u.f20571g - 1) {
            if ((i16 == 0 || i16 == c6339u.f20573i) && !z10) {
                try {
                    long jM21339A = c20811m.m21339A();
                    if (!z6) {
                        jM21339A *= (long) c6339u.f20566b;
                    }
                    c6337s.f20561a = jM21339A;
                    int iM6901q = m6901q(i13, c20811m);
                    if (iM6901q != -1 && iM6901q <= c6339u.f20566b) {
                        if (i14 == 0) {
                            iM21365t = c20811m.m21365t();
                            int i17 = c20811m.f66093b;
                            bArr = c20811m.f66092a;
                            i11 = i17 - 1;
                            int i18 = AbstractC20817s.f66106a;
                            i12 = 0;
                            for (int i19 = c20811m.f66093b; i19 < i11; i19++) {
                                i12 = AbstractC20817s.f66119n[i12 ^ (bArr[i19] & 255)];
                            }
                            if (iM21365t == i12) {
                                return true;
                            }
                        } else if (i14 > 11) {
                            int i20 = c6339u.f20569e;
                            if (i14 == 12) {
                                if (c20811m.m21365t() * 1000 == i20) {
                                    iM21365t = c20811m.m21365t();
                                    int i110 = c20811m.f66093b;
                                    bArr = c20811m.f66092a;
                                    i11 = i110 - 1;
                                    int i111 = AbstractC20817s.f66106a;
                                    i12 = 0;
                                    while (i19 < i11) {
                                        i12 = AbstractC20817s.f66119n[i12 ^ (bArr[i19] & 255)];
                                    }
                                    if (iM21365t == i12) {
                                        return true;
                                    }
                                }
                            } else if (i14 <= 14) {
                                int iM21371z = c20811m.m21371z();
                                if (i14 == 14) {
                                    iM21371z *= 10;
                                }
                                if (iM21371z == i20) {
                                    iM21365t = c20811m.m21365t();
                                    int i112 = c20811m.f66093b;
                                    bArr = c20811m.f66092a;
                                    i11 = i112 - 1;
                                    int i113 = AbstractC20817s.f66106a;
                                    i12 = 0;
                                    while (i19 < i11) {
                                        i12 = AbstractC20817s.f66119n[i12 ^ (bArr[i19] & 255)];
                                    }
                                    if (iM21365t == i12) {
                                        return true;
                                    }
                                }
                            }
                        } else if (i14 == c6339u.f20570f) {
                            iM21365t = c20811m.m21365t();
                            int i114 = c20811m.f66093b;
                            bArr = c20811m.f66092a;
                            i11 = i114 - 1;
                            int i115 = AbstractC20817s.f66106a;
                            i12 = 0;
                            while (i19 < i11) {
                                i12 = AbstractC20817s.f66119n[i12 ^ (bArr[i19] & 255)];
                            }
                            if (iM21365t == i12) {
                                return true;
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m6887c(String str, boolean z6) throws C19755E {
        if (!z6) {
            throw C19755E.m20712a(null, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6888d(long j10, C20811m c20811m, InterfaceC6316H[] interfaceC6316HArr) {
        int i10;
        int iM21365t;
        while (true) {
            if (c20811m.m21346a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (c20811m.m21346a() == 0) {
                    i10 = -1;
                    break;
                }
                int iM21365t2 = c20811m.m21365t();
                i11 += iM21365t2;
                if (iM21365t2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (c20811m.m21346a() == 0) {
                    i12 = -1;
                    break;
                } else {
                    iM21365t = c20811m.m21365t();
                    i12 += iM21365t;
                }
            } while (iM21365t == 255);
            int i13 = c20811m.f66093b + i12;
            if (i12 == -1 || i12 > c20811m.m21346a()) {
                AbstractC20800b.m21332t("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = c20811m.f66094c;
            } else if (i10 == 4 && i12 >= 8) {
                int iM21365t3 = c20811m.m21365t();
                int iM21371z = c20811m.m21371z();
                int iM21352g = iM21371z == 49 ? c20811m.m21352g() : 0;
                int iM21365t4 = c20811m.m21365t();
                if (iM21371z == 47) {
                    c20811m.m21345G(1);
                }
                boolean z6 = iM21365t3 == 181 && (iM21371z == 49 || iM21371z == 47) && iM21365t4 == 3;
                if (iM21371z == 49) {
                    z6 &= iM21352g == 1195456820;
                }
                if (z6) {
                    m6889e(j10, c20811m, interfaceC6316HArr);
                }
            }
            c20811m.m21344F(i13);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m6889e(long j10, C20811m c20811m, InterfaceC6316H[] interfaceC6316HArr) {
        int iM21365t = c20811m.m21365t();
        if ((iM21365t & 64) != 0) {
            c20811m.m21345G(1);
            int i10 = (iM21365t & 31) * 3;
            int i11 = c20811m.f66093b;
            for (InterfaceC6316H interfaceC6316H : interfaceC6316HArr) {
                c20811m.m21344F(i11);
                interfaceC6316H.mo4970c(i10, c20811m);
                AbstractC20800b.m21320h(j10 != -9223372036854775807L);
                interfaceC6316H.mo4968a(j10, 1, i10, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m6890f(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f20475d[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + f20479h[i12]) * 2;
        }
        int i14 = f20478g[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    /* JADX INFO: renamed from: g */
    public static void m6891g(int i10, C20811m c20811m) {
        c20811m.m21341C(7);
        byte[] bArr = c20811m.f66092a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    /* JADX INFO: renamed from: h */
    public static int m6892h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f20491t[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f20492u[i13 - 1] : f20493v[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f20494w[i13 - 1] : f20495x[i13 - 1];
        } else {
            i15 = f20496y[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i15) / i16) + i17;
    }

    /* JADX INFO: renamed from: i */
    public static C6318J m6893i(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new C6318J(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = bArrCopyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        C6318J c6318j = new C6318J(bArrCopyOf.length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            C6318J c6318j2 = new C6318J(bArrCopyOf.length, bArrCopyOf);
            while (c6318j2.m6865b() >= 16) {
                c6318j2.m6883t(2);
                int iM6872i = c6318j2.m6872i(14) & 16383;
                int iMin = Math.min(8 - c6318j.f20466c, 14);
                int i12 = c6318j.f20466c;
                int i13 = (8 - i12) - iMin;
                byte[] bArr2 = c6318j.f20467d;
                int i14 = c6318j.f20465b;
                byte b12 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                bArr2[i14] = b12;
                int i15 = 14 - iMin;
                bArr2[i14] = (byte) (b12 | ((iM6872i >>> i15) << i13));
                int i16 = i14 + 1;
                while (i15 > 8) {
                    c6318j.f20467d[i16] = (byte) (iM6872i >>> (i15 - 8));
                    i15 -= 8;
                    i16++;
                }
                int i17 = 8 - i15;
                byte[] bArr3 = c6318j.f20467d;
                byte b13 = (byte) (bArr3[i16] & ((1 << i17) - 1));
                bArr3[i16] = b13;
                bArr3[i16] = (byte) (((iM6872i & ((1 << i15) - 1)) << i17) | b13);
                c6318j.m6883t(14);
                c6318j.m6864a();
            }
        }
        c6318j.m6878o(bArrCopyOf.length, bArrCopyOf);
        return c6318j;
    }

    /* JADX INFO: renamed from: j */
    public static long m6894j(byte b, byte b10) {
        int i10;
        int i11;
        int i12 = b & 255;
        int i13 = b & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b10 & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = ErrorBoundaryKt.SAMPLING_RATE << (i14 & 1);
        } else {
            i11 = i15 == 3 ? 60000 : ErrorBoundaryKt.SAMPLING_RATE << i15;
        }
        return ((long) i10) * ((long) i11);
    }

    /* JADX INFO: renamed from: k */
    public static int m6895k(C6318J c6318j) throws C19755E {
        int iM6872i = c6318j.m6872i(4);
        if (iM6872i == 15) {
            if (c6318j.m6865b() >= 24) {
                return c6318j.m6872i(24);
            }
            throw C19755E.m20712a(null, "AAC header insufficient data");
        }
        if (iM6872i < 13) {
            return f20472a[iM6872i];
        }
        throw C19755E.m20712a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX INFO: renamed from: l */
    public static int m6896l(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX INFO: renamed from: m */
    public static C3018d m6897m(C6318J c6318j) {
        int i10;
        int i11;
        int iM6872i = c6318j.m6872i(16);
        int iM6872i2 = c6318j.m6872i(16);
        if (iM6872i2 == 65535) {
            iM6872i2 = c6318j.m6872i(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iM6872i2 + i10;
        if (iM6872i == 44097) {
            i12 += 2;
        }
        if (c6318j.m6872i(2) == 3) {
            do {
                c6318j.m6872i(2);
            } while (c6318j.m6871h());
        }
        int iM6872i3 = c6318j.m6872i(10);
        if (c6318j.m6871h() && c6318j.m6872i(3) > 0) {
            c6318j.m6883t(2);
        }
        int i13 = c6318j.m6871h() ? 48000 : 44100;
        int iM6872i4 = c6318j.m6872i(4);
        int[] iArr = f20480i;
        if (i13 == 44100 && iM6872i4 == 13) {
            i11 = iArr[iM6872i4];
        } else if (i13 != 48000 || iM6872i4 >= 14) {
            i11 = 0;
        } else {
            int i14 = iArr[iM6872i4];
            int i15 = iM6872i3 % 5;
            if (i15 == 1) {
                if (iM6872i4 != 3 || iM6872i4 == 8) {
                    i11 = i14 + 1;
                } else {
                    i11 = i14;
                }
            } else if (i15 != 2) {
                if (i15 == 3) {
                    if (iM6872i4 != 3) {
                    }
                    i11 = i14 + 1;
                } else if (i15 == 4 && (iM6872i4 == 3 || iM6872i4 == 8 || iM6872i4 == 11)) {
                    i11 = i14 + 1;
                } else {
                    i11 = i14;
                }
            } else if (iM6872i4 == 8 || iM6872i4 == 11) {
                i11 = i14 + 1;
            } else {
                i11 = i14;
            }
        }
        return new C3018d(i13, i12, i11);
    }

    /* JADX INFO: renamed from: n */
    public static C6319a m6898n(C6318J c6318j, boolean z6) throws C19755E {
        int iM6872i = c6318j.m6872i(5);
        if (iM6872i == 31) {
            iM6872i = c6318j.m6872i(6) + 32;
        }
        int iM6895k = m6895k(c6318j);
        int iM6872i2 = c6318j.m6872i(4);
        String strM11048f = AbstractC10763a.m11048f(iM6872i, "mp4a.40.");
        if (iM6872i == 5 || iM6872i == 29) {
            iM6895k = m6895k(c6318j);
            int iM6872i3 = c6318j.m6872i(5);
            if (iM6872i3 == 31) {
                iM6872i3 = c6318j.m6872i(6) + 32;
            }
            iM6872i = iM6872i3;
            if (iM6872i == 22) {
                iM6872i2 = c6318j.m6872i(4);
            }
        }
        if (z6) {
            if (iM6872i != 1 && iM6872i != 2 && iM6872i != 3 && iM6872i != 4 && iM6872i != 6 && iM6872i != 7 && iM6872i != 17) {
                switch (iM6872i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C19755E.m20713b("Unsupported audio object type: " + iM6872i);
                }
            }
            if (c6318j.m6871h()) {
                AbstractC20800b.m21332t("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c6318j.m6871h()) {
                c6318j.m6883t(14);
            }
            boolean zM6871h = c6318j.m6871h();
            if (iM6872i2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM6872i == 6 || iM6872i == 20) {
                c6318j.m6883t(3);
            }
            if (zM6871h) {
                if (iM6872i == 22) {
                    c6318j.m6883t(16);
                }
                if (iM6872i == 17 || iM6872i == 19 || iM6872i == 20 || iM6872i == 23) {
                    c6318j.m6883t(3);
                }
                c6318j.m6883t(1);
            }
            switch (iM6872i) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM6872i4 = c6318j.m6872i(2);
                    if (iM6872i4 == 2 || iM6872i4 == 3) {
                        throw C19755E.m20713b("Unsupported epConfig: " + iM6872i4);
                    }
                    break;
            }
        }
        int i10 = f20473b[iM6872i2];
        if (i10 != -1) {
            return new C6319a(iM6895k, i10, strM11048f);
        }
        throw C19755E.m20712a(null, null);
    }

    /* JADX INFO: renamed from: o */
    public static int m6899o(C6318J c6318j, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && c6318j.m6871h(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return c6318j.m6872i(iArr[i10]) + i12;
    }

    /* JADX INFO: renamed from: p */
    public static C19753C m6900p(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = AbstractC20817s.f66106a;
            String[] strArrSplit = str.split(Separators.EQUALS, 2);
            if (strArrSplit.length != 2) {
                AbstractC20800b.m21332t("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C11228a.m12483a(new C20811m(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    AbstractC20800b.m21333u("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new C13815a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C19753C(arrayList);
    }

    /* JADX INFO: renamed from: q */
    public static int m6901q(int i10, C20811m c20811m) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c20811m.m21365t() + 1;
            case 7:
                return c20811m.m21371z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: r */
    public static C11234e m6902r(C20811m c20811m) {
        c20811m.m21345G(1);
        int iM21368w = c20811m.m21368w();
        long j10 = ((long) c20811m.f66093b) + ((long) iM21368w);
        int i10 = iM21368w / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jM21359n = c20811m.m21359n();
            if (jM21359n == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jM21359n;
            jArrCopyOf2[i11] = c20811m.m21359n();
            c20811m.m21345G(2);
        }
        c20811m.m21345G((int) (j10 - ((long) c20811m.f66093b)));
        return new C11234e(jArrCopyOf, 12, jArrCopyOf2);
    }

    /* JADX INFO: renamed from: s */
    public static C3032c m6903s(C20811m c20811m, boolean z6, boolean z10) throws C19755E {
        if (z6) {
            m6904t(3, c20811m, false);
        }
        c20811m.m21363r((int) c20811m.m21356k(), AbstractC10531d.f31242c);
        long jM21356k = c20811m.m21356k();
        String[] strArr = new String[(int) jM21356k];
        for (int i10 = 0; i10 < jM21356k; i10++) {
            strArr[i10] = c20811m.m21363r((int) c20811m.m21356k(), AbstractC10531d.f31242c);
        }
        if (z10 && (c20811m.m21365t() & 1) == 0) {
            throw C19755E.m20712a(null, "framing bit expected to be set");
        }
        return new C3032c(strArr, 17);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m6904t(int i10, C20811m c20811m, boolean z6) throws C19755E {
        if (c20811m.m21346a() < 7) {
            if (z6) {
                return false;
            }
            throw C19755E.m20712a(null, "too short header: " + c20811m.m21346a());
        }
        if (c20811m.m21365t() != i10) {
            if (z6) {
                return false;
            }
            throw C19755E.m20712a(null, "expected header type " + Integer.toHexString(i10));
        }
        if (c20811m.m21365t() == 118 && c20811m.m21365t() == 111 && c20811m.m21365t() == 114 && c20811m.m21365t() == 98 && c20811m.m21365t() == 105 && c20811m.m21365t() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw C19755E.m20712a(null, "expected characters 'vorbis'");
    }
}
