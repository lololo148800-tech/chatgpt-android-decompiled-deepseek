package io.sentry.android.core;

import android.content.Context;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15171W;
import io.sentry.transport.C15481d;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
public class AnrV2Integration implements InterfaceC15171W, Closeable {

    /* JADX INFO: renamed from: p0 */
    public static final long f47293p0 = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: Y */
    public final Context f47294Y;

    /* JADX INFO: renamed from: Z */
    public final C15481d f47295Z;

    /* JADX INFO: renamed from: o0 */
    public SentryAndroidOptions f47296o0;

    public AnrV2Integration(MainApplication mainApplication) {
        C15481d c15481d = C15481d.f48366a;
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47294Y = applicationContext != null ? applicationContext : mainApplication;
        this.f47295Z = c15481d;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47296o0 = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f47296o0.isAnrEnabled()));
        if (this.f47296o0.getCacheDirPath() == null) {
            this.f47296o0.getLogger().mo16298o(EnumC15375i1.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f47296o0.isAnrEnabled()) {
            try {
                c15524y1.getExecutorService().submit(new RunnableC15258v(this.f47294Y, this.f47296o0, this.f47295Z));
            } catch (Throwable th2) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.DEBUG, "Failed to start AnrProcessor.", th2);
            }
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "AnrV2Integration installed.", new Object[0]);
            AbstractC8471E3.m9104b("AnrV2");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f47296o0;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }
}
