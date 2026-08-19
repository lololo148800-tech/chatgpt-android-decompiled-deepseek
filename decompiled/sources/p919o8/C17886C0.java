package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17886C0 {

    /* JADX INFO: renamed from: a */
    public final String f57003a;

    /* JADX INFO: renamed from: b */
    public final String f57004b;

    /* JADX INFO: renamed from: c */
    public final String f57005c;

    /* JADX INFO: renamed from: d */
    public final String f57006d;

    public C17886C0(String name, String version, String str, String versionMajor) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(version, "version");
        AbstractC16544l.m18094g(versionMajor, "versionMajor");
        this.f57003a = name;
        this.f57004b = version;
        this.f57005c = str;
        this.f57006d = versionMajor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17886C0)) {
            return false;
        }
        C17886C0 c17886c0 = (C17886C0) obj;
        return AbstractC16544l.m18089b(this.f57003a, c17886c0.f57003a) && AbstractC16544l.m18089b(this.f57004b, c17886c0.f57004b) && AbstractC16544l.m18089b(this.f57005c, c17886c0.f57005c) && AbstractC16544l.m18089b(this.f57006d, c17886c0.f57006d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57003a.hashCode() * 31, 31, this.f57004b);
        String str = this.f57005c;
        return this.f57006d.hashCode() + ((iM527p + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(name=");
        sb2.append(this.f57003a);
        sb2.append(", version=");
        sb2.append(this.f57004b);
        sb2.append(", build=");
        sb2.append(this.f57005c);
        sb2.append(", versionMajor=");
        return AbstractC9306j0.m9891j(this.f57006d, Separators.RPAREN, sb2);
    }
}
