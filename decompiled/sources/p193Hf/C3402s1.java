package p193Hf;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import ye.C21514c;
import ye.C21522k;
import ye.C21523l;

/* JADX INFO: renamed from: Hf.s1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3402s1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10370Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10371Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3414w1 f10372o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f10373p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3402s1(C3414w1 c3414w1, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10372o0 = c3414w1;
        this.f10373p0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3402s1 c3402s1 = new C3402s1(this.f10372o0, this.f10373p0, interfaceC18770c);
        c3402s1.f10371Z = obj;
        return c3402s1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3402s1) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10370Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f10371Z;
            C21523l c21523l = (C21523l) this.f10372o0.f10400d.get(new C21514c(this.f10373p0));
            if (c21523l != null) {
                C21522k c21522k = new C21522k(c21523l, false, null);
                this.f10370Y = 1;
                if (interfaceC2186j.mo395a(c21522k, this) == enumC19250a) {
                    return enumC19250a;
                }
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
