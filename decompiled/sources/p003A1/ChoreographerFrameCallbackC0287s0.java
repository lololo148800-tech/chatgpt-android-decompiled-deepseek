package p003A1;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: A1.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0287s0 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C0290t0 f1039Y;

    public ChoreographerFrameCallbackC0287s0(C0290t0 c0290t0) {
        this.f1039Y = c0290t0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f1039Y.f1045o0.removeCallbacks(this);
        C0290t0.m871Z0(this.f1039Y);
        C0290t0 c0290t0 = this.f1039Y;
        synchronized (c0290t0.f1046p0) {
            if (c0290t0.f1051u0) {
                c0290t0.f1051u0 = false;
                ArrayList arrayList = c0290t0.f1048r0;
                c0290t0.f1048r0 = c0290t0.f1049s0;
                c0290t0.f1049s0 = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j10);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0290t0.m871Z0(this.f1039Y);
        C0290t0 c0290t0 = this.f1039Y;
        synchronized (c0290t0.f1046p0) {
            if (c0290t0.f1048r0.isEmpty()) {
                c0290t0.f1044Z.removeFrameCallback(this);
                c0290t0.f1051u0 = false;
            }
        }
    }
}
