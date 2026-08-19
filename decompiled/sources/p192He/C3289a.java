package p192He;

import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p092Dc.C2001r;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.AbstractC17665J;
import p909nm.C17691y;

/* JADX INFO: renamed from: He.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3289a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C3294f f10027Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2001r f10028Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC11105n f10029o0;

    public C3289a(C3294f c3294f, C2001r c2001r, AbstractC11105n abstractC11105n) {
        this.f10027Y = c3294f;
        this.f10028Z = c2001r;
        this.f10029o0 = abstractC11105n;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC11112u owner) {
        AbstractC16544l.m18094g(owner, "owner");
        C3294f c3294f = this.f10027Y;
        ConcurrentHashMap concurrentHashMap = c3294f.f10049d;
        C2001r c2001r = this.f10028Z;
        Set set = (Set) concurrentHashMap.get(c2001r);
        if (set == null) {
            set = C17691y.f56482Y;
        }
        concurrentHashMap.put(c2001r, AbstractC17665J.m19263c(set, this.f10029o0));
        long j10 = C3294f.f10045f;
        C0564B0 c0564b0 = c3294f.f10050e;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        c3294f.f10050e = AbstractC0575H.m1156D(c3294f.f10047b, null, null, new C3293e(j10, c3294f, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12156d(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12157e(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12158f(this, interfaceC11112u);
    }
}
