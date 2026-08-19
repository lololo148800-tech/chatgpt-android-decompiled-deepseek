package p241Jc;

import bb.AbstractC11281F;
import bb.C11312f0;
import java.util.Iterator;
import mm.C17296C;
import p092Dc.C1988e;
import p092Dc.C1996m;
import p092Dc.C2005v;
import p103Dn.C2217y0;
import p190Hc.C3287h;
import p190Hc.InterfaceC3283d;
import p481Tf.C7415t;
import p571X9.AbstractC9233X;
import p876lm.InterfaceC17068a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Jc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4327b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f14106a;

    public C4327b(InterfaceC17068a interfaceC17068a) {
        this.f14106a = interfaceC17068a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m5144a(AbstractC19687c abstractC19687c) {
        C4326a c4326a;
        Iterator it;
        C1988e c1988e;
        C2217y0 c2217y0;
        if (abstractC19687c instanceof C4326a) {
            c4326a = (C4326a) abstractC19687c;
            int i10 = c4326a.f14105p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4326a.f14105p0 = i10 - Integer.MIN_VALUE;
            } else {
                c4326a = new C4326a(this, abstractC19687c);
            }
        } else {
            c4326a = new C4326a(this, abstractC19687c);
        }
        Object obj = c4326a.f14103Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4326a.f14105p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC3283d interfaceC3283d = (InterfaceC3283d) ((C3287h) this.f14106a.get()).f10025s0.f6797Y.getValue();
            C1996m c1996m = null;
            C2005v c2005v = interfaceC3283d instanceof C2005v ? (C2005v) interfaceC3283d : null;
            if (c2005v != null && (c1988e = (C1988e) c2005v.f6142j.get()) != null && (c2217y0 = c1988e.f5878d) != null) {
                c1996m = (C1996m) c2217y0.f6797Y.getValue();
            }
            if (c1996m != null) {
                C7415t c7415t = (C7415t) c1996m.f5906E.get();
                int i12 = AbstractC11281F.f34166o0;
                it = new C11312f0(c7415t).iterator();
            }
            return C17296C.f55119a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = c4326a.f14102Y;
        AbstractC9233X.m9807c(obj);
        while (it.hasNext()) {
            C7415t c7415t2 = (C7415t) it.next();
            c4326a.f14102Y = it;
            c4326a.f14105p0 = 1;
            if (c7415t2.m7800d(c4326a) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
