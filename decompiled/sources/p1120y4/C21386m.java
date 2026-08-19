package p1120y4;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p117Eb.C2391u;

/* JADX INFO: renamed from: y4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C21386m extends C21385l {

    /* JADX INFO: renamed from: p */
    public final C21379f f67895p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21386m(C21380g jankStats, View view, Window window) {
        super(jankStats, view, window);
        AbstractC16544l.m18094g(jankStats, "jankStats");
        ArrayList states = this.f67883d;
        AbstractC16544l.m18094g(states, "states");
        C21379f c21379f = new C21379f(states);
        c21379f.f67870f = 0L;
        c21379f.f67871g = 0L;
        this.f67895p = c21379f;
    }

    @Override // p1120y4.C21384k
    /* JADX INFO: renamed from: e */
    public final long mo21767e(FrameMetrics metrics) {
        AbstractC16544l.m18094g(metrics, "metrics");
        return metrics.getMetric(13);
    }

    @Override // p1120y4.C21384k
    /* JADX INFO: renamed from: f */
    public final C21378e mo21768f(long j10, long j11, FrameMetrics frameMetrics) {
        AbstractC16544l.m18094g(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j12 = j10 + metric;
        this.f67892l = j12;
        C2391u c2391u = this.f67882c.f67896a;
        if (c2391u != null) {
            c2391u.m3527z(j10, j12, this.f67883d);
        }
        boolean z6 = metric > j11;
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        long metric4 = metric2 - frameMetrics.getMetric(13);
        C21379f c21379f = this.f67895p;
        c21379f.f67866b = j10;
        c21379f.f67867c = metric;
        c21379f.f67868d = z6;
        c21379f.f67869e = metric3;
        c21379f.f67870f = metric2;
        c21379f.f67871g = metric4;
        return c21379f;
    }
}
