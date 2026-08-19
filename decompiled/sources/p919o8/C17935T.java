package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.T */
/* JADX INFO: loaded from: classes.dex */
public final class C17935T {

    /* JADX INFO: renamed from: a */
    public final C17938U f57164a;

    /* JADX INFO: renamed from: b */
    public final C17918N f57165b;

    /* JADX INFO: renamed from: c */
    public final String f57166c;

    public C17935T(C17938U c17938u, C17918N c17918n, String str) {
        this.f57164a = c17938u;
        this.f57165b = c17918n;
        this.f57166c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17935T)) {
            return false;
        }
        C17935T c17935t = (C17935T) obj;
        return AbstractC16544l.m18089b(this.f57164a, c17935t.f57164a) && AbstractC16544l.m18089b(this.f57165b, c17935t.f57165b) && AbstractC16544l.m18089b(this.f57166c, c17935t.f57166c);
    }

    public final int hashCode() {
        C17938U c17938u = this.f57164a;
        int iHashCode = (c17938u == null ? 0 : c17938u.hashCode()) * 31;
        C17918N c17918n = this.f57165b;
        int iHashCode2 = (iHashCode + (c17918n == null ? 0 : c17918n.hashCode())) * 31;
        String str = this.f57166c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Dd(session=");
        sb2.append(this.f57164a);
        sb2.append(", configuration=");
        sb2.append(this.f57165b);
        sb2.append(", browserSdkVersion=");
        return AbstractC9306j0.m9891j(this.f57166c, Separators.RPAREN, sb2);
    }
}
