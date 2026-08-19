package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C9497v extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f28595Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9473F f28596Z;

    /* JADX INFO: renamed from: o0 */
    public int f28597o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9497v(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28596Z = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28595Y = obj;
        this.f28597o0 |= Integer.MIN_VALUE;
        return this.f28596Z.m10018q(this);
    }
}
