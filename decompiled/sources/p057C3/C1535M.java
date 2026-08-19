package p057C3;

import java.util.Arrays;

/* JADX INFO: renamed from: C3.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1535M {

    /* JADX INFO: renamed from: a */
    public final long f4174a;

    /* JADX INFO: renamed from: b */
    public final float f4175b;

    /* JADX INFO: renamed from: c */
    public final long f4176c;

    public C1535M(C1534L c1534l) {
        this.f4174a = c1534l.f4171a;
        this.f4175b = c1534l.f4172b;
        this.f4176c = c1534l.f4173c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1535M)) {
            return false;
        }
        C1535M c1535m = (C1535M) obj;
        return this.f4174a == c1535m.f4174a && this.f4175b == c1535m.f4175b && this.f4176c == c1535m.f4176c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4174a), Float.valueOf(this.f4175b), Long.valueOf(this.f4176c)});
    }
}
