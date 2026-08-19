package livekit.org.webrtc.audio;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z6);

    boolean setNoiseSuppressorEnabled(boolean z6);

    boolean setPreferredMicrophoneFieldDimension(float f10);

    void setSpeakerMute(boolean z6);
}
