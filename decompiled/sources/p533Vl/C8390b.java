package p533Vl;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8390b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f26108Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19694j f26109Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f26110o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8390b(InterfaceC1439n interfaceC1439n, Object obj, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26109Z = (AbstractC19694j) interfaceC1439n;
        this.f26110o0 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8390b(this.f26109Z, this.f26110o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8390b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f26108Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        this.f26108Y = 1;
        if (AbstractC0575H.m1184m(100L, this) == enumC19250a) {
            return enumC19250a;
        }
        this.f26108Y = 2;
        obj = this.f26109Z.invoke(this.f26110o0, this);
        return obj == enumC19250a ? enumC19250a : obj;
    }
}
