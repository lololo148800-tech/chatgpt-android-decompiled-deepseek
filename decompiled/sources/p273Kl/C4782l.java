package p273Kl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C4782l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4808y f15589Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4782l(C4808y c4808y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15589Y = c4808y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4782l(this.f15589Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4782l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        PeerConnection peerConnection = this.f15589Y.f15680c;
        AbstractC16544l.m18094g(peerConnection, "<this>");
        PeerConnection.PeerConnectionState peerConnectionStateConnectionState = peerConnection.connectionState();
        AbstractC16544l.m18093f(peerConnectionStateConnectionState, "connectionState(...)");
        return Boolean.valueOf(peerConnectionStateConnectionState == PeerConnection.PeerConnectionState.CONNECTED);
    }
}
