package p001A;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import io.sentry.internal.debugmeta.C15384c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p178H.C3141e;
import p228J.C3793B;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p283L5.AbstractC4941g;
import p379Pb.LVf.efyhmdM;
import p523V9.AbstractC8072d6;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: A.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0016I extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a */
    public final ExecutorC4836i f58a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorServiceC4831d f59b;

    /* JADX INFO: renamed from: c */
    public RunnableC0014H f60c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f61d;

    /* JADX INFO: renamed from: e */
    public final C0012G f62e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0018J f63f;

    public C0016I(C0018J c0018j, ExecutorC4836i executorC4836i, ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831d, long j10) {
        this.f63f = c0018j;
        this.f58a = executorC4836i;
        this.f59b = scheduledExecutorServiceC4831d;
        this.f62e = new C0012G(this, j10);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52a() {
        if (this.f61d == null) {
            return false;
        }
        this.f63f.m126v("Cancelling scheduled re-open: " + this.f60c, null);
        this.f60c.f54Z = true;
        this.f60c = null;
        this.f61d.cancel(false);
        this.f61d = null;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m54c() {
        int i10;
        C0018J c0018j = this.f63f;
        return c0018j.f84O0 && ((i10 = c0018j.f100w0) == 1 || i10 == 2);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f63f.m126v("CameraDevice.onClosed()", null);
        AbstractC4941g.m5559R("Unexpected onClose callback on camera device: " + cameraDevice, this.f63f.f99v0 == null);
        int iM24h = AbstractC0010F.m24h(this.f63f.f89T0);
        if (iM24h == 1 || iM24h == 4) {
            AbstractC4941g.m5559R(null, this.f63f.f102y0.isEmpty());
            this.f63f.m124t();
        } else {
            if (iM24h != 5 && iM24h != 6) {
                throw new IllegalStateException("Camera closed while in state: ".concat(AbstractC0010F.m25i(this.f63f.f89T0)));
            }
            C0018J c0018j = this.f63f;
            int i10 = c0018j.f100w0;
            if (i10 == 0) {
                c0018j.m102L(false);
            } else {
                c0018j.m126v("Camera closed due to error: ".concat(C0018J.m88x(i10)), null);
                m53b();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f63f.m126v("CameraDevice.onDisconnected()", null);
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        C0018J c0018j = this.f63f;
        c0018j.f99v0 = cameraDevice;
        c0018j.f100w0 = i10;
        C15384c c15384c = c0018j.f88S0;
        ((C0018J) c15384c.f47968o0).m126v("Camera receive onErrorCallback", null);
        c15384c.m16637k();
        int iM24h = AbstractC0010F.m24h(this.f63f.f89T0);
        if (iM24h != 1) {
            switch (iM24h) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    String id2 = cameraDevice.getId();
                    String strM88x = C0018J.m88x(i10);
                    String strM23g = AbstractC0010F.m23g(this.f63f.f89T0);
                    StringBuilder sbM9896o = AbstractC9306j0.m9896o("CameraDevice.onError(): ", id2, " failed with ", strM88x, " while in ");
                    sbM9896o.append(strM23g);
                    sbM9896o.append(" state. Will attempt recovering from error.");
                    AbstractC8072d6.m8486c("Camera2CameraImpl", sbM9896o.toString());
                    AbstractC4941g.m5559R("Attempt to handle open error from non open state: ".concat(AbstractC0010F.m25i(this.f63f.f89T0)), this.f63f.f89T0 == 8 || this.f63f.f89T0 == 9 || this.f63f.f89T0 == 10 || this.f63f.f89T0 == 7 || this.f63f.f89T0 == 6);
                    int i11 = 3;
                    if (i10 != 1 && i10 != 2 && i10 != 4) {
                        AbstractC8072d6.m8487d("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C0018J.m88x(i10) + " closing camera.");
                        this.f63f.m98H(5, new C3141e(i10 == 3 ? 5 : 6, null), true);
                        this.f63f.m123s();
                        return;
                    }
                    AbstractC8072d6.m8486c("Camera2CameraImpl", AbstractC0010F.m20d("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", C0018J.m88x(i10), "]"));
                    C0018J c0018j2 = this.f63f;
                    AbstractC4941g.m5559R("Can only reopen camera device after error if the camera device is actually in an error state.", c0018j2.f100w0 != 0);
                    if (i10 == 1) {
                        i11 = 2;
                    } else if (i10 == 2) {
                        i11 = 1;
                    }
                    c0018j2.m98H(7, new C3141e(i11, null), true);
                    c0018j2.m123s();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(AbstractC0010F.m25i(this.f63f.f89T0)));
            }
        }
        String id3 = cameraDevice.getId();
        String strM88x2 = C0018J.m88x(i10);
        String strM23g2 = AbstractC0010F.m23g(this.f63f.f89T0);
        StringBuilder sbM9896o2 = AbstractC9306j0.m9896o("CameraDevice.onError(): ", id3, " failed with ", strM88x2, " while in ");
        sbM9896o2.append(strM23g2);
        sbM9896o2.append(" state. Will finish closing camera.");
        AbstractC8072d6.m8487d("Camera2CameraImpl", sbM9896o2.toString());
        this.f63f.m123s();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f63f.m126v("CameraDevice.onOpened()", null);
        C0018J c0018j = this.f63f;
        c0018j.f99v0 = cameraDevice;
        c0018j.f100w0 = 0;
        this.f62e.f50b = -1L;
        int iM24h = AbstractC0010F.m24h(c0018j.f89T0);
        if (iM24h == 1 || iM24h == 4) {
            AbstractC4941g.m5559R(null, this.f63f.f102y0.isEmpty());
            this.f63f.f99v0.close();
            this.f63f.f99v0 = null;
        } else {
            if (iM24h != 5 && iM24h != 6 && iM24h != 7) {
                throw new IllegalStateException("onOpened() should not be possible from state: ".concat(AbstractC0010F.m25i(this.f63f.f89T0)));
            }
            this.f63f.m97G(9);
            C3793B c3793b = this.f63f.f72C0;
            String id2 = cameraDevice.getId();
            C0018J c0018j2 = this.f63f;
            if (c3793b.m4465e(id2, c0018j2.f71B0.m3074i(c0018j2.f99v0.getId()))) {
                this.f63f.m94D();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m53b() {
        AbstractC4941g.m5559R(null, this.f60c == null);
        AbstractC4941g.m5559R(null, this.f61d == null);
        C0012G c0012g = this.f62e;
        c0012g.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (c0012g.f50b == -1) {
            c0012g.f50b = jUptimeMillis;
        }
        long j10 = jUptimeMillis - c0012g.f50b;
        long jM30b = c0012g.m30b();
        C0018J c0018j = this.f63f;
        if (j10 >= jM30b) {
            c0012g.f50b = -1L;
            AbstractC8072d6.m8487d("Camera2CameraImpl", "Camera reopening attempted for " + c0012g.m30b() + efyhmdM.UWFWsmMHwNtHhoE);
            c0018j.m98H(4, null, false);
            return;
        }
        this.f60c = new RunnableC0014H(this, this.f58a);
        c0018j.m126v("Attempting camera re-open in " + c0012g.m29a() + "ms: " + this.f60c + " activeResuming = " + c0018j.f84O0, null);
        this.f61d = this.f59b.schedule(this.f60c, (long) c0012g.m29a(), TimeUnit.MILLISECONDS);
    }
}
