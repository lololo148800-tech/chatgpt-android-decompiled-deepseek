package p075Cl;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.PeerConnection;
import p273Kl.EnumC4710B;

/* JADX INFO: renamed from: Cl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1720c {

    /* JADX INFO: renamed from: a */
    public final boolean f4936a;

    /* JADX INFO: renamed from: b */
    public final List f4937b;

    /* JADX INFO: renamed from: c */
    public final PeerConnection.RTCConfiguration f4938c;

    /* JADX INFO: renamed from: d */
    public final boolean f4939d;

    /* JADX INFO: renamed from: e */
    public final boolean f4940e;

    /* JADX INFO: renamed from: f */
    public final EnumC4710B f4941f;

    /* JADX INFO: renamed from: g */
    public boolean f4942g;

    /* JADX INFO: renamed from: h */
    public String f4943h;

    public C1720c(boolean z6, List list, PeerConnection.RTCConfiguration rTCConfiguration, boolean z10, boolean z11, EnumC4710B protocolVersion) {
        AbstractC16544l.m18094g(protocolVersion, "protocolVersion");
        this.f4936a = z6;
        this.f4937b = list;
        this.f4938c = rTCConfiguration;
        this.f4939d = z10;
        this.f4940e = z11;
        this.f4941f = protocolVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1720c)) {
            return false;
        }
        C1720c c1720c = (C1720c) obj;
        return this.f4936a == c1720c.f4936a && AbstractC16544l.m18089b(this.f4937b, c1720c.f4937b) && AbstractC16544l.m18089b(this.f4938c, c1720c.f4938c) && this.f4939d == c1720c.f4939d && this.f4940e == c1720c.f4940e && this.f4941f == c1720c.f4941f;
    }

    public final int hashCode() {
        int i10 = (this.f4936a ? 1231 : 1237) * 31;
        List list = this.f4937b;
        int iHashCode = (i10 + (list == null ? 0 : list.hashCode())) * 31;
        PeerConnection.RTCConfiguration rTCConfiguration = this.f4938c;
        return this.f4941f.hashCode() + ((((((iHashCode + (rTCConfiguration != null ? rTCConfiguration.hashCode() : 0)) * 31) + (this.f4939d ? 1231 : 1237)) * 31) + (this.f4940e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ConnectOptions(autoSubscribe=" + this.f4936a + ", iceServers=" + this.f4937b + ", rtcConfig=" + this.f4938c + ", audio=" + this.f4939d + ", video=" + this.f4940e + ", protocolVersion=" + this.f4941f + ')';
    }

    public /* synthetic */ C1720c() {
        this(true, null, null, false, false, EnumC4710B.v13);
    }
}
