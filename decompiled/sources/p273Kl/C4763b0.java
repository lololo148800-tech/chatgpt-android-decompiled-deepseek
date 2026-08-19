package p273Kl;

import io.livekit.android.room.C15102a;
import java.util.List;
import livekit.org.webrtc.MediaConstraints;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p482Tg.C7448e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4763b0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C15102a f15544Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4763b0(C15102a c15102a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15544Y = c15102a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4763b0(this.f15544Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C4763b0 c4763b0 = (C4763b0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c4763b0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C7448e c7448e;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C15102a c15102a = this.f15544Y;
        C4808y c4808y = c15102a.f46958r;
        if (c4808y != null && (c7448e = c4808y.f15686i) != null) {
            MediaConstraints mediaConstraints = new MediaConstraints();
            List<MediaConstraints.KeyValuePair> list = mediaConstraints.mandatory;
            list.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "false"));
            list.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "false"));
            if (c15102a.m16214f() == EnumC4759a.f15527p0 || c15102a.m16214f() == EnumC4759a.f15528q0) {
                list.add(new MediaConstraints.KeyValuePair("IceRestart", "true"));
            }
            c7448e.invoke(mediaConstraints);
        }
        return C17296C.f55119a;
    }
}
