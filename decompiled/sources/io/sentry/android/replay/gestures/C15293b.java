package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.android.replay.C15309v;
import io.sentry.android.replay.InterfaceC15290f;
import io.sentry.android.replay.ReplayIntegration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8710s3;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: io.sentry.android.replay.gestures.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15293b implements InterfaceC15290f {

    /* JADX INFO: renamed from: Y */
    public final C15524y1 f47768Y;

    /* JADX INFO: renamed from: Z */
    public final ReplayIntegration f47769Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f47770o0 = new ArrayList();

    /* JADX INFO: renamed from: p0 */
    public final Object f47771p0 = new Object();

    public C15293b(C15524y1 c15524y1, ReplayIntegration replayIntegration) {
        this.f47768Y = c15524y1;
        this.f47769Z = replayIntegration;
    }

    @Override // io.sentry.android.replay.InterfaceC15290f
    /* JADX INFO: renamed from: a */
    public final void mo16513a(View root, boolean z6) {
        AbstractC16544l.m18094g(root, "root");
        synchronized (this.f47771p0) {
            try {
                if (z6) {
                    this.f47770o0.add(new WeakReference(root));
                    Window windowM9416b = AbstractC8710s3.m9416b(root);
                    C15524y1 c15524y1 = this.f47768Y;
                    if (windowM9416b == null) {
                        c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
                    } else {
                        Window.Callback callback = windowM9416b.getCallback();
                        if (!(callback instanceof WindowCallbackC15292a)) {
                            windowM9416b.setCallback(new WindowCallbackC15292a(c15524y1, this.f47769Z, callback));
                        }
                    }
                } else {
                    m16515b(root);
                    AbstractC17686t.m19393A(this.f47770o0, new C15309v(root, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16515b(View view) {
        Window windowM9416b = AbstractC8710s3.m9416b(view);
        if (windowM9416b == null) {
            this.f47768Y.getLogger().mo16298o(EnumC15375i1.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowM9416b.getCallback();
        if (callback instanceof WindowCallbackC15292a) {
            windowM9416b.setCallback(((WindowCallbackC15292a) callback).f47765Y);
        }
    }
}
