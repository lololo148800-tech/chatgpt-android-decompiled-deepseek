package p002A0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0141r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f588Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0120T f589Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19723A f590o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0141r(C0120T c0120t, InterfaceC18770c interfaceC18770c, C19723A c19723a) {
        super(2, interfaceC18770c);
        this.f589Z = c0120t;
        this.f590o0 = c19723a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0141r(this.f589Z, interfaceC18770c, this.f590o0);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0141r) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f588Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f588Y = 1;
            if (C0120T.m396a(this.f589Z, this.f590o0, this) == enumC19250a) {
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
