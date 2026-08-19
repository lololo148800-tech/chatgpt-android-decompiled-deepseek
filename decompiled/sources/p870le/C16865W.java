package p870le;

import ge.C14111x0;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p229J0.C3899D4;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: le.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C16865W extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54113Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14111x0 f54114Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3899D4 f54115o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f54116p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16865W(C14111x0 c14111x0, C3899D4 c3899d4, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54114Z = c14111x0;
        this.f54115o0 = c3899d4;
        this.f54116p0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16865W(this.f54114Z, this.f54115o0, this.f54116p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16865W) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54113Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            boolean zM15495i = this.f54114Z.m15495i();
            InterfaceC5985X interfaceC5985X = this.f54116p0;
            if (zM15495i) {
                int i11 = AbstractC16868Z.f54123c;
                interfaceC5985X.setValue(Boolean.TRUE);
                this.f54113Y = 1;
                if (this.f54115o0.m4609b(EnumC14284g0.f44821Y, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                int i12 = AbstractC16868Z.f54123c;
                if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                    int i13 = AbstractC16868Z.f54123c;
                    interfaceC5985X.setValue(Boolean.TRUE);
                    this.f54113Y = 1;
                    if (this.f54115o0.m4609b(EnumC14284g0.f44821Y, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
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
