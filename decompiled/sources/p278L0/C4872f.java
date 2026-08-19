package p278L0;

import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p006A4.C0349j;
import p049Bm.InterfaceC1441p;
import p349O0.C5994b0;
import p571X9.AbstractC9233X;
import p658b5.C11246q;
import p758g0.AbstractC13758e;
import p758g0.C13781p0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4872f extends AbstractC19694j implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public int f15859Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ C4892s f15860Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ C4855T f15861o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f15862p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C11246q f15863q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ float f15864r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4872f(C11246q c11246q, float f10, InterfaceC18770c interfaceC18770c) {
        super(4, interfaceC18770c);
        this.f15863q0 = c11246q;
        this.f15864r0 = f10;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C4872f c4872f = new C4872f(this.f15863q0, this.f15864r0, (InterfaceC18770c) obj4);
        c4872f.f15860Z = (C4892s) obj;
        c4872f.f15861o0 = (C4855T) obj2;
        c4872f.f15862p0 = obj3;
        return c4872f.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15859Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4892s c4892s = this.f15860Z;
            float fM5502d = this.f15861o0.m5502d(this.f15862p0);
            if (!Float.isNaN(fM5502d)) {
                C16557y c16557y = new C16557y();
                C11246q c11246q = this.f15863q0;
                float fM6409g = Float.isNaN(((C5994b0) c11246q.f34073j).m6409g()) ? 0.0f : ((C5994b0) c11246q.f34073j).m6409g();
                c16557y.f51286Y = fM6409g;
                C0349j c0349j = new C0349j(c4892s, 19, c16557y);
                this.f15860Z = null;
                this.f15861o0 = null;
                this.f15859Y = 1;
                if (AbstractC13758e.m15238c(fM6409g, fM5502d, this.f15864r0, (C13781p0) c11246q.f34066c, c0349j, this) == enumC19250a) {
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
