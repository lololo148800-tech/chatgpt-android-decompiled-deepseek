package bf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: bf.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C11364T {

    /* JADX INFO: renamed from: a */
    public final String f34364a;

    /* JADX INFO: renamed from: b */
    public final String f34365b;

    /* JADX INFO: renamed from: c */
    public final String f34366c;

    /* JADX INFO: renamed from: d */
    public final boolean f34367d;

    /* JADX INFO: renamed from: e */
    public final boolean f34368e;

    public C11364T(String str, String str2, String str3, boolean z6, boolean z10) {
        this.f34364a = str;
        this.f34365b = str2;
        this.f34366c = str3;
        this.f34367d = z6;
        this.f34368e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11364T)) {
            return false;
        }
        C11364T c11364t = (C11364T) obj;
        return AbstractC16544l.m18089b(this.f34364a, c11364t.f34364a) && AbstractC16544l.m18089b(this.f34365b, c11364t.f34365b) && AbstractC16544l.m18089b(this.f34366c, c11364t.f34366c) && this.f34367d == c11364t.f34367d && this.f34368e == c11364t.f34368e;
    }

    public final int hashCode() {
        String str = this.f34364a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f34365b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34366c;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f34367d ? 1231 : 1237)) * 31) + (this.f34368e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
