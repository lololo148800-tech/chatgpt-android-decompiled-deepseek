package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17960c0 {

    /* JADX INFO: renamed from: a */
    public final String f57329a;

    /* JADX INFO: renamed from: b */
    public final String f57330b;

    /* JADX INFO: renamed from: c */
    public final String f57331c;

    /* JADX INFO: renamed from: d */
    public final String f57332d;

    public C17960c0(String name, String version, String str, String versionMajor) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(version, "version");
        AbstractC16544l.m18094g(versionMajor, "versionMajor");
        this.f57329a = name;
        this.f57330b = version;
        this.f57331c = str;
        this.f57332d = versionMajor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17960c0)) {
            return false;
        }
        C17960c0 c17960c0 = (C17960c0) obj;
        return AbstractC16544l.m18089b(this.f57329a, c17960c0.f57329a) && AbstractC16544l.m18089b(this.f57330b, c17960c0.f57330b) && AbstractC16544l.m18089b(this.f57331c, c17960c0.f57331c) && AbstractC16544l.m18089b(this.f57332d, c17960c0.f57332d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57329a.hashCode() * 31, 31, this.f57330b);
        String str = this.f57331c;
        return this.f57332d.hashCode() + ((iM527p + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(name=");
        sb2.append(this.f57329a);
        sb2.append(", version=");
        sb2.append(this.f57330b);
        sb2.append(", build=");
        sb2.append(this.f57331c);
        sb2.append(", versionMajor=");
        return AbstractC9306j0.m9891j(this.f57332d, Separators.RPAREN, sb2);
    }
}
