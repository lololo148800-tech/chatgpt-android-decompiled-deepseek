package p670c1;

import android.content.Context;
import android.media.MediaRecorder;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.window.SplashScreenView;

/* JADX INFO: renamed from: c1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC11557a {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ MediaRecorder m12938c(Context context) {
        return new MediaRecorder(context);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ViewTranslationRequest.Builder m12941f(AutofillId autofillId, long j10) {
        return new ViewTranslationRequest.Builder(autofillId, j10);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ SplashScreenView m12942g(View view) {
        return (SplashScreenView) view;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m12944i() {
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ boolean m12951p(View view) {
        return view instanceof SplashScreenView;
    }
}
