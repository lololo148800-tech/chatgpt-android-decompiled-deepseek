package p708dh;

import io.sentry.AbstractC15152P0;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p1155zi.C21952P1;
import p1155zi.C22062u;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: dh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C13150d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f41744Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f41745Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13158l f41746o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13150d(C13158l c13158l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41746o0 = c13158l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13150d c13150d = new C13150d(this.f41746o0, interfaceC18770c);
        c13150d.f41745Z = obj;
        return c13150d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13150d) create((C22062u) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41744Y;
        C13158l c13158l = this.f41746o0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C22062u c22062u = (C22062u) this.f41745Z;
                C2127D0 c2127d0 = c13158l.f41780e;
                C21952P1 c21952p1 = new C21952P1(c22062u);
                this.f41744Y = 1;
                if (c2127d0.mo395a(c21952p1, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        } catch (NullPointerException e10) {
            AbstractC8160o6.m8727b(c13158l.f41779d, "Unable to emit account status", e10, 4);
            AbstractC15152P0.m16331e().mo16250s(e10);
        }
        return C17296C.f55119a;
    }
}
