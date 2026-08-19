package p427Rc;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p571X9.AbstractC9233X;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Rc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6849f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f21979Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f21980Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2184i f21981o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2219z0 f21982p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC16546n f21983q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6849f(InterfaceC2184i interfaceC2184i, C2219z0 c2219z0, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f21981o0 = interfaceC2184i;
        this.f21982p0 = c2219z0;
        this.f21983q0 = (AbstractC16546n) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.n, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6849f c6849f = new C6849f(this.f21981o0, this.f21982p0, this.f21983q0, interfaceC18770c);
        c6849f.f21980Z = obj;
        return c6849f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6849f) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [Bm.n, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f21979Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC1758z interfaceC1758z = (InterfaceC1758z) this.f21980Z;
            C16525B c16525b = new C16525B();
            c16525b.f51262Y = C17689w.f56480Y;
            C4816c c4816cM5451a = AbstractC4817d.m5451a();
            C16556x c16556x = new C16556x();
            AbstractC0575H.m1156D(interfaceC1758z, null, null, new C6846c(this.f21982p0, c4816cM5451a, c16556x, c16525b, interfaceC1758z, null), 3);
            C6848e c6848e = new C6848e(c4816cM5451a, c16556x, interfaceC1758z, c16525b, (InterfaceC1439n) this.f21983q0);
            this.f21979Y = 1;
            if (this.f21981o0.mo3141d(c6848e, this) == enumC19250a) {
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
