package p278L0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2213w0;
import p229J0.C3899D4;
import p571X9.AbstractC9233X;
import p773h0.EnumC14284g0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C4838B extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Throwable f15745Y;

    /* JADX INFO: renamed from: Z */
    public int f15746Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2213w0 f15747o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3899D4 f15748p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4838B(InterfaceC2213w0 interfaceC2213w0, C3899D4 c3899d4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15747o0 = interfaceC2213w0;
        this.f15748p0 = c3899d4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4838B(this.f15747o0, this.f15748p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4838B) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15746Z;
        C3899D4 c3899d4 = this.f15748p0;
        InterfaceC2213w0 interfaceC2213w0 = this.f15747o0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = this.f15745Y;
                        AbstractC9233X.m9807c(obj);
                        throw th2;
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            interfaceC2213w0.mo3231f(Boolean.TRUE);
            EnumC14284g0 enumC14284g0 = EnumC14284g0.f44823o0;
            this.f15746Z = 1;
            if (c3899d4.m4609b(enumC14284g0, this) == enumC19250a) {
                return enumC19250a;
            }
            C4837A c4837a = new C4837A(c3899d4, null);
            this.f15746Z = 2;
            if (AbstractC2124C.m3212k(interfaceC2213w0, c4837a, this) == enumC19250a) {
                return enumC19250a;
            }
            return C17296C.f55119a;
        } catch (Throwable th3) {
            C4837A c4837a2 = new C4837A(c3899d4, null);
            this.f15745Y = th3;
            this.f15746Z = 3;
            if (AbstractC2124C.m3212k(interfaceC2213w0, c4837a2, this) == enumC19250a) {
                return enumC19250a;
            }
            throw th3;
        }
    }
}
