package p696d4;

import bb.AbstractC11278C;
import bb.C11294T;
import bb.C11333z;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p1016t3.AbstractC19754D;
import p1016t3.C19753C;
import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p372P3.C6318J;
import p479Td.AbstractC7360k;
import p509Uk.lpqL.SfpOlmlMATQ;
import p561X.C8990d;
import p589Y3.C9643a;
import p594Y9.AbstractC9997x4;
import p644ab.AbstractC10531d;

/* JADX INFO: renamed from: d4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13010h extends AbstractC9997x4 {

    /* JADX INFO: renamed from: b */
    public static final C8990d f41284b = new C8990d(5);

    /* JADX INFO: renamed from: a */
    public final C8990d f41285a;

    public C13010h(C8990d c8990d) {
        this.f41285a = c8990d;
    }

    /* JADX INFO: renamed from: f */
    public static C13003a m14737f(C20811m c20811m, int i10, int i11) {
        int iM14755x;
        String strConcat;
        int iM21365t = c20811m.m21365t();
        Charset charsetM14752u = m14752u(iM21365t);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        c20811m.m21350e(bArr, 0, i12);
        if (i11 == 2) {
            strConcat = "image/" + AbstractC7360k.m7787d(new String(bArr, 0, 3, AbstractC10531d.f31241b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM14755x = 2;
        } else {
            iM14755x = m14755x(0, bArr);
            String strM7787d = AbstractC7360k.m7787d(new String(bArr, 0, iM14755x, AbstractC10531d.f31241b));
            strConcat = strM7787d.indexOf(47) == -1 ? "image/".concat(strM7787d) : strM7787d;
        }
        int i13 = bArr[iM14755x + 1] & 255;
        int i14 = iM14755x + 2;
        int iM14754w = m14754w(bArr, i14, iM21365t);
        String str = new String(bArr, i14, iM14754w - i14, charsetM14752u);
        int iM14751t = m14751t(iM21365t) + iM14754w;
        return new C13003a(strConcat, str, i13, i12 <= iM14751t ? AbstractC20817s.f66111f : Arrays.copyOfRange(bArr, iM14751t, i12));
    }

    /* JADX INFO: renamed from: g */
    public static C13005c m14738g(C20811m c20811m, int i10, int i11, boolean z6, int i12, C8990d c8990d) {
        int i13 = c20811m.f66093b;
        int iM14755x = m14755x(i13, c20811m.f66092a);
        String str = new String(c20811m.f66092a, i13, iM14755x - i13, AbstractC10531d.f31241b);
        c20811m.m21344F(iM14755x + 1);
        int iM21352g = c20811m.m21352g();
        int iM21352g2 = c20811m.m21352g();
        long jM21367v = c20811m.m21367v();
        long j10 = jM21367v == 4294967295L ? -1L : jM21367v;
        long jM21367v2 = c20811m.m21367v();
        long j11 = jM21367v2 == 4294967295L ? -1L : jM21367v2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (c20811m.f66093b < i14) {
            AbstractC13011i abstractC13011iM14741j = m14741j(i11, c20811m, z6, i12, c8990d);
            if (abstractC13011iM14741j != null) {
                arrayList.add(abstractC13011iM14741j);
            }
        }
        return new C13005c(str, iM21352g, iM21352g2, j10, j11, (AbstractC13011i[]) arrayList.toArray(new AbstractC13011i[0]));
    }

    /* JADX INFO: renamed from: h */
    public static C13006d m14739h(C20811m c20811m, int i10, int i11, boolean z6, int i12, C8990d c8990d) {
        int i13 = c20811m.f66093b;
        int iM14755x = m14755x(i13, c20811m.f66092a);
        String str = new String(c20811m.f66092a, i13, iM14755x - i13, AbstractC10531d.f31241b);
        c20811m.m21344F(iM14755x + 1);
        int iM21365t = c20811m.m21365t();
        boolean z10 = (iM21365t & 2) != 0;
        boolean z11 = (iM21365t & 1) != 0;
        int iM21365t2 = c20811m.m21365t();
        String[] strArr = new String[iM21365t2];
        for (int i14 = 0; i14 < iM21365t2; i14++) {
            int i15 = c20811m.f66093b;
            int iM14755x2 = m14755x(i15, c20811m.f66092a);
            strArr[i14] = new String(c20811m.f66092a, i15, iM14755x2 - i15, AbstractC10531d.f31241b);
            c20811m.m21344F(iM14755x2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (c20811m.f66093b < i16) {
            AbstractC13011i abstractC13011iM14741j = m14741j(i11, c20811m, z6, i12, c8990d);
            if (abstractC13011iM14741j != null) {
                arrayList.add(abstractC13011iM14741j);
            }
        }
        return new C13006d(str, z10, z11, strArr, (AbstractC13011i[]) arrayList.toArray(new AbstractC13011i[0]));
    }

    /* JADX INFO: renamed from: i */
    public static C13007e m14740i(int i10, C20811m c20811m) {
        if (i10 < 4) {
            return null;
        }
        int iM21365t = c20811m.m21365t();
        Charset charsetM14752u = m14752u(iM21365t);
        byte[] bArr = new byte[3];
        c20811m.m21350e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        c20811m.m21350e(bArr2, 0, i11);
        int iM14754w = m14754w(bArr2, 0, iM21365t);
        String str2 = new String(bArr2, 0, iM14754w, charsetM14752u);
        int iM14751t = m14751t(iM21365t) + iM14754w;
        return new C13007e(str, str2, m14745n(bArr2, iM14751t, m14754w(bArr2, iM14751t, iM21365t), charsetM14752u));
    }

    /* JADX WARN: Code duplicated, block: B:153:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:172:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:178:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:180:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:186:0x01fe A[Catch: all -> 0x012a, Exception -> 0x01cd, OutOfMemoryError -> 0x01cf, TRY_LEAVE, TryCatch #2 {all -> 0x012a, blocks: (B:106:0x0123, B:115:0x0135, B:122:0x014a, B:124:0x0151, B:132:0x016a, B:141:0x0181, B:152:0x019b, B:159:0x01ac, B:167:0x01c8, B:177:0x01db, B:185:0x01f9, B:186:0x01fe), top: B:197:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x021e  */
    /* JADX WARN: Instruction removed from duplicated block: B:193:0x021e, please report this as an issue */
    /* JADX INFO: renamed from: j */
    public static AbstractC13011i m14741j(int i10, C20811m c20811m, boolean z6, int i11, C8990d c8990d) {
        int iM21369x;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        Throwable th2;
        AbstractC13011i c13004b;
        boolean z15;
        int iM21365t = c20811m.m21365t();
        int iM21365t2 = c20811m.m21365t();
        int iM21365t3 = c20811m.m21365t();
        int iM21365t4 = i10 >= 3 ? c20811m.m21365t() : 0;
        if (i10 == 4) {
            iM21369x = c20811m.m21369x();
            if (!z6) {
                iM21369x = (((iM21369x >> 24) & 255) << 21) | (iM21369x & 255) | (((iM21369x >> 8) & 255) << 7) | (((iM21369x >> 16) & 255) << 14);
            }
        } else {
            iM21369x = i10 == 3 ? c20811m.m21369x() : c20811m.m21368w();
        }
        int iM21371z = i10 >= 3 ? c20811m.m21371z() : 0;
        if (iM21365t == 0 && iM21365t2 == 0 && iM21365t3 == 0 && iM21365t4 == 0 && iM21369x == 0 && iM21371z == 0) {
            c20811m.m21344F(c20811m.f66094c);
            return null;
        }
        int i13 = c20811m.f66093b + iM21369x;
        if (i13 > c20811m.f66094c) {
            AbstractC20800b.m21332t("Id3Decoder", "Frame size exceeds remaining tag data");
            c20811m.m21344F(c20811m.f66094c);
            return null;
        }
        if (c8990d != null) {
            switch (c8990d.f27435Y) {
                default:
                    if ((iM21365t == 67 && iM21365t2 == 79 && iM21365t3 == 77 && (iM21365t4 == 77 || i10 == 2)) || (iM21365t == 77 && iM21365t2 == 76 && iM21365t3 == 76 && (iM21365t4 == 84 || i10 == 2))) {
                        z15 = true;
                        break;
                    }
                case 5:
                    z15 = false;
                    break;
            }
            if (!z15) {
                c20811m.m21344F(i13);
                return null;
            }
        }
        if (i10 == 3) {
            z10 = (iM21371z & 128) != 0;
            z11 = (iM21371z & 64) != 0;
            z13 = (iM21371z & 32) != 0;
            z14 = false;
            z12 = z10;
        } else if (i10 == 4) {
            boolean z16 = (iM21371z & 64) != 0;
            boolean z17 = (iM21371z & 8) != 0;
            boolean z18 = (iM21371z & 4) != 0;
            z14 = (iM21371z & 2) != 0;
            z12 = (iM21371z & 1) != 0;
            boolean z19 = z18;
            z13 = z16;
            z10 = z17;
            z11 = z19;
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (z10 || z11) {
            AbstractC20800b.m21332t("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c20811m.m21344F(i13);
            return null;
        }
        if (z13) {
            iM21369x--;
            c20811m.m21345G(1);
        }
        if (z12) {
            iM21369x -= 4;
            c20811m.m21345G(4);
        }
        if (z14) {
            iM21369x = m14756y(iM21369x, c20811m);
        }
        int i14 = iM21369x;
        try {
            try {
                if (iM21365t == 84 && iM21365t2 == 88 && iM21365t3 == 88 && (i10 == 2 || iM21365t4 == 88)) {
                    c13004b = m14748q(i14, c20811m);
                } else if (iM21365t == 84) {
                    c13004b = m14746o(i14, m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4), c20811m);
                } else if (iM21365t == 87 && iM21365t2 == 88 && iM21365t3 == 88 && (i10 == 2 || iM21365t4 == 88)) {
                    c13004b = m14750s(i14, c20811m);
                } else if (iM21365t == 87) {
                    c13004b = m14749r(i14, m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4), c20811m);
                } else if (iM21365t == 80 && iM21365t2 == 82 && iM21365t3 == 73 && iM21365t4 == 86) {
                    c13004b = m14744m(i14, c20811m);
                } else {
                    i12 = 79;
                    if (iM21365t != 71 || iM21365t2 != 69 || iM21365t3 != 79 || (iM21365t4 != 66 && i10 != 2)) {
                        if (i10 == 2) {
                            if (iM21365t == 80 && iM21365t2 == 73 && iM21365t3 == 67) {
                                c13004b = m14737f(c20811m, i14, i10);
                            } else if (iM21365t != 67 && iM21365t2 == 79 && iM21365t3 == 77 && (iM21365t4 == 77 || i10 == 2)) {
                                c13004b = m14740i(i14, c20811m);
                            } else {
                                try {
                                    if (iM21365t != 67 && iM21365t2 == 72 && iM21365t3 == 65 && iM21365t4 == 80) {
                                        i12 = i14;
                                        c13004b = m14738g(c20811m, i14, i10, z6, i11, c8990d);
                                    } else if (iM21365t != 67 && iM21365t2 == 84 && iM21365t3 == 79 && iM21365t4 == 67) {
                                        i12 = i14;
                                        c13004b = m14739h(c20811m, i14, i10, z6, i11, c8990d);
                                    } else {
                                        i12 = i14;
                                        if (iM21365t != 77 && iM21365t2 == 76 && iM21365t3 == 76 && iM21365t4 == 84) {
                                            c13004b = m14743l(i12, c20811m);
                                        } else {
                                            String strM14753v = m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4);
                                            byte[] bArr = new byte[i12];
                                            c20811m.m21350e(bArr, 0, i12);
                                            c13004b = new C13004b(strM14753v, bArr);
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    c20811m.m21344F(i13);
                                    th2 = e;
                                    c13004b = null;
                                } catch (OutOfMemoryError e11) {
                                    e = e11;
                                    c20811m.m21344F(i13);
                                    th2 = e;
                                    c13004b = null;
                                }
                            }
                            c20811m.m21344F(i13);
                            th2 = null;
                        } else if (iM21365t == 65 && iM21365t2 == 80 && iM21365t3 == 73 && iM21365t4 == 67) {
                            c13004b = m14737f(c20811m, i14, i10);
                        } else {
                            if (iM21365t != 67) {
                            }
                            if (iM21365t != 67) {
                                if (iM21365t != 67) {
                                    i12 = i14;
                                    if (iM21365t != 77) {
                                        String strM14753v2 = m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4);
                                        byte[] bArr2 = new byte[i12];
                                        c20811m.m21350e(bArr2, 0, i12);
                                        c13004b = new C13004b(strM14753v2, bArr2);
                                    } else {
                                        String strM14753v3 = m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4);
                                        byte[] bArr3 = new byte[i12];
                                        c20811m.m21350e(bArr3, 0, i12);
                                        c13004b = new C13004b(strM14753v3, bArr3);
                                    }
                                } else {
                                    i12 = i14;
                                    if (iM21365t != 77) {
                                        String strM14753v4 = m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4);
                                        byte[] bArr4 = new byte[i12];
                                        c20811m.m21350e(bArr4, 0, i12);
                                        c13004b = new C13004b(strM14753v4, bArr4);
                                    } else {
                                        String strM14753v5 = m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4);
                                        byte[] bArr5 = new byte[i12];
                                        c20811m.m21350e(bArr5, 0, i12);
                                        c13004b = new C13004b(strM14753v5, bArr5);
                                    }
                                }
                            } else if (iM21365t != 67) {
                                i12 = i14;
                                if (iM21365t != 77) {
                                    String strM14753v6 = m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4);
                                    byte[] bArr6 = new byte[i12];
                                    c20811m.m21350e(bArr6, 0, i12);
                                    c13004b = new C13004b(strM14753v6, bArr6);
                                } else {
                                    String strM14753v7 = m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4);
                                    byte[] bArr7 = new byte[i12];
                                    c20811m.m21350e(bArr7, 0, i12);
                                    c13004b = new C13004b(strM14753v7, bArr7);
                                }
                            } else {
                                i12 = i14;
                                if (iM21365t != 77) {
                                    String strM14753v8 = m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4);
                                    byte[] bArr8 = new byte[i12];
                                    c20811m.m21350e(bArr8, 0, i12);
                                    c13004b = new C13004b(strM14753v8, bArr8);
                                } else {
                                    String strM14753v9 = m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4);
                                    byte[] bArr9 = new byte[i12];
                                    c20811m.m21350e(bArr9, 0, i12);
                                    c13004b = new C13004b(strM14753v9, bArr9);
                                }
                            }
                            c20811m.m21344F(i13);
                            th2 = null;
                        }
                        if (c13004b == null) {
                            AbstractC20800b.m21333u("Id3Decoder", "Failed to decode frame: id=" + m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4) + ", frameSize=" + i12, th2);
                        }
                        return c13004b;
                    }
                    c13004b = m14742k(i14, c20811m);
                }
                i12 = i14;
                c20811m.m21344F(i13);
                th2 = null;
            } catch (Throwable th3) {
                c20811m.m21344F(i13);
                throw th3;
            }
        } catch (Exception e12) {
            e = e12;
            i12 = i14;
            c20811m.m21344F(i13);
            th2 = e;
            c13004b = null;
            if (c13004b == null) {
                AbstractC20800b.m21333u("Id3Decoder", "Failed to decode frame: id=" + m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4) + ", frameSize=" + i12, th2);
            }
            return c13004b;
        } catch (OutOfMemoryError e13) {
            e = e13;
            i12 = i14;
            c20811m.m21344F(i13);
            th2 = e;
            c13004b = null;
            if (c13004b == null) {
                AbstractC20800b.m21333u("Id3Decoder", "Failed to decode frame: id=" + m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4) + ", frameSize=" + i12, th2);
            }
            return c13004b;
        }
        if (c13004b == null) {
            AbstractC20800b.m21333u("Id3Decoder", "Failed to decode frame: id=" + m14753v(i10, iM21365t, iM21365t2, iM21365t3, iM21365t4) + ", frameSize=" + i12, th2);
        }
        return c13004b;
    }

    /* JADX INFO: renamed from: k */
    public static C13008f m14742k(int i10, C20811m c20811m) {
        int iM21365t = c20811m.m21365t();
        Charset charsetM14752u = m14752u(iM21365t);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c20811m.m21350e(bArr, 0, i11);
        int iM14755x = m14755x(0, bArr);
        String strM20711i = AbstractC19754D.m20711i(new String(bArr, 0, iM14755x, AbstractC10531d.f31241b));
        int i12 = iM14755x + 1;
        int iM14754w = m14754w(bArr, i12, iM21365t);
        String strM14745n = m14745n(bArr, i12, iM14754w, charsetM14752u);
        int iM14751t = m14751t(iM21365t) + iM14754w;
        int iM14754w2 = m14754w(bArr, iM14751t, iM21365t);
        String strM14745n2 = m14745n(bArr, iM14751t, iM14754w2, charsetM14752u);
        int iM14751t2 = m14751t(iM21365t) + iM14754w2;
        return new C13008f(strM20711i, strM14745n, strM14745n2, i11 <= iM14751t2 ? AbstractC20817s.f66111f : Arrays.copyOfRange(bArr, iM14751t2, i11));
    }

    /* JADX INFO: renamed from: l */
    public static C13014l m14743l(int i10, C20811m c20811m) {
        int iM21371z = c20811m.m21371z();
        int iM21368w = c20811m.m21368w();
        int iM21368w2 = c20811m.m21368w();
        int iM21365t = c20811m.m21365t();
        int iM21365t2 = c20811m.m21365t();
        C6318J c6318j = new C6318J();
        c6318j.m6879p(c20811m);
        int i11 = ((i10 - 10) * 8) / (iM21365t + iM21365t2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iM6872i = c6318j.m6872i(iM21365t);
            int iM6872i2 = c6318j.m6872i(iM21365t2);
            iArr[i12] = iM6872i;
            iArr2[i12] = iM6872i2;
        }
        return new C13014l(iM21371z, iM21368w, iM21368w2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: m */
    public static C13015m m14744m(int i10, C20811m c20811m) {
        byte[] bArr = new byte[i10];
        c20811m.m21350e(bArr, 0, i10);
        int iM14755x = m14755x(0, bArr);
        String str = new String(bArr, 0, iM14755x, AbstractC10531d.f31241b);
        int i11 = iM14755x + 1;
        return new C13015m(str, i10 <= i11 ? AbstractC20817s.f66111f : Arrays.copyOfRange(bArr, i11, i10));
    }

    /* JADX INFO: renamed from: n */
    public static String m14745n(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    /* JADX INFO: renamed from: o */
    public static C13016n m14746o(int i10, String str, C20811m c20811m) {
        if (i10 < 1) {
            return null;
        }
        int iM21365t = c20811m.m21365t();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c20811m.m21350e(bArr, 0, i11);
        return new C13016n(str, null, m14747p(bArr, iM21365t, 0));
    }

    /* JADX INFO: renamed from: p */
    public static C11294T m14747p(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return AbstractC11278C.m12695y("");
        }
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        int iM14754w = m14754w(bArr, i11, i10);
        while (i11 < iM14754w) {
            c11333zM12690s.m12762a(new String(bArr, i11, iM14754w - i11, m14752u(i10)));
            i11 = m14751t(i10) + iM14754w;
            iM14754w = m14754w(bArr, i11, i10);
        }
        C11294T c11294tM12768j = c11333zM12690s.m12768j();
        return c11294tM12768j.isEmpty() ? AbstractC11278C.m12695y("") : c11294tM12768j;
    }

    /* JADX INFO: renamed from: q */
    public static C13016n m14748q(int i10, C20811m c20811m) {
        if (i10 < 1) {
            return null;
        }
        int iM21365t = c20811m.m21365t();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c20811m.m21350e(bArr, 0, i11);
        int iM14754w = m14754w(bArr, 0, iM21365t);
        return new C13016n("TXXX", new String(bArr, 0, iM14754w, m14752u(iM21365t)), m14747p(bArr, iM21365t, m14751t(iM21365t) + iM14754w));
    }

    /* JADX INFO: renamed from: r */
    public static C13017o m14749r(int i10, String str, C20811m c20811m) {
        byte[] bArr = new byte[i10];
        c20811m.m21350e(bArr, 0, i10);
        return new C13017o(str, null, new String(bArr, 0, m14755x(0, bArr), AbstractC10531d.f31241b));
    }

    /* JADX INFO: renamed from: s */
    public static C13017o m14750s(int i10, C20811m c20811m) {
        if (i10 < 1) {
            return null;
        }
        int iM21365t = c20811m.m21365t();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c20811m.m21350e(bArr, 0, i11);
        int iM14754w = m14754w(bArr, 0, iM21365t);
        String str = new String(bArr, 0, iM14754w, m14752u(iM21365t));
        int iM14751t = m14751t(iM21365t) + iM14754w;
        return new C13017o("WXXX", str, m14745n(bArr, iM14751t, m14755x(iM14751t, bArr), AbstractC10531d.f31241b));
    }

    /* JADX INFO: renamed from: t */
    public static int m14751t(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: u */
    public static Charset m14752u(int i10) {
        if (i10 == 1) {
            return AbstractC10531d.f31245f;
        }
        if (i10 != 2) {
            return i10 != 3 ? AbstractC10531d.f31241b : AbstractC10531d.f31242c;
        }
        return AbstractC10531d.f31243d;
    }

    /* JADX INFO: renamed from: v */
    public static String m14753v(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    /* JADX INFO: renamed from: w */
    public static int m14754w(byte[] bArr, int i10, int i11) {
        int iM14755x = m14755x(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iM14755x;
        }
        while (iM14755x < bArr.length - 1) {
            if ((iM14755x - i10) % 2 == 0 && bArr[iM14755x + 1] == 0) {
                return iM14755x;
            }
            iM14755x = m14755x(iM14755x + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: x */
    public static int m14755x(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: y */
    public static int m14756y(int i10, C20811m c20811m) {
        byte[] bArr = c20811m.f66092a;
        int i11 = c20811m.f66093b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: z */
    public static boolean m14757z(C20811m c20811m, int i10, int i11, boolean z6) {
        int iM21368w;
        long jM21368w;
        int iM21371z;
        int i12;
        int i13 = c20811m.f66093b;
        while (true) {
            try {
                boolean z10 = true;
                if (c20811m.m21346a() < i11) {
                    c20811m.m21344F(i13);
                    return true;
                }
                if (i10 >= 3) {
                    iM21368w = c20811m.m21352g();
                    jM21368w = c20811m.m21367v();
                    iM21371z = c20811m.m21371z();
                } else {
                    iM21368w = c20811m.m21368w();
                    jM21368w = c20811m.m21368w();
                    iM21371z = 0;
                }
                if (iM21368w == 0 && jM21368w == 0 && iM21371z == 0) {
                    c20811m.m21344F(i13);
                    return true;
                }
                if (i10 == 4 && !z6) {
                    if ((8421504 & jM21368w) != 0) {
                        c20811m.m21344F(i13);
                        return false;
                    }
                    jM21368w = (((jM21368w >> 24) & 255) << 21) | (jM21368w & 255) | (((jM21368w >> 8) & 255) << 7) | (((jM21368w >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iM21371z & 64) != 0 ? 1 : 0;
                    if ((iM21371z & 1) == 0) {
                        z10 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iM21371z & 32) != 0 ? 1 : 0;
                    if ((iM21371z & 128) == 0) {
                        z10 = false;
                    }
                } else {
                    i12 = 0;
                    z10 = false;
                }
                if (z10) {
                    i12 += 4;
                }
                if (jM21368w < i12) {
                    c20811m.m21344F(i13);
                    return false;
                }
                if (c20811m.m21346a() < jM21368w) {
                    c20811m.m21344F(i13);
                    return false;
                }
                c20811m.m21345G((int) jM21368w);
            } catch (Throwable th2) {
                c20811m.m21344F(i13);
                throw th2;
            }
        }
    }

    @Override // p594Y9.AbstractC9997x4
    /* JADX INFO: renamed from: d */
    public final C19753C mo10641d(C9643a c9643a, ByteBuffer byteBuffer) {
        return m14758e(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final C19753C m14758e(int i10, byte[] bArr) {
        boolean z6;
        C13009g c13009g;
        int i11;
        int i12;
        boolean z10;
        int iM14756y;
        AbstractC13011i abstractC13011iM14741j;
        boolean z11 = true;
        ArrayList arrayList = new ArrayList();
        C20811m c20811m = new C20811m(i10, bArr);
        if (c20811m.m21346a() < 10) {
            AbstractC20800b.m21332t("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM21368w = c20811m.m21368w();
            if (iM21368w == 4801587) {
                int iM21365t = c20811m.m21365t();
                c20811m.m21345G(1);
                int iM21365t2 = c20811m.m21365t();
                int iM21364s = c20811m.m21364s();
                if (iM21365t != 2) {
                    if (iM21365t == 3) {
                        if ((iM21365t2 & 64) != 0) {
                            int iM21352g = c20811m.m21352g();
                            c20811m.m21345G(iM21352g);
                            iM21364s -= iM21352g + 4;
                        }
                    } else if (iM21365t == 4) {
                        if ((iM21365t2 & 64) != 0) {
                            int iM21364s2 = c20811m.m21364s();
                            c20811m.m21345G(iM21364s2 - 4);
                            iM21364s -= iM21364s2;
                        }
                        if ((iM21365t2 & 16) != 0) {
                            iM21364s -= 10;
                        }
                    } else {
                        AbstractC20734X.m21224A(iM21365t, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iM21365t < 4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    c13009g = new C13009g(iM21365t, iM21364s, z6);
                } else if ((iM21365t2 & 64) != 0) {
                    AbstractC20800b.m21332t("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM21365t < 4 || (iM21365t2 & 128) == 0) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    c13009g = new C13009g(iM21365t, iM21364s, z6);
                }
                if (c13009g == null) {
                    return null;
                }
                int i13 = c20811m.f66093b;
                i11 = c13009g.f41281a;
                i12 = i11 == 2 ? 6 : 10;
                z10 = c13009g.f41282b;
                iM14756y = c13009g.f41283c;
                if (z10) {
                    iM14756y = m14756y(iM14756y, c20811m);
                }
                c20811m.m21343E(i13 + iM14756y);
                if (m14757z(c20811m, i11, i12, false)) {
                    z11 = false;
                } else if (i11 == 4 || !m14757z(c20811m, 4, i12, true)) {
                    AbstractC20734X.m21224A(i11, SfpOlmlMATQ.XkfTP, "Id3Decoder");
                    return null;
                }
                while (c20811m.m21346a() >= i12) {
                    abstractC13011iM14741j = m14741j(i11, c20811m, z11, i12, this.f41285a);
                    if (abstractC13011iM14741j != null) {
                        arrayList.add(abstractC13011iM14741j);
                    }
                }
                return new C19753C(arrayList);
            }
            AbstractC20800b.m21332t("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM21368w))));
        }
        c13009g = null;
        if (c13009g == null) {
            return null;
        }
        int i14 = c20811m.f66093b;
        i11 = c13009g.f41281a;
        if (i11 == 2) {
        }
        z10 = c13009g.f41282b;
        iM14756y = c13009g.f41283c;
        if (z10) {
            iM14756y = m14756y(iM14756y, c20811m);
        }
        c20811m.m21343E(i14 + iM14756y);
        if (m14757z(c20811m, i11, i12, false)) {
            if (i11 == 4) {
            }
            AbstractC20734X.m21224A(i11, SfpOlmlMATQ.XkfTP, "Id3Decoder");
            return null;
        }
        z11 = false;
        while (c20811m.m21346a() >= i12) {
            abstractC13011iM14741j = m14741j(i11, c20811m, z11, i12, this.f41285a);
            if (abstractC13011iM14741j != null) {
                arrayList.add(abstractC13011iM14741j);
            }
        }
        return new C19753C(arrayList);
    }
}
