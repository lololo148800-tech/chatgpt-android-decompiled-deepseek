package p349O0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: O0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C5964M {

    /* JADX INFO: renamed from: a */
    public final Integer f19414a;

    /* JADX INFO: renamed from: b */
    public final Object f19415b;

    public C5964M(Integer num, Object obj) {
        this.f19414a = num;
        this.f19415b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5964M)) {
            return false;
        }
        C5964M c5964m = (C5964M) obj;
        return this.f19414a.equals(c5964m.f19414a) && AbstractC16544l.m18089b(this.f19415b, c5964m.f19415b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f19414a.hashCode() * 31;
        Object obj = this.f19415b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f19414a + ", right=" + this.f19415b + ')';
    }
}
