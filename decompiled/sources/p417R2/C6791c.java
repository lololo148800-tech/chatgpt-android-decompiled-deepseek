package p417R2;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: R2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6791c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f21797Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f21798Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1439n f21799o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6791c(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f21799o0 = interfaceC1439n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6791c c6791c = new C6791c(this.f21799o0, interfaceC18770c);
        c6791c.f21798Z = obj;
        return c6791c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6791c) create((C6790b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f21797Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6790b c6790b = (C6790b) this.f21798Z;
            this.f21797Y = 1;
            obj = this.f21799o0.invoke(c6790b, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C6790b c6790b2 = (C6790b) obj;
        c6790b2.f21796b.set(true);
        return c6790b2;
    }
}
