package pf;

import java.util.List;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p229J0.C4041e;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pf.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C18383A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f58658Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13756d f58659Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f58660o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f58661p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f58662q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ List f58663r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18383A(C13756d c13756d, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, int i10, List list, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58659Z = c13756d;
        this.f58660o0 = interfaceC5985X;
        this.f58661p0 = interfaceC5985X2;
        this.f58662q0 = i10;
        this.f58663r0 = list;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18383A(this.f58659Z, this.f58660o0, this.f58661p0, this.f58662q0, this.f58663r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18383A) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f58658Y;
        InterfaceC5985X interfaceC5985X = this.f58660o0;
        InterfaceC5985X interfaceC5985X2 = this.f58661p0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        List list = AbstractC18384B.f58664a;
        interfaceC5985X2.setValue((List) interfaceC5985X.getValue());
        Float f10 = new Float(0.0f);
        this.f58658Y = 1;
        if (this.f58659Z.m15226g(f10, this) == enumC19250a) {
            return enumC19250a;
        }
        Float f11 = new Float(1.0f);
        C4041e c4041e = new C4041e(this.f58662q0, this.f58663r0, interfaceC5985X2, interfaceC5985X, 5);
        this.f58658Y = 2;
        if (C13756d.m15222c(this.f58659Z, f11, null, c4041e, this, 6) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
