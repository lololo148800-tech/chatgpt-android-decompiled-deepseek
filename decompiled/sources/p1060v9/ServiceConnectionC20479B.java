package p1060v9;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p037B9.C0850a;

/* JADX INFO: renamed from: v9.B */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC20479B implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final HashMap f65011a = new HashMap();

    /* JADX INFO: renamed from: b */
    public int f65012b = 2;

    /* JADX INFO: renamed from: c */
    public boolean f65013c;

    /* JADX INFO: renamed from: d */
    public IBinder f65014d;

    /* JADX INFO: renamed from: e */
    public final C20478A f65015e;

    /* JADX INFO: renamed from: f */
    public ComponentName f65016f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C20481D f65017g;

    public ServiceConnectionC20479B(C20481D c20481d, C20478A c20478a) {
        this.f65017g = c20481d;
        this.f65015e = c20478a;
    }

    /* JADX INFO: renamed from: a */
    public final void m21128a(String str, Executor executor) {
        this.f65012b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C20481D c20481d = this.f65017g;
            C0850a c0850a = c20481d.f65025d;
            Context context = c20481d.f65023b;
            boolean zM1911c = c0850a.m1911c(context, str, this.f65015e.m21127a(context), this, 4225, executor);
            this.f65013c = zM1911c;
            if (zM1911c) {
                this.f65017g.f65024c.sendMessageDelayed(this.f65017g.f65024c.obtainMessage(1, this.f65015e), this.f65017g.f65027f);
            } else {
                this.f65012b = 2;
                try {
                    C20481D c20481d2 = this.f65017g;
                    c20481d2.f65025d.m1910b(c20481d2.f65023b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f65017g.f65022a) {
            try {
                this.f65017g.f65024c.removeMessages(1, this.f65015e);
                this.f65014d = iBinder;
                this.f65016f = componentName;
                Iterator it = this.f65011a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f65012b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f65017g.f65022a) {
            try {
                this.f65017g.f65024c.removeMessages(1, this.f65015e);
                this.f65014d = null;
                this.f65016f = componentName;
                Iterator it = this.f65011a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f65012b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
