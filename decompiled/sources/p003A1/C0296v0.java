package p003A1;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p002A0.C0122V;
import p025An.C0624m;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p110E4.C2307e;
import p292Lg.C5034f;
import p334Na.AbstractC5695b;
import p349O0.C5975S;
import p349O0.C6004g0;
import p349O0.InterfaceC5977T;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p972qm.C18771d;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: A1.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0296v0 implements InterfaceC5977T {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1067Y;

    /* JADX INFO: renamed from: Z */
    public final Object f1068Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f1069o0;

    public C0296v0(Choreographer choreographer, C0290t0 c0290t0) {
        this.f1067Y = 0;
        this.f1068Z = choreographer;
        this.f1069o0 = c0290t0;
    }

    /* JADX INFO: renamed from: b */
    private final Object m875b(InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        C0290t0 c0290t0 = (C0290t0) this.f1069o0;
        if (c0290t0 == null) {
            InterfaceC18774g interfaceC18774g = abstractC19687c.getContext().get(C18771d.f59681Y);
            c0290t0 = interfaceC18774g instanceof C0290t0 ? (C0290t0) interfaceC18774g : null;
        }
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19687c));
        c0624m.m1262r();
        ChoreographerFrameCallbackC0293u0 choreographerFrameCallbackC0293u0 = new ChoreographerFrameCallbackC0293u0(c0624m, this, interfaceC1436k);
        if (c0290t0 == null || !AbstractC16544l.m18089b(c0290t0.f1044Z, (Choreographer) this.f1068Z)) {
            ((Choreographer) this.f1068Z).postFrameCallback(choreographerFrameCallbackC0293u0);
            c0624m.m1264u(new C0122V(this, 6, choreographerFrameCallbackC0293u0));
        } else {
            synchronized (c0290t0.f1046p0) {
                c0290t0.f1048r0.add(choreographerFrameCallbackC0293u0);
                if (!c0290t0.f1051u0) {
                    c0290t0.f1051u0 = true;
                    c0290t0.f1044Z.postFrameCallback(c0290t0.f1052v0);
                }
            }
            c0624m.m1264u(new C0122V(c0290t0, 5, choreographerFrameCallbackC0293u0));
        }
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }

    @Override // p972qm.InterfaceC18776i
    public final Object fold(Object obj, InterfaceC1439n interfaceC1439n) {
        switch (this.f1067Y) {
            case 0:
                break;
        }
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h interfaceC18775h) {
        switch (this.f1067Y) {
            case 0:
                break;
        }
        return AbstractC5695b.m6136c(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18774g
    public final InterfaceC18775h getKey() {
        switch (this.f1067Y) {
            case 0:
                break;
        }
        return C5975S.f19444Z;
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h interfaceC18775h) {
        switch (this.f1067Y) {
            case 0:
                break;
        }
        return AbstractC5695b.m6137d(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i interfaceC18776i) {
        switch (this.f1067Y) {
            case 0:
                break;
        }
        return AbstractC5695b.m6138e(this, interfaceC18776i);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p349O0.InterfaceC5977T
    /* JADX INFO: renamed from: v0 */
    public final Object mo876v0(InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        C6004g0 c6004g0;
        Object objM1261q;
        C0296v0 c0296v0;
        switch (this.f1067Y) {
            case 0:
                return m875b(interfaceC1436k, abstractC19687c);
            default:
                if (abstractC19687c instanceof C6004g0) {
                    c6004g0 = (C6004g0) abstractC19687c;
                    int i10 = c6004g0.f19498q0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c6004g0.f19498q0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c6004g0 = new C6004g0(this, abstractC19687c);
                    }
                } else {
                    c6004g0 = new C6004g0(this, abstractC19687c);
                }
                Object objMo876v0 = c6004g0.f19496o0;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c6004g0.f19498q0;
                if (i11 != 0) {
                    if (i11 == 1) {
                        interfaceC1436k = c6004g0.f19495Z;
                        c0296v0 = c6004g0.f19494Y;
                        AbstractC9233X.m9807c(objMo876v0);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(objMo876v0);
                    }
                    return objMo876v0;
                }
                AbstractC9233X.m9807c(objMo876v0);
                C2307e c2307e = (C2307e) this.f1069o0;
                c6004g0.f19494Y = this;
                c6004g0.f19495Z = interfaceC1436k;
                c6004g0.f19498q0 = 1;
                if (c2307e.m3403o()) {
                    objM1261q = C17296C.f55119a;
                } else {
                    C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c6004g0));
                    c0624m.m1262r();
                    synchronized (c2307e.f7159o0) {
                        ((ArrayList) c2307e.f7160p0).add(c0624m);
                    }
                    c0624m.m1264u(new C5034f(c2307e, 9, c0624m));
                    objM1261q = c0624m.m1261q();
                    if (objM1261q != enumC19250a) {
                        objM1261q = C17296C.f55119a;
                    }
                }
                if (objM1261q == enumC19250a) {
                    return enumC19250a;
                }
                c0296v0 = this;
                InterfaceC5977T interfaceC5977T = (InterfaceC5977T) c0296v0.f1068Z;
                c6004g0.f19494Y = null;
                c6004g0.f19495Z = null;
                c6004g0.f19498q0 = 2;
                objMo876v0 = interfaceC5977T.mo876v0(interfaceC1436k, c6004g0);
                if (objMo876v0 == enumC19250a) {
                    return enumC19250a;
                }
                return objMo876v0;
        }
    }

    public C0296v0(InterfaceC5977T interfaceC5977T) {
        this.f1067Y = 1;
        this.f1068Z = interfaceC5977T;
        this.f1069o0 = new C2307e(5, (byte) 0);
    }
}
