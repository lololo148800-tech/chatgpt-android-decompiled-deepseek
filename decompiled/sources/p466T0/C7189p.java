package p466T0;

/* JADX INFO: renamed from: T0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7189p extends AbstractC7188o {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f22844p0;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f22844p0) {
            case 0:
                int i10 = this.f22843o0;
                this.f22843o0 = i10 + 2;
                Object[] objArr = this.f22841Y;
                return new C7174a(objArr[i10], objArr[i10 + 1]);
            case 1:
                int i11 = this.f22843o0;
                this.f22843o0 = i11 + 2;
                return this.f22841Y[i11];
            default:
                int i12 = this.f22843o0;
                this.f22843o0 = i12 + 2;
                return this.f22841Y[i12 + 1];
        }
    }
}
