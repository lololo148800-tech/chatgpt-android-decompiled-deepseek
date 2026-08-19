package p387Pl;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.VideoTrack;

/* JADX INFO: renamed from: Pl.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C6459F {

    /* JADX INFO: renamed from: a */
    public String f20958a;

    /* JADX INFO: renamed from: b */
    public VideoTrack f20959b;

    /* JADX INFO: renamed from: c */
    public RtpSender f20960c;

    /* JADX INFO: renamed from: d */
    public List f20961d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6459F)) {
            return false;
        }
        C6459F c6459f = (C6459F) obj;
        return this.f20958a.equals(c6459f.f20958a) && AbstractC16544l.m18089b(this.f20959b, c6459f.f20959b) && AbstractC16544l.m18089b(this.f20960c, c6459f.f20960c) && AbstractC16544l.m18089b(this.f20961d, c6459f.f20961d);
    }

    public final int hashCode() {
        int iHashCode = (this.f20959b.hashCode() + (this.f20958a.hashCode() * 31)) * 31;
        RtpSender rtpSender = this.f20960c;
        int iHashCode2 = (iHashCode + (rtpSender == null ? 0 : rtpSender.hashCode())) * 31;
        List list = this.f20961d;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "SimulcastTrackInfo(codec=" + this.f20958a + ", rtcTrack=" + this.f20959b + ", sender=" + this.f20960c + ", encodings=" + this.f20961d + ')';
    }
}
