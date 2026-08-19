package io.sentry.android.ndk;

import io.sentry.AbstractC15140L0;
import io.sentry.C15345d;
import io.sentry.EnumC15375i1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.C15425E;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.android.ndk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15266d extends AbstractC15140L0 {

    /* JADX INFO: renamed from: a */
    public final SentryAndroidOptions f47653a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC15263a f47654b;

    public C15266d(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        AbstractC8483G3.m9133c(sentryAndroidOptions, "The SentryOptions object is required.");
        this.f47653a = sentryAndroidOptions;
        this.f47654b = nativeScope;
    }

    @Override // io.sentry.AbstractC15140L0, io.sentry.InterfaceC15145N
    /* JADX INFO: renamed from: a */
    public final void mo16310a(final String str, final String str2) {
        SentryAndroidOptions sentryAndroidOptions = this.f47653a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    ((NativeScope) this.f47650Y.f47654b).getClass();
                    NativeScope.nativeSetTag(str, str2);
                }
            });
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.InterfaceC15145N
    /* JADX INFO: renamed from: k */
    public final void mo16320k(C15425E c15425e) {
        SentryAndroidOptions sentryAndroidOptions = this.f47653a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC15264b(this, c15425e, 0));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.AbstractC15140L0, io.sentry.InterfaceC15145N
    /* JADX INFO: renamed from: l */
    public final void mo16317l(C15345d c15345d) {
        SentryAndroidOptions sentryAndroidOptions = this.f47653a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC15264b(this, c15345d, 1));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }
}
