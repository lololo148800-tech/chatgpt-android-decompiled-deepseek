package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.auth0.android.request.internal.RunnableC11843b;
import com.openai.chatgpt.app.MainApplication;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C15109B;
import io.sentry.C15345d;
import io.sentry.C15516w;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
public final class TempSensorBreadcrumbsIntegration implements InterfaceC15171W, Closeable, SensorEventListener {

    /* JADX INFO: renamed from: Y */
    public final Context f47404Y;

    /* JADX INFO: renamed from: Z */
    public C15109B f47405Z;

    /* JADX INFO: renamed from: o0 */
    public SentryAndroidOptions f47406o0;

    /* JADX INFO: renamed from: p0 */
    public SensorManager f47407p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f47408q0 = false;

    /* JADX INFO: renamed from: r0 */
    public final Object f47409r0 = new Object();

    public TempSensorBreadcrumbsIntegration(MainApplication mainApplication) {
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47404Y = applicationContext != null ? applicationContext : mainApplication;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        this.f47405Z = C15109B.f47017a;
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47406o0 = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.f47406o0.isEnableSystemEventBreadcrumbs()));
        if (this.f47406o0.isEnableSystemEventBreadcrumbs()) {
            try {
                c15524y1.getExecutorService().submit(new RunnableC11843b(this, 14, c15524y1));
            } catch (Throwable th2) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.DEBUG, "Failed to start TempSensorBreadcrumbsIntegration on executor thread.", th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16412a(C15524y1 c15524y1) {
        try {
            SensorManager sensorManager = (SensorManager) this.f47404Y.getSystemService("sensor");
            this.f47407p0 = sensorManager;
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                if (defaultSensor != null) {
                    this.f47407p0.registerListener(this, defaultSensor, 3);
                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                    AbstractC8471E3.m9104b("TempSensorBreadcrumbs");
                } else {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                }
            } else {
                c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
            }
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f47409r0) {
            this.f47408q0 = true;
        }
        SensorManager sensorManager = this.f47407p0;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f47407p0 = null;
            SentryAndroidOptions sentryAndroidOptions = this.f47406o0;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0 || fArr[0] == 0.0f || this.f47405Z == null) {
            return;
        }
        C15345d c15345d = new C15345d();
        c15345d.f47907p0 = "system";
        c15345d.f47909r0 = "device.event";
        c15345d.m16574b("TYPE_AMBIENT_TEMPERATURE", "action");
        c15345d.m16574b(Integer.valueOf(sensorEvent.accuracy), "accuracy");
        c15345d.m16574b(Long.valueOf(sensorEvent.timestamp), DiagnosticsEntry.TIMESTAMP_KEY);
        c15345d.f47911t0 = EnumC15375i1.INFO;
        c15345d.m16574b(Float.valueOf(sensorEvent.values[0]), "degree");
        C15516w c15516w = new C15516w();
        c15516w.m16729c("android:sensorEvent", sensorEvent);
        this.f47405Z.mo16252u(c15345d, c15516w);
    }
}
