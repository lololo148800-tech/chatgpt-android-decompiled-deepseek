package livekit.org.webrtc.audio;

import android.gov.nist.core.Separators;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import java.util.UUID;
import livekit.org.webrtc.Logging;

/* JADX INFO: loaded from: classes2.dex */
class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffectsExternal";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;

    /* JADX INFO: renamed from: ns */
    private NoiseSuppressor f54475ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public WebRtcAudioEffects() {
        Logging.m18742d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z6) {
        if (!z6) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        return (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
        cachedEffects = descriptorArrQueryEffects;
        return descriptorArrQueryEffects;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !descriptor.uuid.equals(uuid2);
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    public void enable(int i10) {
        Logging.m18742d(TAG, "enable(audioSession=" + i10 + Separators.RPAREN);
        boolean z6 = false;
        assertTrue(this.aec == null);
        assertTrue(this.f54475ns == null);
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(i10);
            this.aec = acousticEchoCancelerCreate;
            if (acousticEchoCancelerCreate != null) {
                boolean enabled = acousticEchoCancelerCreate.getEnabled();
                boolean z10 = this.shouldEnableAec && isAcousticEchoCancelerSupported();
                if (this.aec.setEnabled(z10) != 0) {
                    Logging.m18743e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                Logging.m18742d(TAG, "AcousticEchoCanceler: was " + (enabled ? "enabled" : "disabled") + ", enable: " + z10 + ", is now: " + (this.aec.getEnabled() ? "enabled" : "disabled"));
            } else {
                Logging.m18743e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(i10);
            this.f54475ns = noiseSuppressorCreate;
            if (noiseSuppressorCreate == null) {
                Logging.m18743e(TAG, "Failed to create the NoiseSuppressor instance");
                return;
            }
            boolean enabled2 = noiseSuppressorCreate.getEnabled();
            if (this.shouldEnableNs && isNoiseSuppressorSupported()) {
                z6 = true;
            }
            if (this.f54475ns.setEnabled(z6) != 0) {
                Logging.m18743e(TAG, "Failed to set the NoiseSuppressor state");
            }
            Logging.m18742d(TAG, "NoiseSuppressor: was " + (enabled2 ? "enabled" : "disabled") + ", enable: " + z6 + ", is now: " + (this.f54475ns.getEnabled() ? "enabled" : "disabled"));
        }
    }

    public void release() {
        Logging.m18742d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.f54475ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f54475ns = null;
        }
    }

    public boolean setAEC(boolean z6) {
        Logging.m18742d(TAG, "setAEC(" + z6 + Separators.RPAREN);
        if (!isAcousticEchoCancelerSupported()) {
            Logging.m18746w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z6 == this.shouldEnableAec) {
            this.shouldEnableAec = z6;
            return true;
        }
        Logging.m18743e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z6) {
        Logging.m18742d(TAG, "setNS(" + z6 + Separators.RPAREN);
        if (!isNoiseSuppressorSupported()) {
            Logging.m18746w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.f54475ns == null || z6 == this.shouldEnableNs) {
            this.shouldEnableNs = z6;
            return true;
        }
        Logging.m18743e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }

    public boolean toggleNS(boolean z6) {
        if (this.f54475ns == null) {
            Logging.m18743e(TAG, "Attempting to enable or disable nonexistent NoiseSuppressor.");
            return false;
        }
        Logging.m18742d(TAG, "toggleNS(" + z6 + Separators.RPAREN);
        return this.f54475ns.setEnabled(z6) == 0;
    }
}
