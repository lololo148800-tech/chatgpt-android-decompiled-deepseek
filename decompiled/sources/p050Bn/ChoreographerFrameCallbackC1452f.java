package p050Bn;

import android.view.Choreographer;
import p025An.AbstractC0593T;
import p025An.C0624m;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;

/* JADX INFO: renamed from: Bn.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC1452f implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3820Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Runnable f3821Z;

    public /* synthetic */ ChoreographerFrameCallbackC1452f(Runnable runnable, int i10) {
        this.f3820Y = i10;
        this.f3821Z = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        Runnable runnable = this.f3821Z;
        switch (this.f3820Y) {
            case 0:
                C3516e c3516e = AbstractC0593T.f1824a;
                ((C0624m) runnable).m1253D(AbstractC2935m.f8797a, Long.valueOf(j10));
                break;
            default:
                runnable.run();
                break;
        }
    }
}
