package p896n2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;

/* JADX INFO: renamed from: n2.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17458k {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m19139a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* JADX INFO: renamed from: b */
    public static NotificationChannel m19140b(int i10, CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, i10);
    }

    /* JADX INFO: renamed from: c */
    public static void m19141c(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    /* JADX INFO: renamed from: d */
    public static void m19142d(NotificationChannel notificationChannel) {
        notificationChannel.enableLights(false);
    }

    /* JADX INFO: renamed from: e */
    public static void m19143e(NotificationChannel notificationChannel) {
        notificationChannel.enableVibration(false);
    }

    /* JADX INFO: renamed from: f */
    public static void m19144f(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    /* JADX INFO: renamed from: g */
    public static void m19145g(NotificationChannel notificationChannel) {
        notificationChannel.setDescription(null);
    }

    /* JADX INFO: renamed from: h */
    public static void m19146h(NotificationChannel notificationChannel) {
        notificationChannel.setGroup(null);
    }

    /* JADX INFO: renamed from: i */
    public static void m19147i(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    /* JADX INFO: renamed from: j */
    public static void m19148j(NotificationChannel notificationChannel) {
        notificationChannel.setLightColor(0);
    }

    /* JADX INFO: renamed from: k */
    public static void m19149k(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    /* JADX INFO: renamed from: l */
    public static void m19150l(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    /* JADX INFO: renamed from: m */
    public static void m19151m(NotificationChannel notificationChannel) {
        notificationChannel.setShowBadge(true);
    }

    /* JADX INFO: renamed from: n */
    public static void m19152n(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }

    /* JADX INFO: renamed from: o */
    public static void m19153o(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    /* JADX INFO: renamed from: p */
    public static void m19154p(NotificationChannel notificationChannel) {
        notificationChannel.setVibrationPattern(null);
    }
}
