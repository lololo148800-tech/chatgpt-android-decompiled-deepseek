package p544W9;

import p594Y9.AbstractC9954q3;

/* JADX INFO: renamed from: W9.S4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8555S4 extends AbstractC8561T4 {

    /* JADX INFO: renamed from: o0 */
    public final transient int f26383o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f26384p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC8561T4 f26385q0;

    public C8555S4(AbstractC8561T4 abstractC8561T4, int i10, int i11) {
        this.f26385q0 = abstractC8561T4;
        this.f26383o0 = i10;
        this.f26384p0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9954q3.m10611b(i10, this.f26384p0);
        return this.f26385q0.get(i10 + this.f26383o0);
    }

    @Override // p544W9.AbstractC8669l4
    /* JADX INFO: renamed from: i */
    public final int mo9214i() {
        return this.f26385q0.mo9215j() + this.f26383o0 + this.f26384p0;
    }

    @Override // p544W9.AbstractC8669l4
    /* JADX INFO: renamed from: j */
    public final int mo9215j() {
        return this.f26385q0.mo9215j() + this.f26383o0;
    }

    @Override // p544W9.AbstractC8669l4
    /* JADX INFO: renamed from: m */
    public final Object[] mo9216m() {
        return this.f26385q0.mo9216m();
    }

    @Override // p544W9.AbstractC8561T4, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final AbstractC8561T4 subList(int i10, int i11) {
        AbstractC9954q3.m10612c(i10, i11, this.f26384p0);
        int i12 = this.f26383o0;
        return this.f26385q0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26384p0;
    }
}
