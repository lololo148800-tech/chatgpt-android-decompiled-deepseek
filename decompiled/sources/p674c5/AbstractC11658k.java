package p674c5;

import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.AbstractC16544l;
import p444S4.C7011q;

/* JADX INFO: renamed from: c5.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11658k {

    /* JADX INFO: renamed from: a */
    public static final String f35306a;

    static {
        String strM7409f = C7011q.m7409f("WakeLocks");
        AbstractC16544l.m18093f(strM7409f, "tagWithPrefix(\"WakeLocks\")");
        f35306a = strM7409f;
    }

    /* JADX INFO: renamed from: a */
    public static final PowerManager.WakeLock m13020a(Context context, String tag) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (C11659l.f35307a) {
        }
        AbstractC16544l.m18093f(wakeLock, "wakeLock");
        return wakeLock;
    }
}
