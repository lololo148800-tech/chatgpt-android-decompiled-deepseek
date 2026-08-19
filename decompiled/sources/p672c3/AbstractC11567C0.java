package p672c3;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: c3.C0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11567C0 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f34969a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m12964a() {
        if (Build.VERSION.SDK_INT < 29 || !f34969a.get()) {
            return;
        }
        C11569D0.f34970a.m12966b("GlanceAppWidget::update", 0);
    }
}
