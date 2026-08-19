package p449S9;

/* JADX INFO: renamed from: S9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7079l extends AbstractC7081m {

    /* JADX INFO: renamed from: o0 */
    public final transient int f22559o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f22560p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC7081m f22561q0;

    public C7079l(AbstractC7081m abstractC7081m, int i10, int i11) {
        this.f22561q0 = abstractC7081m;
        this.f22559o0 = i10;
        this.f22560p0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC7057a.m7460e(i10, this.f22560p0);
        return this.f22561q0.get(i10 + this.f22559o0);
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: i */
    public final int mo7472i() {
        return this.f22561q0.mo7473j() + this.f22559o0 + this.f22560p0;
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: j */
    public final int mo7473j() {
        return this.f22561q0.mo7473j() + this.f22559o0;
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: p */
    public final Object[] mo7474p() {
        return this.f22561q0.mo7474p();
    }

    @Override // p449S9.AbstractC7081m, java.util.List
    /* JADX INFO: renamed from: r */
    public final AbstractC7081m subList(int i10, int i11) {
        AbstractC7057a.m7468m(i10, i11, this.f22560p0);
        int i12 = this.f22559o0;
        return this.f22561q0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22560p0;
    }
}
