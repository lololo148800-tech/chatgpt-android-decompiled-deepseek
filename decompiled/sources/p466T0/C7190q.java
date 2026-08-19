package p466T0;

/* JADX INFO: renamed from: T0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7190q extends AbstractC7188o {

    /* JADX INFO: renamed from: p0 */
    public final C7181h f22845p0;

    public C7190q(C7181h c7181h) {
        this.f22845p0 = c7181h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f22843o0;
        this.f22843o0 = i10 + 2;
        Object[] objArr = this.f22841Y;
        return new C7175b(this.f22845p0, objArr[i10], objArr[i10 + 1]);
    }
}
