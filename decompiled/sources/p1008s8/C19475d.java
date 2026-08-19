package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C19475d {

    /* JADX INFO: renamed from: a */
    public final String f61867a;

    /* JADX INFO: renamed from: b */
    public final String f61868b;

    /* JADX INFO: renamed from: c */
    public final String f61869c;

    public C19475d(String str, String str2, String str3) {
        this.f61867a = str;
        this.f61868b = str2;
        this.f61869c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19475d)) {
            return false;
        }
        C19475d c19475d = (C19475d) obj;
        return AbstractC16544l.m18089b(this.f61867a, c19475d.f61867a) && AbstractC16544l.m18089b(this.f61868b, c19475d.f61868b) && AbstractC16544l.m18089b(this.f61869c, c19475d.f61869c);
    }

    public final int hashCode() {
        String str = this.f61867a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61868b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61869c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(architecture=");
        sb2.append(this.f61867a);
        sb2.append(", brand=");
        sb2.append(this.f61868b);
        sb2.append(", model=");
        return AbstractC9306j0.m9891j(this.f61869c, Separators.RPAREN, sb2);
    }
}
