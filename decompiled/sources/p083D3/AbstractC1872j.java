package p083D3;

import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioProfile;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: renamed from: D3.j */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1872j {
    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ AudioProfile m2824c(Object obj) {
        return (AudioProfile) obj;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession m2826e(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ScrollCaptureTarget m2827f(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ ViewTranslationResponse m2832k(Object obj) {
        return (ViewTranslationResponse) obj;
    }
}
