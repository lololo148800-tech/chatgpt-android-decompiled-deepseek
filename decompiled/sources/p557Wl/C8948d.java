package p557Wl;

import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.ExternalAudioProcessingFactory;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p101Dl.InterfaceC2111l;

/* JADX INFO: renamed from: Wl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C8948d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8949e f27356Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8948d(C8949e c8949e) {
        super(2);
        this.f27356Y = c8949e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ExternalAudioProcessingFactory externalAudioProcessingFactory = this.f27356Y.f27358a;
        C8945a c8945a = new C8945a();
        c8945a.f27352a = (InterfaceC2111l) obj;
        externalAudioProcessingFactory.setRenderPreProcessing(c8945a);
        return C17296C.f55119a;
    }
}
