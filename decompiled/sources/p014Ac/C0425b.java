package p014Ac;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ac.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0425b {

    /* JADX INFO: renamed from: a */
    public final String f1398a;

    /* JADX INFO: renamed from: b */
    public final String f1399b;

    /* JADX INFO: renamed from: c */
    public final Boolean f1400c;

    public C0425b(String str, String str2, Boolean bool) {
        this.f1398a = str;
        this.f1399b = str2;
        this.f1400c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0425b)) {
            return false;
        }
        C0425b c0425b = (C0425b) obj;
        return AbstractC16544l.m18089b(this.f1398a, c0425b.f1398a) && AbstractC16544l.m18089b(this.f1399b, c0425b.f1399b) && AbstractC16544l.m18089b(this.f1400c, c0425b.f1400c);
    }

    public final int hashCode() {
        String str = this.f1398a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1399b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f1400c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
