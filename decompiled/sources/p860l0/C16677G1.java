package p860l0;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p1014t1.EnumC19730g;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: l0.G1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16677G1 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f53412Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f53413o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC0571F f53414p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f53415q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f53416r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16525B f53417s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C16685J0 f53418t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16677G1(InterfaceC0571F interfaceC0571F, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C16525B c16525b, C16685J0 c16685j0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53414p0 = interfaceC0571F;
        this.f53415q0 = interfaceC1436k;
        this.f53416r0 = interfaceC1436k2;
        this.f53417s0 = c16525b;
        this.f53418t0 = c16685j0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16677G1 c16677g1 = new C16677G1(this.f53414p0, this.f53415q0, this.f53416r0, this.f53417s0, this.f53418t0, interfaceC18770c);
        c16677g1.f53413o0 = obj;
        return c16677g1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16677G1) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53412Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19748y c19748y = (C19748y) this.f53413o0;
            this.f53412Z = 1;
            obj = AbstractC16689K1.m18509f(c19748y, EnumC19730g.f62466Z, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C19738o c19738o = (C19738o) obj;
        C17296C c17296c = C17296C.f55119a;
        C16685J0 c16685j0 = this.f53418t0;
        InterfaceC0571F interfaceC0571F = this.f53414p0;
        if (c19738o != null) {
            c19738o.m20691a();
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16671E1(c16685j0, null), 3);
            this.f53415q0.invoke(new C13800b(c19738o.f62480c));
            return c17296c;
        }
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16674F1(c16685j0, null), 3);
        InterfaceC1436k interfaceC1436k = this.f53416r0;
        if (interfaceC1436k == null) {
            return null;
        }
        interfaceC1436k.invoke(new C13800b(((C19738o) this.f53417s0.f51262Y).f62480c));
        return c17296c;
    }
}
