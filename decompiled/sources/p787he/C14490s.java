package p787he;

import be.C11345b;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C14490s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45656Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14459O f45657Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14490s(C14459O c14459o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45657Z = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14490s(this.f45657Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14490s) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45656Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C14459O c14459o = this.f45657Z;
            C11345b c11345b = c14459o.f45502a;
            C14489r c14489r = new C14489r(c14459o, null);
            this.f45656Y = 1;
            if (AbstractC2124C.m3212k(c11345b.f34301c, c14489r, this) == enumC19250a) {
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
