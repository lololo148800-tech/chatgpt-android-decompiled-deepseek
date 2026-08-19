package livekit.org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import livekit.org.webrtc.JniCommon;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes2.dex */
public class JavaAudioDeviceModule implements AudioDeviceModule {
    private static final String TAG = "JavaAudioDeviceModule";
    public final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    public final WebRtcAudioTrack audioOutput;
    private final Context context;
    private final int inputSampleRate;
    private long nativeAudioDeviceModule;
    private final Object nativeLock;
    private final int outputSampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    public interface AudioBufferCallback {
        long onBuffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, long j10);
    }

    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(int i10, int i11, int i12, byte[] bArr) {
            this.audioFormat = i10;
            this.channelCount = i11;
            this.sampleRate = i12;
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    public static class Builder {
        private AudioAttributes audioAttributes;
        private AudioBufferCallback audioBufferCallback;
        private int audioFormat;
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private AudioRecordStateCallback audioRecordStateCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private AudioTrackStateCallback audioTrackStateCallback;
        private final Context context;
        private boolean enableVolumeLogger;
        private int inputSampleRate;
        private int outputSampleRate;
        private PlaybackSamplesReadyCallback playbackSamplesReadyCallback;
        private SamplesReadyCallback samplesReadyCallback;
        private ScheduledExecutorService scheduler;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useLowLatency;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        public /* synthetic */ Builder(Context context, int i10) {
            this(context);
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public Builder setAudioBufferCallback(AudioBufferCallback audioBufferCallback) {
            this.audioBufferCallback = audioBufferCallback;
            return this;
        }

        public Builder setAudioFormat(int i10) {
            this.audioFormat = i10;
            return this;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback) {
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback audioRecordStateCallback) {
            this.audioRecordStateCallback = audioRecordStateCallback;
            return this;
        }

        public Builder setAudioSource(int i10) {
            this.audioSource = i10;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback) {
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback audioTrackStateCallback) {
            this.audioTrackStateCallback = audioTrackStateCallback;
            return this;
        }

        public Builder setEnableVolumeLogger(boolean z6) {
            this.enableVolumeLogger = z6;
            return this;
        }

        public Builder setInputSampleRate(int i10) {
            Logging.m18742d(JavaAudioDeviceModule.TAG, "Input sample rate overridden to: " + i10);
            this.inputSampleRate = i10;
            return this;
        }

        public Builder setOutputSampleRate(int i10) {
            Logging.m18742d(JavaAudioDeviceModule.TAG, "Output sample rate overridden to: " + i10);
            this.outputSampleRate = i10;
            return this;
        }

        public Builder setPlaybackSamplesReadyCallback(PlaybackSamplesReadyCallback playbackSamplesReadyCallback) {
            this.playbackSamplesReadyCallback = playbackSamplesReadyCallback;
            return this;
        }

        public Builder setSampleRate(int i10) {
            Logging.m18742d(JavaAudioDeviceModule.TAG, "Input/Output sample rate overridden to: " + i10);
            this.inputSampleRate = i10;
            this.outputSampleRate = i10;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setScheduler(ScheduledExecutorService scheduledExecutorService) {
            this.scheduler = scheduledExecutorService;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z6) {
            if (z6 && !JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                Logging.m18743e(JavaAudioDeviceModule.TAG, "HW AEC not supported");
                z6 = false;
            }
            this.useHardwareAcousticEchoCanceler = z6;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z6) {
            if (z6 && !JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                Logging.m18743e(JavaAudioDeviceModule.TAG, "HW NS not supported");
                z6 = false;
            }
            this.useHardwareNoiseSuppressor = z6;
            return this;
        }

        public Builder setUseLowLatency(boolean z6) {
            this.useLowLatency = z6;
            return this;
        }

        public Builder setUseStereoInput(boolean z6) {
            this.useStereoInput = z6;
            return this;
        }

        public Builder setUseStereoOutput(boolean z6) {
            this.useStereoOutput = z6;
            return this;
        }

        private Builder(Context context) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context;
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            this.audioManager = audioManager;
            this.inputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.outputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.useLowLatency = false;
            this.enableVolumeLogger = true;
        }

        public JavaAudioDeviceModule createAudioDeviceModule() {
            Logging.m18742d(JavaAudioDeviceModule.TAG, qffLJgOYizGmMj.QMhDsfueMvXhIoK);
            if (this.useHardwareNoiseSuppressor) {
                Logging.m18742d(JavaAudioDeviceModule.TAG, "HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    Logging.m18742d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                Logging.m18742d(JavaAudioDeviceModule.TAG, "HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                Logging.m18742d(JavaAudioDeviceModule.TAG, "HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    Logging.m18742d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                Logging.m18742d(JavaAudioDeviceModule.TAG, "HW AEC will not be used.");
            }
            if (this.useLowLatency && Build.VERSION.SDK_INT >= 26) {
                Logging.m18742d(JavaAudioDeviceModule.TAG, "Low latency mode will be used.");
            }
            ScheduledExecutorService scheduledExecutorServiceNewDefaultScheduler = this.scheduler;
            if (scheduledExecutorServiceNewDefaultScheduler == null) {
                scheduledExecutorServiceNewDefaultScheduler = WebRtcAudioRecord.newDefaultScheduler();
            }
            return new JavaAudioDeviceModule(this.context, this.audioManager, new WebRtcAudioRecord(this.context, scheduledExecutorServiceNewDefaultScheduler, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.audioBufferCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor), new WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.playbackSamplesReadyCallback, this.useLowLatency, this.enableVolumeLogger), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput, 0);
        }
    }

    public interface PlaybackSamplesReadyCallback {
        void onWebRtcAudioTrackSamplesReady(AudioSamples audioSamples);
    }

    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    public /* synthetic */ JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i10, int i11, boolean z6, boolean z10, int i12) {
        this(context, audioManager, webRtcAudioRecord, webRtcAudioTrack, i10, i11, z6, z10);
    }

    public static Builder builder(Context context) {
        return new Builder(context, 0);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    private static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i10, int i11, boolean z6, boolean z10);

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        long j10;
        synchronized (this.nativeLock) {
            try {
                if (this.nativeAudioDeviceModule == 0) {
                    this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
                }
                j10 = this.nativeAudioDeviceModule;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public void release() {
        synchronized (this.nativeLock) {
            try {
                long j10 = this.nativeAudioDeviceModule;
                if (j10 != 0) {
                    JniCommon.nativeReleaseRef(j10);
                    this.nativeAudioDeviceModule = 0L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setAudioRecordEnabled(boolean z6) {
        this.audioInput.setUseAudioRecord(z6);
    }

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z6) {
        Logging.m18742d(TAG, "setMicrophoneMute: " + z6);
        this.audioInput.setMicrophoneMute(z6);
    }

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public boolean setNoiseSuppressorEnabled(boolean z6) {
        Logging.m18742d(TAG, "setNoiseSuppressorEnabled: " + z6);
        return this.audioInput.setNoiseSuppressorEnabled(z6);
    }

    public void setPreferredInputDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.m18742d(TAG, "setPreferredInputDevice: " + audioDeviceInfo);
        this.audioInput.setPreferredDevice(audioDeviceInfo);
    }

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public final /* synthetic */ boolean setPreferredMicrophoneFieldDimension(float f10) {
        return AbstractC17030a.m18855b(this, f10);
    }

    @Override // livekit.org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z6) {
        Logging.m18742d(TAG, "setSpeakerMute: " + z6);
        this.audioOutput.setSpeakerMute(z6);
    }

    private JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i10, int i11, boolean z6, boolean z10) {
        this.nativeLock = new Object();
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.inputSampleRate = i10;
        this.outputSampleRate = i11;
        this.useStereoInput = z6;
        this.useStereoOutput = z10;
    }
}
