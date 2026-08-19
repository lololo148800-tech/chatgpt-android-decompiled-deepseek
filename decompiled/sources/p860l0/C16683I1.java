package p860l0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.I1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16683I1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53448Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f53449Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19723A f53450o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1440o f53451p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f53452q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f53453r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1436k f53454s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16683I1(C19723A c19723a, InterfaceC1440o interfaceC1440o, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53450o0 = c19723a;
        this.f53451p0 = interfaceC1440o;
        this.f53452q0 = interfaceC1436k;
        this.f53453r0 = interfaceC1436k2;
        this.f53454s0 = interfaceC1436k3;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16683I1 c16683i1 = new C16683I1(this.f53450o0, this.f53451p0, this.f53452q0, this.f53453r0, this.f53454s0, interfaceC18770c);
        c16683i1.f53449Z = obj;
        return c16683i1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16683I1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53448Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f53449Z;
            C19723A c19723a = this.f53450o0;
            C16685J0 c16685j0 = new C16685J0(0, c19723a);
            C16680H1 c16680h1 = new C16680H1(interfaceC0571F, this.f53451p0, this.f53452q0, this.f53453r0, this.f53454s0, c16685j0, null);
            this.f53448Y = 1;
            if (AbstractC8717t4.m9428b(c19723a, c16680h1, this) == enumC19250a) {
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
