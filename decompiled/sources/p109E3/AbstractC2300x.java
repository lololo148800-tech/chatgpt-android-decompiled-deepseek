package p109E3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import p105E.C2224c;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: E3.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2300x {
    /* JADX INFO: renamed from: a */
    public static C2288l m3388a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z6) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C2288l.f7073d;
        }
        C2224c c2224c = new C2224c();
        boolean z10 = AbstractC20817s.f66106a > 32 && playbackOffloadSupport == 2;
        c2224c.f6808a = true;
        c2224c.f6809b = z10;
        c2224c.f6810c = z6;
        return c2224c.m3264a();
    }
}
