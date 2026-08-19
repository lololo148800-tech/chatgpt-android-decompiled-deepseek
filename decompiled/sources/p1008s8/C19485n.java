package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.n */
/* JADX INFO: loaded from: classes.dex */
public final class C19485n {

    /* JADX INFO: renamed from: a */
    public final String f61897a;

    /* JADX INFO: renamed from: b */
    public final String f61898b;

    /* JADX INFO: renamed from: c */
    public final String f61899c;

    public C19485n(String str, String str2, String str3) {
        this.f61897a = str;
        this.f61898b = str2;
        this.f61899c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19485n)) {
            return false;
        }
        C19485n c19485n = (C19485n) obj;
        return AbstractC16544l.m18089b(this.f61897a, c19485n.f61897a) && AbstractC16544l.m18089b(this.f61898b, c19485n.f61898b) && AbstractC16544l.m18089b(this.f61899c, c19485n.f61899c);
    }

    public final int hashCode() {
        String str = this.f61897a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61898b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61899c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(build=");
        sb2.append(this.f61897a);
        sb2.append(", name=");
        sb2.append(this.f61898b);
        sb2.append(", version=");
        return AbstractC9306j0.m9891j(this.f61899c, Separators.RPAREN, sb2);
    }
}
