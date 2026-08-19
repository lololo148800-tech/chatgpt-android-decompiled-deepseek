package p229J0;

import mm.C17321x;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: J0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4042e0 {

    /* JADX INFO: renamed from: a */
    public final long f12744a;

    /* JADX INFO: renamed from: b */
    public final long f12745b;

    /* JADX INFO: renamed from: c */
    public final long f12746c;

    /* JADX INFO: renamed from: d */
    public final long f12747d;

    public C4042e0(long j10, long j11, long j12, long j13) {
        this.f12744a = j10;
        this.f12745b = j11;
        this.f12746c = j12;
        this.f12747d = j13;
    }

    /* JADX INFO: renamed from: a */
    public final C4042e0 m4731a(long j10, long j11, long j12, long j13) {
        return new C4042e0(j10 != 16 ? j10 : this.f12744a, j11 != 16 ? j11 : this.f12745b, j12 != 16 ? j12 : this.f12746c, j13 != 16 ? j13 : this.f12747d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4042e0)) {
            return false;
        }
        C4042e0 c4042e0 = (C4042e0) obj;
        return C14365u.m15775c(this.f12744a, c4042e0.f12744a) && C14365u.m15775c(this.f12745b, c4042e0.f12745b) && C14365u.m15775c(this.f12746c, c4042e0.f12746c) && C14365u.m15775c(this.f12747d, c4042e0.f12747d);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f12747d) + AbstractC14376f.m15857w(this.f12746c, AbstractC14376f.m15857w(this.f12745b, C17321x.m18981a(this.f12744a) * 31, 31), 31);
    }
}
