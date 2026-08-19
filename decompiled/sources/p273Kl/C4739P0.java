package p273Kl;

import livekit.LivekitRtc$SignalRequest;
import livekit.LivekitRtc$SignalResponse;
import mm.C17296C;
import mm.C17309l;
import mo.InterfaceC17333J;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Kl.P0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4739P0 implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15441Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4750V0 f15442Z;

    public /* synthetic */ C4739P0(C4750V0 c4750v0, int i10) {
        this.f15441Y = i10;
        this.f15442Z = c4750v0;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) throws Throwable {
        switch (this.f15441Y) {
            case 0:
                C17309l c17309l = (C17309l) obj;
                InterfaceC17333J interfaceC17333J = (InterfaceC17333J) c17309l.f55136Y;
                LivekitRtc$SignalResponse livekitRtc$SignalResponse = (LivekitRtc$SignalResponse) c17309l.f55137Z;
                C4750V0 c4750v0 = this.f15442Z;
                c4750v0.f15495s.mo3230e();
                c4750v0.m5424n(interfaceC17333J, livekitRtc$SignalResponse);
                break;
            default:
                C4750V0 c4750v1 = this.f15442Z;
                c4750v1.f15492p.mo3230e();
                c4750v1.m5431u((LivekitRtc$SignalRequest) obj);
                break;
        }
        return C17296C.f55119a;
    }
}
