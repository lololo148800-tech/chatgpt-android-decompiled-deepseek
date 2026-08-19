package p413Qo;

/* JADX INFO: renamed from: Qo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6763a {

    /* JADX INFO: renamed from: a */
    public final int f21692a;

    /* JADX INFO: renamed from: b */
    public final double f21693b;

    /* JADX INFO: renamed from: c */
    public final double f21694c;

    public C6763a(double d10) {
        int i10 = (int) (0.6366197723675814d * d10);
        while (true) {
            double d11 = -i10;
            double d12 = 1.570796251296997d * d11;
            double d13 = d10 + d12;
            double d14 = 7.549789948768648E-8d * d11;
            double d15 = d14 + d13;
            double d16 = (-((d13 - d10) - d12)) + (-((d15 - d13) - d14));
            double d17 = d11 * 6.123233995736766E-17d;
            double d18 = d17 + d15;
            double d19 = d16 + (-((d18 - d15) - d17));
            if (d18 > 0.0d) {
                this.f21692a = i10;
                this.f21693b = d18;
                this.f21694c = d19;
                return;
            }
            i10--;
        }
    }
}
