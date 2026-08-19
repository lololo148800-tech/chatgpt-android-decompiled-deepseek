package p594Y9;

import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p310M9.C5311e;

/* JADX INFO: renamed from: Y9.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9891g0 {

    /* JADX INFO: renamed from: a */
    public final EnumC9966s3 f29404a;

    /* JADX INFO: renamed from: b */
    public final Boolean f29405b;

    /* JADX INFO: renamed from: c */
    public final C9919k4 f29406c;

    public /* synthetic */ C9891g0(C5311e c5311e) {
        this.f29404a = (EnumC9966s3) c5311e.f17484Z;
        this.f29405b = (Boolean) c5311e.f17485o0;
        this.f29406c = (C9919k4) c5311e.f17486p0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9891g0)) {
            return false;
        }
        C9891g0 c9891g0 = (C9891g0) obj;
        return AbstractC20502t.m21161l(this.f29404a, c9891g0.f29404a) && AbstractC20502t.m21161l(null, null) && AbstractC20502t.m21161l(this.f29405b, c9891g0.f29405b) && AbstractC20502t.m21161l(null, null) && AbstractC20502t.m21161l(this.f29406c, c9891g0.f29406c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29404a, null, this.f29405b, null, this.f29406c});
    }
}
