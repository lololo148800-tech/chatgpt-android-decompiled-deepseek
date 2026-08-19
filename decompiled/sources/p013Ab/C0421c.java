package p013Ab;

import p001A.AbstractC0010F;

/* JADX INFO: renamed from: Ab.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0421c {

    /* JADX INFO: renamed from: a */
    public final String f1384a;

    /* JADX INFO: renamed from: b */
    public final long f1385b;

    /* JADX INFO: renamed from: c */
    public final int f1386c;

    public C0421c(long j10, String str, int i10) {
        this.f1384a = str;
        this.f1385b = j10;
        this.f1386c = i10;
    }

    /* JADX INFO: renamed from: a */
    public static C0420b m1070a() {
        C0420b c0420b = new C0420b((char) 0, 0);
        c0420b.f1383p0 = 0L;
        return c0420b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0421c)) {
            return false;
        }
        C0421c c0421c = (C0421c) obj;
        String str = this.f1384a;
        if (str != null ? str.equals(c0421c.f1384a) : c0421c.f1384a == null) {
            if (this.f1385b == c0421c.f1385b) {
                int i10 = c0421c.f1386c;
                int i11 = this.f1386c;
                if (i11 == 0) {
                    if (i10 == 0) {
                        return true;
                    }
                } else if (AbstractC0010F.m17a(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1384a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f1385b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i11 = this.f1386c;
        return (i11 != 0 ? AbstractC0010F.m24h(i11) : 0) ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f1384a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f1385b);
        sb2.append(", responseCode=");
        int i10 = this.f1386c;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
