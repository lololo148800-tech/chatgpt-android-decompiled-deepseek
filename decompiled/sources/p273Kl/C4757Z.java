package p273Kl;

import io.livekit.android.room.C15102a;
import livekit.org.webrtc.RTCStatsReport;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p297Ll.C5125f;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C4757Z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15519Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15102a f15520Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5125f f15521o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4757Z(C15102a c15102a, C5125f c5125f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15520Z = c15102a;
        this.f15521o0 = c5125f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4757Z(this.f15520Z, this.f15521o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4757Z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C17296C c17296c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15519Y;
        C5125f c5125f = this.f15521o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4808y c4808y = this.f15520Z.f46959s;
            c17296c = null;
            if (c4808y != null) {
                C4755Y c4755y = new C4755Y(c5125f, null);
                this.f15519Y = 1;
                obj = c4808y.m5444h(c4755y, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            }
            if (c17296c == null) {
                c5125f.onStatsDelivered(new RTCStatsReport(0L, C17690x.f56481Y));
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        c17296c = (C17296C) obj;
        if (c17296c == null) {
            c5125f.onStatsDelivered(new RTCStatsReport(0L, C17690x.f56481Y));
        }
        return C17296C.f55119a;
    }
}
