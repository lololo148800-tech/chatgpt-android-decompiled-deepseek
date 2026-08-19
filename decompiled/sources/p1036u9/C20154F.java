package p1036u9;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import io.sentry.android.core.RunnableC15195M;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p377P9.HandlerC6378d;
import p692d0.C12966e;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: u9.F */
/* JADX INFO: loaded from: classes.dex */
public final class C20154F extends AbstractComponentCallbacksC11000a implements InterfaceC20162h {

    /* JADX INFO: renamed from: k1 */
    public static final WeakHashMap f63839k1 = new WeakHashMap();

    /* JADX INFO: renamed from: h1 */
    public final Map f63840h1 = DesugarCollections.synchronizedMap(new C12966e(0));

    /* JADX INFO: renamed from: i1 */
    public int f63841i1 = 0;

    /* JADX INFO: renamed from: j1 */
    public Bundle f63842j1;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: B */
    public final void mo5182B() {
        this.f33133O0 = true;
        this.f63841i1 = 5;
        Iterator it = this.f63840h1.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: F */
    public final void mo5183F() {
        this.f33133O0 = true;
        this.f63841i1 = 3;
        Iterator it = this.f63840h1.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo13191d();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: G */
    public final void mo10178G(Bundle bundle) {
        for (Map.Entry entry : this.f63840h1.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo13192e(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: H */
    public final void mo10179H() {
        this.f33133O0 = true;
        this.f63841i1 = 2;
        Iterator it = this.f63840h1.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo13193f();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: I */
    public final void mo10180I() {
        this.f33133O0 = true;
        this.f63841i1 = 4;
        Iterator it = this.f63840h1.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo13194g();
        }
    }

    @Override // p1036u9.InterfaceC20162h
    /* JADX INFO: renamed from: d */
    public final LifecycleCallback mo20971d() {
        return (LifecycleCallback) DialogInterfaceOnCancelListenerC20169o.class.cast(this.f63840h1.get("ConnectionlessLifecycleHelper"));
    }

    @Override // p1036u9.InterfaceC20162h
    /* JADX INFO: renamed from: g */
    public final void mo20973g(DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o) {
        Map map = this.f63840h1;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        map.put("ConnectionlessLifecycleHelper", dialogInterfaceOnCancelListenerC20169o);
        if (this.f63841i1 > 0) {
            new HandlerC6378d(Looper.getMainLooper(), 2).post(new RunnableC15195M(this, 20, dialogInterfaceOnCancelListenerC20169o));
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: k */
    public final void mo11748k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo11748k(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f63840h1.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: x */
    public final void mo11760x(int i10, int i11, Intent intent) {
        super.mo11760x(i10, i11, intent);
        Iterator it = this.f63840h1.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo13189b(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: z */
    public final void mo5187z(Bundle bundle) {
        super.mo5187z(bundle);
        this.f63841i1 = 1;
        this.f63842j1 = bundle;
        for (Map.Entry entry : this.f63840h1.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo13190c(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }
}
