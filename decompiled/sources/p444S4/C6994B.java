package p444S4;

import android.content.Context;
import androidx.work.WorkerParameters;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: S4.B */
/* JADX INFO: loaded from: classes.dex */
public final class C6994B {

    /* JADX INFO: renamed from: a */
    public static final String f22376a = C7011q.m7409f("WorkerFactory");

    /* JADX INFO: renamed from: a */
    public static AbstractC7010p m7399a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f22376a;
        AbstractC7010p abstractC7010p = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(AbstractC7010p.class);
        } catch (Throwable th2) {
            C7011q.m7408d().m7412c(str2, "Invalid class: " + str, th2);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                abstractC7010p = (AbstractC7010p) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th3) {
                C7011q.m7408d().m7412c(str2, "Could not instantiate " + str, th3);
            }
        }
        if (abstractC7010p == null || !abstractC7010p.f22419p0) {
            return abstractC7010p;
        }
        throw new IllegalStateException(AbstractC0010F.m20d("WorkerFactory (", C6994B.class.getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
