package sj;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: renamed from: sj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19660a implements SensorEventListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19661b f62313Y;

    public C19660a(C19661b c19661b) {
        this.f62313Y = c19661b;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent != null ? sensorEvent.values : null;
        if (fArr != null && fArr.length >= 3) {
            float f10 = fArr[0];
            double dAbs = ((double) (Math.abs(fArr[2]) + (Math.abs(fArr[1]) + Math.abs(f10)))) / 3.0d;
            C19661b c19661b = this.f62313Y;
            double d10 = c19661b.f62317d;
            long j10 = c19661b.f62316c;
            c19661b.f62317d = ((d10 * j10) + dAbs) / (j10 + 1);
            c19661b.f62316c = j10 + 1;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
