package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C4007Y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f12569Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3880A3 f12570Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4007Y(C3880A3 c3880a3, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f12570Z = c3880a3;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4007Y(this.f12570Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4007Y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f12569Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f12569Y = 1;
            if (this.f12570Z.m4605e(this) == enumC19250a) {
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
