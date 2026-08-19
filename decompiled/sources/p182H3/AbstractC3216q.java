package p182H3;

import android.media.metrics.LogSessionId;
import p083D3.C1874l;
import p083D3.C1875m;

/* JADX INFO: renamed from: H3.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3216q {
    /* JADX INFO: renamed from: a */
    public static void m4085a(C3208i c3208i, C1875m c1875m) {
        C1874l c1874l = c1875m.f5419b;
        c1874l.getClass();
        LogSessionId logSessionId = c1874l.f5417a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c3208i.f9698b.setString("log-session-id", logSessionId.getStringId());
    }
}
