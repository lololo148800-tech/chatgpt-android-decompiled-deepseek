package p486Tl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Tl.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C7510i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f23826Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7510i c7510i = new C7510i(2, interfaceC18770c);
        c7510i.f23826Y = obj;
        return c7510i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7510i) create((PeerConnection.PeerConnectionState) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        PeerConnection.PeerConnectionState peerConnectionState = (PeerConnection.PeerConnectionState) this.f23826Y;
        AbstractC16544l.m18094g(peerConnectionState, "<this>");
        return Boolean.valueOf(!(peerConnectionState == PeerConnection.PeerConnectionState.CONNECTED));
    }
}
