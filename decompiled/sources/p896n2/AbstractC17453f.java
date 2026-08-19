package p896n2;

import android.app.Notification;
import android.content.Context;
import com.openai.voice.webrtc.VoiceModeForegroundService;

/* JADX INFO: renamed from: n2.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17453f {
    /* JADX INFO: renamed from: a */
    public static String m19132a(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: b */
    public static void m19133b(Notification.Builder builder, boolean z6) {
        builder.setAllowSystemGeneratedContextualActions(z6);
    }

    /* JADX INFO: renamed from: c */
    public static void m19134c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    /* JADX INFO: renamed from: d */
    public static void m19135d(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    /* JADX INFO: renamed from: e */
    public static void m19136e(VoiceModeForegroundService voiceModeForegroundService, Notification notification, int i10) {
        if (i10 == 0 || i10 == -1) {
            voiceModeForegroundService.startForeground(4414, notification, i10);
        } else {
            voiceModeForegroundService.startForeground(4414, notification, i10 & 255);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m19137f(VoiceModeForegroundService voiceModeForegroundService, Notification notification, int i10) {
        if (i10 == 0 || i10 == -1) {
            voiceModeForegroundService.startForeground(4414, notification, i10);
        } else {
            voiceModeForegroundService.startForeground(4414, notification, i10 & 1073745919);
        }
    }
}
