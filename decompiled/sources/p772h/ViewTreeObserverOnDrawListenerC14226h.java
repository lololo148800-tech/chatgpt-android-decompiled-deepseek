package p772h;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.AbstractActivityC10817a;
import com.statsig.androidsdk.ErrorBoundaryKt;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import p741f5.RunnableC13542a;

/* JADX INFO: renamed from: h.h */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC14226h implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: Y */
    public final long f44666Y = SystemClock.uptimeMillis() + ((long) ErrorBoundaryKt.SAMPLING_RATE);

    /* JADX INFO: renamed from: Z */
    public Runnable f44667Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f44668o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractActivityC10817a f44669p0;

    public ViewTreeObserverOnDrawListenerC14226h(AbstractActivityC10817a abstractActivityC10817a) {
        this.f44669p0 = abstractActivityC10817a;
    }

    /* JADX INFO: renamed from: a */
    public final void m15527a(View view) {
        if (this.f44668o0) {
            return;
        }
        this.f44668o0 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC16544l.m18094g(runnable, "runnable");
        this.f44667Z = runnable;
        View decorView = this.f44669p0.getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView, "window.decorView");
        if (!this.f44668o0) {
            decorView.postOnAnimation(new RunnableC13542a(this, 1));
        } else if (AbstractC16544l.m18089b(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z6;
        Runnable runnable = this.f44667Z;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f44666Y) {
                this.f44668o0 = false;
                this.f44669p0.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f44667Z = null;
        C14236r c14236r = (C14236r) this.f44669p0.f32067s0.getValue();
        synchronized (c14236r.f44686b) {
            z6 = c14236r.f44687c;
        }
        if (z6) {
            this.f44668o0 = false;
            this.f44669p0.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44669p0.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
