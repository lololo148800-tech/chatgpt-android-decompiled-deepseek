package p117Eb;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import p063C9.AbstractC1616b;
import p083D3.C1865c;
import p127El.ExecutorC2575a;
import p523V9.AbstractC7854B5;
import p692d0.C12966e;
import p746fa.C13606o;
import p746fa.InterfaceC13592a;

/* JADX INFO: renamed from: Eb.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2380j {

    /* JADX INFO: renamed from: c */
    public static final Object f7403c = new Object();

    /* JADX INFO: renamed from: d */
    public static ServiceConnectionC2370H f7404d;

    /* JADX INFO: renamed from: a */
    public final Object f7405a;

    /* JADX INFO: renamed from: b */
    public final Object f7406b;

    public C2380j(ExecutorService executorService) {
        this.f7406b = new C12966e(0);
        this.f7405a = executorService;
    }

    /* JADX INFO: renamed from: a */
    public static C13606o m3477a(Context context, Intent intent, boolean z6) {
        ServiceConnectionC2370H serviceConnectionC2370H;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f7403c) {
            try {
                if (f7404d == null) {
                    f7404d = new ServiceConnectionC2370H(context);
                }
                serviceConnectionC2370H = f7404d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z6) {
            return serviceConnectionC2370H.m3470b(intent).m15127f(new ExecutorC2575a(1), new C1865c(29));
        }
        if (C2391u.m3503y().m3505B(context)) {
            AbstractC2367E.m3466c(context, serviceConnectionC2370H, intent);
        } else {
            serviceConnectionC2370H.m3470b(intent);
        }
        return AbstractC7854B5.m8117e(-1);
    }

    /* JADX INFO: renamed from: b */
    public C13606o m3478b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zM2472d = AbstractC1616b.m2472d();
        final Context context = (Context) this.f7405a;
        boolean z6 = zM2472d && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z10 = (intent.getFlags() & 268435456) != 0;
        if (z6 && !z10) {
            return m3477a(context, intent, z10);
        }
        ExecutorC2575a executorC2575a = (ExecutorC2575a) this.f7406b;
        return AbstractC7854B5.m8115c(executorC2575a, new CallableC2378h(context, 0, intent)).m15128g(executorC2575a, new InterfaceC13592a() { // from class: Eb.i
            @Override // p746fa.InterfaceC13592a
            /* JADX INFO: renamed from: L */
            public final Object mo253L(C13606o c13606o) {
                return (AbstractC1616b.m2472d() && ((Integer) c13606o.m15130i()).intValue() == 402) ? C2380j.m3477a(context, intent, z10).m15127f(new ExecutorC2575a(1), new C1865c(28)) : c13606o;
            }
        });
    }

    public C2380j(Context context) {
        this.f7405a = context;
        this.f7406b = new ExecutorC2575a(1);
    }
}
