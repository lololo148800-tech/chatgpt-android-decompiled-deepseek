package io.sentry.android.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.auth0.android.request.internal.RunnableC11843b;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8698q3;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneStateBreadcrumbsIntegration implements InterfaceC15171W, Closeable {

    /* JADX INFO: renamed from: Y */
    public final Context f47372Y;

    /* JADX INFO: renamed from: Z */
    public SentryAndroidOptions f47373Z;

    /* JADX INFO: renamed from: o0 */
    public C15200S f47374o0;

    /* JADX INFO: renamed from: p0 */
    public TelephonyManager f47375p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f47376q0 = false;

    /* JADX INFO: renamed from: r0 */
    public final Object f47377r0 = new Object();

    public PhoneStateBreadcrumbsIntegration(MainApplication mainApplication) {
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47372Y = applicationContext != null ? applicationContext : mainApplication;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47373Z = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f47373Z.isEnableSystemEventBreadcrumbs()));
        if (this.f47373Z.isEnableSystemEventBreadcrumbs() && AbstractC8698q3.m9399a(this.f47372Y, "android.permission.READ_PHONE_STATE")) {
            try {
                c15524y1.getExecutorService().submit(new RunnableC11843b(this, 12, c15524y1));
            } catch (Throwable th2) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.DEBUG, "Failed to start PhoneStateBreadcrumbsIntegration on executor thread.", th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16405a(C15524y1 c15524y1) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f47372Y.getSystemService("phone");
        this.f47375p0 = telephonyManager;
        if (telephonyManager == null) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "TelephonyManager is not available", new Object[0]);
            return;
        }
        try {
            C15200S c15200s = new C15200S();
            this.f47374o0 = c15200s;
            this.f47375p0.listen(c15200s, 32);
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
            AbstractC8471E3.m9104b("PhoneStateBreadcrumbs");
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16296g(EnumC15375i1.INFO, th2, "TelephonyManager is not available or ready to use.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C15200S c15200s;
        synchronized (this.f47377r0) {
            this.f47376q0 = true;
        }
        TelephonyManager telephonyManager = this.f47375p0;
        if (telephonyManager == null || (c15200s = this.f47374o0) == null) {
            return;
        }
        telephonyManager.listen(c15200s, 0);
        this.f47374o0 = null;
        SentryAndroidOptions sentryAndroidOptions = this.f47373Z;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }
}
