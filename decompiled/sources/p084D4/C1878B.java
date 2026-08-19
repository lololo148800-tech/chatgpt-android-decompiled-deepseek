package p084D4;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: D4.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1878B {

    /* JADX INFO: renamed from: a */
    public int[] f5455a;

    /* JADX INFO: renamed from: b */
    public int f5456b;

    /* JADX INFO: renamed from: c */
    public int f5457c;

    /* JADX INFO: renamed from: d */
    public int f5458d;

    public C1878B() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f5458d = iHighestOneBit - 1;
        this.f5455a = new int[iHighestOneBit];
    }

    /* JADX INFO: renamed from: a */
    public void m2860a(int i10) {
        int[] iArr = this.f5455a;
        int i11 = this.f5457c;
        iArr[i11] = i10;
        int i12 = this.f5458d & (i11 + 1);
        this.f5457c = i12;
        int i13 = this.f5456b;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i15];
            AbstractC17678l.m19303j(0, i13, length, iArr, iArr2);
            AbstractC17678l.m19303j(i14, 0, this.f5456b, this.f5455a, iArr2);
            this.f5455a = iArr2;
            this.f5456b = 0;
            this.f5457c = length;
            this.f5458d = i15 - 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2861b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.f5458d;
        int i13 = i12 * 2;
        int[] iArr = this.f5455a;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f5455a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.f5455a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f5455a;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.f5458d++;
    }

    /* JADX INFO: renamed from: c */
    public void m2862c(RecyclerView recyclerView, boolean z6) {
        this.f5458d = 0;
        int[] iArr = this.f5455a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC1900Y abstractC1900Y = recyclerView.f33592B0;
        if (recyclerView.f33590A0 == null || abstractC1900Y == null || !abstractC1900Y.f5550i) {
            return;
        }
        if (z6) {
            if (!recyclerView.f33648s0.m3002j()) {
                abstractC1900Y.mo2959i(recyclerView.f33590A0.mo2898a(), this);
            }
        } else if (!recyclerView.m12265O()) {
            abstractC1900Y.mo2957h(this.f5456b, this.f5457c, recyclerView.f33647r1, this);
        }
        int i10 = this.f5458d;
        if (i10 > abstractC1900Y.f5551j) {
            abstractC1900Y.f5551j = i10;
            abstractC1900Y.f5552k = z6;
            recyclerView.f33644q0.m3038m();
        }
    }
}
