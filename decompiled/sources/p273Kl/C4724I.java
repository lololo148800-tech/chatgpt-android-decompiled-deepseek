package p273Kl;

import io.livekit.android.room.C15102a;
import livekit.org.webrtc.DataChannel;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p275Kn.C4816c;
import p571X9.AbstractC9233X;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C4724I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C4816c f15360Y;

    /* JADX INFO: renamed from: Z */
    public C15102a f15361Z;

    /* JADX INFO: renamed from: o0 */
    public int f15362o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C15102a f15363p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4724I(C15102a c15102a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15363p0 = c15102a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m5405c(DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.unregisterObserver();
        }
        if (dataChannel != null) {
            dataChannel.close();
        }
        if (dataChannel != null) {
            dataChannel.dispose();
        }
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4724I(this.f15363p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4724I) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C4816c c4816c;
        C15102a c15102a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15362o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C15102a c15102a2 = this.f15363p0;
            c4816c = c15102a2.f46940B;
            this.f15360Y = c4816c;
            this.f15361Z = c15102a2;
            this.f15362o0 = 1;
            if (c4816c.m5448e(null, this) == enumC19250a) {
                return enumC19250a;
            }
            c15102a = c15102a2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c15102a = this.f15361Z;
            c4816c = this.f15360Y;
            AbstractC9233X.m9807c(obj);
        }
        try {
            c15102a.f46956p.f15341c = null;
            c15102a.f46957q.f15517d = null;
            C4808y c4808y = c15102a.f46958r;
            if (c4808y != null) {
                AbstractC0575H.m1161I(C18777j.f59682Y, new C4770f(c4808y, null));
            }
            c15102a.f46958r = null;
            C4808y c4808y2 = c15102a.f46959s;
            if (c4808y2 != null) {
                AbstractC0575H.m1161I(C18777j.f59682Y, new C4770f(c4808y2, null));
            }
            c15102a.f46959s = null;
            DataChannel dataChannel = c15102a.f46960t;
            if (dataChannel != null) {
                m5405c(dataChannel);
            }
            c15102a.f46960t = null;
            DataChannel dataChannel2 = c15102a.f46961u;
            if (dataChannel2 != null) {
                m5405c(dataChannel2);
            }
            c15102a.f46961u = null;
            DataChannel dataChannel3 = c15102a.f46962v;
            if (dataChannel3 != null) {
                m5405c(dataChannel3);
            }
            c15102a.f46962v = null;
            DataChannel dataChannel4 = c15102a.f46963w;
            if (dataChannel4 != null) {
                m5405c(dataChannel4);
            }
            c15102a.f46963w = null;
            c15102a.f46964x = false;
            return C17296C.f55119a;
        } finally {
            c4816c.m5450g(null);
        }
    }
}
