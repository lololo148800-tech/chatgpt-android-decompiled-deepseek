package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: o8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17965e {

    /* JADX INFO: renamed from: a */
    public final String f57340a;

    /* JADX INFO: renamed from: b */
    public final String f57341b;

    /* JADX INFO: renamed from: c */
    public final String f57342c;

    /* JADX INFO: renamed from: d */
    public final String f57343d;

    /* JADX INFO: renamed from: e */
    public final Boolean f57344e;

    public C17965e(Boolean bool, String str, String str2, String str3, String str4) {
        this.f57340a = str;
        this.f57341b = str2;
        this.f57342c = str3;
        this.f57343d = str4;
        this.f57344e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17965e)) {
            return false;
        }
        C17965e c17965e = (C17965e) obj;
        return AbstractC16544l.m18089b(this.f57340a, c17965e.f57340a) && AbstractC16544l.m18089b(this.f57341b, c17965e.f57341b) && AbstractC16544l.m18089b(this.f57342c, c17965e.f57342c) && AbstractC16544l.m18089b(this.f57343d, c17965e.f57343d) && AbstractC16544l.m18089b(this.f57344e, c17965e.f57344e);
    }

    public final int hashCode() {
        int iHashCode = this.f57340a.hashCode() * 31;
        String str = this.f57341b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f57342c);
        String str2 = this.f57343d;
        int iHashCode2 = (iM527p + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f57344e;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "ActionEventView(id=" + this.f57340a + ", referrer=" + this.f57341b + ", url=" + this.f57342c + ", name=" + this.f57343d + ", inForeground=" + this.f57344e + Separators.RPAREN;
    }
}
