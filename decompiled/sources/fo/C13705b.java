package fo;

import android.app.Application;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: fo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C13705b implements InterfaceC13708e {

    /* JADX INFO: renamed from: a */
    public final C13704a f43250a;

    /* JADX INFO: renamed from: b */
    public final Application f43251b;

    /* JADX INFO: renamed from: c */
    public final C13711h f43252c;

    public C13705b(Application application, C13711h reachabilityWatcher) {
        AbstractC16544l.m18095h(reachabilityWatcher, "reachabilityWatcher");
        this.f43251b = application;
        this.f43252c = reachabilityWatcher;
        this.f43250a = new C13704a(this);
    }

    @Override // fo.InterfaceC13708e
    /* JADX INFO: renamed from: a */
    public final void mo15175a() {
        this.f43251b.registerActivityLifecycleCallbacks(this.f43250a);
    }
}
