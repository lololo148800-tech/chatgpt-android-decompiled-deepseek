package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.u */
/* JADX INFO: loaded from: classes.dex */
public final class C19492u {

    /* JADX INFO: renamed from: a */
    public final String f61920a;

    /* JADX INFO: renamed from: b */
    public final String f61921b;

    /* JADX INFO: renamed from: c */
    public final String f61922c;

    public C19492u(String str, String str2, String str3) {
        this.f61920a = str;
        this.f61921b = str2;
        this.f61922c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19492u)) {
            return false;
        }
        C19492u c19492u = (C19492u) obj;
        return AbstractC16544l.m18089b(this.f61920a, c19492u.f61920a) && AbstractC16544l.m18089b(this.f61921b, c19492u.f61921b) && AbstractC16544l.m18089b(this.f61922c, c19492u.f61922c);
    }

    public final int hashCode() {
        String str = this.f61920a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61921b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61922c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(architecture=");
        sb2.append(this.f61920a);
        sb2.append(", brand=");
        sb2.append(this.f61921b);
        sb2.append(", model=");
        return AbstractC9306j0.m9891j(this.f61922c, Separators.RPAREN, sb2);
    }
}
