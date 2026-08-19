package bb;

import p817j$.util.Objects;

/* JADX INFO: renamed from: bb.E */
/* JADX INFO: loaded from: classes.dex */
public final class C11280E extends AbstractC11330w {
    @Override // bb.AbstractC11330w
    /* JADX INFO: renamed from: b */
    public final AbstractC11330w mo12701b(Object obj) {
        obj.getClass();
        m12762a(obj);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC11281F m12702j() {
        int i10 = this.f34261b;
        if (i10 == 0) {
            int i11 = AbstractC11281F.f34166o0;
            return C11300Z.f34205v0;
        }
        if (i10 != 1) {
            AbstractC11281F abstractC11281FM12704s = AbstractC11281F.m12704s(i10, (Object[]) this.f34260a);
            this.f34261b = abstractC11281FM12704s.size();
            this.f34262c = true;
            return abstractC11281FM12704s;
        }
        Object obj = ((Object[]) this.f34260a)[0];
        Objects.requireNonNull(obj);
        int i12 = AbstractC11281F.f34166o0;
        return new C11312f0(obj);
    }
}
