package p151Fl;

import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p817j$.util.Objects;
import p867l8.C16831c;

/* JADX INFO: renamed from: Fl.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C2906l implements JavaAudioDeviceModule.AudioTrackErrorCallback {
    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public final void onWebRtcAudioTrackError(String str) {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26120q0;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        AbstractC22225a.f70470a.getClass();
        C16831c.m18568f(new Object[0]);
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public final void onWebRtcAudioTrackInitError(String str) {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26120q0;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        AbstractC22225a.f70470a.getClass();
        C16831c.m18568f(new Object[0]);
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public final void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26120q0;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        Objects.toString(audioTrackStartErrorCode);
        AbstractC22225a.f70470a.getClass();
        C16831c.m18568f(new Object[0]);
    }
}
