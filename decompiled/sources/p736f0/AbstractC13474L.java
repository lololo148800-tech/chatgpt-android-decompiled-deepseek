package p736f0;

import af.C10564U;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13764h;
import p758g0.AbstractC13785r0;
import p758g0.C13746W;
import p758g0.C13783q0;
import p758g0.InterfaceC13726B;
import p774h1.C14365u;
import p797i1.AbstractC14901c;

/* JADX INFO: renamed from: f0.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13474L {

    /* JADX INFO: renamed from: a */
    public static final C13746W f42636a = AbstractC13758e.m15254s(0.0f, 0.0f, null, 7);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5982V0 m14999a(long j10, InterfaceC13726B interfaceC13726B, String str, C6021p c6021p, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC13726B = f42636a;
        }
        InterfaceC13726B interfaceC13726B2 = interfaceC13726B;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zM6542f = c6021p.m6542f(C14365u.m15778f(j10));
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            AbstractC14901c abstractC14901cM15778f = C14365u.m15778f(j10);
            C13485c c13485c = C13485c.f42688v0;
            C10564U c10564u = new C10564U(abstractC14901cM15778f, 28);
            C13783q0 c13783q0 = AbstractC13785r0.f43528a;
            C13783q0 c13783q1 = new C13783q0(c13485c, c10564u);
            c6021p.m6537c0(c13783q1);
            objM6514H = c13783q1;
        }
        return AbstractC13764h.m15262c(new C14365u(j10), (C13783q0) objM6514H, interfaceC13726B2, null, str2, null, c6021p, ((i10 << 3) & 896) | ((i10 << 6) & 57344), 8);
    }
}
