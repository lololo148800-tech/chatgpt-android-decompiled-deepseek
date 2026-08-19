package p800i4;

import p1073w3.AbstractC20817s;
import p372P3.C6309A;
import p372P3.C6311C;

/* JADX INFO: renamed from: i4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C14927g implements InterfaceC14926f {

    /* JADX INFO: renamed from: a */
    public final long[] f46508a;

    /* JADX INFO: renamed from: b */
    public final long[] f46509b;

    /* JADX INFO: renamed from: c */
    public final long f46510c;

    /* JADX INFO: renamed from: d */
    public final long f46511d;

    /* JADX INFO: renamed from: e */
    public final int f46512e;

    public C14927g(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f46508a = jArr;
        this.f46509b = jArr2;
        this.f46510c = j10;
        this.f46511d = j11;
        this.f46512e = i10;
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: b */
    public final long mo16087b() {
        return this.f46511d;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return true;
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: e */
    public final long mo16088e(long j10) {
        return this.f46508a[AbstractC20817s.m21404e(this.f46509b, j10, true)];
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        long[] jArr = this.f46508a;
        int iM21404e = AbstractC20817s.m21404e(jArr, j10, true);
        long j11 = jArr[iM21404e];
        long[] jArr2 = this.f46509b;
        C6311C c6311c = new C6311C(j11, jArr2[iM21404e]);
        if (j11 >= j10 || iM21404e == jArr.length - 1) {
            return new C6309A(c6311c, c6311c);
        }
        int i10 = iM21404e + 1;
        return new C6309A(c6311c, new C6311C(jArr[i10], jArr2[i10]));
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: k */
    public final int mo16089k() {
        return this.f46512e;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        return this.f46510c;
    }
}
