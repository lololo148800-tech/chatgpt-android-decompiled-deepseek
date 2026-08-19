package p229J0;

import androidx.compose.foundation.AbstractC10839g;
import p006A4.C0349j;
import p042Bf.C1269k;
import p080D0.AbstractC1770D0;
import p080D0.C1768C0;
import p203I0.AbstractC3568y;
import p349O0.C5970P;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6014l0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p773h0.InterfaceC14267W;
import p774h1.C14365u;

/* JADX INFO: renamed from: J0.M1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3950M1 {
    static {
        new C5970P(C3954N0.f12264s0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m4657a(C3949M0 c3949m0, C4135t3 c4135t3, C3941K4 c3941k4, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        C4135t3 c4135t4;
        C4135t3 c4135t5;
        c6021p.m6526U(-2127166334);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c3949m0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(c3941k4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            c4135t5 = c4135t3;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                c4135t4 = (C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a);
            } else {
                c6021p.m6517L();
                c4135t4 = c4135t3;
            }
            c6021p.m6554q();
            InterfaceC14267W interfaceC14267WM4718c = AbstractC4005X2.m4718c(false, 0.0f, c6021p, 0, 7);
            long j10 = c3949m0.f12213a;
            boolean zM6540e = c6021p.m6540e(j10);
            Object objM6514H = c6021p.m6514H();
            if (zM6540e || objM6514H == C6013l.f19514a) {
                objM6514H = new C1768C0(j10, C14365u.m15774b(0.4f, j10));
                c6021p.m6537c0(objM6514H);
            }
            C5997d.m6442b(new C6014l0[]{AbstractC3959O0.f12302a.mo6405a(c3949m0), AbstractC10839g.f32446a.mo6405a(interfaceC14267WM4718c), AbstractC3568y.f10808a.mo6405a(C3964P0.f12344a), AbstractC4141u3.f13417a.mo6405a(c4135t4), AbstractC1770D0.f5051a.mo6405a((C1768C0) objM6514H), AbstractC3947L4.f12183a.mo6405a(c3941k4)}, AbstractC8411c.m8969c(-1066563262, c6021p, new C0349j(c3941k4, 16, c8410b)), c6021p, 56);
            c4135t5 = c4135t4;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 7, c3949m0, c4135t5, c3941k4, c8410b);
        }
    }
}
