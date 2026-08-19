package p473T7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p005A3.C0326m;
import p013Ab.C0420b;
import p1095x1.InterfaceC21058L;
import p153Fn.C2925c;
import p492U1.C7536a;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9388w4;
import p637a3.C10484a;
import p637a3.C10486c;
import p637a3.InterfaceC10497n;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17677k;
import p909nm.C17689w;
import p909nm.C17690x;
import p928oh.C18194a;
import p953q0.C18558P;
import p977r0.C18834f;
import p977r0.C18837i;
import p977r0.C18838j;
import p977r0.C18839k;
import p977r0.C18840l;
import p977r0.C18842n;
import p977r0.C18845q;
import p977r0.C18852x;

/* JADX INFO: renamed from: T7.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7262c {
    /* JADX INFO: renamed from: a */
    public static InterfaceC10497n m7712a(InterfaceC10497n interfaceC10497n, C10484a c10484a) {
        return interfaceC10497n.mo10952b(new C10486c(c10484a, 2, null));
    }

    /* JADX INFO: renamed from: b */
    public static final int m7713b(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i11 < i13) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static int m7714c(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (-2147483647 <= i13 && i13 < i11) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: d */
    public static final int m7715d(long j10, int[] iArr) {
        int i10 = (int) (j10 & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i11 = (int) (j10 >> 32); i11 < i10; i11++) {
            iMax = Math.max(iMax, iArr[i11]);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:193:0x03de  */
    /* JADX WARN: Code duplicated, block: B:205:0x03fe A[LOOP:39: B:204:0x03fc->B:205:0x03fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x040a A[LOOP:40: B:207:0x0408->B:208:0x040a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x0428  */
    /* JADX WARN: Code duplicated, block: B:214:0x0450  */
    /* JADX WARN: Code duplicated, block: B:215:0x0452  */
    /* JADX WARN: Code duplicated, block: B:218:0x0465  */
    /* JADX WARN: Code duplicated, block: B:219:0x046a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0470  */
    /* JADX WARN: Code duplicated, block: B:224:0x0476  */
    /* JADX WARN: Code duplicated, block: B:227:0x0481  */
    /* JADX WARN: Code duplicated, block: B:228:0x0485  */
    /* JADX WARN: Code duplicated, block: B:427:0x0895  */
    /* JADX WARN: Code duplicated, block: B:554:0x03e5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    public static final C18842n m7716e(C18839k c18839k, int i10, int[] iArr, int[] iArr2, boolean z6) {
        int i11;
        C17690x c17690x;
        long j10;
        int i12;
        C18852x c18852x;
        ArrayList arrayList;
        int i13;
        int i14;
        C17677k[] c17677kArr;
        int i15;
        int i16;
        int iM19280C;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int[] iArr3;
        int i25;
        C0326m c0326m;
        int i26;
        int[] iArr4;
        int i27;
        boolean z10;
        int i28;
        boolean z11;
        int i29;
        C0326m c0326m2;
        int i30;
        int iM1059o;
        int length;
        int[] iArr5;
        int i31;
        int length2;
        int[] iArr6;
        int i32;
        int[] iArr7;
        int i33;
        boolean z12;
        int i34;
        int i35;
        int i36;
        C18845q c18845qM957p;
        int iM7715d;
        int[] iArrM1063s;
        int i37;
        int i38;
        long j11;
        int iM9965h;
        int i39;
        boolean z13;
        int i40;
        C18834f c18834f;
        List arrayList2;
        int iM9965h2;
        int i41;
        boolean z14;
        boolean z15;
        boolean z16;
        int[] iArr8;
        boolean z17;
        C0326m c0326m3;
        boolean z18;
        int i42;
        int[] iArrM1063s2;
        int i43;
        C18839k c18839k2 = c18839k;
        C18834f c18834f2 = c18839k2.f59962c;
        int i44 = c18834f2.f59941b.mo19801k().f1381Z;
        C17689w c17689w = C17689w.f56480Y;
        C17690x c17690x2 = C17690x.f56481Y;
        C2925c c2925c = c18839k2.f59973n;
        C18852x c18852x2 = c18839k2.f59960a;
        int i45 = c18839k2.f59967h;
        C0326m c0326m4 = c18839k2.f59975p;
        long j12 = c18839k2.f59964e;
        C18558P c18558p = c18839k2.f59966g;
        if (i44 <= 0 || (i11 = c18839k2.f59977r) == 0) {
            int iM7856k = C7536a.m7856k(j12);
            int iM7855j = C7536a.m7855j(j12);
            c18852x2.f60059r.m11266d(0, iM7856k, iM7855j, new ArrayList(), ((C18834f) c0326m4.f1140b).f59942c, c0326m4, c18839k.f59965f, false, c18839k.f59977r, false, 0, 0, c2925c, c18839k.f59974o);
            long jM11265b = c18852x2.f60059r.m11265b();
            if (!C7545j.m7886a(jM11265b, 0L)) {
                iM7856k = AbstractC9388w4.m9965h((int) (jM11265b >> 32), j12);
                iM7855j = AbstractC9388w4.m9964g((int) (jM11265b & 4294967295L), j12);
            }
            InterfaceC21058L interfaceC21058LMo19936R = c18558p.mo19936R(iM7856k, iM7855j, c17690x2, C18840l.f59978Z);
            long jM9643a = AbstractC9113C4.m9643a(C7536a.m7856k(j12), C7536a.m7855j(j12));
            int i46 = c18839k.f59969j;
            int i47 = c18839k.f59970k;
            return new C18842n(iArr, iArr2, 0.0f, interfaceC21058LMo19936R, false, c18839k.f59965f, false, c18839k.f59963d, c18834f2.f59941b.f59939c, i44, c17689w, jM9643a, -i46, i47 + i45, i46, i47, c18839k.f59972m);
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, size)");
        C18558P c18558p2 = c18558p;
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        AbstractC16544l.m18093f(iArrCopyOf2, "copyOf(this, size)");
        int length3 = iArrCopyOf.length - 1;
        C0420b c0420b = c18839k2.f59976q;
        if (length3 >= 0) {
            while (true) {
                int i48 = length3 - 1;
                c17690x = c17690x2;
                while (true) {
                    int i49 = iArrCopyOf[length3];
                    if (i49 < i44 && c0420b.m1049d(i49, length3)) {
                        break;
                    }
                    long j13 = j12;
                    iArrCopyOf[length3] = c0420b.m1059o(iArrCopyOf[length3], length3);
                    j12 = j13;
                }
                int i50 = iArrCopyOf[length3];
                j10 = j12;
                if (i50 >= 0 && !c18834f2.f59941b.f59939c.m16555f(i50)) {
                    c0420b.m1041D(iArrCopyOf[length3], length3);
                }
                if (i48 < 0) {
                    break;
                }
                length3 = i48;
                c17690x2 = c17690x;
                j12 = j10;
            }
        } else {
            c17690x = c17690x2;
            j10 = j12;
        }
        m7718g(iArrCopyOf2, -i10);
        C17677k[] c17677kArr2 = new C17677k[i11];
        for (int i51 = 0; i51 < i11; i51++) {
            c17677kArr2[i51] = new C17677k(16);
        }
        int i52 = c18839k2.f59969j;
        int i53 = -i52;
        m7718g(iArrCopyOf2, i53);
        boolean z19 = false;
        loop3: while (true) {
            int length4 = iArrCopyOf.length;
            i12 = i44;
            c18852x = c18852x2;
            int i54 = 0;
            while (true) {
                arrayList = null;
                i13 = c18839k2.f59972m;
                if (i54 >= length4) {
                    i14 = i13;
                    c17677kArr = c17677kArr2;
                    i15 = i11;
                    i16 = 0;
                    iM19280C = -1;
                    break loop3;
                }
                int i55 = iArrCopyOf[i54];
                int i56 = length4;
                c17677kArr = c17677kArr2;
                i15 = i11;
                if (iArrCopyOf2[i54] >= Math.max(-i13, 0) || i55 <= 0) {
                    i54++;
                    c18839k2 = c18839k;
                    i53 = i53;
                    i52 = i52;
                    length4 = i56;
                    c17677kArr2 = c17677kArr;
                    i11 = i15;
                }
            }
            iM19280C = m7713b(iArrCopyOf);
            int i57 = iArrCopyOf[iM19280C];
            int length5 = iArrCopyOf2.length;
            int i58 = 0;
            while (i58 < length5) {
                int i59 = length5;
                int i60 = i13;
                if (iArrCopyOf[i58] != iArrCopyOf[iM19280C]) {
                    int i61 = iArrCopyOf2[i58];
                    int i62 = iArrCopyOf2[iM19280C];
                    if (i61 < i62) {
                        iArrCopyOf2[i58] = i62;
                    }
                }
                i58++;
                length5 = i59;
                i13 = i60;
            }
            i14 = i13;
            int iM1059o2 = c0420b.m1059o(i57, iM19280C);
            if (iM1059o2 < 0) {
                i16 = 0;
                break;
            }
            long jM20146a = c18839k2.m20146a(c18834f2, iM1059o2, iM19280C);
            int i63 = (int) (jM20146a & 4294967295L);
            int i64 = i52;
            int i65 = i53;
            int i66 = (int) (jM20146a >> 32);
            int i67 = i63 - i66;
            c0420b.m1041D(iM1059o2, i67 != 1 ? -2 : i66);
            C18845q c18845qM957p2 = c0326m4.m957p(iM1059o2, jM20146a);
            int iM7715d2 = m7715d(jM20146a, iArrCopyOf2);
            int[] iArrM1063s3 = i67 != 1 ? c0420b.m1063s(iM1059o2) : null;
            boolean z20 = z19;
            for (int i68 = i66; i68 < i63; i68++) {
                iArrCopyOf[i68] = iM1059o2;
                int i69 = c18845qM957p2.f60018m + iM7715d2 + (iArrM1063s3 == null ? 0 : iArrM1063s3[i68]);
                iArrCopyOf2[i68] = i69;
                if (i69 + i45 <= 0) {
                    z20 = true;
                }
            }
            c18839k2 = c18839k;
            i53 = i65;
            z19 = z20;
            i52 = i64;
            c17677kArr2 = c17677kArr;
            i11 = i15;
            c18852x2 = c18852x;
            i44 = i12;
        }
        int i70 = iArrCopyOf2[i16];
        int i71 = i53;
        if (i70 < i71) {
            i17 = i10 + i70;
            m7718g(iArrCopyOf2, i71 - i70);
        } else {
            i17 = i10;
        }
        int i72 = i52;
        m7718g(iArrCopyOf2, i72);
        int i73 = -1;
        if (iM19280C == -1) {
            iM19280C = AbstractC17678l.m19280C(iArrCopyOf, i16);
        }
        C18839k c18839k3 = c18839k;
        if (iM19280C != -1 && m7717f(iArrCopyOf, c18839k3, iArrCopyOf2, iM19280C) && z6) {
            c0420b.m1039B();
            int length6 = iArrCopyOf.length;
            int[] iArr9 = new int[length6];
            int i74 = 0;
            while (i74 < length6) {
                iArr9[i74] = i73;
                i74++;
                i73 = -1;
            }
            int length7 = iArrCopyOf2.length;
            int[] iArr10 = new int[length7];
            for (int i75 = 0; i75 < length7; i75++) {
                iArr10[i75] = iArrCopyOf2[iM19280C];
            }
            return m7716e(c18839k3, i17, iArr9, iArr10, false);
        }
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length);
        AbstractC16544l.m18093f(iArrCopyOf3, "copyOf(this, size)");
        int length8 = iArrCopyOf2.length;
        int[] iArr11 = new int[length8];
        for (int i76 = 0; i76 < length8; i76++) {
            iArr11[i76] = -iArrCopyOf2[i76];
        }
        int i77 = i71 + i14;
        int i78 = c18839k3.f59970k;
        int i79 = i45 + i78;
        int i80 = i71;
        int i81 = i79 < 0 ? 0 : i79;
        boolean z21 = z19;
        String str = "copyOf(this, size)";
        int i82 = 0;
        int iM7714c = m7714c(iArrCopyOf3);
        while (true) {
            i17 = i17;
            if (iM7714c == -1) {
                i18 = i15;
                i72 = i72;
                break;
            }
            int i83 = i15;
            i72 = i72;
            if (i82 >= i83) {
                i18 = i83;
                break;
            }
            int i84 = iArrCopyOf3[iM7714c];
            i45 = i45;
            int length9 = iArrCopyOf3.length;
            iArrCopyOf2 = iArrCopyOf2;
            iArrCopyOf = iArrCopyOf;
            int i85 = Integer.MAX_VALUE;
            int i86 = 0;
            iM7714c = -1;
            while (i86 < length9) {
                int i87 = length9;
                int i88 = i84 + 1;
                int i89 = i83;
                int i90 = iArrCopyOf3[i86];
                if (i88 <= i90 && i90 < i85) {
                    iM7714c = i86;
                    i85 = i90;
                }
                i86++;
                length9 = i87;
                i83 = i89;
            }
            int i91 = i83;
            i82++;
            if (i84 >= 0) {
                long jM20146a2 = c18839k3.m20146a(c18834f2, i84, iM7714c);
                C18845q c18845qM957p3 = c0326m4.m957p(i84, jM20146a2);
                c0326m4 = c0326m4;
                int i92 = (int) (jM20146a2 & 4294967295L);
                C18834f c18834f3 = c18834f2;
                i81 = i81;
                int i93 = (int) (jM20146a2 >> 32);
                int i94 = i92 - i93;
                c0420b.m1041D(i84, i94 != 1 ? -2 : i93);
                int iM7715d3 = m7715d(jM20146a2, iArr11);
                for (int i95 = i93; i95 < i92; i95++) {
                    iArr11[i95] = c18845qM957p3.f60018m + iM7715d3;
                    iArrCopyOf3[i95] = i84;
                    c17677kArr[i95].addLast(c18845qM957p3);
                }
                if (iM7715d3 >= i77 || iArr11[i93] > i77) {
                    i43 = 1;
                } else {
                    c18845qM957p3.f60017l = false;
                    i43 = 1;
                    z21 = true;
                }
                if (i94 != i43) {
                    i82 = i91;
                    i15 = i82;
                } else {
                    i15 = i91;
                }
                c18834f2 = c18834f3;
            } else {
                iM7714c = iM7714c;
                i72 = i72;
                i17 = i17;
                i45 = i45;
                iArrCopyOf = iArrCopyOf;
                iArrCopyOf2 = iArrCopyOf2;
                i15 = i91;
            }
        }
        C0326m c0326m5 = c0326m4;
        loop13: while (true) {
            int i96 = 0;
            while (true) {
                if (i96 >= length8) {
                    i19 = i81;
                    i20 = i18;
                    for (int i97 = 0; i97 < i20; i97++) {
                        if (!c17677kArr[i97].isEmpty()) {
                            i21 = i12;
                            i22 = 1;
                            break loop13;
                        }
                    }
                    break;
                }
                int i98 = iArr11[i96];
                i19 = i81;
                if (i98 < i19 || i98 <= 0) {
                    i20 = i18;
                    break;
                }
                i96++;
                i81 = i19;
            }
            int iM7714c2 = m7714c(iArr11);
            i22 = 1;
            int iM19285H = AbstractC17678l.m19285H(iArrCopyOf3) + 1;
            i21 = i12;
            if (iM19285H >= i21) {
                break;
            }
            int i99 = i19;
            int[] iArr12 = iArr11;
            C18558P c18558p3 = c18558p2;
            C17690x c17690x3 = c17690x;
            C18852x c18852x3 = c18852x;
            String str2 = str;
            int i100 = i80;
            int i101 = length8;
            int i102 = i14;
            long j14 = j10;
            int[] iArr13 = iArrCopyOf;
            C0326m c0326m6 = c0326m5;
            int i103 = i72;
            int i104 = i45;
            int[] iArr14 = iArrCopyOf2;
            int[] iArr15 = iArrCopyOf3;
            long jM20146a3 = c18839k3.m20146a(c18834f2, iM19285H, iM7714c2);
            int i105 = (int) (jM20146a3 & 4294967295L);
            int i106 = (int) (jM20146a3 >> 32);
            int i107 = i105 - i106;
            c0420b.m1041D(iM19285H, i107 != 1 ? -2 : i106);
            c0326m5 = c0326m6;
            C18845q c18845qM957p4 = c0326m5.m957p(iM19285H, jM20146a3);
            iArr11 = iArr12;
            int iM7715d4 = m7715d(jM20146a3, iArr11);
            if (i107 != 1) {
                iArrM1063s2 = c0420b.m1063s(iM19285H);
                if (iArrM1063s2 == null) {
                    iArrM1063s2 = new int[i20];
                }
            } else {
                iArrM1063s2 = null;
            }
            int i108 = i106;
            while (i108 < i105) {
                if (iArrM1063s2 != null) {
                    iArrM1063s2[i108] = iM7715d4 - iArr11[i108];
                }
                iArr15[i108] = iM19285H;
                iArr11[i108] = c18845qM957p4.f60018m + iM7715d4;
                c17677kArr[i108].addLast(c18845qM957p4);
                i108++;
                i20 = i20;
            }
            int i109 = i20;
            Integer numValueOf = Integer.valueOf(iM19285H);
            C17677k c17677k = (C17677k) c0420b.f1383p0;
            C0420b c0420b2 = c0420b;
            int iM19378g = AbstractC17681o.m19378g(c17677k, 0, c17677k.mo7371f(), new C18838j(1, numValueOf));
            if (iM19378g < 0) {
                if (iArrM1063s2 != null) {
                    c17677k.add(-(iM19378g + 1), new C18837i(iArrM1063s2, iM19285H));
                }
            } else if (iArrM1063s2 == null) {
                c17677k.mo7372j(iM19378g);
            } else {
                ((C18837i) c17677k.get(iM19378g)).f59957b = iArrM1063s2;
            }
            if (iM7715d4 < i77 && iArr11[i106] <= i77) {
                c18845qM957p4.f60017l = false;
            }
            c18839k3 = c18839k;
            i80 = i100;
            str = str2;
            iArrCopyOf3 = iArr15;
            i81 = i99;
            i45 = i104;
            c18558p2 = c18558p3;
            c0420b = c0420b2;
            iArrCopyOf2 = iArr14;
            i72 = i103;
            i12 = i21;
            c17690x = c17690x3;
            iArrCopyOf = iArr13;
            i14 = i102;
            j10 = j14;
            c18852x = c18852x3;
            length8 = i101;
            i18 = i109;
        }
        int i110 = 0;
        while (i110 < i20) {
            C17677k c17677k2 = c17677kArr[i110];
            while (c17677k2.f56476o0 > i22 && !((C18845q) c17677k2.first()).f60017l) {
                C18845q c18845q = (C18845q) c17677k2.removeFirst();
                int[] iArrM1063s4 = c18845q.f60011f != 1 ? c0420b.m1063s(c18845q.f60006a) : null;
                iArrCopyOf2[i110] = iArrCopyOf2[i110] - (c18845q.f60018m + (iArrM1063s4 == null ? 0 : iArrM1063s4[i110]));
                i22 = 1;
            }
            C18845q c18845q2 = (C18845q) c17677k2.m19271q();
            iArrCopyOf[i110] = c18845q2 != null ? c18845q2.f60006a : -1;
            i110++;
            i22 = 1;
        }
        int length10 = iArrCopyOf3.length;
        int i111 = 0;
        while (true) {
            if (i111 >= length10) {
                i23 = i14;
                break;
            }
            if (iArrCopyOf3[i111] == i21 - 1) {
                i23 = i14;
                m7718g(iArr11, -i23);
                break;
            }
            i111++;
        }
        int i112 = 0;
        while (true) {
            if (i112 >= length8) {
                i24 = i45;
                int i113 = i24 - iArr11[m7713b(iArr11)];
                iArr3 = iArrCopyOf2;
                m7718g(iArr3, -i113);
                m7718g(iArr11, i113);
                boolean z22 = false;
                loop36: while (true) {
                    int length11 = iArr3.length;
                    int i114 = 0;
                    while (true) {
                        if (i114 >= length11) {
                            boolean z23 = z22;
                            i25 = i19;
                            c0326m = c0326m5;
                            i26 = i17;
                            iArr4 = iArrCopyOf;
                            i27 = i72;
                            z10 = z23;
                            break loop36;
                        }
                        z11 = z22;
                        int i115 = length11;
                        i29 = i72;
                        if (iArr3[i114] < i29) {
                            break;
                        }
                        i114++;
                        length11 = i115;
                        i72 = i29;
                        i17 = i17;
                        iArrCopyOf = iArrCopyOf;
                        iArrCopyOf3 = iArrCopyOf3;
                        c0326m5 = c0326m5;
                        z22 = z11;
                    }
                    int iM7714c3 = m7714c(iArr3);
                    int iM7713b = m7713b(iArrCopyOf);
                    if (iM7714c3 != iM7713b) {
                        c0326m2 = c0326m5;
                        if (iArr3[iM7714c3] == iArr3[iM7713b]) {
                            iM7714c3 = iM7713b;
                        } else {
                            iM7714c3 = iM7714c3;
                            z10 = true;
                        }
                        i30 = iArrCopyOf[iM7714c3];
                        i25 = i19;
                        if (i30 == -1) {
                            i30 = i21;
                        }
                        iM1059o = c0420b.m1059o(i30, iM7714c3);
                        if (iM1059o < 0) {
                            iArr4 = iArrCopyOf;
                            if ((z10 && !m7717f(iArr4, c18839k3, iArr3, iM7714c3)) || !z6) {
                                int i116 = i17;
                                i27 = i29;
                                i26 = i116;
                                c0326m = c0326m2;
                                break;
                            }
                            c0420b.m1039B();
                            length = iArr4.length;
                            iArr5 = new int[length];
                            for (i31 = 0; i31 < length; i31++) {
                                iArr5[i31] = -1;
                            }
                            length2 = iArr3.length;
                            iArr6 = new int[length2];
                            for (i32 = 0; i32 < length2; i32++) {
                                iArr6[i32] = iArr3[iM7714c3];
                            }
                            return m7716e(c18839k3, i17, iArr5, iArr6, false);
                        }
                        int i117 = i24;
                        int[] iArr16 = iArrCopyOf3;
                        int i118 = i17;
                        iArr7 = iArrCopyOf;
                        int i119 = length8;
                        long jM20146a4 = c18839k3.m20146a(c18834f2, iM1059o, iM7714c3);
                        int i120 = i21;
                        i33 = (int) (jM20146a4 & 4294967295L);
                        z12 = z10;
                        i34 = (int) (jM20146a4 >> 32);
                        i35 = i33 - i34;
                        if (i35 != 1) {
                            i36 = -2;
                        } else {
                            i36 = i34;
                        }
                        c0420b.m1041D(iM1059o, i36);
                        C0326m c0326m7 = c0326m2;
                        c18845qM957p = c0326m7.m957p(iM1059o, jM20146a4);
                        iM7715d = m7715d(jM20146a4, iArr3);
                        if (i35 != 1) {
                            iArrM1063s = c0420b.m1063s(iM1059o);
                        } else {
                            iArrM1063s = null;
                        }
                        i37 = i34;
                        while (i37 < i33) {
                            int i121 = i33;
                            if (iArr3[i37] != iM7715d) {
                                z12 = true;
                            }
                            c17677kArr[i37].addFirst(c18845qM957p);
                            iArr7[i37] = iM1059o;
                            if (iArrM1063s == null) {
                                i38 = 0;
                            } else {
                                i38 = iArrM1063s[i37];
                            }
                            iArr3[i37] = c18845qM957p.f60018m + iM7715d + i38;
                            i37++;
                            i33 = i121;
                            iArrM1063s = iArrM1063s;
                        }
                        z22 = z12;
                        i72 = i29;
                        i24 = i117;
                        i19 = i25;
                        length8 = i119;
                        i21 = i120;
                        i17 = i118;
                        iArrCopyOf = iArr7;
                        iArrCopyOf3 = iArr16;
                        c0326m5 = c0326m7;
                    } else {
                        c0326m2 = c0326m5;
                    }
                    z10 = z11;
                    i30 = iArrCopyOf[iM7714c3];
                    i25 = i19;
                    if (i30 == -1) {
                        i30 = i21;
                    }
                    iM1059o = c0420b.m1059o(i30, iM7714c3);
                    if (iM1059o < 0) {
                        iArr4 = iArrCopyOf;
                        if (z10) {
                            c0420b.m1039B();
                            length = iArr4.length;
                            iArr5 = new int[length];
                            while (i31 < length) {
                                iArr5[i31] = -1;
                            }
                            length2 = iArr3.length;
                            iArr6 = new int[length2];
                            while (i32 < length2) {
                                iArr6[i32] = iArr3[iM7714c3];
                            }
                            return m7716e(c18839k3, i17, iArr5, iArr6, false);
                        }
                        c0420b.m1039B();
                        length = iArr4.length;
                        iArr5 = new int[length];
                        while (i31 < length) {
                            iArr5[i31] = -1;
                        }
                        length2 = iArr3.length;
                        iArr6 = new int[length2];
                        while (i32 < length2) {
                            iArr6[i32] = iArr3[iM7714c3];
                        }
                        return m7716e(c18839k3, i17, iArr5, iArr6, false);
                        int i1110 = i17;
                        i27 = i29;
                        i26 = i1110;
                        c0326m = c0326m2;
                        break;
                    }
                    int i1111 = i24;
                    int[] iArr17 = iArrCopyOf3;
                    int i1112 = i17;
                    iArr7 = iArrCopyOf;
                    int i1113 = length8;
                    long jM20146a5 = c18839k3.m20146a(c18834f2, iM1059o, iM7714c3);
                    int i122 = i21;
                    i33 = (int) (jM20146a5 & 4294967295L);
                    z12 = z10;
                    i34 = (int) (jM20146a5 >> 32);
                    i35 = i33 - i34;
                    if (i35 != 1) {
                        i36 = -2;
                    } else {
                        i36 = i34;
                    }
                    c0420b.m1041D(iM1059o, i36);
                    C0326m c0326m8 = c0326m2;
                    c18845qM957p = c0326m8.m957p(iM1059o, jM20146a5);
                    iM7715d = m7715d(jM20146a5, iArr3);
                    if (i35 != 1) {
                        iArrM1063s = c0420b.m1063s(iM1059o);
                    } else {
                        iArrM1063s = null;
                    }
                    i37 = i34;
                    while (i37 < i33) {
                        int i123 = i33;
                        if (iArr3[i37] != iM7715d) {
                            z12 = true;
                        }
                        c17677kArr[i37].addFirst(c18845qM957p);
                        iArr7[i37] = iM1059o;
                        if (iArrM1063s == null) {
                            i38 = 0;
                        } else {
                            i38 = iArrM1063s[i37];
                        }
                        iArr3[i37] = c18845qM957p.f60018m + iM7715d + i38;
                        i37++;
                        i33 = i123;
                        iArrM1063s = iArrM1063s;
                    }
                    z22 = z12;
                    i72 = i29;
                    i24 = i1111;
                    i19 = i25;
                    length8 = i1113;
                    i21 = i122;
                    i17 = i1112;
                    iArrCopyOf = iArr7;
                    iArrCopyOf3 = iArr17;
                    c0326m5 = c0326m8;
                }
                if (!z10 || !z6) {
                    i28 = i113 + i26;
                    int i124 = iArr3[m7714c(iArr3)];
                    if (i124 < 0) {
                        i28 += i124;
                        m7718g(iArr11, i124);
                        m7718g(iArr3, -i124);
                    }
                    break;
                }
                c0420b.m1039B();
                return m7716e(c18839k3, i26, iArr4, iArr3, false);
            }
            int i125 = i45;
            if (iArr11[i112] >= i125) {
                i24 = i125;
                i25 = i19;
                i21 = i21;
                c0326m = c0326m5;
                i28 = i17;
                iArr4 = iArrCopyOf;
                iArr3 = iArrCopyOf2;
                iArrCopyOf3 = iArrCopyOf3;
                length8 = length8;
                i27 = i72;
                break;
            }
            i112++;
            i45 = i125;
        }
        float f10 = (Integer.signum(Math.round(c18852x.f60054m)) != Integer.signum(i28) || Math.abs(Math.round(c18852x.f60054m)) < Math.abs(i28)) ? c18852x.f60054m : i28;
        int[] iArrCopyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        AbstractC16544l.m18093f(iArrCopyOf4, str);
        int length12 = iArrCopyOf4.length;
        for (int i126 = 0; i126 < length12; i126++) {
            iArrCopyOf4[i126] = -iArrCopyOf4[i126];
        }
        int i127 = i27;
        if (i127 > i23) {
            for (int i128 = 0; i128 < i20; i128++) {
                C17677k c17677k3 = c17677kArr[i128];
                int i129 = c17677k3.f56476o0;
                int i130 = 0;
                while (i130 < i129) {
                    C18845q c18845q3 = (C18845q) c17677k3.get(i130);
                    int i131 = i129;
                    int[] iArrM1063s5 = c0420b.m1063s(c18845q3.f60006a);
                    int i132 = c18845q3.f60018m + (iArrM1063s5 == null ? 0 : iArrM1063s5[i128]);
                    if (i130 == AbstractC17681o.m19381j(c17677k3) || (i42 = iArr3[i128]) == 0 || i42 < i132) {
                        break;
                    }
                    iArr3[i128] = i42 - i132;
                    i130++;
                    iArr4[i128] = ((C18845q) c17677k3.get(i130)).f60006a;
                    i129 = i131;
                }
            }
        }
        int i133 = i127 + i78;
        boolean z24 = c18839k3.f59965f;
        if (z24) {
            iM9965h = C7536a.m7854i(j10);
            j11 = j10;
        } else {
            j11 = j10;
            iM9965h = AbstractC9388w4.m9965h(AbstractC17678l.m19285H(iArr11) + i133, j11);
        }
        long j15 = j11;
        int iM9964g = z24 ? AbstractC9388w4.m9964g(AbstractC17678l.m19285H(iArr11) + i133, j11) : C7536a.m7853h(j11);
        int iMin = (Math.min(z24 ? iM9964g : iM9965h, i24) - i127) + i78;
        int i134 = iArrCopyOf4[0];
        ?? r10 = c18839k3.f59961b;
        int size = r10.size() - 1;
        if (size >= 0) {
            int i135 = size;
            arrayList2 = null;
            while (true) {
                int i136 = i135 - 1;
                int iIntValue = ((Number) r10.get(i135)).intValue();
                z13 = z24;
                int iM1065u = c0420b.m1065u(iIntValue);
                i40 = iM9965h;
                if (iM1065u == -2 || iM1065u == -1) {
                    int i137 = 0;
                    while (true) {
                        if (i137 < i20) {
                            C18845q c18845q4 = (C18845q) c17677kArr[i137].m19271q();
                            if ((c18845q4 != null ? c18845q4.f60006a : -1) > iIntValue) {
                                i137++;
                            }
                        }
                    }
                } else {
                    C18845q c18845q5 = (C18845q) c17677kArr[iM1065u].m19271q();
                    z18 = (c18845q5 != null ? c18845q5.f60006a : -1) > iIntValue;
                }
                i39 = i133;
                if (z18) {
                    c18834f = c18834f2;
                    long jM20146a6 = c18839k3.m20146a(c18834f, iIntValue, 0);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    List list = arrayList2;
                    C18845q c18845qM957p5 = c0326m.m957p(iIntValue, jM20146a6);
                    i134 -= c18845qM957p5.f60018m;
                    c18845qM957p5.m20149m(i134, 0, iMin);
                    list.add(c18845qM957p5);
                    arrayList2 = list;
                } else {
                    c18834f = c18834f2;
                }
                if (i136 < 0) {
                    break;
                }
                iM9965h = i40;
                i133 = i39;
                i135 = i136;
                c18852x = c18852x;
                c18834f2 = c18834f;
                z24 = z13;
            }
        } else {
            i39 = i133;
            z13 = z24;
            i40 = iM9965h;
            c18834f = c18834f2;
            c18852x = c18852x;
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = c17689w;
        }
        int i138 = 0;
        for (int i139 = 0; i139 < i20; i139++) {
            i138 += c17677kArr[i139].f56476o0;
        }
        ArrayList arrayList3 = new ArrayList(i138);
        loop25: while (true) {
            int i140 = 0;
            while (true) {
                if (i140 >= i20) {
                    break loop25;
                }
                if (!c17677kArr[i140].isEmpty()) {
                    break;
                }
                i140++;
            }
            int i141 = Integer.MAX_VALUE;
            int i142 = -1;
            for (int i143 = 0; i143 < i20; i143++) {
                C18845q c18845q6 = (C18845q) c17677kArr[i143].m19271q();
                int i144 = c18845q6 != null ? c18845q6.f60006a : Integer.MAX_VALUE;
                if (i141 > i144) {
                    i142 = i143;
                    i141 = i144;
                }
            }
            C18845q c18845q7 = (C18845q) c17677kArr[i142].removeFirst();
            int i145 = c18845q7.f60010e;
            if (i145 == i142) {
                int[] iArr18 = iArr11;
                int[] iArr19 = iArr3;
                long j16 = (((long) i145) << 32) | (((long) (c18845q7.f60011f + i145)) & 4294967295L);
                int iM7715d5 = m7715d(j16, iArrCopyOf4);
                c18845q7.m20149m(iM7715d5, c18839k3.f59963d.f60029a[i142], iMin);
                arrayList3.add(c18845q7);
                C0326m c0326m9 = c0326m;
                ArrayList arrayList4 = arrayList3;
                int i146 = (int) (j16 & 4294967295L);
                for (int i147 = (int) (j16 >> 32); i147 < i146; i147++) {
                    iArrCopyOf4[i147] = c18845q7.f60018m + iM7715d5;
                }
                c0326m = c0326m9;
                iArr11 = iArr18;
                iArr3 = iArr19;
                arrayList3 = arrayList4;
            }
        }
        C0326m c0326m10 = c0326m;
        ArrayList arrayList5 = arrayList3;
        int[] iArr20 = iArr11;
        int[] iArr21 = iArr3;
        int i148 = iArrCopyOf4[0];
        int i149 = 0;
        for (int size2 = r10.size(); i149 < size2; size2 = size2) {
            int iIntValue2 = ((Number) r10.get(i149)).intValue();
            int i150 = i21;
            if (iIntValue2 < i150) {
                int iM1065u2 = c0420b.m1065u(iIntValue2);
                if (iM1065u2 == -2 || iM1065u2 == -1) {
                    iArr8 = iArrCopyOf3;
                    int length13 = iArr8.length;
                    int i151 = 0;
                    while (true) {
                        if (i151 < length13) {
                            if (iArr8[i151] < iIntValue2) {
                                i151++;
                            } else {
                                z17 = false;
                            }
                        }
                    }
                } else {
                    if (iArrCopyOf3[iM1065u2] < iIntValue2) {
                        iArr8 = iArrCopyOf3;
                    }
                    iArr8 = iArrCopyOf3;
                    z17 = false;
                }
                z17 = true;
            } else {
                iArr8 = iArrCopyOf3;
                z17 = false;
            }
            if (z17) {
                C0326m c0326m11 = c0326m10;
                long jM20146a7 = c18839k3.m20146a(c18834f, iIntValue2, 0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList6 = arrayList;
                c0326m3 = c0326m11;
                C18845q c18845qM957p6 = c0326m3.m957p(iIntValue2, jM20146a7);
                c18845qM957p6.m20149m(i148, 0, iMin);
                i148 += c18845qM957p6.f60018m;
                arrayList6.add(c18845qM957p6);
                arrayList = arrayList6;
            } else {
                c0326m3 = c0326m10;
            }
            i149++;
            c0326m10 = c0326m3;
            i21 = i150;
            iArrCopyOf3 = iArr8;
        }
        C0326m c0326m12 = c0326m10;
        int[] iArr22 = iArrCopyOf3;
        int i152 = i21;
        Collection collection = arrayList == null ? c17689w : arrayList;
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList2);
        arrayList7.addAll(arrayList5);
        arrayList7.addAll(collection);
        int i153 = (int) f10;
        C0420b c0420b3 = ((C18834f) c0326m12.f1140b).f59942c;
        if (iArr21.length == 0) {
            throw new NoSuchElementException();
        }
        int i154 = iArr21[0];
        int length14 = iArr21.length - 1;
        if (1 <= length14) {
            int i155 = i154;
            int i156 = 1;
            while (true) {
                int i157 = iArr21[i156];
                if (i155 > i157) {
                    i155 = i157;
                }
                if (i156 == length14) {
                    break;
                }
                i156++;
            }
            i154 = i155;
        }
        C18852x c18852x4 = c18852x;
        C18558P c18558p4 = c18558p2;
        C18834f c18834f4 = c18834f;
        int[] iArr23 = iArr4;
        int i158 = i24;
        c18852x4.f60059r.m11266d(i153, i40, iM9964g, arrayList7, c0420b3, c0326m12, c18839k3.f59965f, false, c18839k3.f59977r, false, i154, AbstractC17678l.m19285H(iArr20) + i39, c2925c, c18839k3.f59974o);
        long jM11265b2 = c18852x4.f60059r.m11265b();
        if (C7545j.m7886a(jM11265b2, 0L)) {
            iM9965h2 = i40;
            i41 = iM9964g;
        } else {
            int i159 = z13 ? iM9964g : i40;
            iM9965h2 = AbstractC9388w4.m9965h(Math.max(i40, (int) (jM11265b2 >> 32)), j15);
            int iM9964g2 = AbstractC9388w4.m9964g(Math.max(iM9964g, (int) (jM11265b2 & 4294967295L)), j15);
            int i160 = z13 ? iM9964g2 : iM9965h2;
            if (i160 != i159) {
                int size3 = arrayList7.size();
                for (int i161 = 0; i161 < size3; i161++) {
                    C18845q c18845q8 = (C18845q) arrayList7.get(i161);
                    c18845q8.f60019n = i160;
                    c18845q8.f60021p = c18845q8.f60013h + i160;
                }
            }
            i41 = iM9964g2;
        }
        int i162 = length8;
        int i163 = 0;
        while (true) {
            if (i163 >= i162) {
                z14 = false;
                break;
            }
            if (iArr20[i163] > i158) {
                z14 = true;
                break;
            }
            i163++;
        }
        if (z14) {
            z15 = true;
        } else {
            int length15 = iArr22.length;
            int i164 = 0;
            while (true) {
                if (i164 >= length15) {
                    z16 = true;
                    break;
                }
                if (!(iArr22[i164] < i152 + (-1))) {
                    z16 = false;
                    break;
                }
                i164++;
            }
            if (z16) {
                z15 = true;
            } else {
                z15 = false;
            }
        }
        return new C18842n(iArr23, iArr21, f10, c18558p4.mo19936R(iM9965h2, i41, c17690x, new C18194a(arrayList7, 2, c18839k3)), z15, c18839k3.f59965f, z21, c18839k3.f59963d, c18834f4.f59941b.f59939c, i152, arrayList5, AbstractC9113C4.m9643a(iM9965h2, i41), i80, i25, c18839k3.f59969j, c18839k3.f59970k, c18839k3.f59972m);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m7717f(int[] iArr, C18839k c18839k, int[] iArr2, int i10) {
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            C0420b c0420b = c18839k.f59976q;
            if (i11 >= length) {
                int length2 = iArr.length;
                for (int i12 = 0; i12 < length2; i12++) {
                    if (c0420b.m1059o(iArr[i12], i12) != -1 && iArr2[i12] >= iArr2[i10]) {
                        return true;
                    }
                }
                int iM1065u = c0420b.m1065u(0);
                return (iM1065u == 0 || iM1065u == -1 || iM1065u == -2) ? false : true;
            }
            if (c0420b.m1059o(iArr[i11], i11) == -1 && iArr2[i11] != iArr2[i10]) {
                return true;
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m7718g(int[] iArr, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = iArr[i11] + i10;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final List m7719h(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? DesugarCollections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(AbstractC17680n.m19341Q(arrayList));
        }
        return C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: i */
    public static final Map m7720i(Map map) {
        int size = map.size();
        if (size == 0) {
            return C17690x.f56481Y;
        }
        if (size != 1) {
            return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) AbstractC17680n.m19340P(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
