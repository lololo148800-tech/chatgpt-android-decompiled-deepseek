package p103Dn;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.C1749q;
import p077Cn.C1750r;
import p129En.AbstractC2592c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C2202r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f6750Y;

    /* JADX INFO: renamed from: Z */
    public int f6751Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f6752o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f6753p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC2186j f6754q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2202r(InterfaceC2186j interfaceC2186j, C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6753p0 = c16525b;
        this.f6754q0 = interfaceC2186j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2202r c2202r = new C2202r(this.f6754q0, this.f6753p0, interfaceC18770c);
        c2202r.f6752o0 = obj;
        return c2202r;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2202r) create(new C1750r(((C1750r) obj).f5021a), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C16525B c16525b;
        C16525B c16525b2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6751Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Object obj2 = ((C1750r) this.f6752o0).f5021a;
            boolean z6 = obj2 instanceof C1749q;
            c16525b = this.f6753p0;
            if (!z6) {
                c16525b.f51262Y = obj2;
            }
            if (z6) {
                Throwable thM2559a = C1750r.m2559a(obj2);
                if (thM2559a != null) {
                    throw thM2559a;
                }
                Object obj3 = c16525b.f51262Y;
                if (obj3 != null) {
                    if (obj3 == AbstractC2592c.f8037b) {
                        obj3 = null;
                    }
                    this.f6752o0 = obj2;
                    this.f6750Y = c16525b;
                    this.f6751Z = 1;
                    if (this.f6754q0.mo395a(obj3, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    c16525b2 = c16525b;
                }
                c16525b.f51262Y = AbstractC2592c.f8039d;
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c16525b2 = this.f6750Y;
        AbstractC9233X.m9807c(obj);
        c16525b = c16525b2;
        c16525b.f51262Y = AbstractC2592c.f8039d;
        return C17296C.f55119a;
    }
}
