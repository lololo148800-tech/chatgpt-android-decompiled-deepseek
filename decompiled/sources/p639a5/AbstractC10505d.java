package p639a5;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;
import io.sentry.android.core.AbstractC15256t;
import p444S4.C7011q;

/* JADX INFO: renamed from: a5.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10505d {
    /* JADX INFO: renamed from: a */
    public static void m10964a(Service service, int i10, Notification notification, int i11) {
        try {
            service.startForeground(i10, notification, i11);
        } catch (ForegroundServiceStartNotAllowedException e10) {
            C7011q c7011qM7408d = C7011q.m7408d();
            String str = SystemForegroundService.f33731r0;
            if (c7011qM7408d.f22422a <= 5) {
                AbstractC15256t.m16483u(str, "Unable to start foreground service", e10);
            }
        } catch (SecurityException e11) {
            C7011q c7011qM7408d2 = C7011q.m7408d();
            String str2 = SystemForegroundService.f33731r0;
            if (c7011qM7408d2.f22422a <= 5) {
                AbstractC15256t.m16483u(str2, "Unable to start foreground service", e11);
            }
        }
    }
}
