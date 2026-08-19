package p1140z1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21069X;
import p1095x1.C21054H;
import p1095x1.C21094o;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21098s;
import p1139z0.C21638r0;
import p228J.AbstractC3794B0;
import p523V9.AbstractC8111i5;
import p692d0.C12987z;

/* JADX INFO: renamed from: z1.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21668N extends AbstractC21069X implements InterfaceC21673T, InterfaceC21059M {

    /* JADX INFO: renamed from: r0 */
    public boolean f68756r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f68757s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f68758t0;

    /* JADX INFO: renamed from: u0 */
    public final C21054H f68759u0 = new C21054H(this, 0);

    /* JADX INFO: renamed from: v0 */
    public C12987z f68760v0;

    /* JADX INFO: renamed from: w0 */
    public C12987z f68761w0;

    /* JADX INFO: renamed from: s0 */
    public static void m22116s0(AbstractC21678Y abstractC21678Y) {
        C21659E c21659e;
        AbstractC21678Y abstractC21678Y2 = abstractC21678Y.f68820y0;
        C21658D c21658d = abstractC21678Y2 != null ? abstractC21678Y2.f68819x0 : null;
        C21658D c21658d2 = abstractC21678Y.f68819x0;
        if (!AbstractC16544l.m18089b(c21658d, c21658d2)) {
            c21658d2.m22060t().f68746r.f68706G0.m22077f();
            return;
        }
        InterfaceC21680a interfaceC21680aMo22091g = c21658d2.m22060t().f68746r.mo22091g();
        if (interfaceC21680aMo22091g == null || (c21659e = ((C21664J) interfaceC21680aMo22091g).f68706G0) == null) {
            return;
        }
        c21659e.m22077f();
    }

    @Override // p1140z1.InterfaceC21673T
    /* JADX INFO: renamed from: C */
    public final void mo22084C(boolean z6) {
        this.f68756r0 = z6;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return m22127v0(mo7861O(i10));
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: H */
    public final int mo21547H(C21094o c21094o) {
        int iMo22117V;
        if (mo22121j0() && (iMo22117V = mo22117V(c21094o)) != Integer.MIN_VALUE) {
            return iMo22117V + ((int) (this.f66985q0 & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return m22127v0(mo7862P(f10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        return i10 / getDensity();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        return f10 / getDensity();
    }

    @Override // p1095x1.InterfaceC21059M
    /* JADX INFO: renamed from: R */
    public final InterfaceC21058L mo19936R(int i10, int i11, Map map, InterfaceC1436k interfaceC1436k) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new C21666L(i10, i11, map, interfaceC1436k, this);
        }
        AbstractC8111i5.m8592c("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    /* JADX INFO: renamed from: V */
    public abstract int mo22117V(C21094o c21094o);

    @Override // p1095x1.InterfaceC21095p
    /* JADX INFO: renamed from: Z */
    public boolean mo19937Z() {
        return false;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return getDensity() * f10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b A[LOOP:0: B:17:0x003b->B:29:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0083 A[EDGE_INSN: B:72:0x0083->B:30:0x0083 BREAK  A[LOOP:0: B:17:0x003b->B:29:0x007b], SYNTHETIC] */
    /* JADX INFO: renamed from: e0 */
    public final void m22118e0(C21695h0 c21695h0) {
        AbstractC21668N abstractC21668NMo22124p0;
        C21691f0 snapshotObserver;
        if (this.f68758t0 || c21695h0.f68862Y.mo19807c() == null) {
            return;
        }
        C12987z c12987z = this.f68761w0;
        if (c12987z == null) {
            c12987z = new C12987z();
            this.f68761w0 = c12987z;
        }
        C12987z c12987z2 = this.f68760v0;
        if (c12987z2 == null) {
            c12987z2 = new C12987z();
            this.f68760v0 = c12987z2;
        }
        Object[] objArr = c12987z2.f41233b;
        float[] fArr = c12987z2.f41234c;
        long[] jArr = c12987z2.f41232a;
        int length = jArr.length - 2;
        long j10 = -9187201950435737472L;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                int i11 = i10;
                if ((((~j11) << 7) & j11 & j10) != j10) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j11 & 255) < 128) {
                            int i14 = (i11 << 3) + i13;
                            c12987z.m14721e(objArr[i14], fArr[i14]);
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i10 = i11 + 1;
                    j10 = -9187201950435737472L;
                } else if (i11 != length) {
                    break;
                    break;
                } else {
                    i10 = i11 + 1;
                    j10 = -9187201950435737472L;
                }
            }
        }
        c12987z2.m14717a();
        AndroidComposeView androidComposeView = mo22122l0().f68658u0;
        if (androidComposeView != null && (snapshotObserver = androidComposeView.getSnapshotObserver()) != null) {
            snapshotObserver.m22222a(c21695h0, C21688e.f68833o0, new C21638r0(c21695h0, 4, this));
        }
        Object[] objArr2 = c12987z2.f41233b;
        long[] jArr2 = c12987z2.f41232a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j12 = jArr2[i15];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j12 & 255) < 128) {
                            if (objArr2[(i15 << 3) + i17] != null) {
                                throw new ClassCastException();
                            }
                            if (c12987z.m14719c(null) < 0 && (abstractC21668NMo22124p0 = mo22124p0()) != null) {
                                AbstractC21668N abstractC21668NMo22124p1 = abstractC21668NMo22124p0;
                                do {
                                    C12987z c12987z3 = abstractC21668NMo22124p1.f68760v0;
                                    if (c12987z3 != null && c12987z3.m14719c(null) >= 0) {
                                        break;
                                    } else {
                                        abstractC21668NMo22124p1 = abstractC21668NMo22124p1.mo22124p0();
                                    }
                                } while (abstractC21668NMo22124p1 != null);
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                }
                if (i15 == length2) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        c12987z.m14717a();
    }

    /* JADX INFO: renamed from: g0 */
    public abstract AbstractC21668N mo22119g0();

    /* JADX INFO: renamed from: h0 */
    public abstract InterfaceC21098s mo22120h0();

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return Math.round(mo7869t0(j10));
    }

    /* JADX INFO: renamed from: j0 */
    public abstract boolean mo22121j0();

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ int mo7866k0(float f10) {
        return AbstractC3794B0.m4485j(this, f10);
    }

    /* JADX INFO: renamed from: l0 */
    public abstract C21658D mo22122l0();

    /* JADX INFO: renamed from: n0 */
    public abstract InterfaceC21058L mo22123n0();

    /* JADX INFO: renamed from: p0 */
    public abstract AbstractC21668N mo22124p0();

    /* JADX INFO: renamed from: q0 */
    public abstract long mo22125q0();

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long mo7867r0(long j10) {
        return AbstractC3794B0.m4489n(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long mo7868s(long j10) {
        return AbstractC3794B0.m4487l(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ float mo7869t0(long j10) {
        return AbstractC3794B0.m4488m(j10, this);
    }

    /* JADX INFO: renamed from: u0 */
    public abstract void mo22126u0();

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ long m22127v0(float f10) {
        return AbstractC3794B0.m4490o(this, f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float mo7870w(long j10) {
        return AbstractC3794B0.m4486k(j10, this);
    }
}
