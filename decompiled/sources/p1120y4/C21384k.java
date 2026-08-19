package p1120y4;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.openai.chatgpt.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p117Eb.C2391u;
import p523V9.AbstractC8012V5;

/* JADX INFO: renamed from: y4.k */
/* JADX INFO: loaded from: classes.dex */
public class C21384k extends C21382i {

    /* JADX INFO: renamed from: o */
    public static Handler f67888o;

    /* JADX INFO: renamed from: i */
    public final Window f67889i;

    /* JADX INFO: renamed from: j */
    public long f67890j;

    /* JADX INFO: renamed from: k */
    public long f67891k;

    /* JADX INFO: renamed from: l */
    public long f67892l;

    /* JADX INFO: renamed from: m */
    public final C21378e f67893m;

    /* JADX INFO: renamed from: n */
    public final WindowOnFrameMetricsAvailableListenerC21383j f67894n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [y4.j] */
    public C21384k(final C21380g jankStats, View view, Window window) {
        super(jankStats, view);
        AbstractC16544l.m18094g(jankStats, "jankStats");
        this.f67889i = window;
        this.f67893m = new C21378e(this.f67883d);
        this.f67894n = new Window$OnFrameMetricsAvailableListener() { // from class: y4.j
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i10) {
                C21384k this$0 = this.f67886a;
                C21380g jankStats2 = jankStats;
                AbstractC16544l.m18094g(this$0, "this$0");
                AbstractC16544l.m18094g(jankStats2, "$jankStats");
                AbstractC16544l.m18093f(frameMetrics, "frameMetrics");
                long jMax = Math.max(this$0.mo21769g(frameMetrics), this$0.f67892l);
                if (jMax < this$0.f67891k || jMax == this$0.f67890j) {
                    return;
                }
                jankStats2.m21760a(this$0.mo21768f(jMax, (long) (this$0.mo21767e(frameMetrics) * jankStats2.f67875d), frameMetrics));
                this$0.f67890j = jMax;
            }
        };
    }

    /* JADX INFO: renamed from: h */
    public static WindowOnFrameMetricsAvailableListenerC21374a m21765h(Window window) {
        WindowOnFrameMetricsAvailableListenerC21374a windowOnFrameMetricsAvailableListenerC21374a = (WindowOnFrameMetricsAvailableListenerC21374a) window.getDecorView().getTag(R.id.metricsDelegator);
        if (windowOnFrameMetricsAvailableListenerC21374a != null) {
            return windowOnFrameMetricsAvailableListenerC21374a;
        }
        WindowOnFrameMetricsAvailableListenerC21374a windowOnFrameMetricsAvailableListenerC21374a2 = new WindowOnFrameMetricsAvailableListenerC21374a(new ArrayList());
        if (f67888o == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            handlerThread.start();
            f67888o = new Handler(handlerThread.getLooper());
        }
        window.addOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC21374a2, f67888o);
        window.getDecorView().setTag(R.id.metricsDelegator, windowOnFrameMetricsAvailableListenerC21374a2);
        return windowOnFrameMetricsAvailableListenerC21374a2;
    }

    /* JADX INFO: renamed from: i */
    public static void m21766i(Window window, WindowOnFrameMetricsAvailableListenerC21383j delegate) {
        WindowOnFrameMetricsAvailableListenerC21374a windowOnFrameMetricsAvailableListenerC21374a = (WindowOnFrameMetricsAvailableListenerC21374a) window.getDecorView().getTag(R.id.metricsDelegator);
        if (windowOnFrameMetricsAvailableListenerC21374a != null) {
            AbstractC16544l.m18094g(delegate, "delegate");
            synchronized (windowOnFrameMetricsAvailableListenerC21374a) {
                try {
                    if (windowOnFrameMetricsAvailableListenerC21374a.f67850b) {
                        windowOnFrameMetricsAvailableListenerC21374a.f67852d.add(delegate);
                    } else {
                        boolean zIsEmpty = windowOnFrameMetricsAvailableListenerC21374a.f67849a.isEmpty();
                        windowOnFrameMetricsAvailableListenerC21374a.f67849a.remove(delegate);
                        if (!zIsEmpty && windowOnFrameMetricsAvailableListenerC21374a.f67849a.isEmpty()) {
                            window.removeOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC21374a);
                            window.getDecorView().setTag(R.id.metricsDelegator, null);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p1120y4.C21382i
    /* JADX INFO: renamed from: c */
    public final void mo21764c(boolean z6) {
        synchronized (this.f67889i) {
            try {
                if (!z6) {
                    m21766i(this.f67889i, this.f67894n);
                    this.f67891k = 0L;
                } else if (this.f67891k == 0) {
                    m21765h(this.f67889i).m21759a(this.f67894n);
                    this.f67891k = System.nanoTime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public long mo21767e(FrameMetrics metrics) {
        AbstractC16544l.m18094g(metrics, "metrics");
        View view = (View) this.f67880a.get();
        Field field = ViewTreeObserverOnPreDrawListenerC21376c.f67857t0;
        return AbstractC8012V5.m8330c(view);
    }

    /* JADX INFO: renamed from: f */
    public C21378e mo21768f(long j10, long j11, FrameMetrics frameMetrics) {
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
        C21378e c21378e = this.f67893m;
        c21378e.f67866b = j10;
        c21378e.f67867c = metric;
        c21378e.f67868d = z6;
        c21378e.f67869e = metric2;
        return c21378e;
    }

    /* JADX INFO: renamed from: g */
    public long mo21769g(FrameMetrics frameMetrics) throws IllegalAccessException {
        AbstractC16544l.m18094g(frameMetrics, "frameMetrics");
        Object obj = ViewTreeObserverOnPreDrawListenerC21376c.f67857t0.get(this.f67881b);
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) obj).longValue();
    }
}
