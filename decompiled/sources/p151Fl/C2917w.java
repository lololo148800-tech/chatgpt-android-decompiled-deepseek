package p151Fl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.SoftwareVideoDecoderFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p557Wl.C8950f;

/* JADX INFO: renamed from: Fl.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C2917w implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4478i f8751a;

    /* JADX INFO: renamed from: b */
    public final C2914t f8752b;

    /* JADX INFO: renamed from: c */
    public final C2901g f8753c;

    public C2917w(InterfaceC4478i interfaceC4478i, C2914t c2914t, C2901g c2901g) {
        this.f8751a = interfaceC4478i;
        this.f8752b = c2914t;
        this.f8753c = c2901g;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        C2899e webrtcInitialization = (C2899e) this.f8751a.get();
        boolean zBooleanValue = Boolean.TRUE.booleanValue();
        EglBase.Context context = (EglBase.Context) this.f8752b.get();
        VideoDecoderFactory videoDecoderFactory = (VideoDecoderFactory) this.f8753c.get();
        AbstractC16544l.m18094g(webrtcInitialization, "webrtcInitialization");
        if (videoDecoderFactory == null) {
            return zBooleanValue ? new C8950f(context) : new SoftwareVideoDecoderFactory();
        }
        return videoDecoderFactory;
    }
}
