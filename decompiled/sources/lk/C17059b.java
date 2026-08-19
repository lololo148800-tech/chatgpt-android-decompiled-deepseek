package lk;

import android.gov.nist.core.Separators;
import android.location.Location;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: lk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C17059b {

    /* JADX INFO: renamed from: a */
    public final Location f54525a;

    /* JADX INFO: renamed from: b */
    public final EnumC17060c f54526b;

    public C17059b(Location location, EnumC17060c enumC17060c) {
        this.f54525a = location;
        this.f54526b = enumC17060c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17059b)) {
            return false;
        }
        C17059b c17059b = (C17059b) obj;
        return AbstractC16544l.m18089b(this.f54525a, c17059b.f54525a) && this.f54526b == c17059b.f54526b;
    }

    public final int hashCode() {
        return this.f54526b.hashCode() + (this.f54525a.hashCode() * 31);
    }

    public final String toString() {
        return "GpsData(location=" + this.f54525a + ", precision=" + this.f54526b + Separators.RPAREN;
    }
}
