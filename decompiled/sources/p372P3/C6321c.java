package p372P3;

import java.util.ArrayList;
import p1016t3.C19755E;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p1097x3.AbstractC21121g;
import p1097x3.C21120f;

/* JADX INFO: renamed from: P3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6321c {

    /* JADX INFO: renamed from: a */
    public final ArrayList f20497a;

    /* JADX INFO: renamed from: b */
    public final int f20498b;

    /* JADX INFO: renamed from: c */
    public final int f20499c;

    /* JADX INFO: renamed from: d */
    public final int f20500d;

    /* JADX INFO: renamed from: e */
    public final int f20501e;

    /* JADX INFO: renamed from: f */
    public final int f20502f;

    /* JADX INFO: renamed from: g */
    public final int f20503g;

    /* JADX INFO: renamed from: h */
    public final int f20504h;

    /* JADX INFO: renamed from: i */
    public final int f20505i;

    /* JADX INFO: renamed from: j */
    public final int f20506j;

    /* JADX INFO: renamed from: k */
    public final float f20507k;

    /* JADX INFO: renamed from: l */
    public final String f20508l;

    public C6321c(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f20497a = arrayList;
        this.f20498b = i10;
        this.f20499c = i11;
        this.f20500d = i12;
        this.f20501e = i13;
        this.f20502f = i14;
        this.f20503g = i15;
        this.f20504h = i16;
        this.f20505i = i17;
        this.f20506j = i18;
        this.f20507k = f10;
        this.f20508l = str;
    }

    /* JADX INFO: renamed from: a */
    public static C6321c m6905a(C20811m c20811m) throws C19755E {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        String str;
        int i17;
        try {
            c20811m.m21345G(4);
            int iM21365t = (c20811m.m21365t() & 3) + 1;
            if (iM21365t == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM21365t2 = c20811m.m21365t() & 31;
            int i18 = 0;
            while (true) {
                bArr = AbstractC20800b.f66064a;
                if (i18 >= iM21365t2) {
                    break;
                }
                int iM21371z = c20811m.m21371z();
                int i19 = c20811m.f66093b;
                c20811m.m21345G(iM21371z);
                byte[] bArr2 = c20811m.f66092a;
                byte[] bArr3 = new byte[iM21371z + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i19, bArr3, 4, iM21371z);
                arrayList.add(bArr3);
                i18++;
            }
            int iM21365t3 = c20811m.m21365t();
            for (int i20 = 0; i20 < iM21365t3; i20++) {
                int iM21371z2 = c20811m.m21371z();
                int i21 = c20811m.f66093b;
                c20811m.m21345G(iM21371z2);
                byte[] bArr4 = c20811m.f66092a;
                byte[] bArr5 = new byte[iM21371z2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i21, bArr5, 4, iM21371z2);
                arrayList.add(bArr5);
            }
            if (iM21365t2 > 0) {
                C21120f c21120fM21587d = AbstractC21121g.m21587d((byte[]) arrayList.get(0), iM21365t, ((byte[]) arrayList.get(0)).length);
                int i22 = c21120fM21587d.f67099e;
                int i23 = c21120fM21587d.f67100f;
                int i24 = c21120fM21587d.f67102h + 8;
                int i25 = c21120fM21587d.f67103i + 8;
                int i26 = c21120fM21587d.f67110p;
                int i27 = c21120fM21587d.f67111q;
                int i28 = c21120fM21587d.f67112r;
                int i29 = c21120fM21587d.f67113s;
                float f11 = c21120fM21587d.f67101g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(c21120fM21587d.f67095a), Integer.valueOf(c21120fM21587d.f67096b), Integer.valueOf(c21120fM21587d.f67097c));
                i16 = i28;
                i17 = i29;
                f10 = f11;
                i13 = i25;
                i14 = i26;
                i15 = i27;
                i10 = i22;
                i11 = i23;
                i12 = i24;
            } else {
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                f10 = 1.0f;
                str = null;
                i17 = 16;
            }
            return new C6321c(arrayList, iM21365t, i10, i11, i12, i13, i14, i15, i16, i17, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C19755E.m20712a(e10, "Error parsing AVC config");
        }
    }
}
