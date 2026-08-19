package p151Fl;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.audio.AudioDeviceModule;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import p049Bm.InterfaceC1436k;
import p092Dc.C1992i;
import p101Dl.C2100a;
import p101Dl.C2103d;
import p101Dl.InterfaceC2112m;
import p224Il.C3741a;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;

/* JADX INFO: renamed from: Fl.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C2912r implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final C2901g f8731a;

    /* JADX INFO: renamed from: b */
    public final C2902h f8732b;

    /* JADX INFO: renamed from: c */
    public final C1992i f8733c;

    /* JADX INFO: renamed from: d */
    public final C4474e f8734d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4478i f8735e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4478i f8736f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4478i f8737g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC4478i f8738h;

    public C2912r(C2901g c2901g, C2902h c2902h, C1992i c1992i, C4474e c4474e, InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2, InterfaceC4478i interfaceC4478i3, InterfaceC4478i interfaceC4478i4) {
        this.f8731a = c2901g;
        this.f8732b = c2902h;
        this.f8733c = c1992i;
        this.f8734d = c4474e;
        this.f8735e = interfaceC4478i;
        this.f8736f = interfaceC4478i2;
        this.f8737g = interfaceC4478i3;
        this.f8738h = interfaceC4478i4;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        AudioDeviceModule audioDeviceModule = (AudioDeviceModule) this.f8731a.get();
        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f8732b.get();
        AudioAttributes audioAttributes = (AudioAttributes) this.f8733c.get();
        Context appContext = (Context) this.f8734d.f14617a;
        C3741a closeableManager = (C3741a) this.f8735e.get();
        InterfaceC2112m communicationWorkaround = (InterfaceC2112m) this.f8736f.get();
        C2103d audioRecordSamplesDispatcher = (C2103d) this.f8737g.get();
        C2100a audioBufferCallbackDispatcher = (C2100a) this.f8738h.get();
        AbstractC16544l.m18094g(appContext, "appContext");
        AbstractC16544l.m18094g(closeableManager, "closeableManager");
        AbstractC16544l.m18094g(communicationWorkaround, "communicationWorkaround");
        AbstractC16544l.m18094g(audioRecordSamplesDispatcher, "audioRecordSamplesDispatcher");
        AbstractC16544l.m18094g(audioBufferCallbackDispatcher, "audioBufferCallbackDispatcher");
        if (audioDeviceModule != null) {
            return audioDeviceModule;
        }
        C2904j c2904j = new C2904j();
        C2906l c2906l = new C2906l();
        C2905k c2905k = new C2905k();
        C2907m c2907m = new C2907m(communicationWorkaround);
        boolean z6 = Build.VERSION.SDK_INT >= 29;
        JavaAudioDeviceModule.Builder audioBufferCallback = JavaAudioDeviceModule.builder(appContext).setUseHardwareAcousticEchoCanceler(z6).setUseHardwareNoiseSuppressor(z6).setAudioRecordErrorCallback(c2904j).setAudioTrackErrorCallback(c2906l).setAudioRecordStateCallback(c2905k).setAudioTrackStateCallback(c2907m).setSamplesReadyCallback(audioRecordSamplesDispatcher).setAudioSource(7).setAudioAttributes(audioAttributes).setAudioBufferCallback(audioBufferCallbackDispatcher);
        if (interfaceC1436k != null) {
            AbstractC16544l.m18091d(audioBufferCallback);
            interfaceC1436k.invoke(audioBufferCallback);
        }
        JavaAudioDeviceModule javaAudioDeviceModuleCreateAudioDeviceModule = audioBufferCallback.createAudioDeviceModule();
        closeableManager.m4434a(new C2895a(javaAudioDeviceModuleCreateAudioDeviceModule, 1));
        AbstractC16544l.m18093f(javaAudioDeviceModuleCreateAudioDeviceModule, "apply(...)");
        return javaAudioDeviceModuleCreateAudioDeviceModule;
    }
}
