package p594Y9;

/* JADX INFO: renamed from: Y9.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9944p extends AbstractC9950q {

    /* JADX INFO: renamed from: o0 */
    public final transient int f29493o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f29494p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC9950q f29495q0;

    public C9944p(AbstractC9950q abstractC9950q, int i10, int i11) {
        this.f29495q0 = abstractC9950q;
        this.f29493o0 = i10;
        this.f29494p0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC10003y4.m10643b(i10, this.f29494p0);
        return this.f29495q0.get(i10 + this.f29493o0);
    }

    @Override // p594Y9.AbstractC9926m
    /* JADX INFO: renamed from: i */
    public final int mo10584i() {
        return this.f29495q0.mo10585j() + this.f29493o0 + this.f29494p0;
    }

    @Override // p594Y9.AbstractC9926m
    /* JADX INFO: renamed from: j */
    public final int mo10585j() {
        return this.f29495q0.mo10585j() + this.f29493o0;
    }

    @Override // p594Y9.AbstractC9926m
    /* JADX INFO: renamed from: m */
    public final Object[] mo10586m() {
        return this.f29495q0.mo10586m();
    }

    @Override // p594Y9.AbstractC9950q, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final AbstractC9950q subList(int i10, int i11) {
        AbstractC10003y4.m10644c(i10, i11, this.f29494p0);
        int i12 = this.f29493o0;
        return this.f29495q0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29494p0;
    }
}
