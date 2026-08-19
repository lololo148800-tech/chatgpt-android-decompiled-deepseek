package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11952f0 {

    /* JADX INFO: renamed from: d */
    public static final C11952f0 f36260d = new C11952f0();

    /* JADX INFO: renamed from: a */
    public final Runnable f36261a;

    /* JADX INFO: renamed from: b */
    public final Executor f36262b;

    /* JADX INFO: renamed from: c */
    public C11952f0 f36263c;

    public C11952f0() {
        this.f36261a = null;
        this.f36262b = null;
    }

    public C11952f0(Runnable runnable, Executor executor) {
        this.f36261a = runnable;
        this.f36262b = executor;
    }
}
