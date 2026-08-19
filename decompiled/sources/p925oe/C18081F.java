package p925oe;

import mm.C17296C;
import p016Ae.C0452n;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: oe.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C18081F extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public int f57675Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18086K f57676Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18081F(C18086K c18086k, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f57676Z = c18086k;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return new C18081F(this.f57676Z, (InterfaceC18770c) obj3).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f57675Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18086K c18086k = this.f57676Z;
            C0452n c0452n = c18086k.f57695a;
            int i11 = c18086k.f57702h.f57660a;
            this.f57675Y = 1;
            obj = c0452n.m1099g(i11, 20, false, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
