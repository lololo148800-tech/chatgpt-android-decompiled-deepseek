package p824j4;

import android.util.Pair;
import bb.AbstractC11278C;
import bb.C11294T;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p031B3.AbstractC0797a;
import p054C0.C1497j;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19781h;
import p1016t3.C19785l;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1097x3.C21117c;
import p239Ja.C4312o;
import p265Kb.C4612e;
import p350O1.C6061j;
import p372P3.AbstractC6320b;
import p372P3.C6318J;
import p372P3.C6319a;
import p372P3.C6321c;
import p372P3.C6341w;
import p372P3.C6342x;
import p523V9.AbstractC8135l5;
import p644ab.AbstractC10531d;
import p644ab.InterfaceC10532e;
import p666bl.C11500p;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j4.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16109e {

    /* JADX INFO: renamed from: a */
    public static final byte[] f49896a;

    static {
        int i10 = AbstractC20817s.f66106a;
        f49896a = "OpusHead".getBytes(AbstractC10531d.f31242c);
    }

    /* JADX INFO: renamed from: a */
    public static C1497j m17656a(int i10, C20811m c20811m) {
        c20811m.m21344F(i10 + 12);
        c20811m.m21345G(1);
        m17657b(c20811m);
        c20811m.m21345G(2);
        int iM21365t = c20811m.m21365t();
        if ((iM21365t & 128) != 0) {
            c20811m.m21345G(2);
        }
        if ((iM21365t & 64) != 0) {
            c20811m.m21345G(c20811m.m21365t());
        }
        if ((iM21365t & 32) != 0) {
            c20811m.m21345G(2);
        }
        c20811m.m21345G(1);
        m17657b(c20811m);
        String strM20704b = AbstractC19754D.m20704b(c20811m.m21365t());
        if ("audio/mpeg".equals(strM20704b) || "audio/vnd.dts".equals(strM20704b) || "audio/vnd.dts.hd".equals(strM20704b)) {
            return new C1497j(strM20704b, null, -1L, -1L);
        }
        c20811m.m21345G(4);
        long jM21367v = c20811m.m21367v();
        long jM21367v2 = c20811m.m21367v();
        c20811m.m21345G(1);
        int iM17657b = m17657b(c20811m);
        byte[] bArr = new byte[iM17657b];
        c20811m.m21350e(bArr, 0, iM17657b);
        return new C1497j(strM20704b, bArr, jM21367v2 > 0 ? jM21367v2 : -1L, jM21367v > 0 ? jM21367v : -1L);
    }

    /* JADX INFO: renamed from: b */
    public static int m17657b(C20811m c20811m) {
        int iM21365t = c20811m.m21365t();
        int i10 = iM21365t & 127;
        while ((iM21365t & 128) == 128) {
            iM21365t = c20811m.m21365t();
            i10 = (i10 << 7) | (iM21365t & 127);
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static C21117c m17658c(C20811m c20811m) {
        long jM21359n;
        long jM21359n2;
        c20811m.m21344F(8);
        if (AbstractC0797a.m1822m(c20811m.m21352g()) == 0) {
            jM21359n = c20811m.m21367v();
            jM21359n2 = c20811m.m21367v();
        } else {
            jM21359n = c20811m.m21359n();
            jM21359n2 = c20811m.m21359n();
        }
        return new C21117c(jM21359n, jM21359n2, c20811m.m21367v());
    }

    /* JADX INFO: renamed from: d */
    public static Pair m17659d(C20811m c20811m, int i10, int i11) throws C19755E {
        C16121q c16121q;
        Pair pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int i14 = c20811m.f66093b;
        while (i14 - i10 < i11) {
            c20811m.m21344F(i14);
            int iM21352g = c20811m.m21352g();
            AbstractC6320b.m6887c("childAtomSize must be positive", iM21352g > 0);
            if (c20811m.m21352g() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String strM21363r = null;
                Integer numValueOf = null;
                while (i15 - i14 < iM21352g) {
                    c20811m.m21344F(i15);
                    int iM21352g2 = c20811m.m21352g();
                    int iM21352g3 = c20811m.m21352g();
                    if (iM21352g3 == 1718775137) {
                        numValueOf = Integer.valueOf(c20811m.m21352g());
                    } else if (iM21352g3 == 1935894637) {
                        c20811m.m21345G(4);
                        strM21363r = c20811m.m21363r(4, AbstractC10531d.f31242c);
                    } else if (iM21352g3 == 1935894633) {
                        i17 = i15;
                        i16 = iM21352g2;
                    }
                    i15 += iM21352g2;
                }
                if ("cenc".equals(strM21363r) || "cbc1".equals(strM21363r) || "cens".equals(strM21363r) || "cbcs".equals(strM21363r)) {
                    AbstractC6320b.m6887c("frma atom is mandatory", numValueOf != null);
                    AbstractC6320b.m6887c("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            c16121q = null;
                            break;
                        }
                        c20811m.m21344F(i18);
                        int iM21352g4 = c20811m.m21352g();
                        if (c20811m.m21352g() == 1952804451) {
                            int iM1822m = AbstractC0797a.m1822m(c20811m.m21352g());
                            c20811m.m21345G(1);
                            if (iM1822m == 0) {
                                c20811m.m21345G(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iM21365t = c20811m.m21365t();
                                int i19 = (iM21365t & 240) >> 4;
                                i12 = iM21365t & 15;
                                i13 = i19;
                            }
                            boolean z6 = c20811m.m21365t() == 1;
                            int iM21365t2 = c20811m.m21365t();
                            byte[] bArr2 = new byte[16];
                            c20811m.m21350e(bArr2, 0, 16);
                            if (z6 && iM21365t2 == 0) {
                                int iM21365t3 = c20811m.m21365t();
                                byte[] bArr3 = new byte[iM21365t3];
                                c20811m.m21350e(bArr3, 0, iM21365t3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            c16121q = new C16121q(z6, strM21363r, iM21365t2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i18 += iM21352g4;
                    }
                    AbstractC6320b.m6887c("tenc atom is mandatory", c16121q != null);
                    int i20 = AbstractC20817s.f66106a;
                    pairCreate = Pair.create(numValueOf, c16121q);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iM21352g;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x02db  */
    /* JADX WARN: Code duplicated, block: B:218:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:319:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:513:0x0b8f  */
    /* JADX WARN: Code duplicated, block: B:515:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:517:0x0bbc  */
    /* JADX WARN: Code duplicated, block: B:518:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:523:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:525:0x0c0b  */
    /* JADX WARN: Code duplicated, block: B:526:0x0c22  */
    /* JADX WARN: Code duplicated, block: B:528:0x0c28  */
    /* JADX WARN: Code duplicated, block: B:529:0x0c40  */
    /* JADX WARN: Code duplicated, block: B:531:0x0c46  */
    /* JADX WARN: Code duplicated, block: B:532:0x0c5e  */
    /* JADX WARN: Code duplicated, block: B:534:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:536:0x0c75  */
    /* JADX WARN: Code duplicated, block: B:540:0x0c97  */
    /* JADX WARN: Code duplicated, block: B:541:0x0c9c  */
    /* JADX WARN: Code duplicated, block: B:544:0x0ca6  */
    /* JADX WARN: Code duplicated, block: B:547:0x0cb0  */
    /* JADX WARN: Code duplicated, block: B:548:0x0cb3  */
    /* JADX WARN: Code duplicated, block: B:550:0x0cba  */
    /* JADX WARN: Code duplicated, block: B:554:0x0cc5  */
    /* JADX WARN: Code duplicated, block: B:555:0x0cca  */
    /* JADX WARN: Code duplicated, block: B:558:0x0cd5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:562:0x0cdd  */
    /* JADX WARN: Code duplicated, block: B:565:0x0ce5  */
    /* JADX WARN: Code duplicated, block: B:568:0x0cec  */
    /* JADX WARN: Code duplicated, block: B:570:0x0cfc  */
    /* JADX WARN: Code duplicated, block: B:572:0x0cff  */
    /* JADX WARN: Code duplicated, block: B:576:0x0d07  */
    /* JADX WARN: Code duplicated, block: B:580:0x0d14  */
    /* JADX WARN: Code duplicated, block: B:581:0x0d16  */
    /* JADX WARN: Code duplicated, block: B:583:0x0d22  */
    /* JADX WARN: Code duplicated, block: B:708:0x0c78 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:513:0x0b8f, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public static C4312o m17660e(C20811m c20811m, int i10, int i11, String str, C19785l c19785l, boolean z6) throws C19755E {
        int i12;
        int i13;
        C19785l c19785lM20744a;
        String str2;
        float fM21369x;
        byte[] bArr;
        int i14;
        byte[] bArrCopyOfRange;
        int i15;
        int i16;
        int i17;
        int iM6872i;
        boolean zM6871h;
        int iM6872i2;
        int iM6872i3;
        int i18;
        C11294T c11294t;
        int i19;
        boolean zM6871h2;
        int i20;
        int iM6872i4;
        int i21;
        boolean z10;
        int i22;
        int i23;
        int iM20742g;
        C19781h c19781h;
        int iM6872i5;
        int i24;
        int iM6872i6;
        int i25;
        int iM21371z;
        int iM21366u;
        int iM21352g;
        int iIntValue;
        int i26;
        int i27;
        int i28;
        C19785l c19785l2;
        String str3;
        String str4;
        int i29;
        String str5;
        C1497j c1497j;
        List list;
        String str6;
        String str7;
        int i30;
        int i31;
        char c9;
        char c10;
        long j10;
        String str8;
        C11294T c11294tM12695y;
        c20811m.m21344F(12);
        int iM21352g2 = c20811m.m21352g();
        C4312o c4312o = new C4312o(iM21352g2);
        int i32 = 0;
        while (i32 < iM21352g2) {
            int i33 = c20811m.f66093b;
            int iM21352g3 = c20811m.m21352g();
            String str9 = "childAtomSize must be positive";
            AbstractC6320b.m6887c("childAtomSize must be positive", iM21352g3 > 0);
            int iM21352g4 = c20811m.m21352g();
            if (iM21352g4 == 1635148593 || iM21352g4 == 1635148595 || iM21352g4 == 1701733238 || iM21352g4 == 1831958048 || iM21352g4 == 1836070006 || iM21352g4 == 1752589105 || iM21352g4 == 1751479857 || iM21352g4 == 1932670515 || iM21352g4 == 1211250227 || iM21352g4 == 1987063864 || iM21352g4 == 1987063865 || iM21352g4 == 1635135537 || iM21352g4 == 1685479798 || iM21352g4 == 1685479729 || iM21352g4 == 1685481573 || iM21352g4 == 1685481521) {
                int i34 = 16;
                c20811m.m21344F(i33 + 16);
                c20811m.m21345G(i34);
                int iM21371z2 = c20811m.m21371z();
                int iM21371z3 = c20811m.m21371z();
                c20811m.m21345G(50);
                int i35 = c20811m.f66093b;
                if (iM21352g4 == 1701733238) {
                    i12 = iM21352g3;
                    i13 = i33;
                    Pair pairM17659d = m17659d(c20811m, i13, i12);
                    if (pairM17659d != null) {
                        iM21352g4 = ((Integer) pairM17659d.first).intValue();
                        c19785lM20744a = c19785l == null ? null : c19785l.m20744a(((C16121q) pairM17659d.second).f50006b);
                        ((C16121q[]) c4312o.f14018d)[i32] = (C16121q) pairM17659d.second;
                    } else {
                        c19785lM20744a = c19785l;
                    }
                    c20811m.m21344F(i35);
                } else {
                    i12 = iM21352g3;
                    i13 = i33;
                    c19785lM20744a = c19785l;
                }
                if (iM21352g4 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iM21352g4 == 1211250227 ? "video/3gpp" : null;
                }
                String str10 = str2;
                C19785l c19785l3 = c19785lM20744a;
                int i36 = i35;
                float f10 = 1.0f;
                int iM20742g2 = -1;
                int i37 = -1;
                String str11 = null;
                byte[] bArr2 = null;
                ByteBuffer byteBufferOrder = null;
                boolean z11 = false;
                int i38 = -1;
                int i39 = -1;
                List listM12695y = null;
                int i40 = 8;
                int i41 = 8;
                C1497j c1497j2 = null;
                int i42 = -1;
                while (true) {
                    if (i36 - i13 >= i12) {
                        fM21369x = f10;
                        bArr = bArr2;
                        break;
                    }
                    c20811m.m21344F(i36);
                    int i43 = c20811m.f66093b;
                    bArr = bArr2;
                    int iM21352g5 = c20811m.m21352g();
                    fM21369x = f10;
                    if (iM21352g5 == 0 && c20811m.f66093b - i13 == i12) {
                        break;
                    }
                    AbstractC6320b.m6887c(str9, iM21352g5 > 0);
                    int iM21352g6 = c20811m.m21352g();
                    String str12 = str9;
                    if (iM21352g6 == 1635148611) {
                        AbstractC6320b.m6887c(null, str10 == null);
                        c20811m.m21344F(i43 + 8);
                        C6321c c6321cM6905a = C6321c.m6905a(c20811m);
                        c4312o.f14016b = c6321cM6905a.f20498b;
                        float f11 = !z11 ? c6321cM6905a.f20507k : fM21369x;
                        ArrayList arrayList = c6321cM6905a.f20497a;
                        String str13 = c6321cM6905a.f20508l;
                        int i44 = c6321cM6905a.f20506j;
                        int i45 = c6321cM6905a.f20503g;
                        i39 = c6321cM6905a.f20504h;
                        int i46 = c6321cM6905a.f20505i;
                        int i47 = c6321cM6905a.f20501e;
                        i41 = c6321cM6905a.f20502f;
                        i40 = i47;
                        fM21369x = f11;
                        c4312o = c4312o;
                        iM21371z2 = iM21371z2;
                        i14 = iM21352g4;
                        iM21371z3 = iM21371z3;
                        i13 = i13;
                        i12 = i12;
                        str10 = "video/avc";
                        iM20742g2 = i46;
                        listM12695y = arrayList;
                        str11 = str13;
                        i37 = i45;
                        i38 = i44;
                    } else if (iM21352g6 == 1752589123) {
                        AbstractC6320b.m6887c(null, str10 == null);
                        c20811m.m21344F(i43 + 8);
                        C6342x c6342xM6958a = C6342x.m6958a(c20811m);
                        c4312o.f14016b = c6342xM6958a.f20582b;
                        float f12 = !z11 ? c6342xM6958a.f20588h : fM21369x;
                        List list2 = c6342xM6958a.f20581a;
                        int i48 = c6342xM6958a.f20589i;
                        str11 = c6342xM6958a.f20590j;
                        str10 = "video/hevc";
                        int i49 = c6342xM6958a.f20585e;
                        i39 = c6342xM6958a.f20586f;
                        int i50 = c6342xM6958a.f20587g;
                        int i51 = c6342xM6958a.f20583c;
                        i41 = c6342xM6958a.f20584d;
                        i40 = i51;
                        fM21369x = f12;
                        c4312o = c4312o;
                        iM21371z2 = iM21371z2;
                        i14 = iM21352g4;
                        iM21371z3 = iM21371z3;
                        i13 = i13;
                        i12 = i12;
                        listM12695y = list2;
                        iM20742g2 = i50;
                        i38 = i48;
                        i37 = i49;
                    } else if (iM21352g6 == 1685480259 || iM21352g6 == 1685485123) {
                        c4312o = c4312o;
                        iM21371z2 = iM21371z2;
                        i14 = iM21352g4;
                        iM21371z3 = iM21371z3;
                        i13 = i13;
                        i12 = i12;
                        C4612e c4612eM5354c = C4612e.m5354c(c20811m);
                        if (c4612eM5354c != null) {
                            str11 = c4612eM5354c.f15034Z;
                            str10 = "video/dolby-vision";
                        }
                    } else if (iM21352g6 == 1987076931) {
                        AbstractC6320b.m6887c(null, str10 == null);
                        String str14 = iM21352g4 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        c20811m.m21344F(i43 + 12);
                        c20811m.m21345G(2);
                        int iM21365t = c20811m.m21365t();
                        int i52 = iM21365t >> 4;
                        boolean z12 = (iM21365t & 1) != 0;
                        int iM21365t2 = c20811m.m21365t();
                        int iM21365t3 = c20811m.m21365t();
                        int iM20741f = C19781h.m20741f(iM21365t2);
                        i39 = z12 ? 1 : 2;
                        str10 = str14;
                        i40 = i52;
                        i41 = i40;
                        c4312o = c4312o;
                        iM21371z2 = iM21371z2;
                        i14 = iM21352g4;
                        iM21371z3 = iM21371z3;
                        i13 = i13;
                        i12 = i12;
                        iM20742g2 = C19781h.m20742g(iM21365t3);
                        i37 = iM20741f;
                    } else {
                        i14 = iM21352g4;
                        if (iM21352g6 == 1635135811) {
                            int i53 = iM21352g5 - 8;
                            byte[] bArr3 = new byte[i53];
                            c20811m.m21350e(bArr3, 0, i53);
                            C11294T c11294tM12695y2 = AbstractC11278C.m12695y(bArr3);
                            c20811m.m21344F(i43 + 8);
                            byte[] bArr4 = c20811m.f66092a;
                            C6318J c6318j = new C6318J(bArr4.length, bArr4);
                            c6318j.m6880q(c20811m.f66093b * 8);
                            c6318j.m6884u(1);
                            int iM6872i7 = c6318j.m6872i(3);
                            c6318j.m6883t(6);
                            boolean zM6871h3 = c6318j.m6871h();
                            boolean zM6871h4 = c6318j.m6871h();
                            if (iM6872i7 == 2 && zM6871h3) {
                                int i54 = zM6871h4 ? 12 : 10;
                                i17 = zM6871h4 ? 12 : 10;
                                i15 = i54;
                            } else {
                                if (iM6872i7 <= 2) {
                                    int i55 = zM6871h3 ? 10 : 8;
                                    i17 = zM6871h3 ? 10 : 8;
                                    i15 = i55;
                                } else {
                                    i15 = -1;
                                    i16 = -1;
                                }
                                c6318j.m6883t(13);
                                c6318j.m6882s();
                                iM6872i = c6318j.m6872i(4);
                                if (iM6872i != 1) {
                                    AbstractC20800b.m21327o("AtomParsers", "Unsupported obu_type: " + iM6872i);
                                    c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                } else if (c6318j.m6871h()) {
                                    AbstractC20800b.m21327o("AtomParsers", "Unsupported obu_extension_flag");
                                    c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                } else {
                                    zM6871h = c6318j.m6871h();
                                    c6318j.m6882s();
                                    if (zM6871h || c6318j.m6872i(8) <= 127) {
                                        iM6872i2 = c6318j.m6872i(3);
                                        c6318j.m6882s();
                                        if (c6318j.m6871h()) {
                                            AbstractC20800b.m21327o("AtomParsers", "Unsupported reduced_still_picture_header");
                                            c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                        } else if (c6318j.m6871h()) {
                                            AbstractC20800b.m21327o("AtomParsers", "Unsupported timing_info_present_flag");
                                            c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                        } else {
                                            if (c6318j.m6871h()) {
                                                AbstractC20800b.m21327o("AtomParsers", "Unsupported initial_display_delay_present_flag");
                                                c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                            } else {
                                                iM6872i3 = c6318j.m6872i(5);
                                                i18 = 0;
                                                while (i18 <= iM6872i3) {
                                                    c6318j.m6883t(12);
                                                    C11294T c11294t2 = c11294tM12695y2;
                                                    if (c6318j.m6872i(5) > 7) {
                                                        c6318j.m6882s();
                                                    }
                                                    i18++;
                                                    c11294tM12695y2 = c11294t2;
                                                }
                                                c11294t = c11294tM12695y2;
                                                int iM6872i8 = c6318j.m6872i(4);
                                                int iM6872i9 = c6318j.m6872i(4);
                                                c6318j.m6883t(iM6872i8 + 1);
                                                c6318j.m6883t(iM6872i9 + 1);
                                                if (c6318j.m6871h()) {
                                                    i19 = 7;
                                                    c6318j.m6883t(7);
                                                } else {
                                                    i19 = 7;
                                                }
                                                c6318j.m6883t(i19);
                                                zM6871h2 = c6318j.m6871h();
                                                if (zM6871h2) {
                                                    c6318j.m6883t(2);
                                                }
                                                if (c6318j.m6871h()) {
                                                    i20 = 1;
                                                    iM6872i4 = 2;
                                                } else {
                                                    i20 = 1;
                                                    iM6872i4 = c6318j.m6872i(1);
                                                }
                                                if (iM6872i4 > 0 && !c6318j.m6871h()) {
                                                    c6318j.m6883t(i20);
                                                }
                                                if (zM6871h2) {
                                                    i21 = 3;
                                                    c6318j.m6883t(3);
                                                } else {
                                                    i21 = 3;
                                                }
                                                c6318j.m6883t(i21);
                                                boolean zM6871h5 = c6318j.m6871h();
                                                if (iM6872i2 == 2 && zM6871h5) {
                                                    c6318j.m6882s();
                                                }
                                                if (iM6872i2 == 1 && c6318j.m6871h()) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (c6318j.m6871h()) {
                                                    iM6872i5 = c6318j.m6872i(8);
                                                    int iM6872i10 = c6318j.m6872i(8);
                                                    int iM6872i11 = c6318j.m6872i(8);
                                                    if (z10) {
                                                        i24 = 1;
                                                    } else {
                                                        i24 = 1;
                                                        if (iM6872i5 != 1 && iM6872i10 == 13 && iM6872i11 == 0) {
                                                            iM6872i6 = 1;
                                                        }
                                                        int iM20741f2 = C19781h.m20741f(iM6872i5);
                                                        if (iM6872i6 == i24) {
                                                            i25 = 1;
                                                        } else {
                                                            i25 = 2;
                                                        }
                                                        i23 = i25;
                                                        iM20742g = C19781h.m20742g(iM6872i10);
                                                        i22 = iM20741f2;
                                                    }
                                                    iM6872i6 = c6318j.m6872i(i24);
                                                    int iM20741f3 = C19781h.m20741f(iM6872i5);
                                                    if (iM6872i6 == i24) {
                                                        i25 = 1;
                                                    } else {
                                                        i25 = 2;
                                                    }
                                                    i23 = i25;
                                                    iM20742g = C19781h.m20742g(iM6872i10);
                                                    i22 = iM20741f3;
                                                } else {
                                                    i22 = -1;
                                                    i23 = -1;
                                                    iM20742g = -1;
                                                }
                                                c19781h = new C19781h(i22, i23, iM20742g, i15, i16, null);
                                            }
                                            int i56 = c19781h.f62679e;
                                            int i57 = c19781h.f62680f;
                                            int i58 = c19781h.f62675a;
                                            i39 = c19781h.f62676b;
                                            str10 = "video/av01";
                                            i40 = i56;
                                            i41 = i57;
                                            c4312o = c4312o;
                                            iM21371z2 = iM21371z2;
                                            i37 = i58;
                                            iM21371z3 = iM21371z3;
                                            i13 = i13;
                                            i12 = i12;
                                            listM12695y = c11294t;
                                            iM20742g2 = c19781h.f62677c;
                                        }
                                    } else {
                                        AbstractC20800b.m21327o("AtomParsers", "Excessive obu_size");
                                        c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                    }
                                }
                                c11294t = c11294tM12695y2;
                                int i59 = c19781h.f62679e;
                                int i510 = c19781h.f62680f;
                                int i511 = c19781h.f62675a;
                                i39 = c19781h.f62676b;
                                str10 = "video/av01";
                                i40 = i59;
                                i41 = i510;
                                c4312o = c4312o;
                                iM21371z2 = iM21371z2;
                                i37 = i511;
                                iM21371z3 = iM21371z3;
                                i13 = i13;
                                i12 = i12;
                                listM12695y = c11294t;
                                iM20742g2 = c19781h.f62677c;
                            }
                            i16 = i17;
                            c6318j.m6883t(13);
                            c6318j.m6882s();
                            iM6872i = c6318j.m6872i(4);
                            if (iM6872i != 1) {
                                AbstractC20800b.m21327o("AtomParsers", "Unsupported obu_type: " + iM6872i);
                                c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                            } else if (c6318j.m6871h()) {
                                AbstractC20800b.m21327o("AtomParsers", "Unsupported obu_extension_flag");
                                c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                            } else {
                                zM6871h = c6318j.m6871h();
                                c6318j.m6882s();
                                if (zM6871h) {
                                    iM6872i2 = c6318j.m6872i(3);
                                    c6318j.m6882s();
                                    if (c6318j.m6871h()) {
                                        AbstractC20800b.m21327o("AtomParsers", "Unsupported reduced_still_picture_header");
                                        c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                    } else if (c6318j.m6871h()) {
                                        AbstractC20800b.m21327o("AtomParsers", "Unsupported timing_info_present_flag");
                                        c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                    } else if (c6318j.m6871h()) {
                                        AbstractC20800b.m21327o("AtomParsers", "Unsupported initial_display_delay_present_flag");
                                        c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                    } else {
                                        iM6872i3 = c6318j.m6872i(5);
                                        i18 = 0;
                                        while (i18 <= iM6872i3) {
                                            c6318j.m6883t(12);
                                            C11294T c11294t3 = c11294tM12695y2;
                                            if (c6318j.m6872i(5) > 7) {
                                                c6318j.m6882s();
                                            }
                                            i18++;
                                            c11294tM12695y2 = c11294t3;
                                        }
                                        c11294t = c11294tM12695y2;
                                        int iM6872i12 = c6318j.m6872i(4);
                                        int iM6872i13 = c6318j.m6872i(4);
                                        c6318j.m6883t(iM6872i12 + 1);
                                        c6318j.m6883t(iM6872i13 + 1);
                                        if (c6318j.m6871h()) {
                                            i19 = 7;
                                            c6318j.m6883t(7);
                                        } else {
                                            i19 = 7;
                                        }
                                        c6318j.m6883t(i19);
                                        zM6871h2 = c6318j.m6871h();
                                        if (zM6871h2) {
                                            c6318j.m6883t(2);
                                        }
                                        if (c6318j.m6871h()) {
                                            i20 = 1;
                                            iM6872i4 = 2;
                                        } else {
                                            i20 = 1;
                                            iM6872i4 = c6318j.m6872i(1);
                                        }
                                        if (iM6872i4 > 0) {
                                            c6318j.m6883t(i20);
                                        }
                                        if (zM6871h2) {
                                            i21 = 3;
                                            c6318j.m6883t(3);
                                        } else {
                                            i21 = 3;
                                        }
                                        c6318j.m6883t(i21);
                                        boolean zM6871h6 = c6318j.m6871h();
                                        if (iM6872i2 == 2) {
                                            c6318j.m6882s();
                                        }
                                        if (iM6872i2 == 1) {
                                            z10 = false;
                                        } else {
                                            z10 = false;
                                        }
                                        if (c6318j.m6871h()) {
                                            iM6872i5 = c6318j.m6872i(8);
                                            int iM6872i14 = c6318j.m6872i(8);
                                            int iM6872i15 = c6318j.m6872i(8);
                                            if (z10) {
                                                i24 = 1;
                                                if (iM6872i5 != 1) {
                                                }
                                                int iM20741f4 = C19781h.m20741f(iM6872i5);
                                                if (iM6872i6 == i24) {
                                                    i25 = 1;
                                                } else {
                                                    i25 = 2;
                                                }
                                                i23 = i25;
                                                iM20742g = C19781h.m20742g(iM6872i14);
                                                i22 = iM20741f4;
                                            } else {
                                                i24 = 1;
                                            }
                                            iM6872i6 = c6318j.m6872i(i24);
                                            int iM20741f5 = C19781h.m20741f(iM6872i5);
                                            if (iM6872i6 == i24) {
                                                i25 = 1;
                                            } else {
                                                i25 = 2;
                                            }
                                            i23 = i25;
                                            iM20742g = C19781h.m20742g(iM6872i14);
                                            i22 = iM20741f5;
                                        } else {
                                            i22 = -1;
                                            i23 = -1;
                                            iM20742g = -1;
                                        }
                                        c19781h = new C19781h(i22, i23, iM20742g, i15, i16, null);
                                    }
                                } else {
                                    iM6872i2 = c6318j.m6872i(3);
                                    c6318j.m6882s();
                                    if (c6318j.m6871h()) {
                                        AbstractC20800b.m21327o("AtomParsers", "Unsupported reduced_still_picture_header");
                                        c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                    } else if (c6318j.m6871h()) {
                                        AbstractC20800b.m21327o("AtomParsers", "Unsupported timing_info_present_flag");
                                        c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                    } else if (c6318j.m6871h()) {
                                        AbstractC20800b.m21327o("AtomParsers", "Unsupported initial_display_delay_present_flag");
                                        c19781h = new C19781h(-1, -1, -1, i15, i16, null);
                                    } else {
                                        iM6872i3 = c6318j.m6872i(5);
                                        i18 = 0;
                                        while (i18 <= iM6872i3) {
                                            c6318j.m6883t(12);
                                            C11294T c11294t4 = c11294tM12695y2;
                                            if (c6318j.m6872i(5) > 7) {
                                                c6318j.m6882s();
                                            }
                                            i18++;
                                            c11294tM12695y2 = c11294t4;
                                        }
                                        c11294t = c11294tM12695y2;
                                        int iM6872i16 = c6318j.m6872i(4);
                                        int iM6872i17 = c6318j.m6872i(4);
                                        c6318j.m6883t(iM6872i16 + 1);
                                        c6318j.m6883t(iM6872i17 + 1);
                                        if (c6318j.m6871h()) {
                                            i19 = 7;
                                            c6318j.m6883t(7);
                                        } else {
                                            i19 = 7;
                                        }
                                        c6318j.m6883t(i19);
                                        zM6871h2 = c6318j.m6871h();
                                        if (zM6871h2) {
                                            c6318j.m6883t(2);
                                        }
                                        if (c6318j.m6871h()) {
                                            i20 = 1;
                                            iM6872i4 = 2;
                                        } else {
                                            i20 = 1;
                                            iM6872i4 = c6318j.m6872i(1);
                                        }
                                        if (iM6872i4 > 0) {
                                            c6318j.m6883t(i20);
                                        }
                                        if (zM6871h2) {
                                            i21 = 3;
                                            c6318j.m6883t(3);
                                        } else {
                                            i21 = 3;
                                        }
                                        c6318j.m6883t(i21);
                                        boolean zM6871h7 = c6318j.m6871h();
                                        if (iM6872i2 == 2) {
                                            c6318j.m6882s();
                                        }
                                        if (iM6872i2 == 1) {
                                            z10 = false;
                                        } else {
                                            z10 = false;
                                        }
                                        if (c6318j.m6871h()) {
                                            iM6872i5 = c6318j.m6872i(8);
                                            int iM6872i18 = c6318j.m6872i(8);
                                            int iM6872i19 = c6318j.m6872i(8);
                                            if (z10) {
                                                i24 = 1;
                                                if (iM6872i5 != 1) {
                                                }
                                                int iM20741f6 = C19781h.m20741f(iM6872i5);
                                                if (iM6872i6 == i24) {
                                                    i25 = 1;
                                                } else {
                                                    i25 = 2;
                                                }
                                                i23 = i25;
                                                iM20742g = C19781h.m20742g(iM6872i18);
                                                i22 = iM20741f6;
                                            } else {
                                                i24 = 1;
                                            }
                                            iM6872i6 = c6318j.m6872i(i24);
                                            int iM20741f7 = C19781h.m20741f(iM6872i5);
                                            if (iM6872i6 == i24) {
                                                i25 = 1;
                                            } else {
                                                i25 = 2;
                                            }
                                            i23 = i25;
                                            iM20742g = C19781h.m20742g(iM6872i18);
                                            i22 = iM20741f7;
                                        } else {
                                            i22 = -1;
                                            i23 = -1;
                                            iM20742g = -1;
                                        }
                                        c19781h = new C19781h(i22, i23, iM20742g, i15, i16, null);
                                    }
                                }
                                int i512 = c19781h.f62679e;
                                int i513 = c19781h.f62680f;
                                int i514 = c19781h.f62675a;
                                i39 = c19781h.f62676b;
                                str10 = "video/av01";
                                i40 = i512;
                                i41 = i513;
                                c4312o = c4312o;
                                iM21371z2 = iM21371z2;
                                i37 = i514;
                                iM21371z3 = iM21371z3;
                                i13 = i13;
                                i12 = i12;
                                listM12695y = c11294t;
                                iM20742g2 = c19781h.f62677c;
                            }
                            c11294t = c11294tM12695y2;
                            int i515 = c19781h.f62679e;
                            int i516 = c19781h.f62680f;
                            int i517 = c19781h.f62675a;
                            i39 = c19781h.f62676b;
                            str10 = "video/av01";
                            i40 = i515;
                            i41 = i516;
                            c4312o = c4312o;
                            iM21371z2 = iM21371z2;
                            i37 = i517;
                            iM21371z3 = iM21371z3;
                            i13 = i13;
                            i12 = i12;
                            listM12695y = c11294t;
                            iM20742g2 = c19781h.f62677c;
                        } else if (iM21352g6 == 1668050025) {
                            if (byteBufferOrder == null) {
                                byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                            }
                            byteBufferOrder.position(21);
                            byteBufferOrder.putShort(c20811m.m21362q());
                            byteBufferOrder.putShort(c20811m.m21362q());
                        } else if (iM21352g6 == 1835295606) {
                            if (byteBufferOrder == null) {
                                byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                            }
                            short sM21362q = c20811m.m21362q();
                            short sM21362q2 = c20811m.m21362q();
                            short sM21362q3 = c20811m.m21362q();
                            short sM21362q4 = c20811m.m21362q();
                            short sM21362q5 = c20811m.m21362q();
                            short sM21362q6 = c20811m.m21362q();
                            short sM21362q7 = c20811m.m21362q();
                            short sM21362q8 = c20811m.m21362q();
                            long jM21367v = c20811m.m21367v();
                            long jM21367v2 = c20811m.m21367v();
                            byteBufferOrder.position(1);
                            byteBufferOrder.putShort(sM21362q5);
                            byteBufferOrder.putShort(sM21362q6);
                            byteBufferOrder.putShort(sM21362q);
                            byteBufferOrder.putShort(sM21362q2);
                            byteBufferOrder.putShort(sM21362q3);
                            byteBufferOrder.putShort(sM21362q4);
                            byteBufferOrder.putShort(sM21362q7);
                            byteBufferOrder.putShort(sM21362q8);
                            byteBufferOrder.putShort((short) (jM21367v / 10000));
                            byteBufferOrder.putShort((short) (jM21367v2 / 10000));
                        } else {
                            c4312o = c4312o;
                            iM21371z2 = iM21371z2;
                            iM21371z3 = iM21371z3;
                            i13 = i13;
                            i12 = i12;
                            if (iM21352g6 == 1681012275) {
                                AbstractC6320b.m6887c(null, str10 == null);
                                str10 = "video/3gpp";
                            } else if (iM21352g6 == 1702061171) {
                                AbstractC6320b.m6887c(null, str10 == null);
                                C1497j c1497jM17656a = m17656a(i43, c20811m);
                                byte[] bArr5 = (byte[]) c1497jM17656a.f3973p0;
                                if (bArr5 != null) {
                                    listM12695y = AbstractC11278C.m12695y(bArr5);
                                }
                                c1497j2 = c1497jM17656a;
                                str10 = (String) c1497jM17656a.f3972o0;
                            } else if (iM21352g6 == 1885434736) {
                                c20811m.m21344F(i43 + 8);
                                fM21369x = c20811m.m21369x() / c20811m.m21369x();
                                z11 = true;
                            } else if (iM21352g6 == 1937126244) {
                                int i60 = i43 + 8;
                                while (true) {
                                    if (i60 - i43 >= iM21352g5) {
                                        bArrCopyOfRange = null;
                                        break;
                                    }
                                    c20811m.m21344F(i60);
                                    int iM21352g7 = c20811m.m21352g();
                                    if (c20811m.m21352g() == 1886547818) {
                                        bArrCopyOfRange = Arrays.copyOfRange(c20811m.f66092a, i60, iM21352g7 + i60);
                                        break;
                                    }
                                    i60 += iM21352g7;
                                }
                                bArr = bArrCopyOfRange;
                            } else if (iM21352g6 == 1936995172) {
                                int iM21365t4 = c20811m.m21365t();
                                c20811m.m21345G(3);
                                if (iM21365t4 == 0) {
                                    int iM21365t5 = c20811m.m21365t();
                                    if (iM21365t5 == 0) {
                                        i42 = 0;
                                    } else if (iM21365t5 == 1) {
                                        i42 = 1;
                                    } else if (iM21365t5 == 2) {
                                        i42 = 2;
                                    } else if (iM21365t5 == 3) {
                                        i42 = 3;
                                    }
                                }
                            } else if (iM21352g6 == 1668246642) {
                                if (i37 == -1 && iM20742g2 == -1) {
                                    int iM21352g8 = c20811m.m21352g();
                                    if (iM21352g8 == 1852009592 || iM21352g8 == 1852009571) {
                                        int iM21371z4 = c20811m.m21371z();
                                        int iM21371z5 = c20811m.m21371z();
                                        c20811m.m21345G(2);
                                        boolean z13 = iM21352g5 == 19 && (c20811m.m21365t() & 128) != 0;
                                        int iM20741f8 = C19781h.m20741f(iM21371z4);
                                        int i61 = z13 ? 1 : 2;
                                        iM20742g2 = C19781h.m20742g(iM21371z5);
                                        i39 = i61;
                                        i37 = iM20741f8;
                                    } else {
                                        AbstractC20800b.m21332t("AtomParsers", "Unsupported color type: " + AbstractC0797a.m1821c(iM21352g8));
                                    }
                                }
                            }
                        }
                    }
                    i36 += iM21352g5;
                    i13 = i13;
                    bArr2 = bArr;
                    f10 = fM21369x;
                    str9 = str12;
                    iM21352g4 = i14;
                    i12 = i12;
                    c4312o = c4312o;
                    iM21371z3 = iM21371z3;
                    iM21371z2 = iM21371z2;
                }
                i33 = i13;
                iM21352g3 = i12;
                if (str10 == null) {
                    c4312o = c4312o;
                } else {
                    C19787n c19787n = new C19787n();
                    c19787n.f62703a = Integer.toString(i10);
                    c19787n.f62714l = AbstractC19754D.m20711i(str10);
                    c19787n.f62711i = str11;
                    c19787n.f62720r = iM21371z2;
                    c19787n.f62721s = iM21371z3;
                    c19787n.f62724v = fM21369x;
                    c19787n.f62723u = i11;
                    c19787n.f62725w = bArr;
                    c19787n.f62726x = i42;
                    c19787n.f62717o = listM12695y;
                    c19787n.f62716n = i38;
                    c19787n.f62718p = c19785l3;
                    c19787n.f62727y = new C19781h(i37, i39, iM20742g2, i40, i41, byteBufferOrder != null ? byteBufferOrder.array() : null);
                    if (c1497j2 != null) {
                        C1497j c1497j3 = c1497j2;
                        c19787n.f62709g = AbstractC8135l5.m8658i(c1497j3.f3970Y);
                        c19787n.f62710h = AbstractC8135l5.m8658i(c1497j3.f3971Z);
                    }
                    C19788o c19788o = new C19788o(c19787n);
                    c4312o = c4312o;
                    c4312o.f14019e = c19788o;
                }
            } else if (iM21352g4 == 1836069985 || iM21352g4 == 1701733217 || iM21352g4 == 1633889587 || iM21352g4 == 1700998451 || iM21352g4 == 1633889588 || iM21352g4 == 1835823201 || iM21352g4 == 1685353315 || iM21352g4 == 1685353317 || iM21352g4 == 1685353320 || iM21352g4 == 1685353324 || iM21352g4 == 1685353336 || iM21352g4 == 1935764850 || iM21352g4 == 1935767394 || iM21352g4 == 1819304813 || iM21352g4 == 1936684916 || iM21352g4 == 1953984371 || iM21352g4 == 778924082 || iM21352g4 == 778924083 || iM21352g4 == 1835557169 || iM21352g4 == 1835560241 || iM21352g4 == 1634492771 || iM21352g4 == 1634492791 || iM21352g4 == 1970037111 || iM21352g4 == 1332770163 || iM21352g4 == 1716281667) {
                c20811m.m21344F(i33 + 16);
                if (z6) {
                    iM21371z = c20811m.m21371z();
                    c20811m.m21345G(6);
                } else {
                    c20811m.m21345G(8);
                    iM21371z = 0;
                }
                if (iM21371z == 0 || iM21371z == 1) {
                    int iM21371z6 = c20811m.m21371z();
                    c20811m.m21345G(6);
                    iM21366u = c20811m.m21366u();
                    c20811m.m21344F(c20811m.f66093b - 4);
                    iM21352g = c20811m.m21352g();
                    if (iM21371z == 1) {
                        c20811m.m21345G(16);
                    }
                    iIntValue = iM21371z6;
                    i26 = -1;
                } else {
                    if (iM21371z == 2) {
                        c20811m.m21345G(16);
                        iM21366u = (int) Math.round(Double.longBitsToDouble(c20811m.m21359n()));
                        iIntValue = c20811m.m21369x();
                        c20811m.m21345G(4);
                        int iM21369x = c20811m.m21369x();
                        int iM21369x2 = c20811m.m21369x();
                        boolean z14 = (iM21369x2 & 1) != 0;
                        boolean z15 = (iM21369x2 & 2) != 0;
                        if (z14) {
                            if (iM21369x == 32) {
                                i26 = 4;
                            } else {
                                i26 = -1;
                            }
                            i31 = 8;
                        } else {
                            i31 = 8;
                            if (iM21369x == 8) {
                                i26 = 3;
                            } else {
                                if (iM21369x == 16) {
                                    i26 = z15 ? 268435456 : 2;
                                } else if (iM21369x == 24) {
                                    i26 = z15 ? 1342177280 : 21;
                                } else if (iM21369x == 32) {
                                    i26 = z15 ? 1610612736 : 22;
                                } else {
                                    i26 = -1;
                                }
                                i31 = 8;
                            }
                        }
                        c20811m.m21345G(i31);
                        iM21352g = 0;
                    } else {
                        iM21352g2 = iM21352g2;
                        i27 = i33;
                        i32 = i32;
                        i28 = iM21352g3;
                    }
                    c4312o = c4312o;
                    iM21352g3 = i28;
                    i33 = i27;
                }
                int i62 = c20811m.f66093b;
                if (iM21352g4 == 1701733217) {
                    Pair pairM17659d2 = m17659d(c20811m, i33, iM21352g3);
                    if (pairM17659d2 != null) {
                        iM21352g4 = ((Integer) pairM17659d2.first).intValue();
                        C19785l c19785lM20744a2 = c19785l == 0 ? null : c19785l.m20744a(((C16121q) pairM17659d2.second).f50006b);
                        ((C16121q[]) c4312o.f14018d)[i32] = (C16121q) pairM17659d2.second;
                        c19785l2 = c19785lM20744a2;
                    } else {
                        iM21352g2 = iM21352g2;
                        c19785l2 = c19785l;
                    }
                    c20811m.m21344F(i62);
                } else {
                    iM21352g2 = iM21352g2;
                    c19785l2 = c19785l;
                }
                String str15 = "audio/mhm1";
                if (iM21352g4 == 1633889587) {
                    str3 = "audio/ac3";
                } else if (iM21352g4 == 1700998451) {
                    str3 = "audio/eac3";
                } else if (iM21352g4 == 1633889588) {
                    str3 = "audio/ac4";
                } else if (iM21352g4 == 1685353315) {
                    str3 = "audio/vnd.dts";
                } else if (iM21352g4 == 1685353320 || iM21352g4 == 1685353324) {
                    str3 = "audio/vnd.dts.hd";
                } else if (iM21352g4 == 1685353317) {
                    str3 = "audio/vnd.dts.hd;profile=lbr";
                } else if (iM21352g4 == 1685353336) {
                    str3 = "audio/vnd.dts.uhd;profile=p2";
                } else if (iM21352g4 == 1935764850) {
                    str3 = "audio/3gpp";
                } else if (iM21352g4 == 1935767394) {
                    str3 = "audio/amr-wb";
                } else if (iM21352g4 == 1936684916) {
                    str3 = "audio/raw";
                    i26 = 2;
                } else if (iM21352g4 == 1953984371) {
                    str3 = "audio/raw";
                    i26 = 268435456;
                } else if (iM21352g4 == 1819304813) {
                    if (i26 == -1) {
                        str3 = "audio/raw";
                        i26 = 2;
                    } else {
                        str3 = "audio/raw";
                    }
                } else if (iM21352g4 == 778924082 || iM21352g4 == 778924083) {
                    str3 = "audio/mpeg";
                } else if (iM21352g4 == 1835557169) {
                    str3 = "audio/mha1";
                } else if (iM21352g4 == 1835560241) {
                    str3 = "audio/mhm1";
                } else if (iM21352g4 == 1634492771) {
                    str3 = "audio/alac";
                } else if (iM21352g4 == 1634492791) {
                    str3 = "audio/g711-alaw";
                } else {
                    if (iM21352g4 == 1970037111) {
                        str4 = "audio/g711-mlaw";
                    } else if (iM21352g4 == 1332770163) {
                        str4 = "audio/opus";
                    } else if (iM21352g4 == 1716281667) {
                        str4 = "audio/flac";
                    } else {
                        str3 = iM21352g4 == 1835823201 ? "audio/true-hd" : null;
                    }
                    str3 = str4;
                }
                String str16 = str3;
                i32 = i32;
                int i63 = i26;
                int i64 = i62;
                List listM12695y2 = null;
                String str17 = null;
                C1497j c1497j4 = null;
                while (i64 - i33 < iM21352g3) {
                    c20811m.m21344F(i64);
                    int iM21352g9 = c20811m.m21352g();
                    int i65 = iM21352g3;
                    AbstractC6320b.m6887c(str9, iM21352g9 > 0);
                    int iM21352g10 = c20811m.m21352g();
                    int i66 = i33;
                    if (iM21352g10 == 1835557187) {
                        c20811m.m21344F(i64 + 8);
                        c20811m.m21345G(1);
                        int iM21365t6 = c20811m.m21365t();
                        c20811m.m21345G(1);
                        if (Objects.equals(str16, str15)) {
                            i30 = 0;
                            str17 = String.format("mhm1.%02X", Integer.valueOf(iM21365t6));
                        } else {
                            i30 = 0;
                            str17 = String.format("mha1.%02X", Integer.valueOf(iM21365t6));
                        }
                        int iM21371z7 = c20811m.m21371z();
                        byte[] bArr6 = new byte[iM21371z7];
                        c20811m.m21350e(bArr6, i30, iM21371z7);
                        listM12695y2 = listM12695y2 == null ? AbstractC11278C.m12695y(bArr6) : AbstractC11278C.m12696z(bArr6, (byte[]) listM12695y2.get(i30));
                    } else {
                        str15 = str15;
                        if (iM21352g10 == 1835557200) {
                            c20811m.m21344F(i64 + 8);
                            int iM21365t7 = c20811m.m21365t();
                            if (iM21365t7 > 0) {
                                byte[] bArr7 = new byte[iM21365t7];
                                c20811m.m21350e(bArr7, 0, iM21365t7);
                                listM12695y2 = listM12695y2 == null ? AbstractC11278C.m12695y(bArr7) : AbstractC11278C.m12696z((byte[]) listM12695y2.get(0), bArr7);
                            }
                        } else {
                            int i67 = 1702061171;
                            if (iM21352g10 != 1702061171) {
                                if (z6 && iM21352g10 == 2002876005) {
                                    i67 = 1702061171;
                                } else {
                                    if (iM21352g10 == 1684103987) {
                                        c20811m.m21344F(i64 + 8);
                                        String string = Integer.toString(i10);
                                        C6318J c6318j2 = new C6318J();
                                        c6318j2.m6879p(c20811m);
                                        int i68 = AbstractC6320b.f20475d[c6318j2.m6872i(2)];
                                        list = listM12695y2;
                                        c6318j2.m6883t(8);
                                        str6 = str17;
                                        int i69 = AbstractC6320b.f20477f[c6318j2.m6872i(3)];
                                        if (c6318j2.m6872i(1) != 0) {
                                            i69++;
                                        }
                                        int i70 = AbstractC6320b.f20478g[c6318j2.m6872i(5)] * 1000;
                                        c6318j2.m6866c();
                                        c20811m.m21344F(c6318j2.m6869f());
                                        C19787n c19787n2 = new C19787n();
                                        c19787n2.f62703a = string;
                                        c19787n2.f62714l = AbstractC19754D.m20711i("audio/ac3");
                                        c19787n2.f62728z = i69;
                                        c19787n2.f62694A = i68;
                                        c19787n2.f62718p = c19785l2;
                                        c19787n2.f62706d = str;
                                        c19787n2.f62709g = i70;
                                        c19787n2.f62710h = i70;
                                        c4312o.f14019e = new C19788o(c19787n2);
                                    } else {
                                        list = listM12695y2;
                                        str6 = str17;
                                        if (iM21352g10 == 1684366131) {
                                            c20811m.m21344F(i64 + 8);
                                            String string2 = Integer.toString(i10);
                                            C6318J c6318j3 = new C6318J();
                                            c6318j3.m6879p(c20811m);
                                            int iM6872i20 = c6318j3.m6872i(13) * 1000;
                                            c6318j3.m6883t(3);
                                            int i71 = AbstractC6320b.f20475d[c6318j3.m6872i(2)];
                                            c6318j3.m6883t(10);
                                            int i72 = AbstractC6320b.f20477f[c6318j3.m6872i(3)];
                                            if (c6318j3.m6872i(1) != 0) {
                                                i72++;
                                            }
                                            c6318j3.m6883t(3);
                                            int iM6872i21 = c6318j3.m6872i(4);
                                            c6318j3.m6883t(1);
                                            if (iM6872i21 > 0) {
                                                c6318j3.m6883t(6);
                                                if (c6318j3.m6872i(1) != 0) {
                                                    i72 += 2;
                                                }
                                                c6318j3.m6883t(1);
                                            }
                                            if (c6318j3.m6865b() > 7) {
                                                c6318j3.m6883t(7);
                                                if (c6318j3.m6872i(1) != 0) {
                                                    str7 = "audio/eac3-joc";
                                                } else {
                                                    str7 = "audio/eac3";
                                                }
                                            } else {
                                                str7 = "audio/eac3";
                                            }
                                            c6318j3.m6866c();
                                            c20811m.m21344F(c6318j3.m6869f());
                                            C19787n c19787n3 = new C19787n();
                                            c19787n3.f62703a = string2;
                                            c19787n3.f62714l = AbstractC19754D.m20711i(str7);
                                            c19787n3.f62728z = i72;
                                            c19787n3.f62694A = i71;
                                            c19787n3.f62718p = c19785l2;
                                            c19787n3.f62706d = str;
                                            c19787n3.f62710h = iM6872i20;
                                            c4312o.f14019e = new C19788o(c19787n3);
                                            iM21366u = iM21366u;
                                        } else {
                                            str9 = str9;
                                            int i73 = iM21366u;
                                            if (iM21352g10 == 1684103988) {
                                                c20811m.m21344F(i64 + 8);
                                                String string3 = Integer.toString(i10);
                                                c20811m.m21345G(1);
                                                int i74 = ((c20811m.m21365t() & 32) >> 5) == 1 ? 48000 : 44100;
                                                C19787n c19787n4 = new C19787n();
                                                c19787n4.f62703a = string3;
                                                c19787n4.f62714l = AbstractC19754D.m20711i("audio/ac4");
                                                c19787n4.f62728z = 2;
                                                c19787n4.f62694A = i74;
                                                c19787n4.f62718p = c19785l2;
                                                c19787n4.f62706d = str;
                                                c4312o.f14019e = new C19788o(c19787n4);
                                                iM21366u = i73;
                                            } else if (iM21352g10 == 1684892784) {
                                                if (iM21352g <= 0) {
                                                    throw C19755E.m20712a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM21352g);
                                                }
                                                iM21366u = iM21352g;
                                                iM21352g = iM21366u;
                                                listM12695y2 = list;
                                                str17 = str6;
                                                str5 = str9;
                                                iIntValue = 2;
                                            } else if (iM21352g10 == 1684305011 || iM21352g10 == 1969517683) {
                                                C19787n c19787n5 = new C19787n();
                                                c19787n5.f62703a = Integer.toString(i10);
                                                c19787n5.f62714l = AbstractC19754D.m20711i(str16);
                                                c19787n5.f62728z = iIntValue;
                                                iM21366u = i73;
                                                c19787n5.f62694A = iM21366u;
                                                c19787n5.f62718p = c19785l2;
                                                c19787n5.f62706d = str;
                                                c4312o.f14019e = new C19788o(c19787n5);
                                            } else {
                                                if (iM21352g10 == 1682927731) {
                                                    int i75 = iM21352g9 - 8;
                                                    byte[] bArr8 = f49896a;
                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr8, bArr8.length + i75);
                                                    c20811m.m21344F(i64 + 8);
                                                    c20811m.m21350e(bArrCopyOf, bArr8.length, i75);
                                                    listM12695y2 = AbstractC6320b.m6885a(bArrCopyOf);
                                                } else if (iM21352g10 == 1684425825) {
                                                    byte[] bArr9 = new byte[iM21352g9 - 8];
                                                    bArr9[0] = 102;
                                                    bArr9[1] = 76;
                                                    bArr9[2] = 97;
                                                    bArr9[3] = 67;
                                                    c20811m.m21344F(i64 + 12);
                                                    c20811m.m21350e(bArr9, 4, iM21352g9 - 12);
                                                    listM12695y2 = AbstractC11278C.m12695y(bArr9);
                                                } else {
                                                    if (iM21352g10 == 1634492771) {
                                                        int i76 = iM21352g9 - 12;
                                                        byte[] bArr10 = new byte[i76];
                                                        c20811m.m21344F(i64 + 12);
                                                        c20811m.m21350e(bArr10, 0, i76);
                                                        C20811m c20811m2 = new C20811m(bArr10);
                                                        c20811m2.m21344F(9);
                                                        int iM21365t8 = c20811m2.m21365t();
                                                        c20811m2.m21344F(20);
                                                        Pair pairCreate = Pair.create(Integer.valueOf(c20811m2.m21369x()), Integer.valueOf(iM21365t8));
                                                        int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                                        iIntValue = ((Integer) pairCreate.second).intValue();
                                                        iM21366u = iIntValue2;
                                                        listM12695y2 = AbstractC11278C.m12695y(bArr10);
                                                    } else {
                                                        iM21366u = i73;
                                                    }
                                                    str17 = str6;
                                                    str5 = str9;
                                                }
                                                str17 = str6;
                                                str5 = str9;
                                                iM21366u = i73;
                                                iM21352g = iM21352g;
                                            }
                                            listM12695y2 = list;
                                            str17 = str6;
                                            str5 = str9;
                                        }
                                    }
                                    listM12695y2 = list;
                                    str17 = str6;
                                    str5 = str9;
                                }
                            }
                            if (iM21352g10 != i67) {
                                i29 = c20811m.f66093b;
                                AbstractC6320b.m6887c(null, i29 >= i64);
                                while (true) {
                                    if (i29 - i64 >= iM21352g9) {
                                        str5 = str9;
                                        i29 = -1;
                                        break;
                                    }
                                    c20811m.m21344F(i29);
                                    int iM21352g11 = c20811m.m21352g();
                                    str5 = str9;
                                    AbstractC6320b.m6887c(str5, iM21352g11 > 0);
                                    if (c20811m.m21352g() == 1702061171) {
                                        break;
                                    }
                                    i29 += iM21352g11;
                                    str9 = str5;
                                }
                            } else {
                                i29 = i64;
                                str5 = str9;
                            }
                            if (i29 != -1) {
                                C1497j c1497jM17656a2 = m17656a(i29, c20811m);
                                str16 = (String) c1497jM17656a2.f3972o0;
                                byte[] bArr11 = (byte[]) c1497jM17656a2.f3973p0;
                                if (bArr11 != null) {
                                    if ("audio/vorbis".equals(str16)) {
                                        C20811m c20811m3 = new C20811m(bArr11);
                                        c20811m3.m21345G(1);
                                        int i77 = 0;
                                        while (true) {
                                            if (c20811m3.m21346a() <= 0) {
                                                c1497j = c1497jM17656a2;
                                                break;
                                            }
                                            c1497j = c1497jM17656a2;
                                            if ((c20811m3.f66092a[c20811m3.f66093b] & 255) != 255) {
                                                break;
                                            }
                                            i77 += 255;
                                            c20811m3.m21345G(1);
                                            c1497jM17656a2 = c1497j;
                                        }
                                        int iM21365t9 = c20811m3.m21365t() + i77;
                                        int i78 = 0;
                                        while (true) {
                                            if (c20811m3.m21346a() <= 0) {
                                                iM21352g = iM21352g;
                                                break;
                                            }
                                            iM21352g = iM21352g;
                                            if ((c20811m3.f66092a[c20811m3.f66093b] & 255) != 255) {
                                                break;
                                            }
                                            i78 += 255;
                                            c20811m3.m21345G(1);
                                            iM21352g = iM21352g;
                                        }
                                        int iM21365t10 = c20811m3.m21365t() + i78;
                                        byte[] bArr12 = new byte[iM21365t9];
                                        int i79 = c20811m3.f66093b;
                                        System.arraycopy(bArr11, i79, bArr12, 0, iM21365t9);
                                        int i80 = i79 + iM21365t9 + iM21365t10;
                                        int length = bArr11.length - i80;
                                        byte[] bArr13 = new byte[length];
                                        System.arraycopy(bArr11, i80, bArr13, 0, length);
                                        listM12695y2 = AbstractC11278C.m12696z(bArr12, bArr13);
                                    } else {
                                        c1497j = c1497jM17656a2;
                                        iM21352g = iM21352g;
                                        if ("audio/mp4a-latm".equals(str16)) {
                                            C6319a c6319aM6898n = AbstractC6320b.m6898n(new C6318J(bArr11.length, bArr11), false);
                                            iM21366u = c6319aM6898n.f20470b;
                                            iIntValue = c6319aM6898n.f20471c;
                                            str17 = c6319aM6898n.f20469a;
                                        } else {
                                            str17 = str17;
                                        }
                                        listM12695y2 = AbstractC11278C.m12695y(bArr11);
                                    }
                                    c1497j4 = c1497j;
                                } else {
                                    c1497j = c1497jM17656a2;
                                    iM21352g = iM21352g;
                                    listM12695y2 = listM12695y2;
                                }
                                str17 = str17;
                                c1497j4 = c1497j;
                            } else {
                                iM21352g = iM21352g;
                                listM12695y2 = listM12695y2;
                                str17 = str17;
                            }
                        }
                        i64 += iM21352g9;
                        str9 = str5;
                        iM21352g3 = i65;
                        i33 = i66;
                        str15 = str15;
                        iM21352g = iM21352g;
                    }
                    str5 = str9;
                    iM21352g = iM21352g;
                    i64 += iM21352g9;
                    str9 = str5;
                    iM21352g3 = i65;
                    i33 = i66;
                    str15 = str15;
                    iM21352g = iM21352g;
                }
                List list3 = listM12695y2;
                i27 = i33;
                String str18 = str17;
                i28 = iM21352g3;
                if (((C19788o) c4312o.f14019e) == null && str16 != null) {
                    C19787n c19787n6 = new C19787n();
                    c19787n6.f62703a = Integer.toString(i10);
                    c19787n6.f62714l = AbstractC19754D.m20711i(str16);
                    c19787n6.f62711i = str18;
                    c19787n6.f62728z = iIntValue;
                    c19787n6.f62694A = iM21366u;
                    c19787n6.f62695B = i63;
                    c19787n6.f62717o = list3;
                    c19787n6.f62718p = c19785l2;
                    c19787n6.f62706d = str;
                    C1497j c1497j5 = c1497j4;
                    if (c1497j5 != null) {
                        c19787n6.f62709g = AbstractC8135l5.m8658i(c1497j5.f3970Y);
                        c19787n6.f62710h = AbstractC8135l5.m8658i(c1497j5.f3971Z);
                    }
                    c4312o.f14019e = new C19788o(c19787n6);
                }
                c4312o = c4312o;
                iM21352g3 = i28;
                i33 = i27;
            } else if (iM21352g4 == 1414810956 || iM21352g4 == 1954034535 || iM21352g4 == 2004251764 || iM21352g4 == 1937010800 || iM21352g4 == 1664495672) {
                c20811m.m21344F(i33 + 16);
                String str19 = "application/ttml+xml";
                long j11 = Long.MAX_VALUE;
                if (iM21352g4 == 1414810956) {
                    j10 = Long.MAX_VALUE;
                    c11294tM12695y = null;
                    c9 = 13159;
                } else {
                    c9 = 13159;
                    if (iM21352g4 == 1954034535) {
                        int i81 = iM21352g3 - 16;
                        byte[] bArr14 = new byte[i81];
                        c20811m.m21350e(bArr14, 0, i81);
                        str19 = "application/x-quicktime-tx3g";
                        c11294tM12695y = AbstractC11278C.m12695y(bArr14);
                        j10 = Long.MAX_VALUE;
                    } else {
                        if (iM21352g4 == 2004251764) {
                            str19 = "application/x-mp4-vtt";
                        } else {
                            if (iM21352g4 == 1937010800) {
                                j11 = 0;
                            } else {
                                c10 = 12344;
                                if (iM21352g4 != 1664495672) {
                                    throw new IllegalStateException();
                                }
                                c4312o.f14017c = 1;
                                j10 = Long.MAX_VALUE;
                                str8 = "application/x-mp4-cea-608";
                                c11294tM12695y = null;
                            }
                            C19787n c19787n7 = new C19787n();
                            c19787n7.f62703a = Integer.toString(i10);
                            c19787n7.f62714l = AbstractC19754D.m20711i(str8);
                            c19787n7.f62706d = str;
                            c19787n7.f62719q = j10;
                            c19787n7.f62717o = c11294tM12695y;
                            c4312o.f14019e = new C19788o(c19787n7);
                        }
                        j10 = j11;
                        c11294tM12695y = null;
                    }
                }
                str8 = str19;
                c10 = 12344;
                C19787n c19787n8 = new C19787n();
                c19787n8.f62703a = Integer.toString(i10);
                c19787n8.f62714l = AbstractC19754D.m20711i(str8);
                c19787n8.f62706d = str;
                c19787n8.f62719q = j10;
                c19787n8.f62717o = c11294tM12695y;
                c4312o.f14019e = new C19788o(c19787n8);
            } else if (iM21352g4 == 1835365492) {
                c20811m.m21344F(i33 + 16);
                if (iM21352g4 == 1835365492) {
                    c20811m.m21360o();
                    String strM21360o = c20811m.m21360o();
                    if (strM21360o != null) {
                        C19787n c19787n9 = new C19787n();
                        c19787n9.f62703a = Integer.toString(i10);
                        c19787n9.f62714l = AbstractC19754D.m20711i(strM21360o);
                        c4312o.f14019e = new C19788o(c19787n9);
                    }
                }
            } else if (iM21352g4 == 1667329389) {
                C19787n c19787n10 = new C19787n();
                c19787n10.f62703a = Integer.toString(i10);
                c19787n10.f62714l = AbstractC19754D.m20711i("application/x-camera-motion");
                c4312o.f14019e = new C19788o(c19787n10);
            }
            c20811m.m21344F(i33 + iM21352g3);
            c4312o = c4312o;
            i32++;
            iM21352g2 = iM21352g2;
        }
        return c4312o;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0273  */
    /* JADX WARN: Code duplicated, block: B:124:0x0283  */
    /* JADX WARN: Code duplicated, block: B:125:0x0285  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:193:0x048e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0492  */
    /* JADX WARN: Code duplicated, block: B:197:0x0498 A[LOOP:11: B:194:0x0490->B:197:0x0498, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x04d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x04d3 A[ADDED_TO_REGION, LOOP:12: B:203:0x04d3->B:205:0x04d7, LOOP_START, PHI: r16 r41 r42
      0x04d3: PHI (r16v9 int) = (r16v6 int), (r16v10 int) binds: [B:202:0x04d1, B:205:0x04d7] A[DONT_GENERATE, DONT_INLINE]
      0x04d3: PHI (r41v4 int) = (r41v1 int), (r41v5 int) binds: [B:202:0x04d1, B:205:0x04d7] A[DONT_GENERATE, DONT_INLINE]
      0x04d3: PHI (r42v3 int) = (r42v1 int), (r42v5 int) binds: [B:202:0x04d1, B:205:0x04d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:204:0x04d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:212:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:213:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:216:0x0501  */
    /* JADX WARN: Code duplicated, block: B:218:0x0508  */
    /* JADX WARN: Code duplicated, block: B:220:0x051d  */
    /* JADX WARN: Code duplicated, block: B:223:0x0526 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x055e  */
    /* JADX WARN: Code duplicated, block: B:231:0x0562  */
    /* JADX WARN: Code duplicated, block: B:234:0x056b A[LOOP:13: B:230:0x0560->B:234:0x056b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x0571 A[EDGE_INSN: B:235:0x0571->B:236:0x0573 BREAK  A[LOOP:13: B:230:0x0560->B:234:0x056b]] */
    /* JADX WARN: Code duplicated, block: B:237:0x0575 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:245:0x0585  */
    /* JADX WARN: Code duplicated, block: B:248:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:249:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:254:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:255:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:281:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:284:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:286:0x06de  */
    /* JADX WARN: Code duplicated, block: B:289:0x06e7 A[LOOP:5: B:287:0x06e4->B:289:0x06e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:292:0x071c  */
    /* JADX WARN: Code duplicated, block: B:293:0x0720  */
    /* JADX WARN: Code duplicated, block: B:295:0x0726  */
    /* JADX WARN: Code duplicated, block: B:296:0x0728  */
    /* JADX WARN: Code duplicated, block: B:300:0x0739  */
    /* JADX WARN: Code duplicated, block: B:302:0x0741  */
    /* JADX WARN: Code duplicated, block: B:305:0x0767  */
    /* JADX WARN: Code duplicated, block: B:310:0x0776  */
    /* JADX WARN: Code duplicated, block: B:311:0x0778  */
    /* JADX WARN: Code duplicated, block: B:314:0x077f  */
    /* JADX WARN: Code duplicated, block: B:318:0x078d  */
    /* JADX WARN: Code duplicated, block: B:319:0x078f  */
    /* JADX WARN: Code duplicated, block: B:322:0x0793  */
    /* JADX WARN: Code duplicated, block: B:323:0x0797  */
    /* JADX WARN: Code duplicated, block: B:325:0x079b  */
    /* JADX WARN: Code duplicated, block: B:326:0x079f  */
    /* JADX WARN: Code duplicated, block: B:328:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:330:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:331:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:335:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:337:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:338:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:341:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:343:0x0816  */
    /* JADX WARN: Code duplicated, block: B:344:0x0818  */
    /* JADX WARN: Code duplicated, block: B:347:0x081d  */
    /* JADX WARN: Code duplicated, block: B:348:0x0824  */
    /* JADX WARN: Code duplicated, block: B:351:0x082b  */
    /* JADX WARN: Code duplicated, block: B:366:0x08aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x0771 A[ADDED_TO_REGION, EDGE_INSN: B:375:0x0771->B:308:0x0771 BREAK  A[LOOP:7: B:303:0x0761->B:307:0x076c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0832 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x04b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0533 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x04ad A[EDGE_INSN: B:388:0x04ad->B:198:0x04ad BREAK  A[LOOP:11: B:194:0x0490->B:197:0x0498], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0571 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0568 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0130  */
    /* JADX WARN: Code duplicated, block: B:79:0x0133  */
    /* JADX WARN: Code duplicated, block: B:82:0x0141  */
    /* JADX WARN: Code duplicated, block: B:84:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x0184  */
    /* JADX WARN: Code duplicated, block: B:91:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0191  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static ArrayList m17661f(C16105a c16105a, C6341w c6341w, long j10, C19785l c19785l, boolean z6, boolean z10, InterfaceC10532e interfaceC10532e) {
        byte b;
        int i10;
        long jM21367v;
        int i11;
        int i12;
        long j11;
        long j12;
        long jM21396J;
        int iM1822m;
        int i13;
        int i14;
        Pair pairCreate;
        C16106b c16106bM17654o;
        C4312o c4312oM17660e;
        long j13;
        long[] jArr;
        long[] jArr2;
        C16120p c16120p;
        C16105a c16105aM17653n;
        Pair pairCreate2;
        InterfaceC16108d c6061j;
        boolean z11;
        int iM21369x;
        int iM21369x2;
        int iM21369x3;
        int iMo6627a;
        int i15;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int iM21369x4;
        int i16;
        int i17;
        long j14;
        long j15;
        int iM21352g;
        int iM21369x5;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        long j16;
        boolean z12;
        int i23;
        C16120p c16120p2;
        String str;
        int[] iArr;
        int i24;
        long[] jArr3;
        int[] iArr2;
        int i25;
        boolean zM17655a;
        int i26;
        int iM21352g2;
        int iMo6631e;
        int i27;
        int iM21369x6;
        long jM21396J2;
        long j17;
        long[] jArr4;
        int length;
        int i28;
        long[] jArr5;
        long[] jArr6;
        int[] iArr3;
        int i29;
        int i30;
        long[] jArr7;
        long[] jArr8;
        long j18;
        int[] iArr4;
        int i31;
        boolean z13;
        boolean z14;
        int[] iArr5;
        int[] iArr6;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        long[] jArr9;
        int[] iArr7;
        int[] iArr8;
        long[] jArr10;
        int i39;
        int i40;
        int i41;
        long j19;
        C16123s c16123s;
        long j20;
        int i42;
        int i43;
        int[] iArr9;
        int[] iArr10;
        long jM21396J3;
        int i44;
        boolean z15;
        long j21;
        int i45;
        int i46;
        int i47;
        int i48;
        C16123s c16123s2;
        long j22;
        int i49;
        ArrayList arrayList;
        byte b10 = -1;
        ArrayList arrayList2 = new ArrayList();
        int i50 = 0;
        while (true) {
            ArrayList arrayList3 = c16105a.f49885q0;
            if (i50 >= arrayList3.size()) {
                return arrayList2;
            }
            C16105a c16105a2 = (C16105a) arrayList3.get(i50);
            if (c16105a2.f2213Z != 1953653099) {
                arrayList = arrayList2;
                i10 = i50;
            } else {
                C16106b c16106bM17654o2 = c16105a.m17654o(1836476516);
                c16106bM17654o2.getClass();
                C16105a c16105aM17653n2 = c16105a2.m17653n(1835297121);
                c16105aM17653n2.getClass();
                C16106b c16106bM17654o3 = c16105aM17653n2.m17654o(1751411826);
                c16106bM17654o3.getClass();
                C20811m c20811m = c16106bM17654o3.f49886o0;
                c20811m.m21344F(16);
                int iM21352g3 = c20811m.m21352g();
                if (iM21352g3 == 1936684398) {
                    b = 1;
                } else if (iM21352g3 == 1986618469) {
                    b = 2;
                } else if (iM21352g3 == 1952807028 || iM21352g3 == 1935832172 || iM21352g3 == 1937072756 || iM21352g3 == 1668047728) {
                    b = 3;
                } else {
                    b = iM21352g3 == 1835365473 ? (byte) 5 : b10;
                }
                String str2 = "";
                i10 = i50;
                if (b == b10) {
                    arrayList2 = arrayList2;
                    str2 = "";
                    c16120p = null;
                } else {
                    C16106b c16106bM17654o4 = c16105a2.m17654o(1953196132);
                    c16106bM17654o4.getClass();
                    C20811m c20811m2 = c16106bM17654o4.f49886o0;
                    c20811m2.m21344F(8);
                    int iM1822m2 = AbstractC0797a.m1822m(c20811m2.m21352g());
                    c20811m2.m21345G(iM1822m2 != 0 ? 16 : 8);
                    int iM21352g4 = c20811m2.m21352g();
                    c20811m2.m21345G(4);
                    int i51 = c20811m2.f66093b;
                    int i52 = iM1822m2 == 0 ? 4 : 8;
                    int i53 = 0;
                    while (true) {
                        if (i53 >= i52) {
                            c20811m2.m21345G(i52);
                        } else {
                            if (c20811m2.f66092a[i51 + i53] != b10) {
                                jM21367v = iM1822m2 == 0 ? c20811m2.m21367v() : c20811m2.m21370y();
                                if (jM21367v != 0) {
                                    break;
                                }
                                break;
                            }
                            i53++;
                        }
                        jM21367v = -9223372036854775807L;
                        break;
                    }
                    c20811m2.m21345G(16);
                    int iM21352g5 = c20811m2.m21352g();
                    int iM21352g6 = c20811m2.m21352g();
                    c20811m2.m21345G(4);
                    int iM21352g7 = c20811m2.m21352g();
                    int iM21352g8 = c20811m2.m21352g();
                    if (iM21352g5 == 0 && iM21352g6 == 65536) {
                        i11 = -65536;
                        if (iM21352g7 == -65536 && iM21352g8 == 0) {
                            i12 = 90;
                        }
                        if (j10 == -9223372036854775807L) {
                            j11 = jM21367v;
                        } else {
                            j11 = j10;
                        }
                        j12 = m17658c(c16106bM17654o2.f49886o0).f67077o0;
                        if (j11 == -9223372036854775807L) {
                            jM21396J = -9223372036854775807L;
                        } else {
                            int i54 = AbstractC20817s.f66106a;
                            jM21396J = AbstractC20817s.m21396J(j11, 1000000L, j12, RoundingMode.FLOOR);
                        }
                        C16105a c16105aM17653n3 = c16105aM17653n2.m17653n(1835626086);
                        c16105aM17653n3.getClass();
                        C16105a c16105aM17653n4 = c16105aM17653n3.m17653n(1937007212);
                        c16105aM17653n4.getClass();
                        C16106b c16106bM17654o5 = c16105aM17653n2.m17654o(1835296868);
                        c16106bM17654o5.getClass();
                        C20811m c20811m3 = c16106bM17654o5.f49886o0;
                        c20811m3.m21344F(8);
                        iM1822m = AbstractC0797a.m1822m(c20811m3.m21352g());
                        if (iM1822m == 0) {
                            i13 = 8;
                        } else {
                            i13 = 16;
                        }
                        c20811m3.m21345G(i13);
                        long jM21367v2 = c20811m3.m21367v();
                        if (iM1822m == 0) {
                            i14 = 4;
                        } else {
                            i14 = 8;
                        }
                        c20811m3.m21345G(i14);
                        int iM21371z = c20811m3.m21371z();
                        pairCreate = Pair.create(Long.valueOf(jM21367v2), "" + ((char) (((iM21371z >> 10) & 31) + 96)) + ((char) (((iM21371z >> 5) & 31) + 96)) + ((char) ((iM21371z & 31) + 96)));
                        c16106bM17654o = c16105aM17653n4.m17654o(1937011556);
                        if (c16106bM17654o != null) {
                            throw C19755E.m20712a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                        }
                        c4312oM17660e = m17660e(c16106bM17654o.f49886o0, iM21352g4, i12, (String) pairCreate.second, c19785l, z10);
                        if (!z6 || (c16105aM17653n = c16105a2.m17653n(1701082227)) == null) {
                            j13 = jM21396J;
                            arrayList2 = arrayList2;
                            str2 = "";
                        } else {
                            C16106b c16106bM17654o6 = c16105aM17653n.m17654o(1701606260);
                            if (c16106bM17654o6 == null) {
                                j13 = jM21396J;
                                pairCreate2 = null;
                            } else {
                                C20811m c20811m4 = c16106bM17654o6.f49886o0;
                                c20811m4.m21344F(8);
                                int iM1822m3 = AbstractC0797a.m1822m(c20811m4.m21352g());
                                int iM21369x7 = c20811m4.m21369x();
                                long[] jArr11 = new long[iM21369x7];
                                long[] jArr12 = new long[iM21369x7];
                                int i55 = 0;
                                while (i55 < iM21369x7) {
                                    int i56 = iM21369x7;
                                    jArr11[i55] = iM1822m3 == 1 ? c20811m4.m21370y() : c20811m4.m21367v();
                                    jArr12[i55] = iM1822m3 == 1 ? c20811m4.m21359n() : c20811m4.m21352g();
                                    if (c20811m4.m21362q() != 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    c20811m4.m21345G(2);
                                    i55++;
                                    iM21369x7 = i56;
                                    jM21396J = jM21396J;
                                }
                                j13 = jM21396J;
                                pairCreate2 = Pair.create(jArr11, jArr12);
                            }
                            if (pairCreate2 != null) {
                                long[] jArr13 = (long[]) pairCreate2.first;
                                jArr2 = (long[]) pairCreate2.second;
                                jArr = jArr13;
                            }
                            if (((C19788o) c4312oM17660e.f14019e) == null) {
                                c16120p = null;
                            } else {
                                c16120p = new C16120p(iM21352g4, b, ((Long) pairCreate.first).longValue(), j12, j13, (C19788o) c4312oM17660e.f14019e, c4312oM17660e.f14017c, (C16121q[]) c4312oM17660e.f14018d, c4312oM17660e.f14016b, jArr, jArr2);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (((C19788o) c4312oM17660e.f14019e) == null) {
                            c16120p = null;
                        } else {
                            c16120p = new C16120p(iM21352g4, b, ((Long) pairCreate.first).longValue(), j12, j13, (C19788o) c4312oM17660e.f14019e, c4312oM17660e.f14017c, (C16121q[]) c4312oM17660e.f14018d, c4312oM17660e.f14016b, jArr, jArr2);
                        }
                    } else {
                        i11 = -65536;
                    }
                    if (iM21352g5 == 0 && iM21352g6 == i11) {
                        if (iM21352g7 == 65536 && iM21352g8 == 0) {
                            i12 = 270;
                        } else {
                            i11 = -65536;
                            if (iM21352g5 != i11) {
                                i12 = 0;
                            } else {
                                i12 = 0;
                            }
                        }
                    } else if (iM21352g5 != i11 && iM21352g6 == 0 && iM21352g7 == 0 && iM21352g8 == i11) {
                        i12 = 180;
                    } else {
                        i12 = 0;
                    }
                    if (j10 == -9223372036854775807L) {
                        j11 = jM21367v;
                    } else {
                        j11 = j10;
                    }
                    j12 = m17658c(c16106bM17654o2.f49886o0).f67077o0;
                    if (j11 == -9223372036854775807L) {
                        jM21396J = -9223372036854775807L;
                    } else {
                        int i57 = AbstractC20817s.f66106a;
                        jM21396J = AbstractC20817s.m21396J(j11, 1000000L, j12, RoundingMode.FLOOR);
                    }
                    C16105a c16105aM17653n5 = c16105aM17653n2.m17653n(1835626086);
                    c16105aM17653n5.getClass();
                    C16105a c16105aM17653n6 = c16105aM17653n5.m17653n(1937007212);
                    c16105aM17653n6.getClass();
                    C16106b c16106bM17654o7 = c16105aM17653n2.m17654o(1835296868);
                    c16106bM17654o7.getClass();
                    C20811m c20811m5 = c16106bM17654o7.f49886o0;
                    c20811m5.m21344F(8);
                    iM1822m = AbstractC0797a.m1822m(c20811m5.m21352g());
                    if (iM1822m == 0) {
                        i13 = 8;
                    } else {
                        i13 = 16;
                    }
                    c20811m5.m21345G(i13);
                    long jM21367v3 = c20811m5.m21367v();
                    if (iM1822m == 0) {
                        i14 = 4;
                    } else {
                        i14 = 8;
                    }
                    c20811m5.m21345G(i14);
                    int iM21371z2 = c20811m5.m21371z();
                    pairCreate = Pair.create(Long.valueOf(jM21367v3), "" + ((char) (((iM21371z2 >> 10) & 31) + 96)) + ((char) (((iM21371z2 >> 5) & 31) + 96)) + ((char) ((iM21371z2 & 31) + 96)));
                    c16106bM17654o = c16105aM17653n6.m17654o(1937011556);
                    if (c16106bM17654o != null) {
                        throw C19755E.m20712a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                    }
                    c4312oM17660e = m17660e(c16106bM17654o.f49886o0, iM21352g4, i12, (String) pairCreate.second, c19785l, z10);
                    if (z6) {
                        j13 = jM21396J;
                        arrayList2 = arrayList2;
                        str2 = "";
                        jArr = null;
                        jArr2 = null;
                    } else {
                        j13 = jM21396J;
                        arrayList2 = arrayList2;
                        str2 = "";
                        jArr = null;
                        jArr2 = null;
                    }
                    if (((C19788o) c4312oM17660e.f14019e) == null) {
                        c16120p = null;
                    } else {
                        c16120p = new C16120p(iM21352g4, b, ((Long) pairCreate.first).longValue(), j12, j13, (C19788o) c4312oM17660e.f14019e, c4312oM17660e.f14017c, (C16121q[]) c4312oM17660e.f14018d, c4312oM17660e.f14016b, jArr, jArr2);
                    }
                }
                C16120p c16120p3 = (C16120p) interfaceC10532e.mo22421apply(c16120p);
                if (c16120p3 == null) {
                    arrayList = arrayList2;
                } else {
                    C16105a c16105aM17653n7 = c16105a2.m17653n(1835297121);
                    c16105aM17653n7.getClass();
                    C16105a c16105aM17653n8 = c16105aM17653n7.m17653n(1835626086);
                    c16105aM17653n8.getClass();
                    C16105a c16105aM17653n9 = c16105aM17653n8.m17653n(1937007212);
                    c16105aM17653n9.getClass();
                    C16106b c16106bM17654o8 = c16105aM17653n9.m17654o(1937011578);
                    C19788o c19788o = c16120p3.f49999f;
                    if (c16106bM17654o8 != null) {
                        c6061j = new C11500p(c16106bM17654o8, c19788o);
                    } else {
                        C16106b c16106bM17654o9 = c16105aM17653n9.m17654o(1937013298);
                        if (c16106bM17654o9 == null) {
                            throw C19755E.m20712a(null, "Track has no sample table size information");
                        }
                        c6061j = new C6061j(c16106bM17654o9);
                    }
                    int iMo6628b = c6061j.mo6628b();
                    if (iMo6628b == 0) {
                        c16123s2 = new C16123s(c16120p3, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    } else {
                        C16106b c16106bM17654o10 = c16105aM17653n9.m17654o(1937007471);
                        if (c16106bM17654o10 == null) {
                            c16106bM17654o10 = c16105aM17653n9.m17654o(1668232756);
                            c16106bM17654o10.getClass();
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        C16106b c16106bM17654o11 = c16105aM17653n9.m17654o(1937011555);
                        c16106bM17654o11.getClass();
                        C16106b c16106bM17654o12 = c16105aM17653n9.m17654o(1937011827);
                        c16106bM17654o12.getClass();
                        C16106b c16106bM17654o13 = c16105aM17653n9.m17654o(1937011571);
                        C20811m c20811m6 = c16106bM17654o13 != null ? c16106bM17654o13.f49886o0 : null;
                        C16106b c16106bM17654o14 = c16105aM17653n9.m17654o(1668576371);
                        C20811m c20811m7 = c16106bM17654o14 != null ? c16106bM17654o14.f49886o0 : null;
                        C16107c c16107c = new C16107c(c16106bM17654o11.f49886o0, c16106bM17654o10.f49886o0, z11);
                        C20811m c20811m8 = c16106bM17654o12.f49886o0;
                        c20811m8.m21344F(12);
                        int iM21369x8 = c20811m8.m21369x() - 1;
                        int iM21369x9 = c20811m8.m21369x();
                        int iM21369x10 = c20811m8.m21369x();
                        if (c20811m7 != null) {
                            c20811m7.m21344F(12);
                            iM21369x = c20811m7.m21369x();
                        } else {
                            iM21369x = 0;
                        }
                        if (c20811m6 != null) {
                            c20811m6.m21344F(12);
                            iM21369x2 = c20811m6.m21369x();
                            if (iM21369x2 > 0) {
                                iM21369x3 = c20811m6.m21369x() - 1;
                            } else {
                                c20811m6 = null;
                            }
                            iMo6627a = c6061j.mo6627a();
                            String str3 = c19788o.f62752m;
                            i15 = iM21369x3;
                            if (iMo6627a == -1 && (("audio/raw".equals(str3) || "audio/g711-mlaw".equals(str3) || "audio/g711-alaw".equals(str3)) && iM21369x8 == 0 && iM21369x == 0 && iM21369x2 == 0)) {
                                int i58 = c16107c.f49887a;
                                long[] jArr14 = new long[i58];
                                int[] iArr11 = new int[i58];
                                while (c16107c.m17655a()) {
                                    int i59 = c16107c.f49888b;
                                    jArr14[i59] = c16107c.f49890d;
                                    iArr11[i59] = c16107c.f49889c;
                                }
                                long j23 = iM21369x10;
                                int i60 = 8192 / iMo6627a;
                                int iM21405f = 0;
                                for (int i61 = 0; i61 < i58; i61++) {
                                    iM21405f += AbstractC20817s.m21405f(iArr11[i61], i60);
                                }
                                long[] jArr15 = new long[iM21405f];
                                iArr = new int[iM21405f];
                                jArr3 = new long[iM21405f];
                                int[] iArr12 = new int[iM21405f];
                                int i62 = 0;
                                int i63 = 0;
                                i24 = 0;
                                int i64 = 0;
                                while (i63 < i58) {
                                    int i65 = iArr11[i63];
                                    long j24 = jArr14[i63];
                                    int i66 = i64;
                                    int i67 = i58;
                                    int iMax = i24;
                                    int i68 = i66;
                                    long[] jArr16 = jArr14;
                                    int i69 = i65;
                                    while (i69 > 0) {
                                        int iMin = Math.min(i60, i69);
                                        jArr15[i68] = j24;
                                        int[] iArr13 = iArr11;
                                        int i70 = iMo6627a * iMin;
                                        iArr[i68] = i70;
                                        iMax = Math.max(iMax, i70);
                                        jArr3[i68] = ((long) i62) * j23;
                                        iArr12[i68] = 1;
                                        j24 += (long) iArr[i68];
                                        i62 += iMin;
                                        i69 -= iMin;
                                        i68++;
                                        i60 = i60;
                                        iArr11 = iArr13;
                                        c16120p3 = c16120p3;
                                    }
                                    i63++;
                                    i60 = i60;
                                    jArr14 = jArr16;
                                    iArr11 = iArr11;
                                    int i71 = i68;
                                    i24 = iMax;
                                    i58 = i67;
                                    i64 = i71;
                                }
                                long j25 = j23 * ((long) i62);
                                jArrCopyOf = jArr15;
                                iArr2 = iArr12;
                                c16120p2 = c16120p3;
                                j16 = j25;
                            } else {
                                jArrCopyOf = new long[iMo6628b];
                                iArrCopyOf = new int[iMo6628b];
                                jArrCopyOf2 = new long[iMo6628b];
                                iArrCopyOf2 = new int[iMo6628b];
                                int i72 = iM21369x8;
                                iM21369x4 = i15;
                                i16 = 0;
                                i17 = 0;
                                j14 = 0;
                                j15 = 0;
                                iM21352g = 0;
                                iM21369x5 = 0;
                                i18 = 0;
                                int i73 = iM21369x;
                                i19 = iM21369x10;
                                i20 = iM21369x9;
                                i21 = i73;
                                while (true) {
                                    if (i18 >= iMo6628b) {
                                        i22 = i20;
                                        break;
                                    }
                                    zM17655a = true;
                                    while (i17 == 0) {
                                        zM17655a = c16107c.m17655a();
                                        if (!zM17655a) {
                                            break;
                                        }
                                        int i74 = i20;
                                        long j26 = c16107c.f49890d;
                                        i17 = c16107c.f49889c;
                                        j15 = j26;
                                        i20 = i74;
                                        i19 = i19;
                                        iMo6628b = iMo6628b;
                                    }
                                    i26 = iMo6628b;
                                    i22 = i20;
                                    iM21352g2 = i19;
                                    if (!zM17655a) {
                                        AbstractC20800b.m21332t("AtomParsers", "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i18);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i18);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i18);
                                        iMo6628b = i18;
                                        break;
                                    }
                                    if (c20811m7 != null) {
                                        while (iM21369x5 == 0 && i21 > 0) {
                                            iM21369x5 = c20811m7.m21369x();
                                            iM21352g = c20811m7.m21352g();
                                            i21--;
                                        }
                                        iM21369x5--;
                                    }
                                    int i75 = iM21352g;
                                    jArrCopyOf[i18] = j15;
                                    iMo6631e = c6061j.mo6631e();
                                    iArrCopyOf[i18] = iMo6631e;
                                    if (iMo6631e > i16) {
                                        i16 = iMo6631e;
                                    }
                                    jArrCopyOf2[i18] = j14 + ((long) i75);
                                    if (c20811m6 == null) {
                                        i27 = 1;
                                    } else {
                                        i27 = 0;
                                    }
                                    iArrCopyOf2[i18] = i27;
                                    if (i18 == iM21369x4) {
                                        iArrCopyOf2[i18] = 1;
                                        iM21369x2--;
                                        if (iM21369x2 > 0) {
                                            c20811m6.getClass();
                                            iM21369x4 = c20811m6.m21369x() - 1;
                                        }
                                        j14 += (long) iM21352g2;
                                        iM21369x6 = i22 - 1;
                                        if (iM21369x6 != 0 && i72 > 0) {
                                            iM21369x6 = c20811m8.m21369x();
                                            i72--;
                                            iM21352g2 = c20811m8.m21352g();
                                        }
                                        j15 += (long) iArrCopyOf[i18];
                                        i17--;
                                        i18++;
                                        iM21352g = i75;
                                        i20 = iM21369x6;
                                        c6061j = c6061j;
                                        i16 = i16;
                                        jArrCopyOf = jArrCopyOf;
                                        iMo6628b = i26;
                                        iArrCopyOf = iArrCopyOf;
                                        i19 = iM21352g2;
                                    }
                                    j14 += (long) iM21352g2;
                                    iM21369x6 = i22 - 1;
                                    if (iM21369x6 != 0) {
                                    }
                                    j15 += (long) iArrCopyOf[i18];
                                    i17--;
                                    i18++;
                                    iM21352g = i75;
                                    i20 = iM21369x6;
                                    c6061j = c6061j;
                                    i16 = i16;
                                    jArrCopyOf = jArrCopyOf;
                                    iMo6628b = i26;
                                    iArrCopyOf = iArrCopyOf;
                                    i19 = iM21352g2;
                                }
                                int i76 = i17;
                                j16 = j14 + ((long) iM21352g);
                                if (c20811m7 == null) {
                                    z12 = true;
                                    break;
                                }
                                i25 = i21;
                                while (true) {
                                    if (i25 <= 0) {
                                        z12 = true;
                                        break;
                                    }
                                    if (c20811m7.m21369x() != 0) {
                                        z12 = false;
                                        break;
                                    }
                                    c20811m7.m21352g();
                                    i25--;
                                }
                                if (iM21369x2 != 0 && i22 == 0 && i76 == 0 && i72 == 0) {
                                    i23 = iM21369x5;
                                    if (i23 == 0 && z12) {
                                        c16120p2 = c16120p3;
                                    }
                                    iArr = iArrCopyOf;
                                    i24 = i16;
                                    jArr3 = jArrCopyOf2;
                                    iArr2 = iArrCopyOf2;
                                } else {
                                    i23 = iM21369x5;
                                }
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                c16120p2 = c16120p3;
                                sb2.append(c16120p2.f49994a);
                                sb2.append(": remainingSynchronizationSamples ");
                                sb2.append(iM21369x2);
                                sb2.append(", remainingSamplesAtTimestampDelta ");
                                sb2.append(i22);
                                sb2.append(YladLSetV.OUufyfAKSvbdN);
                                sb2.append(i76);
                                sb2.append(", remainingTimestampDeltaChanges ");
                                sb2.append(i72);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(i23);
                                if (z12) {
                                    str = str2;
                                } else {
                                    str = ", ctts invalid";
                                }
                                sb2.append(str);
                                AbstractC20800b.m21332t("AtomParsers", sb2.toString());
                                iArr = iArrCopyOf;
                                i24 = i16;
                                jArr3 = jArrCopyOf2;
                                iArr2 = iArrCopyOf2;
                            }
                            RoundingMode roundingMode = RoundingMode.FLOOR;
                            jM21396J2 = AbstractC20817s.m21396J(j16, 1000000L, c16120p2.f49996c, roundingMode);
                            j17 = c16120p2.f49996c;
                            jArr4 = c16120p2.f50001h;
                            if (jArr4 == null) {
                                AbstractC20817s.m21395I(jArr3, j17);
                                c16123s2 = new C16123s(c16120p2, jArrCopyOf, iArr, i24, jArr3, iArr2, jM21396J2);
                            } else {
                                length = jArr4.length;
                                i28 = c16120p2.f49995b;
                                jArr5 = c16120p2.f50002i;
                                if (length == 1 || i28 != 1 || jArr3.length < 2) {
                                    jArr6 = jArrCopyOf;
                                    iArr3 = iArr2;
                                    i29 = iMo6628b;
                                    i30 = i28;
                                    jArr7 = jArr5;
                                    jArr8 = jArr4;
                                } else {
                                    jArr5.getClass();
                                    long j27 = jArr5[0];
                                    i29 = iMo6628b;
                                    jArr7 = jArr5;
                                    jArr6 = jArrCopyOf;
                                    iArr3 = iArr2;
                                    i30 = i28;
                                    jArr8 = jArr4;
                                    long jM21396J4 = j27 + AbstractC20817s.m21396J(jArr4[0], c16120p2.f49996c, c16120p2.f49997d, roundingMode);
                                    int length2 = jArr3.length - 1;
                                    int iM21408i = AbstractC20817s.m21408i(4, 0, length2);
                                    int iM21408i2 = AbstractC20817s.m21408i(jArr3.length - 4, 0, length2);
                                    long j28 = jArr3[0];
                                    if (j28 <= j27 && j27 < jArr3[iM21408i] && jArr3[iM21408i2] < jM21396J4 && jM21396J4 <= j16) {
                                        int i77 = c19788o.f62730B;
                                        j18 = j16;
                                        long jM21396J5 = AbstractC20817s.m21396J(j27 - j28, i77, c16120p2.f49996c, roundingMode);
                                        iArr4 = iArr;
                                        long jM21396J6 = AbstractC20817s.m21396J(j16 - jM21396J4, i77, c16120p2.f49996c, roundingMode);
                                        if ((jM21396J5 != 0 || jM21396J6 != 0) && jM21396J5 <= 2147483647L && jM21396J6 <= 2147483647L) {
                                            c6341w.f20579a = (int) jM21396J5;
                                            c6341w.f20580b = (int) jM21396J6;
                                            AbstractC20817s.m21395I(jArr3, j17);
                                            c16123s2 = new C16123s(c16120p2, jArr6, iArr4, i24, jArr3, iArr3, AbstractC20817s.m21396J(jArr8[0], 1000000L, c16120p2.f49997d, roundingMode));
                                        }
                                    }
                                    if (jArr8.length == 1) {
                                        i31 = 0;
                                        if (jArr8[0] == 0) {
                                            jArr7.getClass();
                                            j22 = jArr7[0];
                                            for (i49 = 0; i49 < jArr3.length; i49++) {
                                                jArr3[i49] = AbstractC20817s.m21396J(jArr3[i49] - j22, 1000000L, c16120p2.f49996c, RoundingMode.FLOOR);
                                            }
                                            c16123s = new C16123s(c16120p2, jArr6, iArr4, i24, jArr3, iArr3, AbstractC20817s.m21396J(j18 - j22, 1000000L, c16120p2.f49996c, RoundingMode.FLOOR));
                                        } else {
                                            z13 = true;
                                        }
                                        c16123s2 = c16123s;
                                    } else {
                                        i31 = 0;
                                        z13 = true;
                                    }
                                    if (i30 == z13) {
                                        z14 = 1;
                                    } else {
                                        z14 = i31;
                                    }
                                    iArr5 = new int[jArr8.length];
                                    iArr6 = new int[jArr8.length];
                                    jArr7.getClass();
                                    i32 = i31;
                                    i33 = i32;
                                    i34 = i33;
                                    i35 = i34;
                                    while (i32 < jArr8.length) {
                                        j21 = jArr7[i32];
                                        if (j21 != -1) {
                                            long jM21396J7 = AbstractC20817s.m21396J(jArr8[i32], c16120p2.f49996c, c16120p2.f49997d, RoundingMode.FLOOR);
                                            i45 = 1;
                                            iArr5[i32] = AbstractC20817s.m21404e(jArr3, j21, true);
                                            iArr6[i32] = AbstractC20817s.m21401b(jArr3, j21 + jM21396J7, z14);
                                            while (true) {
                                                i46 = iArr5[i32];
                                                i47 = iArr6[i32];
                                                if (i46 >= i47 || (iArr3[i46] & i45) != 0) {
                                                    break;
                                                }
                                                iArr5[i32] = i46 + i45;
                                                i45 = 1;
                                            }
                                            int i78 = (i47 - i46) + i34;
                                            if (i35 != i46) {
                                                i48 = 1;
                                            } else {
                                                i48 = 0;
                                            }
                                            i33 = i48 | i33;
                                            i35 = i47;
                                            i34 = i78;
                                        }
                                        i32++;
                                        i30 = i30;
                                    }
                                    i36 = i30;
                                    if (i34 != i29) {
                                        i37 = 1;
                                    } else {
                                        i37 = 0;
                                    }
                                    i38 = i37 | i33;
                                    if (i38 != 0) {
                                        jArr9 = new long[i34];
                                    } else {
                                        jArr9 = jArr6;
                                    }
                                    if (i38 != 0) {
                                        iArr7 = new int[i34];
                                    } else {
                                        iArr7 = iArr4;
                                    }
                                    if (i38 != 0) {
                                        i24 = 0;
                                    }
                                    if (i38 != 0) {
                                        iArr8 = new int[i34];
                                    } else {
                                        iArr8 = iArr3;
                                    }
                                    jArr10 = new long[i34];
                                    i39 = i24;
                                    i40 = 0;
                                    i41 = 0;
                                    j19 = 0;
                                    while (i40 < jArr8.length) {
                                        j20 = jArr7[i40];
                                        i42 = iArr5[i40];
                                        int[] iArr14 = iArr5;
                                        i43 = iArr6[i40];
                                        int[] iArr15 = iArr6;
                                        if (i38 != 0) {
                                            int i79 = i43 - i42;
                                            System.arraycopy(jArr6, i42, jArr9, i41, i79);
                                            iArr9 = iArr4;
                                            System.arraycopy(iArr9, i42, iArr7, i41, i79);
                                            iArr10 = iArr3;
                                            System.arraycopy(iArr10, i42, iArr8, i41, i79);
                                        } else {
                                            iArr9 = iArr4;
                                            iArr10 = iArr3;
                                        }
                                        int i80 = i39;
                                        while (i42 < i43) {
                                            RoundingMode roundingMode2 = RoundingMode.FLOOR;
                                            long[] jArr17 = jArr8;
                                            int i81 = i43;
                                            long jM21396J8 = AbstractC20817s.m21396J(j19, 1000000L, c16120p2.f49997d, roundingMode2);
                                            long j29 = j19;
                                            jM21396J3 = AbstractC20817s.m21396J(jArr3[i42] - j20, 1000000L, c16120p2.f49996c, roundingMode2);
                                            int[] iArr16 = iArr10;
                                            i44 = i36;
                                            long[] jArr18 = jArr3;
                                            if (i44 != 1) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            C16120p c16120p4 = c16120p2;
                                            if (z15) {
                                                jM21396J3 = Math.max(0L, jM21396J3);
                                            }
                                            jArr10[i41] = jM21396J8 + jM21396J3;
                                            if (i38 == 0 && iArr7[i41] > i80) {
                                                i80 = iArr9[i42];
                                            }
                                            i41++;
                                            i42++;
                                            jArr3 = jArr18;
                                            jArr8 = jArr17;
                                            i43 = i81;
                                            j19 = j29;
                                            c16120p2 = c16120p4;
                                            i36 = i44;
                                            iArr10 = iArr16;
                                        }
                                        long[] jArr19 = jArr8;
                                        iArr3 = iArr10;
                                        j19 += jArr19[i40];
                                        i40++;
                                        iArr5 = iArr14;
                                        jArr3 = jArr3;
                                        jArr8 = jArr19;
                                        c16120p2 = c16120p2;
                                        i36 = i36;
                                        jArr9 = jArr9;
                                        iArr4 = iArr9;
                                        i39 = i80;
                                        iArr6 = iArr15;
                                    }
                                    C16120p c16120p5 = c16120p2;
                                    c16123s = new C16123s(c16120p5, jArr9, iArr7, i39, jArr10, iArr8, AbstractC20817s.m21396J(j19, 1000000L, c16120p5.f49997d, RoundingMode.FLOOR));
                                    c16123s2 = c16123s;
                                }
                                j18 = j16;
                                iArr4 = iArr;
                                if (jArr8.length == 1) {
                                    i31 = 0;
                                    if (jArr8[0] == 0) {
                                        jArr7.getClass();
                                        j22 = jArr7[0];
                                        while (i49 < jArr3.length) {
                                            jArr3[i49] = AbstractC20817s.m21396J(jArr3[i49] - j22, 1000000L, c16120p2.f49996c, RoundingMode.FLOOR);
                                        }
                                        c16123s = new C16123s(c16120p2, jArr6, iArr4, i24, jArr3, iArr3, AbstractC20817s.m21396J(j18 - j22, 1000000L, c16120p2.f49996c, RoundingMode.FLOOR));
                                    } else {
                                        z13 = true;
                                    }
                                    c16123s2 = c16123s;
                                } else {
                                    i31 = 0;
                                    z13 = true;
                                }
                                if (i30 == z13) {
                                    z14 = 1;
                                } else {
                                    z14 = i31;
                                }
                                iArr5 = new int[jArr8.length];
                                iArr6 = new int[jArr8.length];
                                jArr7.getClass();
                                i32 = i31;
                                i33 = i32;
                                i34 = i33;
                                i35 = i34;
                                while (i32 < jArr8.length) {
                                    j21 = jArr7[i32];
                                    if (j21 != -1) {
                                        long jM21396J9 = AbstractC20817s.m21396J(jArr8[i32], c16120p2.f49996c, c16120p2.f49997d, RoundingMode.FLOOR);
                                        i45 = 1;
                                        iArr5[i32] = AbstractC20817s.m21404e(jArr3, j21, true);
                                        iArr6[i32] = AbstractC20817s.m21401b(jArr3, j21 + jM21396J9, z14);
                                        while (true) {
                                            i46 = iArr5[i32];
                                            i47 = iArr6[i32];
                                            if (i46 >= i47) {
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr5[i32] = i46 + i45;
                                            i45 = 1;
                                        }
                                        int i710 = (i47 - i46) + i34;
                                        if (i35 != i46) {
                                            i48 = 1;
                                        } else {
                                            i48 = 0;
                                        }
                                        i33 = i48 | i33;
                                        i35 = i47;
                                        i34 = i710;
                                    }
                                    i32++;
                                    i30 = i30;
                                }
                                i36 = i30;
                                if (i34 != i29) {
                                    i37 = 1;
                                } else {
                                    i37 = 0;
                                }
                                i38 = i37 | i33;
                                if (i38 != 0) {
                                    jArr9 = new long[i34];
                                } else {
                                    jArr9 = jArr6;
                                }
                                if (i38 != 0) {
                                    iArr7 = new int[i34];
                                } else {
                                    iArr7 = iArr4;
                                }
                                if (i38 != 0) {
                                    i24 = 0;
                                }
                                if (i38 != 0) {
                                    iArr8 = new int[i34];
                                } else {
                                    iArr8 = iArr3;
                                }
                                jArr10 = new long[i34];
                                i39 = i24;
                                i40 = 0;
                                i41 = 0;
                                j19 = 0;
                                while (i40 < jArr8.length) {
                                    j20 = jArr7[i40];
                                    i42 = iArr5[i40];
                                    int[] iArr17 = iArr5;
                                    i43 = iArr6[i40];
                                    int[] iArr18 = iArr6;
                                    if (i38 != 0) {
                                        int i711 = i43 - i42;
                                        System.arraycopy(jArr6, i42, jArr9, i41, i711);
                                        iArr9 = iArr4;
                                        System.arraycopy(iArr9, i42, iArr7, i41, i711);
                                        iArr10 = iArr3;
                                        System.arraycopy(iArr10, i42, iArr8, i41, i711);
                                    } else {
                                        iArr9 = iArr4;
                                        iArr10 = iArr3;
                                    }
                                    int i82 = i39;
                                    while (i42 < i43) {
                                        RoundingMode roundingMode3 = RoundingMode.FLOOR;
                                        long[] jArr110 = jArr8;
                                        int i83 = i43;
                                        long jM21396J10 = AbstractC20817s.m21396J(j19, 1000000L, c16120p2.f49997d, roundingMode3);
                                        long j210 = j19;
                                        jM21396J3 = AbstractC20817s.m21396J(jArr3[i42] - j20, 1000000L, c16120p2.f49996c, roundingMode3);
                                        int[] iArr19 = iArr10;
                                        i44 = i36;
                                        long[] jArr111 = jArr3;
                                        if (i44 != 1) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        C16120p c16120p6 = c16120p2;
                                        if (z15) {
                                            jM21396J3 = Math.max(0L, jM21396J3);
                                        }
                                        jArr10[i41] = jM21396J10 + jM21396J3;
                                        if (i38 == 0) {
                                        }
                                        i41++;
                                        i42++;
                                        jArr3 = jArr111;
                                        jArr8 = jArr110;
                                        i43 = i83;
                                        j19 = j210;
                                        c16120p2 = c16120p6;
                                        i36 = i44;
                                        iArr10 = iArr19;
                                    }
                                    long[] jArr112 = jArr8;
                                    iArr3 = iArr10;
                                    j19 += jArr112[i40];
                                    i40++;
                                    iArr5 = iArr17;
                                    jArr3 = jArr3;
                                    jArr8 = jArr112;
                                    c16120p2 = c16120p2;
                                    i36 = i36;
                                    jArr9 = jArr9;
                                    iArr4 = iArr9;
                                    i39 = i82;
                                    iArr6 = iArr18;
                                }
                                C16120p c16120p7 = c16120p2;
                                c16123s = new C16123s(c16120p7, jArr9, iArr7, i39, jArr10, iArr8, AbstractC20817s.m21396J(j19, 1000000L, c16120p7.f49997d, RoundingMode.FLOOR));
                                c16123s2 = c16123s;
                            }
                        } else {
                            iM21369x2 = 0;
                        }
                        iM21369x3 = -1;
                        iMo6627a = c6061j.mo6627a();
                        String str4 = c19788o.f62752m;
                        i15 = iM21369x3;
                        if (iMo6627a == -1) {
                            jArrCopyOf = new long[iMo6628b];
                            iArrCopyOf = new int[iMo6628b];
                            jArrCopyOf2 = new long[iMo6628b];
                            iArrCopyOf2 = new int[iMo6628b];
                            int i712 = iM21369x8;
                            iM21369x4 = i15;
                            i16 = 0;
                            i17 = 0;
                            j14 = 0;
                            j15 = 0;
                            iM21352g = 0;
                            iM21369x5 = 0;
                            i18 = 0;
                            int i713 = iM21369x;
                            i19 = iM21369x10;
                            i20 = iM21369x9;
                            i21 = i713;
                            while (true) {
                                if (i18 >= iMo6628b) {
                                    i22 = i20;
                                    break;
                                }
                                zM17655a = true;
                                while (i17 == 0) {
                                    zM17655a = c16107c.m17655a();
                                    if (!zM17655a) {
                                        break;
                                        break;
                                    }
                                    int i714 = i20;
                                    long j211 = c16107c.f49890d;
                                    i17 = c16107c.f49889c;
                                    j15 = j211;
                                    i20 = i714;
                                    i19 = i19;
                                    iMo6628b = iMo6628b;
                                }
                                i26 = iMo6628b;
                                i22 = i20;
                                iM21352g2 = i19;
                                if (!zM17655a) {
                                    AbstractC20800b.m21332t("AtomParsers", "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i18);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i18);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i18);
                                    iMo6628b = i18;
                                    break;
                                }
                                if (c20811m7 != null) {
                                    while (iM21369x5 == 0) {
                                        iM21369x5 = c20811m7.m21369x();
                                        iM21352g = c20811m7.m21352g();
                                        i21--;
                                    }
                                    iM21369x5--;
                                }
                                int i715 = iM21352g;
                                jArrCopyOf[i18] = j15;
                                iMo6631e = c6061j.mo6631e();
                                iArrCopyOf[i18] = iMo6631e;
                                if (iMo6631e > i16) {
                                    i16 = iMo6631e;
                                }
                                jArrCopyOf2[i18] = j14 + ((long) i715);
                                if (c20811m6 == null) {
                                    i27 = 1;
                                } else {
                                    i27 = 0;
                                }
                                iArrCopyOf2[i18] = i27;
                                if (i18 == iM21369x4) {
                                    iArrCopyOf2[i18] = 1;
                                    iM21369x2--;
                                    if (iM21369x2 > 0) {
                                        c20811m6.getClass();
                                        iM21369x4 = c20811m6.m21369x() - 1;
                                    }
                                    j14 += (long) iM21352g2;
                                    iM21369x6 = i22 - 1;
                                    if (iM21369x6 != 0) {
                                    }
                                    j15 += (long) iArrCopyOf[i18];
                                    i17--;
                                    i18++;
                                    iM21352g = i715;
                                    i20 = iM21369x6;
                                    c6061j = c6061j;
                                    i16 = i16;
                                    jArrCopyOf = jArrCopyOf;
                                    iMo6628b = i26;
                                    iArrCopyOf = iArrCopyOf;
                                    i19 = iM21352g2;
                                }
                                j14 += (long) iM21352g2;
                                iM21369x6 = i22 - 1;
                                if (iM21369x6 != 0) {
                                }
                                j15 += (long) iArrCopyOf[i18];
                                i17--;
                                i18++;
                                iM21352g = i715;
                                i20 = iM21369x6;
                                c6061j = c6061j;
                                i16 = i16;
                                jArrCopyOf = jArrCopyOf;
                                iMo6628b = i26;
                                iArrCopyOf = iArrCopyOf;
                                i19 = iM21352g2;
                            }
                            int i716 = i17;
                            j16 = j14 + ((long) iM21352g);
                            if (c20811m7 == null) {
                                z12 = true;
                                break;
                            }
                            i25 = i21;
                            while (true) {
                                if (i25 <= 0) {
                                    z12 = true;
                                    break;
                                }
                                if (c20811m7.m21369x() != 0) {
                                    z12 = false;
                                    break;
                                }
                                c20811m7.m21352g();
                                i25--;
                            }
                            if (iM21369x2 != 0) {
                                i23 = iM21369x5;
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                c16120p2 = c16120p3;
                                sb3.append(c16120p2.f49994a);
                                sb3.append(": remainingSynchronizationSamples ");
                                sb3.append(iM21369x2);
                                sb3.append(", remainingSamplesAtTimestampDelta ");
                                sb3.append(i22);
                                sb3.append(YladLSetV.OUufyfAKSvbdN);
                                sb3.append(i716);
                                sb3.append(", remainingTimestampDeltaChanges ");
                                sb3.append(i712);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(i23);
                                if (z12) {
                                    str = ", ctts invalid";
                                } else {
                                    str = str2;
                                }
                                sb3.append(str);
                                AbstractC20800b.m21332t("AtomParsers", sb3.toString());
                            } else {
                                i23 = iM21369x5;
                                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                c16120p2 = c16120p3;
                                sb4.append(c16120p2.f49994a);
                                sb4.append(": remainingSynchronizationSamples ");
                                sb4.append(iM21369x2);
                                sb4.append(", remainingSamplesAtTimestampDelta ");
                                sb4.append(i22);
                                sb4.append(YladLSetV.OUufyfAKSvbdN);
                                sb4.append(i716);
                                sb4.append(", remainingTimestampDeltaChanges ");
                                sb4.append(i712);
                                sb4.append(", remainingSamplesAtTimestampOffset ");
                                sb4.append(i23);
                                if (z12) {
                                    str = ", ctts invalid";
                                } else {
                                    str = str2;
                                }
                                sb4.append(str);
                                AbstractC20800b.m21332t("AtomParsers", sb4.toString());
                            }
                            iArr = iArrCopyOf;
                            i24 = i16;
                            jArr3 = jArrCopyOf2;
                            iArr2 = iArrCopyOf2;
                        } else {
                            jArrCopyOf = new long[iMo6628b];
                            iArrCopyOf = new int[iMo6628b];
                            jArrCopyOf2 = new long[iMo6628b];
                            iArrCopyOf2 = new int[iMo6628b];
                            int i717 = iM21369x8;
                            iM21369x4 = i15;
                            i16 = 0;
                            i17 = 0;
                            j14 = 0;
                            j15 = 0;
                            iM21352g = 0;
                            iM21369x5 = 0;
                            i18 = 0;
                            int i718 = iM21369x;
                            i19 = iM21369x10;
                            i20 = iM21369x9;
                            i21 = i718;
                            while (true) {
                                if (i18 >= iMo6628b) {
                                    i22 = i20;
                                    break;
                                }
                                zM17655a = true;
                                while (i17 == 0) {
                                    zM17655a = c16107c.m17655a();
                                    if (!zM17655a) {
                                        break;
                                        break;
                                    }
                                    int i719 = i20;
                                    long j212 = c16107c.f49890d;
                                    i17 = c16107c.f49889c;
                                    j15 = j212;
                                    i20 = i719;
                                    i19 = i19;
                                    iMo6628b = iMo6628b;
                                }
                                i26 = iMo6628b;
                                i22 = i20;
                                iM21352g2 = i19;
                                if (!zM17655a) {
                                    AbstractC20800b.m21332t("AtomParsers", "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i18);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i18);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i18);
                                    iMo6628b = i18;
                                    break;
                                }
                                if (c20811m7 != null) {
                                    while (iM21369x5 == 0) {
                                        iM21369x5 = c20811m7.m21369x();
                                        iM21352g = c20811m7.m21352g();
                                        i21--;
                                    }
                                    iM21369x5--;
                                }
                                int i7110 = iM21352g;
                                jArrCopyOf[i18] = j15;
                                iMo6631e = c6061j.mo6631e();
                                iArrCopyOf[i18] = iMo6631e;
                                if (iMo6631e > i16) {
                                    i16 = iMo6631e;
                                }
                                jArrCopyOf2[i18] = j14 + ((long) i7110);
                                if (c20811m6 == null) {
                                    i27 = 1;
                                } else {
                                    i27 = 0;
                                }
                                iArrCopyOf2[i18] = i27;
                                if (i18 == iM21369x4) {
                                    iArrCopyOf2[i18] = 1;
                                    iM21369x2--;
                                    if (iM21369x2 > 0) {
                                        c20811m6.getClass();
                                        iM21369x4 = c20811m6.m21369x() - 1;
                                    }
                                    j14 += (long) iM21352g2;
                                    iM21369x6 = i22 - 1;
                                    if (iM21369x6 != 0) {
                                    }
                                    j15 += (long) iArrCopyOf[i18];
                                    i17--;
                                    i18++;
                                    iM21352g = i7110;
                                    i20 = iM21369x6;
                                    c6061j = c6061j;
                                    i16 = i16;
                                    jArrCopyOf = jArrCopyOf;
                                    iMo6628b = i26;
                                    iArrCopyOf = iArrCopyOf;
                                    i19 = iM21352g2;
                                }
                                j14 += (long) iM21352g2;
                                iM21369x6 = i22 - 1;
                                if (iM21369x6 != 0) {
                                }
                                j15 += (long) iArrCopyOf[i18];
                                i17--;
                                i18++;
                                iM21352g = i7110;
                                i20 = iM21369x6;
                                c6061j = c6061j;
                                i16 = i16;
                                jArrCopyOf = jArrCopyOf;
                                iMo6628b = i26;
                                iArrCopyOf = iArrCopyOf;
                                i19 = iM21352g2;
                            }
                            int i7111 = i17;
                            j16 = j14 + ((long) iM21352g);
                            if (c20811m7 == null) {
                                z12 = true;
                                break;
                            }
                            i25 = i21;
                            while (true) {
                                if (i25 <= 0) {
                                    z12 = true;
                                    break;
                                }
                                if (c20811m7.m21369x() != 0) {
                                    z12 = false;
                                    break;
                                }
                                c20811m7.m21352g();
                                i25--;
                            }
                            if (iM21369x2 != 0) {
                                i23 = iM21369x5;
                                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                                c16120p2 = c16120p3;
                                sb5.append(c16120p2.f49994a);
                                sb5.append(": remainingSynchronizationSamples ");
                                sb5.append(iM21369x2);
                                sb5.append(", remainingSamplesAtTimestampDelta ");
                                sb5.append(i22);
                                sb5.append(YladLSetV.OUufyfAKSvbdN);
                                sb5.append(i7111);
                                sb5.append(", remainingTimestampDeltaChanges ");
                                sb5.append(i717);
                                sb5.append(", remainingSamplesAtTimestampOffset ");
                                sb5.append(i23);
                                if (z12) {
                                    str = ", ctts invalid";
                                } else {
                                    str = str2;
                                }
                                sb5.append(str);
                                AbstractC20800b.m21332t("AtomParsers", sb5.toString());
                            } else {
                                i23 = iM21369x5;
                                StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                                c16120p2 = c16120p3;
                                sb6.append(c16120p2.f49994a);
                                sb6.append(": remainingSynchronizationSamples ");
                                sb6.append(iM21369x2);
                                sb6.append(", remainingSamplesAtTimestampDelta ");
                                sb6.append(i22);
                                sb6.append(YladLSetV.OUufyfAKSvbdN);
                                sb6.append(i7111);
                                sb6.append(", remainingTimestampDeltaChanges ");
                                sb6.append(i717);
                                sb6.append(", remainingSamplesAtTimestampOffset ");
                                sb6.append(i23);
                                if (z12) {
                                    str = ", ctts invalid";
                                } else {
                                    str = str2;
                                }
                                sb6.append(str);
                                AbstractC20800b.m21332t("AtomParsers", sb6.toString());
                            }
                            iArr = iArrCopyOf;
                            i24 = i16;
                            jArr3 = jArrCopyOf2;
                            iArr2 = iArrCopyOf2;
                        }
                        RoundingMode roundingMode4 = RoundingMode.FLOOR;
                        jM21396J2 = AbstractC20817s.m21396J(j16, 1000000L, c16120p2.f49996c, roundingMode4);
                        j17 = c16120p2.f49996c;
                        jArr4 = c16120p2.f50001h;
                        if (jArr4 == null) {
                            AbstractC20817s.m21395I(jArr3, j17);
                            c16123s2 = new C16123s(c16120p2, jArrCopyOf, iArr, i24, jArr3, iArr2, jM21396J2);
                        } else {
                            length = jArr4.length;
                            i28 = c16120p2.f49995b;
                            jArr5 = c16120p2.f50002i;
                            if (length == 1) {
                                jArr6 = jArrCopyOf;
                                iArr3 = iArr2;
                                i29 = iMo6628b;
                                i30 = i28;
                                jArr7 = jArr5;
                                jArr8 = jArr4;
                                j18 = j16;
                                iArr4 = iArr;
                                if (jArr8.length == 1) {
                                    i31 = 0;
                                    if (jArr8[0] == 0) {
                                        jArr7.getClass();
                                        j22 = jArr7[0];
                                        while (i49 < jArr3.length) {
                                            jArr3[i49] = AbstractC20817s.m21396J(jArr3[i49] - j22, 1000000L, c16120p2.f49996c, RoundingMode.FLOOR);
                                        }
                                        c16123s = new C16123s(c16120p2, jArr6, iArr4, i24, jArr3, iArr3, AbstractC20817s.m21396J(j18 - j22, 1000000L, c16120p2.f49996c, RoundingMode.FLOOR));
                                    } else {
                                        z13 = true;
                                    }
                                    c16123s2 = c16123s;
                                } else {
                                    i31 = 0;
                                    z13 = true;
                                }
                                if (i30 == z13) {
                                    z14 = 1;
                                } else {
                                    z14 = i31;
                                }
                                iArr5 = new int[jArr8.length];
                                iArr6 = new int[jArr8.length];
                                jArr7.getClass();
                                i32 = i31;
                                i33 = i32;
                                i34 = i33;
                                i35 = i34;
                                while (i32 < jArr8.length) {
                                    j21 = jArr7[i32];
                                    if (j21 != -1) {
                                        long jM21396J11 = AbstractC20817s.m21396J(jArr8[i32], c16120p2.f49996c, c16120p2.f49997d, RoundingMode.FLOOR);
                                        i45 = 1;
                                        iArr5[i32] = AbstractC20817s.m21404e(jArr3, j21, true);
                                        iArr6[i32] = AbstractC20817s.m21401b(jArr3, j21 + jM21396J11, z14);
                                        while (true) {
                                            i46 = iArr5[i32];
                                            i47 = iArr6[i32];
                                            if (i46 >= i47) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr5[i32] = i46 + i45;
                                            i45 = 1;
                                        }
                                        int i7112 = (i47 - i46) + i34;
                                        if (i35 != i46) {
                                            i48 = 1;
                                        } else {
                                            i48 = 0;
                                        }
                                        i33 = i48 | i33;
                                        i35 = i47;
                                        i34 = i7112;
                                    }
                                    i32++;
                                    i30 = i30;
                                }
                                i36 = i30;
                                if (i34 != i29) {
                                    i37 = 1;
                                } else {
                                    i37 = 0;
                                }
                                i38 = i37 | i33;
                                if (i38 != 0) {
                                    jArr9 = new long[i34];
                                } else {
                                    jArr9 = jArr6;
                                }
                                if (i38 != 0) {
                                    iArr7 = new int[i34];
                                } else {
                                    iArr7 = iArr4;
                                }
                                if (i38 != 0) {
                                    i24 = 0;
                                }
                                if (i38 != 0) {
                                    iArr8 = new int[i34];
                                } else {
                                    iArr8 = iArr3;
                                }
                                jArr10 = new long[i34];
                                i39 = i24;
                                i40 = 0;
                                i41 = 0;
                                j19 = 0;
                                while (i40 < jArr8.length) {
                                    j20 = jArr7[i40];
                                    i42 = iArr5[i40];
                                    int[] iArr110 = iArr5;
                                    i43 = iArr6[i40];
                                    int[] iArr111 = iArr6;
                                    if (i38 != 0) {
                                        int i7113 = i43 - i42;
                                        System.arraycopy(jArr6, i42, jArr9, i41, i7113);
                                        iArr9 = iArr4;
                                        System.arraycopy(iArr9, i42, iArr7, i41, i7113);
                                        iArr10 = iArr3;
                                        System.arraycopy(iArr10, i42, iArr8, i41, i7113);
                                    } else {
                                        iArr9 = iArr4;
                                        iArr10 = iArr3;
                                    }
                                    int i84 = i39;
                                    while (i42 < i43) {
                                        RoundingMode roundingMode5 = RoundingMode.FLOOR;
                                        long[] jArr113 = jArr8;
                                        int i85 = i43;
                                        long jM21396J12 = AbstractC20817s.m21396J(j19, 1000000L, c16120p2.f49997d, roundingMode5);
                                        long j213 = j19;
                                        jM21396J3 = AbstractC20817s.m21396J(jArr3[i42] - j20, 1000000L, c16120p2.f49996c, roundingMode5);
                                        int[] iArr112 = iArr10;
                                        i44 = i36;
                                        long[] jArr114 = jArr3;
                                        if (i44 != 1) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        C16120p c16120p8 = c16120p2;
                                        if (z15) {
                                            jM21396J3 = Math.max(0L, jM21396J3);
                                        }
                                        jArr10[i41] = jM21396J12 + jM21396J3;
                                        if (i38 == 0) {
                                        }
                                        i41++;
                                        i42++;
                                        jArr3 = jArr114;
                                        jArr8 = jArr113;
                                        i43 = i85;
                                        j19 = j213;
                                        c16120p2 = c16120p8;
                                        i36 = i44;
                                        iArr10 = iArr112;
                                    }
                                    long[] jArr115 = jArr8;
                                    iArr3 = iArr10;
                                    j19 += jArr115[i40];
                                    i40++;
                                    iArr5 = iArr110;
                                    jArr3 = jArr3;
                                    jArr8 = jArr115;
                                    c16120p2 = c16120p2;
                                    i36 = i36;
                                    jArr9 = jArr9;
                                    iArr4 = iArr9;
                                    i39 = i84;
                                    iArr6 = iArr111;
                                }
                                C16120p c16120p9 = c16120p2;
                                c16123s = new C16123s(c16120p9, jArr9, iArr7, i39, jArr10, iArr8, AbstractC20817s.m21396J(j19, 1000000L, c16120p9.f49997d, RoundingMode.FLOOR));
                                c16123s2 = c16123s;
                            } else {
                                jArr6 = jArrCopyOf;
                                iArr3 = iArr2;
                                i29 = iMo6628b;
                                i30 = i28;
                                jArr7 = jArr5;
                                jArr8 = jArr4;
                                j18 = j16;
                                iArr4 = iArr;
                                if (jArr8.length == 1) {
                                    i31 = 0;
                                    if (jArr8[0] == 0) {
                                        jArr7.getClass();
                                        j22 = jArr7[0];
                                        while (i49 < jArr3.length) {
                                            jArr3[i49] = AbstractC20817s.m21396J(jArr3[i49] - j22, 1000000L, c16120p2.f49996c, RoundingMode.FLOOR);
                                        }
                                        c16123s = new C16123s(c16120p2, jArr6, iArr4, i24, jArr3, iArr3, AbstractC20817s.m21396J(j18 - j22, 1000000L, c16120p2.f49996c, RoundingMode.FLOOR));
                                    } else {
                                        z13 = true;
                                    }
                                    c16123s2 = c16123s;
                                } else {
                                    i31 = 0;
                                    z13 = true;
                                }
                                if (i30 == z13) {
                                    z14 = 1;
                                } else {
                                    z14 = i31;
                                }
                                iArr5 = new int[jArr8.length];
                                iArr6 = new int[jArr8.length];
                                jArr7.getClass();
                                i32 = i31;
                                i33 = i32;
                                i34 = i33;
                                i35 = i34;
                                while (i32 < jArr8.length) {
                                    j21 = jArr7[i32];
                                    if (j21 != -1) {
                                        long jM21396J13 = AbstractC20817s.m21396J(jArr8[i32], c16120p2.f49996c, c16120p2.f49997d, RoundingMode.FLOOR);
                                        i45 = 1;
                                        iArr5[i32] = AbstractC20817s.m21404e(jArr3, j21, true);
                                        iArr6[i32] = AbstractC20817s.m21401b(jArr3, j21 + jM21396J13, z14);
                                        while (true) {
                                            i46 = iArr5[i32];
                                            i47 = iArr6[i32];
                                            if (i46 >= i47) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr5[i32] = i46 + i45;
                                            i45 = 1;
                                        }
                                        int i7114 = (i47 - i46) + i34;
                                        if (i35 != i46) {
                                            i48 = 1;
                                        } else {
                                            i48 = 0;
                                        }
                                        i33 = i48 | i33;
                                        i35 = i47;
                                        i34 = i7114;
                                    }
                                    i32++;
                                    i30 = i30;
                                }
                                i36 = i30;
                                if (i34 != i29) {
                                    i37 = 1;
                                } else {
                                    i37 = 0;
                                }
                                i38 = i37 | i33;
                                if (i38 != 0) {
                                    jArr9 = new long[i34];
                                } else {
                                    jArr9 = jArr6;
                                }
                                if (i38 != 0) {
                                    iArr7 = new int[i34];
                                } else {
                                    iArr7 = iArr4;
                                }
                                if (i38 != 0) {
                                    i24 = 0;
                                }
                                if (i38 != 0) {
                                    iArr8 = new int[i34];
                                } else {
                                    iArr8 = iArr3;
                                }
                                jArr10 = new long[i34];
                                i39 = i24;
                                i40 = 0;
                                i41 = 0;
                                j19 = 0;
                                while (i40 < jArr8.length) {
                                    j20 = jArr7[i40];
                                    i42 = iArr5[i40];
                                    int[] iArr113 = iArr5;
                                    i43 = iArr6[i40];
                                    int[] iArr114 = iArr6;
                                    if (i38 != 0) {
                                        int i7115 = i43 - i42;
                                        System.arraycopy(jArr6, i42, jArr9, i41, i7115);
                                        iArr9 = iArr4;
                                        System.arraycopy(iArr9, i42, iArr7, i41, i7115);
                                        iArr10 = iArr3;
                                        System.arraycopy(iArr10, i42, iArr8, i41, i7115);
                                    } else {
                                        iArr9 = iArr4;
                                        iArr10 = iArr3;
                                    }
                                    int i86 = i39;
                                    while (i42 < i43) {
                                        RoundingMode roundingMode6 = RoundingMode.FLOOR;
                                        long[] jArr116 = jArr8;
                                        int i87 = i43;
                                        long jM21396J14 = AbstractC20817s.m21396J(j19, 1000000L, c16120p2.f49997d, roundingMode6);
                                        long j214 = j19;
                                        jM21396J3 = AbstractC20817s.m21396J(jArr3[i42] - j20, 1000000L, c16120p2.f49996c, roundingMode6);
                                        int[] iArr115 = iArr10;
                                        i44 = i36;
                                        long[] jArr117 = jArr3;
                                        if (i44 != 1) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        C16120p c16120p10 = c16120p2;
                                        if (z15) {
                                            jM21396J3 = Math.max(0L, jM21396J3);
                                        }
                                        jArr10[i41] = jM21396J14 + jM21396J3;
                                        if (i38 == 0) {
                                        }
                                        i41++;
                                        i42++;
                                        jArr3 = jArr117;
                                        jArr8 = jArr116;
                                        i43 = i87;
                                        j19 = j214;
                                        c16120p2 = c16120p10;
                                        i36 = i44;
                                        iArr10 = iArr115;
                                    }
                                    long[] jArr118 = jArr8;
                                    iArr3 = iArr10;
                                    j19 += jArr118[i40];
                                    i40++;
                                    iArr5 = iArr113;
                                    jArr3 = jArr3;
                                    jArr8 = jArr118;
                                    c16120p2 = c16120p2;
                                    i36 = i36;
                                    jArr9 = jArr9;
                                    iArr4 = iArr9;
                                    i39 = i86;
                                    iArr6 = iArr114;
                                }
                                C16120p c16120p11 = c16120p2;
                                c16123s = new C16123s(c16120p11, jArr9, iArr7, i39, jArr10, iArr8, AbstractC20817s.m21396J(j19, 1000000L, c16120p11.f49997d, RoundingMode.FLOOR));
                                c16123s2 = c16123s;
                            }
                        }
                    }
                    arrayList = arrayList2;
                    arrayList.add(c16123s2);
                }
            }
            i50 = i10 + 1;
            arrayList2 = arrayList;
            b10 = -1;
        }
    }
}
