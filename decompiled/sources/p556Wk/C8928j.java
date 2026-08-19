package p556Wk;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1113xn.C21307a;
import p1133yl.C21549a;
import p434Rk.C6911c;
import p544W9.AbstractC8565U2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9261b3;
import p792hl.AbstractC14527b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wk.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C8928j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public AbstractC14527b f27301Y;

    /* JADX INFO: renamed from: Z */
    public int f27302Z;

    /* JADX INFO: renamed from: o0 */
    public int f27303o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f27304p0;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C8928j c8928j = new C8928j(2, interfaceC18770c);
        c8928j.f27304p0 = obj;
        return c8928j;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8928j) create((AbstractC14527b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        AbstractC14527b abstractC14527b;
        AbstractC14527b abstractC14527bM7297d;
        int i11;
        AbstractC14527b abstractC14527b2;
        AbstractC14527b abstractC14527b3;
        String str;
        Throwable c8915b0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = this.f27303o0;
        C17296C c17296c = C17296C.f55119a;
        try {
            if (i12 == 0) {
                AbstractC9233X.m9807c(obj);
                AbstractC14527b abstractC14527b4 = (AbstractC14527b) this.f27304p0;
                if (!((Boolean) abstractC14527b4.mo7303b().m7299k().m20649c(AbstractC8887A.f27206c)).booleanValue()) {
                    AbstractC8929k.f27306b.mo19442g("Skipping default response validation for " + abstractC14527b4.mo7303b().m7296c().mo7300S());
                    return c17296c;
                }
                i10 = abstractC14527b4.mo7307f().f51013Y;
                C6911c c6911cMo7303b = abstractC14527b4.mo7303b();
                if (i10 < 300 || c6911cMo7303b.m7299k().m20648b(AbstractC8929k.f27305a)) {
                    return c17296c;
                }
                this.f27304p0 = abstractC14527b4;
                this.f27302Z = i10;
                this.f27303o0 = 1;
                Object objM9835a = AbstractC9261b3.m9835a(c6911cMo7303b, this);
                if (objM9835a == enumC19250a) {
                    return enumC19250a;
                }
                abstractC14527b = abstractC14527b4;
                obj = objM9835a;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f27302Z;
                    abstractC14527b3 = this.f27301Y;
                    abstractC14527b2 = (AbstractC14527b) this.f27304p0;
                    try {
                        AbstractC9233X.m9807c(obj);
                        str = (String) obj;
                    } catch (C21549a unused) {
                        str = "<body failed decoding>";
                    }
                    if (300 > i11 && i11 < 400) {
                        c8915b0 = new C8913a0(abstractC14527b3, str);
                    } else if (400 > i11 && i11 < 500) {
                        c8915b0 = new C8920e(abstractC14527b3, str);
                    } else if (500 <= i11 || i11 >= 600) {
                        c8915b0 = new C8915b0(abstractC14527b3, str);
                    } else {
                        c8915b0 = new C8923f0(abstractC14527b3, str);
                    }
                    AbstractC8929k.f27306b.mo19442g("Default response validation for " + abstractC14527b2.mo7303b().m7296c().mo7300S() + " failed with " + c8915b0);
                    throw c8915b0;
                }
                i10 = this.f27302Z;
                abstractC14527b = (AbstractC14527b) this.f27304p0;
                AbstractC9233X.m9807c(obj);
            }
            this.f27304p0 = abstractC14527b;
            this.f27301Y = abstractC14527bM7297d;
            this.f27302Z = i10;
            this.f27303o0 = 2;
            Object objM9227b = AbstractC8565U2.m9227b(abstractC14527bM7297d, C21307a.f67720a, this);
            if (objM9227b == enumC19250a) {
                return enumC19250a;
            }
            i11 = i10;
            abstractC14527b3 = abstractC14527bM7297d;
            obj = objM9227b;
            abstractC14527b2 = abstractC14527b;
            str = (String) obj;
            if (300 > i11) {
                if (400 > i11) {
                    if (500 <= i11) {
                        c8915b0 = new C8915b0(abstractC14527b3, str);
                    } else {
                        c8915b0 = new C8915b0(abstractC14527b3, str);
                    }
                } else if (500 <= i11) {
                    c8915b0 = new C8915b0(abstractC14527b3, str);
                } else {
                    c8915b0 = new C8915b0(abstractC14527b3, str);
                }
            } else if (400 > i11) {
                if (500 <= i11) {
                    c8915b0 = new C8915b0(abstractC14527b3, str);
                } else {
                    c8915b0 = new C8915b0(abstractC14527b3, str);
                }
            } else if (500 <= i11) {
                c8915b0 = new C8915b0(abstractC14527b3, str);
            } else {
                c8915b0 = new C8915b0(abstractC14527b3, str);
            }
            AbstractC8929k.f27306b.mo19442g("Default response validation for " + abstractC14527b2.mo7303b().m7296c().mo7300S() + " failed with " + c8915b0);
            throw c8915b0;
        } catch (C21549a unused2) {
            i11 = i10;
            abstractC14527b2 = abstractC14527b;
            abstractC14527b3 = abstractC14527bM7297d;
            str = "<body failed decoding>";
        }
        C6911c c6911c = (C6911c) obj;
        c6911c.m7299k().m20652f(AbstractC8929k.f27305a, c17296c);
        abstractC14527bM7297d = c6911c.m7297d();
    }
}
