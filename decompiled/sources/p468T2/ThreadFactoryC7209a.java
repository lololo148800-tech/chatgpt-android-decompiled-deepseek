package p468T2;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: T2.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC7209a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22883a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f22884b;

    public /* synthetic */ ThreadFactoryC7209a(String str, int i10) {
        this.f22883a = i10;
        this.f22884b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f22883a) {
            case 0:
                Thread thread = new Thread(runnable, this.f22884b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f22884b);
        }
    }
}
