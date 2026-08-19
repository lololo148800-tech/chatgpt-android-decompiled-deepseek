package p773h0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: h0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C14262Q extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C14265U f44757Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f44758Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14265U f44759o0;

    /* JADX INFO: renamed from: p0 */
    public int f44760p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14262Q(C14265U c14265u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f44759o0 = c14265u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44758Z = obj;
        this.f44760p0 |= Integer.MIN_VALUE;
        return C14265U.m15559L0(this.f44759o0, this);
    }
}
