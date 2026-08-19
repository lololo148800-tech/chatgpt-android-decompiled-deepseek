package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.C15109B;
import io.sentry.C15161S1;
import io.sentry.C15164T1;
import io.sentry.C15345d;
import io.sentry.C15516w;
import io.sentry.EnumC15147N1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15159S;
import io.sentry.android.core.C15254r;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.C15387c;
import io.sentry.internal.gestures.EnumC15386b;
import io.sentry.protocol.EnumC15423C;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import p239Ja.C4307j;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8686o3;
import p561X.C8990d;
import p582Xk.HXHG.TfazcFv;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.f */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnGestureListenerC15224f implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a */
    public final WeakReference f47491a;

    /* JADX INFO: renamed from: b */
    public final C15109B f47492b;

    /* JADX INFO: renamed from: c */
    public final SentryAndroidOptions f47493c;

    /* JADX INFO: renamed from: d */
    public C15387c f47494d = null;

    /* JADX INFO: renamed from: e */
    public InterfaceC15159S f47495e = null;

    /* JADX INFO: renamed from: f */
    public EnumC15222d f47496f;

    /* JADX INFO: renamed from: g */
    public final C15223e f47497g;

    public GestureDetectorOnGestureListenerC15224f(Activity activity, C15109B c15109b, SentryAndroidOptions sentryAndroidOptions) {
        EnumC15222d enumC15222d = EnumC15222d.Unknown;
        this.f47496f = enumC15222d;
        C15223e c15223e = new C15223e();
        c15223e.f47487a = enumC15222d;
        c15223e.f47489c = 0.0f;
        c15223e.f47490d = 0.0f;
        this.f47497g = c15223e;
        this.f47491a = new WeakReference(activity);
        this.f47492b = c15109b;
        this.f47493c = sentryAndroidOptions;
    }

    /* JADX INFO: renamed from: c */
    public static String m16427c(EnumC15222d enumC15222d) {
        int i10 = AbstractC15221c.f47486a[enumC15222d.ordinal()];
        if (i10 == 1) {
            return "click";
        }
        if (i10 != 2) {
            return i10 != 3 ? "unknown" : "swipe";
        }
        return "scroll";
    }

    /* JADX INFO: renamed from: b */
    public final View m16429b(String str) {
        Activity activity = (Activity) this.f47491a.get();
        SentryAndroidOptions sentryAndroidOptions = this.f47493c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, AbstractC10763a.m11054l("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, AbstractC10763a.m11054l("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, AbstractC10763a.m11054l("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m16431e(EnumC15147N1 enumC15147N1) {
        InterfaceC15159S interfaceC15159S = this.f47495e;
        if (interfaceC15159S != null) {
            if (interfaceC15159S.mo16270a() == null) {
                this.f47495e.mo16278i(enumC15147N1);
            } else {
                this.f47495e.mo16271b();
            }
        }
        this.f47492b.mo16253v(new C4307j(this, 24));
        this.f47495e = null;
        if (this.f47494d != null) {
            this.f47494d = null;
        }
        this.f47496f = EnumC15222d.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        C15223e c15223e = this.f47497g;
        c15223e.f47488b = null;
        c15223e.f47487a = EnumC15222d.Unknown;
        c15223e.f47489c = 0.0f;
        c15223e.f47490d = 0.0f;
        c15223e.f47489c = motionEvent.getX();
        c15223e.f47490d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f47497g.f47487a = EnumC15222d.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View viewM16429b = m16429b("onScroll");
        if (viewM16429b != null && motionEvent != null) {
            C15223e c15223e = this.f47497g;
            if (c15223e.f47487a == EnumC15222d.Unknown) {
                float x4 = motionEvent.getX();
                float y8 = motionEvent.getY();
                EnumC15386b enumC15386b = EnumC15386b.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.f47493c;
                C15387c c15387cM9383b = AbstractC8686o3.m9383b(sentryAndroidOptions, viewM16429b, x4, y8, enumC15386b);
                if (c15387cM9383b == null) {
                    sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    return false;
                }
                InterfaceC15127H logger = sentryAndroidOptions.getLogger();
                EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
                String str = c15387cM9383b.f47971c;
                if (str == null) {
                    String str2 = c15387cM9383b.f47972d;
                    AbstractC8483G3.m9133c(str2, "UiElement.tag can't be null");
                    str = str2;
                }
                logger.mo16298o(enumC15375i1, "Scroll target found: ".concat(str), new Object[0]);
                c15223e.f47488b = c15387cM9383b;
                c15223e.f47487a = EnumC15222d.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewM16429b = m16429b("onSingleTapUp");
        if (viewM16429b != null && motionEvent != null) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            EnumC15386b enumC15386b = EnumC15386b.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.f47493c;
            C15387c c15387cM9383b = AbstractC8686o3.m9383b(sentryAndroidOptions, viewM16429b, x4, y8, enumC15386b);
            if (c15387cM9383b == null) {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            EnumC15222d enumC15222d = EnumC15222d.Click;
            m16428a(c15387cM9383b, enumC15222d, Collections.emptyMap(), motionEvent);
            m16430d(c15387cM9383b, enumC15222d);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m16428a(C15387c c15387c, EnumC15222d enumC15222d, Map map, MotionEvent motionEvent) {
        if (this.f47493c.isEnableUserInteractionBreadcrumbs()) {
            String strM16427c = m16427c(enumC15222d);
            C15516w c15516w = new C15516w();
            c15516w.m16729c("android:motionEvent", motionEvent);
            c15516w.m16729c("android:view", c15387c.f47969a.get());
            C15345d c15345d = new C15345d();
            c15345d.f47907p0 = "user";
            c15345d.f47909r0 = sVDIzpC.OhnpbDtpe.concat(strM16427c);
            String str = c15387c.f47971c;
            if (str != null) {
                c15345d.m16574b(str, "view.id");
            }
            String str2 = c15387c.f47970b;
            if (str2 != null) {
                c15345d.m16574b(str2, "view.class");
            }
            String str3 = c15387c.f47972d;
            if (str3 != null) {
                c15345d.m16574b(str3, "view.tag");
            }
            for (Map.Entry entry : map.entrySet()) {
                c15345d.f47908q0.put((String) entry.getKey(), entry.getValue());
            }
            c15345d.f47911t0 = EnumC15375i1.INFO;
            this.f47492b.mo16252u(c15345d, c15516w);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16430d(C15387c c15387c, EnumC15222d enumC15222d) {
        boolean z6 = enumC15222d == EnumC15222d.Click || !(enumC15222d == this.f47496f && c15387c.equals(this.f47494d));
        SentryAndroidOptions sentryAndroidOptions = this.f47493c;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        C15109B c15109b = this.f47492b;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z6) {
                c15109b.mo16253v(new C8990d(22));
                this.f47494d = c15387c;
                this.f47496f = enumC15222d;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f47491a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str = c15387c.f47971c;
        if (str == null) {
            String str2 = c15387c.f47972d;
            AbstractC8483G3.m9133c(str2, "UiElement.tag can't be null");
            str = str2;
        }
        InterfaceC15159S interfaceC15159S = this.f47495e;
        if (interfaceC15159S != null) {
            if (!z6 && !interfaceC15159S.mo16274e()) {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, AbstractC10763a.m11054l("The view with id: ", str, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.f47495e.mo16286q();
                    return;
                }
                return;
            }
            m16431e(EnumC15147N1.OK);
        }
        String str3 = activity.getClass().getSimpleName() + TfazcFv.XqfQpxJMZuJu + str;
        String strConcat = "ui.action.".concat(m16427c(enumC15222d));
        C15164T1 c15164t1 = new C15164T1();
        c15164t1.f47221q0 = true;
        c15164t1.f47223s0 = 30000L;
        c15164t1.f47222r0 = sentryAndroidOptions.getIdleTimeout();
        c15164t1.f1278Z = true;
        InterfaceC15159S interfaceC15159SMo16251t = c15109b.mo16251t(new C15161S1(str3, EnumC15423C.COMPONENT, strConcat, null), c15164t1);
        interfaceC15159SMo16251t.mo16288s().f47152u0 = "auto.ui.gesture_listener." + c15387c.f47973e;
        c15109b.mo16253v(new C15254r(this, 2, interfaceC15159SMo16251t));
        this.f47495e = interfaceC15159SMo16251t;
        this.f47494d = c15387c;
        this.f47496f = enumC15222d;
    }
}
