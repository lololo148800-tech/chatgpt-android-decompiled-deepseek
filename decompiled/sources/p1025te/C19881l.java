package p1025te;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p936p0.C18280t;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: te.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C19881l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f63025Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18280t f63026Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19866Q f63027o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19881l(C18280t c18280t, C19866Q c19866q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f63026Z = c18280t;
        this.f63027o0 = c19866q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19881l(this.f63026Z, this.f63027o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19881l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f63025Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            int size = this.f63027o0.f62975f.size() - 1;
            this.f63025Y = 1;
            if (C18280t.m19822i(this.f63026Z, size, this) == enumC19250a) {
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
