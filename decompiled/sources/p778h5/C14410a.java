package p778h5;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p290Ld.C5002e;
import p571X9.AbstractC9233X;
import p593Y8.C9683j;
import p801i5.C14930b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C14410a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45279Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9683j f45280Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14410a(C9683j c9683j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45280Z = c9683j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14410a(this.f45280Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14410a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [Bm.k, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45279Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ?? r6 = ((C14930b) C5002e.f16319a.mo1905b(this.f45280Z)).f46520b;
            this.f45279Y = 1;
            if (r6.invoke(this) == enumC19250a) {
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
