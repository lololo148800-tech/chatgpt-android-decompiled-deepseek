package p800i4;

import android.util.Pair;
import p1073w3.AbstractC20817s;
import p372P3.C6309A;
import p372P3.C6311C;

/* JADX INFO: renamed from: i4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C14923c implements InterfaceC14926f {

    /* JADX INFO: renamed from: a */
    public final long[] f46485a;

    /* JADX INFO: renamed from: b */
    public final long[] f46486b;

    /* JADX INFO: renamed from: c */
    public final long f46487c;

    public C14923c(long j10, long[] jArr, long[] jArr2) {
        this.f46485a = jArr;
        this.f46486b = jArr2;
        this.f46487c = j10 == -9223372036854775807L ? AbstractC20817s.m21390D(jArr2[jArr2.length - 1]) : j10;
    }

    /* JADX INFO: renamed from: a */
    public static Pair m16091a(long j10, long[] jArr, long[] jArr2) {
        int iM21404e = AbstractC20817s.m21404e(jArr, j10, true);
        long j11 = jArr[iM21404e];
        long j12 = jArr2[iM21404e];
        int i10 = iM21404e + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: b */
    public final long mo16087b() {
        return -1L;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return true;
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: e */
    public final long mo16088e(long j10) {
        return AbstractC20817s.m21390D(((Long) m16091a(j10, this.f46485a, this.f46486b).second).longValue());
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        Pair pairM16091a = m16091a(AbstractC20817s.m21399M(AbstractC20817s.m21409j(j10, 0L, this.f46487c)), this.f46486b, this.f46485a);
        C6311C c6311c = new C6311C(AbstractC20817s.m21390D(((Long) pairM16091a.first).longValue()), ((Long) pairM16091a.second).longValue());
        return new C6309A(c6311c, c6311c);
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: k */
    public final int mo16089k() {
        return -2147483647;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        return this.f46487c;
    }
}
