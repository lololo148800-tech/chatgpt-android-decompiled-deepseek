package livekit.org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ExternalAudioProcessingFactory implements AudioProcessingFactory {
    private long apmPtr = nativeGetDefaultApm();
    private long capturePostProcessingPtr = 0;
    private long renderPreProcessingPtr = 0;

    public interface AudioProcessing {
        void initialize(int i10, int i11);

        void process(int i10, int i11, ByteBuffer byteBuffer);

        void reset(int i10);
    }

    private void checkExternalAudioProcessorExists() {
        if (this.apmPtr == 0) {
            throw new IllegalStateException("ExternalAudioProcessor has been disposed.");
        }
    }

    private static native void nativeDestroy();

    private static native long nativeGetDefaultApm();

    private static native void nativeSetBypassFlagForCapturePost(boolean z6);

    private static native void nativeSetBypassFlagForRenderPre(boolean z6);

    private static native long nativeSetCapturePostProcessing(AudioProcessing audioProcessing);

    private static native long nativeSetRenderPreProcessing(AudioProcessing audioProcessing);

    @Override // livekit.org.webrtc.AudioProcessingFactory
    public long createNative() {
        if (this.apmPtr == 0) {
            this.apmPtr = nativeGetDefaultApm();
        }
        return this.apmPtr;
    }

    public void destroy() {
        checkExternalAudioProcessorExists();
        long j10 = this.renderPreProcessingPtr;
        if (j10 != 0) {
            JniCommon.nativeReleaseRef(j10);
            this.renderPreProcessingPtr = 0L;
        }
        long j11 = this.capturePostProcessingPtr;
        if (j11 != 0) {
            JniCommon.nativeReleaseRef(j11);
            this.capturePostProcessingPtr = 0L;
        }
        nativeDestroy();
        this.apmPtr = 0L;
    }

    public void setBypassFlagForCapturePost(boolean z6) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForCapturePost(z6);
    }

    public void setBypassFlagForRenderPre(boolean z6) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForRenderPre(z6);
    }

    public void setCapturePostProcessing(AudioProcessing audioProcessing) {
        checkExternalAudioProcessorExists();
        long jNativeSetCapturePostProcessing = nativeSetCapturePostProcessing(audioProcessing);
        long j10 = this.capturePostProcessingPtr;
        if (j10 != 0) {
            JniCommon.nativeReleaseRef(j10);
            this.capturePostProcessingPtr = 0L;
        }
        this.capturePostProcessingPtr = jNativeSetCapturePostProcessing;
    }

    public void setRenderPreProcessing(AudioProcessing audioProcessing) {
        checkExternalAudioProcessorExists();
        long jNativeSetRenderPreProcessing = nativeSetRenderPreProcessing(audioProcessing);
        long j10 = this.renderPreProcessingPtr;
        if (j10 != 0) {
            JniCommon.nativeReleaseRef(j10);
            this.renderPreProcessingPtr = 0L;
        }
        this.renderPreProcessingPtr = jNativeSetRenderPreProcessing;
    }
}
