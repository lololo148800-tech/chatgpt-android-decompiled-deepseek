package p387Pl;

import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: Pl.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6488h {

    /* JADX INFO: renamed from: a */
    public final boolean f21052a = true;

    /* JADX INFO: renamed from: b */
    public final boolean f21053b = true;

    /* JADX INFO: renamed from: c */
    public final boolean f21054c = true;

    /* JADX INFO: renamed from: d */
    public final boolean f21055d = true;

    /* JADX INFO: renamed from: e */
    public final boolean f21056e = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6488h)) {
            return false;
        }
        C6488h c6488h = (C6488h) obj;
        return this.f21052a == c6488h.f21052a && this.f21053b == c6488h.f21053b && this.f21054c == c6488h.f21054c && this.f21055d == c6488h.f21055d && this.f21056e == c6488h.f21056e;
    }

    public final int hashCode() {
        return ((((((((this.f21052a ? 1231 : 1237) * 31) + (this.f21053b ? 1231 : 1237)) * 31) + (this.f21054c ? 1231 : 1237)) * 31) + (this.f21055d ? 1231 : 1237)) * 31) + (this.f21056e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalAudioTrackOptions(noiseSuppression=");
        sb2.append(this.f21052a);
        sb2.append(", echoCancellation=");
        sb2.append(this.f21053b);
        sb2.append(", autoGainControl=");
        sb2.append(this.f21054c);
        sb2.append(", highPassFilter=");
        sb2.append(this.f21055d);
        sb2.append(", typingNoiseDetection=");
        return AbstractC3794B0.m4499x(sb2, this.f21056e, ')');
    }
}
