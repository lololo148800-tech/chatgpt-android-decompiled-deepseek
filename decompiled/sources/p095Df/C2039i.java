package p095Df;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1071w0.AbstractC20734X;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6241o;
import p409Qk.C6752c;
import p523V9.AbstractC8056b6;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.AbstractC16459g;
import p857kl.C16438E;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Df.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C2039i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6248Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6249Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2040j f6250o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Set f6251p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2039i(C2040j c2040j, Set set, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6250o0 = c2040j;
        this.f6251p0 = set;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2039i c2039i = new C2039i(this.f6250o0, this.f6251p0, interfaceC18770c);
        c2039i.f6249Z = obj;
        return c2039i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2039i) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3777y interfaceC3777yM18075c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6248Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f6249Z;
            C6752c c6752c = this.f6250o0.f6252a;
            C13693c c13693c = new C13693c();
            c13693c.f43200f.m20652f(AbstractC6241o.f20320b, c17296c);
            AbstractC13695e.m15173c(c13693c, "attributions", null, 23);
            c13693c.f43198d = new C2034d(AbstractC17680n.m19322C0(this.f6251p0));
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C2034d.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C2034d.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
            AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
            AbstractC8056b6.m8451b(c13693c, AbstractC16459g.f51064b);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50985c, c13693c, c6752c);
            C2038h c2038h = new C2038h(interfaceC2186j, null);
            this.f6248Y = 1;
            if (c14535jM21254y.m16037b(c2038h, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
