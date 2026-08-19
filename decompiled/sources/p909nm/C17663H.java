package p909nm;

/* JADX INFO: renamed from: nm.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C17663H extends AbstractC17668b {

    /* JADX INFO: renamed from: o0 */
    public int f56450o0;

    /* JADX INFO: renamed from: p0 */
    public int f56451p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17664I f56452q0;

    public C17663H(C17664I c17664i) {
        this.f56452q0 = c17664i;
        this.f56450o0 = c17664i.mo1316f();
        this.f56451p0 = c17664i.f56455o0;
    }

    @Override // p909nm.AbstractC17668b
    /* JADX INFO: renamed from: a */
    public final void mo18444a() {
        int i10 = this.f56450o0;
        if (i10 == 0) {
            this.f56465Y = 2;
            return;
        }
        C17664I c17664i = this.f56452q0;
        Object[] objArr = c17664i.f56453Y;
        int i11 = this.f56451p0;
        this.f56466Z = objArr[i11];
        this.f56465Y = 1;
        this.f56451p0 = (i11 + 1) % c17664i.f56454Z;
        this.f56450o0 = i10 - 1;
    }
}
