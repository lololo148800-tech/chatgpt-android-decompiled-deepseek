package p936p0;

import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p1139z0.C21585H;
import p349O0.C6013l;
import p349O0.C6021p;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9394x4;
import p594Y9.AbstractC9834X3;
import p860l0.EnumC16673F0;
import p909nm.C17689w;
import p972qm.C18777j;

/* JADX INFO: renamed from: p0.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18283w {

    /* JADX INFO: renamed from: a */
    public static final float f58371a = 1;

    /* JADX INFO: renamed from: b */
    public static final C18272l f58372b = new C18272l(null, 0, false, 0.0f, new C18281u(), 0.0f, false, AbstractC0575H.m1174c(C18777j.f59682Y), AbstractC9394x4.m9976a(), AbstractC9388w4.m9959b(0, 0, 15), C17689w.f56480Y, 0, 0, 0, EnumC16673F0.f53401Y, 0, 0);

    /* JADX INFO: renamed from: a */
    public static final C18280t m19827a(int i10, C6021p c6021p, int i11, int i12) {
        boolean z6 = true;
        int i13 = 0;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        C21585H c21585h = C18280t.f58344x;
        boolean z10 = (((i11 & 14) ^ 6) > 4 && c6021p.m6538d(i10)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) <= 32 || !c6021p.m6538d(0)) && (i11 & 48) != 32) {
            z6 = false;
        }
        boolean z11 = z10 | z6;
        Object objM6514H = c6021p.m6514H();
        if (z11 || objM6514H == C6013l.f19514a) {
            objM6514H = new C18282v(i10, i13, 0);
            c6021p.m6537c0(objM6514H);
        }
        return (C18280t) AbstractC9834X3.m10481d(objArr, c21585h, null, (InterfaceC1426a) objM6514H, c6021p, 0, 4);
    }
}
