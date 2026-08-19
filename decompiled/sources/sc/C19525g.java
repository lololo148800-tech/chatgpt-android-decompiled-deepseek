package sc;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p275Kn.C4816c;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p860l0.C16685J0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: sc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C19525g extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f62010Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f62011o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16685J0 f62012p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f62013q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f62014r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16525B f62015s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19525g(C16685J0 c16685j0, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62012p0 = c16685j0;
        this.f62013q0 = interfaceC1436k;
        this.f62014r0 = interfaceC1436k2;
        this.f62015s0 = c16525b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C19525g c19525g = new C19525g(this.f62012p0, this.f62013q0, this.f62014r0, this.f62015s0, interfaceC18770c);
        c19525g.f62011o0 = obj;
        return c19525g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19525g) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f62010Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19748y c19748y = (C19748y) this.f62011o0;
            this.f62010Z = 1;
            obj = AbstractC19529k.m20623b(c19748y, this);
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
        C16685J0 c16685j0 = this.f62012p0;
        C4816c c4816c = c16685j0.f53461q0;
        if (c19738o != null) {
            c19738o.m20691a();
            c16685j0.f53459o0 = true;
            c4816c.m5450g(null);
            this.f62013q0.invoke(new C13800b(c19738o.f62480c));
            return c17296c;
        }
        c16685j0.f53460p0 = true;
        c4816c.m5450g(null);
        InterfaceC1436k interfaceC1436k = this.f62014r0;
        if (interfaceC1436k == null) {
            return null;
        }
        interfaceC1436k.invoke(new C13800b(((C19738o) this.f62015s0.f51262Y).f62480c));
        return c17296c;
    }
}
