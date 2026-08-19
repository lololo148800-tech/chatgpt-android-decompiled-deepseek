package p003A1;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioFocusRequest;
import android.view.autofill.AutofillId;

/* JADX INFO: renamed from: A1.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0232b0 {
    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m741C(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ NotificationChannel m747e(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ AudioFocusRequest.Builder m749g(int i10) {
        return new AudioFocusRequest.Builder(i10);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ AudioFocusRequest.Builder m753k(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ AutofillId m756n(Object obj) {
        return (AutofillId) obj;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m758p() {
    }
}
