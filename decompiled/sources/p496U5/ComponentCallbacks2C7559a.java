package p496U5;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import p033B5.C0835s;
import p033B5.C0840x;
import p259K5.C4541c;

/* JADX INFO: renamed from: U5.a */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C7559a implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: Y */
    public final WeakReference f23954Y;

    /* JADX INFO: renamed from: Z */
    public Context f23955Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f23956o0;

    public ComponentCallbacks2C7559a(C0840x c0840x) {
        this.f23954Y = new WeakReference(c0840x);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7914a() {
        try {
            if (this.f23956o0) {
                return;
            }
            this.f23956o0 = true;
            Context context = this.f23955Z;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.f23954Y.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C0840x) this.f23954Y.get()) == null) {
            m7914a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        C4541c c4541c;
        try {
            C0840x c0840x = (C0840x) this.f23954Y.get();
            if (c0840x != null) {
                C0835s c0835s = c0840x.f2343a;
                if (i10 >= 40) {
                    C4541c c4541c2 = (C4541c) c0835s.f2318c.getValue();
                    if (c4541c2 != null) {
                        c4541c2.m5303a();
                    }
                } else if (i10 >= 10 && (c4541c = (C4541c) c0835s.f2318c.getValue()) != null) {
                    c4541c.m5306d(c4541c.m5304b() / ((long) 2));
                }
            } else {
                m7914a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
