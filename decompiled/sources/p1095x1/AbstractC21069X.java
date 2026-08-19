package p1095x1;

import p049Bm.InterfaceC1436k;
import p492U1.C7536a;
import p492U1.C7545j;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;
import p843k1.C16308b;

/* JADX INFO: renamed from: x1.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21069X {

    /* JADX INFO: renamed from: Y */
    public int f66981Y;

    /* JADX INFO: renamed from: Z */
    public int f66982Z;

    /* JADX INFO: renamed from: o0 */
    public long f66983o0 = AbstractC9113C4.m9643a(0, 0);

    /* JADX INFO: renamed from: p0 */
    public long f66984p0 = AbstractC21070Y.f66986a;

    /* JADX INFO: renamed from: q0 */
    public long f66985q0 = 0;

    /* JADX INFO: renamed from: H */
    public abstract int mo21547H(C21094o c21094o);

    /* JADX INFO: renamed from: K */
    public int mo21548K() {
        return (int) (this.f66983o0 & 4294967295L);
    }

    /* JADX INFO: renamed from: L */
    public int mo21549L() {
        return (int) (this.f66983o0 >> 32);
    }

    /* JADX INFO: renamed from: M */
    public final void m21550M() {
        this.f66981Y = AbstractC8301I.m8921l((int) (this.f66983o0 >> 32), C7536a.m7856k(this.f66984p0), C7536a.m7854i(this.f66984p0));
        int iM8921l = AbstractC8301I.m8921l((int) (this.f66983o0 & 4294967295L), C7536a.m7855j(this.f66984p0), C7536a.m7853h(this.f66984p0));
        this.f66982Z = iM8921l;
        int i10 = this.f66981Y;
        long j10 = this.f66983o0;
        this.f66985q0 = AbstractC9101A4.m9631a((i10 - ((int) (j10 >> 32))) / 2, (iM8921l - ((int) (j10 & 4294967295L))) / 2);
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo21551N(long j10, float f10, InterfaceC1436k interfaceC1436k);

    /* JADX INFO: renamed from: Q */
    public void mo21552Q(long j10, float f10, C16308b c16308b) {
        mo21551N(j10, f10, null);
    }

    /* JADX INFO: renamed from: S */
    public final void m21553S(long j10) {
        if (C7545j.m7886a(this.f66983o0, j10)) {
            return;
        }
        this.f66983o0 = j10;
        m21550M();
    }

    /* JADX INFO: renamed from: T */
    public final void m21554T(long j10) {
        if (C7536a.m7848c(this.f66984p0, j10)) {
            return;
        }
        this.f66984p0 = j10;
        m21550M();
    }

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object mo21534t() {
        return null;
    }
}
