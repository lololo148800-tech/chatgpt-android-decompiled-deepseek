package p267Ke;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p1151ze.C21877a;
import p1151ze.C21878b;
import p571X9.AbstractC9233X;
import p787he.C14459O;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ke.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4639a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15097Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21878b f15098Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4639a(C21878b c21878b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15098Z = c21878b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4639a(this.f15098Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4639a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15097Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f15097Y = 1;
            C21878b c21878b = this.f15098Z;
            C14459O c14459o = c21878b.f69368b;
            Object objM3212k = AbstractC2124C.m3212k(c14459o.f45526y, new C21877a(c21878b, null), this);
            if (objM3212k != enumC19250a) {
                objM3212k = c17296c;
            }
            if (objM3212k == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
