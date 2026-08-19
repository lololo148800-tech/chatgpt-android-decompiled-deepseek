package p708dh;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p072Ci.C1699d;
import p072Ci.C1705j;
import p103Dn.AbstractC2124C;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: dh.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C13134L extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public String f41698Y;

    /* JADX INFO: renamed from: Z */
    public int f41699Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13135M f41700o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13132J f41701p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13134L(C13135M c13135m, C13132J c13132j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41700o0 = c13135m;
        this.f41701p0 = c13132j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13134L(this.f41700o0, this.f41701p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13134L) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41699Z;
        C13132J c13132j = this.f41701p0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                str = this.f41698Y;
                AbstractC9233X.m9807c(obj);
                String str2 = ((C1699d) obj).f4833g;
                if (str != null && str2 == null) {
                    this.f41698Y = null;
                    this.f41699Z = 3;
                    if (c13132j.m14815l(str, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        this.f41699Z = 1;
        obj = AbstractC2124C.m3221t(this.f41700o0.f64176f, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        str = ((C1705j) obj).f4869b;
        this.f41698Y = str;
        this.f41699Z = 2;
        obj = AbstractC2124C.m3221t(c13132j.f41695r0, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        String str3 = ((C1699d) obj).f4833g;
        if (str != null) {
            this.f41698Y = null;
            this.f41699Z = 3;
            if (c13132j.m14815l(str, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
