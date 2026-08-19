package p341Ni;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import p365Oi.C6256d;
import p365Oi.C6257e;

/* JADX INFO: renamed from: Ni.y */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5805y implements JavaAudioDeviceModule.SamplesReadyCallback, JavaAudioDeviceModule.PlaybackSamplesReadyCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5784h0 f18954a;

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        C6257e c6257e = this.f18954a.f18841O;
        byte[] data = audioSamples.getData();
        AbstractC16544l.m18093f(data, "getData(...)");
        c6257e.mo6744c(data);
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.PlaybackSamplesReadyCallback
    public void onWebRtcAudioTrackSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        C6256d c6256d = this.f18954a.f18840N;
        byte[] data = audioSamples.getData();
        AbstractC16544l.m18093f(data, "getData(...)");
        c6256d.mo6744c(data);
    }
}
