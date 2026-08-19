package p344Nl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.RtpParameters;
import p003A1.AbstractC0168G;
import p387Pl.C6474V;
import p387Pl.EnumC6464K;

/* JADX INFO: renamed from: Nl.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C5828J extends AbstractC5833e implements InterfaceC5826H {

    /* JADX INFO: renamed from: a */
    public final String f19037a;

    /* JADX INFO: renamed from: b */
    public final C6474V f19038b;

    /* JADX INFO: renamed from: c */
    public final boolean f19039c;

    /* JADX INFO: renamed from: d */
    public final String f19040d;

    /* JADX INFO: renamed from: e */
    public final String f19041e;

    /* JADX INFO: renamed from: f */
    public final C5832d f19042f;

    /* JADX INFO: renamed from: g */
    public final EnumC6464K f19043g;

    /* JADX INFO: renamed from: h */
    public final String f19044h;

    /* JADX INFO: renamed from: i */
    public final RtpParameters.DegradationPreference f19045i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5828J(AbstractC5833e base) {
        this(null, base.mo6235g(), base.mo6233e(), base.mo6234f(), base.mo6232d(), base.mo6230b(), null, null, base.mo6231c());
        AbstractC16544l.m18094g(base, "base");
    }

    /* JADX INFO: renamed from: h */
    public static C5828J m6236h(C5828J c5828j, C6474V c6474v, String str, String str2, C5832d c5832d, int i10) {
        String str3 = c5828j.f19037a;
        if ((i10 & 2) != 0) {
            c6474v = c5828j.f19038b;
        }
        C6474V c6474v2 = c6474v;
        boolean z6 = c5828j.f19039c;
        if ((i10 & 8) != 0) {
            str = c5828j.f19040d;
        }
        String videoCodec = str;
        if ((i10 & 16) != 0) {
            str2 = c5828j.f19041e;
        }
        String str4 = str2;
        if ((i10 & 32) != 0) {
            c5832d = c5828j.f19042f;
        }
        EnumC6464K enumC6464K = c5828j.f19043g;
        String str5 = c5828j.f19044h;
        RtpParameters.DegradationPreference degradationPreference = c5828j.f19045i;
        c5828j.getClass();
        AbstractC16544l.m18094g(videoCodec, "videoCodec");
        return new C5828J(str3, c6474v2, z6, videoCodec, str4, c5832d, enumC6464K, str5, degradationPreference);
    }

    @Override // p344Nl.InterfaceC5826H
    /* JADX INFO: renamed from: a */
    public final String mo6229a() {
        return this.f19044h;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: b */
    public final C5832d mo6230b() {
        return this.f19042f;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: c */
    public final RtpParameters.DegradationPreference mo6231c() {
        return this.f19045i;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: d */
    public final String mo6232d() {
        return this.f19041e;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: e */
    public final boolean mo6233e() {
        return this.f19039c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5828J)) {
            return false;
        }
        C5828J c5828j = (C5828J) obj;
        return AbstractC16544l.m18089b(this.f19037a, c5828j.f19037a) && AbstractC16544l.m18089b(this.f19038b, c5828j.f19038b) && this.f19039c == c5828j.f19039c && AbstractC16544l.m18089b(this.f19040d, c5828j.f19040d) && AbstractC16544l.m18089b(this.f19041e, c5828j.f19041e) && AbstractC16544l.m18089b(this.f19042f, c5828j.f19042f) && this.f19043g == c5828j.f19043g && AbstractC16544l.m18089b(this.f19044h, c5828j.f19044h) && this.f19045i == c5828j.f19045i;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: f */
    public final String mo6234f() {
        return this.f19040d;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: g */
    public final C6474V mo6235g() {
        return this.f19038b;
    }

    @Override // p344Nl.InterfaceC5826H
    public final String getName() {
        return this.f19037a;
    }

    public final int hashCode() {
        String str = this.f19037a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C6474V c6474v = this.f19038b;
        int iM527p = AbstractC0168G.m527p((((iHashCode + (c6474v == null ? 0 : c6474v.hashCode())) * 31) + (this.f19039c ? 1231 : 1237)) * 31, 31, this.f19040d);
        String str2 = this.f19041e;
        int iHashCode2 = (iM527p + (str2 == null ? 0 : str2.hashCode())) * 31;
        C5832d c5832d = this.f19042f;
        int iHashCode3 = (iHashCode2 + (c5832d == null ? 0 : c5832d.hashCode())) * 31;
        EnumC6464K enumC6464K = this.f19043g;
        int iHashCode4 = (iHashCode3 + (enumC6464K == null ? 0 : enumC6464K.hashCode())) * 31;
        String str3 = this.f19044h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RtpParameters.DegradationPreference degradationPreference = this.f19045i;
        return iHashCode5 + (degradationPreference != null ? degradationPreference.hashCode() : 0);
    }

    public final String toString() {
        return "VideoTrackPublishOptions(name=" + this.f19037a + ", videoEncoding=" + this.f19038b + ", simulcast=" + this.f19039c + ", videoCodec=" + this.f19040d + ", scalabilityMode=" + this.f19041e + ", backupCodec=" + this.f19042f + ", source=" + this.f19043g + ", stream=" + this.f19044h + ", degradationPreference=" + this.f19045i + ')';
    }

    public C5828J(String str, C6474V c6474v, boolean z6, String videoCodec, String str2, C5832d c5832d, EnumC6464K enumC6464K, String str3, RtpParameters.DegradationPreference degradationPreference) {
        AbstractC16544l.m18094g(videoCodec, "videoCodec");
        this.f19037a = str;
        this.f19038b = c6474v;
        this.f19039c = z6;
        this.f19040d = videoCodec;
        this.f19041e = str2;
        this.f19042f = c5832d;
        this.f19043g = enumC6464K;
        this.f19044h = str3;
        this.f19045i = degradationPreference;
    }
}
