package p432Rh;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rh.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C6899l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Throwable f22110Y;

    /* JADX INFO: renamed from: Z */
    public Object f22111Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f22112o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6900m f22113p0;

    /* JADX INFO: renamed from: q0 */
    public int f22114q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6899l(C6900m c6900m, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f22113p0 = c6900m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f22112o0 = obj;
        this.f22114q0 |= Integer.MIN_VALUE;
        return this.f22113p0.m7289b(null, null, null, null, this);
    }
}
