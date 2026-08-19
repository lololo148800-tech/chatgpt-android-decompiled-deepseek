package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C9483h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C9473F f28546Y;

    /* JADX INFO: renamed from: Z */
    public String f28547Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f28548o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f28549p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C9473F f28550q0;

    /* JADX INFO: renamed from: r0 */
    public int f28551r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9483h(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28550q0 = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28549p0 = obj;
        this.f28551r0 |= Integer.MIN_VALUE;
        return this.f28550q0.m10005d(null, false, this);
    }
}
