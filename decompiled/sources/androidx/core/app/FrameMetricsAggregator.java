package androidx.core.app;

import android.os.Build;
import p846k4.C16340i;
import p896n2.C17456i;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: a */
    public final C16340i f32883a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f32883a = new C17456i(i10);
        } else {
            this.f32883a = new C16340i();
        }
    }
}
