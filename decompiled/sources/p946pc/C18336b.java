package p946pc;

import android.gov.nist.core.Separators;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1436k;
import p1051v0.AbstractC20417e;
import p1051v0.C20415c;
import p1051v0.C20416d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p492U1.C7548m;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9306j0;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: pc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18336b {

    /* JADX INFO: renamed from: a */
    public final long f58535a;

    /* JADX INFO: renamed from: b */
    public final long f58536b;

    /* JADX INFO: renamed from: c */
    public final long f58537c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1436k f58538d;

    public C18336b() {
        long jM9650c = AbstractC9119D4.m9650c(6);
        long jM9650c2 = AbstractC9119D4.m9650c(3);
        long jM9650c3 = AbstractC9119D4.m9650c(6);
        C18335a c18335a = C18335a.f58525Z;
        this.f58535a = jM9650c;
        this.f58536b = jM9650c2;
        this.f58537c = jM9650c3;
        this.f58538d = c18335a;
    }

    /* JADX INFO: renamed from: a */
    public final void m19853a(C18320E c18320e, C6021p c6021p, int i10) {
        AbstractC16544l.m18094g(c18320e, "<this>");
        c6021p.m6526U(2046098125);
        int i11 = (i10 & 14) == 0 ? (c6021p.m6542f(c18320e) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6542f(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            long j10 = ((C14365u) this.f58538d.invoke(new C14365u(AbstractC18319D.m19845d(c18320e, c6021p)))).f45062a;
            long j11 = this.f58535a;
            C7548m c7548m = new C7548m(j11);
            long j12 = this.f58537c;
            C7548m c7548m2 = new C7548m(j12);
            long j13 = this.f58536b;
            Object[] objArr = {c7548m, c7548m2, new C7548m(j13), new C14365u(j10)};
            c6021p.m6525T(-568225417);
            boolean zM6542f = false;
            for (int i12 = 0; i12 < 4; i12++) {
                zM6542f |= c6021p.m6542f(objArr[i12]);
            }
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                InterfaceC10459q interfaceC10459qM11256p = AbstractC10844c.m11256p(AbstractC10842a.m11237o(C10456n.f30959Y, interfaceC7537b.mo7870w(j11), 0.0f, interfaceC7537b.mo7870w(j12), 0.0f, 10), interfaceC7537b.mo7870w(j13));
                C20416d c20416d = AbstractC20417e.f64539a;
                C20415c c20415c = new C20415c(50);
                objM6514H = AbstractC10833a.m11207b(interfaceC10459qM11256p, j10, new C20416d(c20415c, c20415c, c20415c, c20415c));
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC17780r.m19507a((InterfaceC10459q) objM6514H, c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(this, c18320e, i10, 24);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18336b)) {
            return false;
        }
        C18336b c18336b = (C18336b) obj;
        return C7548m.m7893a(this.f58535a, c18336b.f58535a) && C7548m.m7893a(this.f58536b, c18336b.f58536b) && C7548m.m7893a(this.f58537c, c18336b.f58537c) && AbstractC16544l.m18089b(this.f58538d, c18336b.f58538d);
    }

    public final int hashCode() {
        return this.f58538d.hashCode() + ((C7548m.m7896d(this.f58537c) + ((C7548m.m7896d(this.f58536b) + (C7548m.m7896d(this.f58535a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String strM7897e = C7548m.m7897e(this.f58535a);
        String strM7897e2 = C7548m.m7897e(this.f58536b);
        String strM7897e3 = C7548m.m7897e(this.f58537c);
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("BarGutter(startMargin=", strM7897e, ", barWidth=", strM7897e2, ", endMargin=");
        sbM9896o.append(strM7897e3);
        sbM9896o.append(", color=");
        sbM9896o.append(this.f58538d);
        sbM9896o.append(Separators.RPAREN);
        return sbM9896o.toString();
    }
}
