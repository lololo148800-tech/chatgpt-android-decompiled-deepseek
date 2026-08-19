package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC11115x;
import java.util.LinkedHashMap;
import java.util.Map;
import p444S4.C7011q;
import p519V4.C7762j;
import p674c5.AbstractC11658k;
import p674c5.C11659l;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC11115x {

    /* JADX INFO: renamed from: p0 */
    public static final String f33722p0 = C7011q.m7409f("SystemAlarmService");

    /* JADX INFO: renamed from: Z */
    public C7762j f33723Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f33724o0;

    /* JADX INFO: renamed from: b */
    public final void m12358b() {
        this.f33724o0 = true;
        C7011q.m7408d().m7410a(f33722p0, "All commands completed in dispatcher");
        String str = AbstractC11658k.f35306a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (C11659l.f35307a) {
            linkedHashMap.putAll(C11659l.f35308b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                C7011q.m7408d().m7414g(AbstractC11658k.f35306a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC11115x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C7762j c7762j = new C7762j(this);
        this.f33723Z = c7762j;
        if (c7762j.f24500u0 != null) {
            C7011q.m7408d().m7411b(C7762j.f24491w0, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            c7762j.f24500u0 = this;
        }
        this.f33724o0 = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC11115x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f33724o0 = true;
        C7762j c7762j = this.f33723Z;
        c7762j.getClass();
        C7011q.m7408d().m7410a(C7762j.f24491w0, "Destroying SystemAlarmDispatcher");
        c7762j.f24495p0.m7647h(c7762j);
        c7762j.f24500u0 = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f33724o0) {
            C7011q.m7408d().m7413e(f33722p0, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            C7762j c7762j = this.f33723Z;
            c7762j.getClass();
            C7011q c7011qM7408d = C7011q.m7408d();
            String str = C7762j.f24491w0;
            c7011qM7408d.m7410a(str, "Destroying SystemAlarmDispatcher");
            c7762j.f24495p0.m7647h(c7762j);
            c7762j.f24500u0 = null;
            C7762j c7762j2 = new C7762j(this);
            this.f33723Z = c7762j2;
            if (c7762j2.f24500u0 != null) {
                C7011q.m7408d().m7411b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                c7762j2.f24500u0 = this;
            }
            this.f33724o0 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f33723Z.m8029a(i11, intent);
        return 3;
    }
}
