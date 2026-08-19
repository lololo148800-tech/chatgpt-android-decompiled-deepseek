package p117Eb;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.atomic.AtomicInteger;
import p003A1.AbstractC0232b0;

/* JADX INFO: renamed from: Eb.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2375e {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f7390a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: a */
    public static boolean m3473a(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC0232b0.m741C(resources.getDrawable(i10, null))) {
                return true;
            }
            AbstractC15256t.m16465c("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            AbstractC15256t.m16465c("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }
}
