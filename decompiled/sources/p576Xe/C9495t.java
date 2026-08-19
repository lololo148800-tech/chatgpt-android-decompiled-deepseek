package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C9495t extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28589Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9473F f28590Z;

    /* JADX INFO: renamed from: o0 */
    public int f28591o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9495t(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28590Z = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28589Y = obj;
        this.f28591o0 |= Integer.MIN_VALUE;
        return this.f28590Z.m10016o(null, null, this);
    }
}
