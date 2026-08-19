package p151Fl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.SoftwareVideoEncoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p557Wl.C8951g;

/* JADX INFO: renamed from: Fl.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C2918x implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4478i f8754a;

    /* JADX INFO: renamed from: b */
    public final C2914t f8755b;

    /* JADX INFO: renamed from: c */
    public final C2901g f8756c;

    public C2918x(InterfaceC4478i interfaceC4478i, C2914t c2914t, C2901g c2901g) {
        this.f8754a = interfaceC4478i;
        this.f8755b = c2914t;
        this.f8756c = c2901g;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        C2899e webrtcInitialization = (C2899e) this.f8754a.get();
        boolean zBooleanValue = Boolean.TRUE.booleanValue();
        EglBase.Context context = (EglBase.Context) this.f8755b.get();
        VideoEncoderFactory videoEncoderFactory = (VideoEncoderFactory) this.f8756c.get();
        AbstractC16544l.m18094g(webrtcInitialization, "webrtcInitialization");
        if (videoEncoderFactory == null) {
            return zBooleanValue ? new C8951g(context) : new SoftwareVideoEncoderFactory();
        }
        return videoEncoderFactory;
    }
}
