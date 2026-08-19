package p109E3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import p105E.C2224c;

/* JADX INFO: renamed from: E3.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2299w {
    /* JADX INFO: renamed from: a */
    public static C2288l m3387a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z6) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return C2288l.f7073d;
        }
        C2224c c2224c = new C2224c();
        c2224c.f6808a = true;
        c2224c.f6810c = z6;
        return c2224c.m3264a();
    }
}
