package p1075w5;

import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11111t;

/* JADX INFO: renamed from: w5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C20829g extends AbstractC11105n {

    /* JADX INFO: renamed from: b */
    public static final C20829g f66183b = new C20829g();

    /* JADX INFO: renamed from: c */
    public static final C20828f f66184c = new C20828f();

    @Override // androidx.lifecycle.AbstractC11105n
    /* JADX INFO: renamed from: a */
    public final void mo7806a(InterfaceC11111t interfaceC11111t) {
        if (!(interfaceC11111t instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((interfaceC11111t + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) interfaceC11111t;
        C20828f c20828f = f66184c;
        defaultLifecycleObserver.onCreate(c20828f);
        defaultLifecycleObserver.onStart(c20828f);
        defaultLifecycleObserver.onResume(c20828f);
    }

    @Override // androidx.lifecycle.AbstractC11105n
    /* JADX INFO: renamed from: b */
    public final EnumC11104m mo7807b() {
        return EnumC11104m.f33478q0;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.AbstractC11105n
    /* JADX INFO: renamed from: c */
    public final void mo7808c(InterfaceC11111t interfaceC11111t) {
    }
}
