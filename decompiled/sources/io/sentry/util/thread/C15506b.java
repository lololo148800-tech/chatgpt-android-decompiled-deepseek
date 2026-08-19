package io.sentry.util.thread;

/* JADX INFO: renamed from: io.sentry.util.thread.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15506b implements InterfaceC15505a {

    /* JADX INFO: renamed from: a */
    public static final long f48429a = Thread.currentThread().getId();

    /* JADX INFO: renamed from: b */
    public static final C15506b f48430b = new C15506b();

    @Override // io.sentry.util.thread.InterfaceC15505a
    /* JADX INFO: renamed from: a */
    public final boolean mo16438a() {
        return f48429a == Thread.currentThread().getId();
    }
}
