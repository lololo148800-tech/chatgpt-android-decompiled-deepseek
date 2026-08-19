package p003A1;

import android.hardware.Sensor;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.openai.chatgpt.R;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC15234f;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0564B0;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0738T;
import p030B2.C0744Z;
import p056C2.AccessibilityManagerTouchExplorationStateChangeListenerC1508b;
import p1091wn.AbstractC21031l;
import p239Ja.C4307j;
import p239Ja.C4313p;
import p521V6.C7805H;
import p976r.ViewOnKeyListenerC18801C;
import p976r.ViewOnKeyListenerC18808f;
import sj.C19661b;

/* JADX INFO: renamed from: A1.H */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0171H implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f670Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f671Z;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0171H(Object obj, int i10) {
        this.f670Y = i10;
        this.f671Z = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v2) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f671Z;
        switch (this.f670Y) {
            case 0:
                C0203S c0203s = (C0203S) obj;
                AccessibilityManager accessibilityManager2 = c0203s.f768g;
                accessibilityManager2.addAccessibilityStateChangeListener(c0203s.f770i);
                accessibilityManager2.addTouchExplorationStateChangeListener(c0203s.f771j);
                break;
            case 3:
                C4313p c4313p = (C4313p) obj;
                if (c4313p.f14028I0 != null && (accessibilityManager = c4313p.f14027H0) != null) {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    if (c4313p.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1508b(c4313p.f14028I0));
                    }
                    break;
                }
                break;
            case 4:
                View view = (View) obj;
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                AbstractC0728I.m1543c(view);
                break;
            case 5:
                v2.getViewTreeObserver().addOnDrawListener((ViewTreeObserverOnDrawListenerC15234f) obj);
                v2.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                AbstractC16544l.m18094g(v2, "v");
                C19661b c19661b = (C19661b) ((C7805H) obj).f24691o0;
                if (!c19661b.f62318e) {
                    c19661b.f62318e = true;
                    Sensor sensor = c19661b.f62315b;
                    if (sensor != null) {
                        c19661b.f62314a.registerListener(c19661b.f62319f, sensor, 100000);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v2) {
        boolean z6;
        AccessibilityManager accessibilityManager;
        switch (this.f670Y) {
            case 0:
                C0203S c0203s = (C0203S) this.f671Z;
                c0203s.f773l.removeCallbacks(c0203s.f762K);
                AccessibilityManager accessibilityManager2 = c0203s.f768g;
                accessibilityManager2.removeAccessibilityStateChangeListener(c0203s.f770i);
                accessibilityManager2.removeTouchExplorationStateChangeListener(c0203s.f771j);
                break;
            case 1:
                AbstractC0231b abstractC0231b = (AbstractC0231b) this.f671Z;
                AbstractC16544l.m18094g(abstractC0231b, "<this>");
                Iterator it = AbstractC21031l.m21492p(C0744Z.f2112Y, abstractC0231b.getParent()).iterator();
                while (true) {
                    z6 = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view = (View) obj;
                            AbstractC16544l.m18094g(view, "<this>");
                            Object tag = view.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z6 = true;
                            }
                        }
                    }
                }
                if (!z6) {
                    abstractC0231b.m734e();
                }
                break;
            case 2:
                v2.removeOnAttachStateChangeListener(this);
                ((C0564B0) this.f671Z).mo1275e(null);
                break;
            case 3:
                C4313p c4313p = (C4313p) this.f671Z;
                C4307j c4307j = c4313p.f14028I0;
                if (c4307j != null && (accessibilityManager = c4313p.f14027H0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1508b(c4307j));
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                v2.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                AbstractC16544l.m18094g(v2, "v");
                C19661b c19661b = (C19661b) ((C7805H) this.f671Z).f24691o0;
                c19661b.f62314a.unregisterListener(c19661b.f62319f);
                break;
            case 7:
                ViewOnKeyListenerC18808f viewOnKeyListenerC18808f = (ViewOnKeyListenerC18808f) this.f671Z;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC18808f.f59814J0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC18808f.f59814J0 = v2.getViewTreeObserver();
                    }
                    viewOnKeyListenerC18808f.f59814J0.removeGlobalOnLayoutListener(viewOnKeyListenerC18808f.f59824u0);
                }
                v2.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC18801C viewOnKeyListenerC18801C = (ViewOnKeyListenerC18801C) this.f671Z;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC18801C.f59761A0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC18801C.f59761A0 = v2.getViewTreeObserver();
                    }
                    viewOnKeyListenerC18801C.f59761A0.removeGlobalOnLayoutListener(viewOnKeyListenerC18801C.f59774u0);
                }
                v2.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m550a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m551b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m552c(View view) {
    }

    /* JADX INFO: renamed from: d */
    private final void m553d(View view) {
    }

    /* JADX INFO: renamed from: e */
    private final void m554e(View view) {
    }
}
