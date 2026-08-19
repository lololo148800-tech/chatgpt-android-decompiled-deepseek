package p075Cl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import mo.C17356w;

/* JADX INFO: renamed from: Cl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1721d {

    /* JADX INFO: renamed from: d */
    public final C1718a f4947d;

    /* JADX INFO: renamed from: a */
    public final C17356w f4944a = null;

    /* JADX INFO: renamed from: b */
    public final VideoEncoderFactory f4945b = null;

    /* JADX INFO: renamed from: c */
    public final VideoDecoderFactory f4946c = null;

    /* JADX INFO: renamed from: e */
    public final EglBase f4948e = null;

    /* JADX INFO: renamed from: f */
    public final PeerConnectionFactory.Options f4949f = null;

    public C1721d(C1718a c1718a) {
        this.f4947d = c1718a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721d)) {
            return false;
        }
        C1721d c1721d = (C1721d) obj;
        return AbstractC16544l.m18089b(this.f4944a, c1721d.f4944a) && AbstractC16544l.m18089b(this.f4945b, c1721d.f4945b) && AbstractC16544l.m18089b(this.f4946c, c1721d.f4946c) && AbstractC16544l.m18089b(this.f4947d, c1721d.f4947d) && AbstractC16544l.m18089b(this.f4948e, c1721d.f4948e) && AbstractC16544l.m18089b(this.f4949f, c1721d.f4949f);
    }

    public final int hashCode() {
        C17356w c17356w = this.f4944a;
        int iHashCode = (c17356w == null ? 0 : c17356w.hashCode()) * 31;
        VideoEncoderFactory videoEncoderFactory = this.f4945b;
        int iHashCode2 = (iHashCode + (videoEncoderFactory == null ? 0 : videoEncoderFactory.hashCode())) * 31;
        VideoDecoderFactory videoDecoderFactory = this.f4946c;
        int iHashCode3 = (iHashCode2 + (videoDecoderFactory == null ? 0 : videoDecoderFactory.hashCode())) * 31;
        C1718a c1718a = this.f4947d;
        int iHashCode4 = (iHashCode3 + (c1718a == null ? 0 : c1718a.hashCode())) * 31;
        EglBase eglBase = this.f4948e;
        int iHashCode5 = (iHashCode4 + (eglBase == null ? 0 : eglBase.hashCode())) * 31;
        PeerConnectionFactory.Options options = this.f4949f;
        return iHashCode5 + (options != null ? options.hashCode() : 0);
    }

    public final String toString() {
        return "LiveKitOverrides(okHttpClient=" + this.f4944a + ", videoEncoderFactory=" + this.f4945b + ", videoDecoderFactory=" + this.f4946c + ", audioOptions=" + this.f4947d + ", eglBase=" + this.f4948e + ", peerConnectionFactoryOptions=" + this.f4949f + ')';
    }
}
