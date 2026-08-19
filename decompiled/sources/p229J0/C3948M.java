package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import com.openai.chatgpt.R;
import p017Af.C0491v;
import p049Bm.InterfaceC1436k;
import p156G1.AbstractC2965l;
import p278L0.AbstractC4846J;
import p302M0.AbstractC5237D;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.InterfaceC14339Q;

/* JADX INFO: renamed from: J0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C3948M {

    /* JADX INFO: renamed from: a */
    public static final C3948M f12184a = new C3948M();

    /* JADX INFO: renamed from: b */
    public static final float f12185b;

    /* JADX INFO: renamed from: c */
    public static final float f12186c;

    static {
        float f10 = AbstractC5237D.f17000a;
        f12185b = AbstractC5237D.f17002c;
        f12186c = 640;
    }

    /* JADX INFO: renamed from: a */
    public final void m4656a(InterfaceC10459q interfaceC10459q, float f10, float f11, InterfaceC14339Q interfaceC14339Q, long j10, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        float f12;
        float f13;
        InterfaceC14339Q interfaceC14339Q2;
        long jM4662d;
        InterfaceC10459q interfaceC10459q3;
        InterfaceC14339Q interfaceC14339Q3;
        long j11;
        float f14;
        float f15;
        c6021p.m6526U(-1364277227);
        int i11 = i10 | 438;
        if ((i10 & 3072) == 0) {
            i11 = i10 | 1462;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            f14 = f10;
            f15 = f11;
            interfaceC14339Q3 = interfaceC14339Q;
            j11 = j10;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                float f16 = AbstractC5237D.f17001b;
                float f17 = AbstractC5237D.f17000a;
                interfaceC10459q2 = c10456n;
                f12 = f16;
                f13 = f17;
                interfaceC14339Q2 = ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13381e;
                jM4662d = AbstractC3959O0.m4662d(19, c6021p);
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                f12 = f10;
                f13 = f11;
                interfaceC14339Q2 = interfaceC14339Q;
                jM4662d = j10;
            }
            c6021p.m6554q();
            String strM5496e = AbstractC4846J.m5496e(R.string.m3c_bottom_sheet_drag_handle_description, c6021p);
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(interfaceC10459q2, 0.0f, AbstractC4159x3.f13483a, 1);
            boolean zM6542f = c6021p.m6542f(strM5496e);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = new C0491v(strM5496e, 15);
                c6021p.m6537c0(objM6514H);
            }
            AbstractC4034c4.m4725a(AbstractC2965l.m3789a(interfaceC10459qM11235m, false, (InterfaceC1436k) objM6514H), interfaceC14339Q2, jM4662d, 0L, 0.0f, 0.0f, null, AbstractC8411c.m8969c(-1039573072, c6021p, new C3936K(f12, f13)), c6021p, 12582912, 120);
            interfaceC10459q3 = interfaceC10459q2;
            interfaceC14339Q3 = interfaceC14339Q2;
            j11 = jM4662d;
            f14 = f12;
            f15 = f13;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3942L(this, interfaceC10459q3, f14, f15, interfaceC14339Q3, j11, i10);
        }
    }
}
