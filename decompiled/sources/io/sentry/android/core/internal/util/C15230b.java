package io.sentry.android.core.internal.util;

import android.os.Looper;
import io.sentry.util.thread.InterfaceC15505a;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15230b implements InterfaceC15505a {

    /* JADX INFO: renamed from: a */
    public static final C15230b f47526a = new C15230b();

    /* JADX INFO: renamed from: b */
    public static final C15230b f47527b = new C15230b();

    @Override // io.sentry.util.thread.InterfaceC15505a
    /* JADX INFO: renamed from: a */
    public boolean mo16438a() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }
}
