package p329N3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: N3.r */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC5628r implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: q0 */
    public static final ChoreographerFrameCallbackC5628r f18264q0 = new ChoreographerFrameCallbackC5628r();

    /* JADX INFO: renamed from: Y */
    public volatile long f18265Y = -9223372036854775807L;

    /* JADX INFO: renamed from: Z */
    public final Handler f18266Z;

    /* JADX INFO: renamed from: o0 */
    public Choreographer f18267o0;

    /* JADX INFO: renamed from: p0 */
    public int f18268p0;

    public ChoreographerFrameCallbackC5628r() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = AbstractC20817s.f66106a;
        Handler handler = new Handler(looper, this);
        this.f18266Z = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f18265Y = j10;
        Choreographer choreographer = this.f18267o0;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                this.f18267o0 = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                AbstractC20800b.m21333u("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
            return true;
        }
        if (i10 == 2) {
            Choreographer choreographer = this.f18267o0;
            if (choreographer != null) {
                int i11 = this.f18268p0 + 1;
                this.f18268p0 = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f18267o0;
        if (choreographer2 != null) {
            int i12 = this.f18268p0 - 1;
            this.f18268p0 = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f18265Y = -9223372036854775807L;
            }
        }
        return true;
    }
}
