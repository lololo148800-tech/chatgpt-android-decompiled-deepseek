package p1120y4;

import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p1027tp.AbstractC20064h;
import p117Eb.C2391u;

/* JADX INFO: renamed from: y4.a */
/* JADX INFO: loaded from: classes.dex */
public final class WindowOnFrameMetricsAvailableListenerC21374a implements Window$OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a */
    public final ArrayList f67849a;

    /* JADX INFO: renamed from: b */
    public boolean f67850b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f67851c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f67852d = new ArrayList();

    public WindowOnFrameMetricsAvailableListenerC21374a(ArrayList arrayList) {
        this.f67849a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m21759a(WindowOnFrameMetricsAvailableListenerC21383j delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        synchronized (this) {
            try {
                if (this.f67850b) {
                    this.f67851c.add(delegate);
                } else {
                    this.f67849a.add(delegate);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        View decorView;
        synchronized (this) {
            try {
                this.f67850b = true;
                Iterator it = this.f67849a.iterator();
                while (it.hasNext()) {
                    AbstractC20064h.m20901e(it.next()).onFrameMetricsAvailable(window, frameMetrics, i10);
                }
                if (!this.f67851c.isEmpty()) {
                    Iterator it2 = this.f67851c.iterator();
                    while (it2.hasNext()) {
                        this.f67849a.add(AbstractC20064h.m20901e(it2.next()));
                    }
                    this.f67851c.clear();
                }
                if (!this.f67852d.isEmpty()) {
                    boolean zIsEmpty = this.f67849a.isEmpty();
                    Iterator it3 = this.f67852d.iterator();
                    while (it3.hasNext()) {
                        this.f67849a.remove(AbstractC20064h.m20901e(it3.next()));
                    }
                    this.f67852d.clear();
                    if (!zIsEmpty && this.f67849a.isEmpty()) {
                        if (window != null) {
                            window.removeOnFrameMetricsAvailableListener(this);
                        }
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            decorView.setTag(R.id.metricsDelegator, null);
                        }
                    }
                }
                this.f67850b = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            AbstractC16544l.m18093f(decorView2, "window.decorView");
            ViewParent parent = decorView2.getParent();
            while (parent instanceof View) {
                decorView2 = parent;
                parent = decorView2.getParent();
            }
            Object tag = decorView2.getTag(R.id.metricsStateHolder);
            if (tag == null) {
                tag = new C21387n();
                decorView2.setTag(R.id.metricsStateHolder, tag);
            }
            C2391u c2391u = ((C21387n) tag).f67896a;
            if (c2391u != null) {
                c2391u.m3522s();
            }
        }
    }
}
