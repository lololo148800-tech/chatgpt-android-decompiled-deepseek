package p386Pk;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Pk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6452d {

    /* JADX INFO: renamed from: a */
    public final String f20931a;

    /* JADX INFO: renamed from: b */
    public final String f20932b;

    /* JADX INFO: renamed from: c */
    public final String f20933c;

    public C6452d(String str, String str2, String str3) {
        this.f20931a = str;
        this.f20932b = str2;
        this.f20933c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6452d)) {
            return false;
        }
        C6452d c6452d = (C6452d) obj;
        return AbstractC16544l.m18089b(this.f20931a, c6452d.f20931a) && AbstractC16544l.m18089b(this.f20932b, c6452d.f20932b) && AbstractC16544l.m18089b(this.f20933c, c6452d.f20933c);
    }

    public final int hashCode() {
        return this.f20933c.hashCode() + AbstractC0168G.m527p(this.f20931a.hashCode() * 31, 31, this.f20932b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpdxLicense(identifier=");
        sb2.append(this.f20931a);
        sb2.append(", name=");
        sb2.append(this.f20932b);
        sb2.append(", url=");
        return AbstractC9306j0.m9892k(sb2, this.f20933c, ')');
    }
}
