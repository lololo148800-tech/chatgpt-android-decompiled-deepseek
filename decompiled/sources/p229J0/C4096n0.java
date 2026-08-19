package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p278L0.AbstractC4850N;
import p492U1.C7540e;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p894n0.C17396b;
import p894n0.C17398d;
import p894n0.C17402h;
import p894n0.C17409o;
import p894n0.InterfaceC17405k;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4096n0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f13127Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13756d f13128Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f13129o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f13130p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4102o0 f13131q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC17405k f13132r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4096n0(C13756d c13756d, float f10, boolean z6, C4102o0 c4102o0, InterfaceC17405k interfaceC17405k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f13128Z = c13756d;
        this.f13129o0 = f10;
        this.f13130p0 = z6;
        this.f13131q0 = c4102o0;
        this.f13132r0 = interfaceC17405k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4096n0(this.f13128Z, this.f13129o0, this.f13130p0, this.f13131q0, this.f13132r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4096n0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC17405k c17396b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f13127Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13756d c13756d = this.f13128Z;
            float f10 = ((C7540e) c13756d.f43413e.getValue()).f23894Y;
            float f11 = this.f13129o0;
            if (!C7540e.m7873a(f10, f11)) {
                if (this.f13130p0) {
                    float f12 = ((C7540e) c13756d.f43413e.getValue()).f23894Y;
                    C4102o0 c4102o0 = this.f13131q0;
                    if (C7540e.m7873a(f12, c4102o0.f13156b)) {
                        c17396b = new C17409o(0L);
                    } else if (C7540e.m7873a(f12, c4102o0.f13158d)) {
                        c17396b = new C17402h();
                    } else if (C7540e.m7873a(f12, c4102o0.f13157c)) {
                        c17396b = new C17398d();
                    } else {
                        c17396b = C7540e.m7873a(f12, c4102o0.f13159e) ? new C17396b() : null;
                    }
                    this.f13127Y = 2;
                    if (AbstractC4850N.m5498a(c13756d, f11, c17396b, this.f13132r0, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    C7540e c7540e = new C7540e(f11);
                    this.f13127Y = 1;
                    if (c13756d.m15226g(c7540e, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
