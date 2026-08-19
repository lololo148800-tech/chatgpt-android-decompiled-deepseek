package p1071w0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1440o;
import p153Fn.C2925c;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p860l0.C16685J0;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20788z0 extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public int f66045Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ C16685J0 f66046Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ long f66047o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2925c f66048p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f66049q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC17406l f66050r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20788z0(C2925c c2925c, InterfaceC5985X interfaceC5985X, InterfaceC17406l interfaceC17406l, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f66048p0 = c2925c;
        this.f66049q0 = interfaceC5985X;
        this.f66050r0 = interfaceC17406l;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j10 = ((C13800b) obj2).f43584a;
        C20788z0 c20788z0 = new C20788z0(this.f66048p0, this.f66049q0, this.f66050r0, (InterfaceC18770c) obj3);
        c20788z0.f66046Z = (C16685J0) obj;
        c20788z0.f66047o0 = j10;
        return c20788z0.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66045Y;
        C2925c c2925c = this.f66048p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16685J0 c16685j0 = this.f66046Z;
            AbstractC0575H.m1156D(c2925c, null, null, new C20784x0(this.f66049q0, this.f66047o0, this.f66050r0, null), 3);
            this.f66045Y = 1;
            obj = c16685j0.m18503c(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC0575H.m1156D(c2925c, null, null, new C20786y0(this.f66049q0, ((Boolean) obj).booleanValue(), this.f66050r0, null), 3);
        return C17296C.f55119a;
    }
}
