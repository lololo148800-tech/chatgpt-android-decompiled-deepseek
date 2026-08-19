package p337Nd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Nd.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5710c {

    /* JADX INFO: renamed from: a */
    public final String f18498a;

    /* JADX INFO: renamed from: b */
    public final String f18499b;

    /* JADX INFO: renamed from: c */
    public final String f18500c;

    /* JADX INFO: renamed from: d */
    public final String f18501d;

    /* JADX INFO: renamed from: e */
    public final String f18502e;

    public C5710c(String id2, String str, String str2, String str3, String str4) {
        AbstractC16544l.m18094g(id2, "id");
        this.f18498a = id2;
        this.f18499b = str;
        this.f18500c = str2;
        this.f18501d = str3;
        this.f18502e = str4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:25:0x0037  */
    /* JADX WARN: Code duplicated, block: B:35:0x004d  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5710c)) {
            return false;
        }
        C5710c c5710c = (C5710c) obj;
        if (!AbstractC16544l.m18089b(this.f18498a, c5710c.f18498a)) {
            return false;
        }
        String str = this.f18499b;
        String str2 = c5710c.f18499b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        if (!zM18089b) {
            return false;
        }
        String str3 = this.f18500c;
        String str4 = c5710c.f18500c;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        if (!zM18089b2) {
            return false;
        }
        String str5 = this.f18501d;
        String str6 = c5710c.f18501d;
        if (str5 == null) {
            if (str6 == null) {
                zM18089b3 = true;
            } else {
                zM18089b3 = false;
            }
        } else if (str6 == null) {
            zM18089b3 = false;
        } else {
            zM18089b3 = AbstractC16544l.m18089b(str5, str6);
        }
        return zM18089b3 && AbstractC16544l.m18089b(this.f18502e, c5710c.f18502e);
    }

    public final int hashCode() {
        int iHashCode = this.f18498a.hashCode() * 31;
        String str = this.f18499b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18500c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18501d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18502e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
