package p109E3;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: E3.E */
/* JADX INFO: loaded from: classes.dex */
public final class C2264E {

    /* JADX INFO: renamed from: a */
    public final AudioTrack f6929a;

    /* JADX INFO: renamed from: b */
    public final C2286j f6930b;

    /* JADX INFO: renamed from: c */
    public C2263D f6931c = new AudioRouting.OnRoutingChangedListener() { // from class: E3.D
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            this.f6928a.m3305b(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [E3.D] */
    public C2264E(AudioTrack audioTrack, C2286j c2286j) {
        this.f6929a = audioTrack;
        this.f6930b = c2286j;
        audioTrack.addOnRoutingChangedListener(this.f6931c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3305b(AudioRouting audioRouting) {
        if (this.f6931c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.f6930b.m3380b(audioRouting.getRoutedDevice());
    }

    /* JADX INFO: renamed from: c */
    public void m3306c() {
        C2263D c2263d = this.f6931c;
        c2263d.getClass();
        this.f6929a.removeOnRoutingChangedListener(c2263d);
        this.f6931c = null;
    }
}
