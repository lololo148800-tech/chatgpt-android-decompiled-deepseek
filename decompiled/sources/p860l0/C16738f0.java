package p860l0;

import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p321Mk.C5468f;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p858ko.C16482A;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: l0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16738f0 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public C16557y f53672Z;

    /* JADX INFO: renamed from: o0 */
    public int f53673o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f53674p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f53675q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C5468f f53676r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1426a f53677s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1426a f53678t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16738f0(InterfaceC1436k interfaceC1436k, C5468f c5468f, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53675q0 = interfaceC1436k;
        this.f53676r0 = c5468f;
        this.f53677s0 = interfaceC1426a;
        this.f53678t0 = interfaceC1426a2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16738f0 c16738f0 = new C16738f0(this.f53675q0, this.f53676r0, this.f53677s0, this.f53678t0, interfaceC18770c);
        c16738f0.f53674p0 = obj;
        return c16738f0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16738f0) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        C19748y c19748y2;
        C16557y c16557y;
        C19738o c19738o;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53673o0;
        if (i10 != 0) {
            if (i10 == 1) {
                c19748y = (C19748y) this.f53674p0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 == 2) {
                    c16557y = this.f53672Z;
                    c19748y2 = (C19748y) this.f53674p0;
                    AbstractC9233X.m9807c(obj);
                    c19738o = (C19738o) obj;
                    if (c19738o != null) {
                        this.f53675q0.invoke(new C13800b(c19738o.f62480c));
                        Float f10 = new Float(c16557y.f51286Y);
                        C5468f c5468f = this.f53676r0;
                        c5468f.invoke(c19738o, f10);
                        C16482A c16482a = new C16482A(c5468f, 3);
                        this.f53674p0 = null;
                        this.f53672Z = null;
                        this.f53673o0 = 3;
                        obj = AbstractC16750j0.m18530n(c19748y2, c19738o.f62478a, c16482a, this);
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
                this.f53677s0.invoke();
            } else {
                this.f53678t0.invoke();
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C19748y c19748y3 = (C19748y) this.f53674p0;
        this.f53674p0 = c19748y3;
        this.f53673o0 = 1;
        Object objM18506c = AbstractC16689K1.m18506c(c19748y3, null, this, 2);
        if (objM18506c == enumC19250a) {
            return enumC19250a;
        }
        c19748y = c19748y3;
        obj = objM18506c;
        C19738o c19738o2 = (C19738o) obj;
        C16557y c16557y2 = new C16557y();
        long j10 = c19738o2.f62478a;
        C16732d0 c16732d0 = new C16732d0(c16557y2, 1);
        this.f53674p0 = c19748y;
        this.f53672Z = c16557y2;
        this.f53673o0 = 2;
        obj = AbstractC16750j0.m18521e(c19748y, j10, c19738o2.f62486i, c16732d0, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        c19748y2 = c19748y;
        c16557y = c16557y2;
        c19738o = (C19738o) obj;
        if (c19738o != null) {
            this.f53675q0.invoke(new C13800b(c19738o.f62480c));
            Float f11 = new Float(c16557y.f51286Y);
            C5468f c5468f2 = this.f53676r0;
            c5468f2.invoke(c19738o, f11);
            C16482A c16482a2 = new C16482A(c5468f2, 3);
            this.f53674p0 = null;
            this.f53672Z = null;
            this.f53673o0 = 3;
            obj = AbstractC16750j0.m18530n(c19748y2, c19738o.f62478a, c16482a2, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            if (((Boolean) obj).booleanValue()) {
                this.f53677s0.invoke();
            } else {
                this.f53678t0.invoke();
            }
        }
        return C17296C.f55119a;
    }
}
