package p151Fl;

import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p867l8.C16831c;

/* JADX INFO: renamed from: Fl.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C2905k implements JavaAudioDeviceModule.AudioRecordStateCallback {
    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public final void onWebRtcAudioRecordStart() {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        AbstractC22225a.f70470a.getClass();
        C16831c.m18570i(new Object[0]);
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public final void onWebRtcAudioRecordStop() {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        AbstractC22225a.f70470a.getClass();
        C16831c.m18570i(new Object[0]);
    }
}
