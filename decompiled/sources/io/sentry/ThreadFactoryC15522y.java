package io.sentry;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.AbstractC16544l;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: io.sentry.y */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC15522y implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48475a;

    /* JADX INFO: renamed from: b */
    public int f48476b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r6) {
        switch (this.f48475a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(sVDIzpC.khQ);
                int i10 = this.f48476b;
                this.f48476b = i10 + 1;
                sb2.append(i10);
                Thread thread = new Thread(r6, sb2.toString());
                thread.setDaemon(true);
                return thread;
            case 1:
                StringBuilder sb3 = new StringBuilder("SentryExecutorServiceThreadFactory-");
                int i11 = this.f48476b;
                this.f48476b = i11 + 1;
                sb3.append(i11);
                Thread thread2 = new Thread(r6, sb3.toString());
                thread2.setDaemon(true);
                return thread2;
            case 2:
                AbstractC16544l.m18094g(r6, "r");
                StringBuilder sb4 = new StringBuilder("SentryReplayIntegration-");
                int i12 = this.f48476b;
                this.f48476b = i12 + 1;
                sb4.append(i12);
                Thread thread3 = new Thread(r6, sb4.toString());
                thread3.setDaemon(true);
                return thread3;
            case 3:
                AbstractC16544l.m18094g(r6, "r");
                StringBuilder sb5 = new StringBuilder("SentryWindowRecorder-");
                int i13 = this.f48476b;
                this.f48476b = i13 + 1;
                sb5.append(i13);
                Thread thread4 = new Thread(r6, sb5.toString());
                thread4.setDaemon(true);
                return thread4;
            case 4:
                AbstractC16544l.m18094g(r6, "r");
                StringBuilder sb6 = new StringBuilder("SentryReplayPersister-");
                int i14 = this.f48476b;
                this.f48476b = i14 + 1;
                sb6.append(i14);
                Thread thread5 = new Thread(r6, sb6.toString());
                thread5.setDaemon(true);
                return thread5;
            default:
                StringBuilder sb7 = new StringBuilder("SentryAsyncConnection-");
                int i15 = this.f48476b;
                this.f48476b = i15 + 1;
                sb7.append(i15);
                Thread thread6 = new Thread(r6, sb7.toString());
                thread6.setDaemon(true);
                return thread6;
        }
    }
}
