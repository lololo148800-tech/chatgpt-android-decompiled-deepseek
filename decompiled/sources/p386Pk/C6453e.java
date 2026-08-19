package p386Pk;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Pk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6453e {

    /* JADX INFO: renamed from: a */
    public final String f20934a;

    /* JADX INFO: renamed from: b */
    public final String f20935b;

    public C6453e(String str, String str2) {
        this.f20934a = str;
        this.f20935b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6453e)) {
            return false;
        }
        C6453e c6453e = (C6453e) obj;
        return AbstractC16544l.m18089b(this.f20934a, c6453e.f20934a) && AbstractC16544l.m18089b(this.f20935b, c6453e.f20935b);
    }

    public final int hashCode() {
        String str = this.f20934a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20935b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnknownLicense(name=");
        sb2.append(this.f20934a);
        sb2.append(", url=");
        return AbstractC9306j0.m9892k(sb2, this.f20935b, ')');
    }
}
