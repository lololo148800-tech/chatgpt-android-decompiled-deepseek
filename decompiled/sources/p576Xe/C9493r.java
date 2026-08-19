package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C9493r extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28581Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9473F f28582Z;

    /* JADX INFO: renamed from: o0 */
    public int f28583o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9493r(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28582Z = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28581Y = obj;
        this.f28583o0 |= Integer.MIN_VALUE;
        return this.f28582Z.m10014m(null, this);
    }
}
