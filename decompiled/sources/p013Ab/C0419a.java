package p013Ab;

import p001A.AbstractC0010F;

/* JADX INFO: renamed from: Ab.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0419a {

    /* JADX INFO: renamed from: a */
    public final String f1375a;

    /* JADX INFO: renamed from: b */
    public final String f1376b;

    /* JADX INFO: renamed from: c */
    public final String f1377c;

    /* JADX INFO: renamed from: d */
    public final C0421c f1378d;

    /* JADX INFO: renamed from: e */
    public final int f1379e;

    public C0419a(String str, String str2, String str3, C0421c c0421c, int i10) {
        this.f1375a = str;
        this.f1376b = str2;
        this.f1377c = str3;
        this.f1378d = c0421c;
        this.f1379e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0419a)) {
            return false;
        }
        C0419a c0419a = (C0419a) obj;
        String str = this.f1375a;
        if (str != null ? str.equals(c0419a.f1375a) : c0419a.f1375a == null) {
            String str2 = this.f1376b;
            if (str2 != null ? str2.equals(c0419a.f1376b) : c0419a.f1376b == null) {
                String str3 = this.f1377c;
                if (str3 != null ? str3.equals(c0419a.f1377c) : c0419a.f1377c == null) {
                    C0421c c0421c = this.f1378d;
                    if (c0421c != null ? c0421c.equals(c0419a.f1378d) : c0419a.f1378d == null) {
                        int i10 = this.f1379e;
                        if (i10 == 0) {
                            if (c0419a.f1379e == 0) {
                                return true;
                            }
                        } else if (AbstractC0010F.m17a(i10, c0419a.f1379e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1375a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f1376b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1377c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C0421c c0421c = this.f1378d;
        int iHashCode4 = (iHashCode3 ^ (c0421c == null ? 0 : c0421c.hashCode())) * 1000003;
        int i10 = this.f1379e;
        return (i10 != 0 ? AbstractC0010F.m24h(i10) : 0) ^ iHashCode4;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f1375a);
        sb2.append(", fid=");
        sb2.append(this.f1376b);
        sb2.append(", refreshToken=");
        sb2.append(this.f1377c);
        sb2.append(", authToken=");
        sb2.append(this.f1378d);
        sb2.append(", responseCode=");
        int i10 = this.f1379e;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
