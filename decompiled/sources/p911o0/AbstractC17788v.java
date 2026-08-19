package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p349O0.C6013l;
import p349O0.C6021p;
import p571X9.AbstractC9388w4;
import p635a1.C10444b;
import p635a1.InterfaceC10445c;

/* JADX INFO: renamed from: o0.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17788v {

    /* JADX INFO: renamed from: a */
    public static final C17790w f56765a = new C17790w(AbstractC17770m.f56726c, C10444b.f30946y0);

    /* JADX INFO: renamed from: a */
    public static final C17790w m19515a(InterfaceC17766k interfaceC17766k, InterfaceC10445c interfaceC10445c, C6021p c6021p, int i10) {
        if (AbstractC16544l.m18089b(interfaceC17766k, AbstractC17770m.f56726c) && interfaceC10445c.equals(C10444b.f30946y0)) {
            c6021p.m6524S(345962472);
            c6021p.m6553p(false);
            return f56765a;
        }
        c6021p.m6524S(346016319);
        boolean z6 = true;
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c6021p.m6542f(interfaceC17766k)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !c6021p.m6542f(interfaceC10445c)) && (i10 & 48) != 32) {
            z6 = false;
        }
        boolean z11 = z10 | z6;
        Object objM6514H = c6021p.m6514H();
        if (z11 || objM6514H == C6013l.f19514a) {
            objM6514H = new C17790w(interfaceC17766k, interfaceC10445c);
            c6021p.m6537c0(objM6514H);
        }
        C17790w c17790w = (C17790w) objM6514H;
        c6021p.m6553p(false);
        return c17790w;
    }

    /* JADX INFO: renamed from: b */
    public static final long m19516b(int i10, int i11, int i12, boolean z6) {
        if (!z6) {
            return AbstractC9388w4.m9958a(0, i12, i10, i11);
        }
        int iMin = Math.min(i10, 262142);
        int iMin2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
        int iM9960c = AbstractC9388w4.m9960c(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        return AbstractC9388w4.m9958a(Math.min(iM9960c, 0), i12 != Integer.MAX_VALUE ? Math.min(iM9960c, i12) : Integer.MAX_VALUE, iMin, iMin2);
    }
}
