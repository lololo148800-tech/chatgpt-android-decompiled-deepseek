package p860l0;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p046Bk.C1419y0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: l0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16735e0 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public C16557y f53663Z;

    /* JADX INFO: renamed from: o0 */
    public int f53664o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f53665p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f53666q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC16546n f53667r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1426a f53668s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1426a f53669t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16735e0(InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53666q0 = interfaceC1436k;
        this.f53667r0 = (AbstractC16546n) interfaceC1439n;
        this.f53668s0 = interfaceC1426a;
        this.f53669t0 = interfaceC1426a2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.n, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16735e0 c16735e0 = new C16735e0(this.f53666q0, this.f53667r0, this.f53668s0, this.f53669t0, interfaceC18770c);
        c16735e0.f53665p0 = obj;
        return c16735e0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16735e0) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Type inference failed for: r1v7, types: [Bm.n, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        C19748y c19748y2;
        C16557y c16557y;
        C19738o c19738o;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53664o0;
        if (i10 != 0) {
            if (i10 == 1) {
                c19748y = (C19748y) this.f53665p0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 == 2) {
                    c16557y = this.f53663Z;
                    c19748y2 = (C19748y) this.f53665p0;
                    AbstractC9233X.m9807c(obj);
                    c19738o = (C19738o) obj;
                    if (c19738o != null) {
                        this.f53666q0.invoke(new C13800b(c19738o.f62480c));
                        Float f10 = new Float(c16557y.f51286Y);
                        ?? r6 = this.f53667r0;
                        r6.invoke(c19738o, f10);
                        C1419y0 c1419y0 = new C1419y0((InterfaceC1439n) r6, 5);
                        this.f53665p0 = null;
                        this.f53663Z = null;
                        this.f53664o0 = 3;
                        obj = AbstractC16750j0.m18527k(c19748y2, c19738o.f62478a, c1419y0, this);
                        if (obj == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    return C17296C.f55119a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.f53668s0.invoke();
            } else {
                this.f53669t0.invoke();
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C19748y c19748y3 = (C19748y) this.f53665p0;
        this.f53665p0 = c19748y3;
        this.f53664o0 = 1;
        Object objM18506c = AbstractC16689K1.m18506c(c19748y3, null, this, 2);
        if (objM18506c == enumC19250a) {
            return enumC19250a;
        }
        c19748y = c19748y3;
        obj = objM18506c;
        C19738o c19738o2 = (C19738o) obj;
        C16557y c16557y2 = new C16557y();
        long j10 = c19738o2.f62478a;
        C16732d0 c16732d0 = new C16732d0(c16557y2, 0);
        this.f53665p0 = c19748y;
        this.f53663Z = c16557y2;
        this.f53664o0 = 2;
        obj = AbstractC16750j0.m18518b(c19748y, j10, c19738o2.f62486i, c16732d0, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        c19748y2 = c19748y;
        c16557y = c16557y2;
        c19738o = (C19738o) obj;
        if (c19738o != null) {
            this.f53666q0.invoke(new C13800b(c19738o.f62480c));
            Float f11 = new Float(c16557y.f51286Y);
            ?? r10 = this.f53667r0;
            r10.invoke(c19738o, f11);
            C1419y0 c1419y1 = new C1419y0((InterfaceC1439n) r10, 5);
            this.f53665p0 = null;
            this.f53663Z = null;
            this.f53664o0 = 3;
            obj = AbstractC16750j0.m18527k(c19748y2, c19738o.f62478a, c1419y1, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            if (((Boolean) obj).booleanValue()) {
                this.f53668s0.invoke();
            } else {
                this.f53669t0.invoke();
            }
        }
        return C17296C.f55119a;
    }
}
