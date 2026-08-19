package p103Dn;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1440o;
import p077Cn.C1757y;
import p077Cn.InterfaceC1730B;
import p129En.AbstractC2592c;
import p226In.C3783e;
import p226In.C3785g;
import p523V9.AbstractC8031Y3;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C2122B extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public C16525B f6483Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC1730B f6484Z;

    /* JADX INFO: renamed from: o0 */
    public int f6485o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f6486p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f6487q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long f6488r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC2213w0 f6489s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2122B(long j10, InterfaceC2213w0 interfaceC2213w0, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f6488r0 = j10;
        this.f6489s0 = interfaceC2213w0;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2122B c2122b = new C2122B(this.f6488r0, this.f6489s0, (InterfaceC18770c) obj3);
        c2122b.f6486p0 = (InterfaceC0571F) obj;
        c2122b.f6487q0 = (InterfaceC2186j) obj2;
        return c2122b.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        InterfaceC1730B interfaceC1730BM8379c;
        InterfaceC1730B interfaceC1730B;
        C16525B c16525b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6485o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f6486p0;
            InterfaceC2186j interfaceC2186j2 = (InterfaceC2186j) this.f6487q0;
            C1757y c1757yM8379c = AbstractC8031Y3.m8379c(interfaceC0571F, -1, new C2120A(this.f6489s0, null), 1);
            C16525B c16525b2 = new C16525B();
            interfaceC2186j = interfaceC2186j2;
            interfaceC1730BM8379c = AbstractC8031Y3.m8379c(interfaceC0571F, 0, new C2212w(this.f6488r0, null), 1);
            interfaceC1730B = c1757yM8379c;
            c16525b = c16525b2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1730BM8379c = this.f6484Z;
            c16525b = this.f6483Y;
            interfaceC1730B = (InterfaceC1730B) this.f6487q0;
            interfaceC2186j = (InterfaceC2186j) this.f6486p0;
            AbstractC9233X.m9807c(obj);
        }
        while (c16525b.f51262Y != AbstractC2592c.f8039d) {
            C3785g c3785g = new C3785g(getContext());
            c3785g.m4457f(interfaceC1730B.mo2518g(), new C2214x(c16525b, interfaceC1730BM8379c, null));
            c3785g.m4457f(interfaceC1730BM8379c.mo2517f(), new C2216y(interfaceC2186j, c16525b, null));
            this.f6486p0 = interfaceC2186j;
            this.f6487q0 = interfaceC1730B;
            this.f6483Y = c16525b;
            this.f6484Z = interfaceC1730BM8379c;
            this.f6485o0 = 1;
            if ((C3785g.f11436r0.get(c3785g) instanceof C3783e ? c3785g.m4454c(this) : c3785g.m4455d(this)) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
