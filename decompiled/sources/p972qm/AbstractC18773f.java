package p972qm;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: qm.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18773f {
    /* JADX INFO: renamed from: b */
    public static final boolean m20050b(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = context.getSystemService((Class<Object>) Vibrator.class);
            AbstractC16544l.m18093f(systemService, "getSystemService(...)");
            if (((Vibrator) systemService).areAllPrimitivesSupported(7, 1)) {
                return true;
            }
        }
        return false;
    }
}
