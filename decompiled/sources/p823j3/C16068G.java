package p823j3;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.G */
/* JADX INFO: loaded from: classes.dex */
public final class C16068G extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49757Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16089k f49758Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16068G(C16089k c16089k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49758Z = c16089k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16068G(this.f49758Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16068G) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49757Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f49757Y = 1;
            C16089k c16089k = this.f49758Z;
            c16089k.getClass();
            if (AbstractC0575H.m1170R(c16089k.f49828p0, new C16088j(c16089k, null), this) == enumC19250a) {
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
