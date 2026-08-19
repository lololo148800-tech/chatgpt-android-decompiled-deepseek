package p1142z3;

import android.system.ErrnoException;
import android.system.OsConstants;

/* JADX INFO: renamed from: z3.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21748p {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m22248b(Throwable th2) {
        return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
    }
}
