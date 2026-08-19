package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C9492q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28578Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9473F f28579Z;

    /* JADX INFO: renamed from: o0 */
    public int f28580o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9492q(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28579Z = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28578Y = obj;
        this.f28580o0 |= Integer.MIN_VALUE;
        return this.f28579Z.m10013l(null, null, null, null, this);
    }
}
