package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.auth0.android.request.internal.RunnableC11843b;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemEventsBreadcrumbsIntegration implements InterfaceC15171W, Closeable {

    /* JADX INFO: renamed from: Y */
    public final Context f47394Y;

    /* JADX INFO: renamed from: Z */
    public C15209a0 f47395Z;

    /* JADX INFO: renamed from: o0 */
    public SentryAndroidOptions f47396o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f47397p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f47398q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f47399r0;

    public SystemEventsBreadcrumbsIntegration(MainApplication mainApplication) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        arrayList.add("android.intent.action.ACTION_POWER_CONNECTED");
        arrayList.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_LOW");
        arrayList.add("android.intent.action.BATTERY_OKAY");
        arrayList.add("android.intent.action.BATTERY_CHANGED");
        arrayList.add("android.intent.action.BOOT_COMPLETED");
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add("android.intent.action.CONFIGURATION_CHANGED");
        arrayList.add("android.intent.action.CONTENT_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.REBOOT");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        arrayList.add("android.intent.action.APP_ERROR");
        arrayList.add("android.intent.action.BUG_REPORT");
        arrayList.add("android.intent.action.MEDIA_BAD_REMOVAL");
        arrayList.add("android.intent.action.MEDIA_MOUNTED");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        this.f47398q0 = false;
        this.f47399r0 = new Object();
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47394Y = applicationContext != null ? applicationContext : mainApplication;
        this.f47397p0 = arrayList;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47396o0 = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f47396o0.isEnableSystemEventBreadcrumbs()));
        if (this.f47396o0.isEnableSystemEventBreadcrumbs()) {
            try {
                c15524y1.getExecutorService().submit(new RunnableC11843b(this, 13, c15524y1));
            } catch (Throwable th2) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.DEBUG, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16411a(SentryAndroidOptions sentryAndroidOptions) {
        this.f47395Z = new C15209a0(sentryAndroidOptions);
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = this.f47397p0.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        try {
            Context context = this.f47394Y;
            C15209a0 c15209a0 = this.f47395Z;
            AbstractC8483G3.m9133c(sentryAndroidOptions.getLogger(), "The ILogger object is required.");
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(c15209a0, intentFilter, 2);
            } else {
                context.registerReceiver(c15209a0, intentFilter);
            }
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
            AbstractC8471E3.m9104b("SystemEventsBreadcrumbs");
        } catch (Throwable th2) {
            sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
            sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f47399r0) {
            this.f47398q0 = true;
        }
        C15209a0 c15209a0 = this.f47395Z;
        if (c15209a0 != null) {
            this.f47394Y.unregisterReceiver(c15209a0);
            this.f47395Z = null;
            SentryAndroidOptions sentryAndroidOptions = this.f47396o0;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }
}
