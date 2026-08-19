package p766g8;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p658b5.C11234e;
import p661b7.InterfaceC11256c;
import p765g7.InterfaceC13823a;
import p867l8.C16829a;
import p867l8.C16830b;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: g8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13824a {

    /* JADX INFO: renamed from: a */
    public final C16829a[] f43839a;

    /* JADX INFO: renamed from: b */
    public final C16830b f43840b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11256c f43841c;

    public C13824a(C16829a[] c16829aArr, C16830b c16830b, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f43839a = c16829aArr;
        this.f43840b = c16830b;
        this.f43841c = internalLogger;
    }

    /* JADX INFO: renamed from: a */
    public final void m15468a(Window window, Context context, InterfaceC13823a sdkCore) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(sdkCore, "sdkCore");
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new WindowCallbackC13827d();
        }
        WeakReference weakReference = new WeakReference(window);
        WeakReference weakReference2 = new WeakReference(context);
        C16829a[] c16829aArr = this.f43839a;
        C16830b c16830b = this.f43840b;
        window.setCallback(new WindowCallbackC13829f(window, sdkCore, callback, new C11234e(context, new GestureDetectorOnGestureListenerC13826c(sdkCore, weakReference, c16829aArr, c16830b, weakReference2, this.f43841c)), c16830b, c16829aArr, this.f43841c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13824a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker");
        C13824a c13824a = (C13824a) obj;
        return Arrays.equals(this.f43839a, c13824a.f43839a) && this.f43840b.getClass().equals(c13824a.f43840b.getClass());
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f43839a) + 544;
        return this.f43840b.getClass().hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return AbstractC10763a.m11054l("DatadogGesturesTracker(", AbstractC17678l.m19283F(this.f43839a, null, null, null, null, 63), Separators.RPAREN);
    }
}
