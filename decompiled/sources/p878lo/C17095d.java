package p878lo;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6002f0;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C17095d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54631Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54632Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11238i f54633o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f54634p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17095d(C11238i c11238i, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54633o0 = c11238i;
        this.f54634p0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17095d c17095d = new C17095d(this.f54633o0, this.f54634p0, interfaceC18770c);
        c17095d.f54632Z = obj;
        return c17095d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17095d) create((C17097f) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54631Y;
        C11238i c11238i = this.f54633o0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C17097f c17097f = (C17097f) this.f54632Z;
                ((C6002f0) c11238i.f34011p0).setValue(Boolean.TRUE);
                ?? r6 = this.f54634p0;
                this.f54631Y = 1;
                if (r6.invoke(c17097f, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            ((C6002f0) c11238i.f34011p0).setValue(Boolean.FALSE);
            return C17296C.f55119a;
        } catch (Throwable th2) {
            ((C6002f0) c11238i.f34011p0).setValue(Boolean.FALSE);
            throw th2;
        }
    }
}
