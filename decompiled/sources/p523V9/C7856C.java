package p523V9;

import p594Y9.AbstractC9768M2;

/* JADX INFO: renamed from: V9.C */
/* JADX INFO: loaded from: classes.dex */
public final class C7856C extends AbstractC7864D {

    /* JADX INFO: renamed from: o0 */
    public final transient int f24750o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f24751p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC7864D f24752q0;

    public C7856C(AbstractC7864D abstractC7864D, int i10, int i11) {
        this.f24752q0 = abstractC7864D;
        this.f24750o0 = i10;
        this.f24751p0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9768M2.m10371b(i10, this.f24751p0);
        return this.f24752q0.get(i10 + this.f24750o0);
    }

    @Override // p523V9.AbstractC8233y
    /* JADX INFO: renamed from: i */
    public final int mo8129i() {
        return this.f24752q0.mo8130j() + this.f24750o0 + this.f24751p0;
    }

    @Override // p523V9.AbstractC8233y
    /* JADX INFO: renamed from: j */
    public final int mo8130j() {
        return this.f24752q0.mo8130j() + this.f24750o0;
    }

    @Override // p523V9.AbstractC8233y
    /* JADX INFO: renamed from: m */
    public final Object[] mo8131m() {
        return this.f24752q0.mo8131m();
    }

    @Override // p523V9.AbstractC7864D, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final AbstractC7864D subList(int i10, int i11) {
        AbstractC9768M2.m10372c(i10, i11, this.f24751p0);
        int i12 = this.f24750o0;
        return this.f24752q0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24751p0;
    }
}
