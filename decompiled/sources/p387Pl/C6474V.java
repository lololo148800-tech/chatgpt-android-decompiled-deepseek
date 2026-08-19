package p387Pl;

import com.google.protobuf.AbstractC12107L1;
import livekit.org.webrtc.RtpParameters;

/* JADX INFO: renamed from: Pl.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C6474V {

    /* JADX INFO: renamed from: a */
    public final int f21005a;

    /* JADX INFO: renamed from: b */
    public final int f21006b;

    public C6474V(int i10, int i11) {
        this.f21005a = i10;
        this.f21006b = i11;
    }

    /* JADX INFO: renamed from: a */
    public final RtpParameters.Encoding m7057a(String str, double d10) {
        RtpParameters.Encoding encoding = new RtpParameters.Encoding(str, true, Double.valueOf(d10));
        encoding.numTemporalLayers = 1;
        encoding.maxBitrateBps = Integer.valueOf(this.f21005a);
        encoding.maxFramerate = Integer.valueOf(this.f21006b);
        if (d10 == 1.0d) {
            encoding.networkPriority = 3;
            encoding.bitratePriority = 4.0d;
        } else {
            encoding.networkPriority = 1;
            encoding.bitratePriority = 1.0d;
        }
        return encoding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6474V)) {
            return false;
        }
        C6474V c6474v = (C6474V) obj;
        return this.f21005a == c6474v.f21005a && this.f21006b == c6474v.f21006b;
    }

    public final int hashCode() {
        return (this.f21005a * 31) + this.f21006b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoding(maxBitrate=");
        sb2.append(this.f21005a);
        sb2.append(", maxFps=");
        return AbstractC12107L1.m13826q(sb2, this.f21006b, ')');
    }
}
