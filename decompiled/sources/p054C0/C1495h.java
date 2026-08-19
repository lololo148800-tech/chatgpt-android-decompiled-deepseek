package p054C0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.compose.p650ui.input.pointer.SuspendPointerInputElement;
import p080D0.C1773G;
import p080D0.C1816m;
import p080D0.C1821o0;
import p080D0.InterfaceC1815l0;
import p1014t1.AbstractC19736m;
import p1014t1.AbstractC19744u;
import p1014t1.C19729f;
import p1071w0.AbstractC20740b0;
import p349O0.InterfaceC6034v0;
import p635a1.InterfaceC10459q;
import p692d0.C12985x;

/* JADX INFO: renamed from: C0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1495h implements InterfaceC6034v0 {

    /* JADX INFO: renamed from: Y */
    public final long f3959Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1815l0 f3960Z;

    /* JADX INFO: renamed from: o0 */
    public final long f3961o0;

    /* JADX INFO: renamed from: p0 */
    public C1498k f3962p0;

    /* JADX INFO: renamed from: q0 */
    public C1816m f3963q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC10459q f3964r0;

    public C1495h(long j10, InterfaceC1815l0 interfaceC1815l0, long j11) {
        C1498k c1498k = C1498k.f3974c;
        this.f3959Y = j10;
        this.f3960Z = interfaceC1815l0;
        this.f3961o0 = j11;
        this.f3962p0 = c1498k;
        C1494g c1494g = new C1494g(this, 0);
        C1496i c1496i = new C1496i(c1494g, interfaceC1815l0, j10);
        C1497j c1497j = new C1497j();
        c1497j.f3972o0 = c1494g;
        c1497j.f3973p0 = interfaceC1815l0;
        c1497j.f3971Z = j10;
        c1497j.f3970Y = 0L;
        C1773G c1773g = new C1773G(c1497j, c1496i, null);
        C19729f c19729f = AbstractC19744u.f62512a;
        this.f3964r0 = AbstractC19736m.m20686h(new SuspendPointerInputElement(c1497j, c1496i, c1773g, 4), AbstractC20740b0.f65747b);
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: a */
    public final void mo2149a() {
        C1816m c1816m = this.f3963q0;
        if (c1816m != null) {
            ((C1821o0) this.f3960Z).m2651d(c1816m);
            this.f3963q0 = null;
        }
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: c */
    public final void mo2150c() {
        C1816m c1816m = this.f3963q0;
        if (c1816m != null) {
            ((C1821o0) this.f3960Z).m2651d(c1816m);
            this.f3963q0 = null;
        }
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: d */
    public final void mo2151d() {
        C1494g c1494g = new C1494g(this, 1);
        C1494g c1494g2 = new C1494g(this, 2);
        long j10 = this.f3959Y;
        C1816m c1816m = new C1816m(j10, c1494g, c1494g2);
        C1821o0 c1821o0 = (C1821o0) this.f3960Z;
        if (j10 == 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "The selectable contains an invalid id: ").toString());
        }
        C12985x c12985x = c1821o0.f5244c;
        if (c12985x.m14709b(j10)) {
            throw new IllegalArgumentException(("Another selectable with the id: " + c1816m + ".selectableId has already subscribed.").toString());
        }
        int iM14710c = c12985x.m14710c(j10);
        c12985x.f41222b[iM14710c] = j10;
        c12985x.f41223c[iM14710c] = c1816m;
        c1821o0.f5243b.add(c1816m);
        c1821o0.f5242a = false;
        this.f3963q0 = c1816m;
    }
}
