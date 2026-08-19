package p523V9;

/* JADX INFO: renamed from: V9.s */
/* JADX INFO: loaded from: classes.dex */
public final class C8185s extends AbstractC8201u {

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f25632r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C8225x f25633s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8185s(C8225x c8225x, int i10) {
        super(c8225x);
        this.f25632r0 = i10;
        this.f25633s0 = c8225x;
    }

    @Override // p523V9.AbstractC8201u
    /* JADX INFO: renamed from: b */
    public final Object mo8767b(int i10) {
        switch (this.f25632r0) {
            case 0:
                Object[] objArr = this.f25633s0.f25682o0;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new C8209v(this.f25633s0, i10);
            default:
                Object[] objArr2 = this.f25633s0.f25683p0;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
