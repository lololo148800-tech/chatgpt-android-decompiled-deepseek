package p787he;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8033Y5;
import p571X9.AbstractC9233X;
import p925oe.C18109e;
import p925oe.C18114g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C14488q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45650Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14459O f45651Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f45652o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14488q(C14459O c14459o, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45651Z = c14459o;
        this.f45652o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14488q(this.f45651Z, this.f45652o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14488q) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45650Y;
        C17296C c17296c = C17296C.f55119a;
        String str = this.f45652o0;
        C14459O c14459o = this.f45651Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (!c14459o.f45524w) {
                C18114g0 c18114g0 = c14459o.f45514m;
                this.f45650Y = 1;
                Object objM21029b = c18114g0.f57783a.m21029b(new C18109e(str, false, 1), this);
                if (objM21029b != enumC19250a) {
                    objM21029b = c17296c;
                }
                if (objM21029b == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC8033Y5.m8385c(c14459o.f45513l, str);
        return c17296c;
    }
}
