package p228J;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p817j$.util.Objects;

/* JADX INFO: renamed from: J.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3841i0 {

    /* JADX INFO: renamed from: a */
    public final boolean f11622a;

    /* JADX INFO: renamed from: b */
    public final Set f11623b;

    /* JADX INFO: renamed from: c */
    public final Set f11624c;

    public C3841i0(boolean z6, HashSet hashSet, HashSet hashSet2) {
        this.f11622a = z6;
        this.f11623b = hashSet == null ? Collections.emptySet() : new HashSet(hashSet);
        this.f11624c = hashSet2 == null ? Collections.emptySet() : new HashSet(hashSet2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4572a(Class cls, boolean z6) {
        if (this.f11623b.contains(cls)) {
            return true;
        }
        if (this.f11624c.contains(cls)) {
            return false;
        }
        return this.f11622a && z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3841i0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C3841i0 c3841i0 = (C3841i0) obj;
        return this.f11622a == c3841i0.f11622a && Objects.equals(this.f11623b, c3841i0.f11623b) && Objects.equals(this.f11624c, c3841i0.f11624c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f11622a), this.f11623b, this.f11624c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f11622a + ", forceEnabledQuirks=" + this.f11623b + ", forceDisabledQuirks=" + this.f11624c + '}';
    }
}
