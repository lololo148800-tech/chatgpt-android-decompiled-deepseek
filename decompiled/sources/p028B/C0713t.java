package p028B;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* JADX INFO: renamed from: B.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0713t extends C0712s {
    @Override // p813ij.C15026j
    /* JADX INFO: renamed from: h */
    public final Set mo1487h() throws C0694a {
        try {
            return ((CameraManager) this.f46724Y).getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw new C0694a(e10);
        }
    }
}
