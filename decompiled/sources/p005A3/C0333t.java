package p005A3;

import android.os.ConditionVariable;

/* JADX INFO: renamed from: A3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0333t extends Thread {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ConditionVariable f1150Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0334u f1151Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0333t(C0334u c0334u, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f1151Z = c0334u;
        this.f1150Y = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f1151Z) {
            this.f1150Y.open();
            C0334u.m970j(this.f1151Z);
            this.f1151Z.f1154b.getClass();
        }
    }
}
