package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18014u0 {

    /* JADX INFO: renamed from: a */
    public final C18017v0 f57505a;

    /* JADX INFO: renamed from: b */
    public final C17999p0 f57506b;

    /* JADX INFO: renamed from: c */
    public final String f57507c;

    /* JADX INFO: renamed from: d */
    public final Boolean f57508d;

    public C18014u0(C18017v0 c18017v0, C17999p0 c17999p0, String str, Boolean bool) {
        this.f57505a = c18017v0;
        this.f57506b = c17999p0;
        this.f57507c = str;
        this.f57508d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18014u0)) {
            return false;
        }
        C18014u0 c18014u0 = (C18014u0) obj;
        return AbstractC16544l.m18089b(this.f57505a, c18014u0.f57505a) && AbstractC16544l.m18089b(this.f57506b, c18014u0.f57506b) && AbstractC16544l.m18089b(this.f57507c, c18014u0.f57507c) && AbstractC16544l.m18089b(this.f57508d, c18014u0.f57508d);
    }

    public final int hashCode() {
        C18017v0 c18017v0 = this.f57505a;
        int iHashCode = (c18017v0 == null ? 0 : c18017v0.hashCode()) * 31;
        C17999p0 c17999p0 = this.f57506b;
        int iHashCode2 = (iHashCode + (c17999p0 == null ? 0 : c17999p0.hashCode())) * 31;
        String str = this.f57507c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f57508d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "Dd(session=" + this.f57505a + ", configuration=" + this.f57506b + ", browserSdkVersion=" + this.f57507c + ", discarded=" + this.f57508d + Separators.RPAREN;
    }
}
