package p081D1;

import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: renamed from: D1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1846c {
    /* JADX INFO: renamed from: a */
    public static AutofillId m2695a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
        return contentCaptureSession.newAutofillId(autofillId, j10);
    }

    /* JADX INFO: renamed from: b */
    public static ViewStructure m2696b(ContentCaptureSession contentCaptureSession, View view) {
        return contentCaptureSession.newViewStructure(view);
    }

    /* JADX INFO: renamed from: c */
    public static ViewStructure m2697c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
    }

    /* JADX INFO: renamed from: d */
    public static void m2698d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    /* JADX INFO: renamed from: e */
    public static void m2699e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
        contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static void m2700f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }
}
