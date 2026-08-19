package p175Gl;

import android.javax.sip.C10808o;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.FrameCryptorAlgorithm;
import livekit.org.webrtc.PeerConnectionFactory;
import p248Jk.InterfaceC4478i;
import p720e6.C13287b;

/* JADX INFO: renamed from: Gl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3104c {

    /* JADX INFO: renamed from: a */
    public final C13287b f9338a;

    public C3104c(C13287b c13287b) {
        this.f9338a = c13287b;
    }

    /* JADX INFO: renamed from: a */
    public final C3103b m3932a(C10808o keyProvider) {
        PeerConnectionFactory peerConnectionFactory = (PeerConnectionFactory) ((InterfaceC4478i) this.f9338a.f42000Z).get();
        AbstractC16544l.m18094g(keyProvider, "keyProvider");
        AbstractC16544l.m18094g(peerConnectionFactory, "peerConnectionFactory");
        C3103b c3103b = new C3103b();
        c3103b.f9334d = new LinkedHashMap();
        c3103b.f9335e = FrameCryptorAlgorithm.AES_GCM;
        c3103b.f9332b = keyProvider;
        c3103b.f9333c = peerConnectionFactory;
        return c3103b;
    }
}
