package p109E3;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import p083D3.C1874l;
import p083D3.C1875m;

/* JADX INFO: renamed from: E3.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2260A {
    /* JADX INFO: renamed from: a */
    public static void m3300a(AudioTrack audioTrack, C1875m c1875m) {
        C1874l c1874l = c1875m.f5419b;
        c1874l.getClass();
        LogSessionId logSessionId = c1874l.f5417a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
