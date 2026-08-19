package p003A1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import p107E1.C2238b;
import p107E1.C2240d;

/* JADX INFO: renamed from: A1.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0263k0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Configuration f972Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2240d f973Z;

    public ComponentCallbacks2C0263k0(Configuration configuration, C2240d c2240d) {
        this.f972Y = configuration;
        this.f973Z = c2240d;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f972Y;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f973Z.f6861a.entrySet().iterator();
        while (it.hasNext()) {
            C2238b c2238b = (C2238b) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (c2238b == null || Configuration.needNewResources(iUpdateFrom, c2238b.f6858b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f973Z.f6861a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f973Z.f6861a.clear();
    }
}
