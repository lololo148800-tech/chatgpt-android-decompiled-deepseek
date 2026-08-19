package p349O0;

import android.os.Looper;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: O0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5993b {

    /* JADX INFO: renamed from: a */
    public static final long f19470a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f19471b = 0;

    static {
        long id2;
        AbstractC9227W.m9800c(C5991a.f19466Z);
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f19470a = id2;
    }
}
