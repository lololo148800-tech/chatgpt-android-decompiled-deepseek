package p372P3;

import java.util.Collections;
import java.util.List;
import p1016t3.C19755E;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p1097x3.AbstractC21121g;
import p1097x3.C21118d;

/* JADX INFO: renamed from: P3.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6342x {

    /* JADX INFO: renamed from: a */
    public final List f20581a;

    /* JADX INFO: renamed from: b */
    public final int f20582b;

    /* JADX INFO: renamed from: c */
    public final int f20583c;

    /* JADX INFO: renamed from: d */
    public final int f20584d;

    /* JADX INFO: renamed from: e */
    public final int f20585e;

    /* JADX INFO: renamed from: f */
    public final int f20586f;

    /* JADX INFO: renamed from: g */
    public final int f20587g;

    /* JADX INFO: renamed from: h */
    public final float f20588h;

    /* JADX INFO: renamed from: i */
    public final int f20589i;

    /* JADX INFO: renamed from: j */
    public final String f20590j;

    public C6342x(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16, String str) {
        this.f20581a = list;
        this.f20582b = i10;
        this.f20583c = i11;
        this.f20584d = i12;
        this.f20585e = i13;
        this.f20586f = i14;
        this.f20587g = i15;
        this.f20588h = f10;
        this.f20589i = i16;
        this.f20590j = str;
    }

    /* JADX INFO: renamed from: a */
    public static C6342x m6958a(C20811m c20811m) throws C19755E {
        try {
            c20811m.m21345G(21);
            int iM21365t = c20811m.m21365t() & 3;
            int iM21365t2 = c20811m.m21365t();
            int i10 = c20811m.f66093b;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iM21365t2; i13++) {
                c20811m.m21345G(1);
                int iM21371z = c20811m.m21371z();
                for (int i14 = 0; i14 < iM21371z; i14++) {
                    int iM21371z2 = c20811m.m21371z();
                    i12 += iM21371z2 + 4;
                    c20811m.m21345G(iM21371z2);
                }
            }
            c20811m.m21344F(i10);
            byte[] bArr = new byte[i12];
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            float f10 = 1.0f;
            String strM21314b = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 < iM21365t2) {
                int iM21365t3 = c20811m.m21365t() & 63;
                int iM21371z3 = c20811m.m21371z();
                int i23 = i11;
                while (i23 < iM21371z3) {
                    int iM21371z4 = c20811m.m21371z();
                    int i24 = iM21365t2;
                    System.arraycopy(AbstractC21121g.f67114a, i11, bArr, i22, 4);
                    int i25 = i22 + 4;
                    System.arraycopy(c20811m.f66092a, c20811m.f66093b, bArr, i25, iM21371z4);
                    if (iM21365t3 == 33 && i23 == 0) {
                        C21118d c21118dM21586c = AbstractC21121g.m21586c(bArr, i25, i25 + iM21371z4);
                        int i26 = c21118dM21586c.f67082e + 8;
                        i16 = c21118dM21586c.f67083f + 8;
                        i17 = c21118dM21586c.f67090m;
                        int i27 = c21118dM21586c.f67091n;
                        int i28 = c21118dM21586c.f67092o;
                        float f11 = c21118dM21586c.f67088k;
                        int i29 = c21118dM21586c.f67089l;
                        i15 = i26;
                        strM21314b = AbstractC20800b.m21314b(c21118dM21586c.f67078a, c21118dM21586c.f67079b, c21118dM21586c.f67080c, c21118dM21586c.f67081d, c21118dM21586c.f67084g, c21118dM21586c.f67085h);
                        i19 = i28;
                        i18 = i27;
                        i20 = i29;
                        f10 = f11;
                    }
                    i22 = i25 + iM21371z4;
                    c20811m.m21345G(iM21371z4);
                    i23++;
                    iM21365t2 = i24;
                    iM21365t3 = iM21365t3;
                    iM21371z3 = iM21371z3;
                    i11 = 0;
                }
                i21++;
                i11 = 0;
            }
            return new C6342x(i12 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iM21365t + 1, i15, i16, i17, i18, i19, f10, i20, strM21314b);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C19755E.m20712a(e10, "Error parsing HEVC config");
        }
    }
}
