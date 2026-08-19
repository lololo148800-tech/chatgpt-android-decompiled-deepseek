package p797i1;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: i1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14901c {

    /* JADX INFO: renamed from: a */
    public final String f46402a;

    /* JADX INFO: renamed from: b */
    public final long f46403b;

    /* JADX INFO: renamed from: c */
    public final int f46404c;

    public AbstractC14901c(long j10, String str, int i10) {
        this.f46402a = str;
        this.f46403b = j10;
        this.f46404c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo16069a(int i10);

    /* JADX INFO: renamed from: b */
    public abstract float mo16070b(int i10);

    /* JADX INFO: renamed from: c */
    public boolean mo16071c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo16072d(float f10, float f11, float f12);

    /* JADX INFO: renamed from: e */
    public abstract float mo16073e(float f10, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC14901c abstractC14901c = (AbstractC14901c) obj;
        if (this.f46404c == abstractC14901c.f46404c && AbstractC16544l.m18089b(this.f46402a, abstractC14901c.f46402a)) {
            return AbstractC14900b.m16067a(this.f46403b, abstractC14901c.f46403b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo16074f(float f10, float f11, float f12, float f13, AbstractC14901c abstractC14901c);

    public int hashCode() {
        int iHashCode = this.f46402a.hashCode() * 31;
        int i10 = AbstractC14900b.f46401e;
        long j10 = this.f46403b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f46404c;
    }

    public final String toString() {
        return this.f46402a + " (id=" + this.f46404c + ", model=" + ((Object) AbstractC14900b.m16068b(this.f46403b)) + ')';
    }
}
