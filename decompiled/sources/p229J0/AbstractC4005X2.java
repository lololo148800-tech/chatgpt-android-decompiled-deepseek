package p229J0;

import androidx.compose.material3.C10858c;
import p203I0.AbstractC3564u;
import p203I0.C3549f;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6037x;
import p349O0.InterfaceC5985X;
import p492U1.C7540e;
import p758g0.C13781p0;
import p773h0.InterfaceC14267W;
import p774h1.C14365u;

/* JADX INFO: renamed from: J0.X2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4005X2 {

    /* JADX INFO: renamed from: a */
    public static final C5984W0 f12565a = new C5984W0(C3954N0.f12267v0);

    /* JADX INFO: renamed from: b */
    public static final C6037x f12566b = new C6037x(C3954N0.f12266u0, C5975S.f19448r0);

    /* JADX INFO: renamed from: c */
    public static final C10858c f12567c;

    /* JADX INFO: renamed from: d */
    public static final C10858c f12568d;

    static {
        long j10 = C14365u.f45060j;
        f12567c = new C10858c(true, Float.NaN, j10);
        f12568d = new C10858c(false, Float.NaN, j10);
    }

    /* JADX INFO: renamed from: a */
    public static final C10858c m4716a(boolean z6, float f10, long j10) {
        if (C7540e.m7873a(f10, Float.NaN) && C14365u.m15775c(j10, C14365u.f45060j)) {
            return z6 ? f12567c : f12568d;
        }
        return new C10858c(z6, f10, j10);
    }

    /* JADX INFO: renamed from: b */
    public static C10858c m4717b(float f10, int i10, long j10, boolean z6) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            j10 = C14365u.f45060j;
        }
        return m4716a(z6, f10, j10);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC14267W m4718c(boolean z6, float f10, C6021p c6021p, int i10, int i11) {
        InterfaceC14267W interfaceC14267WM4716a;
        boolean z10 = true;
        if ((i11 & 1) != 0) {
            z6 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = Float.NaN;
        }
        long j10 = C14365u.f45060j;
        c6021p.m6524S(-1280632857);
        if (((Boolean) c6021p.m6548k(f12565a)).booleanValue()) {
            C13781p0 c13781p0 = AbstractC3564u.f10803a;
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(new C14365u(j10), c6021p);
            boolean z11 = (((i10 & 14) ^ 6) > 4 && c6021p.m6544g(z6)) || (i10 & 6) == 4;
            if ((((i10 & 112) ^ 48) <= 32 || !c6021p.m6536c(f10)) && (i10 & 48) != 32) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objM6514H = c6021p.m6514H();
            if (z12 || objM6514H == C6013l.f19514a) {
                objM6514H = new C3549f(z6, f10, interfaceC5985XM6435V);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC14267WM4716a = (C3549f) objM6514H;
        } else {
            interfaceC14267WM4716a = m4716a(z6, f10, j10);
        }
        c6021p.m6553p(false);
        return interfaceC14267WM4716a;
    }
}
