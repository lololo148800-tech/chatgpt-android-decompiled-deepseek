package p344Nl;

import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpReceiver;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p193Hf.C3350b0;
import p387Pl.C6469P;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Nl.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C5824F extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19019Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5825G f19020Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ MediaStreamTrack f19021o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f19022p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3350b0 f19023q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ RtpReceiver f19024r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean f19025s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f19026t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5824F(C5825G c5825g, MediaStreamTrack mediaStreamTrack, String str, C3350b0 c3350b0, RtpReceiver rtpReceiver, boolean z6, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19020Z = c5825g;
        this.f19021o0 = mediaStreamTrack;
        this.f19022p0 = str;
        this.f19023q0 = c3350b0;
        this.f19024r0 = rtpReceiver;
        this.f19025s0 = z6;
        this.f19026t0 = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5824F(this.f19020Z, this.f19021o0, this.f19022p0, this.f19023q0, this.f19024r0, this.f19025s0, this.f19026t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5824F) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws C6469P {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19019Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f19019Y = 1;
            if (AbstractC0575H.m1184m(150L, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        this.f19020Z.m6227k(this.f19021o0, this.f19022p0, this.f19023q0, this.f19024r0, this.f19025s0, this.f19026t0 - 1);
        return C17296C.f55119a;
    }
}
