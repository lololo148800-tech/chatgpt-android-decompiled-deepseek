package p1114xp;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: xp.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C21339j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f67784Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1439n f67785Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC21331b f67786o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21339j(InterfaceC1439n interfaceC1439n, InterfaceC21331b interfaceC21331b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67785Z = interfaceC1439n;
        this.f67786o0 = interfaceC21331b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c completion) {
        AbstractC16544l.m18094g(completion, "completion");
        return new C21339j(this.f67785Z, this.f67786o0, completion);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21339j) create(obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f67784Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f67784Y = 1;
            if (this.f67785Z.invoke(this.f67786o0, this) == enumC19250a) {
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
