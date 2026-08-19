package p273Kl;

import io.livekit.android.room.C15102a;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4730L extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15416Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ DataChannel.Init f15417Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15102a f15418o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4730L(DataChannel.Init init, C15102a c15102a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15417Z = init;
        this.f15418o0 = c15102a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4730L c4730l = new C4730L(this.f15417Z, this.f15418o0, interfaceC18770c);
        c4730l.f15416Y = obj;
        return c4730l;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4730L) create((PeerConnection) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        DataChannel dataChannelCreateDataChannel = ((PeerConnection) this.f15416Y).createDataChannel("_reliable", this.f15417Z);
        AbstractC16544l.m18091d(dataChannelCreateDataChannel);
        dataChannelCreateDataChannel.registerObserver(new C4720G(this.f15418o0, dataChannelCreateDataChannel));
        return dataChannelCreateDataChannel;
    }
}
