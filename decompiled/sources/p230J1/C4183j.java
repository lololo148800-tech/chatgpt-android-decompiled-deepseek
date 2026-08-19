package p230J1;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: J1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4183j {

    /* JADX INFO: renamed from: a */
    public static final C4183j f13594a = new C4183j();

    /* JADX INFO: renamed from: a */
    public final boolean m4875a(Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.quickReject(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4876b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4877c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
