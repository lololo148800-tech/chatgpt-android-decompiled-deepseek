package p372P3;

import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: P3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C6343y implements InterfaceC6310B {

    /* JADX INFO: renamed from: a */
    public final long[] f20591a;

    /* JADX INFO: renamed from: b */
    public final long[] f20592b;

    /* JADX INFO: renamed from: c */
    public final long f20593c;

    /* JADX INFO: renamed from: d */
    public final boolean f20594d;

    public C6343y(long j10, long[] jArr, long[] jArr2) {
        AbstractC20800b.m21316d(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z6 = length > 0;
        this.f20594d = z6;
        if (!z6 || jArr2[0] <= 0) {
            this.f20591a = jArr;
            this.f20592b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f20591a = jArr3;
            long[] jArr4 = new long[i10];
            this.f20592b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f20593c = j10;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return this.f20594d;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        if (!this.f20594d) {
            C6311C c6311c = C6311C.f20443c;
            return new C6309A(c6311c, c6311c);
        }
        long[] jArr = this.f20592b;
        int iM21404e = AbstractC20817s.m21404e(jArr, j10, true);
        long j11 = jArr[iM21404e];
        long[] jArr2 = this.f20591a;
        C6311C c6311c2 = new C6311C(j11, jArr2[iM21404e]);
        if (j11 == j10 || iM21404e == jArr.length - 1) {
            return new C6309A(c6311c2, c6311c2);
        }
        int i10 = iM21404e + 1;
        return new C6309A(c6311c2, new C6311C(jArr[i10], jArr2[i10]));
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        return this.f20593c;
    }
}
