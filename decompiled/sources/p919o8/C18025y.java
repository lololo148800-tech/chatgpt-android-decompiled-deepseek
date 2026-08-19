package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.y */
/* JADX INFO: loaded from: classes.dex */
public final class C18025y {

    /* JADX INFO: renamed from: a */
    public final String f57532a;

    /* JADX INFO: renamed from: b */
    public final String f57533b;

    /* JADX INFO: renamed from: c */
    public final String f57534c;

    /* JADX INFO: renamed from: d */
    public final String f57535d;

    public C18025y(String name, String version, String str, String versionMajor) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(version, "version");
        AbstractC16544l.m18094g(versionMajor, "versionMajor");
        this.f57532a = name;
        this.f57533b = version;
        this.f57534c = str;
        this.f57535d = versionMajor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18025y)) {
            return false;
        }
        C18025y c18025y = (C18025y) obj;
        return AbstractC16544l.m18089b(this.f57532a, c18025y.f57532a) && AbstractC16544l.m18089b(this.f57533b, c18025y.f57533b) && AbstractC16544l.m18089b(this.f57534c, c18025y.f57534c) && AbstractC16544l.m18089b(this.f57535d, c18025y.f57535d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57532a.hashCode() * 31, 31, this.f57533b);
        String str = this.f57534c;
        return this.f57535d.hashCode() + ((iM527p + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(name=");
        sb2.append(this.f57532a);
        sb2.append(", version=");
        sb2.append(this.f57533b);
        sb2.append(", build=");
        sb2.append(this.f57534c);
        sb2.append(", versionMajor=");
        return AbstractC9306j0.m9891j(this.f57535d, Separators.RPAREN, sb2);
    }
}
