package p772h;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: h.B */
/* JADX INFO: loaded from: classes.dex */
public final class C14211B implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1436k f44630a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1436k f44631b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1426a f44632c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1426a f44633d;

    public C14211B(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2) {
        this.f44630a = interfaceC1436k;
        this.f44631b = interfaceC1436k2;
        this.f44632c = interfaceC1426a;
        this.f44633d = interfaceC1426a2;
    }

    public final void onBackCancelled() {
        this.f44633d.invoke();
    }

    public final void onBackInvoked() {
        this.f44632c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC16544l.m18094g(backEvent, "backEvent");
        this.f44631b.invoke(new C14220b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC16544l.m18094g(backEvent, "backEvent");
        this.f44630a.invoke(new C14220b(backEvent));
    }
}
