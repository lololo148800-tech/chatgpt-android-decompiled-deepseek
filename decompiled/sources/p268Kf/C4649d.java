package p268Kf;

import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p216Id.AbstractC3693a;
import p216Id.C3694b;
import p403Qd.AbstractC6653q0;
import p403Qd.AbstractC6659u;
import p403Qd.C6600F;
import p403Qd.C6617X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C4649d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15117Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4649d c4649d = new C4649d(2, interfaceC18770c);
        c4649d.f15117Y = obj;
        return c4649d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4649d) create((C3694b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC6659u abstractC6659uM4404d = AbstractC3693a.m4404d(((C3694b) this.f15117Y).f11224i);
        C6600F c6600f = abstractC6659uM4404d instanceof C6600F ? (C6600F) abstractC6659uM4404d : null;
        AbstractC6653q0 abstractC6653q0 = c6600f != null ? c6600f.f21314f : null;
        return new C17309l(abstractC6653q0 instanceof C6617X ? (C6617X) abstractC6653q0 : null, abstractC6659uM4404d != null ? abstractC6659uM4404d.m7172d() : null);
    }
}
