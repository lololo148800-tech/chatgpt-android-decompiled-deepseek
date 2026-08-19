package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: o8.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C17951Z {

    /* JADX INFO: renamed from: a */
    public final String f57280a;

    /* JADX INFO: renamed from: b */
    public final String f57281b;

    /* JADX INFO: renamed from: c */
    public final String f57282c;

    /* JADX INFO: renamed from: d */
    public final String f57283d;

    /* JADX INFO: renamed from: e */
    public final Boolean f57284e;

    public /* synthetic */ C17951Z(int i10, String str, String str2, String str3, String str4) {
        this((Boolean) null, str, (i10 & 2) != 0 ? null : str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17951Z)) {
            return false;
        }
        C17951Z c17951z = (C17951Z) obj;
        return AbstractC16544l.m18089b(this.f57280a, c17951z.f57280a) && AbstractC16544l.m18089b(this.f57281b, c17951z.f57281b) && AbstractC16544l.m18089b(this.f57282c, c17951z.f57282c) && AbstractC16544l.m18089b(this.f57283d, c17951z.f57283d) && AbstractC16544l.m18089b(this.f57284e, c17951z.f57284e);
    }

    public final int hashCode() {
        int iHashCode = this.f57280a.hashCode() * 31;
        String str = this.f57281b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f57282c);
        String str2 = this.f57283d;
        int iHashCode2 = (iM527p + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f57284e;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "ErrorEventView(id=" + this.f57280a + ", referrer=" + this.f57281b + ", url=" + this.f57282c + ", name=" + this.f57283d + ", inForeground=" + this.f57284e + Separators.RPAREN;
    }

    public C17951Z(Boolean bool, String str, String str2, String url, String str3) {
        AbstractC16544l.m18094g(url, "url");
        this.f57280a = str;
        this.f57281b = str2;
        this.f57282c = url;
        this.f57283d = str3;
        this.f57284e = bool;
    }
}
