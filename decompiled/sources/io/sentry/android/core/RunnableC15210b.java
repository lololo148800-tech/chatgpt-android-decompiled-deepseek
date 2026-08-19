package io.sentry.android.core;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;
import p791hj.C14522e;

/* JADX INFO: renamed from: io.sentry.android.core.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15210b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47453Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14522e f47454Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Activity f47455o0;

    public /* synthetic */ RunnableC15210b(C14522e c14522e, Activity activity, int i10) {
        this.f47453Y = i10;
        this.f47454Z = c14522e;
        this.f47455o0 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47453Y) {
            case 0:
                ((FrameMetricsAggregator) this.f47454Z.f45761Y).f32883a.mo17938f(this.f47455o0);
                break;
            default:
                ((FrameMetricsAggregator) this.f47454Z.f45761Y).f32883a.mo17940k(this.f47455o0);
                break;
        }
    }
}
