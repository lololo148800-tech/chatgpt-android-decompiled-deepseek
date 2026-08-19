package p387Pl;

import livekit.org.webrtc.AudioTrack;
import livekit.org.webrtc.MediaStreamTrack;

/* JADX INFO: renamed from: Pl.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6479a extends AbstractC6468O {

    /* JADX INFO: renamed from: i */
    public final AudioTrack f21031i;

    public AbstractC6479a(String str, AudioTrack audioTrack) {
        super(str, EnumC6462I.AUDIO, audioTrack);
        this.f21031i = audioTrack;
    }

    @Override // p387Pl.AbstractC6468O
    /* JADX INFO: renamed from: c */
    public final MediaStreamTrack mo7051c() {
        return this.f21031i;
    }
}
