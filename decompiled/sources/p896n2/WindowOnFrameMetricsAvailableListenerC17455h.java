package p896n2;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import kotlin.jvm.internal.AbstractC16544l;
import p902n8.C17518e;

/* JADX INFO: renamed from: n2.h */
/* JADX INFO: loaded from: classes.dex */
public final class WindowOnFrameMetricsAvailableListenerC17455h implements Window$OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55803b;

    public /* synthetic */ WindowOnFrameMetricsAvailableListenerC17455h(Object obj, int i10) {
        this.f55802a = i10;
        this.f55803b = obj;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        switch (this.f55802a) {
            case 0:
                C17456i c17456i = (C17456i) this.f55803b;
                if ((c17456i.f55806Y & 1) != 0) {
                    C17456i.m19138o(c17456i.f55807Z[0], frameMetrics.getMetric(8));
                }
                C17456i c17456i2 = (C17456i) this.f55803b;
                if ((c17456i2.f55806Y & 2) != 0) {
                    C17456i.m19138o(c17456i2.f55807Z[1], frameMetrics.getMetric(1));
                }
                C17456i c17456i3 = (C17456i) this.f55803b;
                if ((c17456i3.f55806Y & 4) != 0) {
                    C17456i.m19138o(c17456i3.f55807Z[2], frameMetrics.getMetric(3));
                }
                C17456i c17456i4 = (C17456i) this.f55803b;
                if ((c17456i4.f55806Y & 8) != 0) {
                    C17456i.m19138o(c17456i4.f55807Z[3], frameMetrics.getMetric(4));
                }
                C17456i c17456i5 = (C17456i) this.f55803b;
                if ((c17456i5.f55806Y & 16) != 0) {
                    C17456i.m19138o(c17456i5.f55807Z[4], frameMetrics.getMetric(5));
                }
                C17456i c17456i6 = (C17456i) this.f55803b;
                if ((c17456i6.f55806Y & 64) != 0) {
                    C17456i.m19138o(c17456i6.f55807Z[6], frameMetrics.getMetric(7));
                }
                C17456i c17456i7 = (C17456i) this.f55803b;
                if ((c17456i7.f55806Y & 32) != 0) {
                    C17456i.m19138o(c17456i7.f55807Z[5], frameMetrics.getMetric(6));
                }
                C17456i c17456i8 = (C17456i) this.f55803b;
                if ((c17456i8.f55806Y & 128) != 0) {
                    C17456i.m19138o(c17456i8.f55807Z[7], frameMetrics.getMetric(0));
                }
                C17456i c17456i9 = (C17456i) this.f55803b;
                if ((c17456i9.f55806Y & 256) != 0) {
                    C17456i.m19138o(c17456i9.f55807Z[8], frameMetrics.getMetric(2));
                }
                break;
            default:
                AbstractC16544l.m18094g(window, "window");
                AbstractC16544l.m18094g(frameMetrics, "frameMetrics");
                ((C17518e) this.f55803b).f56041v0 = frameMetrics.getMetric(13);
                break;
        }
    }
}
