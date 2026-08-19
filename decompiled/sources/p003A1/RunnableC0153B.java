package p003A1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.compose.p650ui.platform.AndroidComposeView;
import androidx.fragment.app.AbstractC11002c;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.lifecycle.AbstractC11067C;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.Worker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fo.C13711h;
import fo.C13713j;
import fo.ViewOnAttachStateChangeListenerC13712i;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.replay.capture.C15272c;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18240g;
import p025An.AbstractC0575H;
import p030B2.AbstractC0738T;
import p049Bm.InterfaceC1426a;
import p084D4.C1876A;
import p1028u.C20085b;
import p108E2.C2242a;
import p108E2.ViewOnTouchListenerC2246e;
import p110E4.AbstractC2308f;
import p110E4.C2309g;
import p166Ga.C3029c;
import p207I4.C3614a;
import p232J3.C4213M;
import p232J3.C4219T;
import p233J4.C4256b;
import p233J4.C4262h;
import p277L.ExecutorC4836i;
import p277L.RunnableScheduledFutureC4830c;
import p301M.C5233o;
import p304M2.C5280c;
import p310M9.C5311e;
import p324Mn.C5551u;
import p372P3.InterfaceC6333o;
import p437Rn.C6959q;
import p477Tb.C7296c;
import p523V9.AbstractC7942M5;
import p588Y2.DialogInterfaceOnCancelListenerC9628l;
import p724ea.C13354a;
import p746fa.C13603l;
import p746fa.InterfaceC13593b;
import p747fb.InterfaceFutureC13608b;
import p826j6.AbstractC16144M;
import p826j6.C16149c;
import p826j6.C16155i;
import p826j6.ServiceConnectionC16132A;
import p906nh.C17623e;
import p906nh.C17625g;
import p906nh.C17626h;
import p909nm.AbstractC17665J;
import p909nm.C17691y;

