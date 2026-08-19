package p129En;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C2595f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8044Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f8045Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC2596g f8046o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2595f(AbstractC2596g abstractC2596g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8046o0 = abstractC2596g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2595f c2595f = new C2595f(this.f8046o0, interfaceC18770c);
        c2595f.f8045Z = obj;
        return c2595f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2595f) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8044Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC1758z interfaceC1758z = (InterfaceC1758z) this.f8045Z;
            this.f8044Y = 1;
            if (this.f8046o0.mo3253g(interfaceC1758z, this) == enumC19250a) {
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
