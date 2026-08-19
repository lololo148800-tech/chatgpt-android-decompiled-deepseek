package p1060v9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: v9.C */
/* JADX INFO: loaded from: classes.dex */
public final class C20480C implements Handler.Callback {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20481D f65018Y;

    public /* synthetic */ C20480C(C20481D c20481d) {
        this.f65018Y = c20481d;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f65018Y.f65022a) {
                try {
                    C20478A c20478a = (C20478A) message.obj;
                    ServiceConnectionC20479B serviceConnectionC20479B = (ServiceConnectionC20479B) this.f65018Y.f65022a.get(c20478a);
                    if (serviceConnectionC20479B != null && serviceConnectionC20479B.f65011a.isEmpty()) {
                        if (serviceConnectionC20479B.f65013c) {
                            serviceConnectionC20479B.f65017g.f65024c.removeMessages(1, serviceConnectionC20479B.f65015e);
                            C20481D c20481d = serviceConnectionC20479B.f65017g;
                            c20481d.f65025d.m1910b(c20481d.f65023b, serviceConnectionC20479B);
                            serviceConnectionC20479B.f65013c = false;
                            serviceConnectionC20479B.f65012b = 2;
                        }
                        this.f65018Y.f65022a.remove(c20478a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f65018Y.f65022a) {
            try {
                C20478A c20478a2 = (C20478A) message.obj;
                ServiceConnectionC20479B serviceConnectionC20479B2 = (ServiceConnectionC20479B) this.f65018Y.f65022a.get(c20478a2);
                if (serviceConnectionC20479B2 != null && serviceConnectionC20479B2.f65012b == 3) {
                    AbstractC15256t.m16466d("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(c20478a2)), new Exception());
                    ComponentName componentName = serviceConnectionC20479B2.f65016f;
                    if (componentName == null) {
                        c20478a2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = c20478a2.f65009b;
                        AbstractC20502t.m21157h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    serviceConnectionC20479B2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
