package pf;

import java.util.List;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p349O0.InterfaceC5985X;
import p492U1.C7545j;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p860l0.AbstractC16689K1;
import p860l0.AbstractC16750j0;
import p860l0.C16663C;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: pf.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C18408x extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f58723Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f58724o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f58725p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f58726q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC5985X f58727r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC5985X f58728s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18408x(InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC5985X interfaceC5985X3, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58725p0 = interfaceC1436k;
        this.f58726q0 = interfaceC5985X;
        this.f58727r0 = interfaceC5985X2;
        this.f58728s0 = interfaceC5985X3;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        InterfaceC5985X interfaceC5985X = this.f58727r0;
        C18408x c18408x = new C18408x(this.f58725p0, this.f58726q0, interfaceC5985X, this.f58728s0, interfaceC18770c);
        c18408x.f58724o0 = obj;
        return c18408x;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18408x) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        C16557y c16557y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f58723Z;
        InterfaceC5985X interfaceC5985X = this.f58727r0;
        if (i10 != 0) {
            if (i10 == 1) {
                c19748y = (C19748y) this.f58724o0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c16557y = (C16557y) this.f58724o0;
                AbstractC9233X.m9807c(obj);
            }
            float f10 = c16557y.f51286Y;
            List list = AbstractC18384B.f58664a;
            this.f58725p0.invoke(new Long((long) (((Number) ((C17309l) this.f58728s0.getValue()).f55137Z).floatValue() * f10)));
            interfaceC5985X.setValue(null);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        c19748y = (C19748y) this.f58724o0;
        this.f58724o0 = c19748y;
        this.f58723Z = 1;
        obj = AbstractC16689K1.m18506c(c19748y, null, this, 3);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C19738o c19738o = (C19738o) obj;
        c19738o.m20691a();
        C16557y c16557y2 = new C16557y();
        float fM15306g = C13800b.m15306g(c19738o.f62480c);
        InterfaceC5985X interfaceC5985X2 = this.f58726q0;
        List list2 = AbstractC18384B.f58664a;
        float f11 = fM15306g / ((int) (((C7545j) interfaceC5985X2.getValue()).f23903a >> 32));
        c16557y2.f51286Y = f11;
        interfaceC5985X.setValue(new Float(f11));
        C16663C c16663c = new C16663C(c16557y2, interfaceC5985X2, interfaceC5985X, 5);
        this.f58724o0 = c16557y2;
        this.f58723Z = 2;
        if (AbstractC16750j0.m18527k(c19748y, c19738o.f62478a, c16663c, this) == enumC19250a) {
            return enumC19250a;
        }
        c16557y = c16557y2;
        float f12 = c16557y.f51286Y;
        List list3 = AbstractC18384B.f58664a;
        this.f58725p0.invoke(new Long((long) (((Number) ((C17309l) this.f58728s0.getValue()).f55137Z).floatValue() * f12)));
        interfaceC5985X.setValue(null);
        return C17296C.f55119a;
    }
}
