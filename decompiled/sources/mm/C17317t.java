package mm;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mm.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C17317t implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final byte f55149Y;

    public /* synthetic */ C17317t(byte b) {
        this.f55149Y = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC16544l.m18096i(this.f55149Y & 255, ((C17317t) obj).f55149Y & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17317t) {
            return this.f55149Y == ((C17317t) obj).f55149Y;
        }
        return false;
    }

    public final int hashCode() {
        return this.f55149Y;
    }

    public final String toString() {
        return String.valueOf(this.f55149Y & 255);
    }
}
