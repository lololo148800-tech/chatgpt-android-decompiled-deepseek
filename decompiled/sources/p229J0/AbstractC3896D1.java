package p229J0;

import p302M0.AbstractC5268t;
import p349O0.C6021p;
import p774h1.C14365u;

/* JADX INFO: renamed from: J0.D1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3896D1 {

    /* JADX INFO: renamed from: a */
    public static final float f11851a = AbstractC5268t.f17270a;

    /* JADX INFO: renamed from: a */
    public static C3890C1 m4607a(long j10, long j11, long j12, long j13, C6021p c6021p, int i10) {
        long jM4662d;
        if ((i10 & 1) != 0) {
            float f10 = AbstractC5268t.f17270a;
            jM4662d = AbstractC3959O0.m4662d(35, c6021p);
        } else {
            jM4662d = j10;
        }
        return new C3890C1(jM4662d, (i10 & 2) != 0 ? AbstractC3959O0.m4662d(AbstractC5268t.f17287r, c6021p) : j11, (i10 & 4) != 0 ? AbstractC3959O0.m4662d(AbstractC5268t.f17288s, c6021p) : j12, AbstractC3959O0.m4662d(AbstractC5268t.f17289t, c6021p), AbstractC3959O0.m4662d(AbstractC5268t.f17290u, c6021p), (i10 & 32) != 0 ? AbstractC3959O0.m4662d(AbstractC5268t.f17291v, c6021p) : j13, C14365u.m15774b(AbstractC5268t.f17271b, AbstractC3959O0.m4662d(AbstractC5268t.f17284o, c6021p)), C14365u.m15774b(AbstractC5268t.f17272c, AbstractC3959O0.m4662d(AbstractC5268t.f17285p, c6021p)), C14365u.m15774b(AbstractC5268t.f17273d, AbstractC3959O0.m4662d(AbstractC5268t.f17286q, c6021p)));
    }
}
