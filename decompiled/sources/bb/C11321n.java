package bb;

import p523V9.AbstractC8201u;

/* JADX INFO: renamed from: bb.n */
/* JADX INFO: loaded from: classes.dex */
public final class C11321n extends AbstractC8201u {

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f34237r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C11324q f34238s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11321n(C11324q c11324q, int i10) {
        super(c11324q);
        this.f34237r0 = i10;
        this.f34238s0 = c11324q;
    }

    @Override // p523V9.AbstractC8201u
    /* JADX INFO: renamed from: a */
    public final Object mo8814a(int i10) {
        switch (this.f34237r0) {
            case 0:
                return this.f34238s0.m12751j()[i10];
            case 1:
                return new C11323p(this.f34238s0, i10);
            default:
                return this.f34238s0.m12752k()[i10];
        }
    }
}
