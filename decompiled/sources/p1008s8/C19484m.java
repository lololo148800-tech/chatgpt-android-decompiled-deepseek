package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.m */
/* JADX INFO: loaded from: classes.dex */
public final class C19484m {

    /* JADX INFO: renamed from: a */
    public final String f61894a;

    /* JADX INFO: renamed from: b */
    public final String f61895b;

    /* JADX INFO: renamed from: c */
    public final String f61896c;

    public C19484m(String str, String str2, String str3) {
        this.f61894a = str;
        this.f61895b = str2;
        this.f61896c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19484m)) {
            return false;
        }
        C19484m c19484m = (C19484m) obj;
        return AbstractC16544l.m18089b(this.f61894a, c19484m.f61894a) && AbstractC16544l.m18089b(this.f61895b, c19484m.f61895b) && AbstractC16544l.m18089b(this.f61896c, c19484m.f61896c);
    }

    public final int hashCode() {
        String str = this.f61894a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61895b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61896c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(architecture=");
        sb2.append(this.f61894a);
        sb2.append(", brand=");
        sb2.append(this.f61895b);
        sb2.append(", model=");
        return AbstractC9306j0.m9891j(this.f61896c, Separators.RPAREN, sb2);
    }
}
