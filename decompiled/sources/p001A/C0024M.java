package p001A;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p007A5.C0376k;
import p140Fa.C2685e;
import p228J.AbstractC3842j;
import p228J.C3799E;
import p228J.C3865u0;
import p228J.C3875z0;
import p283L5.AbstractC4941g;
import p523V9.AbstractC8072d6;
import p658b5.C11241l;

/* JADX INFO: renamed from: A.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0024M extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143a;

    /* JADX INFO: renamed from: b */
    public final Object f144b;

    public C0024M(AbstractC3842j abstractC3842j) {
        this.f143a = 1;
        if (abstractC3842j == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f144b = abstractC3842j;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        switch (this.f143a) {
            case 0:
                Iterator it = ((ArrayList) this.f144b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
                }
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C3875z0 c3875z0;
        switch (this.f143a) {
            case 0:
                Iterator it = ((ArrayList) this.f144b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case 1:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                Object tag = captureRequest.getTag();
                if (tag != null) {
                    AbstractC4941g.m5554M("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof C3875z0);
                    c3875z0 = (C3875z0) tag;
                } else {
                    c3875z0 = C3875z0.f11717b;
                }
                ((AbstractC3842j) this.f144b).mo8b(m159a(captureRequest), new C11241l(c3875z0, totalCaptureResult));
                return;
            default:
                synchronized (((C0087s0) this.f144b).f339a) {
                    try {
                        C3865u0 c3865u0 = ((C0087s0) this.f144b).f344f;
                        if (c3865u0 == null) {
                            return;
                        }
                        C3799E c3799e = c3865u0.f11683g;
                        AbstractC8072d6.m8486c("CaptureSession", "Submit FLASH_MODE_OFF request");
                        C0087s0 c0087s0 = (C0087s0) this.f144b;
                        c0087s0.f352n.getClass();
                        c0087s0.m287k(Collections.singletonList(C0376k.m1010e(c3799e)));
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f143a) {
            case 0:
                Iterator it = ((ArrayList) this.f144b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 1:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((AbstractC3842j) this.f144b).mo9c(m159a(captureRequest), new C2685e());
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f143a) {
            case 0:
                Iterator it = ((ArrayList) this.f144b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        switch (this.f143a) {
            case 0:
                Iterator it = ((ArrayList) this.f144b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i10);
                }
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i10);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        switch (this.f143a) {
            case 0:
                Iterator it = ((ArrayList) this.f144b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                }
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        switch (this.f143a) {
            case 0:
                Iterator it = ((ArrayList) this.f144b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                }
                break;
            case 1:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                ((AbstractC3842j) this.f144b).mo3972d(m159a(captureRequest));
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m159a(CaptureRequest captureRequest) {
        Integer num;
        if (!(captureRequest.getTag() instanceof C3875z0) || (num = (Integer) ((C3875z0) captureRequest.getTag()).f11718a.get(lZYtIbClQJm.FRTuZfXVSqMOLw)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public C0024M(List list) {
        this.f143a = 0;
        this.f144b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof C0026N)) {
                ((ArrayList) this.f144b).add(captureCallback);
            }
        }
    }

    public C0024M(C0087s0 c0087s0) {
        this.f143a = 2;
        this.f144b = c0087s0;
    }
}
