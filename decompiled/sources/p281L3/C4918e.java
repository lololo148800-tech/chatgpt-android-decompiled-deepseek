package p281L3;

import android.text.TextUtils;
import bb.AbstractC11293S;
import bb.AbstractC11328u;
import bb.C11292Q;
import bb.C11294T;
import bb.C11302a0;
import p003A1.AbstractC0168G;
import p1016t3.C19765O;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: L3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4918e extends AbstractC4926m implements Comparable {

    /* JADX INFO: renamed from: A0 */
    public final int f16014A0;

    /* JADX INFO: renamed from: B0 */
    public final int f16015B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f16016C0;

    /* JADX INFO: renamed from: D0 */
    public final int f16017D0;

    /* JADX INFO: renamed from: E0 */
    public final int f16018E0;

    /* JADX INFO: renamed from: F0 */
    public final int f16019F0;

    /* JADX INFO: renamed from: G0 */
    public final int f16020G0;

    /* JADX INFO: renamed from: H0 */
    public final boolean f16021H0;

    /* JADX INFO: renamed from: I0 */
    public final boolean f16022I0;

    /* JADX INFO: renamed from: q0 */
    public final int f16023q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f16024r0;

    /* JADX INFO: renamed from: s0 */
    public final String f16025s0;

    /* JADX INFO: renamed from: t0 */
    public final C4922i f16026t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f16027u0;

    /* JADX INFO: renamed from: v0 */
    public final int f16028v0;

    /* JADX INFO: renamed from: w0 */
    public final int f16029w0;

    /* JADX INFO: renamed from: x0 */
    public final int f16030x0;

    /* JADX INFO: renamed from: y0 */
    public final boolean f16031y0;

    /* JADX INFO: renamed from: z0 */
    public final boolean f16032z0;

    public C4918e(int i10, C19765O c19765o, int i11, C4922i c4922i, int i12, boolean z6, C4917d c4917d, int i13) {
        int i14;
        int iM5535c;
        int iM5535c2;
        boolean z10;
        super(i10, c19765o, i11);
        this.f16026t0 = c4922i;
        int i15 = c4922i.f16050u ? 24 : 16;
        int i16 = 0;
        this.f16031y0 = false;
        this.f16025s0 = C4928o.m5536e(this.f16069p0.f62743d);
        this.f16027u0 = AbstractC0168G.m526o(i12, false);
        int i17 = 0;
        while (true) {
            C11294T c11294t = c4922i.f62633i;
            i14 = Integer.MAX_VALUE;
            if (i17 >= c11294t.size()) {
                iM5535c = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iM5535c = C4928o.m5535c(this.f16069p0, (String) c11294t.get(i17), false);
                if (iM5535c > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f16029w0 = i17;
        this.f16028v0 = iM5535c;
        this.f16030x0 = C4928o.m5534b(this.f16069p0.f62745f, 0);
        C19788o c19788o = this.f16069p0;
        int i18 = c19788o.f62745f;
        this.f16032z0 = i18 == 0 || (i18 & 1) != 0;
        this.f16016C0 = (c19788o.f62744e & 1) != 0;
        int i19 = c19788o.f62729A;
        this.f16017D0 = i19;
        this.f16018E0 = c19788o.f62730B;
        int i20 = c19788o.f62748i;
        this.f16019F0 = i20;
        this.f16024r0 = (i20 == -1 || i20 <= c4922i.f62635k) && (i19 == -1 || i19 <= c4922i.f62634j) && c4917d.apply(c19788o);
        String[] strArrM21421v = AbstractC20817s.m21421v();
        int i21 = 0;
        while (true) {
            if (i21 >= strArrM21421v.length) {
                iM5535c2 = 0;
                i21 = Integer.MAX_VALUE;
                break;
            } else {
                iM5535c2 = C4928o.m5535c(this.f16069p0, strArrM21421v[i21], false);
                if (iM5535c2 > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.f16014A0 = i21;
        this.f16015B0 = iM5535c2;
        int i22 = 0;
        while (true) {
            C11294T c11294t2 = c4922i.f62636l;
            if (i22 < c11294t2.size()) {
                String str = this.f16069p0.f62752m;
                if (str != null && str.equals(c11294t2.get(i22))) {
                    i14 = i22;
                    break;
                }
                i22++;
            } else {
                break;
            }
        }
        this.f16020G0 = i14;
        this.f16021H0 = AbstractC0168G.m524m(i12) == 128;
        this.f16022I0 = AbstractC0168G.m525n(i12) == 64;
        C4922i c4922i2 = this.f16026t0;
        if (AbstractC0168G.m526o(i12, c4922i2.f16052w) && ((z10 = this.f16024r0) || c4922i2.f16049t)) {
            c4922i2.f62637m.getClass();
            i16 = (!AbstractC0168G.m526o(i12, false) || !z10 || this.f16069p0.f62748i == -1 || (!c4922i2.f16053x && z6) || (i15 & i12) == 0) ? 1 : 2;
        }
        this.f16023q0 = i16;
    }

    @Override // p281L3.AbstractC4926m
    /* JADX INFO: renamed from: a */
    public final int mo5527a() {
        return this.f16023q0;
    }

    @Override // p281L3.AbstractC4926m
    /* JADX INFO: renamed from: b */
    public final boolean mo5528b(AbstractC4926m abstractC4926m) {
        int i10;
        String str;
        C4918e c4918e = (C4918e) abstractC4926m;
        this.f16026t0.getClass();
        C19788o c19788o = this.f16069p0;
        int i11 = c19788o.f62729A;
        if (i11 != -1) {
            C19788o c19788o2 = c4918e.f16069p0;
            if (i11 == c19788o2.f62729A && ((this.f16031y0 || ((str = c19788o.f62752m) != null && TextUtils.equals(str, c19788o2.f62752m))) && (i10 = c19788o.f62730B) != -1 && i10 == c19788o2.f62730B)) {
                if (this.f16021H0 == c4918e.f16021H0 && this.f16022I0 == c4918e.f16022I0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4918e c4918e) {
        boolean z6 = this.f16027u0;
        boolean z10 = this.f16024r0;
        AbstractC11293S abstractC11293SMo12712a = (z10 && z6) ? C4928o.f16085i : C4928o.f16085i.mo12712a();
        AbstractC11328u abstractC11328uMo12757c = AbstractC11328u.f34256a.mo12757c(z6, c4918e.f16027u0);
        Integer numValueOf = Integer.valueOf(this.f16029w0);
        Integer numValueOf2 = Integer.valueOf(c4918e.f16029w0);
        C11292Q.f34184Y.getClass();
        C11302a0 c11302a0 = C11302a0.f34216Y;
        AbstractC11328u abstractC11328uMo12756b = abstractC11328uMo12757c.mo12756b(numValueOf, numValueOf2, c11302a0).mo12755a(this.f16028v0, c4918e.f16028v0).mo12755a(this.f16030x0, c4918e.f16030x0).mo12757c(this.f16016C0, c4918e.f16016C0).mo12757c(this.f16032z0, c4918e.f16032z0).mo12756b(Integer.valueOf(this.f16014A0), Integer.valueOf(c4918e.f16014A0), c11302a0).mo12755a(this.f16015B0, c4918e.f16015B0).mo12757c(z10, c4918e.f16024r0).mo12756b(Integer.valueOf(this.f16020G0), Integer.valueOf(c4918e.f16020G0), c11302a0);
        this.f16026t0.getClass();
        AbstractC11328u abstractC11328uMo12756b2 = abstractC11328uMo12756b.mo12757c(this.f16021H0, c4918e.f16021H0).mo12757c(this.f16022I0, c4918e.f16022I0).mo12756b(Integer.valueOf(this.f16017D0), Integer.valueOf(c4918e.f16017D0), abstractC11293SMo12712a).mo12756b(Integer.valueOf(this.f16018E0), Integer.valueOf(c4918e.f16018E0), abstractC11293SMo12712a);
        if (AbstractC20817s.m21400a(this.f16025s0, c4918e.f16025s0)) {
            abstractC11328uMo12756b2 = abstractC11328uMo12756b2.mo12756b(Integer.valueOf(this.f16019F0), Integer.valueOf(c4918e.f16019F0), abstractC11293SMo12712a);
        }
        return abstractC11328uMo12756b2.mo12759e();
    }
}
