package p230J1;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: J1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4179f {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ NotificationChannel m4805a() {
        return new NotificationChannel("livekit_screen_capture", "Screen Capture", 2);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ AutofillManager m4809e(Object obj) {
        return (AutofillManager) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ AutofillValue m4810f(Object obj) {
        return (AutofillValue) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ Class m4812h() {
        return AutofillManager.class;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m4814j() {
    }
}
