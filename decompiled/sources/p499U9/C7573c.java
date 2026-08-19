package p499U9;

import p594Y9.AbstractC9777O;

/* JADX INFO: renamed from: U9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7573c extends AbstractC7574d {

    /* JADX INFO: renamed from: o0 */
    public final transient int f23978o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f23979p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC7574d f23980q0;

    public C7573c(AbstractC7574d abstractC7574d, int i10, int i11) {
        this.f23980q0 = abstractC7574d;
        this.f23978o0 = i10;
        this.f23979p0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9777O.m10384b(i10, this.f23979p0);
        return this.f23980q0.get(i10 + this.f23978o0);
    }

    @Override // p499U9.AbstractC7571a
    /* JADX INFO: renamed from: i */
    public final int mo7918i() {
        return this.f23980q0.mo7919j() + this.f23978o0 + this.f23979p0;
    }

    @Override // p499U9.AbstractC7571a
    /* JADX INFO: renamed from: j */
    public final int mo7919j() {
        return this.f23980q0.mo7919j() + this.f23978o0;
    }

    @Override // p499U9.AbstractC7571a
    /* JADX INFO: renamed from: m */
    public final Object[] mo7920m() {
        return this.f23980q0.mo7920m();
    }

    @Override // p499U9.AbstractC7574d, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final AbstractC7574d subList(int i10, int i11) {
        AbstractC9777O.m10386d(i10, i11, this.f23979p0);
        int i12 = this.f23978o0;
        return this.f23980q0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23979p0;
    }
}
