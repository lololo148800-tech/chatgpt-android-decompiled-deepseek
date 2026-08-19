package bj;

import p265Kb.AbstractC4620m;

/* JADX INFO: renamed from: bj.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C11441F extends AbstractC4620m {

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f34580r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11441F(C11444I c11444i, int i10) {
        super(c11444i);
        this.f34580r0 = i10;
    }

    @Override // p265Kb.AbstractC4620m, java.util.Iterator
    public Object next() {
        switch (this.f34580r0) {
            case 1:
                return m5365b().f34588r0;
            default:
                return super.next();
        }
    }
}
