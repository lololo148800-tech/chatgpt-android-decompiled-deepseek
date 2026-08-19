package livekit.org.webrtc;

import android.view.Choreographer;

/* JADX INFO: renamed from: livekit.org.webrtc.v */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC17052v implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ RenderSynchronizer f54513Y;

    public /* synthetic */ ChoreographerFrameCallbackC17052v(RenderSynchronizer renderSynchronizer) {
        this.f54513Y = renderSynchronizer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f54513Y.onDisplayRefreshCycleBegin(j10);
    }
}
