package ge;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p1139z0.C21585H;
import p361Oe.C6177d;
import p571X9.AbstractC9233X;
import p787he.C14459O;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ge.A0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14016A0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44097Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14459O f44098Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21585H f44099o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14016A0(C14459O c14459o, C21585H c21585h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44098Z = c14459o;
        this.f44099o0 = c21585h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14016A0(this.f44098Z, this.f44099o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14016A0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44097Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2184i interfaceC2184iM3215n = AbstractC2124C.m3215n(new C6177d(this.f44098Z.f45526y, 1));
            C14113y0 c14113y0 = new C14113y0(this.f44099o0, null);
            this.f44097Y = 1;
            if (AbstractC2124C.m3212k(interfaceC2184iM3215n, c14113y0, this) == enumC19250a) {
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
