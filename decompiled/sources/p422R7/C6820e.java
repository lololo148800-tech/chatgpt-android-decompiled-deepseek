package p422R7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: R7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6820e {

    /* JADX INFO: renamed from: a */
    public final String f21879a;

    /* JADX INFO: renamed from: b */
    public final String f21880b;

    /* JADX INFO: renamed from: c */
    public final String f21881c;

    public C6820e(String name, String str, String version) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(version, "version");
        this.f21879a = name;
        this.f21880b = str;
        this.f21881c = version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6820e)) {
            return false;
        }
        C6820e c6820e = (C6820e) obj;
        return AbstractC16544l.m18089b(this.f21879a, c6820e.f21879a) && AbstractC16544l.m18089b(this.f21880b, c6820e.f21880b) && AbstractC16544l.m18089b(this.f21881c, c6820e.f21881c);
    }

    public final int hashCode() {
        int iHashCode = this.f21879a.hashCode() * 31;
        String str = this.f21880b;
        return this.f21881c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Logger(name=");
        sb2.append(this.f21879a);
        sb2.append(", threadName=");
        sb2.append(this.f21880b);
        sb2.append(", version=");
        return AbstractC9306j0.m9891j(this.f21881c, Separators.RPAREN, sb2);
    }
}
