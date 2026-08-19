package p283L5;

import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4945k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f16119Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f16120Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC19694j f16121o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4945k(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f16121o0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4945k c4945k = new C4945k(this.f16121o0, interfaceC18770c);
        c4945k.f16120Z = obj;
        return c4945k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4945k) create((C4955u) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f16119Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4955u c4955u = (C4955u) this.f16120Z;
            int i11 = c4955u.f16161a;
            if ((200 > i11 || i11 >= 300) && i11 != 304) {
                throw new C0644w("HTTP " + c4955u.f16161a);
            }
            this.f16119Y = 1;
            obj = this.f16121o0.invoke(c4955u, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
