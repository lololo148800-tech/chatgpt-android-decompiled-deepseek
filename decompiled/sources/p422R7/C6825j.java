package p422R7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: R7.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6825j {

    /* JADX INFO: renamed from: m */
    public static final String[] f21894m = {"status", ReferencesHeader.SERVICE, "message", "date", "logger", "_dd", "usr", "network", "error", "build_id", "ddtags"};

    /* JADX INFO: renamed from: a */
    public final int f21895a;

    /* JADX INFO: renamed from: b */
    public final String f21896b;

    /* JADX INFO: renamed from: c */
    public final String f21897c;

    /* JADX INFO: renamed from: d */
    public final String f21898d;

    /* JADX INFO: renamed from: e */
    public final C6820e f21899e;

    /* JADX INFO: renamed from: f */
    public final C6817b f21900f;

    /* JADX INFO: renamed from: g */
    public final C6824i f21901g;

    /* JADX INFO: renamed from: h */
    public final C6821f f21902h;

    /* JADX INFO: renamed from: i */
    public final C6819d f21903i;

    /* JADX INFO: renamed from: j */
    public final String f21904j;

    /* JADX INFO: renamed from: k */
    public final String f21905k;

    /* JADX INFO: renamed from: l */
    public final Map f21906l;

    public C6825j(int i10, String service, String message, String str, C6820e c6820e, C6817b c6817b, C6824i c6824i, C6821f c6821f, C6819d c6819d, String str2, String ddtags, Map map) {
        AbstractC14376f.m15825D(i10, "status");
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(ddtags, "ddtags");
        this.f21895a = i10;
        this.f21896b = service;
        this.f21897c = message;
        this.f21898d = str;
        this.f21899e = c6820e;
        this.f21900f = c6817b;
        this.f21901g = c6824i;
        this.f21902h = c6821f;
        this.f21903i = c6819d;
        this.f21904j = str2;
        this.f21905k = ddtags;
        this.f21906l = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6825j)) {
            return false;
        }
        C6825j c6825j = (C6825j) obj;
        return this.f21895a == c6825j.f21895a && AbstractC16544l.m18089b(this.f21896b, c6825j.f21896b) && AbstractC16544l.m18089b(this.f21897c, c6825j.f21897c) && this.f21898d.equals(c6825j.f21898d) && this.f21899e.equals(c6825j.f21899e) && this.f21900f.equals(c6825j.f21900f) && AbstractC16544l.m18089b(this.f21901g, c6825j.f21901g) && AbstractC16544l.m18089b(this.f21902h, c6825j.f21902h) && AbstractC16544l.m18089b(this.f21903i, c6825j.f21903i) && AbstractC16544l.m18089b(this.f21904j, c6825j.f21904j) && AbstractC16544l.m18089b(this.f21905k, c6825j.f21905k) && this.f21906l.equals(c6825j.f21906l);
    }

    public final int hashCode() {
        int iHashCode = (this.f21900f.hashCode() + ((this.f21899e.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0010F.m24h(this.f21895a) * 31, 31, this.f21896b), 31, this.f21897c), 31, this.f21898d)) * 31)) * 31;
        C6824i c6824i = this.f21901g;
        int iHashCode2 = (iHashCode + (c6824i == null ? 0 : c6824i.hashCode())) * 31;
        C6821f c6821f = this.f21902h;
        int iHashCode3 = (iHashCode2 + (c6821f == null ? 0 : c6821f.f21882a.hashCode())) * 31;
        C6819d c6819d = this.f21903i;
        int iHashCode4 = (iHashCode3 + (c6819d == null ? 0 : c6819d.hashCode())) * 31;
        String str = this.f21904j;
        return this.f21906l.hashCode() + AbstractC0168G.m527p((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f21905k);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LogEvent(status=");
        switch (this.f21895a) {
            case 1:
                str = "CRITICAL";
                break;
            case 2:
                str = "ERROR";
                break;
            case 3:
                str = "WARN";
                break;
            case 4:
                str = "INFO";
                break;
            case 5:
                str = "DEBUG";
                break;
            case 6:
                str = "TRACE";
                break;
            case 7:
                str = "EMERGENCY";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", service=");
        sb2.append(this.f21896b);
        sb2.append(", message=");
        sb2.append(this.f21897c);
        sb2.append(", date=");
        sb2.append(this.f21898d);
        sb2.append(", logger=");
        sb2.append(this.f21899e);
        sb2.append(", dd=");
        sb2.append(this.f21900f);
        sb2.append(", usr=");
        sb2.append(this.f21901g);
        sb2.append(", network=");
        sb2.append(this.f21902h);
        sb2.append(", error=");
        sb2.append(this.f21903i);
        sb2.append(", buildId=");
        sb2.append(this.f21904j);
        sb2.append(", ddtags=");
        sb2.append(this.f21905k);
        sb2.append(", additionalProperties=");
        sb2.append(this.f21906l);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
