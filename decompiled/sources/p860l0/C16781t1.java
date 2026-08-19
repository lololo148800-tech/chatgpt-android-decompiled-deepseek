package p860l0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p1014t1.EnumC19730g;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16781t1 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f53853Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f53854o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC0571F f53855p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC19694j f53856q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC16546n f53857r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16685J0 f53858s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16781t1(InterfaceC0571F interfaceC0571F, InterfaceC1440o interfaceC1440o, InterfaceC1436k interfaceC1436k, C16685J0 c16685j0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53855p0 = interfaceC0571F;
        this.f53856q0 = (AbstractC19694j) interfaceC1440o;
        this.f53857r0 = (AbstractC16546n) interfaceC1436k;
        this.f53858s0 = c16685j0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.o, sm.j] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        ?? r6 = this.f53857r0;
        C16685J0 c16685j0 = this.f53858s0;
        C16781t1 c16781t1 = new C16781t1(this.f53855p0, this.f53856q0, r6, c16685j0, interfaceC18770c);
        c16781t1.f53854o0 = obj;
        return c16781t1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16781t1) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r8v0, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        C19738o c19738o;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53853Z;
        C16685J0 c16685j0 = this.f53858s0;
        InterfaceC0571F interfaceC0571F = this.f53855p0;
        if (i10 != 0) {
            if (i10 == 1) {
                c19748y = (C19748y) this.f53854o0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            c19738o = (C19738o) obj;
            if (c19738o == null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16775r1(c16685j0, null), 3);
            } else {
                c19738o.m20691a();
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16778s1(c16685j0, null), 3);
                this.f53857r0.invoke(new C13800b(c19738o.f62480c));
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        c19748y = (C19748y) this.f53854o0;
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16769p1(c16685j0, null), 3);
        this.f53854o0 = c19748y;
        this.f53853Z = 1;
        obj = AbstractC16689K1.m18506c(c19748y, null, this, 3);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C19738o c19738o2 = (C19738o) obj;
        c19738o2.m20691a();
        C16783u0 c16783u0 = AbstractC16689K1.f53473a;
        ?? r10 = this.f53856q0;
        if (r10 != c16783u0) {
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16772q1(r10, c16685j0, c19738o2, null), 3);
        }
        this.f53854o0 = null;
        this.f53853Z = 2;
        obj = AbstractC16689K1.m18509f(c19748y, EnumC19730g.f62466Z, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        c19738o = (C19738o) obj;
        if (c19738o == null) {
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16775r1(c16685j0, null), 3);
        } else {
            c19738o.m20691a();
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16778s1(c16685j0, null), 3);
            this.f53857r0.invoke(new C13800b(c19738o.f62480c));
        }
        return C17296C.f55119a;
    }
}
