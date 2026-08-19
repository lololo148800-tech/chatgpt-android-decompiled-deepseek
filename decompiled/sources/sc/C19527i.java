package sc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p860l0.C16685J0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: sc.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C19527i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f62029Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f62030Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19723A f62031o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f62032p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1440o f62033q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f62034r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1436k f62035s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f62036t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19527i(C19723A c19723a, InterfaceC1436k interfaceC1436k, InterfaceC1440o interfaceC1440o, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, InterfaceC1436k interfaceC1436k4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62031o0 = c19723a;
        this.f62032p0 = interfaceC1436k;
        this.f62033q0 = interfaceC1440o;
        this.f62034r0 = interfaceC1436k2;
        this.f62035s0 = interfaceC1436k3;
        this.f62036t0 = interfaceC1436k4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C19527i c19527i = new C19527i(this.f62031o0, this.f62032p0, this.f62033q0, this.f62034r0, this.f62035s0, this.f62036t0, interfaceC18770c);
        c19527i.f62030Z = obj;
        return c19527i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19527i) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f62029Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f62030Z;
            C19723A c19723a = this.f62031o0;
            C19526h c19526h = new C19526h(this.f62032p0, new C16685J0(1, c19723a), this.f62033q0, interfaceC0571F, this.f62034r0, this.f62035s0, this.f62036t0, null);
            this.f62029Y = 1;
            if (AbstractC8717t4.m9428b(c19723a, c19526h, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