/* JADX INFO: renamed from: A1.B */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0153B implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f629Y;

    /* JADX INFO: renamed from: Z */
    public final Object f630Z;

    public RunnableC0153B(InterfaceC1426a function) {
        this.f629Y = 18;
        AbstractC16544l.m18094g(function, "function");
        this.f630Z = function;
    }

    /* JADX INFO: renamed from: b */
    private final void m489b() {
        try {
            m494f();
        } catch (Error e10) {
            synchronized (((ExecutorC4836i) this.f630Z).f15738Y) {
                ((ExecutorC4836i) this.f630Z).f15741p0 = 1;
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m490c() {
        Object obj;
        synchronized (((AbstractC11067C) this.f630Z).f33359a) {
            obj = ((AbstractC11067C) this.f630Z).f33364f;
            ((AbstractC11067C) this.f630Z).f33364f = AbstractC11067C.f33358k;
        }
        ((AbstractC11067C) this.f630Z).mo12122j(obj);
    }

    /* JADX INFO: renamed from: d */
    private final void m491d() {
        C13354a c13354a = (C13354a) this.f630Z;
        synchronized (c13354a.f42379a) {
            try {
                if (c13354a.m14942b()) {
                    AbstractC15256t.m16465c("WakeLock", String.valueOf(c13354a.f42388j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c13354a.m14944d();
                    if (c13354a.m14942b()) {
                        c13354a.f42381c = 1;
                        c13354a.m14945e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m492e() {
        synchronized (((C13603l) this.f630Z).f42977Z) {
            try {
                InterfaceC13593b interfaceC13593b = (InterfaceC13593b) ((C13603l) this.f630Z).f42979p0;
                if (interfaceC13593b != null) {
                    interfaceC13593b.mo3916e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C18240g m493a() {
        C2309g c2309g = (C2309g) this.f630Z;
        C18240g c18240g = new C18240g();
        Cursor cursorM12350m = c2309g.f7163a.m12350m(new C3614a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (cursorM12350m.moveToNext()) {
            try {
                c18240g.add(Integer.valueOf(cursorM12350m.getInt(0)));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC7942M5.m8232a(cursorM12350m, th2);
                    throw th3;
                }
            }
        }
        AbstractC7942M5.m8232a(cursorM12350m, null);
        C18240g c18240gM19262b = AbstractC17665J.m19262b(c18240g);
        if (!c18240gM19262b.f58127Y.isEmpty()) {
            if (((C2309g) this.f630Z).f7169g == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C4262h c4262h = ((C2309g) this.f630Z).f7169g;
            if (c4262h == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c4262h.m5034e();
        }
        return c18240gM19262b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r1 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        p523V9.AbstractC8072d6.m8488e("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m494f() {
        boolean z6 = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                synchronized (((ExecutorC4836i) this.f630Z).f15738Y) {
                    if (!z6) {
                        ExecutorC4836i executorC4836i = (ExecutorC4836i) this.f630Z;
                        if (executorC4836i.f15741p0 != 4) {
                            executorC4836i.f15742q0++;
                            executorC4836i.f15741p0 = 4;
                            z6 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((ExecutorC4836i) this.f630Z).f15738Y.poll();
                    if (runnable == null) {
                        ((ExecutorC4836i) this.f630Z).f15741p0 = 1;
                    }
                }
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set setM493a;
        switch (this.f629Y) {
            case 0:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f630Z;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.f32821y1;
                if (motionEvent != null) {
                    i = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (i != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i10 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    AndroidComposeView androidComposeView2 = (AndroidComposeView) this.f630Z;
                    androidComposeView2.m11336H(motionEvent, i10, androidComposeView2.f32823z1, false);
                    return;
                }
                return;
            case 1:
                C1876A c1876a = (C1876A) this.f630Z;
                int i11 = c1876a.f5423A;
                ValueAnimator valueAnimator = c1876a.f5450z;
                if (i11 == 1) {
                    valueAnimator.cancel();
                } else if (i11 != 2) {
                    return;
                }
                c1876a.f5423A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 2:
                ((StaggeredGridLayoutManager) this.f630Z).m12307A0();
                return;
            case 3:
                ViewOnTouchListenerC2246e viewOnTouchListenerC2246e = (ViewOnTouchListenerC2246e) this.f630Z;
                if (viewOnTouchListenerC2246e.f6873A0) {
                    boolean z6 = viewOnTouchListenerC2246e.f6888y0;
                    C2242a c2242a = viewOnTouchListenerC2246e.f6876Y;
                    if (z6) {
                        viewOnTouchListenerC2246e.f6888y0 = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c2242a.f6867e = jCurrentAnimationTimeMillis;
                        c2242a.f6869g = -1L;
                        c2242a.f6868f = jCurrentAnimationTimeMillis;
                        c2242a.f6870h = 0.5f;
                    }
                    if ((c2242a.f6869g > 0 && AnimationUtils.currentAnimationTimeMillis() > c2242a.f6869g + ((long) c2242a.f6871i)) || !viewOnTouchListenerC2246e.m3279e()) {
                        viewOnTouchListenerC2246e.f6873A0 = false;
                        return;
                    }
                    boolean z10 = viewOnTouchListenerC2246e.f6889z0;
                    ListView listView = viewOnTouchListenerC2246e.f6878o0;
                    if (z10) {
                        viewOnTouchListenerC2246e.f6889z0 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c2242a.f6868f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM3270a = c2242a.m3270a(jCurrentAnimationTimeMillis2);
                    long j10 = jCurrentAnimationTimeMillis2 - c2242a.f6868f;
                    c2242a.f6868f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC2246e.f6875C0.scrollListBy((int) (j10 * ((fM3270a * 4.0f) + ((-4.0f) * fM3270a * fM3270a)) * c2242a.f6866d));
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                ReentrantReadWriteLock.ReadLock lock = ((C2309g) this.f630Z).f7163a.f33709h.readLock();
                AbstractC16544l.m18093f(lock, "readWriteLock.readLock()");
                lock.lock();
                try {
                    try {
                        if (((C2309g) this.f630Z).m3412a() && ((C2309g) this.f630Z).f7167e.compareAndSet(true, false) && !((C2309g) this.f630Z).f7163a.m12345h().mo4328d0().m5020S()) {
                            C4256b c4256bMo4328d0 = ((C2309g) this.f630Z).f7163a.m12345h().mo4328d0();
                            c4256bMo4328d0.m5024e();
                            try {
                                setM493a = m493a();
                                c4256bMo4328d0.m5028r0();
                                c4256bMo4328d0.m5027m();
                                lock.unlock();
                                ((C2309g) this.f630Z).getClass();
                                if (setM493a.isEmpty()) {
                                    return;
                                }
                                C2309g c2309g = (C2309g) this.f630Z;
                                synchronized (c2309g.f7171i) {
                                    Iterator it = c2309g.f7171i.iterator();
                                    while (true) {
                                        C20085b c20085b = (C20085b) it;
                                        if (c20085b.hasNext()) {
                                            ((AbstractC2308f) ((Map.Entry) c20085b.next()).getValue()).m3411a(setM493a);
                                        }
                                    }
                                }
                                return;
                            } catch (Throwable th2) {
                                c4256bMo4328d0.m5027m();
                                throw th2;
                            }
                        }
                        lock.unlock();
                        ((C2309g) this.f630Z).getClass();
                        return;
                    } catch (Throwable th3) {
                        lock.unlock();
                        ((C2309g) this.f630Z).getClass();
                        throw th3;
                    }
                } catch (SQLiteException e10) {
                    AbstractC15256t.m16466d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    setM493a = C17691y.f56482Y;
                } catch (IllegalStateException e11) {
                    AbstractC15256t.m16466d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                    setM493a = C17691y.f56482Y;
                }
                break;
            case 5:
                C5311e c5311e = (C5311e) this.f630Z;
                if (((RunnableScheduledFutureC4830c) c5311e.f17486p0).f15725Y.getAndSet(null) != null) {
                    ((Handler) c5311e.f17484Z).removeCallbacks((RunnableScheduledFutureC4830c) c5311e.f17486p0);
                    return;
                }
                return;
            case 6:
                m489b();
                return;
            case 7:
                ((InterfaceFutureC13608b) this.f630Z).cancel(true);
                return;
            case 8:
                C5233o c5233o = (C5233o) this.f630Z;
                c5233o.f16985Z = null;
                c5233o.f16984Y = null;
                return;
            case 9:
                ((C5280c) this.f630Z).m5819n(0);
                return;
            case 10:
                C4213M c4213m = (C4213M) this.f630Z;
                for (C4219T c4219t : c4213m.f13705E0) {
                    c4219t.m4983p(true);
                    C7296c c7296c = c4219t.f13774h;
                    if (c7296c != null) {
                        c7296c.m7754F(c4219t.f13771e);
                        c4219t.f13774h = null;
                        c4219t.f13773g = null;
                    }
                }
                C5311e c5311e2 = c4213m.f13737x0;
                InterfaceC6333o interfaceC6333o = (InterfaceC6333o) c5311e2.f17485o0;
                if (interfaceC6333o != null) {
                    interfaceC6333o.release();
                    c5311e2.f17485o0 = null;
                }
                c5311e2.f17486p0 = null;
                return;
            case 11:
                C5311e c5311e3 = (C5311e) this.f630Z;
                long j11 = C5311e.m5843G((Context) c5311e3.f17484Z).getLong("app_set_id_last_used_time", -1L);
                long j12 = j11 != -1 ? j11 + 33696000000L : -1L;
                if (j12 == -1 || System.currentTimeMillis() <= j12) {
                    return;
                }
                Context context = (Context) c5311e3.f17484Z;
                if (!C5311e.m5843G(context).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    AbstractC15256t.m16465c("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                AbstractC15256t.m16465c("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 12:
                Worker worker = (Worker) this.f630Z;
                try {
                    worker.f33695q0.m14769k(worker.mo12336f());
                    return;
                } catch (Throwable th4) {
                    worker.f33695q0.m14770l(th4);
                    return;
                }
            case 13:
                DialogInterfaceOnCancelListenerC9628l dialogInterfaceOnCancelListenerC9628l = (DialogInterfaceOnCancelListenerC9628l) this.f630Z;
                dialogInterfaceOnCancelListenerC9628l.f29013i1.onDismiss(dialogInterfaceOnCancelListenerC9628l.f29021q1);
                return;
            case 14:
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = (AbstractComponentCallbacksC11000a) this.f630Z;
                if (abstractComponentCallbacksC11000a.f33138T0 != null) {
                    abstractComponentCallbacksC11000a.m11749l().getClass();
                    return;
                }
                return;
            case 15:
                ((AbstractC11002c) this.f630Z).m11815y(true);
                return;
            case 16:
                m490c();
                return;
            case 17:
                m491d();
                return;
            case 18:
                ((InterfaceC1426a) this.f630Z).invoke();
                return;
            case 19:
                m492e();
                return;
            case 20:
                ViewOnAttachStateChangeListenerC13712i viewOnAttachStateChangeListenerC13712i = (ViewOnAttachStateChangeListenerC13712i) this.f630Z;
                C13711h c13711h = ((C13713j) viewOnAttachStateChangeListenerC13712i.f43264o0).f43266a.f43268b;
                View view = viewOnAttachStateChangeListenerC13712i.f43265p0;
                c13711h.m15194i(view, view.getClass().getName().concat(" received View#onDetachedFromWindow() callback"));
                return;
            case 21:
                ((C6959q) this.f630Z).invoke();
                return;
            case 22:
                ((C15272c) this.f630Z).invoke();
                return;
            case 23:
                ((C15272c) this.f630Z).invoke();
                return;
            case 24:
                ((C15272c) this.f630Z).invoke();
                return;
            case 25:
                ((C15272c) this.f630Z).invoke();
                return;
            case 26:
                ((C15272c) this.f630Z).invoke();
                return;
            case 27:
                ServiceConnectionC16132A serviceConnectionC16132A = (ServiceConnectionC16132A) this.f630Z;
                C16149c c16149c = serviceConnectionC16132A.f50052b;
                c16149c.m17766p(0);
                C16155i c16155i = AbstractC16144M.f50089l;
                c16149c.m17756D(24, 6, c16155i);
                serviceConnectionC16132A.m17685a(c16155i);
                return;
            case 28:
                C3029c c3029c = (C3029c) this.f630Z;
                c3029c.f9118c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c3029c.f9120e;
                C5280c c5280c = bottomSheetBehavior.f36424N;
                if (c5280c != null && c5280c.m5811f()) {
                    c3029c.m3905f(c3029c.f9117b);
                    return;
                } else {
                    if (bottomSheetBehavior.f36423M == 2) {
                        bottomSheetBehavior.m13587B(c3029c.f9117b);
                        return;
                    }
                    return;
                }
            default:
                C17625g c17625g = (C17625g) this.f630Z;
                C17626h c17626h = c17625g.f56409u0;
                if (c17626h == null) {
                    return;
                }
                MediaRecorder mediaRecorder = c17626h.f56411Z;
                int maxAmplitude = mediaRecorder.getMaxAmplitude();
                int iMax = Math.max(c17626h.f56413p0, maxAmplitude);
                File file = c17626h.f56410Y;
                C5551u startTime = c17626h.f56412o0;
                AbstractC16544l.m18094g(startTime, "startTime");
                c17625g.f56409u0 = new C17626h(file, mediaRecorder, startTime, iMax);
                AbstractC0575H.m1156D(c17625g.f56404p0, null, null, new C17623e(c17625g, c17626h, maxAmplitude, null), 3);
                c17625g.f56407s0.postDelayed(this, 300L);
                return;
        }
    }

    public /* synthetic */ RunnableC0153B(Object obj, int i10) {
        this.f629Y = i10;
        this.f630Z = obj;
    }
}
