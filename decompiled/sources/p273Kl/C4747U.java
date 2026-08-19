package p273Kl;

import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RTCStatsReport;
import livekit.org.webrtc.RtpReceiver;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C4747U extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15463Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4808y f15464Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ RTCStatsCollectorCallback f15465o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ RtpReceiver f15466p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4747U(C4808y c4808y, RTCStatsCollectorCallback rTCStatsCollectorCallback, RtpReceiver rtpReceiver, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15464Z = c4808y;
        this.f15465o0 = rTCStatsCollectorCallback;
        this.f15466p0 = rtpReceiver;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4747U(this.f15464Z, this.f15465o0, this.f15466p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4747U) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C17296C c17296c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15463Y;
        RTCStatsCollectorCallback rTCStatsCollectorCallback = this.f15465o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            c17296c = null;
            C4808y c4808y = this.f15464Z;
            if (c4808y != null) {
                C4745T c4745t = new C4745T(this.f15466p0, rTCStatsCollectorCallback, null);
                this.f15463Y = 1;
                obj = c4808y.m5444h(c4745t, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            }
            if (c17296c == null) {
                rTCStatsCollectorCallback.onStatsDelivered(new RTCStatsReport(0L, C17690x.f56481Y));
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        c17296c = (C17296C) obj;
        if (c17296c == null) {
            rTCStatsCollectorCallback.onStatsDelivered(new RTCStatsReport(0L, C17690x.f56481Y));
        }
        return C17296C.f55119a;
    }
}
