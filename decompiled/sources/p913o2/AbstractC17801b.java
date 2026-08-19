package p913o2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17801b {
    /* JADX INFO: renamed from: a */
    public static Intent m19550a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        if ((i10 & 4) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i10 & 1);
        }
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (AbstractC17803d.m19555b(context, str) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, null);
        }
        throw new RuntimeException(AbstractC10763a.m11054l("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* JADX INFO: renamed from: b */
    public static Intent m19551b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i10);
    }

    /* JADX INFO: renamed from: c */
    public static void m19552c(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
