package p321Mk;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p1030u1.C20097d;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Mk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C5470h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f17868Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f17869Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC5477o f17870o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11238i f17871p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5470h(EnumC5477o enumC5477o, C11238i c11238i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f17870o0 = enumC5477o;
        this.f17871p0 = c11238i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5470h c5470h = new C5470h(this.f17870o0, this.f17871p0, interfaceC18770c);
        c5470h.f17869Z = obj;
        return c5470h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5470h) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f17868Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C5469g c5469g = new C5469g(this.f17870o0, (C19723A) this.f17869Z, this.f17871p0, new C20097d(), null);
            this.f17868Y = 1;
            if (AbstractC0575H.m1183l(c5469g, this) == enumC19250a) {
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
