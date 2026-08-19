package p281L3;

import bb.AbstractC11328u;
import bb.C11292Q;
import bb.C11294T;
import bb.C11302a0;
import p003A1.AbstractC0168G;
import p1016t3.C19765O;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: L3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C4927n extends AbstractC4926m {

    /* JADX INFO: renamed from: A0 */
    public final boolean f16070A0;

    /* JADX INFO: renamed from: B0 */
    public final int f16071B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f16072C0;

    /* JADX INFO: renamed from: D0 */
    public final boolean f16073D0;

    /* JADX INFO: renamed from: E0 */
    public final int f16074E0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f16075q0;

    /* JADX INFO: renamed from: r0 */
    public final C4922i f16076r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f16077s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f16078t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f16079u0;

    /* JADX INFO: renamed from: v0 */
    public final int f16080v0;

    /* JADX INFO: renamed from: w0 */
    public final int f16081w0;

    /* JADX INFO: renamed from: x0 */
    public final int f16082x0;

    /* JADX INFO: renamed from: y0 */
    public final int f16083y0;

    /* JADX INFO: renamed from: z0 */
    public final boolean f16084z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:42:0x0069  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    public C4927n(int i10, C19765O c19765o, int i11, C4922i c4922i, int i12, int i13, boolean z6) {
        boolean z10;
        boolean z11;
        boolean z12;
        C19788o c19788o;
        int i14;
        int i15;
        int i16;
        C19788o c19788o2;
        int i17;
        int i18;
        int i19;
        super(i10, c19765o, i11);
        int i20 = 4;
        int i21 = 0;
        this.f16076r0 = c4922i;
        int i22 = c4922i.f16048s ? 24 : 16;
        this.f16070A0 = false;
        if (!z6 || (((i17 = (c19788o2 = this.f16069p0).f62758s) != -1 && i17 > c4922i.f62625a) || ((i18 = c19788o2.f62759t) != -1 && i18 > c4922i.f62626b))) {
            z10 = false;
        } else {
            float f10 = c19788o2.f62760u;
            if ((f10 == -1.0f || f10 <= c4922i.f62627c) && ((i19 = c19788o2.f62748i) == -1 || i19 <= c4922i.f62628d)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        this.f16075q0 = z10;
        if (!z6 || (((i14 = (c19788o = this.f16069p0).f62758s) != -1 && i14 < 0) || ((i15 = c19788o.f62759t) != -1 && i15 < 0))) {
            z11 = false;
        } else {
            float f11 = c19788o.f62760u;
            if ((f11 == -1.0f || f11 >= 0) && ((i16 = c19788o.f62748i) == -1 || i16 >= 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.f16077s0 = z11;
        this.f16078t0 = AbstractC0168G.m526o(i12, false);
        C19788o c19788o3 = this.f16069p0;
        float f12 = c19788o3.f62760u;
        this.f16079u0 = f12 != -1.0f && f12 >= 10.0f;
        this.f16080v0 = c19788o3.f62748i;
        this.f16081w0 = c19788o3.m20748b();
        this.f16083y0 = C4928o.m5534b(this.f16069p0.f62745f, 0);
        int i23 = this.f16069p0.f62745f;
        this.f16084z0 = i23 == 0 || (i23 & 1) != 0;
        int i24 = 0;
        while (true) {
            C11294T c11294t = c4922i.f62632h;
            if (i24 >= c11294t.size()) {
                i24 = Integer.MAX_VALUE;
                break;
            }
            String str = this.f16069p0.f62752m;
            if (str != null && str.equals(c11294t.get(i24))) {
                break;
            } else {
                i24++;
            }
        }
        this.f16082x0 = i24;
        this.f16072C0 = AbstractC0168G.m524m(i12) == 128;
        this.f16073D0 = AbstractC0168G.m525n(i12) == 64;
        String str2 = this.f16069p0.f62752m;
        if (str2 != null) {
            switch (str2) {
                case "video/dolby-vision":
                    i20 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i20 = 3;
                    break;
                case "video/avc":
                    i20 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i20 = 2;
                    break;
                default:
                    i20 = 0;
                    break;
            }
        } else {
            i20 = 0;
        }
        this.f16074E0 = i20;
        C19788o c19788o4 = this.f16069p0;
        if ((c19788o4.f62745f & 16384) == 0) {
            C4922i c4922i2 = this.f16076r0;
            if (AbstractC0168G.m526o(i12, c4922i2.f16052w) && ((z12 = this.f16075q0) || c4922i2.f16047r)) {
                i21 = (AbstractC0168G.m526o(i12, false) && this.f16077s0 && z12 && c19788o4.f62748i != -1 && (i22 & i12) != 0) ? 2 : 1;
            }
        }
        this.f16071B0 = i21;
    }

    /* JADX INFO: renamed from: c */
    public static int m5533c(C4927n c4927n, C4927n c4927n2) {
        AbstractC11328u abstractC11328uMo12757c = AbstractC11328u.f34256a.mo12757c(c4927n.f16078t0, c4927n2.f16078t0).mo12755a(c4927n.f16083y0, c4927n2.f16083y0).mo12757c(c4927n.f16084z0, c4927n2.f16084z0).mo12757c(c4927n.f16079u0, c4927n2.f16079u0).mo12757c(c4927n.f16075q0, c4927n2.f16075q0).mo12757c(c4927n.f16077s0, c4927n2.f16077s0);
        Integer numValueOf = Integer.valueOf(c4927n.f16082x0);
        Integer numValueOf2 = Integer.valueOf(c4927n2.f16082x0);
        C11292Q.f34184Y.getClass();
        AbstractC11328u abstractC11328uMo12756b = abstractC11328uMo12757c.mo12756b(numValueOf, numValueOf2, C11302a0.f34216Y);
        boolean z6 = c4927n2.f16072C0;
        boolean z10 = c4927n.f16072C0;
        AbstractC11328u abstractC11328uMo12757c2 = abstractC11328uMo12756b.mo12757c(z10, z6);
        boolean z11 = c4927n2.f16073D0;
        boolean z12 = c4927n.f16073D0;
        AbstractC11328u abstractC11328uMo12757c3 = abstractC11328uMo12757c2.mo12757c(z12, z11);
        if (z10 && z12) {
            abstractC11328uMo12757c3 = abstractC11328uMo12757c3.mo12755a(c4927n.f16074E0, c4927n2.f16074E0);
        }
        return abstractC11328uMo12757c3.mo12759e();
    }

    @Override // p281L3.AbstractC4926m
    /* JADX INFO: renamed from: a */
    public final int mo5527a() {
        return this.f16071B0;
    }

    @Override // p281L3.AbstractC4926m
    /* JADX INFO: renamed from: b */
    public final boolean mo5528b(AbstractC4926m abstractC4926m) {
        C4927n c4927n = (C4927n) abstractC4926m;
        if (this.f16070A0 || AbstractC20817s.m21400a(this.f16069p0.f62752m, c4927n.f16069p0.f62752m)) {
            this.f16076r0.getClass();
            if (this.f16072C0 == c4927n.f16072C0 && this.f16073D0 == c4927n.f16073D0) {
                return true;
            }
        }
        return false;
    }
}
