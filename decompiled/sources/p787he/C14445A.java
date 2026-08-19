package p787he;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p129En.C2604o;
import p403Qd.C6636i;
import p571X9.AbstractC9233X;
import p925oe.C18114g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C14445A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45425Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14459O f45426Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14445A(C14459O c14459o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45426Z = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14445A(this.f45426Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14445A) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45425Y;
        C14459O c14459o = this.f45426Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C2604o c2604o = c14459o.f45521t;
        this.f45425Y = 1;
        obj = AbstractC2124C.m3221t(c2604o, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C6636i c6636i = (C6636i) obj;
        if (c6636i != null) {
            C18114g0 c18114g0 = c14459o.f45514m;
            this.f45425Y = 2;
            if (c18114g0.m19714a(c6636i, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
