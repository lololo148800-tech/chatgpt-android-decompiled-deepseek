package p273Kl;

import io.livekit.android.room.C15102a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p557Wl.AbstractC8953i;

/* JADX INFO: renamed from: Kl.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C4728K extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C15102a f15402Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4728K(C15102a c15102a) {
        super(1);
        this.f15402Y = c15102a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        PeerConnection.PeerConnectionState newState = (PeerConnection.PeerConnectionState) obj;
        AbstractC16544l.m18094g(newState, "newState");
        int i10 = AbstractC8953i.f27374a[newState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f15402Y.m16217i();
        }
        return C17296C.f55119a;
    }
}
