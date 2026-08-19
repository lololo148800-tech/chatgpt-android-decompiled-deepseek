package io.sentry.cache;

import io.sentry.C15524y1;
import io.sentry.InterfaceC15133J;

/* JADX INFO: renamed from: io.sentry.cache.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15331e implements InterfaceC15133J {

    /* JADX INFO: renamed from: a */
    public final C15524y1 f47883a;

    public C15331e(C15524y1 c15524y1) {
        this.f47883a = c15524y1;
    }

    /* JADX INFO: renamed from: a */
    public final void m16545a(String str) {
        AbstractC15327a.m16535a(this.f47883a, ".options-cache", str);
    }

    /* JADX INFO: renamed from: b */
    public final void m16546b(Object obj, String str) {
        AbstractC15327a.m16537c(this.f47883a, obj, ".options-cache", str);
    }
}
