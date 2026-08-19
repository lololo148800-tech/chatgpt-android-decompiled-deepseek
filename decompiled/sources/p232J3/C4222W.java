package p232J3;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: J3.W */
/* JADX INFO: loaded from: classes.dex */
public final class C4222W {

    /* JADX INFO: renamed from: a */
    public final Random f13793a;

    /* JADX INFO: renamed from: b */
    public final int[] f13794b;

    /* JADX INFO: renamed from: c */
    public final int[] f13795c;

    public C4222W() {
        this(new Random());
    }

    /* JADX INFO: renamed from: a */
    public final C4222W m4987a(int i10) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            random = this.f13793a;
            iArr = this.f13794b;
            if (i11 >= i10) {
                break;
            }
            iArr2[i11] = random.nextInt(iArr.length + 1);
            int i12 = i11 + 1;
            int iNextInt = random.nextInt(i12);
            iArr3[i11] = iArr3[iNextInt];
            iArr3[iNextInt] = i11;
            i11 = i12;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i10];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length + i10; i15++) {
            if (i13 >= i10 || i14 != iArr2[i13]) {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                iArr4[i15] = i17;
                if (i17 >= 0) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            } else {
                iArr4[i15] = iArr3[i13];
                i13++;
            }
        }
        return new C4222W(iArr4, new Random(random.nextLong()));
    }

    public C4222W(int[] iArr, Random random) {
        this.f13794b = iArr;
        this.f13793a = random;
        this.f13795c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f13795c[iArr[i10]] = i10;
        }
    }

    public C4222W(Random random) {
        this(new int[0], random);
    }
}
