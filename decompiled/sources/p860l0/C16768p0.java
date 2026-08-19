package p860l0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: l0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16768p0 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public AbstractC16777s0 f53805Y;

    /* JADX INFO: renamed from: Z */
    public C16706S f53806Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f53807o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC16777s0 f53808p0;

    /* JADX INFO: renamed from: q0 */
    public int f53809q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16768p0(AbstractC16777s0 abstractC16777s0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f53808p0 = abstractC16777s0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f53807o0 = obj;
        this.f53809q0 |= Integer.MIN_VALUE;
        return AbstractC16777s0.m18541P0(this.f53808p0, null, this);
    }
}
