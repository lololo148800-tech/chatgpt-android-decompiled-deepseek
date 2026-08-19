package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C9471D extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28503Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9473F f28504Z;

    /* JADX INFO: renamed from: o0 */
    public int f28505o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9471D(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28504Z = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28503Y = obj;
        this.f28505o0 |= Integer.MIN_VALUE;
        return this.f28504Z.m10022u(null, null, null, null, this);
    }
}
