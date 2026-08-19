package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C15107A0;
import io.sentry.C15411n0;
import io.sentry.InterfaceC15142M;

/* JADX INFO: renamed from: io.sentry.android.core.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C15242k implements InterfaceC15142M {
    @Override // io.sentry.InterfaceC15142M
    /* JADX INFO: renamed from: a */
    public final void mo16318a(C15107A0 c15107a0) {
        c15107a0.f47004a = new C15411n0(System.currentTimeMillis(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize());
    }

    @Override // io.sentry.InterfaceC15142M
    /* JADX INFO: renamed from: c */
    public final void mo16319c() {
    }
}
