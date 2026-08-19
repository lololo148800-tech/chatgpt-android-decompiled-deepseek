package p151Fl;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.PeerConnectionFactory;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p117Eb.C2385o;

/* JADX INFO: renamed from: Fl.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C2908n extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Context f8722Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2908n(Context context) {
        super(0);
        this.f8722Y = context;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        if (!AbstractC2911q.f8730a) {
            AbstractC2911q.f8730a = true;
            PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(this.f8722Y).setNativeLibraryName("lkjingle_peerconnection_so").setInjectableLogger(new C2385o(2), Logging.Severity.LS_VERBOSE).createInitializationOptions());
        }
        return C17296C.f55119a;
    }
}
