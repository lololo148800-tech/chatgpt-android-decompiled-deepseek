package p230J1;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: J1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4180g {

    /* JADX INFO: renamed from: a */
    public static final C4180g f13592a = new C4180g();

    /* JADX INFO: renamed from: a */
    public final boolean m4831a(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4832b(Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.clipOutRect(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4833c(Canvas canvas, int i10, int i11, int i12, int i13) {
        return canvas.clipOutRect(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4834d(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4835e(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
