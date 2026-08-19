package p354O5;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p544W9.AbstractC8460C4;
import p571X9.AbstractC9233X;
import p792hl.AbstractC14527b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6132b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19991Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f19992Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1439n f19993o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6132b(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19993o0 = interfaceC1439n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6132b c6132b = new C6132b(this.f19993o0, interfaceC18770c);
        c6132b.f19992Z = obj;
        return c6132b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6132b) create((AbstractC14527b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1439n interfaceC1439n;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19991Y;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC1439n = (InterfaceC1439n) this.f19992Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        AbstractC14527b abstractC14527b = (AbstractC14527b) this.f19992Z;
        interfaceC1439n = this.f19993o0;
        this.f19992Z = interfaceC1439n;
        this.f19991Y = 1;
        obj = AbstractC8460C4.m9083c(abstractC14527b, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        this.f19992Z = null;
        this.f19991Y = 2;
        obj = interfaceC1439n.invoke(obj, this);
        return obj == enumC19250a ? enumC19250a : obj;
    }
}
