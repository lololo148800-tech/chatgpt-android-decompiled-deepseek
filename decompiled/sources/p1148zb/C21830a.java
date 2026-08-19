package p1148zb;

import p001A.AbstractC0010F;
import p571X9.AbstractC9306j0;
import p888m8.C17198c;

/* JADX INFO: renamed from: zb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21830a {

    /* JADX INFO: renamed from: a */
    public final String f69280a;

    /* JADX INFO: renamed from: b */
    public final int f69281b;

    /* JADX INFO: renamed from: c */
    public final String f69282c;

    /* JADX INFO: renamed from: d */
    public final String f69283d;

    /* JADX INFO: renamed from: e */
    public final long f69284e;

    /* JADX INFO: renamed from: f */
    public final long f69285f;

    /* JADX INFO: renamed from: g */
    public final String f69286g;

    public C21830a(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f69280a = str;
        this.f69281b = i10;
        this.f69282c = str2;
        this.f69283d = str3;
        this.f69284e = j10;
        this.f69285f = j11;
        this.f69286g = str4;
    }

    /* JADX INFO: renamed from: a */
    public final C17198c m22314a() {
        C17198c c17198c = new C17198c();
        c17198c.f54901b = this.f69280a;
        c17198c.f54900a = this.f69281b;
        c17198c.f54902c = this.f69282c;
        c17198c.f54903d = this.f69283d;
        c17198c.f54904e = Long.valueOf(this.f69284e);
        c17198c.f54905f = Long.valueOf(this.f69285f);
        c17198c.f54906g = this.f69286g;
        return c17198c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21830a)) {
            return false;
        }
        C21830a c21830a = (C21830a) obj;
        String str = this.f69280a;
        if (str != null ? str.equals(c21830a.f69280a) : c21830a.f69280a == null) {
            if (AbstractC0010F.m17a(this.f69281b, c21830a.f69281b)) {
                String str2 = c21830a.f69282c;
                String str3 = this.f69282c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = c21830a.f69283d;
                    String str5 = this.f69283d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f69284e == c21830a.f69284e && this.f69285f == c21830a.f69285f) {
                            String str6 = c21830a.f69286g;
                            String str7 = this.f69286g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f69280a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC0010F.m24h(this.f69281b)) * 1000003;
        String str2 = this.f69282c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f69283d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f69284e;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f69285f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f69286g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f69280a);
        sb2.append(", registrationStatus=");
        int i10 = this.f69281b;
        if (i10 == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i10 == 2) {
            str = "NOT_GENERATED";
        } else if (i10 == 3) {
            str = "UNREGISTERED";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.f69282c);
        sb2.append(", refreshToken=");
        sb2.append(this.f69283d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f69284e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f69285f);
        sb2.append(", fisError=");
        return AbstractC9306j0.m9891j(this.f69286g, "}", sb2);
    }
}
