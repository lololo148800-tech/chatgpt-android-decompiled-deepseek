package p001A;

import java.util.LinkedHashSet;
import p523V9.AbstractC8072d6;
import p817j$.util.Objects;

/* JADX INFO: renamed from: A.N0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0027N0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f145Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0033Q0 f146Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0033Q0 f147o0;

    public /* synthetic */ RunnableC0027N0(C0033Q0 c0033q0, C0033Q0 c0033q1, int i10) {
        this.f145Y = i10;
        this.f146Z = c0033q0;
        this.f147o0 = c0033q1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f145Y) {
            case 0:
                C0033Q0 c0033q0 = this.f146Z;
                C0033Q0 c0033q1 = this.f147o0;
                C0017I0 c0017i0 = c0033q0.f162b;
                synchronized (c0017i0.f65Z) {
                    ((LinkedHashSet) c0017i0.f66o0).remove(c0033q0);
                    ((LinkedHashSet) c0017i0.f67p0).remove(c0033q0);
                    break;
                }
                c0033q0.mo166g(c0033q1);
                if (c0033q0.f167g != null) {
                    Objects.requireNonNull(c0033q0.f166f);
                    c0033q0.f166f.mo162c(c0033q1);
                    return;
                } else {
                    AbstractC8072d6.m8492i("SyncCaptureSessionBase", "[" + c0033q0 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                    return;
                }
            default:
                C0033Q0 c0033q2 = this.f146Z;
                Objects.requireNonNull(c0033q2.f166f);
                c0033q2.f166f.mo166g(this.f147o0);
                return;
        }
    }
}
