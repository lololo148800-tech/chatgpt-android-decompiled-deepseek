package p846k4;

import io.sentry.C15358g1;
import java.util.Arrays;
import p054C0.C1497j;
import p1016t3.C19788o;
import p1073w3.C20811m;
import p372P3.AbstractC6320b;
import p372P3.C6339u;
import p658b5.C11234e;

/* JADX INFO: renamed from: k4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16334c extends AbstractC16341j {

    /* JADX INFO: renamed from: n */
    public C6339u f50676n;

    /* JADX INFO: renamed from: o */
    public C1497j f50677o;

    @Override // p846k4.AbstractC16341j
    /* JADX INFO: renamed from: b */
    public final long mo17923b(C20811m c20811m) {
        byte[] bArr = c20811m.f66092a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            c20811m.m21345G(4);
            c20811m.m21339A();
        }
        int iM6901q = AbstractC6320b.m6901q(i10, c20811m);
        c20811m.m21344F(0);
        return iM6901q;
    }

    @Override // p846k4.AbstractC16341j
    /* JADX INFO: renamed from: c */
    public final boolean mo17924c(C20811m c20811m, long j10, C15358g1 c15358g1) {
        byte[] bArr = c20811m.f66092a;
        C6339u c6339u = this.f50676n;
        if (c6339u == null) {
            C6339u c6339u2 = new C6339u(17, bArr);
            this.f50676n = c6339u2;
            c15358g1.f47945Y = c6339u2.m6955c(Arrays.copyOfRange(bArr, 9, c20811m.f66094c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            C1497j c1497j = this.f50677o;
            if (c1497j != null) {
                c1497j.f3970Y = j10;
                c15358g1.f47946Z = c1497j;
            }
            ((C19788o) c15358g1.f47945Y).getClass();
            return false;
        }
        C11234e c11234eM6902r = AbstractC6320b.m6902r(c20811m);
        C6339u c6339u3 = new C6339u(c6339u.f20565a, c6339u.f20566b, c6339u.f20567c, c6339u.f20568d, c6339u.f20569e, c6339u.f20571g, c6339u.f20572h, c6339u.f20574j, c11234eM6902r, c6339u.f20576l);
        this.f50676n = c6339u3;
        C1497j c1497j2 = new C1497j();
        c1497j2.f3972o0 = c6339u3;
        c1497j2.f3973p0 = c11234eM6902r;
        c1497j2.f3970Y = -1L;
        c1497j2.f3971Z = -1L;
        this.f50677o = c1497j2;
        return true;
    }

    @Override // p846k4.AbstractC16341j
    /* JADX INFO: renamed from: d */
    public final void mo17925d(boolean z6) {
        super.mo17925d(z6);
        if (z6) {
            this.f50676n = null;
            this.f50677o = null;
        }
    }
}
