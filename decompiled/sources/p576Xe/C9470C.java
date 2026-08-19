package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C9470C extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C9473F f28498Y;

    /* JADX INFO: renamed from: Z */
    public String f28499Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f28500o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9473F f28501p0;

    /* JADX INFO: renamed from: q0 */
    public int f28502q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9470C(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28501p0 = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28500o0 = obj;
        this.f28502q0 |= Integer.MIN_VALUE;
        return this.f28501p0.m10021t(null, this);
    }
}
