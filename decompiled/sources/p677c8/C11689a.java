package p677c8;

import android.gov.nist.core.Separators;
import androidx.work.impl.utils.p651oZ.HhJS;
import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p138F8.vJO.anhfj;
import p211I8.lPE.sRXLFOsOgS;
import p279L1.VOxZ.sVoFrD;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: c8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11689a {

    /* JADX INFO: renamed from: p */
    public static final String f35456p;

    /* JADX INFO: renamed from: a */
    public final String f35457a;

    /* JADX INFO: renamed from: b */
    public final String f35458b;

    /* JADX INFO: renamed from: c */
    public final boolean f35459c;

    /* JADX INFO: renamed from: d */
    public final String f35460d;

    /* JADX INFO: renamed from: e */
    public final String f35461e;

    /* JADX INFO: renamed from: f */
    public final String f35462f;

    /* JADX INFO: renamed from: g */
    public final String f35463g;

    /* JADX INFO: renamed from: h */
    public final String f35464h;

    /* JADX INFO: renamed from: i */
    public final String f35465i;

    /* JADX INFO: renamed from: j */
    public final long f35466j;

    /* JADX INFO: renamed from: k */
    public final long f35467k;

    /* JADX INFO: renamed from: l */
    public final boolean f35468l;

    /* JADX INFO: renamed from: m */
    public final int f35469m;

    /* JADX INFO: renamed from: n */
    public final int f35470n;

    /* JADX INFO: renamed from: o */
    public final int f35471o;

    static {
        String string = new UUID(0L, 0L).toString();
        AbstractC16544l.m18093f(string, "UUID(0, 0).toString()");
        f35456p = string;
    }

    public C11689a(String applicationId, String sessionId, boolean z6, String str, String str2, String str3, String str4, int i10, int i11, int i12, String str5, String str6, long j10, long j11, boolean z10) {
        AbstractC16544l.m18094g(applicationId, "applicationId");
        AbstractC16544l.m18094g(sessionId, "sessionId");
        AbstractC14376f.m15825D(i10, "sessionState");
        AbstractC14376f.m15825D(i11, "sessionStartReason");
        AbstractC14376f.m15825D(i12, "viewType");
        this.f35457a = applicationId;
        this.f35458b = sessionId;
        this.f35459c = z6;
        this.f35460d = str;
        this.f35461e = str2;
        this.f35462f = str3;
        this.f35463g = str4;
        this.f35469m = i10;
        this.f35470n = i11;
        this.f35471o = i12;
        this.f35464h = str5;
        this.f35465i = str6;
        this.f35466j = j10;
        this.f35467k = j11;
        this.f35468l = z10;
    }

    /* JADX INFO: renamed from: a */
    public static C11689a m13025a(C11689a c11689a, String str, boolean z6, String str2, String str3, String str4, String str5, int i10, int i11, int i12, String str6, String str7, long j10, long j11, int i13) {
        String applicationId = c11689a.f35457a;
        String sessionId = (i13 & 2) != 0 ? c11689a.f35458b : str;
        boolean z10 = (i13 & 4) != 0 ? c11689a.f35459c : z6;
        String str8 = (i13 & 8) != 0 ? c11689a.f35460d : str2;
        String str9 = (i13 & 16) != 0 ? c11689a.f35461e : str3;
        String str10 = (i13 & 32) != 0 ? c11689a.f35462f : str4;
        String str11 = (i13 & 64) != 0 ? c11689a.f35463g : str5;
        int i14 = (i13 & 128) != 0 ? c11689a.f35469m : i10;
        int i15 = (i13 & 256) != 0 ? c11689a.f35470n : i11;
        int i16 = (i13 & 512) != 0 ? c11689a.f35471o : i12;
        String str12 = (i13 & 1024) != 0 ? c11689a.f35464h : str6;
        String str13 = (i13 & 2048) != 0 ? c11689a.f35465i : str7;
        long j12 = (i13 & 4096) != 0 ? c11689a.f35466j : j10;
        long j13 = (i13 & 8192) != 0 ? c11689a.f35467k : j11;
        boolean z11 = (i13 & 16384) != 0 ? c11689a.f35468l : false;
        c11689a.getClass();
        AbstractC16544l.m18094g(applicationId, "applicationId");
        AbstractC16544l.m18094g(sessionId, "sessionId");
        AbstractC14376f.m15825D(i14, "sessionState");
        AbstractC14376f.m15825D(i15, "sessionStartReason");
        AbstractC14376f.m15825D(i16, "viewType");
        return new C11689a(applicationId, sessionId, z10, str8, str9, str10, str11, i14, i15, i16, str12, str13, j12, j13, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11689a)) {
            return false;
        }
        C11689a c11689a = (C11689a) obj;
        return AbstractC16544l.m18089b(this.f35457a, c11689a.f35457a) && AbstractC16544l.m18089b(this.f35458b, c11689a.f35458b) && this.f35459c == c11689a.f35459c && AbstractC16544l.m18089b(this.f35460d, c11689a.f35460d) && AbstractC16544l.m18089b(this.f35461e, c11689a.f35461e) && AbstractC16544l.m18089b(this.f35462f, c11689a.f35462f) && AbstractC16544l.m18089b(this.f35463g, c11689a.f35463g) && this.f35469m == c11689a.f35469m && this.f35470n == c11689a.f35470n && this.f35471o == c11689a.f35471o && AbstractC16544l.m18089b(this.f35464h, c11689a.f35464h) && AbstractC16544l.m18089b(this.f35465i, c11689a.f35465i) && this.f35466j == c11689a.f35466j && this.f35467k == c11689a.f35467k && this.f35468l == c11689a.f35468l;
    }

    public final int hashCode() {
        int iM527p = (AbstractC0168G.m527p(this.f35457a.hashCode() * 31, 31, this.f35458b) + (this.f35459c ? 1231 : 1237)) * 31;
        String str = this.f35460d;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f35461e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f35462f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f35463g;
        int iM13820k = AbstractC12107L1.m13820k(this.f35471o, AbstractC12107L1.m13820k(this.f35470n, AbstractC12107L1.m13820k(this.f35469m, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31);
        String str5 = this.f35464h;
        int iHashCode4 = (iM13820k + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f35465i;
        int iHashCode5 = str6 != null ? str6.hashCode() : 0;
        long j10 = this.f35466j;
        int i10 = (((iHashCode4 + iHashCode5) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f35467k;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f35468l ? 1231 : 1237);
    }

    /* JADX INFO: renamed from: b */
    public final Map m13026b() {
        return AbstractC17659D.m19244f(new C17309l("application_id", this.f35457a), new C17309l("session_id", this.f35458b), new C17309l("session_active", Boolean.valueOf(this.f35459c)), new C17309l("session_state", AbstractC12107L1.m13816g(this.f35469m)), new C17309l("session_start_reason", AbstractC12107L1.m13815f(this.f35470n)), new C17309l("view_id", this.f35460d), new C17309l(HhJS.MIbIp, this.f35461e), new C17309l("view_url", this.f35462f), new C17309l("view_type", AbstractC12107L1.m13817h(this.f35471o)), new C17309l("action_id", this.f35463g), new C17309l("synthetics_test_id", this.f35464h), new C17309l("synthetics_result_id", this.f35465i), new C17309l("view_timestamp", Long.valueOf(this.f35466j)), new C17309l("view_has_replay", Boolean.valueOf(this.f35468l)), new C17309l("view_timestamp_offset", Long.valueOf(this.f35467k)));
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder("RumContext(applicationId=");
        sb2.append(this.f35457a);
        sb2.append(", sessionId=");
        sb2.append(this.f35458b);
        sb2.append(", isSessionActive=");
        sb2.append(this.f35459c);
        sb2.append(", viewId=");
        sb2.append(this.f35460d);
        sb2.append(", viewName=");
        sb2.append(this.f35461e);
        sb2.append(", viewUrl=");
        sb2.append(this.f35462f);
        sb2.append(sVoFrD.ZXXZhmLBpemsAq);
        sb2.append(this.f35463g);
        sb2.append(", sessionState=");
        int i10 = this.f35469m;
        if (i10 == 1) {
            str = "NOT_TRACKED";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "EXPIRED";
        } else {
            str = "TRACKED";
        }
        sb2.append(str);
        sb2.append(", sessionStartReason=");
        switch (this.f35470n) {
            case 1:
                str2 = "USER_APP_LAUNCH";
                break;
            case 2:
                str2 = "INACTIVITY_TIMEOUT";
                break;
            case 3:
                str2 = anhfj.JhEa;
                break;
            case 4:
                str2 = "BACKGROUND_LAUNCH";
                break;
            case 5:
                str2 = "PREWARM";
                break;
            case 6:
                str2 = "FROM_NON_INTERACTIVE_SESSION";
                break;
            case 7:
                str2 = "EXPLICIT_STOP";
                break;
            default:
                str2 = "null";
                break;
        }
        sb2.append(str2);
        sb2.append(", viewType=");
        int i11 = this.f35471o;
        if (i11 == 1) {
            str3 = "NONE";
        } else if (i11 == 2) {
            str3 = "FOREGROUND";
        } else if (i11 != 3) {
            str3 = i11 != 4 ? "null" : "APPLICATION_LAUNCH";
        } else {
            str3 = "BACKGROUND";
        }
        sb2.append(str3);
        sb2.append(", syntheticsTestId=");
        sb2.append(this.f35464h);
        sb2.append(", syntheticsResultId=");
        sb2.append(this.f35465i);
        sb2.append(", viewTimestamp=");
        sb2.append(this.f35466j);
        sb2.append(", viewTimestampOffset=");
        sb2.append(this.f35467k);
        sb2.append(sRXLFOsOgS.vguJsYCQGkTIODm);
        return AbstractC14376f.m15823B(sb2, this.f35468l, Separators.RPAREN);
    }
}
