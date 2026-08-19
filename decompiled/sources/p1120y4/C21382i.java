package p1120y4;

import android.content.res.Resources;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: y4.i */
/* JADX INFO: loaded from: classes.dex */
public class C21382i {

    /* JADX INFO: renamed from: g */
    public static String f67878g = null;

    /* JADX INFO: renamed from: h */
    public static long f67879h = -1;

    /* JADX INFO: renamed from: a */
    public final WeakReference f67880a;

    /* JADX INFO: renamed from: b */
    public final Choreographer f67881b;

    /* JADX INFO: renamed from: c */
    public final C21387n f67882c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f67883d;

    /* JADX INFO: renamed from: e */
    public final C21377d f67884e;

    /* JADX INFO: renamed from: f */
    public final C21381h f67885f;

    public C21382i(C21380g jankStats, View view) {
        AbstractC16544l.m18094g(jankStats, "jankStats");
        this.f67880a = new WeakReference(view);
        Choreographer choreographer = Choreographer.getInstance();
        AbstractC16544l.m18093f(choreographer, "getInstance()");
        this.f67881b = choreographer;
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new C21387n();
            view.setTag(R.id.metricsStateHolder, tag);
        }
        this.f67882c = (C21387n) tag;
        ArrayList arrayList = new ArrayList();
        this.f67883d = arrayList;
        this.f67884e = new C21377d(arrayList);
        this.f67885f = new C21381h(jankStats, this);
    }

    /* JADX INFO: renamed from: a */
    public static final double m21761a(double d10) {
        return d10 * ((double) Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: b */
    public static void m21762b(View view, C21381h delegate) {
        ViewTreeObserverOnPreDrawListenerC21376c viewTreeObserverOnPreDrawListenerC21376c = (ViewTreeObserverOnPreDrawListenerC21376c) view.getTag(R.id.metricsDelegator);
        if (viewTreeObserverOnPreDrawListenerC21376c != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            AbstractC16544l.m18093f(viewTreeObserver, "viewTreeObserver");
            AbstractC16544l.m18094g(delegate, "delegate");
            synchronized (viewTreeObserverOnPreDrawListenerC21376c) {
                try {
                    if (viewTreeObserverOnPreDrawListenerC21376c.f67860o0) {
                        viewTreeObserverOnPreDrawListenerC21376c.f67862q0.add(delegate);
                    } else {
                        boolean zIsEmpty = viewTreeObserverOnPreDrawListenerC21376c.f67859Z.isEmpty();
                        viewTreeObserverOnPreDrawListenerC21376c.f67859Z.remove(delegate);
                        if (!zIsEmpty && viewTreeObserverOnPreDrawListenerC21376c.f67859Z.isEmpty()) {
                            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC21376c);
                            View view2 = (View) viewTreeObserverOnPreDrawListenerC21376c.f67863r0.get();
                            if (view2 != null) {
                                view2.setTag(R.id.metricsDelegator, null);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m21763d(int i10) {
        return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i10 & 16777215)}, 1));
    }

    /* JADX INFO: renamed from: c */
    public void mo21764c(boolean z6) {
        View view = (View) this.f67880a.get();
        if (view != null) {
            if (!z6) {
                m21762b(view, this.f67885f);
                return;
            }
            ViewTreeObserverOnPreDrawListenerC21376c viewTreeObserverOnPreDrawListenerC21376c = (ViewTreeObserverOnPreDrawListenerC21376c) view.getTag(R.id.metricsDelegator);
            if (viewTreeObserverOnPreDrawListenerC21376c == null) {
                ArrayList arrayList = new ArrayList();
                Choreographer choreographer = this.f67881b;
                AbstractC16544l.m18094g(choreographer, "choreographer");
                ViewTreeObserverOnPreDrawListenerC21376c viewTreeObserverOnPreDrawListenerC21376c2 = new ViewTreeObserverOnPreDrawListenerC21376c(view, choreographer, arrayList);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC21376c2);
                view.setTag(R.id.metricsDelegator, viewTreeObserverOnPreDrawListenerC21376c2);
                viewTreeObserverOnPreDrawListenerC21376c = viewTreeObserverOnPreDrawListenerC21376c2;
            }
            C21381h delegate = this.f67885f;
            AbstractC16544l.m18094g(delegate, "delegate");
            synchronized (viewTreeObserverOnPreDrawListenerC21376c) {
                try {
                    if (viewTreeObserverOnPreDrawListenerC21376c.f67860o0) {
                        viewTreeObserverOnPreDrawListenerC21376c.f67861p0.add(delegate);
                    } else {
                        viewTreeObserverOnPreDrawListenerC21376c.f67859Z.add(delegate);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
