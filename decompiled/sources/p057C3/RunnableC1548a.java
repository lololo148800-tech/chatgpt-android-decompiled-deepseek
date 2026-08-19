package p057C3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.pairip.VMRunner;
import p001A.C0093v0;

/* JADX INFO: renamed from: C3.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1548a extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final SurfaceHolderCallbackC1523A f4270Y;

    /* JADX INFO: renamed from: Z */
    public final Handler f4271Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0093v0 f4272o0;

    public RunnableC1548a(C0093v0 c0093v0, Handler handler, SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A) {
        this.f4272o0 = c0093v0;
        this.f4271Z = handler;
        this.f4270Y = surfaceHolderCallbackC1523A;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("Y5OhbPMvlE4FMgdv", new Object[]{this, context, intent});
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4272o0.f403Z) {
            this.f4270Y.f4046Y.m2253n0(-1, 3, false);
        }
    }
}
