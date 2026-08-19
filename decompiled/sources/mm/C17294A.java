package mm;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mm.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C17294A implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final short f55117Y;

    public /* synthetic */ C17294A(short s10) {
        this.f55117Y = s10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC16544l.m18096i(this.f55117Y & 65535, ((C17294A) obj).f55117Y & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17294A) {
            return this.f55117Y == ((C17294A) obj).f55117Y;
        }
        return false;
    }

    public final int hashCode() {
        return this.f55117Y;
    }

    public final String toString() {
        return String.valueOf(65535 & this.f55117Y);
    }
}
