package livekit.org.webrtc.audio;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.ThreadUtils;
import p001A.AbstractC0010F;
import p571X9.AbstractC9306j0;
import p806ia.nJAW.FpwNpGDhomXHZ;

/* JADX INFO: loaded from: classes2.dex */
class WebRtcAudioTrack {
    private static final int AUDIO_TRACK_START = 0;
    private static final int AUDIO_TRACK_STOP = 1;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrackExternal";
    public AudioAttributes audioAttributes;
    private final AudioManager audioManager;
    private final JavaAudioDeviceModule.PlaybackSamplesReadyCallback audioSamplesReadyCallback;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private boolean checkPlayState;
    private final Context context;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private int initialBufferSizeInFrames;
    private long nativeAudioTrack;
    private volatile boolean speakerMute;
    private final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    private final ThreadUtils.ThreadChecker threadChecker;
    private boolean useLowLatency;
    private final VolumeLogger volumeLogger;

    public class AudioTrackThread extends Thread {
        private LowLatencyAudioBufferManager bufferManager;
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
            this.bufferManager = new LowLatencyAudioBufferManager();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Logging.m18742d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioTrack.this.checkPlayState) {
                WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            }
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int iCapacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, iCapacity);
                WebRtcAudioTrack.assertTrue(iCapacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.this.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                }
                int iWrite = WebRtcAudioTrack.this.audioTrack.write(WebRtcAudioTrack.this.byteBuffer, iCapacity, 0);
                if (iWrite != iCapacity) {
                    Logging.m18743e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + iWrite);
                    if (iWrite < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError(AbstractC10763a.m11048f(iWrite, "AudioTrack.write failed: "));
                    }
                }
                if (WebRtcAudioTrack.this.audioSamplesReadyCallback != null && this.keepAlive) {
                    WebRtcAudioTrack.this.audioSamplesReadyCallback.onWebRtcAudioTrackSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioTrack.this.audioTrack.getAudioFormat(), WebRtcAudioTrack.this.audioTrack.getChannelCount(), WebRtcAudioTrack.this.audioTrack.getSampleRate(), Arrays.copyOfRange(WebRtcAudioTrack.this.byteBuffer.array(), WebRtcAudioTrack.this.byteBuffer.arrayOffset(), WebRtcAudioTrack.this.byteBuffer.arrayOffset() + iCapacity)));
                }
                if (WebRtcAudioTrack.this.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(WebRtcAudioTrack.this.audioTrack);
                }
            }
        }

        public void stopThread() {
            Logging.m18742d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null, null, null, null, false, true);
    }

    private int GetPlayoutUnderrunCount() {
        if (Build.VERSION.SDK_INT < 24) {
            return -2;
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    private static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z6) {
        if (!z6) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrackBeforeOreo(int i10, int i11, int i12, AudioAttributes audioAttributes) {
        Logging.m18742d(TAG, "createAudioTrackBeforeOreo");
        logNativeOutputSampleRate(i10);
        return new AudioTrack(getAudioAttributes(audioAttributes), new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11).build(), i12, 1, 0);
    }

    private static AudioTrack createAudioTrackOnOreoOrHigher(int i10, int i11, int i12, AudioAttributes audioAttributes) {
        Logging.m18742d(TAG, "createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i10);
        return new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes)).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11).build()).setBufferSizeInBytes(i12).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    private static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(2).setContentType(1);
        if (audioAttributes != null) {
            if (audioAttributes.getUsage() != 0) {
                contentType.setUsage(audioAttributes.getUsage());
            }
            if (audioAttributes.getContentType() != 0) {
                contentType.setContentType(audioAttributes.getContentType());
            }
            contentType.setFlags(audioAttributes.getFlags());
            if (Build.VERSION.SDK_INT >= 29) {
                contentType = applyAttributesOnQOrHigher(contentType, audioAttributes);
            }
        }
        return contentType.build();
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m18742d(TAG, "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m18742d(TAG, "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    private int initPlayout(int i10, int i11, double d10) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m18742d(TAG, "initPlayout(sampleRate=" + i10 + ", channels=" + i11 + ", bufferSizeFactor=" + d10 + Separators.RPAREN);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((i10 / BUFFERS_PER_SECOND) * i11 * 2);
        this.byteBuffer = byteBufferAllocateDirect;
        int iCapacity = byteBufferAllocateDirect.capacity();
        StringBuilder sb2 = new StringBuilder("byteBuffer.capacity: ");
        sb2.append(iCapacity);
        Logging.m18742d(TAG, sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int iChannelCountToConfiguration = channelCountToConfiguration(i11);
        int minBufferSize = (int) (((double) AudioTrack.getMinBufferSize(i10, iChannelCountToConfiguration, 2)) * d10);
        Logging.m18742d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (d10 > 1.0d) {
            this.useLowLatency = false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            if (!this.useLowLatency || Build.VERSION.SDK_INT < 26) {
                this.audioTrack = createAudioTrackBeforeOreo(i10, iChannelCountToConfiguration, minBufferSize, this.audioAttributes);
            } else {
                this.audioTrack = createAudioTrackOnOreoOrHigher(i10, iChannelCountToConfiguration, minBufferSize, this.audioAttributes);
            }
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack == null || audioTrack.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
            logMainParameters();
            logMainParametersExtended();
            return minBufferSize;
        } catch (IllegalArgumentException e10) {
            reportWebRtcAudioTrackInitError(e10.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.m18742d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    private void logBufferSizeInFrames() {
        Logging.m18742d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
    }

    private void logMainParameters() {
        int audioSessionId = this.audioTrack.getAudioSessionId();
        int channelCount = this.audioTrack.getChannelCount();
        int sampleRate = this.audioTrack.getSampleRate();
        float maxVolume = AudioTrack.getMaxVolume();
        StringBuilder sbM21e = AbstractC0010F.m21e("AudioTrack: session ID: ", audioSessionId, ", channels: ", channelCount, ", sample rate: ");
        sbM21e.append(sampleRate);
        sbM21e.append(", max gain: ");
        sbM21e.append(maxVolume);
        Logging.m18742d(TAG, sbM21e.toString());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private static void logNativeOutputSampleRate(int i10) {
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.m18742d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i10 != nativeOutputSampleRate) {
            Logging.m18746w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.m18742d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private static native void nativeCacheDirectBufferAddress(long j10, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeGetPlayoutData(long j10, int i10);

    private void releaseAudioResources() {
        Logging.m18742d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.m18743e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.m18743e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.m18743e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private boolean setStreamVolume(int i10) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m18742d(TAG, "setStreamVolume(" + i10 + Separators.RPAREN);
        if (this.audioManager.isVolumeFixed()) {
            Logging.m18743e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i10, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.start();
        }
        Logging.m18742d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, AbstractC10763a.m11048f(this.audioTrack.getPlayState(), "AudioTrack.play failed - incorrect state :"));
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e10) {
            reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, AbstractC9306j0.m9889h("AudioTrack.play failed: ", e10.getMessage()));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.stop();
        }
        Logging.m18742d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m18742d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.m18743e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        Logging.m18742d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            Logging.m18742d(TAG, "Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                Logging.m18742d(TAG, "AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e10) {
                Logging.m18743e(TAG, "AudioTrack.stop failed: " + e10.getMessage());
            }
        }
        releaseAudioResources();
        return true;
    }

    public void setNativeAudioTrack(long j10) {
        this.nativeAudioTrack = j10;
    }

    public void setSpeakerMute(boolean z6) {
        Logging.m18746w(TAG, "setSpeakerMute(" + z6 + Separators.RPAREN);
        this.speakerMute = z6;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, AudioAttributes audioAttributes, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, JavaAudioDeviceModule.PlaybackSamplesReadyCallback playbackSamplesReadyCallback, boolean z6, boolean z10) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.checkPlayState = true;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = z10 ? new VolumeLogger(audioManager) : null;
        this.audioSamplesReadyCallback = playbackSamplesReadyCallback;
        this.useLowLatency = z6;
        Logging.m18742d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioTrackStateCallback(int i10) {
        Logging.m18742d(TAG, FpwNpGDhomXHZ.TTDKRZWjDicCPU + i10);
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback != null) {
            if (i10 == 0) {
                audioTrackStateCallback.onWebRtcAudioTrackStart();
            } else if (i10 == 1) {
                audioTrackStateCallback.onWebRtcAudioTrackStop();
            } else {
                Logging.m18743e(TAG, "Invalid audio state");
            }
        }
    }
}
