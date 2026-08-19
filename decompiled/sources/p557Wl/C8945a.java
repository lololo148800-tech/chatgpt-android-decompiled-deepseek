package p557Wl;

import io.livekit.audio.krisp.KrispAudioProcessor;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.ExternalAudioProcessingFactory;
import p101Dl.InterfaceC2111l;

/* JADX INFO: renamed from: Wl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C8945a implements ExternalAudioProcessingFactory.AudioProcessing {

    /* JADX INFO: renamed from: a */
    public InterfaceC2111l f27352a;

    @Override // livekit.org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
    public final void initialize(int i10, int i11) {
        InterfaceC2111l interfaceC2111l = this.f27352a;
        if (interfaceC2111l != null) {
            ((KrispAudioProcessor) interfaceC2111l).m16224d(i10, i11);
        }
    }

    @Override // livekit.org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
    public final void process(int i10, int i11, ByteBuffer byteBuffer) {
        InterfaceC2111l interfaceC2111l = this.f27352a;
        if (interfaceC2111l != null) {
            AbstractC16544l.m18091d(byteBuffer);
            ((KrispAudioProcessor) interfaceC2111l).m16226f(i10, i11, byteBuffer);
        }
    }

    @Override // livekit.org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
    public final void reset(int i10) {
        InterfaceC2111l interfaceC2111l = this.f27352a;
        if (interfaceC2111l != null) {
            ((KrispAudioProcessor) interfaceC2111l).m16227g(i10);
        }
    }
}
