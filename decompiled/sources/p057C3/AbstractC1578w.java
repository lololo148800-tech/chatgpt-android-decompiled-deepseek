package p057C3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import p003A1.AbstractC0259j;
import p083D3.C1868f;
import p083D3.C1873k;
import p083D3.C1875m;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: C3.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1578w {
    /* JADX INFO: renamed from: a */
    public static C1875m m2439a(Context context, C1526D c1526d, boolean z6, String str) {
        MediaMetricsManager mediaMetricsManagerM836e = AbstractC0259j.m836e(context.getSystemService("media_metrics"));
        C1873k c1873k = mediaMetricsManagerM836e == null ? null : new C1873k(context, mediaMetricsManagerM836e.createPlaybackSession());
        if (c1873k == null) {
            AbstractC20800b.m21332t("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new C1875m(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z6) {
            c1526d.getClass();
            C1868f c1868f = c1526d.f4055E0;
            c1868f.getClass();
            c1868f.f5369r0.m10690a(c1873k);
        }
        return new C1875m(c1873k.f5392c.getSessionId(), str);
    }
}
