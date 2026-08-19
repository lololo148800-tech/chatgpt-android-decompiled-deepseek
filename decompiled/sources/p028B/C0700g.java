package p028B;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.RunnableC0066i;
import p571X9.AbstractC9233X;
import p972qm.C18778k;

/* JADX INFO: renamed from: B.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0700g extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2040a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f2041b;

    /* JADX INFO: renamed from: c */
    public final Object f2042c;

    public C0700g(C18778k c18778k, CameraDevice cameraDevice) {
        this.f2041b = c18778k;
        this.f2042c = cameraDevice;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f2040a) {
            case 0:
                ((Executor) this.f2042c).execute(new RunnableC0699f(this, cameraCaptureSession, 0));
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f2040a) {
            case 0:
                ((Executor) this.f2042c).execute(new RunnableC0699f(this, cameraCaptureSession, 2));
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f2040a) {
            case 0:
                ((Executor) this.f2042c).execute(new RunnableC0699f(this, cameraCaptureSession, 1));
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession session) {
        switch (this.f2040a) {
            case 0:
                ((Executor) this.f2042c).execute(new RunnableC0699f(this, session, 5));
                break;
            default:
                AbstractC16544l.m18094g(session, "session");
                ((C18778k) this.f2041b).resumeWith(AbstractC9233X.m9806b(new RuntimeException(AbstractC10763a.m11054l("Camera ", ((CameraDevice) this.f2042c).getId(), " session configuration failed"))));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession session) {
        switch (this.f2040a) {
            case 0:
                ((Executor) this.f2042c).execute(new RunnableC0699f(this, session, 3));
                break;
            default:
                AbstractC16544l.m18094g(session, "session");
                ((C18778k) this.f2041b).resumeWith(session);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession session) {
        switch (this.f2040a) {
            case 0:
                ((Executor) this.f2042c).execute(new RunnableC0699f(this, session, 4));
                break;
            default:
                AbstractC16544l.m18094g(session, "session");
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f2040a) {
            case 0:
                ((Executor) this.f2042c).execute(new RunnableC0066i(this, cameraCaptureSession, surface, 4));
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public C0700g(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f2042c = executor;
        this.f2041b = stateCallback;
    }
}
