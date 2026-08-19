package p089D9;

import android.os.Process;
import p523V9.AbstractC8158o4;

/* JADX INFO: renamed from: D9.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1981a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5852Y;

    /* JADX INFO: renamed from: Z */
    public final Runnable f5853Z;

    public /* synthetic */ RunnableC1981a(Runnable runnable, int i10) {
        this.f5852Y = i10;
        this.f5853Z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5852Y) {
            case 0:
                Process.setThreadPriority(0);
                this.f5853Z.run();
                break;
            case 1:
                this.f5853Z.run();
                break;
            case 2:
                try {
                    this.f5853Z.run();
                } catch (Exception e10) {
                    AbstractC8158o4.m8718c("Executor", "Background execution failure.", e10);
                    return;
                }
                break;
            default:
                this.f5853Z.run();
                break;
        }
    }

    public String toString() {
        switch (this.f5852Y) {
            case 3:
                return this.f5853Z.toString();
            default:
                return super.toString();
        }
    }
}
