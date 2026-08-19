package ve;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: ve.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C20589m extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C20592p f65329Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f65330Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20592p f65331o0;

    /* JADX INFO: renamed from: p0 */
    public int f65332p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20589m(C20592p c20592p, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f65331o0 = c20592p;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f65330Z = obj;
        this.f65332p0 |= Integer.MIN_VALUE;
        return this.f65331o0.m21190d(false, this);
    }
}
