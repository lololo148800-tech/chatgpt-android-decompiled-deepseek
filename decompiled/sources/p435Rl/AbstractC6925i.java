package p435Rl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.VideoCapturer;
import p138F8.vJO.vRJidSveZHcTw;

/* JADX INFO: renamed from: Rl.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6925i implements VideoCapturer {
    private final C6926j cameraEventsDispatchHandler;

    public abstract Size findCaptureFormat(int i10, int i11);

    public final C6926j getCameraEventsDispatchHandler() {
        return this.cameraEventsDispatchHandler;
    }

    public AbstractC6925i(C6926j c6926j) {
        AbstractC16544l.m18094g(c6926j, vRJidSveZHcTw.lUL);
        this.cameraEventsDispatchHandler = c6926j;
    }
}
