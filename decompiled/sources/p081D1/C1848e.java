package p081D1;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import p003A1.AbstractC0232b0;
import p056C2.AbstractC1510d;
import p523V9.AbstractC8062c4;
import p817j$.util.Objects;

/* JADX INFO: renamed from: D1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1848e {

    /* JADX INFO: renamed from: a */
    public final Object f5340a;

    /* JADX INFO: renamed from: b */
    public final View f5341b;

    public C1848e(ContentCaptureSession contentCaptureSession, View view) {
        this.f5340a = contentCaptureSession;
        this.f5341b = view;
    }

    /* JADX INFO: renamed from: a */
    public final AutofillId m2702a(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionM2192i = AbstractC1510d.m2192i(this.f5340a);
        C1844a c1844aM8456b = AbstractC8062c4.m8456b(this.f5341b);
        Objects.requireNonNull(c1844aM8456b);
        return AbstractC1846c.m2695a(contentCaptureSessionM2192i, AbstractC0232b0.m756n(c1844aM8456b.f5339Y), j10);
    }
}
