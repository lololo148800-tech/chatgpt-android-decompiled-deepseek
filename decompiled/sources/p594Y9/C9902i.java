package p594Y9;

import p523V9.AbstractC8201u;

/* JADX INFO: renamed from: Y9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9902i extends AbstractC8201u {

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f29418r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C9920l f29419s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9902i(C9920l c9920l, int i10) {
        super(c9920l);
        this.f29418r0 = i10;
        this.f29419s0 = c9920l;
    }

    @Override // p523V9.AbstractC8201u
    /* JADX INFO: renamed from: b */
    public final Object mo8767b(int i10) {
        switch (this.f29418r0) {
            case 0:
                Object[] objArr = this.f29419s0.f29458o0;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new C9914k(this.f29419s0, i10);
            default:
                Object[] objArr2 = this.f29419s0.f29459p0;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
