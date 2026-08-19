package p101Dl;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.AudioTrackSink;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: renamed from: Dl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2103d implements JavaAudioDeviceModule.SamplesReadyCallback {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f6452a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final synchronized void m3183a(AudioTrackSink sink) {
        AbstractC16544l.m18094g(sink, "sink");
        this.f6452a.remove(sink);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[PHI: r3
      0x0029: PHI (r3v4 int) = (r3v0 int), (r3v5 int) binds: [B:9:0x0015, B:11:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public final synchronized void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples samples) {
        AbstractC16544l.m18094g(samples, "samples");
        int audioFormat = samples.getAudioFormat();
        if (audioFormat == 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(audioFormat, "Bad audio format "));
        }
        int i10 = 2;
        int i11 = 1;
        if (audioFormat != 1 && audioFormat != 2) {
            if (audioFormat != 3) {
                i11 = 4;
                if (audioFormat == 4) {
                    i10 = i11;
                } else if (audioFormat != 13) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(audioFormat, "Bad audio format "));
                }
            } else {
                i10 = i11;
            }
        }
        int i12 = i10 * 8;
        int sampleRate = samples.getSampleRate() / 100;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f6452a.iterator();
        while (it.hasNext()) {
            ((AudioTrackSink) it.next()).onData(ByteBuffer.wrap(samples.getData()), i12, samples.getSampleRate(), samples.getChannelCount(), sampleRate, jElapsedRealtime);
        }
    }
}
