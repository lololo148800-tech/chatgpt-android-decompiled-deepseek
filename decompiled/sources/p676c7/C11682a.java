package p676c7;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p569X7.EnumC9072a;
import p641a7.EnumC10517c;

/* JADX INFO: renamed from: c7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11682a {

    /* JADX INFO: renamed from: a */
    public final EnumC10517c f35409a;

    /* JADX INFO: renamed from: b */
    public final String f35410b;

    /* JADX INFO: renamed from: c */
    public final String f35411c;

    /* JADX INFO: renamed from: d */
    public final String f35412d;

    /* JADX INFO: renamed from: e */
    public final String f35413e;

    /* JADX INFO: renamed from: f */
    public final String f35414f;

    /* JADX INFO: renamed from: g */
    public final String f35415g;

    /* JADX INFO: renamed from: h */
    public final String f35416h;

    /* JADX INFO: renamed from: i */
    public final C11687f f35417i;

    /* JADX INFO: renamed from: j */
    public final C11686e f35418j;

    /* JADX INFO: renamed from: k */
    public final C11685d f35419k;

    /* JADX INFO: renamed from: l */
    public final C11683b f35420l;

    /* JADX INFO: renamed from: m */
    public final C11688g f35421m;

    /* JADX INFO: renamed from: n */
    public final EnumC9072a f35422n;

    /* JADX INFO: renamed from: o */
    public final String f35423o;

    /* JADX INFO: renamed from: p */
    public final Object f35424p;

    public C11682a(EnumC10517c site, String clientToken, String service, String env, String version, String variant, String source, String sdkVersion, C11687f c11687f, C11686e c11686e, C11685d networkInfo, C11683b c11683b, C11688g userInfo, EnumC9072a trackingConsent, String str, Map map) {
        AbstractC16544l.m18094g(site, "site");
        AbstractC16544l.m18094g(clientToken, "clientToken");
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(env, "env");
        AbstractC16544l.m18094g(version, "version");
        AbstractC16544l.m18094g(variant, "variant");
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(sdkVersion, "sdkVersion");
        AbstractC16544l.m18094g(networkInfo, "networkInfo");
        AbstractC16544l.m18094g(userInfo, "userInfo");
        AbstractC16544l.m18094g(trackingConsent, "trackingConsent");
        this.f35409a = site;
        this.f35410b = clientToken;
        this.f35411c = service;
        this.f35412d = env;
        this.f35413e = version;
        this.f35414f = variant;
        this.f35415g = source;
        this.f35416h = sdkVersion;
        this.f35417i = c11687f;
        this.f35418j = c11686e;
        this.f35419k = networkInfo;
        this.f35420l = c11683b;
        this.f35421m = userInfo;
        this.f35422n = trackingConsent;
        this.f35423o = str;
        this.f35424p = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11682a)) {
            return false;
        }
        C11682a c11682a = (C11682a) obj;
        return this.f35409a == c11682a.f35409a && AbstractC16544l.m18089b(this.f35410b, c11682a.f35410b) && AbstractC16544l.m18089b(this.f35411c, c11682a.f35411c) && AbstractC16544l.m18089b(this.f35412d, c11682a.f35412d) && AbstractC16544l.m18089b(this.f35413e, c11682a.f35413e) && AbstractC16544l.m18089b(this.f35414f, c11682a.f35414f) && AbstractC16544l.m18089b(this.f35415g, c11682a.f35415g) && AbstractC16544l.m18089b(this.f35416h, c11682a.f35416h) && this.f35417i.equals(c11682a.f35417i) && this.f35418j.equals(c11682a.f35418j) && AbstractC16544l.m18089b(this.f35419k, c11682a.f35419k) && this.f35420l.equals(c11682a.f35420l) && AbstractC16544l.m18089b(this.f35421m, c11682a.f35421m) && this.f35422n == c11682a.f35422n && AbstractC16544l.m18089b(this.f35423o, c11682a.f35423o) && this.f35424p.equals(c11682a.f35424p);
    }

    public final int hashCode() {
        int iHashCode = (this.f35422n.hashCode() + ((this.f35421m.hashCode() + ((this.f35420l.hashCode() + ((this.f35419k.hashCode() + ((this.f35418j.hashCode() + ((this.f35417i.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f35409a.hashCode() * 31, 31, this.f35410b), 31, this.f35411c), 31, this.f35412d), 31, this.f35413e), 31, this.f35414f), 31, this.f35415g), 31, this.f35416h)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f35423o;
        return this.f35424p.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "DatadogContext(site=" + this.f35409a + ", clientToken=" + this.f35410b + ", service=" + this.f35411c + ", env=" + this.f35412d + ", version=" + this.f35413e + ", variant=" + this.f35414f + ", source=" + this.f35415g + ", sdkVersion=" + this.f35416h + ", time=" + this.f35417i + ", processInfo=" + this.f35418j + ", networkInfo=" + this.f35419k + ", deviceInfo=" + this.f35420l + ", userInfo=" + this.f35421m + ", trackingConsent=" + this.f35422n + ", appBuildId=" + this.f35423o + ", featuresContext=" + this.f35424p + Separators.RPAREN;
    }
}
