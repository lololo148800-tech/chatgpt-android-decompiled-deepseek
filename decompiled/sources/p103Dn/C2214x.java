package p103Dn;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.C1749q;
import p077Cn.C1750r;
import p077Cn.InterfaceC1730B;
import p129En.AbstractC2592c;
import p129En.C2606q;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C2214x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f6790Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f6791Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1730B f6792o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2214x(C16525B c16525b, InterfaceC1730B interfaceC1730B, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6791Z = c16525b;
        this.f6792o0 = interfaceC1730B;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2214x c2214x = new C2214x(this.f6791Z, this.f6792o0, interfaceC18770c);
        c2214x.f6790Y = obj;
        return c2214x;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C2214x c2214x = (C2214x) create(new C1750r(((C1750r) obj).f5021a), (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c2214x.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        Object obj2 = ((C1750r) this.f6790Y).f5021a;
        boolean z6 = obj2 instanceof C1749q;
        C16525B c16525b = this.f6791Z;
        if (!z6) {
            c16525b.f51262Y = obj2;
        }
        if (z6) {
            Throwable thM2559a = C1750r.m2559a(obj2);
            if (thM2559a != null) {
                throw thM2559a;
            }
            this.f6792o0.mo2516e(new C2606q());
            c16525b.f51262Y = AbstractC2592c.f8039d;
        }
        return C17296C.f55119a;
    }
}
