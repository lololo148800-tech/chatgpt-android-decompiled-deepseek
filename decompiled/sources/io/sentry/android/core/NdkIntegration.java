package io.sentry.android.core;

import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
public final class NdkIntegration implements InterfaceC15171W, Closeable {

    /* JADX INFO: renamed from: Y */
    public final Class f47356Y;

    /* JADX INFO: renamed from: Z */
    public SentryAndroidOptions f47357Z;

    public NdkIntegration(Class cls) {
        this.f47356Y = cls;
    }

    /* JADX INFO: renamed from: a */
    public static void m16401a(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47357Z = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        InterfaceC15127H logger = this.f47357Z.getLogger();
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        logger.mo16298o(enumC15375i1, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.f47356Y) == null) {
            m16401a(this.f47357Z);
            return;
        }
        if (this.f47357Z.getCacheDirPath() == null) {
            this.f47357Z.getLogger().mo16298o(EnumC15375i1.ERROR, "No cache dir path is defined in options.", new Object[0]);
            m16401a(this.f47357Z);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f47357Z);
            this.f47357Z.getLogger().mo16298o(enumC15375i1, "NdkIntegration installed.", new Object[0]);
            AbstractC8471E3.m9104b("Ndk");
        } catch (NoSuchMethodException e10) {
            m16401a(this.f47357Z);
            this.f47357Z.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to invoke the SentryNdk.init method.", e10);
        } catch (Throwable th2) {
            m16401a(this.f47357Z);
            this.f47357Z.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f47357Z;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f47356Y;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.f47357Z.getLogger().mo16298o(EnumC15375i1.DEBUG, "NdkIntegration removed.", new Object[0]);
                    } catch (NoSuchMethodException e10) {
                        this.f47357Z.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to invoke the SentryNdk.close method.", e10);
                    }
                } catch (Throwable th2) {
                    this.f47357Z.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to close SentryNdk.", th2);
                }
            }
        } finally {
            m16401a(this.f47357Z);
        }
    }
}
