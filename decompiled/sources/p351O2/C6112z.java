package p351O2;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.z */
/* JADX INFO: loaded from: classes.dex */
public final class C6112z extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C6084G f19887Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f19888Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6084G f19889o0;

    /* JADX INFO: renamed from: p0 */
    public int f19890p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6112z(C6084G c6084g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19889o0 = c6084g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19888Z = obj;
        this.f19890p0 |= Integer.MIN_VALUE;
        return this.f19889o0.m6654f(this);
    }
}
