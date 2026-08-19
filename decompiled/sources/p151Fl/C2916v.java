package p151Fl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.PeerConnectionFactory;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;

/* JADX INFO: renamed from: Fl.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C2916v implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4478i f8750a;

    public C2916v(InterfaceC4478i interfaceC4478i) {
        this.f8750a = interfaceC4478i;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        PeerConnectionFactory peerConnectionFactory = (PeerConnectionFactory) this.f8750a.get();
        AbstractC16544l.m18094g(peerConnectionFactory, "peerConnectionFactory");
        return new C2910p(peerConnectionFactory);
    }
}
