package p028B;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import p277L.ExecutorC4836i;

/* JADX INFO: renamed from: B.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0701h extends C15384c {
    @Override // io.sentry.internal.debugmeta.C15384c
    /* JADX INFO: renamed from: l */
    public final int mo1474l(ArrayList arrayList, ExecutorC4836i executorC4836i, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f47967Z).captureBurstRequests(arrayList, executorC4836i, captureCallback);
    }

    @Override // io.sentry.internal.debugmeta.C15384c
    /* JADX INFO: renamed from: w */
    public final int mo1475w(CaptureRequest captureRequest, ExecutorC4836i executorC4836i, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f47967Z).setSingleRepeatingRequest(captureRequest, executorC4836i, captureCallback);
    }
}
