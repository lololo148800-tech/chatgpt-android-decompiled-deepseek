package p372P3;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: P3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6328j implements InterfaceC6310B {

    /* JADX INFO: renamed from: a */
    public final int f20532a;

    /* JADX INFO: renamed from: b */
    public final int[] f20533b;

    /* JADX INFO: renamed from: c */
    public final long[] f20534c;

    /* JADX INFO: renamed from: d */
    public final long[] f20535d;

    /* JADX INFO: renamed from: e */
    public final long[] f20536e;

    /* JADX INFO: renamed from: f */
    public final long f20537f;

    public C6328j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f20533b = iArr;
        this.f20534c = jArr;
        this.f20535d = jArr2;
        this.f20536e = jArr3;
        int length = iArr.length;
        this.f20532a = length;
        if (length > 0) {
            this.f20537f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f20537f = 0L;
        }
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return true;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        long[] jArr = this.f20536e;
        int iM21404e = AbstractC20817s.m21404e(jArr, j10, true);
        long j11 = jArr[iM21404e];
        long[] jArr2 = this.f20534c;
        C6311C c6311c = new C6311C(j11, jArr2[iM21404e]);
        if (j11 >= j10 || iM21404e == this.f20532a - 1) {
            return new C6309A(c6311c, c6311c);
        }
        int i10 = iM21404e + 1;
        return new C6309A(c6311c, new C6311C(jArr[i10], jArr2[i10]));
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        return this.f20537f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f20532a + ", sizes=" + Arrays.toString(this.f20533b) + ", offsets=" + Arrays.toString(this.f20534c) + ", timeUs=" + Arrays.toString(this.f20536e) + ", durationsUs=" + Arrays.toString(this.f20535d) + Separators.RPAREN;
    }
}
