package no;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: no.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC17707a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f56534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f56535b;

    public /* synthetic */ ThreadFactoryC17707a(String str, boolean z6) {
        this.f56534a = str;
        this.f56535b = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f56534a;
        AbstractC16544l.m18094g(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f56535b);
        return thread;
    }
}
