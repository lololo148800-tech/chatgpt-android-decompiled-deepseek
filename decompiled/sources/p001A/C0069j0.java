package p001A;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p283L5.AbstractC4941g;
import p610Z1.C10142i;

/* JADX INFO: renamed from: A.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0069j0 extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f303a;

    /* JADX INFO: renamed from: b */
    public final Object f304b;

    public /* synthetic */ C0069j0(Object obj, int i10) {
        this.f303a = i10;
        this.f304b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f303a) {
            case 0:
                Iterator it = ((ArrayList) this.f304b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                C0033Q0 c0033q0 = (C0033Q0) this.f304b;
                c0033q0.m175k(cameraCaptureSession);
                c0033q0.mo160a(c0033q0);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f303a) {
            case 0:
                Iterator it = ((ArrayList) this.f304b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                break;
            case 1:
                C0033Q0 c0033q0 = (C0033Q0) this.f304b;
                c0033q0.m175k(cameraCaptureSession);
                c0033q0.mo161b(c0033q0);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f303a) {
            case 0:
                Iterator it = ((ArrayList) this.f304b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                C0033Q0 c0033q0 = (C0033Q0) this.f304b;
                c0033q0.m175k(cameraCaptureSession);
                c0033q0.mo162c(c0033q0);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C10142i c10142i;
        switch (this.f303a) {
            case 0:
                Iterator it = ((ArrayList) this.f304b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((C0033Q0) this.f304b).m175k(cameraCaptureSession);
                    C0033Q0 c0033q0 = (C0033Q0) this.f304b;
                    c0033q0.mo163d(c0033q0);
                    synchronized (((C0033Q0) this.f304b).f161a) {
                        AbstractC4941g.m5558Q(((C0033Q0) this.f304b).f169i, "OpenCaptureSession completer should not null");
                        C0033Q0 c0033q1 = (C0033Q0) this.f304b;
                        c10142i = c0033q1.f169i;
                        c0033q1.f169i = null;
                        break;
                    }
                    return;
                } finally {
                    synchronized (((C0033Q0) this.f304b).f161a) {
                        AbstractC4941g.m5558Q(((C0033Q0) this.f304b).f169i, "OpenCaptureSession completer should not null");
                        C0033Q0 c0033q2 = (C0033Q0) this.f304b;
                        c10142i = c0033q2.f169i;
                        c0033q2.f169i = null;
                        c10142i.m10748b(new IllegalStateException("onConfigureFailed"));
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C10142i c10142i;
        switch (this.f303a) {
            case 0:
                Iterator it = ((ArrayList) this.f304b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((C0033Q0) this.f304b).m175k(cameraCaptureSession);
                    C0033Q0 c0033q0 = (C0033Q0) this.f304b;
                    c0033q0.mo164e(c0033q0);
                    synchronized (((C0033Q0) this.f304b).f161a) {
                        AbstractC4941g.m5558Q(((C0033Q0) this.f304b).f169i, "OpenCaptureSession completer should not null");
                        C0033Q0 c0033q1 = (C0033Q0) this.f304b;
                        c10142i = c0033q1.f169i;
                        c0033q1.f169i = null;
                        break;
                    }
                    return;
                } finally {
                    synchronized (((C0033Q0) this.f304b).f161a) {
                        AbstractC4941g.m5558Q(((C0033Q0) this.f304b).f169i, "OpenCaptureSession completer should not null");
                        C0033Q0 c0033q2 = (C0033Q0) this.f304b;
                        c10142i = c0033q2.f169i;
                        c0033q2.f169i = null;
                        c10142i.m10747a(null);
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((C0048Y0) this.f304b).f239j = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.f303a) {
            case 0:
                Iterator it = ((ArrayList) this.f304b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                C0033Q0 c0033q0 = (C0033Q0) this.f304b;
                c0033q0.m175k(cameraCaptureSession);
                c0033q0.mo165f(c0033q0);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f303a) {
            case 0:
                Iterator it = ((ArrayList) this.f304b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                C0033Q0 c0033q0 = (C0033Q0) this.f304b;
                c0033q0.m175k(cameraCaptureSession);
                c0033q0.mo167h(c0033q0, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public C0069j0(List list) {
        this.f303a = 0;
        this.f304b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof C0071k0)) {
                ((ArrayList) this.f304b).add(stateCallback);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m252a(CameraCaptureSession cameraCaptureSession) {
    }
}
