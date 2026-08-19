package p896n2;

import android.app.Notification;
import android.app.NotificationManager;
import com.openai.voice.webrtc.VoiceModeForegroundService;

/* JADX INFO: renamed from: n2.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17466s {
    /* JADX INFO: renamed from: a */
    public static boolean m19168a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    /* JADX INFO: renamed from: b */
    public static void m19169b(Notification.Action.Builder builder, boolean z6) {
        builder.setAllowGeneratedReplies(z6);
    }

    /* JADX INFO: renamed from: c */
    public static void m19170c(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }

    /* JADX INFO: renamed from: d */
    public static void m19171d(VoiceModeForegroundService voiceModeForegroundService) {
        voiceModeForegroundService.stopForeground(1);
    }
}
