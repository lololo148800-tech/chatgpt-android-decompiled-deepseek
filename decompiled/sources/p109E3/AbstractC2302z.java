package p109E3;

import android.media.AudioTrack;

/* JADX INFO: renamed from: E3.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2302z {
    /* JADX INFO: renamed from: a */
    public static void m3389a(AudioTrack audioTrack, C2287k c2287k) {
        audioTrack.setPreferredDevice(c2287k == null ? null : c2287k.f7072a);
    }
}
