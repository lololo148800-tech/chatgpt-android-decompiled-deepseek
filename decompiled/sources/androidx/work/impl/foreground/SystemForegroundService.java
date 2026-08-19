package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC11115x;
import java.util.UUID;
import p301M.RunnableC5228j;
import p444S4.C7011q;
import p470T4.C7253r;
import p639a5.C10502a;
import p674c5.RunnableC11649b;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC11115x {

    /* JADX INFO: renamed from: r0 */
    public static final String f33731r0 = C7011q.m7409f("SystemFgService");

    /* JADX INFO: renamed from: Z */
    public Handler f33732Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f33733o0;

    /* JADX INFO: renamed from: p0 */
    public C10502a f33734p0;

    /* JADX INFO: renamed from: q0 */
    public NotificationManager f33735q0;

    /* JADX INFO: renamed from: b */
    public final void m12360b() {
        this.f33732Z = new Handler(Looper.getMainLooper());
        this.f33735q0 = (NotificationManager) getApplicationContext().getSystemService("notification");
        C10502a c10502a = new C10502a(getApplicationContext());
        this.f33734p0 = c10502a;
        if (c10502a.f31119u0 != null) {
            C7011q.m7408d().m7411b(C10502a.f31110v0, "A callback already exists.");
        } else {
            c10502a.f31119u0 = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC11115x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        m12360b();
    }

    @Override // androidx.lifecycle.AbstractServiceC11115x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f33734p0.m10962f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z6 = this.f33733o0;
        String str = f33731r0;
        if (z6) {
            C7011q.m7408d().m7413e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f33734p0.m10962f();
            m12360b();
            this.f33733o0 = false;
        }
        if (intent == null) {
            return 3;
        }
        C10502a c10502a = this.f33734p0;
        c10502a.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = C10502a.f31110v0;
        if (zEquals) {
            C7011q.m7408d().m7413e(str2, "Started foreground service " + intent);
            c10502a.f31112Z.m14897a(new RunnableC5228j(c10502a, intent.getStringExtra("KEY_WORKSPEC_ID"), false, 19));
            c10502a.m10961e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c10502a.m10961e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            C7011q.m7408d().m7413e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = c10502a.f31119u0;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f33733o0 = true;
            C7011q.m7408d().m7410a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        C7011q.m7408d().m7413e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra);
        C7253r c7253r = c10502a.f31111Y;
        c7253r.getClass();
        c7253r.f22999d.m14897a(new RunnableC11649b(c7253r, uuidFromString, 2));
        return 3;
    }
}
