package p273Kl;

import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p297Ll.C5125f;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C4751W extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15503Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5125f f15504Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4751W(C5125f c5125f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15504Z = c5125f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4751W c4751w = new C4751W(this.f15504Z, interfaceC18770c);
        c4751w.f15503Y = obj;
        return c4751w;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C4751W c4751w = (C4751W) create((PeerConnection) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c4751w.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ((PeerConnection) this.f15503Y).getStats(this.f15504Z);
        return C17296C.f55119a;
    }
}
