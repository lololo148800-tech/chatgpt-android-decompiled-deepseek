package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17883B0 {

    /* JADX INFO: renamed from: a */
    public final String f56991a;

    /* JADX INFO: renamed from: b */
    public final String f56992b;

    /* JADX INFO: renamed from: c */
    public final String f56993c;

    /* JADX INFO: renamed from: d */
    public final String f56994d;

    public C17883B0(String str, String str2, String str3, String str4) {
        this.f56991a = str;
        this.f56992b = str2;
        this.f56993c = str3;
        this.f56994d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17883B0)) {
            return false;
        }
        C17883B0 c17883b0 = (C17883B0) obj;
        return AbstractC16544l.m18089b(this.f56991a, c17883b0.f56991a) && AbstractC16544l.m18089b(this.f56992b, c17883b0.f56992b) && AbstractC16544l.m18089b(this.f56993c, c17883b0.f56993c) && AbstractC16544l.m18089b(this.f56994d, c17883b0.f56994d);
    }

    public final int hashCode() {
        int iHashCode = this.f56991a.hashCode() * 31;
        String str = this.f56992b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f56993c);
        String str2 = this.f56994d;
        return iM527p + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LongTaskEventView(id=");
        sb2.append(this.f56991a);
        sb2.append(", referrer=");
        sb2.append(this.f56992b);
        sb2.append(", url=");
        sb2.append(this.f56993c);
        sb2.append(", name=");
        return AbstractC9306j0.m9891j(this.f56994d, Separators.RPAREN, sb2);
    }
}
