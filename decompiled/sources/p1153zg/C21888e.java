package p1153zg;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: zg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C21888e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C21889f f69399Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f69400Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21889f f69401o0;

    /* JADX INFO: renamed from: p0 */
    public int f69402p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21888e(C21889f c21889f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f69401o0 = c21889f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f69400Z = obj;
        this.f69402p0 |= Integer.MIN_VALUE;
        return this.f69401o0.m22321d(this);
    }
}
