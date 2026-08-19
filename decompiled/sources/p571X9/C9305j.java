package p571X9;

import p523V9.AbstractC8201u;

/* JADX INFO: renamed from: X9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9305j extends AbstractC8201u {

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f28106r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C9323m f28107s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9305j(C9323m c9323m, int i10) {
        super(c9323m);
        this.f28106r0 = i10;
        this.f28107s0 = c9323m;
    }

    @Override // p523V9.AbstractC8201u
    /* JADX INFO: renamed from: b */
    public final Object mo8767b(int i10) {
        switch (this.f28106r0) {
            case 0:
                Object[] objArr = this.f28107s0.f28137o0;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new C9317l(this.f28107s0, i10);
            default:
                Object[] objArr2 = this.f28107s0.f28138p0;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
