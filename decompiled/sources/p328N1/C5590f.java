package p328N1;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: N1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5590f extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5576C f18110Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f18111Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5592h f18112o0;

    /* JADX INFO: renamed from: p0 */
    public int f18113p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5590f(C5592h c5592h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f18112o0 = c5592h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f18111Z = obj;
        this.f18113p0 |= Integer.MIN_VALUE;
        return this.f18112o0.m5989d(null, this);
    }
}
