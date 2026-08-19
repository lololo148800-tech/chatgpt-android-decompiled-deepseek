package p028B;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import p001A.C0006D;
import p277L.ExecutorC4836i;
import p813ij.C15026j;

/* JADX INFO: renamed from: B.r */
/* JADX INFO: loaded from: classes.dex */
public class C0711r extends C15026j {
    /* JADX INFO: renamed from: z */
    public static boolean m1482z(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            return (!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName());
        }
        return false;
    }

    @Override // p813ij.C15026j
    /* JADX INFO: renamed from: g */
    public CameraCharacteristics mo1483g(String str) throws C0694a {
        try {
            return super.mo1483g(str);
        } catch (RuntimeException e10) {
            if (m1482z(e10)) {
                throw new C0694a(e10);
            }
            throw e10;
        }
    }

    @Override // p813ij.C15026j
    /* JADX INFO: renamed from: l */
    public void mo1484l(String str, ExecutorC4836i executorC4836i, CameraDevice.StateCallback stateCallback) throws C0694a {
        try {
            ((CameraManager) this.f46724Y).openCamera(str, executorC4836i, stateCallback);
        } catch (CameraAccessException e10) {
            throw new C0694a(e10);
        } catch (IllegalArgumentException e11) {
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (!m1482z(e13)) {
                throw e13;
            }
            throw new C0694a(e13);
        }
    }

    @Override // p813ij.C15026j
    /* JADX INFO: renamed from: q */
    public final void mo1485q(ExecutorC4836i executorC4836i, C0006D c0006d) {
        ((CameraManager) this.f46724Y).registerAvailabilityCallback(executorC4836i, c0006d);
    }

    @Override // p813ij.C15026j
    /* JADX INFO: renamed from: r */
    public final void mo1486r(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f46724Y).unregisterAvailabilityCallback(availabilityCallback);
    }
}
