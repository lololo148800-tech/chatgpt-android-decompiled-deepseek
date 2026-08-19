package p898n4;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1053v3.C20421b;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p594Y9.C9895g4;
import p885m4.C17156f;

/* JADX INFO: renamed from: n4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17478c extends AbstractC17483h {

    /* JADX INFO: renamed from: i */
    public final int f55871i;

    /* JADX INFO: renamed from: j */
    public final int f55872j;

    /* JADX INFO: renamed from: k */
    public final int f55873k;

    /* JADX INFO: renamed from: o */
    public List f55877o;

    /* JADX INFO: renamed from: p */
    public List f55878p;

    /* JADX INFO: renamed from: q */
    public int f55879q;

    /* JADX INFO: renamed from: r */
    public int f55880r;

    /* JADX INFO: renamed from: s */
    public boolean f55881s;

    /* JADX INFO: renamed from: t */
    public boolean f55882t;

    /* JADX INFO: renamed from: u */
    public byte f55883u;

    /* JADX INFO: renamed from: v */
    public byte f55884v;

    /* JADX INFO: renamed from: x */
    public boolean f55886x;

    /* JADX INFO: renamed from: y */
    public long f55887y;

    /* JADX INFO: renamed from: z */
    public static final int[] f55869z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A */
    public static final int[] f55862A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B */
    public static final int[] f55863B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C */
    public static final int[] f55864C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D */
    public static final int[] f55865D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E */
    public static final int[] f55866E = {193, RCHTTPStatusCodes.CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, RCHTTPStatusCodes.SUCCESS, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F */
    public static final int[] f55867F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G */
    public static final boolean[] f55868G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h */
    public final C20811m f55870h = new C20811m();

    /* JADX INFO: renamed from: m */
    public final ArrayList f55875m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public C17477b f55876n = new C17477b(0, 4);

    /* JADX INFO: renamed from: w */
    public int f55885w = 0;

    /* JADX INFO: renamed from: l */
    public final long f55874l = 16000000;

    public C17478c(String str, int i10) {
        this.f55871i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f55873k = 0;
            this.f55872j = 0;
        } else if (i10 == 2) {
            this.f55873k = 1;
            this.f55872j = 0;
        } else if (i10 == 3) {
            this.f55873k = 0;
            this.f55872j = 1;
        } else if (i10 != 4) {
            AbstractC20800b.m21332t("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f55873k = 0;
            this.f55872j = 0;
        } else {
            this.f55873k = 1;
            this.f55872j = 1;
        }
        m19185l(0);
        m19184k();
        this.f55886x = true;
        this.f55887y = -9223372036854775807L;
    }

    @Override // p898n4.AbstractC17483h
    /* JADX INFO: renamed from: f */
    public final C9895g4 mo19179f() {
        List list = this.f55877o;
        this.f55878p = list;
        list.getClass();
        return new C9895g4(list);
    }

    @Override // p898n4.AbstractC17483h, p031B3.InterfaceC0800d
    public final void flush() {
        super.flush();
        this.f55877o = null;
        this.f55878p = null;
        m19185l(0);
        this.f55880r = 4;
        this.f55876n.f55861h = 4;
        m19184k();
        this.f55881s = false;
        this.f55882t = false;
        this.f55883u = (byte) 0;
        this.f55884v = (byte) 0;
        this.f55885w = 0;
        this.f55886x = true;
        this.f55887y = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0217  */
    /* JADX WARN: Code duplicated, block: B:153:0x021c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0223  */
    /* JADX WARN: Code duplicated, block: B:155:0x022e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0239  */
    /* JADX WARN: Code duplicated, block: B:157:0x0244  */
    /* JADX WARN: Code duplicated, block: B:158:0x0249  */
    /* JADX WARN: Code duplicated, block: B:159:0x024e  */
    /* JADX WARN: Code duplicated, block: B:161:0x025f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // p898n4.AbstractC17483h
    /* JADX INFO: renamed from: g */
    public final void mo19180g(C17482g c17482g) {
        boolean z6;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = c17482g.f2226q0;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C20811m c20811m = this.f55870h;
        c20811m.m21342D(iLimit, bArrArray);
        boolean z10 = false;
        while (true) {
            int iM21346a = c20811m.m21346a();
            int i15 = this.f55871i;
            if (iM21346a < i15) {
                if (z10) {
                    int i16 = this.f55879q;
                    if (i16 == 1 || i16 == 3) {
                        this.f55877o = m19183j();
                        this.f55887y = this.f55937e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM21365t = i15 == 2 ? -4 : c20811m.m21365t();
            int iM21365t2 = c20811m.m21365t();
            int iM21365t3 = c20811m.m21365t();
            if ((iM21365t & 2) == 0 && (iM21365t & 1) == this.f55872j) {
                byte b = (byte) (iM21365t2 & 127);
                byte b10 = (byte) (iM21365t3 & 127);
                if (b != 0 || b10 != 0) {
                    boolean z11 = this.f55881s;
                    if ((iM21365t & 4) == 4) {
                        boolean[] zArr = f55868G;
                        if (zArr[iM21365t2] && zArr[iM21365t3]) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                    this.f55881s = z6;
                    if (!z6 || (b & 240) != 16) {
                        this.f55882t = false;
                        if (!z6) {
                            if (1 > b && b <= 15) {
                                this.f55886x = false;
                            } else if ((b & 246) == 20) {
                                if (b10 == 32 && b10 != 47) {
                                    switch (b10) {
                                        default:
                                            switch (b10) {
                                                case 42:
                                                case 43:
                                                    this.f55886x = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f55886x = true;
                                            break;
                                    }
                                } else {
                                    this.f55886x = true;
                                }
                            }
                            if (this.f55886x) {
                                i10 = b & 224;
                                if (i10 == 0) {
                                    this.f55885w = (b >> 3) & 1;
                                }
                                if (this.f55885w != this.f55873k) {
                                    if (i10 == 0) {
                                        i11 = b & 247;
                                        if (i11 == 17 || (b10 & 240) != 48) {
                                            i12 = b & 246;
                                            if (i12 != 18 && (b10 & 224) == 32) {
                                                this.f55876n.m19175b();
                                                this.f55876n.m19174a((char) ((b & 1) == 0 ? f55866E[b10 & 31] : f55867F[b10 & 31]));
                                            } else if (i11 != 17 && (b10 & 240) == 32) {
                                                this.f55876n.m19174a(' ');
                                                boolean z12 = (b10 & 1) == 1;
                                                C17477b c17477b = this.f55876n;
                                                c17477b.f55854a.add(new C17476a((b10 >> 1) & 7, c17477b.f55856c.length(), z12));
                                            } else if ((b & 240) != 16 && (b10 & 192) == 64) {
                                                int i17 = f55869z[b & 7];
                                                if ((b10 & 32) != 0) {
                                                    i17++;
                                                }
                                                C17477b c17477b2 = this.f55876n;
                                                if (i17 != c17477b2.f55857d) {
                                                    if (this.f55879q != 1 && !c17477b2.m19178e()) {
                                                        C17477b c17477b3 = new C17477b(this.f55879q, this.f55880r);
                                                        this.f55876n = c17477b3;
                                                        this.f55875m.add(c17477b3);
                                                    }
                                                    this.f55876n.f55857d = i17;
                                                }
                                                boolean z13 = (b10 & 16) == 16;
                                                boolean z14 = (b10 & 1) == 1;
                                                int i18 = (b10 >> 1) & 7;
                                                C17477b c17477b4 = this.f55876n;
                                                c17477b4.f55854a.add(new C17476a(z13 ? 8 : i18, c17477b4.f55856c.length(), z14));
                                                if (z13) {
                                                    this.f55876n.f55858e = f55862A[i18];
                                                }
                                            } else if (i11 != 23 && b10 >= 33 && b10 <= 35) {
                                                this.f55876n.f55859f = b10 - 32;
                                            } else if (i12 == 20 && (b10 & 240) == 32) {
                                                if (b10 == 32) {
                                                    m19185l(2);
                                                } else if (b10 != 41) {
                                                    switch (b10) {
                                                        case 37:
                                                            m19185l(1);
                                                            this.f55880r = 2;
                                                            this.f55876n.f55861h = 2;
                                                            break;
                                                        case 38:
                                                            m19185l(1);
                                                            this.f55880r = 3;
                                                            this.f55876n.f55861h = 3;
                                                            break;
                                                        case 39:
                                                            m19185l(1);
                                                            this.f55880r = 4;
                                                            this.f55876n.f55861h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f55879q;
                                                            if (i13 != 0) {
                                                                if (b10 != 33) {
                                                                    switch (b10) {
                                                                        case 44:
                                                                            this.f55877o = Collections.emptyList();
                                                                            i14 = this.f55879q;
                                                                            if (i14 != 1 || i14 == 3) {
                                                                                m19184k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1 && !this.f55876n.m19178e()) {
                                                                                C17477b c17477b5 = this.f55876n;
                                                                                arrayList = c17477b5.f55855b;
                                                                                arrayList.add(c17477b5.m19177d());
                                                                                c17477b5.f55856c.setLength(0);
                                                                                c17477b5.f55854a.clear();
                                                                                iMin = Math.min(c17477b5.f55861h, c17477b5.f55857d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m19184k();
                                                                            break;
                                                                        case 47:
                                                                            this.f55877o = m19183j();
                                                                            m19184k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f55876n.m19175b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m19185l(3);
                                                }
                                            }
                                        } else {
                                            this.f55876n.m19174a((char) f55865D[b10 & 15]);
                                        }
                                    } else {
                                        C17477b c17477b6 = this.f55876n;
                                        iArr = f55864C;
                                        c17477b6.m19174a((char) iArr[(b & 127) - 32]);
                                        if ((b10 & 224) != 0) {
                                            this.f55876n.m19174a((char) iArr[(b10 & 127) - 32]);
                                        }
                                    }
                                    z10 = true;
                                }
                            }
                        } else if (z11) {
                            m19184k();
                            z10 = true;
                        }
                    } else if (this.f55882t && this.f55883u == b && this.f55884v == b10) {
                        this.f55882t = false;
                    } else {
                        this.f55882t = true;
                        this.f55883u = b;
                        this.f55884v = b10;
                        if (!z6) {
                            if (1 > b) {
                                if ((b & 246) == 20) {
                                    if (b10 == 32) {
                                        this.f55886x = true;
                                    } else {
                                        this.f55886x = true;
                                    }
                                }
                            } else if ((b & 246) == 20) {
                                if (b10 == 32) {
                                    this.f55886x = true;
                                } else {
                                    this.f55886x = true;
                                }
                            }
                            if (this.f55886x) {
                                i10 = b & 224;
                                if (i10 == 0) {
                                    this.f55885w = (b >> 3) & 1;
                                }
                                if (this.f55885w != this.f55873k) {
                                    if (i10 == 0) {
                                        i11 = b & 247;
                                        if (i11 == 17) {
                                            i12 = b & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b10 == 32) {
                                                                    m19185l(2);
                                                                } else if (b10 != 41) {
                                                                    switch (b10) {
                                                                        case 37:
                                                                            m19185l(1);
                                                                            this.f55880r = 2;
                                                                            this.f55876n.f55861h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m19185l(1);
                                                                            this.f55880r = 3;
                                                                            this.f55876n.f55861h = 3;
                                                                            break;
                                                                        case 39:
                                                                            m19185l(1);
                                                                            this.f55880r = 4;
                                                                            this.f55876n.f55861h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f55879q;
                                                                            if (i13 != 0) {
                                                                                if (b10 != 33) {
                                                                                    switch (b10) {
                                                                                        case 44:
                                                                                            this.f55877o = Collections.emptyList();
                                                                                            i14 = this.f55879q;
                                                                                            if (i14 != 1) {
                                                                                                m19184k();
                                                                                            } else {
                                                                                                m19184k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                C17477b c17477b7 = this.f55876n;
                                                                                                arrayList = c17477b7.f55855b;
                                                                                                arrayList.add(c17477b7.m19177d());
                                                                                                c17477b7.f55856c.setLength(0);
                                                                                                c17477b7.f55854a.clear();
                                                                                                iMin = Math.min(c17477b7.f55861h, c17477b7.f55857d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m19184k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f55877o = m19183j();
                                                                                            m19184k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f55876n.m19175b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m19185l(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                m19185l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        m19185l(1);
                                                                        this.f55880r = 2;
                                                                        this.f55876n.f55861h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19185l(1);
                                                                        this.f55880r = 3;
                                                                        this.f55876n.f55861h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m19185l(1);
                                                                        this.f55880r = 4;
                                                                        this.f55876n.f55861h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f55879q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f55877o = Collections.emptyList();
                                                                                        i14 = this.f55879q;
                                                                                        if (i14 != 1) {
                                                                                            m19184k();
                                                                                        } else {
                                                                                            m19184k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            C17477b c17477b8 = this.f55876n;
                                                                                            arrayList = c17477b8.f55855b;
                                                                                            arrayList.add(c17477b8.m19177d());
                                                                                            c17477b8.f55856c.setLength(0);
                                                                                            c17477b8.f55854a.clear();
                                                                                            iMin = Math.min(c17477b8.f55861h, c17477b8.f55857d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19184k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f55877o = m19183j();
                                                                                        m19184k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f55876n.m19175b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19185l(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                m19185l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        m19185l(1);
                                                                        this.f55880r = 2;
                                                                        this.f55876n.f55861h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19185l(1);
                                                                        this.f55880r = 3;
                                                                        this.f55876n.f55861h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m19185l(1);
                                                                        this.f55880r = 4;
                                                                        this.f55876n.f55861h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f55879q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f55877o = Collections.emptyList();
                                                                                        i14 = this.f55879q;
                                                                                        if (i14 != 1) {
                                                                                            m19184k();
                                                                                        } else {
                                                                                            m19184k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            C17477b c17477b9 = this.f55876n;
                                                                                            arrayList = c17477b9.f55855b;
                                                                                            arrayList.add(c17477b9.m19177d());
                                                                                            c17477b9.f55856c.setLength(0);
                                                                                            c17477b9.f55854a.clear();
                                                                                            iMin = Math.min(c17477b9.f55861h, c17477b9.f55857d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19184k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f55877o = m19183j();
                                                                                        m19184k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f55876n.m19175b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19185l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b10 = this.f55876n;
                                                                                        arrayList = c17477b10.f55855b;
                                                                                        arrayList.add(c17477b10.m19177d());
                                                                                        c17477b10.f55856c.setLength(0);
                                                                                        c17477b10.f55854a.clear();
                                                                                        iMin = Math.min(c17477b10.f55861h, c17477b10.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                m19185l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        m19185l(1);
                                                                        this.f55880r = 2;
                                                                        this.f55876n.f55861h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19185l(1);
                                                                        this.f55880r = 3;
                                                                        this.f55876n.f55861h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m19185l(1);
                                                                        this.f55880r = 4;
                                                                        this.f55876n.f55861h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f55879q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f55877o = Collections.emptyList();
                                                                                        i14 = this.f55879q;
                                                                                        if (i14 != 1) {
                                                                                            m19184k();
                                                                                        } else {
                                                                                            m19184k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            C17477b c17477b11 = this.f55876n;
                                                                                            arrayList = c17477b11.f55855b;
                                                                                            arrayList.add(c17477b11.m19177d());
                                                                                            c17477b11.f55856c.setLength(0);
                                                                                            c17477b11.f55854a.clear();
                                                                                            iMin = Math.min(c17477b11.f55861h, c17477b11.f55857d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19184k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f55877o = m19183j();
                                                                                        m19184k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f55876n.m19175b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19185l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b12 = this.f55876n;
                                                                                        arrayList = c17477b12.f55855b;
                                                                                        arrayList.add(c17477b12.m19177d());
                                                                                        c17477b12.f55856c.setLength(0);
                                                                                        c17477b12.f55854a.clear();
                                                                                        iMin = Math.min(c17477b12.f55861h, c17477b12.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b13 = this.f55876n;
                                                                                        arrayList = c17477b13.f55855b;
                                                                                        arrayList.add(c17477b13.m19177d());
                                                                                        c17477b13.f55856c.setLength(0);
                                                                                        c17477b13.f55854a.clear();
                                                                                        iMin = Math.min(c17477b13.f55861h, c17477b13.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        m19185l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                m19185l(1);
                                                                this.f55880r = 2;
                                                                this.f55876n.f55861h = 2;
                                                                break;
                                                            case 38:
                                                                m19185l(1);
                                                                this.f55880r = 3;
                                                                this.f55876n.f55861h = 3;
                                                                break;
                                                            case 39:
                                                                m19185l(1);
                                                                this.f55880r = 4;
                                                                this.f55876n.f55861h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f55879q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f55877o = Collections.emptyList();
                                                                                i14 = this.f55879q;
                                                                                if (i14 != 1) {
                                                                                    m19184k();
                                                                                } else {
                                                                                    m19184k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    C17477b c17477b14 = this.f55876n;
                                                                                    arrayList = c17477b14.f55855b;
                                                                                    arrayList.add(c17477b14.m19177d());
                                                                                    c17477b14.f55856c.setLength(0);
                                                                                    c17477b14.f55854a.clear();
                                                                                    iMin = Math.min(c17477b14.f55861h, c17477b14.f55857d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19184k();
                                                                                break;
                                                                            case 47:
                                                                                this.f55877o = m19183j();
                                                                                m19184k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f55876n.m19175b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19185l(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                m19185l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        m19185l(1);
                                                                        this.f55880r = 2;
                                                                        this.f55876n.f55861h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19185l(1);
                                                                        this.f55880r = 3;
                                                                        this.f55876n.f55861h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m19185l(1);
                                                                        this.f55880r = 4;
                                                                        this.f55876n.f55861h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f55879q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f55877o = Collections.emptyList();
                                                                                        i14 = this.f55879q;
                                                                                        if (i14 != 1) {
                                                                                            m19184k();
                                                                                        } else {
                                                                                            m19184k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            C17477b c17477b15 = this.f55876n;
                                                                                            arrayList = c17477b15.f55855b;
                                                                                            arrayList.add(c17477b15.m19177d());
                                                                                            c17477b15.f55856c.setLength(0);
                                                                                            c17477b15.f55854a.clear();
                                                                                            iMin = Math.min(c17477b15.f55861h, c17477b15.f55857d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19184k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f55877o = m19183j();
                                                                                        m19184k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f55876n.m19175b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19185l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b16 = this.f55876n;
                                                                                        arrayList = c17477b16.f55855b;
                                                                                        arrayList.add(c17477b16.m19177d());
                                                                                        c17477b16.f55856c.setLength(0);
                                                                                        c17477b16.f55854a.clear();
                                                                                        iMin = Math.min(c17477b16.f55861h, c17477b16.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b17 = this.f55876n;
                                                                                        arrayList = c17477b17.f55855b;
                                                                                        arrayList.add(c17477b17.m19177d());
                                                                                        c17477b17.f55856c.setLength(0);
                                                                                        c17477b17.f55854a.clear();
                                                                                        iMin = Math.min(c17477b17.f55861h, c17477b17.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        m19185l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                m19185l(1);
                                                                this.f55880r = 2;
                                                                this.f55876n.f55861h = 2;
                                                                break;
                                                            case 38:
                                                                m19185l(1);
                                                                this.f55880r = 3;
                                                                this.f55876n.f55861h = 3;
                                                                break;
                                                            case 39:
                                                                m19185l(1);
                                                                this.f55880r = 4;
                                                                this.f55876n.f55861h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f55879q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f55877o = Collections.emptyList();
                                                                                i14 = this.f55879q;
                                                                                if (i14 != 1) {
                                                                                    m19184k();
                                                                                } else {
                                                                                    m19184k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    C17477b c17477b18 = this.f55876n;
                                                                                    arrayList = c17477b18.f55855b;
                                                                                    arrayList.add(c17477b18.m19177d());
                                                                                    c17477b18.f55856c.setLength(0);
                                                                                    c17477b18.f55854a.clear();
                                                                                    iMin = Math.min(c17477b18.f55861h, c17477b18.f55857d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19184k();
                                                                                break;
                                                                            case 47:
                                                                                this.f55877o = m19183j();
                                                                                m19184k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f55876n.m19175b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19185l(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b19 = this.f55876n;
                                                                                        arrayList = c17477b19.f55855b;
                                                                                        arrayList.add(c17477b19.m19177d());
                                                                                        c17477b19.f55856c.setLength(0);
                                                                                        c17477b19.f55854a.clear();
                                                                                        iMin = Math.min(c17477b19.f55861h, c17477b19.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        m19185l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                m19185l(1);
                                                                this.f55880r = 2;
                                                                this.f55876n.f55861h = 2;
                                                                break;
                                                            case 38:
                                                                m19185l(1);
                                                                this.f55880r = 3;
                                                                this.f55876n.f55861h = 3;
                                                                break;
                                                            case 39:
                                                                m19185l(1);
                                                                this.f55880r = 4;
                                                                this.f55876n.f55861h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f55879q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f55877o = Collections.emptyList();
                                                                                i14 = this.f55879q;
                                                                                if (i14 != 1) {
                                                                                    m19184k();
                                                                                } else {
                                                                                    m19184k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    C17477b c17477b110 = this.f55876n;
                                                                                    arrayList = c17477b110.f55855b;
                                                                                    arrayList.add(c17477b110.m19177d());
                                                                                    c17477b110.f55856c.setLength(0);
                                                                                    c17477b110.f55854a.clear();
                                                                                    iMin = Math.min(c17477b110.f55861h, c17477b110.f55857d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19184k();
                                                                                break;
                                                                            case 47:
                                                                                this.f55877o = m19183j();
                                                                                m19184k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f55876n.m19175b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19185l(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        m19185l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                m19185l(1);
                                                                this.f55880r = 2;
                                                                this.f55876n.f55861h = 2;
                                                                break;
                                                            case 38:
                                                                m19185l(1);
                                                                this.f55880r = 3;
                                                                this.f55876n.f55861h = 3;
                                                                break;
                                                            case 39:
                                                                m19185l(1);
                                                                this.f55880r = 4;
                                                                this.f55876n.f55861h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f55879q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f55877o = Collections.emptyList();
                                                                                i14 = this.f55879q;
                                                                                if (i14 != 1) {
                                                                                    m19184k();
                                                                                } else {
                                                                                    m19184k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    C17477b c17477b111 = this.f55876n;
                                                                                    arrayList = c17477b111.f55855b;
                                                                                    arrayList.add(c17477b111.m19177d());
                                                                                    c17477b111.f55856c.setLength(0);
                                                                                    c17477b111.f55854a.clear();
                                                                                    iMin = Math.min(c17477b111.f55861h, c17477b111.f55857d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19184k();
                                                                                break;
                                                                            case 47:
                                                                                this.f55877o = m19183j();
                                                                                m19184k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f55876n.m19175b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19185l(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b10 == 32) {
                                                    m19185l(2);
                                                } else if (b10 != 41) {
                                                    switch (b10) {
                                                        case 37:
                                                            m19185l(1);
                                                            this.f55880r = 2;
                                                            this.f55876n.f55861h = 2;
                                                            break;
                                                        case 38:
                                                            m19185l(1);
                                                            this.f55880r = 3;
                                                            this.f55876n.f55861h = 3;
                                                            break;
                                                        case 39:
                                                            m19185l(1);
                                                            this.f55880r = 4;
                                                            this.f55876n.f55861h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f55879q;
                                                            if (i13 != 0) {
                                                                if (b10 != 33) {
                                                                    switch (b10) {
                                                                        case 44:
                                                                            this.f55877o = Collections.emptyList();
                                                                            i14 = this.f55879q;
                                                                            if (i14 != 1) {
                                                                                m19184k();
                                                                            } else {
                                                                                m19184k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                C17477b c17477b112 = this.f55876n;
                                                                                arrayList = c17477b112.f55855b;
                                                                                arrayList.add(c17477b112.m19177d());
                                                                                c17477b112.f55856c.setLength(0);
                                                                                c17477b112.f55854a.clear();
                                                                                iMin = Math.min(c17477b112.f55861h, c17477b112.f55857d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m19184k();
                                                                            break;
                                                                        case 47:
                                                                            this.f55877o = m19183j();
                                                                            m19184k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f55876n.m19175b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m19185l(3);
                                                }
                                            }
                                        } else {
                                            i12 = b & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b10 == 32) {
                                                                    m19185l(2);
                                                                } else if (b10 != 41) {
                                                                    switch (b10) {
                                                                        case 37:
                                                                            m19185l(1);
                                                                            this.f55880r = 2;
                                                                            this.f55876n.f55861h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m19185l(1);
                                                                            this.f55880r = 3;
                                                                            this.f55876n.f55861h = 3;
                                                                            break;
                                                                        case 39:
                                                                            m19185l(1);
                                                                            this.f55880r = 4;
                                                                            this.f55876n.f55861h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f55879q;
                                                                            if (i13 != 0) {
                                                                                if (b10 != 33) {
                                                                                    switch (b10) {
                                                                                        case 44:
                                                                                            this.f55877o = Collections.emptyList();
                                                                                            i14 = this.f55879q;
                                                                                            if (i14 != 1) {
                                                                                                m19184k();
                                                                                            } else {
                                                                                                m19184k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                C17477b c17477b113 = this.f55876n;
                                                                                                arrayList = c17477b113.f55855b;
                                                                                                arrayList.add(c17477b113.m19177d());
                                                                                                c17477b113.f55856c.setLength(0);
                                                                                                c17477b113.f55854a.clear();
                                                                                                iMin = Math.min(c17477b113.f55861h, c17477b113.f55857d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m19184k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f55877o = m19183j();
                                                                                            m19184k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f55876n.m19175b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m19185l(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                m19185l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        m19185l(1);
                                                                        this.f55880r = 2;
                                                                        this.f55876n.f55861h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19185l(1);
                                                                        this.f55880r = 3;
                                                                        this.f55876n.f55861h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m19185l(1);
                                                                        this.f55880r = 4;
                                                                        this.f55876n.f55861h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f55879q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f55877o = Collections.emptyList();
                                                                                        i14 = this.f55879q;
                                                                                        if (i14 != 1) {
                                                                                            m19184k();
                                                                                        } else {
                                                                                            m19184k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            C17477b c17477b114 = this.f55876n;
                                                                                            arrayList = c17477b114.f55855b;
                                                                                            arrayList.add(c17477b114.m19177d());
                                                                                            c17477b114.f55856c.setLength(0);
                                                                                            c17477b114.f55854a.clear();
                                                                                            iMin = Math.min(c17477b114.f55861h, c17477b114.f55857d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19184k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f55877o = m19183j();
                                                                                        m19184k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f55876n.m19175b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19185l(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                m19185l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        m19185l(1);
                                                                        this.f55880r = 2;
                                                                        this.f55876n.f55861h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19185l(1);
                                                                        this.f55880r = 3;
                                                                        this.f55876n.f55861h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m19185l(1);
                                                                        this.f55880r = 4;
                                                                        this.f55876n.f55861h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f55879q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f55877o = Collections.emptyList();
                                                                                        i14 = this.f55879q;
                                                                                        if (i14 != 1) {
                                                                                            m19184k();
                                                                                        } else {
                                                                                            m19184k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            C17477b c17477b115 = this.f55876n;
                                                                                            arrayList = c17477b115.f55855b;
                                                                                            arrayList.add(c17477b115.m19177d());
                                                                                            c17477b115.f55856c.setLength(0);
                                                                                            c17477b115.f55854a.clear();
                                                                                            iMin = Math.min(c17477b115.f55861h, c17477b115.f55857d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19184k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f55877o = m19183j();
                                                                                        m19184k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f55876n.m19175b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19185l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b116 = this.f55876n;
                                                                                        arrayList = c17477b116.f55855b;
                                                                                        arrayList.add(c17477b116.m19177d());
                                                                                        c17477b116.f55856c.setLength(0);
                                                                                        c17477b116.f55854a.clear();
                                                                                        iMin = Math.min(c17477b116.f55861h, c17477b116.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                m19185l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        m19185l(1);
                                                                        this.f55880r = 2;
                                                                        this.f55876n.f55861h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19185l(1);
                                                                        this.f55880r = 3;
                                                                        this.f55876n.f55861h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m19185l(1);
                                                                        this.f55880r = 4;
                                                                        this.f55876n.f55861h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f55879q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f55877o = Collections.emptyList();
                                                                                        i14 = this.f55879q;
                                                                                        if (i14 != 1) {
                                                                                            m19184k();
                                                                                        } else {
                                                                                            m19184k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            C17477b c17477b117 = this.f55876n;
                                                                                            arrayList = c17477b117.f55855b;
                                                                                            arrayList.add(c17477b117.m19177d());
                                                                                            c17477b117.f55856c.setLength(0);
                                                                                            c17477b117.f55854a.clear();
                                                                                            iMin = Math.min(c17477b117.f55861h, c17477b117.f55857d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19184k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f55877o = m19183j();
                                                                                        m19184k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f55876n.m19175b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19185l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b118 = this.f55876n;
                                                                                        arrayList = c17477b118.f55855b;
                                                                                        arrayList.add(c17477b118.m19177d());
                                                                                        c17477b118.f55856c.setLength(0);
                                                                                        c17477b118.f55854a.clear();
                                                                                        iMin = Math.min(c17477b118.f55861h, c17477b118.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b119 = this.f55876n;
                                                                                        arrayList = c17477b119.f55855b;
                                                                                        arrayList.add(c17477b119.m19177d());
                                                                                        c17477b119.f55856c.setLength(0);
                                                                                        c17477b119.f55854a.clear();
                                                                                        iMin = Math.min(c17477b119.f55861h, c17477b119.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        m19185l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                m19185l(1);
                                                                this.f55880r = 2;
                                                                this.f55876n.f55861h = 2;
                                                                break;
                                                            case 38:
                                                                m19185l(1);
                                                                this.f55880r = 3;
                                                                this.f55876n.f55861h = 3;
                                                                break;
                                                            case 39:
                                                                m19185l(1);
                                                                this.f55880r = 4;
                                                                this.f55876n.f55861h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f55879q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f55877o = Collections.emptyList();
                                                                                i14 = this.f55879q;
                                                                                if (i14 != 1) {
                                                                                    m19184k();
                                                                                } else {
                                                                                    m19184k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    C17477b c17477b1110 = this.f55876n;
                                                                                    arrayList = c17477b1110.f55855b;
                                                                                    arrayList.add(c17477b1110.m19177d());
                                                                                    c17477b1110.f55856c.setLength(0);
                                                                                    c17477b1110.f55854a.clear();
                                                                                    iMin = Math.min(c17477b1110.f55861h, c17477b1110.f55857d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19184k();
                                                                                break;
                                                                            case 47:
                                                                                this.f55877o = m19183j();
                                                                                m19184k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f55876n.m19175b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19185l(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                m19185l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        m19185l(1);
                                                                        this.f55880r = 2;
                                                                        this.f55876n.f55861h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m19185l(1);
                                                                        this.f55880r = 3;
                                                                        this.f55876n.f55861h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m19185l(1);
                                                                        this.f55880r = 4;
                                                                        this.f55876n.f55861h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f55879q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f55877o = Collections.emptyList();
                                                                                        i14 = this.f55879q;
                                                                                        if (i14 != 1) {
                                                                                            m19184k();
                                                                                        } else {
                                                                                            m19184k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            C17477b c17477b1111 = this.f55876n;
                                                                                            arrayList = c17477b1111.f55855b;
                                                                                            arrayList.add(c17477b1111.m19177d());
                                                                                            c17477b1111.f55856c.setLength(0);
                                                                                            c17477b1111.f55854a.clear();
                                                                                            iMin = Math.min(c17477b1111.f55861h, c17477b1111.f55857d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m19184k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f55877o = m19183j();
                                                                                        m19184k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f55876n.m19175b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m19185l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b1112 = this.f55876n;
                                                                                        arrayList = c17477b1112.f55855b;
                                                                                        arrayList.add(c17477b1112.m19177d());
                                                                                        c17477b1112.f55856c.setLength(0);
                                                                                        c17477b1112.f55854a.clear();
                                                                                        iMin = Math.min(c17477b1112.f55861h, c17477b1112.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b1113 = this.f55876n;
                                                                                        arrayList = c17477b1113.f55855b;
                                                                                        arrayList.add(c17477b1113.m19177d());
                                                                                        c17477b1113.f55856c.setLength(0);
                                                                                        c17477b1113.f55854a.clear();
                                                                                        iMin = Math.min(c17477b1113.f55861h, c17477b1113.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        m19185l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                m19185l(1);
                                                                this.f55880r = 2;
                                                                this.f55876n.f55861h = 2;
                                                                break;
                                                            case 38:
                                                                m19185l(1);
                                                                this.f55880r = 3;
                                                                this.f55876n.f55861h = 3;
                                                                break;
                                                            case 39:
                                                                m19185l(1);
                                                                this.f55880r = 4;
                                                                this.f55876n.f55861h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f55879q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f55877o = Collections.emptyList();
                                                                                i14 = this.f55879q;
                                                                                if (i14 != 1) {
                                                                                    m19184k();
                                                                                } else {
                                                                                    m19184k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    C17477b c17477b1114 = this.f55876n;
                                                                                    arrayList = c17477b1114.f55855b;
                                                                                    arrayList.add(c17477b1114.m19177d());
                                                                                    c17477b1114.f55856c.setLength(0);
                                                                                    c17477b1114.f55854a.clear();
                                                                                    iMin = Math.min(c17477b1114.f55861h, c17477b1114.f55857d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19184k();
                                                                                break;
                                                                            case 47:
                                                                                this.f55877o = m19183j();
                                                                                m19184k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f55876n.m19175b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19185l(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            m19185l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    m19185l(1);
                                                                    this.f55880r = 2;
                                                                    this.f55876n.f55861h = 2;
                                                                    break;
                                                                case 38:
                                                                    m19185l(1);
                                                                    this.f55880r = 3;
                                                                    this.f55876n.f55861h = 3;
                                                                    break;
                                                                case 39:
                                                                    m19185l(1);
                                                                    this.f55880r = 4;
                                                                    this.f55876n.f55861h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f55879q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f55877o = Collections.emptyList();
                                                                                    i14 = this.f55879q;
                                                                                    if (i14 != 1) {
                                                                                        m19184k();
                                                                                    } else {
                                                                                        m19184k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        C17477b c17477b1115 = this.f55876n;
                                                                                        arrayList = c17477b1115.f55855b;
                                                                                        arrayList.add(c17477b1115.m19177d());
                                                                                        c17477b1115.f55856c.setLength(0);
                                                                                        c17477b1115.f55854a.clear();
                                                                                        iMin = Math.min(c17477b1115.f55861h, c17477b1115.f55857d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m19184k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f55877o = m19183j();
                                                                                    m19184k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f55876n.m19175b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m19185l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        m19185l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                m19185l(1);
                                                                this.f55880r = 2;
                                                                this.f55876n.f55861h = 2;
                                                                break;
                                                            case 38:
                                                                m19185l(1);
                                                                this.f55880r = 3;
                                                                this.f55876n.f55861h = 3;
                                                                break;
                                                            case 39:
                                                                m19185l(1);
                                                                this.f55880r = 4;
                                                                this.f55876n.f55861h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f55879q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f55877o = Collections.emptyList();
                                                                                i14 = this.f55879q;
                                                                                if (i14 != 1) {
                                                                                    m19184k();
                                                                                } else {
                                                                                    m19184k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    C17477b c17477b1116 = this.f55876n;
                                                                                    arrayList = c17477b1116.f55855b;
                                                                                    arrayList.add(c17477b1116.m19177d());
                                                                                    c17477b1116.f55856c.setLength(0);
                                                                                    c17477b1116.f55854a.clear();
                                                                                    iMin = Math.min(c17477b1116.f55861h, c17477b1116.f55857d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19184k();
                                                                                break;
                                                                            case 47:
                                                                                this.f55877o = m19183j();
                                                                                m19184k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f55876n.m19175b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19185l(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        m19185l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                m19185l(1);
                                                                this.f55880r = 2;
                                                                this.f55876n.f55861h = 2;
                                                                break;
                                                            case 38:
                                                                m19185l(1);
                                                                this.f55880r = 3;
                                                                this.f55876n.f55861h = 3;
                                                                break;
                                                            case 39:
                                                                m19185l(1);
                                                                this.f55880r = 4;
                                                                this.f55876n.f55861h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f55879q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f55877o = Collections.emptyList();
                                                                                i14 = this.f55879q;
                                                                                if (i14 != 1) {
                                                                                    m19184k();
                                                                                } else {
                                                                                    m19184k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    C17477b c17477b1117 = this.f55876n;
                                                                                    arrayList = c17477b1117.f55855b;
                                                                                    arrayList.add(c17477b1117.m19177d());
                                                                                    c17477b1117.f55856c.setLength(0);
                                                                                    c17477b1117.f55854a.clear();
                                                                                    iMin = Math.min(c17477b1117.f55861h, c17477b1117.f55857d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m19184k();
                                                                                break;
                                                                            case 47:
                                                                                this.f55877o = m19183j();
                                                                                m19184k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f55876n.m19175b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m19185l(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b10 == 32) {
                                                    m19185l(2);
                                                } else if (b10 != 41) {
                                                    switch (b10) {
                                                        case 37:
                                                            m19185l(1);
                                                            this.f55880r = 2;
                                                            this.f55876n.f55861h = 2;
                                                            break;
                                                        case 38:
                                                            m19185l(1);
                                                            this.f55880r = 3;
                                                            this.f55876n.f55861h = 3;
                                                            break;
                                                        case 39:
                                                            m19185l(1);
                                                            this.f55880r = 4;
                                                            this.f55876n.f55861h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f55879q;
                                                            if (i13 != 0) {
                                                                if (b10 != 33) {
                                                                    switch (b10) {
                                                                        case 44:
                                                                            this.f55877o = Collections.emptyList();
                                                                            i14 = this.f55879q;
                                                                            if (i14 != 1) {
                                                                                m19184k();
                                                                            } else {
                                                                                m19184k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                C17477b c17477b1118 = this.f55876n;
                                                                                arrayList = c17477b1118.f55855b;
                                                                                arrayList.add(c17477b1118.m19177d());
                                                                                c17477b1118.f55856c.setLength(0);
                                                                                c17477b1118.f55854a.clear();
                                                                                iMin = Math.min(c17477b1118.f55861h, c17477b1118.f55857d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m19184k();
                                                                            break;
                                                                        case 47:
                                                                            this.f55877o = m19183j();
                                                                            m19184k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f55876n.m19175b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m19185l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        C17477b c17477b20 = this.f55876n;
                                        iArr = f55864C;
                                        c17477b20.m19174a((char) iArr[(b & 127) - 32]);
                                        if ((b10 & 224) != 0) {
                                            this.f55876n.m19174a((char) iArr[(b10 & 127) - 32]);
                                        }
                                    }
                                    z10 = true;
                                }
                            }
                        } else if (z11) {
                            m19184k();
                            z10 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p898n4.AbstractC17483h, p031B3.InterfaceC0800d
    /* JADX INFO: renamed from: h */
    public final C17156f mo1832d() {
        C17156f c17156f;
        C17156f c17156fMo1832d = super.mo1832d();
        if (c17156fMo1832d != null) {
            return c17156fMo1832d;
        }
        long j10 = this.f55874l;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.f55887y;
        if (j11 == -9223372036854775807L || this.f55937e - j11 < j10 || (c17156f = (C17156f) this.f55934b.pollFirst()) == null) {
            return null;
        }
        this.f55877o = Collections.emptyList();
        this.f55887y = -9223372036854775807L;
        C9895g4 c9895g4Mo19179f = mo19179f();
        long j12 = this.f55937e;
        c17156f.f2231o0 = j12;
        c17156f.f54827q0 = c9895g4Mo19179f;
        c17156f.f54828r0 = j12;
        return c17156f;
    }

    @Override // p898n4.AbstractC17483h
    /* JADX INFO: renamed from: i */
    public final boolean mo19182i() {
        return this.f55877o != this.f55878p;
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m19183j() {
        ArrayList arrayList = this.f55875m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            C20421b c20421bM19176c = ((C17477b) arrayList.get(i10)).m19176c(Integer.MIN_VALUE);
            arrayList2.add(c20421bM19176c);
            if (c20421bM19176c != null) {
                iMin = Math.min(iMin, c20421bM19176c.f64585i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            C20421b c20421bM19176c2 = (C20421b) arrayList2.get(i11);
            if (c20421bM19176c2 != null) {
                if (c20421bM19176c2.f64585i != iMin) {
                    c20421bM19176c2 = ((C17477b) arrayList.get(i11)).m19176c(iMin);
                    c20421bM19176c2.getClass();
                }
                arrayList3.add(c20421bM19176c2);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m19184k() {
        C17477b c17477b = this.f55876n;
        c17477b.f55860g = this.f55879q;
        c17477b.f55854a.clear();
        c17477b.f55855b.clear();
        c17477b.f55856c.setLength(0);
        c17477b.f55857d = 15;
        c17477b.f55858e = 0;
        c17477b.f55859f = 0;
        ArrayList arrayList = this.f55875m;
        arrayList.clear();
        arrayList.add(this.f55876n);
    }

    /* JADX INFO: renamed from: l */
    public final void m19185l(int i10) {
        int i11 = this.f55879q;
        if (i11 == i10) {
            return;
        }
        this.f55879q = i10;
        if (i10 != 3) {
            m19184k();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f55877o = Collections.emptyList();
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f55875m;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((C17477b) arrayList.get(i12)).f55860g = i10;
            i12++;
        }
    }

    @Override // p898n4.AbstractC17483h, p031B3.InterfaceC0800d
    public final void release() {
    }
}
