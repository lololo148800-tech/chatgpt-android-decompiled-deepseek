package p028B;

import android.hardware.camera2.CameraManager;
import p001A.C0006D;
import p001A.RunnableC0000A;
import p277L.ExecutorC4836i;

/* JADX INFO: renamed from: B.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0709p extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a */
    public final ExecutorC4836i f2054a;

    /* JADX INFO: renamed from: b */
    public final C0006D f2055b;

    /* JADX INFO: renamed from: c */
    public final Object f2056c = new Object();

    /* JADX INFO: renamed from: d */
    public boolean f2057d = false;

    public C0709p(ExecutorC4836i executorC4836i, C0006D c0006d) {
        this.f2054a = executorC4836i;
        this.f2055b = c0006d;
    }

    /* JADX INFO: renamed from: a */
    public final void m1479a() {
        synchronized (this.f2056c) {
            this.f2057d = true;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f2056c) {
            try {
                if (!this.f2057d) {
                    this.f2054a.execute(new RunnableC0000A(this, 9));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.f2056c) {
            try {
                if (!this.f2057d) {
                    this.f2054a.execute(new RunnableC0708o(this, str, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.f2056c) {
            try {
                if (!this.f2057d) {
                    this.f2054a.execute(new RunnableC0708o(this, str, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
