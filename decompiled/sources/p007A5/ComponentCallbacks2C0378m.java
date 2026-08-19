package p007A5;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import fo.C13711h;
import java.lang.ref.WeakReference;
import p1033u5.C20118c;
import p1056v5.InterfaceC20460e;
import p864l5.C16826m;
import p885m4.C17155e;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: A5.m */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0378m implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: Y */
    public final WeakReference f1281Y;

    /* JADX INFO: renamed from: Z */
    public Context f1282Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC20460e f1283o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f1284p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f1285q0 = true;

    public ComponentCallbacks2C0378m(C16826m c16826m) {
        this.f1281Y = new WeakReference(c16826m);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m1017a() {
        InterfaceC20460e c17155e;
        try {
            C16826m c16826m = (C16826m) this.f1281Y.get();
            if (c16826m == null) {
                m1018b();
            } else if (this.f1283o0 == null) {
                if (c16826m.f53991d.f1273b) {
                    Context context = c16826m.f53988a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || AbstractC17803d.m19554a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        c17155e = new C17155e();
                    } else {
                        try {
                            c17155e = new C13711h(connectivityManager, this);
                        } catch (Exception unused) {
                            c17155e = new C17155e();
                        }
                    }
                } else {
                    c17155e = new C17155e();
                }
                this.f1283o0 = c17155e;
                this.f1285q0 = c17155e.mo15192a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m1018b() {
        try {
            if (this.f1284p0) {
                return;
            }
            this.f1284p0 = true;
            Context context = this.f1282Z;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            InterfaceC20460e interfaceC20460e = this.f1283o0;
            if (interfaceC20460e != null) {
                interfaceC20460e.shutdown();
            }
            this.f1281Y.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C16826m) this.f1281Y.get()) == null) {
            m1018b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        C16826m c16826m = (C16826m) this.f1281Y.get();
        if (c16826m != null) {
            C20118c c20118c = (C20118c) c16826m.f53990c.getValue();
            if (c20118c != null) {
                c20118c.f63742a.mo14961y(i10);
                c20118c.f63743b.m5311e(i10);
            }
        } else {
            m1018b();
        }
    }
}
