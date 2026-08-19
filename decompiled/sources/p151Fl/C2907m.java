package p151Fl;

import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import p101Dl.InterfaceC2112m;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p867l8.C16831c;

/* JADX INFO: renamed from: Fl.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C2907m implements JavaAudioDeviceModule.AudioTrackStateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2112m f8721a;

    public C2907m(InterfaceC2112m interfaceC2112m) {
        this.f8721a = interfaceC2112m;
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public final void onWebRtcAudioTrackStart() {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        this.f8721a.mo3185b();
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public final void onWebRtcAudioTrackStop() {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        this.f8721a.mo3184a();
    }
}
