package p850k9;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: k9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16363b extends Thread {

    /* JADX INFO: renamed from: Y */
    public final WeakReference f50825Y;

    /* JADX INFO: renamed from: Z */
    public final long f50826Z;

    /* JADX INFO: renamed from: o0 */
    public final CountDownLatch f50827o0 = new CountDownLatch(1);

    /* JADX INFO: renamed from: p0 */
    public boolean f50828p0 = false;

    public C16363b(C16362a c16362a, long j10) {
        this.f50825Y = new WeakReference(c16362a);
        this.f50826Z = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C16362a c16362a;
        WeakReference weakReference = this.f50825Y;
        try {
            if (this.f50827o0.await(this.f50826Z, TimeUnit.MILLISECONDS) || (c16362a = (C16362a) weakReference.get()) == null) {
                return;
            }
            c16362a.m17968c();
            this.f50828p0 = true;
        } catch (InterruptedException unused) {
            C16362a c16362a2 = (C16362a) weakReference.get();
            if (c16362a2 != null) {
                c16362a2.m17968c();
                this.f50828p0 = true;
            }
        }
    }
}
