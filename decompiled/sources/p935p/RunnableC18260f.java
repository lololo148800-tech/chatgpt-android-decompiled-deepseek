package p935p;

import android.javax.sip.C10808o;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.sentry.C15411n0;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p035B7.C0846c;
import p1009s9.C19499b;
import p1022t9.InterfaceC19818c;
import p1036u9.BinderC20179y;
import p1036u9.C20171q;
import p178H.AbstractC3137c;
import p523V9.AbstractC7889G0;
import p588Y2.C9642z;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p746fa.C13599h;
import p784hb.C14437f;
import p950po.AbstractC18527a;
import p950po.C18529c;
import p950po.C18530d;
import p999s.C19356i;
import p999s.C19369o0;
import vc.C20520d;
import vc.EnumC20518b;

/* JADX INFO: renamed from: p.f */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC18260f implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58207Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f58208Z;

    public /* synthetic */ RunnableC18260f(Object obj, int i10) {
        this.f58207Y = i10;
        this.f58208Z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC18527a abstractC18527aM19895c;
        long jNanoTime;
        C19356i c19356i;
        switch (this.f58207Y) {
            case 0:
                C18259e c18259e = (C18259e) this.f58208Z;
                c18259e.m19781a(true);
                c18259e.invalidateSelf();
                return;
            case 1:
                ((BottomSheetBehavior) this.f58208Z).m13586A(3);
                return;
            case 2:
                break;
            case 3:
                if (((C13599h) this.f58208Z).m15115c(new IOException("TIMEOUT"))) {
                    AbstractC15256t.m16482t("Rpc", "No response");
                    return;
                }
                return;
            case 4:
                C19369o0 c19369o0 = (C19369o0) this.f58208Z;
                c19369o0.f61347z0 = null;
                c19369o0.drawableStateChanged();
                return;
            case 5:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f58208Z;
                if (searchView$SearchAutoComplete.f32258t0) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f32258t0 = false;
                    return;
                }
                return;
            case 6:
                ActionMenuView actionMenuView = ((Toolbar) this.f58208Z).f32292o0;
                if (actionMenuView == null || (c19356i = actionMenuView.f32238H0) == null) {
                    return;
                }
                c19356i.m20461l();
                return;
            case 7:
                ((C20171q) this.f58208Z).m20997f();
                return;
            case 8:
                InterfaceC19818c interfaceC19818c = ((C20171q) ((C9642z) this.f58208Z).f29064Z).f63885b;
                interfaceC19818c.mo13199c(interfaceC19818c.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 9:
                ((BinderC20179y) this.f58208Z).f63919h.m222p(new C19499b(4));
                return;
            case 10:
                C20520d c20520d = (C20520d) this.f58208Z;
                c20520d.m21185a();
                for (String host : c20520d.f65143g) {
                    AtomicLong atomicLong = c20520d.f65138b;
                    EnumC20518b enumC20518b = EnumC20518b.f65132Y;
                    AtomicReference atomicReference = c20520d.f65137a;
                    EnumC20518b enumC20518b2 = EnumC20518b.f65133Z;
                    if (((EnumC20518b) atomicReference.getAndSet(enumC20518b2)) != enumC20518b2) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        C10808o c10808o = c20520d.f65142f;
                        if (c10808o != null) {
                            AbstractC16544l.m18094g(host, "host");
                        }
                        try {
                            C15411n0 c15411n0M10552F = c20520d.f65140d.m10552F(host, Long.valueOf(c20520d.f65144h));
                            long j10 = c15411n0M10552F.f48031a;
                            long j11 = c15411n0M10552F.f48033c;
                            long j12 = j10 + j11;
                            try {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                long j13 = c15411n0M10552F.f48032b;
                                if ((jElapsedRealtime2 - j13) + j12 < 0) {
                                    throw new C0644w("Invalid time " + ((SystemClock.elapsedRealtime() - j13) + j10 + j11) + " received from " + host, 22);
                                }
                                long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                long j14 = c20520d.f65147k;
                                if (jElapsedRealtime3 <= j14) {
                                    c20520d.f65141e.m21935y(c15411n0M10552F);
                                    atomicReference.set(enumC20518b);
                                    atomicLong.set(SystemClock.elapsedRealtime());
                                    return;
                                }
                                throw new C0644w("Ignoring response from " + host + " because the network latency (" + jElapsedRealtime3 + " ms) is longer than the required value (" + j14 + " ms", 22);
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                if (c10808o != 0) {
                                    try {
                                        AbstractC16544l.m18094g(host, "host");
                                        AbstractC7889G0.m8184b((InterfaceC11256c) c10808o.f32040Z, 5, EnumC11255b.f34099Z, new C0846c(host, 0), th3, false, 48);
                                    } catch (Throwable th4) {
                                        atomicReference.set(enumC20518b);
                                        atomicLong.set(SystemClock.elapsedRealtime());
                                        throw th4;
                                    }
                                }
                                atomicReference.set(enumC20518b);
                                atomicLong.set(SystemClock.elapsedRealtime());
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        break;
                    }
                }
                return;
            default:
                View view = (View) this.f58208Z;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
                return;
        }
        while (true) {
            C18530d c18530d = (C18530d) this.f58208Z;
            synchronized (c18530d) {
                abstractC18527aM19895c = c18530d.m19895c();
            }
            if (abstractC18527aM19895c == null) {
                return;
            }
            C18529c c18529c = abstractC18527aM19895c.f59029c;
            AbstractC16544l.m18091d(c18529c);
            C18530d c18530d2 = (C18530d) this.f58208Z;
            boolean zIsLoggable = C18530d.f59040i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                C14437f c14437f = c18529c.f59033a.f59041a;
                jNanoTime = System.nanoTime();
                AbstractC3137c.m3978a(abstractC18527aM19895c, c18529c, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                C18530d.m19893a(c18530d2, abstractC18527aM19895c);
                if (zIsLoggable) {
                    C14437f c14437f2 = c18529c.f59033a.f59041a;
                    AbstractC3137c.m3978a(abstractC18527aM19895c, c18529c, "finished run in ".concat(AbstractC3137c.m3980c(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th6) {
                try {
                    ((ThreadPoolExecutor) c18530d2.f59041a.f45413Y).execute(this);
                    throw th6;
                } catch (Throwable th7) {
                    if (zIsLoggable) {
                        C14437f c14437f3 = c18529c.f59033a.f59041a;
                        AbstractC3137c.m3978a(abstractC18527aM19895c, c18529c, "failed a run in ".concat(AbstractC3137c.m3980c(System.nanoTime() - jNanoTime)));
                    }
                    throw th7;
                }
            }
        }
    }
}
