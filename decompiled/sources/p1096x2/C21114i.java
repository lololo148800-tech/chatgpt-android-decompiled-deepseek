package p1096x2;

import android.os.Process;

/* JADX INFO: renamed from: x2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C21114i extends Thread {

    /* JADX INFO: renamed from: Y */
    public final int f67068Y;

    public C21114i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f67068Y = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f67068Y);
        super.run();
    }
}
