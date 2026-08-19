package p001A;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p277L.ExecutorC4836i;

/* JADX INFO: renamed from: A.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0073l0 extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f311a;

    /* JADX INFO: renamed from: b */
    public final Object f312b;

    public C0073l0(C0017I0 c0017i0) {
        this.f311a = 1;
        this.f312b = c0017i0;
    }

    /* JADX INFO: renamed from: a */
    public void m261a() {
        ArrayList<C0033Q0> arrayListM82t;
        synchronized (((C0017I0) this.f312b).f65Z) {
            arrayListM82t = ((C0017I0) this.f312b).m82t();
            ((LinkedHashSet) ((C0017I0) this.f312b).f68q0).clear();
            ((LinkedHashSet) ((C0017I0) this.f312b).f66o0).clear();
            ((LinkedHashSet) ((C0017I0) this.f312b).f67p0).clear();
        }
        for (C0033Q0 c0033q0 : arrayListM82t) {
            c0033q0.m181q();
            c0033q0.f181u.m360D();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m262b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((C0017I0) this.f312b).f65Z) {
            linkedHashSet.addAll((LinkedHashSet) ((C0017I0) this.f312b).f68q0);
            linkedHashSet.addAll((LinkedHashSet) ((C0017I0) this.f312b).f66o0);
        }
        ((ExecutorC4836i) ((C0017I0) this.f312b).f64Y).execute(new RunnableC0000A(linkedHashSet, 6));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f311a) {
            case 0:
                Iterator it = ((ArrayList) this.f312b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
            default:
                m262b();
                m261a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f311a) {
            case 0:
                Iterator it = ((ArrayList) this.f312b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
            default:
                m262b();
                m261a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.f311a) {
            case 0:
                Iterator it = ((ArrayList) this.f312b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i10);
                }
                return;
            default:
                m262b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((C0017I0) this.f312b).f65Z) {
                    linkedHashSet.addAll((LinkedHashSet) ((C0017I0) this.f312b).f68q0);
                    linkedHashSet.addAll((LinkedHashSet) ((C0017I0) this.f312b).f66o0);
                    break;
                }
                ((ExecutorC4836i) ((C0017I0) this.f312b).f64Y).execute(new RunnableC0080p(linkedHashSet, i10, 1));
                m261a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.f311a) {
            case 0:
                Iterator it = ((ArrayList) this.f312b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    public C0073l0(ArrayList arrayList) {
        this.f311a = 0;
        this.f312b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof C0075m0)) {
                ((ArrayList) this.f312b).add(stateCallback);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m260c(CameraDevice cameraDevice) {
    }
}
