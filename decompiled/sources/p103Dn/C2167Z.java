package p103Dn;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p129En.C2590a;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C2167Z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6639Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6640Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2149O0 f6641o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f6642p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2167Z(InterfaceC2149O0 interfaceC2149O0, InterfaceC1440o interfaceC1440o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6641o0 = interfaceC2149O0;
        this.f6642p0 = (AbstractC19694j) interfaceC1440o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2167Z c2167z = new C2167Z(this.f6641o0, this.f6642p0, interfaceC18770c);
        c2167z.f6640Z = obj;
        return c2167z;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2167Z) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Type inference failed for: r4v0, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C2166Y c2166y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6639Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f6640Z;
            InterfaceC2149O0 interfaceC2149O0 = this.f6641o0;
            C2166Y c2166y2 = new C2166Y(this.f6642p0, interfaceC2186j);
            try {
                this.f6640Z = c2166y2;
                this.f6639Y = 1;
                if (interfaceC2149O0.mo3141d(c2166y2, this) == enumC19250a) {
                    return enumC19250a;
                }
            } catch (C2590a e10) {
                e = e10;
                c2166y = c2166y2;
                if (e.f8031Y == c2166y) {
                    throw e;
                }
                AbstractC0575H.m1187p(getContext());
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2166y = (C2166Y) this.f6640Z;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (C2590a e11) {
                e = e11;
                if (e.f8031Y == c2166y) {
                    throw e;
                }
                AbstractC0575H.m1187p(getContext());
            }
        }
        return C17296C.f55119a;
    }
}
