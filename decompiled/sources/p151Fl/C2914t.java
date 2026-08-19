package p151Fl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.EglBase;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;

/* JADX INFO: renamed from: Fl.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C2914t implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4478i f8742a;

    public C2914t(InterfaceC4478i interfaceC4478i) {
        this.f8742a = interfaceC4478i;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        EglBase eglBase = (EglBase) this.f8742a.get();
        AbstractC16544l.m18094g(eglBase, "eglBase");
        EglBase.Context eglBaseContext = eglBase.getEglBaseContext();
        AbstractC16544l.m18093f(eglBaseContext, "getEglBaseContext(...)");
        return eglBaseContext;
    }
}
