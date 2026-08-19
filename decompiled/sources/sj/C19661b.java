package sj;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19661b {

    /* JADX INFO: renamed from: a */
    public final SensorManager f62314a;

    /* JADX INFO: renamed from: b */
    public final Sensor f62315b;

    /* JADX INFO: renamed from: c */
    public long f62316c;

    /* JADX INFO: renamed from: d */
    public double f62317d;

    /* JADX INFO: renamed from: e */
    public boolean f62318e;

    /* JADX INFO: renamed from: f */
    public final C19660a f62319f;

    public C19661b(Context context) {
        AbstractC16544l.m18094g(context, "context");
        Object systemService = context.getSystemService("sensor");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.f62314a = sensorManager;
        this.f62315b = sensorManager.getDefaultSensor(4);
        this.f62319f = new C19660a(this);
    }
}
