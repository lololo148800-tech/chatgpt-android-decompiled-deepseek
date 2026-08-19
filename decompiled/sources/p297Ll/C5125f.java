package p297Ll;

import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RTCStatsReport;
import p025An.C0624m;

/* JADX INFO: renamed from: Ll.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5125f implements RTCStatsCollectorCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0624m f16756b;

    public /* synthetic */ C5125f(C0624m c0624m, int i10) {
        this.f16755a = i10;
        this.f16756b = c0624m;
    }

    @Override // livekit.org.webrtc.RTCStatsCollectorCallback
    public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        switch (this.f16755a) {
            case 0:
                this.f16756b.resumeWith(rTCStatsReport);
                break;
            case 1:
                this.f16756b.resumeWith(rTCStatsReport);
                break;
            default:
                this.f16756b.resumeWith(rTCStatsReport);
                break;
        }
    }
}
