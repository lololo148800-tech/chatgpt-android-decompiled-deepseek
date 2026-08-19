package p1036u9;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
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

/* JADX INFO: renamed from: u9.E */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC20153E extends Fragment implements InterfaceC20162h {

    /* JADX INFO: renamed from: p0 */
    public static final WeakHashMap f63835p0 = new WeakHashMap();

    /* JADX INFO: renamed from: Y */
    public final Map f63836Y = DesugarCollections.synchronizedMap(new C12966e(0));

    /* JADX INFO: renamed from: Z */
    public int f63837Z = 0;

    /* JADX INFO: renamed from: o0 */
    public Bundle f63838o0;

    @Override // p1036u9.InterfaceC20162h
    /* JADX INFO: renamed from: d */
    public final LifecycleCallback mo20971d() {
        return (LifecycleCallback) DialogInterfaceOnCancelListenerC20169o.class.cast(this.f63836Y.get("ConnectionlessLifecycleHelper"));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f63836Y.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // p1036u9.InterfaceC20162h
    /* JADX INFO: renamed from: f */
    public final Activity mo20972f() {
        return getActivity();
    }

    @Override // p1036u9.InterfaceC20162h
    /* JADX INFO: renamed from: g */
    public final void mo20973g(DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o) {
        Map map = this.f63836Y;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        map.put("ConnectionlessLifecycleHelper", dialogInterfaceOnCancelListenerC20169o);
        if (this.f63837Z > 0) {
            new HandlerC6378d(Looper.getMainLooper(), 2).post(new RunnableC15195M(this, 19, dialogInterfaceOnCancelListenerC20169o));
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f63836Y.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo13189b(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f63837Z = 1;
        this.f63838o0 = bundle;
        for (Map.Entry entry : this.f63836Y.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo13190c(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f63837Z = 5;
        Iterator it = this.f63836Y.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f63837Z = 3;
        Iterator it = this.f63836Y.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo13191d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f63836Y.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo13192e(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f63837Z = 2;
        Iterator it = this.f63836Y.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo13193f();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f63837Z = 4;
        Iterator it = this.f63836Y.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo13194g();
        }
    }
}
