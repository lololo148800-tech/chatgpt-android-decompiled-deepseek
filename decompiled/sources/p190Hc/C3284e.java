package p190Hc;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p571X9.AbstractC9233X;
import p948pi.AbstractC18425h;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3284e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC3283d f10008Y;

    /* JADX INFO: renamed from: Z */
    public int f10009Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f10010o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3287h f10011p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3284e(C3287h c3287h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10011p0 = c3287h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3284e c3284e = new C3284e(this.f10011p0, interfaceC18770c);
        c3284e.f10010o0 = obj;
        return c3284e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3284e) create((AbstractC18425h) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC18425h abstractC18425h;
        InterfaceC3283d interfaceC3283d;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10009Z;
        C3287h c3287h = this.f10011p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            abstractC18425h = (AbstractC18425h) this.f10010o0;
            InterfaceC3283d interfaceC3283d2 = (InterfaceC3283d) c3287h.f10024r0.getValue();
            if (!AbstractC16544l.m18089b(interfaceC3283d2.mo3171g(), abstractC18425h)) {
                this.f10010o0 = abstractC18425h;
                this.f10008Y = interfaceC3283d2;
                this.f10009Z = 1;
                if (C3287h.m4157d(c3287h, interfaceC3283d2, this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC3283d = interfaceC3283d2;
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC3283d = this.f10008Y;
        abstractC18425h = (AbstractC18425h) this.f10010o0;
        AbstractC9233X.m9807c(obj);
        C2153Q0 c2153q0 = c3287h.f10024r0;
        InterfaceC3283d interfaceC3283dM4161e = c3287h.m4161e(abstractC18425h);
        c3287h.m4162f(interfaceC3283d, interfaceC3283dM4161e);
        c2153q0.getClass();
        c2153q0.m3251l(null, interfaceC3283dM4161e);
        return C17296C.f55119a;
    }
}
