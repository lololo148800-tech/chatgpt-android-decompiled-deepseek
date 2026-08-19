package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.w */
/* JADX INFO: loaded from: classes.dex */
public final class C19494w {

    /* JADX INFO: renamed from: a */
    public final String f61925a;

    /* JADX INFO: renamed from: b */
    public final String f61926b;

    /* JADX INFO: renamed from: c */
    public final String f61927c;

    public C19494w(String str, String str2, String str3) {
        this.f61925a = str;
        this.f61926b = str2;
        this.f61927c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19494w)) {
            return false;
        }
        C19494w c19494w = (C19494w) obj;
        return AbstractC16544l.m18089b(this.f61925a, c19494w.f61925a) && AbstractC16544l.m18089b(this.f61926b, c19494w.f61926b) && AbstractC16544l.m18089b(this.f61927c, c19494w.f61927c);
    }

    public final int hashCode() {
        String str = this.f61925a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61926b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61927c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(build=");
        sb2.append(this.f61925a);
        sb2.append(", name=");
        sb2.append(this.f61926b);
        sb2.append(", version=");
        return AbstractC9306j0.m9891j(this.f61927c, Separators.RPAREN, sb2);
    }
}
