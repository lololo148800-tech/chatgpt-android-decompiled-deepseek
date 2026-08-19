package p003A1;

import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p105E.C2222a;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p156G1.C2968o;
import p492U1.C7536a;
import p692d0.C12970i;
import p911o0.C17727G;
import p911o0.C17734N;

/* JADX INFO: renamed from: A1.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0186M {

    /* JADX INFO: renamed from: a */
    public final int f693a;

    /* JADX INFO: renamed from: b */
    public final long f694b;

    /* JADX INFO: renamed from: c */
    public final int f695c;

    /* JADX INFO: renamed from: d */
    public final int f696d;

    /* JADX INFO: renamed from: e */
    public final int f697e;

    /* JADX INFO: renamed from: f */
    public final Object f698f;

    public C0186M(int i10, C17734N c17734n, long j10, int i11, int i12, int i13) {
        this.f693a = i10;
        this.f698f = c17734n;
        this.f694b = j10;
        this.f695c = i11;
        this.f696d = i12;
        this.f697e = i13;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003e  */
    /* JADX INFO: renamed from: a */
    public C17727G m566a(C2222a c2222a, boolean z6, int i10, int i11, int i12, int i13) {
        C17727G c17727g;
        InterfaceC21056J interfaceC21056J;
        C12970i c12970i;
        AbstractC21069X abstractC21069X;
        if (!c2222a.f6806b) {
            return null;
        }
        C17734N c17734n = (C17734N) this.f698f;
        int iM24h = AbstractC0010F.m24h(c17734n.f56619a);
        boolean z10 = true;
        if (iM24h == 0 || iM24h == 1) {
            c17727g = null;
        } else {
            if (iM24h != 2 && iM24h != 3) {
                throw new C0644w();
            }
            if (z6) {
                interfaceC21056J = c17734n.f56622d;
                c12970i = c17734n.f56626h;
                abstractC21069X = c17734n.f56623e;
            } else {
                interfaceC21056J = (i10 < c17734n.f56620b - 1 || i11 < c17734n.f56621c) ? null : c17734n.f56624f;
                c12970i = c17734n.f56627i;
                abstractC21069X = c17734n.f56625g;
            }
            if (interfaceC21056J == null) {
                c17727g = null;
            } else {
                AbstractC16544l.m18091d(c12970i);
                c17727g = new C17727G(interfaceC21056J, abstractC21069X, c12970i.f41180a);
            }
        }
        if (c17727g == null) {
            return null;
        }
        if (i10 < 0 || (i13 != 0 && (i12 - ((int) (c17727g.f56595c >> 32)) < 0 || i13 >= this.f693a))) {
            z10 = false;
        }
        c17727g.f56596d = z10;
        return c17727g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if ((((int) (r21 >> 32)) - ((int) (r16 >> 32))) < 0) goto L24;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2222a m567b(boolean z6, int i10, long j10, C12970i c12970i, int i11, int i12, int i13, boolean z10, boolean z11) {
        long j11;
        int i14 = i12 + i13;
        if (c12970i == null) {
            return new C2222a(true, true);
        }
        C17734N c17734n = (C17734N) this.f698f;
        int i15 = c17734n.f56619a;
        long j12 = c12970i.f41180a;
        if (i15 != 1 && (i11 >= this.f695c || ((int) (j10 & 4294967295L)) - ((int) (j12 & 4294967295L)) < 0)) {
            return new C2222a(true, true);
        }
        int i16 = this.f696d;
        int i17 = this.f697e;
        long j13 = this.f694b;
        int i18 = this.f693a;
        if (i10 != 0) {
            if (i10 >= i18) {
                j11 = j12;
            } else {
                j11 = j12;
            }
            return z10 ? new C2222a(true, true) : new C2222a(true, m567b(z6, 0, C12970i.m14660a(C7536a.m7854i(j13), (((int) (j10 & 4294967295L)) - i17) - i13), new C12970i(C12970i.m14660a(((int) (j11 >> 32)) - i16, (int) (j11 & 4294967295L))), i11 + 1, i14, 0, true, false).f6806b);
        }
        j11 = j12;
        int i19 = (int) (j11 & 4294967295L);
        int iMax = Math.max(i13, i19) + i12;
        C12970i c12970iM19463a = z11 ? null : c17734n.m19463a(i11, iMax, z6);
        if (c12970iM19463a == null || (i10 + 1 < i18 && ((((int) (j10 >> 32)) - ((int) (j11 >> 32))) - i16) - ((int) (c12970iM19463a.f41180a >> 32)) >= 0)) {
            return new C2222a(false, false);
        }
        if (z11) {
            return new C2222a(true, true);
        }
        boolean z12 = m567b(false, 0, C12970i.m14660a(C7536a.m7854i(j13), (((int) (j10 & 4294967295L)) - i17) - Math.max(i13, i19)), c12970iM19463a, i11 + 1, iMax, 0, true, true).f6806b;
        return new C2222a(z12, z12);
    }

    public C0186M(C2968o c2968o, int i10, int i11, int i12, int i13, long j10) {
        this.f698f = c2968o;
        this.f693a = i10;
        this.f695c = i11;
        this.f696d = i12;
        this.f697e = i13;
        this.f694b = j10;
    }
}
