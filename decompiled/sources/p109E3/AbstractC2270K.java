package p109E3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* JADX INFO: renamed from: E3.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2270K {
    /* JADX INFO: renamed from: a */
    public static void m3331a(InterfaceC2294r interfaceC2294r, Object obj) {
        C2287k c2287k;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        C2268I c2268i = (C2268I) interfaceC2294r;
        if (audioDeviceInfo == null) {
            c2287k = null;
        } else {
            c2268i.getClass();
            c2287k = new C2287k(audioDeviceInfo);
        }
        c2268i.f6972c0 = c2287k;
        C2286j c2286j = c2268i.f7003y;
        if (c2286j != null) {
            c2286j.m3380b(audioDeviceInfo);
        }
        AudioTrack audioTrack = c2268i.f7001w;
        if (audioTrack != null) {
            AbstractC2302z.m3389a(audioTrack, c2268i.f6972c0);
        }
    }
}
