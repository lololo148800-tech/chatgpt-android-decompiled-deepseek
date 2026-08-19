package sh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19627i0 {

    /* JADX INFO: renamed from: a */
    public final C19631k0 f62254a;

    public C19627i0(C19631k0 c19631k0) {
        this.f62254a = c19631k0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19627i0) && AbstractC16544l.m18089b(this.f62254a, ((C19627i0) obj).f62254a);
    }

    public final int hashCode() {
        C19631k0 c19631k0 = this.f62254a;
        if (c19631k0 == null) {
            return 0;
        }
        return c19631k0.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
