package p277L;

import java.util.concurrent.ThreadFactory;
import p1096x2.C21114i;

/* JADX INFO: renamed from: L.e */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC4832e implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15730a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f15730a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            default:
                return new C21114i(runnable);
        }
    }
}
