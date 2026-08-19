package p1016t3;

import java.util.Arrays;
import p1073w3.AbstractC20817s;
import p499U9.AbstractC7589s;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.J */
/* JADX INFO: loaded from: classes.dex */
public final class C19760J {

    /* JADX INFO: renamed from: a */
    public final Object f62568a;

    /* JADX INFO: renamed from: b */
    public final int f62569b;

    /* JADX INFO: renamed from: c */
    public final C19797x f62570c;

    /* JADX INFO: renamed from: d */
    public final Object f62571d;

    /* JADX INFO: renamed from: e */
    public final int f62572e;

    /* JADX INFO: renamed from: f */
    public final long f62573f;

    /* JADX INFO: renamed from: g */
    public final long f62574g;

    /* JADX INFO: renamed from: h */
    public final int f62575h;

    /* JADX INFO: renamed from: i */
    public final int f62576i;

    static {
        AbstractC17792x.m19540w(0, 1, 2, 3, 4);
        AbstractC20817s.m21425z(5);
        AbstractC20817s.m21425z(6);
    }

    public C19760J(Object obj, int i10, C19797x c19797x, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f62568a = obj;
        this.f62569b = i10;
        this.f62570c = c19797x;
        this.f62571d = obj2;
        this.f62572e = i11;
        this.f62573f = j10;
        this.f62574g = j11;
        this.f62575h = i12;
        this.f62576i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19760J.class != obj.getClass()) {
            return false;
        }
        C19760J c19760j = (C19760J) obj;
        return this.f62569b == c19760j.f62569b && this.f62572e == c19760j.f62572e && this.f62573f == c19760j.f62573f && this.f62574g == c19760j.f62574g && this.f62575h == c19760j.f62575h && this.f62576i == c19760j.f62576i && AbstractC7589s.m7931f(this.f62570c, c19760j.f62570c) && AbstractC7589s.m7931f(this.f62568a, c19760j.f62568a) && AbstractC7589s.m7931f(this.f62571d, c19760j.f62571d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f62568a, Integer.valueOf(this.f62569b), this.f62570c, this.f62571d, Integer.valueOf(this.f62572e), Long.valueOf(this.f62573f), Long.valueOf(this.f62574g), Integer.valueOf(this.f62575h), Integer.valueOf(this.f62576i)});
    }
}
