package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pairip.VMRunner;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.SoftReference;
import p523V9.AbstractC7845A4;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static SoftReference f36846a;

    /* JADX INFO: renamed from: b */
    public static SoftReference f36847b;

    /* JADX INFO: renamed from: a */
    public static int m13703a(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                AbstractC15256t.m16465c("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            AbstractC15256t.m16465c("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!AbstractC7845A4.m8096d(intentPutExtras)) {
            return -1;
        }
        AbstractC7845A4.m8095c("_nd", intentPutExtras.getExtras());
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("5E91GpKwSY11DA7M", new Object[]{this, context, intent});
    }
}
