package p028B;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import p277L.ExecutorC4836i;

/* JADX INFO: renamed from: B.s */
/* JADX INFO: loaded from: classes.dex */
public class C0712s extends C0711r {
    @Override // p028B.C0711r, p813ij.C15026j
    /* JADX INFO: renamed from: g */
    public final CameraCharacteristics mo1483g(String str) throws C0694a {
        try {
            return ((CameraManager) this.f46724Y).getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw new C0694a(e10);
        }
    }

    @Override // p028B.C0711r, p813ij.C15026j
    /* JADX INFO: renamed from: l */
    public final void mo1484l(String str, ExecutorC4836i executorC4836i, CameraDevice.StateCallback stateCallback) throws C0694a {
        try {
            ((CameraManager) this.f46724Y).openCamera(str, executorC4836i, stateCallback);
        } catch (CameraAccessException e10) {
            throw new C0694a(e10);
        }
    }
}
