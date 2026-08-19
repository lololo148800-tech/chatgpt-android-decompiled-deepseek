package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17958b1 {

    /* JADX INFO: renamed from: a */
    public final String f57322a;

    /* JADX INFO: renamed from: b */
    public final String f57323b;

    /* JADX INFO: renamed from: c */
    public final String f57324c;

    /* JADX INFO: renamed from: d */
    public final String f57325d;

    public C17958b1(String name, String version, String str, String versionMajor) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(version, "version");
        AbstractC16544l.m18094g(versionMajor, "versionMajor");
        this.f57322a = name;
        this.f57323b = version;
        this.f57324c = str;
        this.f57325d = versionMajor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17958b1)) {
            return false;
        }
        C17958b1 c17958b1 = (C17958b1) obj;
        return AbstractC16544l.m18089b(this.f57322a, c17958b1.f57322a) && AbstractC16544l.m18089b(this.f57323b, c17958b1.f57323b) && AbstractC16544l.m18089b(this.f57324c, c17958b1.f57324c) && AbstractC16544l.m18089b(this.f57325d, c17958b1.f57325d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57322a.hashCode() * 31, 31, this.f57323b);
        String str = this.f57324c;
        return this.f57325d.hashCode() + ((iM527p + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(name=");
        sb2.append(this.f57322a);
        sb2.append(", version=");
        sb2.append(this.f57323b);
        sb2.append(", build=");
        sb2.append(this.f57324c);
        sb2.append(", versionMajor=");
        return AbstractC9306j0.m9891j(this.f57325d, Separators.RPAREN, sb2);
    }
}
