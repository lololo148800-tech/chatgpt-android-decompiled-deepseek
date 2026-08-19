package p800i4;

import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p372P3.C6309A;
import p372P3.C6311C;

/* JADX INFO: renamed from: i4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C14928h implements InterfaceC14926f {

    /* JADX INFO: renamed from: a */
    public final long f46513a;

    /* JADX INFO: renamed from: b */
    public final int f46514b;

    /* JADX INFO: renamed from: c */
    public final long f46515c;

    /* JADX INFO: renamed from: d */
    public final int f46516d;

    /* JADX INFO: renamed from: e */
    public final long f46517e;

    /* JADX INFO: renamed from: f */
    public final long f46518f;

    /* JADX INFO: renamed from: g */
    public final long[] f46519g;

    public C14928h(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f46513a = j10;
        this.f46514b = i10;
        this.f46515c = j11;
        this.f46516d = i11;
        this.f46517e = j12;
        this.f46519g = jArr;
        this.f46518f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: b */
    public final long mo16087b() {
        return this.f46518f;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return this.f46519g != null;
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: e */
    public final long mo16088e(long j10) {
        long j11 = j10 - this.f46513a;
        if (!mo6853d() || j11 <= this.f46514b) {
            return 0L;
        }
        long[] jArr = this.f46519g;
        AbstractC20800b.m21321i(jArr);
        double d10 = (j11 * 256.0d) / this.f46517e;
        int iM21404e = AbstractC20817s.m21404e(jArr, (long) d10, true);
        long j12 = this.f46515c;
        long j13 = (((long) iM21404e) * j12) / 100;
        long j14 = jArr[iM21404e];
        int i10 = iM21404e + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        long j16 = iM21404e == 99 ? 256L : jArr[i10];
        return Math.round((j14 == j16 ? 0.0d : (d10 - j14) / (j16 - j14)) * (j15 - j13)) + j13;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        double d10;
        boolean zMo6853d = mo6853d();
        int i10 = this.f46514b;
        long j11 = this.f46513a;
        if (!zMo6853d) {
            C6311C c6311c = new C6311C(0L, j11 + ((long) i10));
            return new C6309A(c6311c, c6311c);
        }
        long jM21409j = AbstractC20817s.m21409j(j10, 0L, this.f46515c);
        double d11 = (jM21409j * 100.0d) / this.f46515c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d10 = 256.0d;
        } else if (d11 >= 100.0d) {
            d10 = 256.0d;
            d12 = 256.0d;
        } else {
            int i11 = (int) d11;
            long[] jArr = this.f46519g;
            AbstractC20800b.m21321i(jArr);
            double d13 = jArr[i11];
            d12 = (((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d13) * (d11 - ((double) i11))) + d13;
            d10 = 256.0d;
        }
        double d14 = d12 / d10;
        long j12 = this.f46517e;
        C6311C c6311c2 = new C6311C(jM21409j, j11 + AbstractC20817s.m21409j(Math.round(d14 * j12), i10, j12 - 1));
        return new C6309A(c6311c2, c6311c2);
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: k */
    public final int mo16089k() {
        return this.f46516d;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        return this.f46515c;
    }
}
