package p114E8;

import java.math.BigDecimal;
import java.math.BigInteger;
import p164G8.AbstractC3010d;
import p164G8.C3007a;

/* JADX INFO: renamed from: E8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2355b implements InterfaceC2357d {

    /* JADX INFO: renamed from: c */
    public static final BigInteger f7309c = new BigInteger("1111111111111111111");

    /* JADX INFO: renamed from: d */
    public static final BigDecimal f7310d = new BigDecimal(AbstractC3010d.f9061C0);

    /* JADX INFO: renamed from: e */
    public static final BigInteger f7311e = new BigInteger("2").pow(64);

    /* JADX INFO: renamed from: a */
    public final BigInteger f7312a;

    /* JADX INFO: renamed from: b */
    public final double f7313b;

    public C2355b(double d10) {
        this.f7313b = d10;
        this.f7312a = new BigDecimal(d10).multiply(f7310d).toBigInteger();
    }

    @Override // p114E8.InterfaceC2358e
    /* JADX INFO: renamed from: a */
    public final boolean mo3438a(C3007a c3007a) {
        double d10 = this.f7313b;
        if (d10 == 1.0d) {
            return true;
        }
        return d10 != 0.0d && c3007a.f9032a.f9042e.multiply(f7309c).mod(f7311e).compareTo(this.f7312a) < 0;
    }
}
