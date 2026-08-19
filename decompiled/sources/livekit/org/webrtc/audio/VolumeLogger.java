package livekit.org.webrtc.audio;

import android.gov.nist.core.Separators;
import android.media.AudioManager;
import java.util.Timer;
import java.util.TimerTask;
import livekit.org.webrtc.Logging;
import p003A1.AbstractC0168G;

/* JADX INFO: loaded from: classes2.dex */
class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    public class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        public LogVolumeTask(int i10, int i11) {
            this.maxRingVolume = i10;
            this.maxVoiceCallVolume = i11;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                Logging.m18742d(VolumeLogger.TAG, AbstractC0168G.m532u("STREAM_RING stream volume: ", VolumeLogger.this.audioManager.getStreamVolume(2), " (max=", this.maxRingVolume, Separators.RPAREN));
            } else if (mode == 3) {
                Logging.m18742d(VolumeLogger.TAG, AbstractC0168G.m532u("VOICE_CALL stream volume: ", VolumeLogger.this.audioManager.getStreamVolume(0), " (max=", this.maxVoiceCallVolume, Separators.RPAREN));
            }
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        Logging.m18742d(TAG, "start" + WebRtcAudioUtils.getThreadInfo());
        if (this.timer != null) {
            return;
        }
        Logging.m18742d(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        Timer timer = new Timer(THREAD_NAME);
        this.timer = timer;
        timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
    }

    public void stop() {
        Logging.m18742d(TAG, "stop" + WebRtcAudioUtils.getThreadInfo());
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}
