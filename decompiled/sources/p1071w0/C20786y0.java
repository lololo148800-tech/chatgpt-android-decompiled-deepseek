package p1071w0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.C17410p;
import p894n0.InterfaceC17405k;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20786y0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC5985X f66038Y;

    /* JADX INFO: renamed from: Z */
    public int f66039Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f66040o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f66041p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC17406l f66042q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20786y0(InterfaceC5985X interfaceC5985X, boolean z6, InterfaceC17406l interfaceC17406l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66040o0 = interfaceC5985X;
        this.f66041p0 = z6;
        this.f66042q0 = interfaceC17406l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20786y0(this.f66040o0, this.f66041p0, this.f66042q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20786y0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC5985X interfaceC5985X;
        InterfaceC5985X interfaceC5985X2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66039Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            interfaceC5985X = this.f66040o0;
            C17409o c17409o = (C17409o) interfaceC5985X.getValue();
            if (c17409o != null) {
                InterfaceC17405k c17410p = this.f66041p0 ? new C17410p(c17409o) : new C17408n(c17409o);
                InterfaceC17406l interfaceC17406l = this.f66042q0;
                if (interfaceC17406l != null) {
                    this.f66038Y = interfaceC5985X;
                    this.f66039Z = 1;
                    if (interfaceC17406l.mo7769c(c17410p, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    interfaceC5985X2 = interfaceC5985X;
                }
                interfaceC5985X.setValue(null);
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC5985X2 = this.f66038Y;
        AbstractC9233X.m9807c(obj);
        interfaceC5985X = interfaceC5985X2;
        interfaceC5985X.setValue(null);
        return C17296C.f55119a;
    }
}
