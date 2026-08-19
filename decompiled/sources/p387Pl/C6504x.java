package p387Pl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.AudioTrack;
import livekit.org.webrtc.RtpReceiver;

/* JADX INFO: renamed from: Pl.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C6504x extends AbstractC6479a {

    /* JADX INFO: renamed from: j */
    public final RtpReceiver f21102j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6504x(AudioTrack audioTrack, RtpReceiver receiver) {
        super("", audioTrack);
        AbstractC16544l.m18094g(receiver, "receiver");
        this.f21102j = receiver;
    }
}
