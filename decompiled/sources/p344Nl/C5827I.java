package p344Nl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.RtpParameters;
import p003A1.AbstractC0168G;
import p387Pl.C6472T;
import p387Pl.C6474V;
import p387Pl.EnumC6473U;

/* JADX INFO: renamed from: Nl.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C5827I extends AbstractC5833e {

    /* JADX INFO: renamed from: a */
    public final C6474V f19031a;

    /* JADX INFO: renamed from: b */
    public final boolean f19032b;

    /* JADX INFO: renamed from: c */
    public final String f19033c;

    /* JADX INFO: renamed from: d */
    public final String f19034d;

    /* JADX INFO: renamed from: e */
    public final C5832d f19035e;

    /* JADX INFO: renamed from: f */
    public final RtpParameters.DegradationPreference f19036f;

    public C5827I(C6474V c6474v, RtpParameters.DegradationPreference degradationPreference, int i10) {
        c6474v = (i10 & 1) != 0 ? null : c6474v;
        C6472T c6472t = EnumC6473U.Companion;
        degradationPreference = (i10 & 32) != 0 ? null : degradationPreference;
        this.f19031a = c6474v;
        this.f19032b = true;
        this.f19033c = "vp8";
        this.f19034d = null;
        this.f19035e = null;
        this.f19036f = degradationPreference;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: b */
    public final C5832d mo6230b() {
        return this.f19035e;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: c */
    public final RtpParameters.DegradationPreference mo6231c() {
        return this.f19036f;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: d */
    public final String mo6232d() {
        return this.f19034d;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: e */
    public final boolean mo6233e() {
        return this.f19032b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5827I)) {
            return false;
        }
        C5827I c5827i = (C5827I) obj;
        return AbstractC16544l.m18089b(this.f19031a, c5827i.f19031a) && this.f19032b == c5827i.f19032b && AbstractC16544l.m18089b(this.f19033c, c5827i.f19033c) && AbstractC16544l.m18089b(this.f19034d, c5827i.f19034d) && AbstractC16544l.m18089b(this.f19035e, c5827i.f19035e) && this.f19036f == c5827i.f19036f;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: f */
    public final String mo6234f() {
        return this.f19033c;
    }

    @Override // p344Nl.AbstractC5833e
    /* JADX INFO: renamed from: g */
    public final C6474V mo6235g() {
        return this.f19031a;
    }

    public final int hashCode() {
        C6474V c6474v = this.f19031a;
        int iM527p = AbstractC0168G.m527p((((c6474v == null ? 0 : c6474v.hashCode()) * 31) + (this.f19032b ? 1231 : 1237)) * 31, 31, this.f19033c);
        String str = this.f19034d;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        C5832d c5832d = this.f19035e;
        int iHashCode2 = (iHashCode + (c5832d == null ? 0 : c5832d.hashCode())) * 31;
        RtpParameters.DegradationPreference degradationPreference = this.f19036f;
        return iHashCode2 + (degradationPreference != null ? degradationPreference.hashCode() : 0);
    }

    public final String toString() {
        return "VideoTrackPublishDefaults(videoEncoding=" + this.f19031a + ", simulcast=" + this.f19032b + ", videoCodec=" + this.f19033c + ", scalabilityMode=" + this.f19034d + ", backupCodec=" + this.f19035e + ", degradationPreference=" + this.f19036f + ')';
    }
}
