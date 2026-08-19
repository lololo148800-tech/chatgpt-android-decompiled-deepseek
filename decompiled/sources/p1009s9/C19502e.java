package p1009s9;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.AbstractActivityC11001b;
import com.google.android.gms.common.api.GoogleApiActivity;
import io.sentry.android.core.AbstractC15256t;
import p001A.AbstractC0010F;
import p063C9.AbstractC1616b;
import p1036u9.InterfaceC20162h;
import p1060v9.AbstractC20495m;
import p1060v9.AbstractC20502t;
import p1060v9.DialogInterfaceOnClickListenerC20496n;
import p588Y2.C9606J;
import p588Y2.C9617a;
import p826j6.AbstractC16145N;
import p896n2.C17459l;
import p896n2.C17463p;
import p896n2.C17465r;

/* JADX INFO: renamed from: s9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19502e extends C19503f {

    /* JADX INFO: renamed from: c */
    public static final Object f61949c = new Object();

    /* JADX INFO: renamed from: d */
    public static final C19502e f61950d = new C19502e();

    /* JADX INFO: renamed from: e */
    public static AlertDialog m20595e(Activity activity, int i10, DialogInterfaceOnClickListenerC20496n dialogInterfaceOnClickListenerC20496n, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC20495m.m21140b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i10 == 1) {
            string = resources.getString(com.openai.chatgpt.R.string.common_google_play_services_install_button);
        } else if (i10 != 2) {
            string = i10 != 3 ? resources.getString(R.string.ok) : resources.getString(com.openai.chatgpt.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.openai.chatgpt.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, dialogInterfaceOnClickListenerC20496n);
        }
        String strM21141c = AbstractC20495m.m21141c(activity, i10);
        if (strM21141c != null) {
            builder.setTitle(strM21141c);
        }
        AbstractC15256t.m16483u("GoogleApiAvailability", AbstractC10763a.m11048f(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX INFO: renamed from: f */
    public static void m20596f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC11001b) {
                C9606J c9606jM11762n = ((AbstractActivityC11001b) activity).m11762n();
                C19507j c19507j = new C19507j();
                AbstractC20502t.m21158i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                c19507j.f61961v1 = alertDialog;
                if (onCancelListener != null) {
                    c19507j.f61962w1 = onCancelListener;
                }
                c19507j.f29023s1 = false;
                c19507j.f29024t1 = true;
                c9606jM11762n.getClass();
                C9617a c9617a = new C9617a(c9606jM11762n);
                c9617a.f28971o = true;
                c9617a.m10162e(0, c19507j, str, 1);
                c9617a.m10161d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC19500c dialogFragmentC19500c = new DialogFragmentC19500c();
        AbstractC20502t.m21158i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC19500c.f61943Y = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC19500c.f61944Z = onCancelListener;
        }
        dialogFragmentC19500c.show(fragmentManager, str);
    }

    /* JADX INFO: renamed from: d */
    public final void m20597d(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogM20595e = m20595e(googleApiActivity, i10, new DialogInterfaceOnClickListenerC20496n(super.m20601b(i10, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogM20595e == null) {
            return;
        }
        m20596f(googleApiActivity, alertDialogM20595e, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX INFO: renamed from: g */
    public final void m20598g(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        AbstractC15256t.m16483u("GoogleApiAvailability", AbstractC0010F.m19c(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new HandlerC19508k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                AbstractC15256t.m16482t("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM21143e = i10 == 6 ? AbstractC20495m.m21143e(context, "common_google_play_services_resolution_required_title") : AbstractC20495m.m21141c(context, i10);
        if (strM21143e == null) {
            strM21143e = context.getResources().getString(com.openai.chatgpt.R.string.common_google_play_services_notification_ticker);
        }
        String strM21142d = (i10 == 6 || i10 == 19) ? AbstractC20495m.m21142d(context, "common_google_play_services_resolution_required_text", AbstractC20495m.m21139a(context)) : AbstractC20495m.m21140b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC20502t.m21157h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C17465r c17465r = new C17465r(context, null);
        c17465r.f55836n = true;
        c17465r.m19165c(16, true);
        c17465r.f55827e = C17465r.m19163b(strM21143e);
        C17463p c17463p = new C17463p((char) 0, 9);
        c17463p.f55822o0 = C17465r.m19163b(strM21142d);
        c17465r.m19167e(c17463p);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC1616b.f4570b == null) {
            AbstractC1616b.f4570b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC1616b.f4570b.booleanValue()) {
            c17465r.f55842t.icon = context.getApplicationInfo().icon;
            c17465r.f55832j = 2;
            if (AbstractC1616b.m2473e(context)) {
                c17465r.f55824b.add(new C17459l(IconCompat.m11384b(null, "", 2131230925), resources.getString(com.openai.chatgpt.R.string.common_open_on_phone), pendingIntent, new Bundle(), null, null));
            } else {
                c17465r.f55829g = pendingIntent;
            }
        } else {
            c17465r.f55842t.icon = R.drawable.stat_sys_warning;
            c17465r.f55842t.tickerText = C17465r.m19163b(resources.getString(com.openai.chatgpt.R.string.common_google_play_services_notification_ticker));
            c17465r.f55842t.when = System.currentTimeMillis();
            c17465r.f55829g = pendingIntent;
            c17465r.f55828f = C17465r.m19163b(strM21142d);
        }
        if (AbstractC1616b.m2472d()) {
            AbstractC20502t.m21160k(AbstractC1616b.m2472d());
            synchronized (f61949c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.openai.chatgpt.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(AbstractC16145N.m17723c(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            c17465r.f55840r = "com.google.android.gms.availability";
        }
        Notification notificationM19164a = c17465r.m19164a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            AbstractC19505h.f61953a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationM19164a);
    }

    /* JADX INFO: renamed from: h */
    public final void m20599h(Activity activity, InterfaceC20162h interfaceC20162h, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogM20595e = m20595e(activity, i10, new DialogInterfaceOnClickListenerC20496n(super.m20601b(i10, activity, "d"), interfaceC20162h, 1), onCancelListener);
        if (alertDialogM20595e == null) {
            return;
        }
        m20596f(activity, alertDialogM20595e, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
