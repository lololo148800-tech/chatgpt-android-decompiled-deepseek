package p028B;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import p167Gb.C3032c;
import p658b5.C11242m;
import p658b5.C11248s;
import p720e6.C13288c;

/* JADX INFO: renamed from: B.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0703j {

    /* JADX INFO: renamed from: b */
    public final C13288c f2044b;

    /* JADX INFO: renamed from: c */
    public final String f2045c;

    /* JADX INFO: renamed from: a */
    public final HashMap f2043a = new HashMap();

    /* JADX INFO: renamed from: d */
    public C11242m f2046d = null;

    public C0703j(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2044b = new C0702i(cameraCharacteristics);
        } else {
            this.f2044b = new C13288c(cameraCharacteristics);
        }
        this.f2045c = str;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1476a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.f2044b.f42001Y).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f2043a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.f2044b.f42001Y).get(key);
                if (obj2 != null) {
                    this.f2043a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C11242m m1477b() {
        if (this.f2046d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m1476a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                C11248s c11248s = new C11248s(this.f2045c);
                C11242m c11242m = new C11242m();
                c11242m.f34020o0 = new HashMap();
                new HashMap();
                new HashMap();
                c11242m.f34018Y = new C3032c(streamConfigurationMap, 3);
                c11242m.f34019Z = c11248s;
                this.f2046d = c11242m;
            } catch (AssertionError | NullPointerException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f2046d;
    }
}
