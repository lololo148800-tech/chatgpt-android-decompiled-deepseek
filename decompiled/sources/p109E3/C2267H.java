package p109E3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import p817j$.util.Objects;

/* JADX INFO: renamed from: E3.H */
/* JADX INFO: loaded from: classes.dex */
public final class C2267H {

    /* JADX INFO: renamed from: a */
    public final Handler f6935a = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: b */
    public final C2266G f6936b = new C2266G(this);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2268I f6937c;

    public C2267H(C2268I c2268i) {
        this.f6937c = c2268i;
    }

    /* JADX INFO: renamed from: a */
    public void m3307a(AudioTrack audioTrack) {
        Handler handler = this.f6935a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new ExecutorC2265F(handler, 0), this.f6936b);
    }

    /* JADX INFO: renamed from: b */
    public void m3308b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f6936b);
        this.f6935a.removeCallbacksAndMessages(null);
    }
}
