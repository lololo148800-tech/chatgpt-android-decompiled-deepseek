package vc;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: vc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC20519c implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public static final ThreadFactoryC20519c f65136a = new ThreadFactoryC20519c();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "kronos-android");
    }
}
