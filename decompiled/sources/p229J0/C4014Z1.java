package p229J0;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p758g0.C13756d;

/* JADX INFO: renamed from: J0.Z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4014Z1 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0571F f12579a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13756d f12580b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1426a f12581c;

    public C4014Z1(InterfaceC1426a interfaceC1426a, C13756d c13756d, InterfaceC0571F interfaceC0571F) {
        this.f12579a = interfaceC0571F;
        this.f12580b = c13756d;
        this.f12581c = interfaceC1426a;
    }

    public final void onBackCancelled() {
        AbstractC0575H.m1156D(this.f12579a, null, null, new C3999W1(this.f12580b, null), 3);
    }

    public final void onBackInvoked() {
        this.f12581c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC0575H.m1156D(this.f12579a, null, null, new C4004X1(this.f12580b, backEvent, null), 3);
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC0575H.m1156D(this.f12579a, null, null, new C4009Y1(this.f12580b, backEvent, null), 3);
    }
}
