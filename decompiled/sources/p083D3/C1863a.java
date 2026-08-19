package p083D3;

import java.util.Arrays;
import p1016t3.AbstractC19764N;
import p232J3.C4253y;
import p499U9.AbstractC7589s;

/* JADX INFO: renamed from: D3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1863a {

    /* JADX INFO: renamed from: a */
    public final long f5347a;

    /* JADX INFO: renamed from: b */
    public final AbstractC19764N f5348b;

    /* JADX INFO: renamed from: c */
    public final int f5349c;

    /* JADX INFO: renamed from: d */
    public final C4253y f5350d;

    /* JADX INFO: renamed from: e */
    public final long f5351e;

    /* JADX INFO: renamed from: f */
    public final AbstractC19764N f5352f;

    /* JADX INFO: renamed from: g */
    public final int f5353g;

    /* JADX INFO: renamed from: h */
    public final C4253y f5354h;

    /* JADX INFO: renamed from: i */
    public final long f5355i;

    /* JADX INFO: renamed from: j */
    public final long f5356j;

    public C1863a(long j10, AbstractC19764N abstractC19764N, int i10, C4253y c4253y, long j11, AbstractC19764N abstractC19764N2, int i11, C4253y c4253y2, long j12, long j13) {
        this.f5347a = j10;
        this.f5348b = abstractC19764N;
        this.f5349c = i10;
        this.f5350d = c4253y;
        this.f5351e = j11;
        this.f5352f = abstractC19764N2;
        this.f5353g = i11;
        this.f5354h = c4253y2;
        this.f5355i = j12;
        this.f5356j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1863a.class != obj.getClass()) {
            return false;
        }
        C1863a c1863a = (C1863a) obj;
        return this.f5347a == c1863a.f5347a && this.f5349c == c1863a.f5349c && this.f5351e == c1863a.f5351e && this.f5353g == c1863a.f5353g && this.f5355i == c1863a.f5355i && this.f5356j == c1863a.f5356j && AbstractC7589s.m7931f(this.f5348b, c1863a.f5348b) && AbstractC7589s.m7931f(this.f5350d, c1863a.f5350d) && AbstractC7589s.m7931f(this.f5352f, c1863a.f5352f) && AbstractC7589s.m7931f(this.f5354h, c1863a.f5354h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5347a), this.f5348b, Integer.valueOf(this.f5349c), this.f5350d, Long.valueOf(this.f5351e), this.f5352f, Integer.valueOf(this.f5353g), this.f5354h, Long.valueOf(this.f5355i), Long.valueOf(this.f5356j)});
    }
}
