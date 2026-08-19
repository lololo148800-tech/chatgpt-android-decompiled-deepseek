package p001A;

import android.hardware.camera2.CameraCaptureSession;
import io.sentry.internal.debugmeta.C15384c;
import java.util.LinkedHashSet;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: A.O0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0029O0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f149Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0033Q0 f150Z;

    public /* synthetic */ RunnableC0029O0(C0033Q0 c0033q0, int i10) {
        this.f149Y = i10;
        this.f150Z = c0033q0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f149Y) {
            case 0:
                C0033Q0 c0033q0 = this.f150Z;
                c0033q0.mo166g(c0033q0);
                return;
            default:
                C0033Q0 c0033q1 = this.f150Z;
                c0033q1.m176l("Session call super.close()");
                AbstractC4941g.m5558Q(c0033q1.f167g, "Need to call openCaptureSession before using this API.");
                C0017I0 c0017i0 = c0033q1.f162b;
                synchronized (c0017i0.f65Z) {
                    ((LinkedHashSet) c0017i0.f67p0).add(c0033q1);
                    break;
                }
                ((CameraCaptureSession) ((C15384c) c0033q1.f167g.f32040Z).f47967Z).close();
                c0033q1.f164d.execute(new RunnableC0029O0(c0033q1, 0));
                return;
        }
    }
}
