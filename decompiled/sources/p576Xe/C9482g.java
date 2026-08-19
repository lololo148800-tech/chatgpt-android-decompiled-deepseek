package p576Xe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xe.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C9482g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f28541Y;

    /* JADX INFO: renamed from: Z */
    public boolean f28542Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f28543o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9473F f28544p0;

    /* JADX INFO: renamed from: q0 */
    public int f28545q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9482g(C9473F c9473f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28544p0 = c9473f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28543o0 = obj;
        this.f28545q0 |= Integer.MIN_VALUE;
        return this.f28544p0.m10004c(null, false, this);
    }
}
