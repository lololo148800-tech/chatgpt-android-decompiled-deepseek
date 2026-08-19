package p1120y4;

import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p117Eb.C2391u;
import p523V9.AbstractC8012V5;

/* JADX INFO: renamed from: y4.c */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC21376c implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: t0 */
    public static final Field f67857t0;

    /* JADX INFO: renamed from: Y */
    public final Choreographer f67858Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f67859Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f67860o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f67861p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f67862q0;

    /* JADX INFO: renamed from: r0 */
    public final WeakReference f67863r0;

    /* JADX INFO: renamed from: s0 */
    public final C21387n f67864s0;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        AbstractC16544l.m18093f(declaredField, "Choreographer::class.jav…ld(\"mLastFrameTimeNanos\")");
        f67857t0 = declaredField;
        declaredField.setAccessible(true);
    }

    public ViewTreeObserverOnPreDrawListenerC21376c(View view, Choreographer choreographer, ArrayList arrayList) {
        AbstractC16544l.m18094g(choreographer, "choreographer");
        this.f67858Y = choreographer;
        this.f67859Z = arrayList;
        this.f67861p0 = new ArrayList();
        this.f67862q0 = new ArrayList();
        this.f67863r0 = new WeakReference(view);
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
        this.f67864s0 = (C21387n) tag;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws IllegalAccessException {
        final View view = (View) this.f67863r0.get();
        if (view == null) {
            return true;
        }
        Object obj = f67857t0.get(this.f67858Y);
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Long");
        final long jLongValue = ((Long) obj).longValue();
        Handler handler = view.getHandler();
        Message messageObtain = Message.obtain(view.getHandler(), new Runnable() { // from class: y4.b
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                ViewTreeObserverOnPreDrawListenerC21376c this$0 = this;
                long j10 = jLongValue;
                View view3 = view;
                AbstractC16544l.m18094g(this$0, "this$0");
                long jNanoTime = System.nanoTime();
                Field field = ViewTreeObserverOnPreDrawListenerC21376c.f67857t0;
                long jM8330c = AbstractC8012V5.m8330c(view2);
                synchronized (this$0) {
                    try {
                        this$0.f67860o0 = true;
                        for (C21381h c21381h : this$0.f67859Z) {
                            long j11 = jNanoTime - j10;
                            C21380g c21380g = c21381h.f67876a;
                            long j12 = (long) (jM8330c * c21380g.f67875d);
                            C21382i c21382i = c21381h.f67877b;
                            C2391u c2391u = c21382i.f67882c.f67896a;
                            if (c2391u != null) {
                                c2391u.m3527z(j10, j10 + j11, c21382i.f67883d);
                            }
                            boolean z6 = j11 > j12;
                            C21377d c21377d = c21382i.f67884e;
                            c21377d.f67866b = j10;
                            c21377d.f67867c = j11;
                            c21377d.f67868d = z6;
                            c21380g.m21760a(c21377d);
                            jNanoTime = jNanoTime;
                            jM8330c = jM8330c;
                        }
                        if (!this$0.f67861p0.isEmpty()) {
                            Iterator it = this$0.f67861p0.iterator();
                            while (it.hasNext()) {
                                this$0.f67859Z.add((C21381h) it.next());
                            }
                            this$0.f67861p0.clear();
                        }
                        if (!this$0.f67862q0.isEmpty()) {
                            boolean zIsEmpty = this$0.f67859Z.isEmpty();
                            Iterator it2 = this$0.f67862q0.iterator();
                            while (it2.hasNext()) {
                                this$0.f67859Z.remove((C21381h) it2.next());
                            }
                            this$0.f67862q0.clear();
                            if (!zIsEmpty && this$0.f67859Z.isEmpty()) {
                                view3.getViewTreeObserver().removeOnPreDrawListener(this$0);
                                view3.setTag(R.id.metricsDelegator, null);
                            }
                        }
                        this$0.f67860o0 = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C2391u c2391u2 = this$0.f67864s0.f67896a;
                if (c2391u2 != null) {
                    c2391u2.m3522s();
                }
            }
        });
        AbstractC16544l.m18093f(messageObtain, "this");
        messageObtain.setAsynchronous(true);
        handler.sendMessageAtFrontOfQueue(messageObtain);
        return true;
    }
}
