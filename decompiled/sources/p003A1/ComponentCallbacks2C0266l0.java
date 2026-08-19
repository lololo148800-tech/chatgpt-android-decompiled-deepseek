package p003A1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import p107E1.C2241e;

/* JADX INFO: renamed from: A1.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0266l0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2241e f978Y;

    public ComponentCallbacks2C0266l0(C2241e c2241e) {
        this.f978Y = c2241e;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C2241e c2241e = this.f978Y;
        synchronized (c2241e) {
            c2241e.f6862a.m14689a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C2241e c2241e = this.f978Y;
        synchronized (c2241e) {
            c2241e.f6862a.m14689a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        C2241e c2241e = this.f978Y;
        synchronized (c2241e) {
            c2241e.f6862a.m14689a();
        }
    }
}
