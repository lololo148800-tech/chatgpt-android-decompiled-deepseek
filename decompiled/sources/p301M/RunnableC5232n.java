package p301M;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import p283L5.AbstractC4941g;
import p519V4.C7762j;
import p610Z1.C10142i;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: M.n */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5232n implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16980Y;

    /* JADX INFO: renamed from: Z */
    public final int f16981Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f16982o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f16983p0;

    public /* synthetic */ RunnableC5232n(Object obj, int i10, Object obj2, int i11) {
        this.f16980Y = i11;
        this.f16983p0 = obj;
        this.f16981Z = i10;
        this.f16982o0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        C10142i c10142i;
        ArrayList arrayList2;
        switch (this.f16980Y) {
            case 0:
                int i10 = this.f16981Z;
                InterfaceFutureC13608b interfaceFutureC13608b = (InterfaceFutureC13608b) this.f16982o0;
                C5233o c5233o = (C5233o) this.f16983p0;
                AtomicInteger atomicInteger = c5233o.f16987p0;
                ArrayList arrayList3 = c5233o.f16985Z;
                boolean zIsDone = c5233o.isDone();
                boolean z6 = c5233o.f16986o0;
                if (zIsDone || arrayList3 == null) {
                    AbstractC4941g.m5559R("Future was done before all dependencies completed", z6);
                    return;
                }
                try {
                    AbstractC4941g.m5559R("Tried to set value from future which is not done", interfaceFutureC13608b.isDone());
                    arrayList3.set(i10, AbstractC5229k.m5778b(interfaceFutureC13608b));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    AbstractC4941g.m5559R("Less than 0 remaining futures", iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        if (arrayList != null) {
                            c10142i = c5233o.f16989r0;
                            arrayList2 = new ArrayList(arrayList);
                            c10142i.m10747a(arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (ExecutionException e10) {
                    if (z6) {
                        c5233o.f16989r0.m10748b(e10.getCause());
                    }
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    AbstractC4941g.m5559R("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                    if (iDecrementAndGet2 == 0) {
                        if (arrayList != null) {
                            c10142i = c5233o.f16989r0;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (RuntimeException e11) {
                    if (z6) {
                        c5233o.f16989r0.m10748b(e11);
                    }
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    AbstractC4941g.m5559R("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                    if (iDecrementAndGet3 == 0) {
                        if (arrayList != null) {
                            c10142i = c5233o.f16989r0;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (Error e12) {
                    c5233o.f16989r0.m10748b(e12);
                    int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                    AbstractC4941g.m5559R("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                    if (iDecrementAndGet4 == 0) {
                        if (arrayList != null) {
                            c10142i = c5233o.f16989r0;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (CancellationException unused) {
                    if (z6) {
                        c5233o.cancel(false);
                    }
                    int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                    AbstractC4941g.m5559R("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                    if (iDecrementAndGet5 == 0) {
                        if (arrayList != null) {
                            c10142i = c5233o.f16989r0;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } finally {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    AbstractC4941g.m5559R("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        arrayList = c5233o.f16985Z;
                        if (arrayList != null) {
                            c5233o.f16989r0.m10747a(new ArrayList(arrayList));
                        } else {
                            AbstractC4941g.m5559R(null, c5233o.isDone());
                        }
                    }
                }
            case 1:
                ((C7762j) this.f16982o0).m8029a(this.f16981Z, (Intent) this.f16983p0);
                return;
            case 2:
                ((SystemForegroundService) this.f16983p0).f33735q0.notify(this.f16981Z, (Notification) this.f16982o0);
                return;
            case 3:
                ((BottomSheetBehavior) this.f16983p0).m13589D((View) this.f16982o0, this.f16981Z, false);
                return;
            default:
                ((TextView) this.f16982o0).setTypeface((Typeface) this.f16983p0, this.f16981Z);
                return;
        }
    }

    public /* synthetic */ RunnableC5232n(Object obj, Object obj2, int i10, int i11) {
        this.f16980Y = i11;
        this.f16982o0 = obj;
        this.f16983p0 = obj2;
        this.f16981Z = i10;
    }

    public RunnableC5232n(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.f16980Y = 3;
        this.f16983p0 = bottomSheetBehavior;
        this.f16982o0 = view;
        this.f16981Z = i10;
    }
}
