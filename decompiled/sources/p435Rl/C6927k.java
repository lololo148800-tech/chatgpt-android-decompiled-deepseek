package p435Rl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoSink;

/* JADX INFO: renamed from: Rl.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C6927k implements CapturerObserver {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f22197a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f22198b = new LinkedHashSet();

    @Override // livekit.org.webrtc.CapturerObserver
    public final synchronized void onCapturerStarted(boolean z6) {
        Iterator it = this.f22197a.iterator();
        while (it.hasNext()) {
            ((CapturerObserver) it.next()).onCapturerStarted(z6);
        }
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public final synchronized void onCapturerStopped() {
        Iterator it = this.f22197a.iterator();
        while (it.hasNext()) {
            ((CapturerObserver) it.next()).onCapturerStopped();
        }
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public final synchronized void onFrameCaptured(VideoFrame frame) {
        try {
            AbstractC16544l.m18094g(frame, "frame");
            Iterator it = this.f22197a.iterator();
            while (it.hasNext()) {
                ((CapturerObserver) it.next()).onFrameCaptured(frame);
            }
            Iterator it2 = this.f22198b.iterator();
            while (it2.hasNext()) {
                ((VideoSink) it2.next()).onFrame(frame);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
