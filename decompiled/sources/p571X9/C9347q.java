package p571X9;

import p594Y9.AbstractC9846Z3;

/* JADX INFO: renamed from: X9.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9347q extends AbstractC9353r {

    /* JADX INFO: renamed from: o0 */
    public final transient int f28187o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f28188p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC9353r f28189q0;

    public C9347q(AbstractC9353r abstractC9353r, int i10, int i11) {
        this.f28189q0 = abstractC9353r;
        this.f28187o0 = i10;
        this.f28188p0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9846Z3.m10495b(i10, this.f28188p0);
        return this.f28189q0.get(i10 + this.f28187o0);
    }

    @Override // p571X9.AbstractC9329n
    /* JADX INFO: renamed from: i */
    public final int mo9927i() {
        return this.f28189q0.mo9928j() + this.f28187o0 + this.f28188p0;
    }

    @Override // p571X9.AbstractC9329n
    /* JADX INFO: renamed from: j */
    public final int mo9928j() {
        return this.f28189q0.mo9928j() + this.f28187o0;
    }

    @Override // p571X9.AbstractC9329n
    /* JADX INFO: renamed from: m */
    public final Object[] mo9929m() {
        return this.f28189q0.mo9929m();
    }

    @Override // p571X9.AbstractC9353r, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final AbstractC9353r subList(int i10, int i11) {
        AbstractC9846Z3.m10496c(i10, i11, this.f28188p0);
        int i12 = this.f28187o0;
        return this.f28189q0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28188p0;
    }
}
