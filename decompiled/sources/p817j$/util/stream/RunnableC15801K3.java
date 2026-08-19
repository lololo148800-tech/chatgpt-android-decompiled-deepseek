package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.K3 */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC15801K3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Runnable f49107a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Runnable f49108b;

    RunnableC15801K3(Runnable runnable, Runnable runnable2) {
        this.f49107a = runnable;
        this.f49108b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f49108b;
        try {
            this.f49107a.run();
            runnable.run();
        } catch (Throwable th2) {
            try {
                runnable.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}
