package p193Hf;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p071Ch.C1661A;
import p077Cn.InterfaceC1758z;
import p094De.C2025h;
import p103Dn.AbstractC2124C;
import p103Dn.C2134H;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.p1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3393p1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10343Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3414w1 f10344Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f10345o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f10346p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1758z f10347q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16525B f10348r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3393p1(C3414w1 c3414w1, String str, C16525B c16525b, InterfaceC1758z interfaceC1758z, C16525B c16525b2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10344Z = c3414w1;
        this.f10345o0 = str;
        this.f10346p0 = c16525b;
        this.f10347q0 = interfaceC1758z;
        this.f10348r0 = c16525b2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3393p1(this.f10344Z, this.f10345o0, this.f10346p0, this.f10347q0, this.f10348r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3393p1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10343Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3414w1 c3414w1 = this.f10344Z;
            InterfaceC2184i interfaceC2184iM3215n = AbstractC2124C.m3215n(new C2025h(c3414w1.f10397a.f45521t, 6));
            String str = this.f10345o0;
            C2134H c2134h = new C2134H(new C3402s1(c3414w1, str, null), AbstractC2124C.m3201E(interfaceC2184iM3215n, new C1661A(c3414w1, str, null)));
            C3390o1 c3390o1 = new C3390o1(this.f10346p0, this.f10347q0, this.f10348r0, 0);
            this.f10343Y = 1;
            if (c2134h.mo3141d(c3390o1, this) == enumC19250a) {
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
