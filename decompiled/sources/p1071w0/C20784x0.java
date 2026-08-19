package p1071w0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20784x0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Object f66027Y;

    /* JADX INFO: renamed from: Z */
    public int f66028Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f66029o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f66030p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC17406l f66031q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20784x0(InterfaceC5985X interfaceC5985X, long j10, InterfaceC17406l interfaceC17406l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66029o0 = interfaceC5985X;
        this.f66030p0 = j10;
        this.f66031q0 = interfaceC17406l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20784x0(this.f66029o0, this.f66030p0, this.f66031q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20784x0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC5985X interfaceC5985X;
        C17409o c17409o;
        C17409o c17409o2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66028Z;
        InterfaceC17406l interfaceC17406l = this.f66031q0;
        InterfaceC5985X interfaceC5985X2 = this.f66029o0;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC5985X = (InterfaceC5985X) this.f66027Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c17409o2 = (C17409o) this.f66027Y;
                AbstractC9233X.m9807c(obj);
            }
            c17409o = c17409o2;
            interfaceC5985X2.setValue(c17409o);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C17409o c17409o3 = (C17409o) interfaceC5985X2.getValue();
        if (c17409o3 != null) {
            C17408n c17408n = new C17408n(c17409o3);
            if (interfaceC17406l != null) {
                this.f66027Y = interfaceC5985X2;
                this.f66028Z = 1;
                if (interfaceC17406l.mo7769c(c17408n, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            interfaceC5985X = interfaceC5985X2;
        } else {
            c17409o = new C17409o(this.f66030p0);
            if (interfaceC17406l != null) {
                this.f66027Y = c17409o;
                this.f66028Z = 2;
                if (interfaceC17406l.mo7769c(c17409o, this) == enumC19250a) {
                    return enumC19250a;
                }
                c17409o2 = c17409o;
                c17409o = c17409o2;
            }
        }
        interfaceC5985X2.setValue(c17409o);
        return C17296C.f55119a;
        interfaceC5985X.setValue(null);
        c17409o = new C17409o(this.f66030p0);
        if (interfaceC17406l != null) {
            this.f66027Y = c17409o;
            this.f66028Z = 2;
            if (interfaceC17406l.mo7769c(c17409o, this) == enumC19250a) {
                return enumC19250a;
            }
            c17409o2 = c17409o;
            c17409o = c17409o2;
        }
        interfaceC5985X2.setValue(c17409o);
        return C17296C.f55119a;
    }
}
