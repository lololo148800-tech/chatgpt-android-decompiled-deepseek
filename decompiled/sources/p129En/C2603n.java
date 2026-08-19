package p129En;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C2603n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8069Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8070Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2604o f8071o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC2186j f8072p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2603n(C2604o c2604o, InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8071o0 = c2604o;
        this.f8072p0 = interfaceC2186j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2603n c2603n = new C2603n(this.f8071o0, this.f8072p0, interfaceC18770c);
        c2603n.f8070Z = obj;
        return c2603n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2603n) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8069Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f8070Z;
            C16525B c16525b = new C16525B();
            C2604o c2604o = this.f8071o0;
            InterfaceC2184i interfaceC2184i = c2604o.f8053p0;
            C2602m c2602m = new C2602m(c16525b, interfaceC0571F, c2604o, this.f8072p0, 0);
            this.f8069Y = 1;
            if (interfaceC2184i.mo3141d(c2602m, this) == enumC19250a) {
                return enumC19250a;
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
