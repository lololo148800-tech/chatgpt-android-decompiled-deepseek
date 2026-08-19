package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.J */
/* JADX INFO: loaded from: classes.dex */
public final class C17906J {

    /* JADX INFO: renamed from: a */
    public final String f57092a;

    /* JADX INFO: renamed from: b */
    public final String f57093b;

    /* JADX INFO: renamed from: c */
    public final boolean f57094c;

    /* JADX INFO: renamed from: d */
    public final String f57095d;

    /* JADX INFO: renamed from: e */
    public final String f57096e;

    /* JADX INFO: renamed from: f */
    public final String f57097f;

    public C17906J(String str, String str2, boolean z6, String str3, String str4, String str5) {
        this.f57092a = str;
        this.f57093b = str2;
        this.f57094c = z6;
        this.f57095d = str3;
        this.f57096e = str4;
        this.f57097f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17906J)) {
            return false;
        }
        C17906J c17906j = (C17906J) obj;
        return AbstractC16544l.m18089b(this.f57092a, c17906j.f57092a) && AbstractC16544l.m18089b(this.f57093b, c17906j.f57093b) && this.f57094c == c17906j.f57094c && AbstractC16544l.m18089b(this.f57095d, c17906j.f57095d) && AbstractC16544l.m18089b(this.f57096e, c17906j.f57096e) && AbstractC16544l.m18089b(this.f57097f, c17906j.f57097f);
    }

    public final int hashCode() {
        int iM527p = (AbstractC0168G.m527p(this.f57092a.hashCode() * 31, 31, this.f57093b) + (this.f57094c ? 1231 : 1237)) * 31;
        String str = this.f57095d;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57096e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57097f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage(uuid=");
        sb2.append(this.f57092a);
        sb2.append(", name=");
        sb2.append(this.f57093b);
        sb2.append(", isSystem=");
        sb2.append(this.f57094c);
        sb2.append(", loadAddress=");
        sb2.append(this.f57095d);
        sb2.append(", maxAddress=");
        sb2.append(this.f57096e);
        sb2.append(", arch=");
        return AbstractC9306j0.m9891j(this.f57097f, Separators.RPAREN, sb2);
    }
}
