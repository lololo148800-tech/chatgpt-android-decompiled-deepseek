package p109E3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0235c;
import p1073w3.AbstractC20817s;
import p1073w3.C20809k;
import p1073w3.C20810l;
import p117Eb.RunnableC2394x;
import p613Z4.AbstractC10157d;

/* JADX INFO: renamed from: E3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2285i extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7060a;

    /* JADX INFO: renamed from: b */
    public Object f7061b;

    /* JADX INFO: renamed from: a */
    public void m3378a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((RunnableC2394x) this.f7061b).f7448p0).f36853b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f7060a) {
            case 0:
                if (!isInitialStickyBroadcast()) {
                    C2286j c2286j = (C2286j) this.f7061b;
                    c2286j.m3379a(C2281e.m3372b(context, intent, c2286j.f7070i, c2286j.f7069h));
                }
                break;
            case 1:
                RunnableC2394x runnableC2394x = (RunnableC2394x) this.f7061b;
                if (runnableC2394x != null && runnableC2394x.m3571a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    RunnableC2394x runnableC2394x2 = (RunnableC2394x) this.f7061b;
                    ((FirebaseMessaging) runnableC2394x2.f7448p0).getClass();
                    FirebaseMessaging.m13705b(runnableC2394x2, 0L);
                    ((FirebaseMessaging) ((RunnableC2394x) this.f7061b).f7448p0).f36853b.unregisterReceiver(this);
                    this.f7061b = null;
                }
                break;
            case 2:
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(intent, "intent");
                ((AbstractC10157d) this.f7061b).mo10757f(intent);
                break;
            case 3:
                ((AbstractC0235c) this.f7061b).mo778l();
                break;
            default:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i10 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i10 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i10 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i10 = 4;
                                        break;
                                    case 13:
                                        i10 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i10 = 6;
                                        break;
                                    case 18:
                                        i10 = 2;
                                        break;
                                    case 20:
                                        if (AbstractC20817s.f66106a >= 29) {
                                            i10 = 9;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i10 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i10 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i10 = 4;
                                        break;
                                    case 13:
                                        i10 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i10 = 6;
                                        break;
                                    case 18:
                                        i10 = 2;
                                        break;
                                    case 20:
                                        if (AbstractC20817s.f66106a >= 29) {
                                            i10 = 9;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i10 = type != 9 ? 8 : 7;
                            } else {
                                i10 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i11 = AbstractC20817s.f66106a;
                C20810l c20810l = (C20810l) this.f7061b;
                if (i11 < 31 || i10 != 5) {
                    C20810l.m21335a(c20810l, i10);
                } else {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        C20809k c20809k = new C20809k(c20810l);
                        telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c20809k);
                        telephonyManager.unregisterTelephonyCallback(c20809k);
                    } catch (RuntimeException unused2) {
                        C20810l.m21335a(c20810l, 5);
                        return;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C2285i(Object obj, int i10) {
        this.f7060a = i10;
        this.f7061b = obj;
    }
}
