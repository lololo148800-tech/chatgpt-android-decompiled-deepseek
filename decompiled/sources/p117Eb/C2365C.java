package p117Eb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import com.pairip.VMRunner;

/* JADX INFO: renamed from: Eb.C */
/* JADX INFO: loaded from: classes.dex */
public final class C2365C extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public RunnableC2366D f7347a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC2366D f7348b;

    public C2365C(RunnableC2366D runnableC2366D, RunnableC2366D runnableC2366D2) {
        this.f7348b = runnableC2366D;
        this.f7347a = runnableC2366D2;
    }

    /* JADX INFO: renamed from: a */
    public final void m3459a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f7348b.f7352Y.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        VMRunner.invoke("uCBt44MOBzbOT3Im", new Object[]{this, context, intent});
    }
}
