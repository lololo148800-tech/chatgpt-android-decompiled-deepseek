package p658b5;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: b5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11233d {

    /* JADX INFO: renamed from: a */
    public final String f33998a;

    /* JADX INFO: renamed from: b */
    public final Long f33999b;

    public C11233d(String str, Long l4) {
        this.f33998a = str;
        this.f33999b = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11233d)) {
            return false;
        }
        C11233d c11233d = (C11233d) obj;
        return AbstractC16544l.m18089b(this.f33998a, c11233d.f33998a) && AbstractC16544l.m18089b(this.f33999b, c11233d.f33999b);
    }

    public final int hashCode() {
        int iHashCode = this.f33998a.hashCode() * 31;
        Long l4 = this.f33999b;
        return iHashCode + (l4 == null ? 0 : l4.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f33998a + ", value=" + this.f33999b + ')';
    }
}
