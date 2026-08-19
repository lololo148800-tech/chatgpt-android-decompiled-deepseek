package p771go;

import android.os.Looper;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: go.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14204c {

    /* JADX INFO: renamed from: a */
    public static final C17314q f44617a = AbstractC9227W.m9800c(C14203b.f44614Z);

    /* JADX INFO: renamed from: a */
    public static final void m15511a() {
        Looper mainLooper = Looper.getMainLooper();
        AbstractC16544l.m18090c(mainLooper, "Looper.getMainLooper()");
        if (mainLooper.getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(("Should be called from the main thread, not " + Thread.currentThread()).toString());
    }
}
