package p117Eb;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p001A.C0072l;
import p001A.RunnableC0066i;
import p127El.ExecutorC2575a;
import p477Tb.C7296c;
import p746fa.C13599h;

/* JADX INFO: renamed from: Eb.F */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2368F extends Binder {

    /* JADX INFO: renamed from: a */
    public final C7296c f7360a;

    public BinderC2368F(C7296c c7296c) {
        this.f7360a = c7296c;
    }

    /* JADX INFO: renamed from: a */
    public final void m3468a(C2369G c2369g) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = c2369g.f7361a;
        AbstractServiceC2377g abstractServiceC2377g = (AbstractServiceC2377g) this.f7360a.f23104Z;
        abstractServiceC2377g.getClass();
        C13599h c13599h = new C13599h();
        abstractServiceC2377g.f7392Y.execute(new RunnableC0066i(abstractServiceC2377g, intent, c13599h, 8));
        c13599h.f42961a.m15123b(new ExecutorC2575a(1), new C0072l(c2369g, 23));
    }
}
