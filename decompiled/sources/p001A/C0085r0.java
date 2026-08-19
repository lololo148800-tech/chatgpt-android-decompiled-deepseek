package p001A;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8577W2;

/* JADX INFO: renamed from: A.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0085r0 extends AbstractC0025M0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f337a;

    /* JADX INFO: renamed from: b */
    public final Object f338b;

    public C0085r0(int i10, List list) {
        this.f337a = i10;
        switch (i10) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.f338b = arrayList;
                arrayList.addAll(list);
                break;
            default:
                this.f338b = list.isEmpty() ? new C0071k0() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new C0069j0(list);
                break;
        }
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: a */
    public void mo160a(C0033Q0 c0033q0) {
        switch (this.f337a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f338b).onActive((CameraCaptureSession) ((C15384c) c0033q0.m187w().f32040Z).f47967Z);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f338b).iterator();
                while (it.hasNext()) {
                    ((AbstractC0025M0) it.next()).mo160a(c0033q0);
                }
                break;
        }
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: b */
    public void mo161b(C0033Q0 c0033q0) {
        switch (this.f337a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f338b).onCaptureQueueEmpty((CameraCaptureSession) ((C15384c) c0033q0.m187w().f32040Z).f47967Z);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f338b).iterator();
                while (it.hasNext()) {
                    ((AbstractC0025M0) it.next()).mo161b(c0033q0);
                }
                break;
        }
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: c */
    public void mo162c(C0033Q0 c0033q0) {
        switch (this.f337a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f338b).onClosed((CameraCaptureSession) ((C15384c) c0033q0.m187w().f32040Z).f47967Z);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f338b).iterator();
                while (it.hasNext()) {
                    ((AbstractC0025M0) it.next()).mo162c(c0033q0);
                }
                break;
        }
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: d */
    public final void mo163d(C0033Q0 c0033q0) {
        switch (this.f337a) {
            case 0:
                synchronized (((C0087s0) this.f338b).f339a) {
                    try {
                        switch (AbstractC0010F.m24h(((C0087s0) this.f338b).f347i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(AbstractC0010F.m26j(((C0087s0) this.f338b).f347i)));
                            case 3:
                            case 5:
                            case 6:
                                ((C0087s0) this.f338b).m282d();
                                break;
                            case 7:
                                AbstractC8072d6.m8486c("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                                break;
                        }
                        AbstractC8072d6.m8487d("CaptureSession", "CameraCaptureSession.onConfigureFailed() ".concat(AbstractC0010F.m26j(((C0087s0) this.f338b).f347i)));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f338b).onConfigureFailed((CameraCaptureSession) ((C15384c) c0033q0.m187w().f32040Z).f47967Z);
                return;
            default:
                Iterator it = ((ArrayList) this.f338b).iterator();
                while (it.hasNext()) {
                    ((AbstractC0025M0) it.next()).mo163d(c0033q0);
                }
                return;
        }
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: e */
    public final void mo164e(C0033Q0 c0033q0) {
        switch (this.f337a) {
            case 0:
                synchronized (((C0087s0) this.f338b).f339a) {
                    try {
                        switch (AbstractC0010F.m24h(((C0087s0) this.f338b).f347i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(AbstractC0010F.m26j(((C0087s0) this.f338b).f347i)));
                            case 3:
                                C0087s0 c0087s0 = (C0087s0) this.f338b;
                                c0087s0.f347i = 5;
                                c0087s0.f343e = c0033q0;
                                AbstractC8072d6.m8486c("CaptureSession", "Attempting to send capture request onConfigured");
                                C0087s0 c0087s1 = (C0087s0) this.f338b;
                                c0087s1.m288l(c0087s1.f344f);
                                C0087s0 c0087s2 = (C0087s0) this.f338b;
                                c0087s2.f353o.m371h().mo5766a(new RunnableC0000A(c0087s2, 5), AbstractC8577W2.m9240b());
                                break;
                            case 5:
                                ((C0087s0) this.f338b).f343e = c0033q0;
                                break;
                            case 6:
                                c0033q0.m174j();
                                break;
                        }
                        AbstractC8072d6.m8486c("CaptureSession", "CameraCaptureSession.onConfigured() mState=".concat(AbstractC0010F.m26j(((C0087s0) this.f338b).f347i)));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f338b).onConfigured((CameraCaptureSession) ((C15384c) c0033q0.m187w().f32040Z).f47967Z);
                return;
            default:
                Iterator it = ((ArrayList) this.f338b).iterator();
                while (it.hasNext()) {
                    ((AbstractC0025M0) it.next()).mo164e(c0033q0);
                }
                return;
        }
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: f */
    public final void mo165f(C0033Q0 c0033q0) {
        switch (this.f337a) {
            case 0:
                synchronized (((C0087s0) this.f338b).f339a) {
                    try {
                        if (AbstractC0010F.m24h(((C0087s0) this.f338b).f347i) == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(AbstractC0010F.m26j(((C0087s0) this.f338b).f347i)));
                        }
                        AbstractC8072d6.m8486c("CaptureSession", "CameraCaptureSession.onReady() ".concat(AbstractC0010F.m26j(((C0087s0) this.f338b).f347i)));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f338b).onReady((CameraCaptureSession) ((C15384c) c0033q0.m187w().f32040Z).f47967Z);
                return;
            default:
                Iterator it = ((ArrayList) this.f338b).iterator();
                while (it.hasNext()) {
                    ((AbstractC0025M0) it.next()).mo165f(c0033q0);
                }
                return;
        }
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: g */
    public final void mo166g(C0033Q0 c0033q0) {
        switch (this.f337a) {
            case 0:
                synchronized (((C0087s0) this.f338b).f339a) {
                    try {
                        if (((C0087s0) this.f338b).f347i == 1) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(AbstractC0010F.m26j(((C0087s0) this.f338b).f347i)));
                        }
                        AbstractC8072d6.m8486c("CaptureSession", "onSessionFinished()");
                        ((C0087s0) this.f338b).m282d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.f338b).iterator();
                while (it.hasNext()) {
                    ((AbstractC0025M0) it.next()).mo166g(c0033q0);
                }
                return;
        }
    }

    @Override // p001A.AbstractC0025M0
    /* JADX INFO: renamed from: h */
    public void mo167h(C0033Q0 c0033q0, Surface surface) {
        switch (this.f337a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f338b).onSurfacePrepared((CameraCaptureSession) ((C15384c) c0033q0.m187w().f32040Z).f47967Z, surface);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f338b).iterator();
                while (it.hasNext()) {
                    ((AbstractC0025M0) it.next()).mo167h(c0033q0, surface);
                }
                break;
        }
    }

    public C0085r0(C0087s0 c0087s0) {
        this.f337a = 0;
        this.f338b = c0087s0;
    }

    /* JADX INFO: renamed from: i */
    private final void m276i(C0033Q0 c0033q0) {
    }
}
