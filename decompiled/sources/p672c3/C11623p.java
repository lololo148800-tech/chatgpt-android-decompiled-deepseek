package p672c3;

import af.C10564U;
import java.util.concurrent.atomic.AtomicReference;
import p025An.C0624m;
import p025An.C0644w;
import p025An.InterfaceC0620k;
import p049Bm.InterfaceC1439n;
import p077Cn.C1757y;
import p077Cn.InterfaceC1758z;
import p334Na.AbstractC5695b;
import p523V9.AbstractC8154o0;
import p537W0.C8410b;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C11623p implements InterfaceC18774g {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AtomicReference f35220Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1758z f35221Z;

    public C11623p(AtomicReference atomicReference, InterfaceC1758z interfaceC1758z) {
        this.f35220Y = atomicReference;
        this.f35221Z = interfaceC1758z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final void m12998b(C8410b c8410b, AbstractC19687c abstractC19687c) {
        C11621o c11621o;
        if (abstractC19687c instanceof C11621o) {
            c11621o = (C11621o) abstractC19687c;
            int i10 = c11621o.f35217o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11621o.f35217o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11621o = new C11621o(this, abstractC19687c);
            }
        } else {
            c11621o = new C11621o(this, abstractC19687c);
        }
        Object obj = c11621o.f35215Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11621o.f35217o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            AtomicReference atomicReference = this.f35220Y;
            InterfaceC1758z interfaceC1758z = this.f35221Z;
            c11621o.f35217o0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c11621o));
            c0624m.m1262r();
            c0624m.m1264u(new C10564U(interfaceC1758z, 13));
            InterfaceC0620k interfaceC0620k = (InterfaceC0620k) atomicReference.getAndSet(c0624m);
            if (interfaceC0620k != null) {
                interfaceC0620k.mo1244b(null);
            }
            ((C1757y) interfaceC1758z).mo2524p(c8410b);
            if (c0624m.m1261q() == enumC19250a) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }

    @Override // p972qm.InterfaceC18776i
    public final Object fold(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6136c(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18774g
    public final InterfaceC18775h getKey() {
        return C11641y.f35270Y;
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6137d(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i interfaceC18776i) {
        return AbstractC5695b.m6138e(this, interfaceC18776i);
    }
}
