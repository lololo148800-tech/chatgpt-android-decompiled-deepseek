package mm;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mm.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C17319v implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final int f55151Y;

    public /* synthetic */ C17319v(int i10) {
        this.f55151Y = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC16544l.m18096i(this.f55151Y ^ Integer.MIN_VALUE, ((C17319v) obj).f55151Y ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17319v) {
            return this.f55151Y == ((C17319v) obj).f55151Y;
        }
        return false;
    }

    public final int hashCode() {
        return this.f55151Y;
    }

    public final String toString() {
        return String.valueOf(((long) this.f55151Y) & 4294967295L);
    }
}
