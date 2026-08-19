package livekit.org.webrtc.audio;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.ThreadUtils;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p854kf.AbstractC16393k;
import p861l1.xapn.suYVq;

/* JADX INFO: loaded from: classes2.dex */
class WebRtcAudioRecord {
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecordExternal";
    private static final AtomicInteger nextSchedulerId = new AtomicInteger(0);
    private final JavaAudioDeviceModule.AudioBufferCallback audioBufferCallback;
    private final int audioFormat;
    private final AudioManager audioManager;
    private volatile AudioRecord audioRecord;
    private final Object audioRecordStateLock;
    private final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference<Boolean> audioSourceMatchesRecordingSessionRef;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private int channelCount;
    private final Context context;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;
    private ScheduledFuture<String> future;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;
    private AudioDeviceInfo preferredDevice;
    private int sampleRate;
    private final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;
    private boolean useAudioRecord;

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        public void stopThread() {
            Logging.m18742d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioRecord audioRecord;
            int iCapacity;
            long jOnBuffer;
            Process.setThreadPriority(-19);
            Logging.m18742d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord != null) {
                WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            }
            WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            System.nanoTime();
            AudioTimestamp audioTimestamp = Build.VERSION.SDK_INT >= 24 ? new AudioTimestamp() : null;
            while (this.keepAlive) {
                synchronized (WebRtcAudioRecord.this.audioRecordStateLock) {
                    audioRecord = WebRtcAudioRecord.this.audioRecord;
                }
                if (audioRecord == null && WebRtcAudioRecord.this.useAudioRecord) {
                    if (WebRtcAudioRecord.this.initAudioRecord()) {
                        synchronized (WebRtcAudioRecord.this.audioRecordStateLock) {
                            audioRecord = WebRtcAudioRecord.this.audioRecord;
                        }
                        WebRtcAudioRecord.assertTrue(audioRecord != null);
                        try {
                            audioRecord.startRecording();
                        } catch (IllegalStateException e10) {
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, AbstractC9306j0.m9889h("AudioRecord.startRecording failed: ", e10.getMessage()));
                            WebRtcAudioRecord.this.useAudioRecord = false;
                            audioRecord = null;
                        }
                        if (WebRtcAudioRecord.this.useAudioRecord && audioRecord.getRecordingState() != 3) {
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, AbstractC10763a.m11048f(audioRecord.getRecordingState(), "AudioRecord.startRecording failed - incorrect state: "));
                            WebRtcAudioRecord.this.useAudioRecord = false;
                            audioRecord = null;
                        }
                    } else {
                        WebRtcAudioRecord.this.useAudioRecord = false;
                    }
                }
                if (audioRecord != null && !WebRtcAudioRecord.this.useAudioRecord) {
                    WebRtcAudioRecord.this.releaseAudioResources();
                    audioRecord = null;
                }
                long j10 = 0;
                if (audioRecord != null) {
                    int i10 = audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                    if (i10 == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                        if (WebRtcAudioRecord.this.microphoneMute) {
                            WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                        }
                        if (this.keepAlive && Build.VERSION.SDK_INT >= 24 && audioRecord.getTimestamp(audioTimestamp, 0) == 0) {
                            j10 = audioTimestamp.nanoTime;
                        }
                        jOnBuffer = j10;
                        iCapacity = i10;
                    } else {
                        String str = "AudioRecord.read failed: " + i10;
                        Logging.m18743e(suYVq.wmTOgrYYFbXv, str);
                        if (i10 == -3) {
                            this.keepAlive = false;
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                        }
                    }
                } else {
                    WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    iCapacity = 0;
                    jOnBuffer = 0;
                }
                if (this.keepAlive && WebRtcAudioRecord.this.audioBufferCallback != null) {
                    jOnBuffer = WebRtcAudioRecord.this.audioBufferCallback.onBuffer(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.audioFormat, WebRtcAudioRecord.this.channelCount, WebRtcAudioRecord.this.sampleRate, iCapacity, jOnBuffer);
                    iCapacity = WebRtcAudioRecord.this.byteBuffer.capacity();
                }
                int i11 = iCapacity;
                long j11 = jOnBuffer;
                if (this.keepAlive) {
                    WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                    webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, i11, j11);
                }
                if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                    WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioRecord.this.audioFormat, WebRtcAudioRecord.this.channelCount, WebRtcAudioRecord.this.sampleRate, Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.arrayOffset() + WebRtcAudioRecord.this.byteBuffer.capacity())));
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e11) {
                Logging.m18743e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e11.getMessage());
            }
            WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
        }
    }

    public WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, newDefaultScheduler(), audioManager, 7, 2, null, null, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z6) {
        if (!z6) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static String audioStateToString(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? "INVALID" : "STOP";
        }
        return "START";
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    private static boolean checkDeviceMatch(AudioDeviceInfo audioDeviceInfo, AudioDeviceInfo audioDeviceInfo2) {
        return audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType();
    }

    private static AudioRecord createAudioRecordOnLowerThanM(int i10, int i11, int i12, int i13, int i14) {
        Logging.m18742d(TAG, "createAudioRecordOnLowerThanM");
        return new AudioRecord(i10, i11, i12, i13, i14);
    }

    private static AudioRecord createAudioRecordOnMOrHigher(int i10, int i11, int i12, int i13, int i14) {
        Logging.m18742d(TAG, "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i10).setAudioFormat(new AudioFormat.Builder().setEncoding(i13).setSampleRate(i11).setChannelMask(i12).build()).setBufferSizeInBytes(i14).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i10) {
        Logging.m18742d(TAG, "doAudioRecordStateCallback: " + audioStateToString(i10));
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i10 == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i10 == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                Logging.m18743e(TAG, "Invalid audio state");
            }
        }
    }

    private boolean enableBuiltInAEC(boolean z6) {
        Logging.m18742d(TAG, "enableBuiltInAEC(" + z6 + Separators.RPAREN);
        return this.effects.setAEC(z6);
    }

    private boolean enableBuiltInNS(boolean z6) {
        Logging.m18742d(TAG, "enableBuiltInNS(" + z6 + Separators.RPAREN);
        return this.effects.setNS(z6);
    }

    private static int getBytesPerSample(int i10) {
        int i11 = 1;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    if (i10 != 13) {
                        throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Bad audio format "));
                    }
                }
            }
            return i11;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean initAudioRecord() {
        if (this.sampleRate == 0 || this.channelCount == 0) {
            Logging.m18746w(TAG, "initAudioRecord called before initRecord!");
            return false;
        }
        synchronized (this.audioRecordStateLock) {
            try {
                if (this.audioRecord != null) {
                    reportWebRtcAudioRecordInitError("InitAudioRecord called twice without StopRecording.");
                    return false;
                }
                int iChannelCountToConfiguration = channelCountToConfiguration(this.channelCount);
                int minBufferSize = AudioRecord.getMinBufferSize(this.sampleRate, iChannelCountToConfiguration, this.audioFormat);
                if (minBufferSize != -1 && minBufferSize != -2) {
                    Logging.m18742d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
                    int iMax = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                    Logging.m18742d(TAG, "bufferSizeInBytes: " + iMax);
                    try {
                        this.audioRecord = createAudioRecordOnMOrHigher(this.audioSource, this.sampleRate, iChannelCountToConfiguration, this.audioFormat, iMax);
                        this.audioSourceMatchesRecordingSessionRef.set(null);
                        AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                        if (audioDeviceInfo != null) {
                            setPreferredDevice(audioDeviceInfo);
                        }
                        if (this.audioRecord != null && this.audioRecord.getState() == 1) {
                            this.effects.enable(this.audioRecord.getAudioSessionId());
                            logMainParameters();
                            logMainParametersExtended();
                            return true;
                        }
                        reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                        releaseAudioResources();
                        return false;
                    } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                        reportWebRtcAudioRecordInitError(e10.getMessage());
                        releaseAudioResources();
                        return false;
                    }
                }
                reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int initRecording(int i10, int i11) {
        Logging.m18742d(TAG, AbstractC0168G.m532u("initRecording(sampleRate=", i10, ", channels=", i11, Separators.RPAREN));
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        this.sampleRate = i10;
        this.channelCount = i11;
        int i12 = i10 / 100;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i11 * getBytesPerSample(this.audioFormat) * i12);
        this.byteBuffer = byteBufferAllocateDirect;
        if (!byteBufferAllocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        Logging.m18742d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        if (this.useAudioRecord && !initAudioRecord()) {
            return -1;
        }
        int iLogRecordingConfigurations = logRecordingConfigurations(this.audioRecord, false);
        if (iLogRecordingConfigurations != 0) {
            Logging.m18746w(TAG, "Potential microphone conflict. Active sessions: " + iLogRecordingConfigurations);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord) {
        if (this.audioRecord == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        Logging.m18742d(TAG, "audio record has changed");
        return "Scheduled task is done";
    }

    private static boolean logActiveRecordingConfigs(int i10, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        Iterator<AudioRecordingConfiguration> it = list.iterator();
        Logging.m18742d(TAG, "AudioRecordingConfigurations: ");
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfigurationM17986i = AbstractC16393k.m17986i(it.next());
            StringBuilder sb2 = new StringBuilder("  client audio source=");
            sb2.append(WebRtcAudioUtils.audioSourceToString(audioRecordingConfigurationM17986i.getClientAudioSource()));
            sb2.append(", client session id=");
            sb2.append(audioRecordingConfigurationM17986i.getClientAudioSessionId());
            sb2.append(" (");
            sb2.append(i10);
            sb2.append(")\n  Device AudioFormat: channel count=");
            AudioFormat format = audioRecordingConfigurationM17986i.getFormat();
            sb2.append(format.getChannelCount());
            sb2.append(", channel index mask=");
            sb2.append(format.getChannelIndexMask());
            sb2.append(", channel mask=");
            sb2.append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            sb2.append(", encoding=");
            sb2.append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            sb2.append(", sample rate=");
            sb2.append(format.getSampleRate());
            sb2.append("\n  Client AudioFormat: channel count=");
            AudioFormat clientFormat = audioRecordingConfigurationM17986i.getClientFormat();
            sb2.append(clientFormat.getChannelCount());
            sb2.append(", channel index mask=");
            sb2.append(clientFormat.getChannelIndexMask());
            sb2.append(", channel mask=");
            sb2.append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            sb2.append(", encoding=");
            sb2.append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            sb2.append(", sample rate=");
            sb2.append(clientFormat.getSampleRate());
            sb2.append(Separators.RETURN);
            AudioDeviceInfo audioDevice = audioRecordingConfigurationM17986i.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb2.append("  AudioDevice: type=");
                sb2.append(WebRtcAudioUtils.deviceTypeToString(audioDevice.getType()));
                sb2.append(", id=");
                sb2.append(audioDevice.getId());
            }
            Logging.m18742d(TAG, sb2.toString());
        }
        return true;
    }

    private void logMainParameters() {
        synchronized (this.audioRecordStateLock) {
            try {
                if (this.audioRecord != null) {
                    Logging.m18742d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void logMainParametersExtended() {
        synchronized (this.audioRecordStateLock) {
            try {
                if (this.audioRecord != null) {
                    Logging.m18742d(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int logRecordingConfigurations(AudioRecord audioRecord, boolean z6) {
        if (Build.VERSION.SDK_INT < 24) {
            Logging.m18746w(TAG, "AudioManager#getActiveRecordingConfigurations() requires N or higher");
            return 0;
        }
        if (audioRecord == null) {
            return 0;
        }
        List activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        Logging.m18742d(TAG, "Number of active recording sessions: " + size);
        if (size > 0) {
            logActiveRecordingConfigs(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
            if (z6) {
                this.audioSourceMatchesRecordingSessionRef.set(Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
            }
        }
        return size;
    }

    private native void nativeCacheDirectBufferAddress(long j10, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j10, int i10, long j11);

    public static ScheduledExecutorService newDefaultScheduler() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newScheduledThreadPool(0, new ThreadFactory() { // from class: livekit.org.webrtc.audio.WebRtcAudioRecord.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WebRtcAudioRecordScheduler-" + WebRtcAudioRecord.nextSchedulerId.getAndIncrement() + "-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseAudioResources() {
        Logging.m18742d(TAG, "releaseAudioResources");
        synchronized (this.audioRecordStateLock) {
            try {
                this.effects.release();
                if (this.audioRecord != null) {
                    this.audioRecord.release();
                    this.audioRecord = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.audioSourceMatchesRecordingSessionRef.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.m18743e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.m18743e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.m18743e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask(final AudioRecord audioRecord) {
        Logging.m18742d(TAG, "scheduleLogRecordingConfigurationsTask");
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        Callable callable = new Callable() { // from class: livekit.org.webrtc.audio.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f54476a.lambda$scheduleLogRecordingConfigurationsTask$0(audioRecord);
            }
        };
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(callable, 100L, TimeUnit.MILLISECONDS);
    }

    private boolean startRecording() {
        Logging.m18742d(TAG, "startRecording");
        assertTrue(this.audioThread == null);
        synchronized (this.audioRecordStateLock) {
            try {
                if (this.useAudioRecord) {
                    assertTrue(this.audioRecord != null);
                    try {
                        this.audioRecord.startRecording();
                        if (this.audioRecord.getRecordingState() != 3) {
                            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + this.audioRecord.getRecordingState());
                            return false;
                        }
                    } catch (IllegalStateException e10) {
                        reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e10.getMessage());
                        return false;
                    }
                }
                AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
                this.audioThread = audioRecordThread;
                audioRecordThread.start();
                scheduleLogRecordingConfigurationsTask(this.audioRecord);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean stopRecording() {
        Logging.m18742d(TAG, "stopRecording");
        assertTrue(this.audioThread != null);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.future.cancel(true);
            }
            this.future = null;
        }
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.m18743e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    private static boolean verifyAudioConfig(int i10, int i11, AudioFormat audioFormat, AudioDeviceInfo audioDeviceInfo, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        Iterator<AudioRecordingConfiguration> it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfigurationM17986i = AbstractC16393k.m17986i(it.next());
            AudioDeviceInfo audioDevice = audioRecordingConfigurationM17986i.getAudioDevice();
            if (audioDevice != null && audioRecordingConfigurationM17986i.getClientAudioSource() == i10 && audioRecordingConfigurationM17986i.getClientAudioSessionId() == i11 && audioRecordingConfigurationM17986i.getClientFormat().getEncoding() == audioFormat.getEncoding() && audioRecordingConfigurationM17986i.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && audioRecordingConfigurationM17986i.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && audioRecordingConfigurationM17986i.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && audioRecordingConfigurationM17986i.getFormat().getEncoding() != 0 && audioRecordingConfigurationM17986i.getFormat().getSampleRate() > 0 && (audioRecordingConfigurationM17986i.getFormat().getChannelMask() != 0 || audioRecordingConfigurationM17986i.getFormat().getChannelIndexMask() != 0)) {
                if (checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    Logging.m18742d(TAG, "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        Logging.m18743e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    public boolean isAudioConfigVerified() {
        return this.audioSourceMatchesRecordingSessionRef.get() != null;
    }

    public boolean isAudioSourceMatchingRecordingSession() {
        Boolean bool = this.audioSourceMatchesRecordingSessionRef.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        Logging.m18746w(TAG, "Audio configuration has not yet been verified");
        return false;
    }

    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public void setMicrophoneMute(boolean z6) {
        Logging.m18746w(TAG, "setMicrophoneMute(" + z6 + Separators.RPAREN);
        this.microphoneMute = z6;
    }

    public void setNativeAudioRecord(long j10) {
        this.nativeAudioRecord = j10;
    }

    public boolean setNoiseSuppressorEnabled(boolean z6) {
        if (!WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            Logging.m18743e(TAG, "Noise suppressor is not supported.");
            return false;
        }
        Logging.m18746w(TAG, "SetNoiseSuppressorEnabled(" + z6 + Separators.RPAREN);
        return this.effects.toggleNS(z6);
    }

    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.m18742d(TAG, "setPreferredDevice " + (audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null));
        this.preferredDevice = audioDeviceInfo;
        if (this.audioRecord == null || this.audioRecord.setPreferredDevice(audioDeviceInfo)) {
            return;
        }
        Logging.m18743e(TAG, "setPreferredDevice failed");
    }

    public void setUseAudioRecord(boolean z6) {
        Logging.m18742d(TAG, "setUseAudioRecord(" + z6 + Separators.RPAREN);
        this.useAudioRecord = z6;
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i10, int i11, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, JavaAudioDeviceModule.AudioBufferCallback audioBufferCallback, boolean z6, boolean z10) {
        this.effects = new WebRtcAudioEffects();
        this.audioRecordStateLock = new Object();
        this.useAudioRecord = true;
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        if (z6 && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        }
        if (z10 && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            throw new IllegalArgumentException(tpXhEMGxfXFVSh.Stz);
        }
        this.context = context;
        this.executor = scheduledExecutorService;
        this.audioManager = audioManager;
        this.audioSource = i10;
        this.audioFormat = i11;
        this.errorCallback = audioRecordErrorCallback;
        this.stateCallback = audioRecordStateCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.audioBufferCallback = audioBufferCallback;
        this.isAcousticEchoCancelerSupported = z6;
        this.isNoiseSuppressorSupported = z10;
        Logging.m18742d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }
}
