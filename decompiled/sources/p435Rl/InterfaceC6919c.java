package p435Rl;

import android.content.Context;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.VideoCapturer;
import p387Pl.C6502v;

/* JADX INFO: renamed from: Rl.c */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6919c {
    int getCameraVersion();

    boolean isSupported(Context context);

    VideoCapturer provideCapturer(Context context, C6502v c6502v, C6926j c6926j);

    CameraEnumerator provideEnumerator(Context context);
}
