package p444S4;

import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: S4.z */
/* JADX INFO: loaded from: classes.dex */
public final class C7020z {

    /* JADX INFO: renamed from: a */
    public final UUID f22439a;

    /* JADX INFO: renamed from: b */
    public final EnumC7019y f22440b;

    /* JADX INFO: renamed from: c */
    public final HashSet f22441c;

    /* JADX INFO: renamed from: d */
    public final C7001g f22442d;

    /* JADX INFO: renamed from: e */
    public final C7001g f22443e;

    /* JADX INFO: renamed from: f */
    public final int f22444f;

    /* JADX INFO: renamed from: g */
    public final int f22445g;

    /* JADX INFO: renamed from: h */
    public final C6998d f22446h;

    /* JADX INFO: renamed from: i */
    public final long f22447i;

    /* JADX INFO: renamed from: j */
    public final C7018x f22448j;

    /* JADX INFO: renamed from: k */
    public final long f22449k;

    /* JADX INFO: renamed from: l */
    public final int f22450l;

    public C7020z(UUID uuid, EnumC7019y enumC7019y, HashSet hashSet, C7001g c7001g, C7001g c7001g2, int i10, int i11, C6998d c6998d, long j10, C7018x c7018x, long j11, int i12) {
        this.f22439a = uuid;
        this.f22440b = enumC7019y;
        this.f22441c = hashSet;
        this.f22442d = c7001g;
        this.f22443e = c7001g2;
        this.f22444f = i10;
        this.f22445g = i11;
        this.f22446h = c6998d;
        this.f22447i = j10;
        this.f22448j = c7018x;
        this.f22449k = j11;
        this.f22450l = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C7020z.class.equals(obj.getClass())) {
            return false;
        }
        C7020z c7020z = (C7020z) obj;
        if (this.f22444f == c7020z.f22444f && this.f22445g == c7020z.f22445g && this.f22439a.equals(c7020z.f22439a) && this.f22440b == c7020z.f22440b && this.f22442d.equals(c7020z.f22442d) && this.f22446h.equals(c7020z.f22446h) && this.f22447i == c7020z.f22447i && AbstractC16544l.m18089b(this.f22448j, c7020z.f22448j) && this.f22449k == c7020z.f22449k && this.f22450l == c7020z.f22450l && this.f22441c.equals(c7020z.f22441c)) {
            return this.f22443e.equals(c7020z.f22443e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f22446h.hashCode() + ((((((this.f22443e.hashCode() + ((this.f22441c.hashCode() + ((this.f22442d.hashCode() + ((this.f22440b.hashCode() + (this.f22439a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f22444f) * 31) + this.f22445g) * 31)) * 31;
        long j10 = this.f22447i;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        C7018x c7018x = this.f22448j;
        int iHashCode2 = (i10 + (c7018x != null ? c7018x.hashCode() : 0)) * 31;
        long j11 = this.f22449k;
        return ((iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f22450l;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f22439a + "', state=" + this.f22440b + ", outputData=" + this.f22442d + ", tags=" + this.f22441c + ", progress=" + this.f22443e + ", runAttemptCount=" + this.f22444f + ", generation=" + this.f22445g + ", constraints=" + this.f22446h + ", initialDelayMillis=" + this.f22447i + ", periodicityInfo=" + this.f22448j + ", nextScheduleTimeMillis=" + this.f22449k + "}, stopReason=" + this.f22450l;
    }
}
