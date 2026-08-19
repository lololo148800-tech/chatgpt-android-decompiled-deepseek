package p846k4;

import java.math.BigInteger;
import p1073w3.AbstractC20817s;
import p372P3.C6309A;
import p372P3.C6311C;
import p372P3.InterfaceC6310B;

/* JADX INFO: renamed from: k4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16332a implements InterfaceC6310B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C16333b f50663a;

    public C16332a(C16333b c16333b) {
        this.f50663a = c16333b;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return true;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        C16333b c16333b = this.f50663a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) c16333b.f50667p0.f50705i) * j10) / 1000000);
        long j11 = c16333b.f50666o0;
        long j12 = c16333b.f50665Z;
        C6311C c6311c = new C6311C(j10, AbstractC20817s.m21409j((bigIntegerValueOf.multiply(BigInteger.valueOf(j11 - j12)).divide(BigInteger.valueOf(c16333b.f50669r0)).longValue() + j12) - 30000, c16333b.f50665Z, j11 - 1));
        return new C6309A(c6311c, c6311c);
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        C16333b c16333b = this.f50663a;
        return (c16333b.f50669r0 * 1000000) / ((long) c16333b.f50667p0.f50705i);
    }
}
