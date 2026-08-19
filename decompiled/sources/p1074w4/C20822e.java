package p1074w4;

import java.math.RoundingMode;
import p1073w3.AbstractC20817s;
import p350O1.C6061j;
import p372P3.C6309A;
import p372P3.C6311C;
import p372P3.InterfaceC6310B;

/* JADX INFO: renamed from: w4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C20822e implements InterfaceC6310B {

    /* JADX INFO: renamed from: a */
    public final C6061j f66149a;

    /* JADX INFO: renamed from: b */
    public final int f66150b;

    /* JADX INFO: renamed from: c */
    public final long f66151c;

    /* JADX INFO: renamed from: d */
    public final long f66152d;

    /* JADX INFO: renamed from: e */
    public final long f66153e;

    public C20822e(C6061j c6061j, int i10, long j10, long j11) {
        this.f66149a = c6061j;
        this.f66150b = i10;
        this.f66151c = j10;
        long j12 = (j11 - j10) / ((long) c6061j.f19746p0);
        this.f66152d = j12;
        this.f66153e = m21430a(j12);
    }

    /* JADX INFO: renamed from: a */
    public final long m21430a(long j10) {
        long j11 = j10 * ((long) this.f66150b);
        long j12 = this.f66149a.f19745o0;
        int i10 = AbstractC20817s.f66106a;
        return AbstractC20817s.m21396J(j11, 1000000L, j12, RoundingMode.FLOOR);
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return true;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        C6061j c6061j = this.f66149a;
        long j11 = (((long) c6061j.f19745o0) * j10) / (((long) this.f66150b) * 1000000);
        long j12 = this.f66152d;
        long jM21409j = AbstractC20817s.m21409j(j11, 0L, j12 - 1);
        long j13 = ((long) c6061j.f19746p0) * jM21409j;
        long j14 = this.f66151c;
        long jM21430a = m21430a(jM21409j);
        C6311C c6311c = new C6311C(jM21430a, j13 + j14);
        if (jM21430a >= j10 || jM21409j == j12 - 1) {
            return new C6309A(c6311c, c6311c);
        }
        long j15 = jM21409j + 1;
        return new C6309A(c6311c, new C6311C(m21430a(j15), (((long) c6061j.f19746p0) * j15) + j14));
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        return this.f66153e;
    }
}
