package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17911K1 {

    /* JADX INFO: renamed from: a */
    public final String f57106a;

    /* JADX INFO: renamed from: b */
    public final String f57107b;

    /* JADX INFO: renamed from: c */
    public final String f57108c;

    /* JADX INFO: renamed from: d */
    public final String f57109d;

    public C17911K1(String name, String version, String str, String versionMajor) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(version, "version");
        AbstractC16544l.m18094g(versionMajor, "versionMajor");
        this.f57106a = name;
        this.f57107b = version;
        this.f57108c = str;
        this.f57109d = versionMajor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17911K1)) {
            return false;
        }
        C17911K1 c17911k1 = (C17911K1) obj;
        return AbstractC16544l.m18089b(this.f57106a, c17911k1.f57106a) && AbstractC16544l.m18089b(this.f57107b, c17911k1.f57107b) && AbstractC16544l.m18089b(this.f57108c, c17911k1.f57108c) && AbstractC16544l.m18089b(this.f57109d, c17911k1.f57109d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57106a.hashCode() * 31, 31, this.f57107b);
        String str = this.f57108c;
        return this.f57109d.hashCode() + ((iM527p + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(name=");
        sb2.append(this.f57106a);
        sb2.append(", version=");
        sb2.append(this.f57107b);
        sb2.append(", build=");
        sb2.append(this.f57108c);
        sb2.append(", versionMajor=");
        return AbstractC9306j0.m9891j(this.f57109d, Separators.RPAREN, sb2);
    }
}
