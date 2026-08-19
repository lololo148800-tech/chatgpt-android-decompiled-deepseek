package p1014t1;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: t1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C19749z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f62528Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19723A f62529Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19749z(C19723A c19723a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62529Z = c19723a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19749z(this.f62529Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19749z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f62528Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = this.f62529Z;
            InterfaceC1439n interfaceC1439n = c19723a.f62438C0;
            this.f62528Y = 1;
            if (interfaceC1439n.invoke(c19723a, this) == enumC19250a) {
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
