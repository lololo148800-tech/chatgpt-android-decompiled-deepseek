package p083D3;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: renamed from: D3.i */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1871i {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ NetworkEvent.Builder m2793b() {
        return new NetworkEvent.Builder();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ PlaybackErrorEvent.Builder m2795d() {
        return new PlaybackErrorEvent.Builder();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ PlaybackMetrics.Builder m2800i() {
        return new PlaybackMetrics.Builder();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m2802k(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ PlaybackStateEvent.Builder m2804m() {
        return new PlaybackStateEvent.Builder();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ TrackChangeEvent.Builder m2808q(int i10) {
        return new TrackChangeEvent.Builder(i10);
    }
}
