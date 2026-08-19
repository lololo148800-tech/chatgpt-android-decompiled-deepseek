package p129En;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17312o;
import p008A6.C0384d;
import p025An.AbstractC0575H;
import p103Dn.InterfaceC2186j;
import p1113xn.AbstractC21323q;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.InterfaceC19688d;

/* JADX INFO: renamed from: En.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C2582B extends AbstractC19687c implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC2186j f8016Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC18776i f8017Z;

    /* JADX INFO: renamed from: o0 */
    public final int f8018o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC18776i f8019p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC18770c f8020q0;

    public C2582B(InterfaceC2186j interfaceC2186j, InterfaceC18776i interfaceC18776i) {
        super(C2615z.f8103Y, C18777j.f59682Y);
        this.f8016Y = interfaceC2186j;
        this.f8017Z = interfaceC18776i;
        this.f8018o0 = ((Number) interfaceC18776i.fold(0, new C0384d(5))).intValue();
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        try {
            Object objM3608c = m3608c(interfaceC18770c, obj);
            return objM3608c == EnumC19250a.f61036Y ? objM3608c : C17296C.f55119a;
        } catch (Throwable th2) {
            this.f8019p0 = new C2611v(interfaceC18770c.getContext(), th2);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m3608c(InterfaceC18770c interfaceC18770c, Object obj) {
        InterfaceC18776i context = interfaceC18770c.getContext();
        AbstractC0575H.m1187p(context);
        InterfaceC18776i interfaceC18776i = this.f8019p0;
        if (interfaceC18776i != context) {
            if (interfaceC18776i instanceof C2611v) {
                throw new IllegalStateException(AbstractC21323q.m21717d("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C2611v) interfaceC18776i).f8098Z + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new C2585E(this, 0))).intValue() != this.f8018o0) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f8017Z + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f8019p0 = context;
        }
        this.f8020q0 = interfaceC18770c;
        C2583C c2583c = AbstractC2584D.f8022a;
        InterfaceC2186j interfaceC2186j = this.f8016Y;
        AbstractC16544l.m18092e(interfaceC2186j, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        c2583c.getClass();
        Object objMo395a = interfaceC2186j.mo395a(obj, this);
        if (!AbstractC16544l.m18089b(objMo395a, EnumC19250a.f61036Y)) {
            this.f8020q0 = null;
        }
        return objMo395a;
    }

    @Override // sm.AbstractC19685a, sm.InterfaceC19688d
    public final InterfaceC19688d getCallerFrame() {
        InterfaceC18770c interfaceC18770c = this.f8020q0;
        if (interfaceC18770c instanceof InterfaceC19688d) {
            return (InterfaceC19688d) interfaceC18770c;
        }
        return null;
    }

    @Override // sm.AbstractC19687c, p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        InterfaceC18776i interfaceC18776i = this.f8019p0;
        return interfaceC18776i == null ? C18777j.f59682Y : interfaceC18776i;
    }

    @Override // sm.AbstractC19685a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Throwable thM18979a = C17312o.m18979a(obj);
        if (thM18979a != null) {
            this.f8019p0 = new C2611v(getContext(), thM18979a);
        }
        InterfaceC18770c interfaceC18770c = this.f8020q0;
        if (interfaceC18770c != null) {
            interfaceC18770c.resumeWith(obj);
        }
        return EnumC19250a.f61036Y;
    }
}
