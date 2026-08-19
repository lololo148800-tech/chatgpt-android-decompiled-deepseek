package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p278L0.AbstractC4850N;
import p349O0.InterfaceC5985X;
import p492U1.C7540e;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p894n0.InterfaceC17405k;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.q3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4117q3 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f13255Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13756d f13256Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f13257o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f13258p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC17405k f13259q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC5985X f13260r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4117q3(C13756d c13756d, float f10, boolean z6, InterfaceC17405k interfaceC17405k, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f13256Z = c13756d;
        this.f13257o0 = f10;
        this.f13258p0 = z6;
        this.f13259q0 = interfaceC17405k;
        this.f13260r0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4117q3(this.f13256Z, this.f13257o0, this.f13258p0, this.f13259q0, this.f13260r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4117q3) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f13255Y;
        InterfaceC17405k interfaceC17405k = this.f13259q0;
        InterfaceC5985X interfaceC5985X = this.f13260r0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13756d c13756d = this.f13256Z;
            float f10 = ((C7540e) c13756d.f43413e.getValue()).f23894Y;
            float f11 = this.f13257o0;
            if (!C7540e.m7873a(f10, f11)) {
                if (this.f13258p0) {
                    InterfaceC17405k interfaceC17405k2 = (InterfaceC17405k) interfaceC5985X.getValue();
                    this.f13255Y = 2;
                    if (AbstractC4850N.m5498a(c13756d, f11, interfaceC17405k2, interfaceC17405k, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    C7540e c7540e = new C7540e(f11);
                    this.f13255Y = 1;
                    if (c13756d.m15226g(c7540e, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        interfaceC5985X.setValue(interfaceC17405k);
        return C17296C.f55119a;
    }
}
