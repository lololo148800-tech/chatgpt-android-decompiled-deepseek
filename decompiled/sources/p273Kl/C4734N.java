package p273Kl;

import io.livekit.android.room.C15102a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p557Wl.AbstractC8953i;
import p867l8.C16831c;

/* JADX INFO: renamed from: Kl.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C4734N extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C15102a f15423Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4734N(C15102a c15102a) {
        super(1);
        this.f15423Y = c15102a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        PeerConnection.PeerConnectionState newState = (PeerConnection.PeerConnectionState) obj;
        AbstractC16544l.m18094g(newState, "newState");
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            newState.toString();
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        boolean z6 = newState == PeerConnection.PeerConnectionState.CONNECTED;
        C15102a c15102a = this.f15423Y;
        if (z6) {
            c15102a.m16219k(EnumC4759a.f15525Z);
        } else {
            int i10 = AbstractC8953i.f27374a[newState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                c15102a.m16219k(EnumC4759a.f15526o0);
            }
        }
        return C17296C.f55119a;
    }
}
