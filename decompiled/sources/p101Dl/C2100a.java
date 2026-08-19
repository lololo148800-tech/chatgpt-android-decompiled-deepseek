package p101Dl;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: renamed from: Dl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2100a implements JavaAudioDeviceModule.AudioBufferCallback {
    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioBufferCallback
    public final long onBuffer(ByteBuffer buffer, int i10, int i11, int i12, int i13, long j10) {
        AbstractC16544l.m18094g(buffer, "buffer");
        return 0L;
    }
}
