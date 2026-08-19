package p151Fl;

import android.media.AudioTrack;
import java.io.Closeable;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import p002A0.C0130g;
import p101Dl.C2117r;
import p583Xl.AbstractC9537d;

/* JADX INFO: renamed from: Fl.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2895a implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8702Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f8703Z;

    public /* synthetic */ C2895a(Object obj, int i10) {
        this.f8702Y = i10;
        this.f8703Z = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f8702Y) {
            case 0:
                C2117r c2117r = (C2117r) this.f8703Z;
                c2117r.f6475a.close();
                c2117r.stop();
                AudioTrack audioTrack = c2117r.f6478d;
                if (audioTrack != null) {
                    synchronized (audioTrack) {
                        audioTrack.release();
                    }
                    return;
                }
                return;
            case 1:
                ((JavaAudioDeviceModule) this.f8703Z).release();
                return;
            case 2:
                ((EglBase) this.f8703Z).release();
                return;
            default:
                AbstractC9537d.m10031b(new C0130g((PeerConnectionFactory) this.f8703Z, 24));
                return;
        }
    }
}
