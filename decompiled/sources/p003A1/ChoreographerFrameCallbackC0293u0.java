package p003A1;

import android.view.Choreographer;
import p025An.C0624m;
import p049Bm.InterfaceC1436k;
import p349O0.C5940A;
import p571X9.AbstractC9233X;

/* JADX INFO: renamed from: A1.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0293u0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1061Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0624m f1062Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f1063o0;

    public ChoreographerFrameCallbackC0293u0(C0624m c0624m, C0296v0 c0296v0, InterfaceC1436k interfaceC1436k) {
        this.f1062Z = c0624m;
        this.f1063o0 = interfaceC1436k;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        Object objM9806b;
        Object objM9806b2;
        C0624m c0624m = this.f1062Z;
        InterfaceC1436k interfaceC1436k = this.f1063o0;
        switch (this.f1061Y) {
            case 0:
                try {
                    objM9806b = interfaceC1436k.invoke(Long.valueOf(j10));
                } catch (Throwable th2) {
                    objM9806b = AbstractC9233X.m9806b(th2);
                }
                c0624m.resumeWith(objM9806b);
                break;
            default:
                C5940A c5940a = C5940A.f19324Y;
                try {
                    objM9806b2 = interfaceC1436k.invoke(Long.valueOf(j10));
                } catch (Throwable th3) {
                    objM9806b2 = AbstractC9233X.m9806b(th3);
                }
                c0624m.resumeWith(objM9806b2);
                break;
        }
    }

    public ChoreographerFrameCallbackC0293u0(C0624m c0624m, InterfaceC1436k interfaceC1436k) {
        this.f1062Z = c0624m;
        this.f1063o0 = interfaceC1436k;
    }
}
