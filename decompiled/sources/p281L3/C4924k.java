package p281L3;

import bb.AbstractC11278C;
import bb.AbstractC11328u;
import bb.C11292Q;
import bb.C11294T;
import bb.C11302a0;
import java.util.Comparator;
import p003A1.AbstractC0168G;
import p1016t3.C19765O;

/* JADX INFO: renamed from: L3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4924k extends AbstractC4926m implements Comparable {

    /* JADX INFO: renamed from: q0 */
    public final int f16057q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f16058r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f16059s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f16060t0;

    /* JADX INFO: renamed from: u0 */
    public final int f16061u0;

    /* JADX INFO: renamed from: v0 */
    public final int f16062v0;

    /* JADX INFO: renamed from: w0 */
    public final int f16063w0;

    /* JADX INFO: renamed from: x0 */
    public final int f16064x0;

    /* JADX INFO: renamed from: y0 */
    public final boolean f16065y0;

    public C4924k(int i10, C19765O c19765o, int i11, C4922i c4922i, int i12, String str) {
        int iM5535c;
        super(i10, c19765o, i11);
        int i13 = 0;
        this.f16058r0 = AbstractC0168G.m526o(i12, false);
        int i14 = this.f16069p0.f62744e;
        c4922i.getClass();
        this.f16059s0 = (i14 & 1) != 0;
        this.f16060t0 = (i14 & 2) != 0;
        C11294T c11294t = c4922i.f62638n;
        C11294T c11294tM12695y = c11294t.isEmpty() ? AbstractC11278C.m12695y("") : c11294t;
        int i15 = 0;
        while (true) {
            if (i15 >= c11294tM12695y.size()) {
                i15 = Integer.MAX_VALUE;
                iM5535c = 0;
                break;
            } else {
                iM5535c = C4928o.m5535c(this.f16069p0, (String) c11294tM12695y.get(i15), false);
                if (iM5535c > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f16061u0 = i15;
        this.f16062v0 = iM5535c;
        int iM5534b = C4928o.m5534b(this.f16069p0.f62745f, c4922i.f62639o);
        this.f16063w0 = iM5534b;
        this.f16065y0 = (this.f16069p0.f62745f & 1088) != 0;
        int iM5535c2 = C4928o.m5535c(this.f16069p0, str, C4928o.m5536e(str) == null);
        this.f16064x0 = iM5535c2;
        boolean z6 = iM5535c > 0 || (c11294t.isEmpty() && iM5534b > 0) || this.f16059s0 || (this.f16060t0 && iM5535c2 > 0);
        if (AbstractC0168G.m526o(i12, c4922i.f16052w) && z6) {
            i13 = 1;
        }
        this.f16057q0 = i13;
    }

    @Override // p281L3.AbstractC4926m
    /* JADX INFO: renamed from: a */
    public final int mo5527a() {
        return this.f16057q0;
    }

    @Override // p281L3.AbstractC4926m
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo5528b(AbstractC4926m abstractC4926m) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4924k c4924k) {
        AbstractC11328u abstractC11328uMo12757c = AbstractC11328u.f34256a.mo12757c(this.f16058r0, c4924k.f16058r0);
        Integer numValueOf = Integer.valueOf(this.f16061u0);
        Integer numValueOf2 = Integer.valueOf(c4924k.f16061u0);
        Comparator comparator = C11292Q.f34184Y;
        comparator.getClass();
        C11302a0 c11302a0 = C11302a0.f34216Y;
        AbstractC11328u abstractC11328uMo12756b = abstractC11328uMo12757c.mo12756b(numValueOf, numValueOf2, c11302a0);
        int i10 = this.f16062v0;
        AbstractC11328u abstractC11328uMo12755a = abstractC11328uMo12756b.mo12755a(i10, c4924k.f16062v0);
        int i11 = this.f16063w0;
        AbstractC11328u abstractC11328uMo12757c2 = abstractC11328uMo12755a.mo12755a(i11, c4924k.f16063w0).mo12757c(this.f16059s0, c4924k.f16059s0);
        Boolean boolValueOf = Boolean.valueOf(this.f16060t0);
        Boolean boolValueOf2 = Boolean.valueOf(c4924k.f16060t0);
        if (i10 != 0) {
            comparator = c11302a0;
        }
        AbstractC11328u abstractC11328uMo12755a2 = abstractC11328uMo12757c2.mo12756b(boolValueOf, boolValueOf2, comparator).mo12755a(this.f16064x0, c4924k.f16064x0);
        if (i11 == 0) {
            abstractC11328uMo12755a2 = abstractC11328uMo12755a2.mo12758d(this.f16065y0, c4924k.f16065y0);
        }
        return abstractC11328uMo12755a2.mo12759e();
    }
}
