package p572Xa;

import p594Y9.AbstractC9888f4;

/* JADX INFO: renamed from: Xa.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9413g extends AbstractC9414h {

    /* JADX INFO: renamed from: o0 */
    public final transient int f28386o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f28387p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC9414h f28388q0;

    public C9413g(AbstractC9414h abstractC9414h, int i10, int i11) {
        this.f28388q0 = abstractC9414h;
        this.f28386o0 = i10;
        this.f28387p0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9888f4.m10538a(i10, this.f28387p0);
        return this.f28388q0.get(i10 + this.f28386o0);
    }

    @Override // p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: i */
    public final int mo9989i() {
        return this.f28388q0.mo9990j() + this.f28386o0 + this.f28387p0;
    }

    @Override // p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: j */
    public final int mo9990j() {
        return this.f28388q0.mo9990j() + this.f28386o0;
    }

    @Override // p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: m */
    public final Object[] mo9991m() {
        return this.f28388q0.mo9991m();
    }

    @Override // p572Xa.AbstractC9414h, java.util.List
    /* JADX INFO: renamed from: p */
    public final AbstractC9414h subList(int i10, int i11) {
        AbstractC9888f4.m10539b(i10, i11, this.f28387p0);
        int i12 = this.f28386o0;
        return this.f28388q0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28387p0;
    }
}
