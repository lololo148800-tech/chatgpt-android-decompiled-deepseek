package p911o0;

import p1095x1.AbstractC21069X;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: o0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C17715A extends AbstractC17758g {

    /* JADX INFO: renamed from: h */
    public final C17752d f56553h;

    public C17715A(C17752d c17752d) {
        this.f56553h = c17752d;
    }

    @Override // p911o0.AbstractC17758g
    /* JADX INFO: renamed from: c */
    public final int mo19456c(int i10, EnumC7546k enumC7546k, AbstractC21069X abstractC21069X, int i11) {
        int iMo21547H = abstractC21069X.mo21547H(this.f56553h.f56685a);
        if (iMo21547H == Integer.MIN_VALUE) {
            return 0;
        }
        int i12 = i11 - iMo21547H;
        return enumC7546k == EnumC7546k.f23905Z ? i10 - i12 : i12;
    }

    @Override // p911o0.AbstractC17758g
    /* JADX INFO: renamed from: d */
    public final Integer mo19457d(AbstractC21069X abstractC21069X) {
        return Integer.valueOf(abstractC21069X.mo21547H(this.f56553h.f56685a));
    }
}
